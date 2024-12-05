package Exercises.ASG1;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter type of input to check: ");
        char typeofinput = input.nextLine().charAt(0);

        switch (typeofinput) {
            case 'S' :
            case 'I' :
            case 'B' : Output(input); break;
        }
    }

    public static void Output(Scanner input){
        
        System.out.print("Enter the first input: ");
        String first = input.nextLine();

        System.out.print("Enter the second input: ");
        String second = input.nextLine();

        int length1 = first.length();
        int length2 = second.length();
        int check = 0;

        for(int i = 0;i<length1 && i<length2;++i){  
            if(first.charAt(i)==second.charAt(i)){
                ++check;
            }
        }
        input.close();
        System.out.print("The longest common prefix is " + first.substring(0,check));
    }
}