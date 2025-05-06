import java.io.*;
import java.util.*;

public class OOP_6_MAY {

    //Text colouring
    private static String[] bold = {"\033[1m","\033[0m"};
    private static String green = "\033[32m";
    private static String resCol = "\033[39m";
    private static String[] underline = {"\033[4m","\033[0m"};

    //set for the whole class since im using 2 method that will use the same ArrayList and File name
    private static File f = new File("Student.txt");

    public static void main(String[] args){
        printWriterMethod(getStudName());

        System.out.println();//Output aesthetic purposes

        fileWriterMethod(getStudName());
    }

    public static void fileWriterMethod(List<String> students){
        //Implementing FileWriter, FileReader, and BufferedReader
        System.out.println(underline[0]+bold[0]+green+ "File Writer/Reader and BufferedReader Method:-"+resCol+bold[1]+underline[1]);

        try{
            FileWriter writer = new FileWriter(f);

            for(int i = 0;i<students.size();i++){
                writer.write(students.get(i)+'\n');
            }

            writer.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }finally{
            try{
                BufferedReader reader = new BufferedReader(new FileReader(f));
                String line;
                while((line = reader.readLine()) != null){
                    System.out.println(line);
                }

                reader.close();
            }catch(FileNotFoundException fnfe){
                System.out.println("File Not Found With The Name Of: "+f.getName());
            }catch(IOException ioe){
                ioe.printStackTrace();
            }
        } 
    }

    public static void printWriterMethod(List<String> students){
        //Implementing PrintWriter and Scanner
        System.out.println(underline[0]+bold[0]+green+ "Print Writer Method:-"+resCol+bold[1]+underline[1]);

        try{
            PrintWriter out = new PrintWriter(f);

            for(int i = 0;i<students.size();i++){
                out.println(students.get(i));
            }
    
            out.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }finally{
            try{
                Scanner scans = new Scanner(f);
                while(scans.hasNext()){
                    System.out.println(scans.nextLine());
                }

                scans.close();
            }catch(FileNotFoundException fnfe){
                System.out.println("File Not Found With The Name Of: "+f.getName());
            }   
        } 
    }

    //Tell user to input students name
    public static List<String> getStudName(){
        Scanner input = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        String name;

        do{
            System.out.print("Enter Student Name(Enter 0 to exit): ");
            name = input.nextLine();
            if(name.equals("0")){
                break;
            }else{
                students.add(name);
            }
        }while(true);

        System.out.println();//Output aesthetic purposes
        return students;
    }
}   