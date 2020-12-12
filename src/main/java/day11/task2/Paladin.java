package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    private double physAtt;

    public Paladin() {
        setHealth(100);
        setPhysDef(50);
        setMagicDef(20);
        physAtt = 15;
    }

    public double getPhysAtt() {
        return physAtt;
    }

    @Override
    public void healHimslef() {
        setHealth(getHealth() + 25);
        if(getHealth() >= 100) {
            setHealth(100);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 10);
        if(hero.getHealth() >= 100) {
            hero.setHealth(100);
        }
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
