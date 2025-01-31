package FinalExc;

import java.io.*;

public class TestAccidentClass {
    public static void main(String[] args) throws IOException{
        String[] state = new String[11];
        int[] noOfFatalities = new int[11];
        int[] noOfMajorInjuries = new int[11];
        int[] noOfMinorInjuries = new int[11];
        int[] noOfDamage = new int[11];
        int[] totalAccident = new int[11];

        AccidentClass.readAccInfo(state, noOfFatalities, noOfMajorInjuries, noOfMinorInjuries, noOfDamage, totalAccident);
    
        String lowestAccState = AccidentClass.printResult(state, noOfFatalities, noOfMajorInjuries, noOfMinorInjuries, noOfDamage, totalAccident);
    
        System.out.println("\nThe states with the lowest number of accidents is "+lowestAccState+" with "+AccidentClass.minAcc(totalAccident));
    }
}