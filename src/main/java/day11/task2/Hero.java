package day11.task2;

import java.net.http.HttpRequest;

public abstract class Hero {
    private int health;
    private int physDef;
    private int magicDef;

    public Hero() {
        this.health = health;
        this.physDef = physDef;
        this.magicDef = magicDef;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setPhysDef(int physDef) {
        this.physDef = physDef;
    }

    public int getPhysDef() {
        return physDef;
    }

    public void setMagicDef(int magicDef) {
        this.magicDef = magicDef;
    }

    public int getMagicDef() {
        return magicDef;
    }
}


