package Exercises;
import java.util.Scanner;
import java.util.random.RandomGenerator;
public class HammingCode {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Word Stored: ");
        String tempWS = input.nextLine();
        int WSLength = tempWS.length();
        int[] WS = new int[WSLength];
        int[] WF = new int[WSLength];
        int i;

        //Transfer String input into an int array and print WS
        System.out.println("Word Stored");
        for(i=0;i<WSLength;i++){
            WS[i] = tempWS.charAt(i) - '0';
            WF[i] = WS[i];
            System.out.print(WS[i]);
        }
        
        System.out.println("\nWord Fetched");
        i = (int)(Math.random()*WSLength);

        //generate error
        if(WF[i] == 0){
        WF[i] = 1;}
        else if(WF[i] == 1){
        WF[i] = 0;}

        //printing out WF
        for(i=0;i<WSLength;i++){                         
            System.out.print(WF[i]);
        }

        int parBit = paritychecker(WSLength);
        System.out.println("\n"+parBit);


        input.close();
    }

    public static int paritychecker(int storedLength){
        int PC;

        for(PC = 1;(Math.pow(2,PC))<(storedLength+PC+1);PC++){
            
        }

        return PC;
    }
}