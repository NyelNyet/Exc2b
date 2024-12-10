package Exercises.HammingCode;

import java.util.Arrays;
import java.util.Scanner;

import javax.naming.PartialResultException;

public class HammingCode2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Word Stored: ");
        String tempWS = input.nextLine();
        int WSLength = tempWS.length();
        int[] WS = new int[WSLength];
        int[] WF = new int[WSLength];
        int i,j,k,temp;
        


        // Transfer String input into an int array and print WS
        System.out.println("\nWord Stored");
        for(i=0;i<WSLength;i++){
            WS[i] = tempWS.charAt(i) - '0';
            WF[i] = WS[i];
        }
        System.out.println(Arrays.toString(WS));



        // Generate error
        System.out.println("\nWord Fetched");
        i = (int)(Math.random()*WSLength);
        if(WF[i] == 0){
        WF[i] = 1;}
        else if(WF[i] == 1){
        WF[i] = 0;}
        // Printing out WF with error
        System.out.println(Arrays.toString(WF));



        int numberOfParityBitRequired = paritychecker(WSLength);
        System.out.println("\nParity/Check bit required: "+numberOfParityBitRequired);



        int[] ParityBit = new int[numberOfParityBitRequired];
        int[] WSHammingCode = new int[WSLength+numberOfParityBitRequired];
        int[] WFHammingCode = new int[WSLength+numberOfParityBitRequired];
        int[][] checkBitBin = new int[(int)Math.pow(2, numberOfParityBitRequired)][numberOfParityBitRequired];



        // Finding the parity bit position to check into binary
        for (i = 0; i < checkBitBin.length; i++) {
            // Convert the integer 'i' to a binary string
            String binaryStr = String.format("%" + numberOfParityBitRequired + "s", Integer.toBinaryString(i)).replace(' ', '0');

            // Split the binary string into individual characters and store them in the array
            for (j = 0; j < numberOfParityBitRequired; j++) {
                checkBitBin[i][j] = Character.getNumericValue(binaryStr.charAt(j));
            }
        }
        


        for(i = 0;i<numberOfParityBitRequired;i++){
            ParityBit[numberOfParityBitRequired-i-1] = (int)Math.pow(2, i);
        }
    


        System.out.print("\nParity/Check Bit ");
        System.out.println(Arrays.toString(ParityBit));



        for(j=0;j<checkBitBin.length;j++){
            System.out.println(j+" " +Arrays.toString(checkBitBin[j]));
        }



        System.out.println("\nWord Stored + Check Bit");
        WSHammingCode = combinebinpartity(WS, ParityBit);
        System.out.println(Arrays.toString(WSHammingCode));
    
        System.out.println("\nWord Fetched + Check Bit (With Error)");
        WFHammingCode = combinebinpartity(WF, ParityBit);
        System.out.println(Arrays.toString(WFHammingCode));



        for(i = 0;i<ParityBit.length;i++){
            ParityBit[i] = 0;
        }

        int[][] checkBitDec = new int[numberOfParityBitRequired][WS.length];

        for(i = checkBitBin[0].length-1;i >= 0;i--){
            k = 0;
            for(j = 0;j<checkBitBin.length;j++){
                if(checkBitBin[j][i] == 1){
                    
                    checkBitDec[i][k] = j;
                    k++;
                }
            }
        }
        


        for(i = 0;i<checkBitDec.length;i++){
            System.out.print("\nC"+(int)Math.pow(2, numberOfParityBitRequired-1-i)+Arrays.toString(checkBitDec[i]));
            
            System.out.println();
        }

        System.out.println(checkBitDec[0].length);
        System.err.println(checkBitDec.length);

        for(i = 0;i<checkBitDec.length;i++){
            for(j = 0;j<checkBitDec[i].length;j++){
                if(WSHammingCode[checkBitDec[checkBitDec.length-i-1][j]-1] == 1){
                    ParityBit[i]++;
                }
            }
            ParityBit[i]%=2;
        }


        System.out.println("\n"+Arrays.toString(ParityBit));

        



            


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
