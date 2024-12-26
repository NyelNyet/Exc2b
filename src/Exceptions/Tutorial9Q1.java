package Exceptions;

import java.util.*;

public class Tutorial9Q1 {
    public static void main(String[] args){

        int items = enterItems(),i=0;
        double total = 0,tips = 0,tax = 0;
        boolean tipscheck;

        double[] prices = new double[items];
        
        try{
            updateprice(prices,i);
        }
        catch(IllegalArgumentException iae){
            System.out.println("Please enter a valid input!");
            return;
        }

        tipscheck = tipsConfirmation();

        for(i = 0;i<prices.length;i++){
            total += prices[i];
        }

        if(tipscheck){
            tips = total*0.1;
        }
        
        tax = total*0.06;

        System.out.printf("Total price of items: $%.2f\n",total);
        if(tipscheck){
            System.out.printf("Tip (10%%): $%.2f\n",tips);
        }
        System.out.printf("Sales tax (6%%): $%.2f\n",tax);
        System.out.printf("Final amount to pay: $%.2f",(total+tips+tax));
    }

    public static void updateprice(double[] prices, int i){
        Scanner input = new Scanner(System.in);

        for(;i<prices.length;i++){
            System.out.print("Enter the price for item "+(i+1)+":");
            prices[i] = input.nextDouble();
            if(prices[i]<0){
                throw new IllegalArgumentException("Price cannot be negative!");
            }
        }
    }

    public static int enterItems() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items ordered: ");
        
        while(!input.hasNextInt()){
            input.next();
            System.out.print("Invalid input. Please enter a valid number of items: ");
        }
        
        int items = input.nextInt();
        
        while(items <= 0){  
            System.out.print("The number of items must be positive. Please enter a valid number of items: ");
            
            while(!input.hasNextInt()){
                input.next();
                System.out.print("Invalid input. Please enter a valid number of items: ");
            }
    
            items = input.nextInt();
        }
        
        return items;
    }

    public static boolean tipsConfirmation(){

        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to add a 10% tip? (yes/no): ");
        String tips = input.next().toLowerCase();

        if(tips.equals("yes")){
            return true;
        }else{
            return false;
        }
    }
}
