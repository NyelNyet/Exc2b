package Fun;

public class Character {
    private String name;
    private double health;
    private double PhysAtk;
    private double PhysDef;

    public Character(String name, double health, double PhysAtk, double PhysDef){

        this.name = name;
        this.health = health;
        this.PhysAtk = PhysAtk;
        this.PhysDef = PhysDef;

    }

    public String getName(){
        return this.name;
    }

    public double getHealth(){
        return this.health;
    }

    public double getPhysAtk(){
        return this.PhysAtk;
    }

    public double getPhysDef(){
        return this.PhysDef;
    }
}
