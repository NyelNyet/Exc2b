package Exercises;

import java.util.Scanner;

public class Tutorial7Q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] name = new String[5];
        int[] grade = new int[5];
        int i=0;

        do{
            System.out.print("Enter the name of student "+(i+1)+": ");
            name[i] = input.next();
        
            System.out.print("Enter the grade for "+name[i]+": ");
            grade[i] = input.nextInt();

            i++;
        }while(i<5);

        System.out.println("Class average: "+getAverage(grade));
        System.out.println("Highest grade: "+getTopStudent(name,grade));

        input.close();
    }

    public static double getAverage(int[] grade){
        double sum = 0;

        for(int i = 0;i<grade.length;i++){
            sum += grade[i];
        }

        return sum/grade.length;
    }

    public static String getTopStudent(String[] name, int[] grade){
        String topStu = "None";
        int highest = -1;
        for(int i = 0;i<grade.length-1;i++){
            if(grade[i+1]>grade[i]){
                topStu = name[i+1];
                highest = grade[i+1];
            }
        }
        return highest + " ("+topStu+")";
    }
}
