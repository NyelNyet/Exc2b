import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DiscreteAdjencyMatrix {

    // IMPORTANT: Update this path to the actual location of your CSV file.
    private static final String CSV_FILE_PATH = "DSSURVEY.csv";

    // Column indices for the questions we are interested in.
    // Column E in a spreadsheet is index 4.
    private static final int HOURS_SPENT_INDEX = 4; 
    // Column F in a spreadsheet is index 5.
    private static final int GAMING_CRUCIALITY_INDEX = 5;
    // Column G in a spreadsheet is index 6.
    private static final int PLATFORMS_INDEX = 6;
    // Column H in a spreadsheet is index 7.
    private static final int MONEY_SPENT_INDEX = 7;
    // Column I in a spreadsheet is index 8.
    private static final int GAMING_AFFECT_ON_PERFORMANCE_INDEX = 8;

    public static void main(String[] args) {
        // 1. Read the raw data from the CSV file.
        List<String[]> rawRows = readCsv();
        if (rawRows.isEmpty()) {
            System.out.println("No data read from CSV file. Please check the file path and content.");
            return;
        }

        // 2. Process the raw data into a structured list of Respondent objects.
        List<Respondent> respondents = processData(rawRows);

        // 3. Generate and print the matrix for the "hours spent on video games" question.
        System.out.println("\n\n============================================================================");
        System.out.println("Adjacency Matrix for Q1: How many hours do you spend on video games a day?");
        System.out.println("============================================================================");
        double[][] hoursMatrix = generateMatrix(respondents, "hours");
        printMatrix(hoursMatrix, respondents);

        // 4. Generate and print the matrix for the "money spent on video games" question.
        System.out.println("\n\n============================================================================");
        System.out.println("Adjacency Matrix for Q2: How much money do you spend on video games a month?");
        System.out.println("============================================================================");
        double[][] moneyMatrix = generateMatrix(respondents, "money");
        printMatrix(moneyMatrix, respondents);

        // 5. Generate and print the matrix for the "gaming cruciality" question.
        System.out.println("\n\n============================================================================");
        System.out.println("Adjacency Matrix for Q3: How crucial is gaming to your daily life?");
        System.out.println("============================================================================");
        double[][] gamingCrucialityMatrix = generateMatrix(respondents, "gamingCruciality");
        printMatrix(gamingCrucialityMatrix, respondents);

        // 6. Generate and print the matrix for the "platforms" question.
        System.out.println("\n\n============================================================================");
        System.out.println("Adjacency Matrix for Q4: Which platforms do you use for gaming?");
        System.out.println("============================================================================");
        double[][] platformsMatrix = generateMatrix(respondents, "platforms");
        printMatrix(platformsMatrix, respondents);

        // 7. Generate and print the matrix for the "gaming affect on academic performance" question.
        System.out.println("\n\n============================================================================");
        System.out.println("Adjacency Matrix for Q5: How does gaming affect your academic performance?");
        System.out.println("============================================================================");
        double[][] gamingAffectOnPerformanceMatrix = generateMatrix(respondents, "gamingAffectOnPerformance");
        printMatrix(gamingAffectOnPerformanceMatrix, respondents);
    }

    /**
    Reads the CSV file, skipping the first two header lines.
    @return A list of String arrays, where each array represents a row.
     */
    private static List<String[]> readCsv() {
        List<String[]> rows = new ArrayList<>();
        // Using try-with-resources to ensure the reader is closed automatically.
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE_PATH))) {
            String line;
            // Skip the first two lines (header and sub-header) as in your original code.
            reader.readLine(); 
            reader.readLine();
            
            // Read the rest of the file line by line.
            while ((line = reader.readLine()) != null) {
                // Split the line by commas, but handle commas inside quotes.
                // This is a simple split, for more complex CSVs a library would be better.
                rows.add(line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1));
            }
        } catch (IOException e) {
            System.err.println("Error reading the CSV file: " + e.getMessage());
            e.printStackTrace();
        }
        return rows;
    }

    /**
    Processes the raw string data into a list of Respondent objects with numerical data.
    @param rawData The list of string arrays from the CSV.
    @return A list of Respondent objects.
     */
    private static List<Respondent> processData(List<String[]> rawData) {
        List<Respondent> respondents = new ArrayList<>();
        int idCounter = 1;
        for (String[] row : rawData) {
            if (row.length > Math.max(HOURS_SPENT_INDEX, MONEY_SPENT_INDEX)) {
                String hoursString = row[HOURS_SPENT_INDEX];
                String moneyString = row[MONEY_SPENT_INDEX];
                String gamingCrucialityString = row[GAMING_CRUCIALITY_INDEX];
                String platformsString = row[PLATFORMS_INDEX];
                String gamingAffectOnPerformanceString = row[GAMING_AFFECT_ON_PERFORMANCE_INDEX];

                double hoursValue = convertHoursToMidpoint(hoursString);
                double moneyValue = convertMoneyToMidpoint(moneyString);
                double gamingCruciality = Double.parseDouble(gamingCrucialityString.trim());
                double platforms = convertPlatformsToMidpoint(platformsString);
                double gamingAffectOnPerformance = Double.parseDouble(gamingAffectOnPerformanceString.trim());
                // Create a new Respondent object and add it to the list.

                respondents.add(new Respondent("R" + idCounter++, hoursValue, moneyValue, gamingCruciality, platforms, gamingAffectOnPerformance));
            }
        }
        return respondents;
    }

    /*
    Converts the text answer for "hours spent" to a numerical midpoint.
     */
    private static double convertHoursToMidpoint(String text) {
        switch (text.trim()) {
            case "Less than 1 hour": return 0.5;
            case "2-3 hours": return 2.5;
            case "3-4 hours": return 3.5;
            case "4-5 hours": return 4.5;
            case "More than 5 hours": return 6.0; // Estimate for "more than 5"
            default: return 0.0; // Default case for unexpected/empty values
        }
    }

    /*
    Converts the text answer for "money spent" to a numerical midpoint.
     */
    private static double convertMoneyToMidpoint(String text) {
        switch (text.trim()) {
            case "RM0": return 0.0;
            case "RM1-10": return 5.5;
            case "RM11-20": return 15.5;
            case "RM22-30": return 26;
            case "More than RM30": return 125.0; // Estimate for "more than 100"
            default: return 0.0; // Default case for unexpected/empty values
        }
    }

    /*
    Converts the text answer for "platforms" to a numerical midpoint.
     */
    private static double convertPlatformsToMidpoint(String text) {
        switch (text.trim()) {
            case "1": return 1.0;
            case "2": return 2.0;
            case "3": return 3.0;
            case "4": return 4.0;
            case "5 or more": return 5.5; // Estimate for "5 or more"
            default: return 0.0; // Default case for unexpected/empty values
        }
    }
    
    /*
    Generates the adjacency matrix for a given list of respondents and data type.
    @param respondents The list of respondent data.
    @param dataType Which data to use: "hours" or "money".
    @return A 2D double array representing the adjacency matrix.
     */
    private static double[][] generateMatrix(List<Respondent> respondents, String dataType) {
        int numRespondents = respondents.size();
        double[][] matrix = new double[numRespondents][numRespondents];

        for (int i = 0; i < numRespondents; i++) {
            for (int j = 0; j < numRespondents; j++) {
                Respondent r1 = respondents.get(i);
                Respondent r2 = respondents.get(j);
                
                double val1 = 0.0;
                double val2 = 0.0;

                switch(dataType) {
                    case "hours":
                        // Get the hours value for both respondents.
                        val1 = r1.getHoursValue();
                        val2 = r2.getHoursValue();
                        break;
                    case "money":
                        // Get the money value for both respondents.
                        val1 = r1.getMoneyValue();
                        val2 = r2.getMoneyValue();
                        break;
                    case "gamingCruciality":
                        // Get the gaming cruciality value for both respondents.
                        val1 = r1.getGamingCruciality();
                        val2 = r2.getGamingCruciality();
                        break;
                    case "platforms":
                        // Get the platforms value for both respondents.
                        val1 = r1.getPlatforms();
                        val2 = r2.getPlatforms();
                        break;
                    case "gamingAffectOnPerformance":
                        // Get the gaming affect on performance value for both respondents.
                        val1 = r1.getGamingAffectOnPerformance();
                        val2 = r2.getGamingAffectOnPerformance();
                        break;
                }
                
                // Calculate the absolute difference and store it in the matrix.
                matrix[i][j] = Math.abs(val1 - val2);
            }
        }
        return matrix;
    }

    /**
    Prints the matrix to the console in a formatted way.
    @param matrix The 2D array to print.
    @param respondents The list of respondents for labeling the rows/columns.
     */
    private static void printMatrix(double[][] matrix, List<Respondent> respondents) {
        // Print header row
        System.out.print("        "); // Padding for row labels
        for (Respondent r : respondents) {
            System.out.printf("%-7s ", r.getId());
        }
        System.out.println();

        // Print each row with its data
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("%-7s ", respondents.get(i).getId());
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-7.1f ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    /**
    A simple helper class to store processed data for each respondent.
     */
    static class Respondent {
        private final String id;
        private final double hoursValue;
        private final double moneyValue;
        private final double gamingCruciality;
        private final double platforms;
        private final double gamingAffectOnPerformance;

        public Respondent(String id, double hoursValue, double moneyValue, double gamingCruciality, double platforms, double gamingAffectOnPerformance) {
            this.id = id;
            this.hoursValue = hoursValue;
            this.moneyValue = moneyValue;
            this.gamingCruciality = gamingCruciality;
            this.platforms = platforms;
            this.gamingAffectOnPerformance = gamingAffectOnPerformance;
        }

        public String getId() { return id; }
        public double getHoursValue() { return hoursValue; }
        public double getMoneyValue() { return moneyValue; }
        public double getGamingCruciality() { return gamingCruciality; }
        public double getPlatforms() { return platforms; }
        public double getGamingAffectOnPerformance() { return gamingAffectOnPerformance; }
    }
}
