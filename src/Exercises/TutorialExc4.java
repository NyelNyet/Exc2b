package Exercises;

import java.util.Scanner;

public class TutorialExc4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final double DISCOUNT = 0.9;
        double Total=0,x=0;

        do{
            System.out.print("Enter the price of the item (0 to finish): ");
            x = input.nextInt();

            if(x>=100){
                x *= DISCOUNT;
            }
            System.out.println(x);
            Total += x;
        }while(x!=0);

        System.out.println("Total cost of items in the cart: " + Total);
        input.close();
    }
}
