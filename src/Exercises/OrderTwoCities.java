package Exercises;

import java.util.Scanner;

public class OrderTwoCities {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter first city: ");
        String city1 = input.nextLine();
        System.out.print("Please enter second city: ");
        String city2 = input.nextLine();
        input.close();

        if (city1.compareTo(city2) < 0)
             System.out.println("The order are " +
             city1 + " " + city2);
        else if(city1.compareTo(city2) > 0)
            System.out.println("The order are " +
            city2 + " " + city1);
    }
}
