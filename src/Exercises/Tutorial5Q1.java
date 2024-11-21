package Exercises;

import java.util.Scanner;

public class Tutorial5Q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter width of the rectangle: ");
        int width = input.nextInt();
        System.out.print("Enter height of the rectangle: ");
        int height = input.nextInt();

        System.out.println("The area of the rectangle is: " + calculatreArea(height, width));

        input.close();
    }

    public static int calculatreArea(int h,int w){
        return h*w;
    }
}
