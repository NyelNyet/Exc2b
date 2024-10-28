package Exercises;

import java.util.Scanner;

public class TutorialExc1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your input: "); //Input from user
        String message = input.next();
        input.close();

        int l = message.length(); //Calc length of input
        message = message.toUpperCase().substring(0,l/2 + l%2); // Cut to half and uppercase
        char fl = message.charAt(0); //first letter

        System.out.println("Length: " + l);
        System.out.println("Squared length; " + Math.pow(l,2));;
        System.out.println("First half: " + message);
        if((fl == 'A') || (fl == 'E') || (fl == 'I') || (fl == 'O') || (fl == 'U')){ //decides Vowel or Consonant
            System.out.println("First letter " + (char)fl + " is a vowel");
        }else{
            System.out.println("First letter " + (char)fl + " is a consonant");
        }
    }
}

/*
 * public static boolean IsVowel(String[] args){
 *      return "AEIOUaeiou" = indexOf(message) !=-1
 * } 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */