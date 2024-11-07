package Exercises;
import java.util.Scanner;
public class TutorialExc3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char x;

        do{
            System.out.println("\nWhat does CPU stand for?");
            System.out.println("a) Central Process Unit");
            System.out.println("b) Central Processing Unit");
            System.out.println("c) Central Processor Unit");
            System.out.println("d) Central Process unit");
            System.out.print("Enter your answer (a,b,c, or d) : ");
            x = input.nextLine().charAt(0);
            if(x=='b'){
            System.out.println("Correct! Proceeding to the next question...");
            }else{
                System.out.println("Incorrect. Please try again.");
            }
        }while(x!='b');

        do{
            System.out.println("\nWhat is the full form of RAM?");
            System.out.println("a) Random Access Memory");
            System.out.println("b) Read Access Memory");
            System.out.println("c) right Access Memory");
            System.out.println("d) Random Applied Memory");
            System.out.print("Enter your answer (a,b,c, or d) : ");
            x = input.nextLine().charAt(0);
            if(x=='a'){
            System.out.println("Correct! Proceeding to the next question...");
            }else{
                System.out.println("Incorrect. Please try again.");
            }
        }while(x!='a');

        do{
            System.out.println("\nWhat does HTTP stand for?");
            System.out.println("a) HyperText Transfer Protocol");
            System.out.println("b) Hyper Transfer Text Protocol");
            System.out.println("c) Hyper Tool Text Protocol");
            System.out.println("d) HyperText Technical Protocol");
            System.out.print("Enter your answer (a,b,c, or d) : ");
            x = input.nextLine().charAt(0);
            if(x=='a'){
            System.out.println("Correct! Proceeding to the next question...");
            }else{
                System.out.println("Incorrect. Please try again.");
            }
        }while(x!='a');

        
        do{
            System.out.println("\nWhich company developed the Java programming language?");
            System.out.println("a) Microsoft");
            System.out.println("b) Sun Microsystems");
            System.out.println("c) Apple");
            System.out.println("d) Google");
            System.out.print("Enter your answer (a,b,c, or d) : ");
            x = input.nextLine().charAt(0);
            if(x=='b'){
            System.out.println("Correct! Proceeding to the next question...");
            }else{
                System.out.println("Incorrect. Please try again.");
            }
        }while(x!='b');

        do{
            System.out.println("\nWhat is the main funciton of the ALU in computer?");
            System.out.println("a) To perform arithmetic and logica operations");
            System.out.println("b) To store data");
            System.out.println("c) To input data");
            System.out.println("d) To manage memory");
            System.out.print("Enter your answer (a,b,c, or d) : ");
            x = input.nextLine().charAt(0);
            if(x=='a'){
            System.out.println("Correct! Proceeding to the next question...");
            }else{
                System.out.println("Incorrect. Please try again.");
            }
        }while(x!='a');
        input.close();
        System.out.println("\nCongratulations! You've completed the quiz.");
    }
}
