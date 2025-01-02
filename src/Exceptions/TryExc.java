package Exceptions;

import java.util.Scanner;

public class TryExc {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter non-negative number: ");
        int n1 = input.nextInt();

        while(n1<0){
            try{
                checkpos(n1);
            }catch(IllegalArgumentException iae){
                System.out.print("Negative value isn't allowed! Please re-enter: ");
                n1 = input.nextInt();
            }
        }
        input.close();
    }
    public static void checkpos(int n1){
        if(n1<0){
            throw new IllegalArgumentException("Negative value");
        }
    }


}
