package Fun;

import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner userInp = new Scanner(System.in);
        int[] UI = new int[2];
        System.out.print("Please enter two numbers : ");
        UI[0] = userInp.nextInt();
        UI[1] = userInp.nextInt();

        System.out.println(findGCD(UI));
    }

    public static int findGCD(int[] UI){
        int tlow = Math.min(UI[0],UI[1]);
        int tmax = Math.max(UI[0],UI[1]);
        double temp = tmax;

        while(temp!=0){
            int divisor = (int)temp/tlow;
            temp /= divisor;
            int tempint = (int)temp;
            temp -= tempint;
            temp *= tlow;
        }
        return tlow;
    }
}
