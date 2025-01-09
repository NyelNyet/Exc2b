package TypeWriter;
//Danial Harith 2411467
import java.io.*;
import java.util.Scanner;

public class VisitClass {

    public static int calctotal(int cost, int ticket){
        return cost*ticket;
    }

    public static void print() throws IOException{
        File f = new File("visitors.txt");

        Scanner input = new Scanner(f);

        System.out.println("Visitor ID\tVisitor Name\tAge\tDate Entry\tPackage\tcost\t#ticket\tRide\tTotal Paid");
        System.out.println("------------\t------------\t---\t----------\t-------\t----\t-------\t------\t----------");

        while(input.hasNext()){
            String visID = input.next();
            String firstName = input.next();
            String lastName = input.next();
            int age = input.nextInt();
            String date = input.next();
            String packtype = input.next();
            int cost = input.nextInt();
            int ticket = input.nextInt();
            String ride = input.next();
            if(ride.equals("XTREME")){
                int total = calctotal(cost,ticket);
                System.out.println(visID + "\t" + firstName + "\t" + lastName + "\t" + age + "\t" + date + "\t" + packtype + "\t" + cost + "\t" + ticket + "\t" + ride + "\t" + total);
            }
        }

        input.close();
    }
}
