package Exercises.HammingCode;
import java.util.Arrays;
import java.util.Scanner;
public class HCprototype {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Word Stored: ");
        String tempWS = input.nextLine();
        int WSLength = tempWS.length();
        int[] WS = new int[WSLength];
        int[] WF = new int[WSLength];
        
        int i,temp,j;

        //Transfer String input into an int array and print WS
        System.out.println("Word Stored");
        for(i=0;i<WSLength;i++){
            WS[i] = tempWS.charAt(i) - '0';
            WF[i] = WS[i];
        }
        System.out.println(Arrays.toString(WS));
        
        System.out.println("\nWord Fetched");

        //generate error
        i = (int)(Math.random()*WSLength);
        if(WF[i] == 0){
        WF[i] = 1;}
        else if(WF[i] == 1){
        WF[i] = 0;}

        //printing out WF
        System.out.println(Arrays.toString(WF));


        int parBit = paritychecker(WSLength);
        System.out.println("\nParity/Check bit required: "+parBit);

        int[] ParityBit = new int[parBit];
        int[] WSHammingCode = new int[WSLength+parBit];
        int[] WFHammingCode = new int[WSLength+parBit];
        int[][] checkBit = new int[(int)Math.pow(2, parBit)][parBit];

        

        for(j=0;j<checkBit.length;j++){
        System.out.println(Arrays.toString(checkBit[j]));
        }

        //System.out.println(Arrays.deepToString(checkBit));

        for(i = 0;i<parBit;i++){
            ParityBit[i] = (int)Math.pow(2, i);
        }

        System.out.println("\nWord Stored + Check Bit");
        WSHammingCode = combinebinpartity(WS, ParityBit);
        System.out.println(Arrays.toString(WSHammingCode));

        System.out.println("\nWord Fetched + Check Bit (With Error)");
        WFHammingCode = combinebinpartity(WF, ParityBit);
        System.out.println(Arrays.toString(WFHammingCode));

        System.out.print("\nParity/Check Bit ");
        System.out.println(Arrays.toString(ParityBit));

        

        for(i = 0;i<WSHammingCode.length;i++){
            
        }

        //System.out.println("Initial checkbit "+Arrays.toString(checkBit));

    

        input.close();
    }

    public static int paritychecker(int storedLength){
        int PC;

        for(PC = 1;(Math.pow(2,PC))<(storedLength+PC+1);PC++){
            
        }

        return PC;
    }

    public static boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }

    public static int[] combinebinpartity(int[] bin, int[] parity){
        int[] combined = new int[bin.length+parity.length];
        
        for(int i = 0, j=0;i<bin.length+parity.length;i++){
            if(isPowerOfTwo(i+1)){
                combined[i] = -1;
            } else{
                combined[i] = bin[j];
                j++;
            }
        }
        return combined;
    }

}


