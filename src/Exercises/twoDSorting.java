package Exercises;

import java.util.Arrays;

public class twoDSorting {
    public static void main(String[] args){
        int[][] nums= {
            {4,2},
            {1,7},
            {4,5},
            {1,2},
            {1,1},
            {4,1}
        };

        sort(nums);
    }

    public static void sort(int[][] nums){
        System.out.println(Arrays.deepToString(nums));
    }
}
