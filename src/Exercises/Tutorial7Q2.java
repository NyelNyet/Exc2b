package Exercises;

import java.util.Scanner;

public class Tutorial7Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i = 0;
        double[] temperature = new double[7];
        do{
            System.out.print("Enter the temperature for Day "+(i+1)+": ");
            temperature[i] = input.nextDouble();
            i++;
        }while(i<7);

        System.out.println("Average Temperature: "+getAverage(temperature)+"°C");
        System.out.println("Highest Temperature: "+getHighestTemperature(temperature));
        System.out.println("Lowest Temperature: "+getLowestTemperature(temperature));

        input.close();
    }

    public static double getAverage(double[] temp){
        double sum = 0;
        for(int i = 0;i<temp.length;i++){
            sum += temp[i];
        }
        return sum/temp.length;
    }

    public static String getHighestTemperature(double[] temp){
        double highest = temp[0];
        int day = 0;
        for(int i = 0;i<temp.length;i++){
            if(temp[i]>highest){
                highest = temp[i];
                day = i+1;
            }
        }
        return highest + "°C (Day "+day+")";
    }

    public static String getLowestTemperature(double[] temp){
        double lowest = temp[0];
        int day = 0;
        for(int i = 0;i<temp.length;i++){
            if(temp[i]<lowest){
                lowest = temp[i];
                day = i+1;
            }
        }
        return lowest + "°C (Day "+day+")";
    }
}
