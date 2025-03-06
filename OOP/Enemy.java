

public class Enemy {
    public int health;
    private int mana;

    public void Talk() {
        System.out.println("I'm an enemy. You better run!");
    }

    public void getMana(){
        System.out.println("Mana :"+mana);
    }

    public void setMana(int x){
        mana = x;
    }
}
