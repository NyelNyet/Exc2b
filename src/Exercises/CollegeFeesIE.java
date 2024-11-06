package Exercises;
import java.util.Scanner;
public class CollegeFeesIE {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Double Fees=0.0;

        System.out.print("Type of Study?(U/P)");
        String S = input.next();

        char Study = S.charAt(0);

        if((Study=='U') || (Study=='u')){
            System.out.print("Science & Tech or Others(S/O)");
            String US = input.next();
            char UStudy = US.charAt(0);
            input.close();
            if((UStudy=='S') || (UStudy=='s')){
                Fees = 6500.0;
            }else if((UStudy=='O') || (UStudy=='o')){
                Fees = 5500.0;
            }
        }else if((Study=='P') || (Study=='p')){
            Fees = 8000.0;
        }
        System.out.printf("College Fees : RM%.2f",Fees);
    }
}