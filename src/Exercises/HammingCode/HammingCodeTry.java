package Exercises.HammingCode;
import java.util.Arrays;
import java.util.Scanner;
public class HammingCodeTry {
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

        for(i = 0;i<parBit;i++){
            ParityBit[i] = (int)Math.pow(2, i);
        }

        System.out.println("\nWord Stored + Check Bit");
        WSHammingCode = combinebinpartity(WS, ParityBit);
        System.out.println(Arrays.toString(WSHammingCode));

        System.out.println("\nWord Fetched + Check Bit (With Error)");
        WFHammingCode = combinebinpartity(WF, ParityBit);
        System.out.println(Arrays.toString(WFHammingCode));

        System.out.println("\nParity/Check Bit");
        System.out.println(Arrays.toString(ParityBit));

        int[] checkBit = new int[parBit];
        System.out.println("Initial checkbit "+Arrays.toString(checkBit));

        for (i = 1; i <= WSHammingCode.length; i++) {
            if (isPowerOfTwo(i)) { // Check if 'i' is a power of 2 (1, 2, 4, 8, 16, ...)
                int[] checkedPositions = getCheckedPositions(i, WSHammingCode.length);
                System.out.print("Parity bit p" + i + " checks positions: ");
                for (j = 0; j < checkedPositions.length; j++) {
                    System.out.print(checkedPositions[j] + " ");
                    
                    if(WSHammingCode[checkedPositions[j]-1]==1){
                        checkBit[i-1]++;
                    }
                }
                System.out.println();
            }
        }

        System.out.println(Arrays.toString(checkBit));

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

    // Function to get the positions checked by a given parity bit p_i using an array
    public static int[] getCheckedPositions(int parityBitPosition, int totalBits) {
        // We assume that in the worst case, a parity bit can check all positions

        // Array to store checked positions
        int[] checkedPositions = new int[totalBits]; 
        int index = 0; // Index to store the positions in the array
        
        // Loop through all bit positions (1 to totalBits) and check if the parity bit will check this position
        for (int k = 1; k <= totalBits; k++) {
            // Check if the parity bit will check this bit position
            if ((k & (1 << (parityBitPosition - 1))) != 0) {
                checkedPositions[index] = k; // Store the checked position
                index++; // Increment the index
            }
        }
        int[] result = new int[index];
        System.arraycopy(checkedPositions, 0, result, 0, index);
        
        return result; // Return the array of checked positions
    }
}


