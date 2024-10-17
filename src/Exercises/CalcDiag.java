package Exercises;

import java.util.Scanner;

public class CalcDiag {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double width,height,perimeter,area,diagonal;

        System.out.print("Enter the width and height of a rectangle: ");
        width = input.nextDouble();
        height = input.nextDouble();
        input.close();

        
        perimeter = width*2 + height*2;
        area = width*height;
        diagonal = Math.sqrt(Math.pow(width,2)+Math.pow(height,2));
   

        /*
        System.out.println("The perimeter is " + (width*2+height*2));
        System.out.println("The area is " + (width*height));
        System.out.println("The length of the diagonal is " + (Math.sqrt(Math.pow(width,2)+Math.pow(height,2))));
        */

        System.out.println("The perimeter is " + perimeter);
        System.out.println("The area is " + area);
        System.out.println("The length of the diagonal is " + diagonal);
    }

}
