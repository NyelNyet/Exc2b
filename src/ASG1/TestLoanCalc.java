package Exercises.ASG1;
import java.util.Scanner;
//Danial Harith 2411467
public class TestLoanCalc{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Loan amount = ");
        double loanAmount = input.nextDouble();

        System.out.print("Number of Years: ");
        double numYears = input.nextDouble();

        System.out.print("Annual Interest Rate: ");
        double annualyInterestRate = input.nextDouble()/100;
        double mthlyRate = annualyInterestRate/12;

        //calculate monthly payment
        double monthlyPay = (loanAmount*mthlyRate*Math.pow(1+mthlyRate,numYears*12))/(Math.pow(1+mthlyRate,numYears*12)-1);

        System.out.printf("Monthly payment: %.2f\n",monthlyPay);

        System.out.println("Payment#\tInterest\tPrincipal\tBalance");
        for(int i=1;i<=numYears*12;i++){
            //calculate monthlyinterest and principal
            double monthlyInt = LoanCalc.mthlyInterest(loanAmount,mthlyRate);
            double principal = LoanCalc.principal(monthlyPay, LoanCalc.mthlyInterest(loanAmount, mthlyRate));
            loanAmount -= principal;

            //avoid printing -0.0
            if(loanAmount<0){
                loanAmount = 0;
            }
            //print out amortization schedule   
            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n",i,monthlyInt,principal,loanAmount);
        }
        input.close();
    }
}
