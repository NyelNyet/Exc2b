package Exercises;

public class PrimeNum {
    public static void main(String[] args){
        int x=0;

        while(x<50){
            if(x%2!=0 && x%3!=0 && x%5!=0 && x%7!=0 && x!=0 && x!=1){
                System.out.println(x);
                ++x;
            }
            ++x;
        }
    }
}