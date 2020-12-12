package day11.task2;

public class Warrior extends Hero implements PhysAttack{
    private double physAtt;

    public Warrior() {
        setHealth(100);
        setPhysDef(80);
        setMagicDef(0);
        physAtt = 30;
    }

    public double getPhysAtt() {
        return physAtt;
    }


    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (physAtt - ((physAtt * hero.getPhysDef()) / 100)));
        if(hero.getHealth() <= 0) {
            hero.setHealth(0);
        }
    }

    @Override
    public String toString() {
        return "HP = " + getHealth() + ", PhysDef = " + getPhysAtt() + ", MagicDef = " + getMagicDef() + ", PhysDamage = " + getPhysAtt();
    }
}
