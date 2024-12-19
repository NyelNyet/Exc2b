package Exercises;

import java.util.Scanner;

public class twoDArrayInMethod {
    public static void main(String[] args){
        
        int[][] m = getArray();
        System.out.println("The total sum is " + sum(m));
    }

    public static int[][] getArray(){
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[2][3];
        
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                matrix[i][j] = input.nextInt();
            }
        }
        input.close();
        return matrix;
    }

    public static int sum(int[][] m){
        int sum = 0;
        for(int i = 0;i<m.length;i++){
            for(int j = 0;j<m[i].length;j++){
                sum += m[i][j];
            }
        }
        return sum;
    }
}
