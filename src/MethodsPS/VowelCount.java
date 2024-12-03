package MethodsPS;
import java.util.Scanner;
public class VowelCount {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String userString = input.nextLine();
        input.close();

        int vowelcounts = myVowels(userString);

        System.out.println("The number of vowel is "+vowelcounts);
    }

    public static int myVowels(String word){
        int check = 0;
        char letter;
        word = word.toLowerCase();
        for(int i = 0;i<word.length();i++){
            letter = word.charAt(i);
            if(letter =='a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                check++;
            }
        }
        return check;
    }
}
