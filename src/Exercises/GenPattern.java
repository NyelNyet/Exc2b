package Exercises;
import java.util.Scanner;
public class GenPattern {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter column: ");
        int column = input.nextInt();

        for(int i = 0 ; i <= column ; i++)
        {
            System.out.print("\n");

            for(int j = 0; j < i ; j++)
            {
                System.out.print(" "+(j+1)*2);
            }
        }
        input.close();
    }
}
