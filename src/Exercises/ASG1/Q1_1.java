package Exercises.ASG1;
import java.util.Scanner;
public class Q1_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter type of input to check: ");
        char typeofinput = input.nextLine().charAt(0);

        switch (typeofinput) {
            case 'S' :  
            case 's' :  StringOutput(input); break;
            case 'I' :
            case 'i' :
            case 'B' :
            case 'b' :  BinaryOutput(input);break;
        }
    }

    public static void StringOutput(Scanner input){
        
        System.out.print("Enter the first input: ");
        String firststr = input.nextLine();

        System.out.print("Enter the second input: ");
        String secondstr = input.nextLine();

        int length1 = firststr.length();
        int length2 = secondstr.length();
        int check = 0;

        for(int i = 0;i<length1 && i<length2;++i){  
            if(firststr.charAt(i)==secondstr.charAt(i)){
                ++check;
            }
        }
        input.close();
        System.out.print("The longest common prefix is " + firststr.substring(0,check));
    }

    public static void BinaryOutput(Scanner input){
        System.out.print("Enter the first input: ");
        int firstint = input.nextInt();
        int tempfirstint;

        System.out.print("Enter the second input: ");
        int secondint = input.nextInt();
        int tempsecondint;

        int firstintlength = lengthofint(firstint);
        int secondintlength = lengthofint(secondint);

        int i = 1;

        System.out.print("The longest common prefix is ");

        do{
            tempfirstint = firstint;
            tempsecondint = secondint;

            tempfirstint /= Math.pow(10,firstintlength-i);
            tempsecondint /= Math.pow(10,secondintlength-i);

            i++;

        }while(tempfirstint==tempsecondint);
        
        System.out.print(tempfirstint/10);
    }

    public static int lengthofint(int origint){

        int lengthfinder = 0;

        while(origint!=0){

            origint /= 10;

            lengthfinder++;

        }

        return lengthfinder;
    }
}