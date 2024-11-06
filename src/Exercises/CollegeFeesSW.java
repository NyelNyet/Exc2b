package Exercises;
import java.util.Scanner;
public class CollegeFeesSW {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        Double Fees=0.0;

        System.out.print("Type of Study?(U/P)");
        String S = input.next();
        
        char Study = S.charAt(0);

        switch (Study) {
            case 'P':
            case 'p':Fees = 8000.0;break;
            case 'u':
            case 'U':
                        System.out.print("Science & Tech or Others(S/O)");
                        String US = input.next();
                        char UStudy = US.charAt(0);
                        input.close();
                        switch (UStudy) {
                            case 'S':
                            case 's':Fees = 6500.0;break;
                            case 'O':
                            case 'o':Fees = 5500.0;break;
            }
        }
        System.out.printf("College Fees : RM%.2f",Fees);
    }
}
