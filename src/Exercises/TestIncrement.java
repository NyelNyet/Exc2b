package Exercises;

public class TestIncrement {
    public static void main(String[] args){

        int x = 1;
        System.out.println("Before calling increment, x is " + x);
        increment(x);
        System.out.println("After calling increment, x is " + x);

    }
    public static void increment(int n){
        n++;
        System.out.println("n inside the mothod is "+n);
    } 
}