package Fun;

import java.util.Scanner;

public class Player extends Character implements Attack{

    private String pClass;

    public Player(){
        super(insertName(),0,0,0);
    }

    private static String insertName(){
        System.out.println("Please enter your name: ");
        Scanner inp = new Scanner(System.in);
        return inp.next();
    }

    
}
