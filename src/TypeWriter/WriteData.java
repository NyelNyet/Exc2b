package TypeWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class WriteData {
    public static void main(String[] args) throws IOException {

        File f = new File("marks.txt");

        if(f.exists()){
            System.out.println("File is already exist. Use a different filename");
            System.exit(1);
        }

        PrintWriter out = new PrintWriter(f);

        out.print("Danial D ");
        out.println(85);
        out.print("Ahmad A ");
        out.println(80);

        out.close();
    }
}
