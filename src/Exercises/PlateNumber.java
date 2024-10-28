package Exercises;

public class PlateNumber {
    public static void main(String[] args){

        char a1 = (char)(65 + (int)(Math.random() * 26));
        char a2 = (char)(65 + (int)(Math.random() * 26));
        char a3 = (char)(65 + (int)(Math.random() * 26));

        int n1 = (int)(Math.random() * 10) ;
        int n2 = (int)(Math.random() * 10) ;
        int n3 = (int)(Math.random() * 10) ;
        int n4 = (int)(Math.random() * 10) ;

        System.out.printf("%c%c%c%d%d%d%d",a1,a2,a3,n1,n2,n3,n4);
    }
}