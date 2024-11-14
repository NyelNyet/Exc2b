package Exercises;

import java.util.Scanner;

public class TutorialExc4Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double bal=1000;
        double userinput=1;

        while (userinput!=0) {
            System.out.println("Enter a withdrawal amount: ");
            userinput=input.nextInt();
            if (userinput==0) {
                break;   
            }
            if(userinput>bal)
            {
                System.out.println("Insufficient funds. Please enter a lower amount.");
            }
            else
            {
            bal -= userinput;
            System.out.println("Withdrawal successful! New balance: " + "$"+ bal);
            }
        System.out.println("Thank you for using our ATM. Goodbye!");
     }
    input.close();
    }

}