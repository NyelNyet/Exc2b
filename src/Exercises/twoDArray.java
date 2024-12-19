package Exercises;
import java.util.Scanner;
public class twoDArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int [][] matrix = new int[3][3];

        System.out.println("Please enter your values for matrix 3 by 3: ");

        //Row
        for(int i = 0;i<matrix.length;i++){
            //Column
            for(int j = 0;j<matrix[i].length;j++){
                matrix[i][j] = input.nextInt();
            }
        }
        
        for(int i = 0;i<matrix[0].length;i++){
            int sum = 0;
            //Column
            for(int j = 0;j<matrix.length;j++){
                System.out.print(matrix[j][i]+" ");
                sum += matrix[j][i];
            }
            System.out.println();
            System.out.println("Total value for all elements each column is: "+sum);
        }
    }
}
