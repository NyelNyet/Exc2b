package TypeWriter;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class ReadData {
    public static void main(String[] args) throws IOException {
        File f = new File("marks.txt");

        Scanner input = new Scanner(f);

        while(input.hasNext()){
            String firstName = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(firstName + " " + lastName + " " + score);
        }

        input.close();
    }
}
