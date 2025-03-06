

public class OOPst {
    public static void main(String[] args) {

        //Instance

        Enemy ali = new Enemy();
        ali.Talk();



        //Inheritance

        Ponti shima = new Ponti();
        shima.Talk();
        
        Hanraya boi = new Hanraya();
        boi.Talk();



        //Polymorphism

        Enemy e = boi;
        e.Talk();

        Enemy enemies[] = {shima,boi};
        enemies[0].Talk();
        enemies[1].Talk();



        //Encapsulation

        boi.health = 200;
        boi.setMana(50);
        System.out.println("Boi's health :"+boi.health);
        boi.getMana();
    }
}
