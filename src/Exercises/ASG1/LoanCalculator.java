package Exercises.ASG1;
import java.util.Scanner;
public class LoanCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Loan amount = ");
        double loanAmount = input.nextDouble();

        System.out.print("Number of Years: ");
        double numYears = input.nextDouble();

        System.out.print("Annual Interest Rate: ");
        double annualyInterestRate = input.nextDouble()/100;
        double mthlyRate = annualyInterestRate/12;

        double monthlyPay = (loanAmount*mthlyRate*Math.pow(1+mthlyRate,numYears*12))/(Math.pow(1+mthlyRate,numYears*12)-1);

        System.out.printf("Monthly payment: %.2f\n",monthlyPay);

        System.out.println("Payment#\tInterest\tPrincipal\tBalance");
        for(int i=1;i<=numYears*12;i++){
            double monthlyInt = mthlyInterest(loanAmount,numYears,mthlyRate);
            double principal = principal(monthlyPay, mthlyInterest(loanAmount, numYears, mthlyRate));
            loanAmount -= principal;

            if(loanAmount<0){
                loanAmount = 0;
            }
            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n",i,monthlyInt,principal,loanAmount);
        }
    }

    public static double mthlyInterest(double loanAmount, double numYears, double mthlyRate){
        return loanAmount*mthlyRate;
    }

    public static double principal(double mthlyPay, double mthlyInterest){
        return mthlyPay-mthlyInterest;
    }
}