package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    private double physAtt;
    private double magicAtt;
    public Magician() {
        setHealth(100);
        setPhysDef(0);
        setMagicDef(80);
        physAtt = 5;
        magicAtt = 20;
    }

    public double getPhysAtt() {
        return physAtt;
    }

    public double getMagicAtt() {
        return magicAtt;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (physAtt - ((physAtt * hero.getPhysDef()) / 100)));
        if(hero.getHealth() <= 0) {
            hero.setHealth(0);
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (magicAtt - ((magicAtt * hero.getMagicDef()) / 100)));
        if(hero.getHealth() <= 0) {
            hero.setHealth(0);
        }
    }

    @Override
    public String toString() {
        return "HP = " + getHealth() + ", PhysDef = " + getPhysAtt() + ", MagicDef = " + getMagicDef() + ", PhysDamage = " + getPhysAtt() + ", MagicDamage = " + getMagicAtt();
    }
}
