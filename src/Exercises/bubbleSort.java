package Exercises;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,4,5,6,2,6,7};
        

        for(int i = 0;i<numbers.length-1;i++){

            int currentMin = numbers[i];
            int currentMinIndex = i;

            for(int j = i+1;j<numbers.length;j++){
                
                if(currentMin>numbers[j]){

                    currentMin = numbers[j];
                    currentMinIndex = j;

                }

                if(currentMinIndex!=i){

                    int temp = numbers[i];
                    numbers[i] = numbers[currentMinIndex];
                    numbers[currentMinIndex] = temp;
                    
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
