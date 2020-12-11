package day11.task2;

import java.lang.ref.PhantomReference;

public class Warrior extends Hero implements PhysAttack{
    private int physAtt;

    public Warrior() {
        setHealth(100);
        setPhysDef(80);
        setMagicDef(0);
        physAtt = 30;
    }


    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (physAtt - (physAtt * hero.getPhysDef())));
    }
}
