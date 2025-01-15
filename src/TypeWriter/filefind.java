package TypeWriter;

import java.io.File;

public class filefind {
    public static void main(String[] args) {
        // Create a File object for the directory containing the files
        File directory = new File("C:\\Users\\dania\\OneDrive\\Desktop\\BICS 1301\\JScript\\Exc\\Exc2b");

        // Get the list of files in the directory
        File[] files = directory.listFiles();

        // Check if the directory exists and contains files
        if (files != null) {
            // Loop through each file in the directory
            for (int i = 0; i < files.length; i++) {
                File file = files[i];
                // Print the name of each file
                if(file.getName().contains(".txt")){
                    String name = file.getName();
                    int dotIndex = name.indexOf('.');
                    name = name.substring(0, dotIndex);
                    System.out.println("File name: " + name);
                }
                
            }
        } else {
            System.out.println("The directory does not exist or is empty.");
        }
    }
}
