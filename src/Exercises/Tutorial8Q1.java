package Exercises;
import java.util.Scanner;
public class Tutorial8Q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[][] cart = new String[100][3];

        int i = 0,j = 0,test;
      

        do{
            System.out.println("Enter details for item "+ (i+1));
            while (j<3) {
                if(j==0){
                    System.err.print("Name: ");
                    cart[i][j] = input.next();
                    j++;
                }else if(j==1){
                    System.out.print("Price per unit: ");
                    cart[i][j]= input.next();
                    j++;
                }else if(j==2){
                    System.out.print("Quantity: ");
                    cart[i][j]= input.next();
                    j++;
                }
            }
            j=0;
            System.out.print("Do you want to add another item? (yes/no): ");
            String check = input.next();
            if (check.equals("no")) {
                break;    
            }
            i++;
        }while(true);

        System.err.print("The total cost of your cart is: $"+calculateTotalCost(cart));
    }

    public static double calculateTotalCost(String[][] cart){
        double total = 0;
        for(int i = 0;true;i++){
            if (cart[i][1] != null && !cart[i][1].isEmpty() && cart[i][2] != null && !cart[i][2].isEmpty()){
                total += Double.parseDouble(cart[i][1])*Double.parseDouble(cart[i][2]);
            }else{
                break;
            }
        }
        
        return total;
    }
}
