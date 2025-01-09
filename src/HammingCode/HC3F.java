package HammingCode;
/**
 * @author Group3
 */
import java.util.*;

public class HC3F {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Word Stored In Binary From MSB To LSB: ");
        String tempWS = input.nextLine();
        int WSLength = tempWS.length()  ;
        int[] WS = new int[WSLength];
        int[] WF = new int[WSLength];
        boolean aoub = true;
        int i,j;

        System.out.println("Auto generate error or user input?(A/U)");
        char aou = input.nextLine().toUpperCase().charAt(0);
        aoub = checkuserinp(aou,aoub);

        // Transfer String input into an int array and print WS
        stringToInt(tempWS, WS, WF, WSLength,aoub);

        // Generate error and Printing out WF with error
        if(aoub){   
            System.out.println("\nWord Fetched");
            generateError(WF, WSLength);
        }else{
            System.out.println("\nWord Fetched");
            System.out.println(Arrays.toString(WF));
        }

        int numberOfParityBitRequired = paritychecker(WSLength);
        System.out.println("\nParity/Check bit required: "+numberOfParityBitRequired);

        int[] WSParityBit = new int[numberOfParityBitRequired];
        int[] WFParityBit = new int[numberOfParityBitRequired];
        int[] FinalParityBit = new int[numberOfParityBitRequired];
        int[] WSHammingCode = new int[WSLength+numberOfParityBitRequired];
        int[] WFHammingCode = new int[WSLength+numberOfParityBitRequired];
        int[][] checkBitBin = new int[(int)Math.pow(2, numberOfParityBitRequired)][numberOfParityBitRequired];

        findBinary(checkBitBin, numberOfParityBitRequired);

        for(i = 0;i<numberOfParityBitRequired;i++){
            WSParityBit[numberOfParityBitRequired-i-1] = (int)Math.pow(2, i);
        }

        System.out.print("\nParity/Check Bit \n\t      C ");
        System.out.println(Arrays.toString(WSParityBit));
        System.out.println();

        for(j=0;j<checkBitBin.length;j++){
            System.out.println(j+"\t"+(j+1)+"\t" +Arrays.toString(checkBitBin[j]));
        }

        System.out.println("\nWord Stored + Check Bit");
        combinebinparity(WSHammingCode, WS, WSParityBit, Optional.empty());
        System.out.println(Arrays.toString(WSHammingCode));
    
        System.out.println("\nWord Fetched + Check Bit (With Error)");
        combinebinparity(WFHammingCode, WF, WFParityBit, Optional.empty());
        System.out.println(Arrays.toString(WFHammingCode));

        resetParBit(WSParityBit);
        resetParBit(WFParityBit);

        int[][] checkBitDec = new int[numberOfParityBitRequired][WS.length];
        findCheckPosition(checkBitBin, checkBitDec, WSHammingCode);

        int[][] checkBitFix = new int[checkBitDec.length][];

        removeZeros(checkBitDec, checkBitFix);

        for(i = 0;i<checkBitFix.length;i++){
            System.out.print("\nC"+(int)Math.pow(2, numberOfParityBitRequired-1-i)+Arrays.toString(checkBitFix[i]));
            
            System.out.println();
        }


        System.out.print("\nWord Stored Parity Bit");
        findParityBit(WSHammingCode, checkBitFix, WSParityBit);
        System.out.print("\nWord Fetched Parity Bit");
        findParityBit(WFHammingCode, checkBitFix, WFParityBit);

        System.out.println("\nWord Stored + Check Bit");
        combinebinparity(WSHammingCode, WS, WSParityBit, Optional.of(WSParityBit));
        System.out.println(Arrays.toString(WSHammingCode));
    
        System.out.println("\nWord Fetched + Check Bit (With Error)");
        combinebinparity(WFHammingCode, WF, WFParityBit, Optional.of(WFParityBit));
        System.out.println(Arrays.toString(WFHammingCode));

        for(i = WSParityBit.length-1;i>=0;i--){
            FinalParityBit[i] = WSParityBit[i] ^= WFParityBit[i];
        }

        System.out.println("\nFinal Parity Bit : "+Arrays.toString(FinalParityBit));

        StringBuilder FPB = new StringBuilder();

        bitErrPos(FPB, FinalParityBit,numberOfParityBitRequired);
    }

    public static void generateError(int[] array,int length){
        int i = (int)(Math.random()*length);
        if(array[i] == 0){
        array[i] = 1;}
        else if(array[i] == 1){
        array[i] = 0;}

        System.out.println(Arrays.toString(array));
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

    public static void combinebinparity(int[] combined, int[] bin, int[] parity, Optional<int[]> Opparbit){   
    if(Opparbit.isPresent()){
        int[] parbit = Opparbit.get();
        int k = parbit.length-1;
        for(int i = 0, j=0;i<bin.length+parity.length;i++){
                if(isPowerOfTwo(i+1)){
                    combined[i] = parbit[k];
                    k--;
                } else{
                    combined[i] = bin[j];
                    j++;
                }
            }
        }else{
            for(int i = 0, j=0, a=0;i<bin.length+parity.length;i++){
                        if(isPowerOfTwo(i+1)){
                            combined[i] = -(int)Math.pow(2, a);
                            a++;
                        } else{
                            combined[i] = bin[j];
                            j++;
                        } 
            }
        }
    }

    public static void removeZeros(int[][] array,int[][] outputarray){
        int i,j;
        for(i = array.length-1;i>=0;i--){
            int nonZero = 0,index=0;

            for(j = 0;j<array[i].length;j++){
                if(array[i][j]!=0){
                    nonZero++;
                }
            }
            int[] temp = new int[nonZero];

            for(j = 0;j<array[i].length;j++){
                if(array[i][j]!=0){
                    temp[index++] = array[i][j];
                }
                
            }
            outputarray[i] = temp;
        }
    }

    public static void findParityBit(int[] allBit, int[][] checker,int[] parBit){
        for(int i = parBit.length-1;i>=0;i--){
            for(int j = 0;j<checker[i].length;j++){
                if(allBit[checker[i][j]-1] == 1){
                    parBit[i]++;
                }
            }
            parBit[i] %= 2;
        }
        System.out.println("\n"+Arrays.toString(parBit));
    }

    public static void findBinary(int[][] array, int numParBit){
        // Finding the parity bit position to check into binary
        for(int i = 0;i<array.length;i++){
            // Convert the integer 'i' to a binary string
            String binaryStr = String.format("%" + numParBit + "s", Integer.toBinaryString(i)).replace(' ', '0');

            // Split the binary string into individual characters and store them in the array
            for(int j = 0;j<numParBit;j++){
                array[i][j] = Character.getNumericValue(binaryStr.charAt(j));
            }
        }
    }

    public static void findCheckPosition(int[][] input, int[][] output, int[] allBit){
        for(int i = input[0].length-1;i >= 0;i--){
            int k = 0;

            for(int j = 0;j<input.length && k<output[i].length;j++){
                if(input[j][i] == 1 && j<=allBit.length){
                    
                    output[i][k] = j;
                    k++;
                }
            }
        }
    }

    public static void resetParBit(int[] array){
        for(int i = 0;i<array.length;i++){
            array[i] = 0;
        }
    }

    public static void stringToInt(String inpString, int[] array1, int[] array2, int length, boolean check){
        Scanner input = new Scanner(System.in);
        int checkinv = 0;
        
        if(check){
            System.out.println("\nWord Stored");
            for(int i=0;i<length;i++){
            array1[i] = inpString.charAt(i) - '0';
            array2[i] = array1[i];
            }
        }else{
            for(int i=0;i<length;i++){
                array1[i] = inpString.charAt(i) - '0';
                }
            System.out.print("Please enter word fetched in binary: ");
            String inpStrings = input.nextLine();

            for(int i = 0;i<inpStrings.length();i++){
                if(inpStrings.length() > length){
                    System.out.print("Not the same length as the word stored or invlaid input! Enter again: ");
                    inpStrings = input.nextLine();
                    i=0;
                }else{
                    array2[i] = inpStrings.charAt(i) - '0';
                }
            }

            for(int i = 0;i<array2.length;i++){
                if(array2[i]!=0 && array2[i]!=1){
                    checkinv++;
                }
            }

            while (inpStrings.length()!=length || checkinv!=0) {
                checkinv = 0;
                System.out.print("Not the same length as the word stored or invlaid input! Enter again: ");
                inpStrings = input.nextLine();

                for(int i = 0;i<inpStrings.length();i++){
                    array2[i] = inpStrings.charAt(i) - '0';
                }

                for(int i = 0;i<array2.length;i++){
                    if(array2[i]!=0 && array2[i]!=1){
                        checkinv++;
                    }
                }
            }
        }
        System.out.println("\nWord Stored");
        System.out.println(Arrays.toString(array1));
    }

    public static void bitErrPos(StringBuilder FPB, int[] binFPB,int n){
        for(int i : binFPB){
            FPB.append(i);
        }

        if(Integer.parseInt(FPB.toString(),2) == 0){
            System.out.println("\nNo error occured");
        }else{
            System.out.println("\nError(s) occured.");
            System.out.println("\nThe error occured in bit postion "+Integer.parseInt(FPB.toString(),2));
            System.out.println("\nThe error occured in position "+(Integer.parseInt(FPB.toString(),2)-n)+" in word fetched");
        }
    }

    public static boolean checkuserinp(char aou, boolean aoub){
        if(aou =='U'){
            aoub = false;
        }else if(aou == 'A'){
            aoub = true;
        }
        return aoub;
    }
}