package Exercises;
import java.util.Scanner;
public class RepearforVoid {
    public static void main(String[] args){
        System.out.println("This program accumulate the total number of bricks");
        System.out.println("for a pyramid with a square base, where each layer uses");
        System.out.println("layer X layer bricks where the total layer required is");
        System.out.println("decided by the user");
        totalbricks();
    }
    public static void totalbricks(){
        int totalbricks = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total number of layers: ");
        int totalLayers = input.nextInt();

        for(int layer = 1; layer <= totalLayers; layer++){
            totalbricks += layer*layer;
        }

        System.out.println("Total bricks needed is : " + totalbricks);
        input.close();
    }
}