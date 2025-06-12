import java.io.*;
import java.util.*;

import MethodsPS.convert;

public class CsvReader {
    private static final String CSVFILEPATH = "DSSURVEY.csv";

    private static List<String[]> csvRead() {
        List<String[]> rows = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(CSVFILEPATH))) {
            String line;
            reader.readLine();
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                rows.add(line.split(","));
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rows;
    }
    
    private static void fixList(List<String[]> csvData){
        for (String[] rawData : csvData) {
            if(rawData.length > 4){
                switch (rawData[4]) {
                    case "Less than 1 hour":
                        rawData[4] = "1";
                        break;
                    case "2-3 hours":
                        rawData[4] = "2.5";
                        break;
                    case "More than 5 hours":
                        rawData[4] = "5";
                        break;
                }

                switch (rawData[7]) {
                    case "RM0":
                        rawData[7] = "0";
                        break;
                    case "RM1-10":
                        rawData[7] = "5.5";
                        break;
                }
            }
        }
    }
    public static void main(String[] args) {
        List<String[]> csvData = csvRead();

        String[] col_header = {"R01", "R02", "R03", "R04", "R05", "R06", "R07", "R08", "R09", "R10", "R11", "R12", "R13", "R14", "R15", "R16", "R17", "R18", "R19", "R20"};
        String[] row_header = col_header;

        fixList(csvData);

        createMatrix(csvData);
    }

    private static void createMatrix(List<String[]> data) {
        // Add this line for diagnostics
        System.out.println("Total items received in list: " + data.size());

        data.stream().forEach(x -> {
            System.out.println(x[4]+" "+x[5]+" "+x[6]+" "+x[7]+" "+x[8]);
        });

        for(int j = 4;j<data.get(j).length;j++){
            for(int i = 0;i<data.size()-1;i++){
                if(data.get(i)[j].equals(data.get(i+1)[j])){
                    System.out.print("0 ");
                }else{
                    System.out.print(Double.parseDouble(data.get(i)[j])+Double.parseDouble(data.get(i+1)[j])+" ");
                }
            }
            System.out.println();
        }
    }
}
