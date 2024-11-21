package Exercises;
import java.util.Scanner;
public class Tutorial5Q2 {
    static public void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = input.nextInt();
        
        if(isPrime(x)){
        System.out.println(x + " is a prime number");
        }else{
            System.out.println(x + " is not a prime number");
        }
        input.close();
    }

    public static boolean isPrime(int x){
        if(((x==2 || x==3 || x==5 || x==7) || (x%2!=0 && x%3!=0 && x%5!=0 && x%7!=0)) && x!=1){
            return true;
        }else{
            return false;
        }
    }
}
