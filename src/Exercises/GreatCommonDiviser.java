package Exercises;
import java.util.Scanner;
public class GreatCommonDiviser {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        int n2 = input.nextInt();

        System.out.println("The Great Common Diviser is " + calcGCD(n1, n2));
        input.close();
    }
    
    public static int calcGCD(int n1,int n2){
        int GCD =1;
        for(int k=1;k<=n1 && k<=n2;k++){
            if(n1%k==0 && n2%k==0){
                GCD = k;
            }
        }
        return GCD;
    }
}