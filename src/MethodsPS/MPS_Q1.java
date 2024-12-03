package MethodsPS;

import java.util.Scanner;

public class MPS_Q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Get input from user
        System.out.print("Enter the number of sides: ");
        int numSides = input.nextInt();
        System.out.print("Enter the side: ");
        double sidelength = input.nextDouble();
        input.close();

        //calculate and display
        Polygon(numSides,sidelength);
    }

    public static void Polygon(int n, double side){
        double area = (n*Math.pow(side,2)/(4*Math.tan(Math.PI/n)));

        System.out.println("The area of the polygon is " + area);

        /*
        OR
        System.out.println("The area of the polygon is " + (n*Math.pow(side,2)/(4*Math.tan(Math.PI/n))));
         */
    }
}
