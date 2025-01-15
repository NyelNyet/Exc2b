package TypeWriter;

import java.io.*;
import java.util.*;

public class TRYDEL {
    public static void main(String[] args)throws IOException{
        Scanner inp = new Scanner(System.in);

        String filename = inp.nextLine();
        filename.concat(".txt");

        File f = new File(filename);
    
        PrintWriter out = new PrintWriter(f);

        if(f.exists()){
            out.println("L1");
        }
        

        out.close();
    }
}
