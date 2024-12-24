package Exercises;

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
        System.out.println("Before Sorting");
        display(nums);

        sort(nums);

        System.out.print("\nSorted Array:\n");

        display(nums);    
    }

    public static void sort(int[][] nums){

        for(int i = 0;i<nums.length-1;i++){

            int currentMin = nums[i][0];  
            int currentMinIndex = i;
           

            for(int j = i+1;j<nums.length;j++){

                if(currentMin > nums[j][0]){

                    currentMin = nums[j][0];
                    currentMinIndex = j;

                } 
            }

            if(currentMinIndex!=i){

                int temp = nums[i][0];
                nums[i][0] = nums[currentMinIndex][0];
                nums[currentMinIndex][0] = temp;
                
            }
        }


        int i = 0;
        while(i < nums.length){

            int j = i + 1;

            while(j < nums.length && nums[j][0] == nums[i][0]){
                j++;
            }

            for(int k = i; k < j - 1; k++){
                for(int l = k + 1; l < j; l++){
                    if(nums[k][1] > nums[l][1]){

                        int[] temp = nums[k];
                        nums[k] = nums[l];
                        nums[l] = temp;
                    }
                }
            }
            i=j;
        }
    }

    public static void display(int[][] nums){

        for(int i = 0;i<nums.length;i++){

            System.out.print("[");
            for(int j = 0;j<nums[i].length;j++){
                System.out.print(nums[i][j]);
                if(j+1!=nums[i].length){
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
    }
}