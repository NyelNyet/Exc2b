package Exercises;
import java.util.Scanner;
public class RepeatWhile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("This program makes an amount of saving and distribute the savings");
        System.out.println("equally among N number of recipients");

        System.out.print("Enter amount of money: ");
        double Savings = input.nextDouble();

        System.out.print("Enter number of recipients: ");
        int Recipients = input.nextInt();

        double randnum = Math.random() * 20;
        double TotDistr = 0.0;
        int counter = 0;

        while (Savings >= randnum*Recipients) {
            ++counter;
            Savings -= randnum*Recipients;
            TotDistr += TotDistr + randnum*Recipients;
            System.out.printf("Random amount %d: RM%7.2f\n",counter,Savings);
            randnum = Math.random() * 20;
        }
        System.out.printf("The balance is %3.2f\n",TotDistr);
        input.close();
    }
}
