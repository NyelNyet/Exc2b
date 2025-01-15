import java.io.*;
import java.util.*;

public class GWtry {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        boolean isvalid = true;

        String[] categories = {"Food and Beverages",
        "Personal Care",
        "Cleaning Supplies",
        "Clothing",
        "Health and Medicine",
        "Household Essentials",
        "Electronics and Communication"};

        double[] limitCat = new double[categories.length];

        double[] totalCat = new double[categories.length];

        for(int i = 0;i<categories.length;i++){
            System.out.println(i+" "+categories[i]);
        }
        
        // as long as user's input is invalid, it will require the user to input again 
        while (isvalid) {
            System.out.print("Enter categories(0-6): ");
            int choice = inp.nextInt();

            switch (choice) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:isvalid=false;break;
                default:isvalid=printNoSuchCat();break;
            }
        }
    }

    public static boolean noSuchCat(){
        Scanner inp = new Scanner(System.in);
        
        String check = inp.nextLine().toUpperCase().trim(); // Read entire line and trim any spaces

        if(check.equals("Y")){
            return true;
        }else if(check.equals("N")){
            System.exit(0);
            return false;
        }else{
            throw new InputMismatchException("Please enter either Y or N only!");
        }
    }

    public static boolean printNoSuchCat(){
        boolean validinp = false;

        System.out.print("No such category. Re-enter? (Y/N): ");

        // as long as user's input is invalid, it will require the user to input again 
        while(!validinp){
                    
            try{
                validinp = noSuchCat();
                if(validinp)
                    break;
            }catch(IndexOutOfBoundsException ioube){
                System.out.println("No input detected. Please enter either Y or N only.");
            }catch(InputMismatchException ime){
                System.out.println(ime.getMessage());
            }
        }
        return validinp;
    }
}