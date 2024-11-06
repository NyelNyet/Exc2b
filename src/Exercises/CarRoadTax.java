package Exercises;
import java.util.Scanner;
public class CarRoadTax {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int ccS,ccN;
        double BFees =0.0;
        double ProgFees=0.0;

        System.out.print("Enter the type of car 'S' for Saloon, 'N' for Non-Saloon: "); //Get type of the car from user
        String S = input.next();

        char TOC = S.charAt(0);

        //Differentiate between Saloon and Non-Saloon
        switch (TOC) {
            case 'S':
            case 's':{//Get engine capacity of the car from user
                System.out.print("Enter the engine capacity of the car(cc): "); 
                ccS = input.nextInt();

                if(ccS<=1000)
                BFees=20.0;
                else if(ccS>1000 && ccS<=1200)
                BFees=55.0;
                else if(ccS>1200 && ccS<=1400)
                BFees=70.0;
                else if(ccS>1400 && ccS<=1600)
                BFees=90.0;
                else{
                System.out.print("Invalid engine power for Saloon cars");break;
                }

                //Display road tax
                System.out.printf("Road tax is RM%.2f",BFees);break; 
            }
            case 'N':
            case 'n':{//Get engine capacity of the car from user
                System.out.print("Enter the engine capacity of the car(cc): "); 
                ccN = input.nextInt();
                
                if(ccN>1600 && ccN<=1800){
                    BFees=200.0;
                    ProgFees = 0.4*(ccN-1600);
                }else if(ccN>1800 && ccN<=2000){
                    BFees=280.0;
                    ProgFees = 0.5*(ccN-1800);
                }else if(ccN>2000 && ccN<=2500){
                    BFees=380.0;
                    ProgFees = 1*(ccN-2000);
                }else if(ccN>2500 && ccN<3000){
                    BFees=800.0;
                    ProgFees = 2.5*(ccN-2500);
                }else if(ccN>=3000){
                    BFees=2130.0;
                    ProgFees = 4.5*(ccN-3000);
                }else{
                System.out.print("Invalid engine power for Non-Saloon cars");break;
                }

                //Display base road tax
                System.out.printf("Base road tax is RM%.2f\n",BFees);

                //Display progression fees
                System.out.printf("Progression fees is RM%.2f\n",ProgFees); 

                //Display total road tax
                System.out.printf("Total road tax is RM%.2f\n",BFees+ProgFees);break; 
            }
            default:System.out.println("Invalid type of car!");break;
        }
        input.close();
    }
}