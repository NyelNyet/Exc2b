package Exercises;
import java.util.Scanner;
public class IsDividedByrdnd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int n1 = input.nextInt();
        System.out.print("Please enter the second number: ");
        int n2 = input.nextInt();
        System.out.print("Please enter the third number: ");
        int n3 = input.nextInt();
        input.close();

        if(n1%n2==0 && n1%n3==0){
            System.out.println(n1 + " is divisible with " + n2 + " and " + n3);
        }
        if(n1%n2==0 || n1%n3==0){
            System.out.println(n1 + " is divisible with " + n2 + " or " + n3);
        }
        if(n1%n2==0 ^ n1%n3==0){
            System.out.println(n1 + " is divisible with either " + n2 + " or " + n3 + " but not both");
        }
        System.out.println((n1%2==0)? n1+" is even":n2+" is odd");
    }
}
