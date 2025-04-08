public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName,String accountNumber){
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void deposit(double depoamount){
        if(depoamount>=0){
            this.balance +=depoamount;
        }else{
            throw new IllegalArgumentException("Amount cant be negative!");
        }
        
    }

    public void withdraw(double withamount){
        if(withamount<this.balance){
            this.balance -= withamount;
        }else{
            throw new IllegalArgumentException("Insufficient balance!");
        }
        
    }
}
