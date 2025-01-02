package Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompareAnswers {
    public static void main(String[] args){
        char[] answers = new char[10];
        char[][] studAns = {
            {'A','B','A','C','C','D','E','E','A','D'},
            {'D','B','A','B','C','A','E','E','A','D'},
            {'E','D','D','A','C','B','E','E','A','D'},
            {'C','B','A','E','D','C','E','E','A','D'},
            {'A','B','D','C','C','D','E','E','A','D'},
            {'B','B','E','C','C','D','E','E','A','D'},
            {'B','B','A','C','C','D','E','E','A','D'},
            {'E','B','E','C','C','D','E','E','A','D'},
        };

        System.out.println("Enter answer scheme for "+answers.length+" questions: ");
        try{
            getanswers(answers);
        }catch(InputMismatchException ime){
            System.out.println(ime.getMessage());
            return;
        }catch(ArrayIndexOutOfBoundsException aioobe){
            System.out.println("You've entered more than you're supposed to!");
            return;
        }finally{
            System.out.println("Exception handled");
        }

        int[] marks = new int[8];
        
        compareAns(answers, studAns, marks);

        printmarks(marks);

    }

    public static void compareAns(char[] answers, char[][] studAns, int[] marks){
        for(int i = 0;i<studAns.length;i++){
            for(int j = 0;j<studAns[i].length;j++){
                if(studAns[i][j] == answers[j]){
                    marks[i]++;
                }
            }
        }
    }

    public static void printmarks(int[] marks){
        for(int i = 0;i<marks.length;i++){
            System.out.println("Student "+i+" got "+marks[i]+" marks");
        }
    }

    public static void getanswers(char[] answers){
        Scanner input = new Scanner(System.in);
        for(int i = 0;i<answers.length+1;i++){
            String tempans = input.nextLine();
            answers[i] = tempans.toUpperCase().charAt(0);
            System.out.println(answers[i]);
            if(Character.isLetter(answers[i])==false){
                throw new InputMismatchException("Invalid integer input!");
            }
        }
    }
}
