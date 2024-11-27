package Exercises;
import java.util.Scanner;
public class HammingCode {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Word Stored: ");
        String WS = input.nextLine();
        int WSLength = WS.length();
        int[] WF = new int[WSLength];
        System.out.println(WSLength);

        for(int i=0;i<WSLength;i++){
            WF[i] = (int)(Math.random() * 10)%2;
            System.out.println(i + " " + WF[i]);

            
        }
        input.close();
    }
}
