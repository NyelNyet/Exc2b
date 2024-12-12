package Exercises;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args){
        double[] list = {3.4,7.3,2.9,8.4,9.2,4.7};

        selectSort(list);
    }

    public static void selectSort(double[] list){
        for(int i = 0;i<list.length;i++){
            double minimum = list[i];
            int minind = i;
            for(int j = i+1;j<list.length;j++){
                if(minimum>list[j]){
                    minimum = list[j];
                    minind = j;
                }

                
            }
            
            if(minimum!=i){
                list[minind] = list[i];
                list[i] = minimum;
            }
        }
        
        System.out.println(Arrays.toString(list));
    } 
}
