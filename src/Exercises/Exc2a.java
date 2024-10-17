package Exercises;
import java.util.Scanner;

public class Exc2a {
    public static void main(String[] args) {
        // This program calculates the volume and total surface of a cuboid

        float radius;
        final double PI = 3.1415926;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Radius:");
        radius = input.nextFloat();

        System.out.println("The circumference is: ");
        System.out.println(2*PI*radius);
        input.close();

    }
}