package Fun;

public class Main {
    public static void main(String[] args) {
        Character e1 = new Enemy();
        Character p1 = new Player();

        System.out.println(p1.getName()+" is encountering "+e1.getName()+"!");
        System.out.println(
            "Health: "+e1.getHealth()+
            "\nPhysical Def: "+e1.getPhysDef()+
            "\nPhycial Atk: "+e1.getPhysDef());
    }


    

    

}
