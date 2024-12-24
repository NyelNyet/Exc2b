package Exercises;

public class employeesWeeklyHours {
    public static void main(String[] args){
        int[][] hours ={
            {2,4,3,4,5,8,8},
            {7,3,4,3,3,4,4},
            {3,3,4,3,3,2,2},
            {9,3,4,7,3,4,1},
            {3,5,4,3,6,3,8},
            {3,4,4,6,3,4,4},
            {3,7,4,8,3,8,4},
            {6,3,5,9,2,7,9}
        };
        int[][] eachTotal = {
            {0,0},
            {1,0},
            {2,0},
            {3,0},
            {4,0},
            {5,0},
            {6,0},
            {7,0},
        };

        count(hours, eachTotal);

        sort(eachTotal);

        display(eachTotal);

    }

    public static void count(int[][] hours, int[][] eachTotal){

        for(int i = 0;i<hours.length;i++){

            for(int j = 0;j<hours[i].length;j++){

                eachTotal[i][1] += hours[i][j];
            }
        }
    }

    public static void sort(int[][] eachTotal){

        for(int i = 0;i<eachTotal.length-1;i++){

            int currentMin = eachTotal[i][1];
            int currentMinIndex = i;

            for(int j = i+1;j<eachTotal.length;j++){

                if(currentMin > eachTotal[j][1]){
                    currentMin = eachTotal[j][1];
                    currentMinIndex = j;
                }
            }

            if(currentMinIndex!=i){
                int temp = eachTotal[i][1];
                eachTotal[i][1] = eachTotal[currentMinIndex][1];
                eachTotal[currentMinIndex][1] = temp;
                temp = eachTotal[i][0];
                eachTotal[i][0] = eachTotal[currentMinIndex][0];
                temp = eachTotal[i][0];
            }
        }
    }

    public static void display(int[][] eachTotal){
        for(int i = eachTotal.length-1;i>=0;i--){
            System.out.println("Employee "+eachTotal[i][0]+" Weekly Hours Is "+eachTotal[i][1]);
        }
    }
}