package day11.Task2;

public abstract class Hero implements PhysAttack {
    protected final int MAX_HEALTH = 100;
    protected final int MIN_HEALTH = 0;
    protected int health;
    protected int physAtt;
    protected int physDef;
    protected int magicDef;
    protected int magicAtt;

    public Hero(int physDef, int magicDef, int physAtt, int magicAtt) {
        this.health = 100;
        this.physDef = physDef;
        this.magicDef = magicDef;
        this.physAtt = physAtt;
        this.magicAtt = magicAtt;
    }


    @Override
    public void physicalAttack(Hero hero) {
        hero.health -=physAtt-physAtt*hero.physDef/100;
        if (hero.health<MIN_HEALTH){
            hero.health = 0;
        }
    }
}