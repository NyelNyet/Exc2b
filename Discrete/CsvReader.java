import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    private static final String CSVFILEPATH = "DSSURVEY.csv";

    private static List<String[]> csvRead() {
        List<String[]> rows = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(CSVFILEPATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                rows.add(line.split(","));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rows;
    }
    public static void main(String[] args) {
        List<String[]> csvData = csvRead();

        String[] col_header = {"R01", "R02", "R03", "R04", "R05", "R06", "R07", "R08", "R09", "R10", "R11", "R12", "R13", "R14", "R15", "R16", "R17", "R18", "R19", "R20"};
        String[] row_header = col_header;

        int counter=0;

        for (String[] row : csvData) {
            if (counter == 0) {
                // Skip header row
                counter++;
                continue;
            }
            for (String value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        int numRows = csvData.size() - 1; // Exclude header
        int numCols = 5; // Only columns 5-9 (indices 4-8)
        String[][] matrix = new String[numRows][numCols];

        for (int i = 1; i < csvData.size(); i++) { // Start from 1 to skip header
            String[] row = csvData.get(i);
            for (int j = 0; j < numCols; j++) {
                if (row.length > j + 4) {
                    matrix[i - 1][j] = row[j + 4];
                } else {
                    matrix[i - 1][j] = ""; // Handle missing columns
                }
            }
        }

        System.out.println("\nMatrix (columns 5-9):");
        for (String[] row : matrix) {
            for (String value : row) {
            System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
