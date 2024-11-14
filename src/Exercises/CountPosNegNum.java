package Exercises;
import java.util.Scanner;
public class CountPosNegNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of integers, end the list with 777: ");
        int x=0,neg=0,pos=-1,count=-1;
        double total=0;
        do{
            total += x;
            if(x>=0){
                ++pos;
            }else{
                ++neg;
            }
            x = input.nextInt();
            ++count;
        }while(x!=777);

        double avg = total/count;

        System.out.println("The number of positive integer is : "+pos);
        System.out.println("The number of negative integer is : "+neg);
        System.out.println("Total of all integers is : "+total);
        System.out.printf("The average of all numbers is : %.2f",avg);
    }
}
