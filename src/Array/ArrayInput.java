package Exercises.Array;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double[] myArray = new double[6];
        double total = 0;

        System.out.print("Please enter " + myArray.length + " values: ");

        for(int i = 0;i<myArray.length;i++){
            myArray[i] = input.nextDouble();
            total += myArray[i];
        }

        double max = myArray[0];

        for(int i = 1;i<myArray.length;i++){
            if(myArray[i] > max){
                max = myArray[i];
            }
        }   

        double min = myArray[0];

        for(int i = 1;i<myArray.length;i++){
            if(myArray[i] < min){
                min = myArray[i];
            }
        }   

        System.out.println(Arrays.toString(myArray));
        System.out.println("The total is "+total);
        System.out.println("The Maximum is "+max);
        System.out.println("The Minimum is "+min);

        input.close();
    }
}
