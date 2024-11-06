package Exercises;
import java.util.Scanner;
public class CostOfShipping {
    static public void main(String[] args){
        Scanner input = new Scanner(System.in);
        double Cost=0;

        System.out.print("Enter Weight in kilogram: "); //Input from user
        double Weight = input.nextDouble();
        input.close();

        if(Weight>20){
            System.out.println("The package cannot be shipped.");
            return; // Automatically exits if weigth > 20
        }else if(10<Weight && Weight<=20){
            Cost = 10.5;
        }else if(3<Weight && Weight<=10){
            Cost = 8.5;
        }else if(1<Weight && Weight<=3){
            Cost = 5.5;
        }else if(0<Weight && Weight<3);

        System.out.println("Shipping Cost : RM" + Cost); //Display shipping cost
    }
}
