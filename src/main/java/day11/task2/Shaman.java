package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    private double physAtt;
    private double magicAtt;

    public Shaman() {
        setHealth(100);
        setPhysDef(20);
        setMagicDef(20);
        physAtt = 10;
        magicAtt = 15;
    }

    public double getPhysAtt() {
        return physAtt;
    }

    public double getMagicAtt() {
        return magicAtt;
    }

    @Override
    public void healHimslef() {
        setHealth(getHealth() + 50);
        if(getHealth() >= 100) {
            setHealth(100);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(getHealth() + 30);
        if(hero.getHealth() >= 100) {
            hero.setHealth(100);
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
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (physAtt - ((physAtt * hero.getPhysDef()) / 100)));
        if(hero.getHealth() <= 0) {
            hero.setHealth(0);
        }
    }

    @Override
    public String toString() {
        return "HP = " + getHealth() + ", PhysDef = " + getPhysAtt() + ", MagicDef = " + getMagicDef() + ", PhysDamage = " + getPhysAtt() + ", MagicDamage = " + getMagicAtt();
    }
}
