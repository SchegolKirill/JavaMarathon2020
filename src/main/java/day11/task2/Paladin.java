package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer{
    private int physAttack;

    public Paladin() {

        this.physAttack = physAttack;
    }

    public int getPhysAttack() {
        return physAttack;
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
