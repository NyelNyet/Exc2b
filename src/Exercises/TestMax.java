package Exercises;

public class TestMax {
    public static void main(String[] args){

        int num1 = 15;
        int num2 = 7;

        System.out.print("Result is " + Max(num1,num2));

    }

    public static int Max(int n1,int n2){
        int result;

        if(n1>n2)
        result = n1;
        else
        result = n2;

        return result;
    }


}