package Exercises;

public class twoDSorting {
    public static void main(String[] args) {
        int[][] array = {
            {4, 2},
            {1, 7},
            {4, 5},
            {1, 2},
            {1, 1},
            {4, 1}
        };

        // Printing Original Array
        System.out.println("Original Array");
        display(array);

        // Sort the array
        sort(array);
        System.out.println("===============");

        // Print the sorted array
        System.out.println("Sorted Array");
        display(array);
}

    public static void sort(int[][] m){
       
        for (int i = 0; i < m.length - 1; i++) 
        {
            
            for (int j = i + 1; j < m.length; j++) 
            {
                if (m[i][0] > m[j][0] || (m[i][0] == m[j][0] && m[i][1] > m[j][1])) {
                    // Swap the rows
                    int[] temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                }
            }
        }
    }

    public static void display(int[][] m){
        for (int i = 0; i < m.length; i++) {
            System.out.print("[");
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
                if(j+1!=m[i].length){
                    System.out.print(",");
                }
            }
            System.out.print("]");
            System.out.println();
    }
    }
}