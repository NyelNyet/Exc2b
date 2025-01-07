package Array;

public class RandomShuffling {
    public static void main(String[] args){

        double[] myList = {3.4, 8.9, 7.3, 4.2, 6.1};

        for(int i = myList.length-1;i>0;i--){

            int j = (int)(Math.random()*(i+1));

            double temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
        }
    }
}
