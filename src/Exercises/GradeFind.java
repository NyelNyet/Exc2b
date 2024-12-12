package Exercises;

import java.util.Scanner;

public class GradeFind {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStu = input.nextInt();

        int[] scores = new int[numStu];

        System.out.print("Enter "+ numStu +" scores: ");
        for(int i = 0;i<scores.length;i++){
            scores[i] = input.nextInt();
        }

        findgrade(scores);

        input.close();
    }

    public static void findgrade(int[] scores){
        int best = 0;
        for(int i = 0;i<scores.length;i++){
            if(scores[i]>best){
                best = scores[i];
            }
        }

        for(int i = 0;i<scores.length;i++){
            if(scores[i]>=best-10){
                System.out.println("Student "+i+" score is "+scores[i]+" A");
            }else if(scores[i]>=best-20){
                System.out.println("Student "+i+" score is "+scores[i]+" B");
            }else if(scores[i]>=best-30){
                System.out.println("Student "+i+" score is "+scores[i]+" C");
            }else if(scores[i]>=best-40){
                System.out.println("Student "+i+" score is "+scores[i]+" D");
            }else{
                System.out.println("Student "+i+" score is "+scores[i]+" F");
            }
        }
    } 
}