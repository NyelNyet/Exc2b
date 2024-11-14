package Exercises;
/*
Danial Harith 2411467
*/
public class FutureTuitionFees {
    public static void main(String[] args){
        final double RATE = 0.07;
        double Fee = 10000;
        int Year = 0;
        do{
            Fee += Fee*RATE;
            ++Year;
        }while(Fee<=20000);

        System.out.println(Year);
    }
}
