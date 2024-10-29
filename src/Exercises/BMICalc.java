package Exercises;
import java.util.Scanner;
/*
Danial Harith 2411467
*/
public class BMICalc {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double height,weigth,BMI;

        System.out.println("This Program will calculate one's Body Mass Index(BMI)");
        System.out.print("Enter heigth(m) and weigth(kg): "); //Input heigth and weigth from user
        height = input.nextDouble();
        weigth = input.nextDouble();
        input.close();

        BMI = weigth/Math.pow(height,2); //Calculate BMI

        System.out.println("test = " + BMI); //Show BMI for testing

        if(BMI<18.5){
            System.out.println("Underweigth");
        }else if(18.5<=BMI && BMI<25.0){
            System.out.println("Normal");
        }else if(25.0 <= BMI && BMI < 30.0){
            System.out.println("Overweight");
        }else if(30.0 <= BMI){
            System.out.println("Obese");
        }
    }
}
