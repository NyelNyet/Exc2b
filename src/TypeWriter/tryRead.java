package TypeWriter;

import java.io.*;
import java.util.*;

public class tryRead {
    public static void main(String[] args)throws IOException{
        
        String[] cat = {"Entertainment",
        "Food&Beverages",
        "PersonalCare",
        "CleaningSupplies",
        "Clothings",
        "Health&Medicines",
        "HouseholdEssentials",
        "Eletronics&Communications"        
        };
        
        double[][] total = new double[2][cat.length];

        File f = new File("Danial.txt");

        Scanner inps = new Scanner(f);

        String current = "";

        int i = 0,j = 0;

        while (inps.hasNext()) {
            
            j = 0;
            String temp = inps.next();

            if(temp.equals(cat[i]) && i!=0)
                current = current + "\n\n";

            if(temp.equals(cat[i])){

                current = current.concat(cat[i] + ' ' + total[0][i] + ' ');
                inps.next();

            }else if(temp.equals("=")){

                current = current.concat(temp + ' ' + total[1][i] + '\n');
                inps.next();
                if(i<cat.length-1){
                    i++;
                }

            }else{
                if(temp.equals("Qty:") || temp.equals("Price:")){
                    current = current.concat('\t'+temp + ' ');
                    j++;
                }else{
                    current = current.concat(temp+' ');
                }
            }

            if(j!=0){
                current = current+' ';
            }
        }

        PrintWriter out = new PrintWriter(f);

        out.print(current);

        out.close();
    }
    
    

}
