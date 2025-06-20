package ASG1;

public class testAcc {
    public static void main(String[] args) throws InterruptedException {
        Account mfirst = new Account(1122, 20000);
        mfirst.setAnnualInterestRate(4.5);

        mfirst.withdraw(2500);

        mfirst.deposit(3000);

        print(mfirst);

        Thread.sleep(5000);

        print(mfirst);

    }

    public static void print(Account first) {
        System.out.println("id : " + first.getId());
        System.out.println("balance : RM" + first.getBalance());
        System.out.println("annual interest rate : " + first.getAnnualInterestRate() + '%');
        System.out.printf("monthly interest : RM%.2f" + "\n",first.getMonthlyInterest());
        System.out.println("date created : " + first.getDateCreated());
    }
}
