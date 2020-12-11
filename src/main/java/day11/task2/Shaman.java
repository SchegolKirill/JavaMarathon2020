package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer{
    private int physAttack;
    private int magicAttack;

    public Shaman(int health, int physDef, int magicDef, int physAttack, int magicAttack) {
        super(health, physDef, magicDef);
        this.physAttack = physAttack;
        this.magicAttack = magicAttack;
    }

    public int getPhysAttack() {
        return physAttack;
    }

    public int getMagicAttack() {
        return magicAttack;
    }

    @Override
    public void magicalAttack(Hero hero) {

    }

    @Override
    public void physicalAttack(Hero hero) {

    }

    @Override
    public void healHimself() {

    }

    @Override
    public void healTeammate(Hero hero) {

    }
}
