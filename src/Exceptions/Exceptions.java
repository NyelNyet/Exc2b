package Exceptions;

import java.util.*;
import java.io.IOException;

public class Exceptions {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1,n2;

        System.out.println("Enter First Integer: ");
        n1 = input.nextInt();
        System.out.println("Enter Second Integer: ");
        n2 = input.nextInt();

        try{
            int result = quotient(n1, n2);
            System.out.println("The result of "+n1+"/"+n2+" is "+result);
        }

        catch(ArithmeticException ae){
            System.out.println("Cannot Divide By Zero");
        }
    }

    public static int quotient(int num1, int num2){

        if(num2==0){
            throw new ArithmeticException("Division by Zero");
        }
            return num1/num2; 
    }
}
