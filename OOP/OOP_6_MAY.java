import java.io.*;
import java.util.*;

public class OOP_6_MAY {

    private static File f = new File("Student.txt");
    public static void main(String[] args){
        printWriterMethod(getStudName());

        //fileWriterMethod(getStudName());
    }

    public static void fileWriterMethod(List<String> students){
        //Implementing FileWriter, FileReader, and BufferedReader

        try{
            FileWriter writer = new FileWriter(f);

            for(int i = 0;i<students.size();i++){
                writer.write(students.get(i)+'\n');
            }

            writer.close();
        }catch(IOException ioe){
            System.out.println("An error has occured!");
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
                System.out.println("An error has occured!");
            }
        } 
    }

    public static void printWriterMethod(List<String> students){
        //Implementing PrintWriter and Scanner

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

    public static List<String> getStudName(){
        Scanner input = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        String name;

        while(true){
            System.out.print("Enter Student Name(Enter 0 to exit): ");
            name = input.nextLine();
            if(name.equals("0")){
                break;
            }else{
                students.add(name);
            }
        }

        input.close();

        System.out.println();//Output aesthetic purposes
        return students;
    }
}   