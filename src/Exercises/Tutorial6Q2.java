package Exercises;
import java.util.Scanner;
public class Tutorial6Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double[] temperatures = new double[7];

        System.out.print("Enter the temperatures for "+temperatures.length+" days:\n");

        for(int i = 1;i<=7;i++){
            System.out.print("Day "+i+": ");
            temperatures[i-1] = input.nextDouble();
        }

        System.out.printf("The average temperature for the week is: %.2f°C",calculateAverage(temperatures));
    }

    public static double calculateAverage(double[] temperatures){
        double total=0;

        for(int i = 0;i<temperatures.length;i++){
            total +=temperatures[i];
        }

        return total/temperatures.length;
    }
}
