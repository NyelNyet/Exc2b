package Exercises;
import java.util.Scanner;
public class StringTut2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = input.nextLine().charAt(0);
        input.close();
        System.out.println("The character entered is " + ch);
    }

}
