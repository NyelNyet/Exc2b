package Exercises;

public class binarySearch {
    public static void main(String[] args){

        int[] numbers = {2,8,11,18,45,106};
        int value = 18;
        int result;

        result = binary(numbers, value);

        System.out.println("The index position is at "+result);


    }

    public static int binary(int[] array, int key){
        int low = 0;
        int high = array.length-1;

        while(high>=low){
            int mid = (high+low)/2;
            if(key < array[mid]){
                high = mid - 1;
            }else if(key == array[mid]){
                return mid;
            }else{
                low = mid-1;
            }
        }

        return -1-low;
    }
}
