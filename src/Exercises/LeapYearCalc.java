package Exercises;
import java.util.Scanner;
public class LeapYearCalc {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year:");
        int Year = input.nextInt();
        input.close();

        System.out.print(((Year%4==0)&&(Year%100!=0)||(Year%400==0))? Year+" is a leap year":Year+" is not a leap year");
    }
}