package Exercises;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String UInput = input.nextLine();
        
        int check = 0;
        int length=UInput.length();

        for(int x = 0;x<length; x++)
        {
            
           if(UInput.charAt(x) == UInput.charAt((length-1)-x))
           {
               ++check;
           }

           if(x == length/2)
           {
            break;
           }
        }

        if(check == (length/2)+1)
        {
            System.out.println("IT's a palindrome");
        }
        else
        { 
            System.out.println("It's not a palindrome");
        }
        input.close();
    }
}
