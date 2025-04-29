package AL;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class arraylistoop {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();

        list.add("Ali");
        list.add("Abu");

        File f = new File("arraylist.txt");
        PrintWriter write = new PrintWriter(f);

        write.println(list.get(0));
        write.println(list.get(1));
        write.close();

        Scanner read = new Scanner(f);

        while (read.hasNext()) {
            System.out.println(read.next());
        }
        read.close();
    }
}
