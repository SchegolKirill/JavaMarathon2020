package day11.task2;

public abstract class Hero {
    private double health;
    private double physDef;
    private double magicDef;

    public void setHealth(double health) {
        this.health = health;
    }

    public double getHealth() {
        return health;
    }

    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }

    public double getPhysDef() {
        return physDef;
    }

    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    public double getMagicDef() {
        return magicDef;
    }
}