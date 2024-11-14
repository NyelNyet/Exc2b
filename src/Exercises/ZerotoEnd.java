package Exercises;
import java.util.Scanner;
public class ZerotoEnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,sum=0;

        do{
            System.out.print("Enter an integer (The input ends if it is 0) : ");
            x = input.nextInt();
            sum += x;
        }while(x!=0);
        System.out.print("Sum is "+sum);
        input.close();
    }
}