package Exercises;

import java.util.Scanner;

public class StringTut {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three words seperated by spaces: ");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();  
        input.close();

        System.out.println("First word is: " + s1);
        System.out.println("Second word is: " + s2);
        System.out.println("Third word is: " + s3);
    }

}
