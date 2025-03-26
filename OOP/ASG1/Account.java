package ASG1;

import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();

    Account(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    public double getMonthlyInterest() {
        return ((this.annualInterestRate/1200)*this.balance);
    }

    public void withdraw(double withdrawAmount){
        this.balance -= withdrawAmount; 
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
    }
    
}
