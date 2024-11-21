package Exercises;

import java.util.Scanner;

public class Tutorial5Q3 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int num1 = input.nextInt();
    System.out.print("Enter the second number: ");
    int num2 = input.nextInt();

    System.out.print("Enter the operation (+, -, *, /): ");
    String op = input.next();
    
    if(op.charAt(0) == '+'){
        System.out.printf("The result is: %.1f",add(num1,num2));
    }else if(op.charAt(0) == '-'){
        System.out.printf("The result is: %.1f",substract(num1,num2));
    }else if(op.charAt(0) == '*'){
        System.out.printf("The result is: %.1f",multiply(num1,num2));
    }else if(op.charAt(0) == '/'){
        System.out.printf("The result is: %.1f",divide(num1,num2));
    }

    input.close();
}

    public static double add(double n1,double n2){
        return n1+n2;
    }

    public static double substract(double n1,double n2){
        return n1-n2;
    }

    public static double multiply(double n1,double n2){
        return n1*n2;
    }
    
    public static double divide(double n1,double n2){
        return n1/n2;
    }


}
