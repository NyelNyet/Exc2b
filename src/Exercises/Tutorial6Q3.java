package Exercises;
import java.util.Scanner;
public class Tutorial6Q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter annual interest rate(%): ");
        double rate = input.nextDouble();

        System.out.print("Enter time in years: ");
        int time = input.nextInt();

        System.out.print("Simple interest: $"+calculateSimpleInterest(principal, rate, time));
    }

    public static double calculateSimpleInterest(double principal, double rate, int time){
        return principal*rate*time/100;
    }
}
