package Exercises;
import java.util.Scanner;
public class SimplefDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter an integer: ");
        number = input.nextInt();
        input.close();

        if(number%5 == 0){
            System.out.println("Hi5");
        }
        if(number%2 == 0){
            System.out.println("HiEven");
        }
    }

}
