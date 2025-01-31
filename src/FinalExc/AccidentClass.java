package FinalExc;

import java.util.*;

import java.io.*;

public class AccidentClass {

    public static void readAccInfo(
    String[] state,
    int[] noOfFatalities,
    int[] noOfMajorInjuries,
    int[] noOfMinorInjuries,
    int[] noOfDamage,
    int[] totalAccident) throws IOException{
        File f = new File("accident_info.txt");

        Scanner fileRead = new Scanner(f);

        int i = 0;

        while (fileRead.hasNext()) {
        state[i] = fileRead.next();
        noOfFatalities[i] = fileRead.nextInt();
        noOfMajorInjuries[i] = fileRead.nextInt();
        noOfMinorInjuries[i] = fileRead.nextInt();
        noOfDamage[i] = fileRead.nextInt();
        totalAccident[i] = noOfFatalities[i]+noOfMajorInjuries[i]+noOfMinorInjuries[i]+noOfDamage[i];
        i++;
        }
        fileRead.close();
    }

    public static int minAcc(int[] totalAccident){
        int currentMin = totalAccident[0];

        for (int i = 0;i<totalAccident.length;i++) {
            if(currentMin > totalAccident[i]){
                currentMin = totalAccident[i];
            }
        }
        return currentMin;
    }

    public static String printResult(
    String[] state,
    int[] noOfFatalities,
    int[] noOfMajorInjuries,
    int[] noOfMinorInjuries,
    int[] noOfDamage,
    int[] totalAccident) {
        int j = 0;
        
        System.out.println("Reading data...");
        
        System.out.println("The data has been read successfully\nResult:\n");

        System.out.println("State\t\tFatalities\tMajor Injuries\tMinor Injuries\tDamage\tTotal Accidents");
        System.out.println("---------------------------------------------------------------------------------------");
        for (int i = 0; i < 11; i++) {
            // Use String.format to adjust spacing for better alignment
            System.out.printf("%-16s%-16d%-16d%-16d%-8d%-16d\n", 
                state[i], 
                noOfFatalities[i], 
                noOfMajorInjuries[i], 
                noOfMinorInjuries[i], 
                noOfDamage[i], 
                totalAccident[i]);
        }

        for(;minAcc(totalAccident)!=totalAccident[j];j++);

        return state[j];
    }
}
