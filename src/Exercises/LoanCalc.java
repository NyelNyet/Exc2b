package Exercises;

import java.util.Scanner;

public class LoanCalc {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final double MONTHLYINTERESTRATE = 0.023;
        double LoanAmount,NumOfYears,Pay;

        System.out.print("Enter Loan Amount: "); //Get Loan Amount From User
        LoanAmount = input.nextDouble();

        System.out.print("Enter num of years: "); //Get Number Of Years From User
        NumOfYears = input.nextDouble();

        input.close();

        Pay = (LoanAmount*MONTHLYINTERESTRATE)/(1-1/Math.pow((1+MONTHLYINTERESTRATE),NumOfYears*12)); //Monthly Pay Calculation

        System.out.println("Monthly payment for the loan is : " + Pay);
    }
}