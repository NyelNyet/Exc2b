package Exercises;
import java.util.Scanner;
public class ArraySingle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final int PRICE = 3;
        double[] price = new double[PRICE];
        String[] fruits = {"Grapes","Manngoes","Apples"};
        int[] qty = new int[PRICE];
        
        qty[0] = 3;
        qty[1] = 5;
        qty[2] = 8;

        for(int i = 0;i<fruits.length;i++){
            System.out.print("Enter price for "+fruits[i]+": ");
            price[i] = input.nextDouble();
            System.out.printf("Total price for "+fruits[i]+" is RM%.2f",(qty[i]*price[i]));
            System.out.println();
        }

        input.close();
    }
}
