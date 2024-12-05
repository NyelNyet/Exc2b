package Exercises;
import java.util.Scanner;
public class Tutorial6Q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");
        int unit = input.nextInt();

        System.out.println("Total electrivity bill: $"+calculateBill(unit));

        input.close();
    }

    public static double calculateBill(int units){

        if(units>0 && units<=100){
            return units*0.5;
        }else if(units>100 && units<300){
            return 100*0.5 + (units-100)*0.75;
        }else if(units>300){
            return 100*0.5 + 200*0.75 + (units-300)*1.2;
        }
        return 0;
    }
}
