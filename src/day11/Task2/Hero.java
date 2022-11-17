package day11.Task2;

public abstract class Hero implements PhysAttack {
    protected final int MAX_HEALTH = 100;
    protected final int MIN_HEALTH = 0;
    protected int health;
    protected int physAtt;
    protected int physDef;
    protected int magicDef;

    public Hero() {
        health = 100;
    }


    @Override
    public void physicalAttack(Hero hero) {
        int attackValue = physAtt-(physAtt*hero.physDef/100);
        if (hero.health - attackValue<MIN_HEALTH){
            hero.health = MIN_HEALTH;
        } else {
            hero.health-=attackValue;
        }
    }
}