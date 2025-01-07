package ASG1;
//Danial Harith 2411467
public class LoanCalc {
    public static double mthlyInterest(double loanAmount, double mthlyRate){
        return loanAmount*mthlyRate;
    }

    public static double principal(double mthlyPay, double mthlyInterest){
        return mthlyPay-mthlyInterest;
    }
}
