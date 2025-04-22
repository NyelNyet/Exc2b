package Fun;

import java.util.Scanner;

public class Player extends Character implements Attack{

    private static String[] playerInfo = insertPlayerInfo();

    public Player(){
        super(playerInfo[0],
        Double.parseDouble(playerInfo[1]),
        Double.parseDouble(playerInfo[2]),
        Double.parseDouble(playerInfo[3]));
    }

    private static String[] insertPlayerInfo(){
        String[] cls = new String[4];
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        cls[0] = inp.next();

        System.out.println("\n1.Warrior "
        +"\n2.Mage");

        System.out.println("Choose your class: ");
        
        switch (inp.nextInt()) {
            case 1:
            cls[1] = "100";
            cls[2] = "20";
            cls[3] = "10";
            break;

            case 2:
            cls[1] = "75";
            cls[2] = "10";
            cls[3] = "5";
            break;

            default:System.out.println("No such option! Default will automatically");break;
        }

        inp.close();
        return cls;
    }
}
