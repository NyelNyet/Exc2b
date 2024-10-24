package Exercises;

public class PlateNumber {
    public static void main(String[] args){
        int x = 65 + (int)(Math.random() * 26);
        System.out.println(x);
        char a1 = (char)x;
        char a2 = (char)x;
        char a3 = (char)x;

        System.out.println(a1+a2+a3);
    }

}
