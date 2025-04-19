package Fun;

public class Enemy extends Character implements Attack{
    private static String[] enemyInfo = getDefault();
    public Enemy(){
        super(
            enemyInfo[0],
            Double.parseDouble(enemyInfo[1]),
            Double.parseDouble(enemyInfo[2]),
            Double.parseDouble(enemyInfo[3]));
    }

    private static String getEnemy(){
        double chance = Math.random()*100;
        return chance < 25 ? "Orc":"Goblin";
    }

    private static String[] getDefault(){
        String[] defVal = new String[4];
        defVal[0] = getEnemy();
        switch (defVal[0]) {
            case "Goblin":
            defVal[1]="50";
            defVal[2]="10";
            defVal[3]="5";
            break;

            case "Orc":
            defVal[1]="100";
            defVal[2]="20";
            defVal[3]="10";
            break;
        }
        return defVal;
    }
}
