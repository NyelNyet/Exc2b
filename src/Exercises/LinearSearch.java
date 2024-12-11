package Exercises;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] numbers = {67,23,90,111,24,8};
        int result;

        System.out.print("Enter a key value to search: ");
        int key = input.nextInt();

        result = linear(numbers, key);
        System.out.println("The index of the value is "+result);
        input.close();
    }

    public static int linear(int[] array,int value){
        for(int i = 0;i<array.length;i++){
            if(value == array[i]){
                return i;
            }
        }
        return -1;
    }
}
