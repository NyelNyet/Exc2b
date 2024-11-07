package Exercises;
import java.util.Scanner;
public class WhileTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x,y=0;

        System.out.print("Enter and integer(Enter 0 to quit): ");
        x = input.nextInt();
        y += x;
        System.out.println("Total: "+y);

        while(x != 0){
            System.out.print("Enter and integer(Enter 0 to quit): ");
            x = input.nextInt();
            y += x;
            System.out.println("Total: "+y);
            if(y>=50){
                break;
            }
        }
        System.err.println("Exited");
        input.close();
    }
}