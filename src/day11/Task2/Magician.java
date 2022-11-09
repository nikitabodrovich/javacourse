package day11.Task2;

public class Magician extends Hero implements MagicAttack {

    public Magician(){
        super(0, 80, 5, 20);

    }
    @Override
    public void magicalAttack(Hero hero){
        hero.health -=magicAtt-magicAtt*hero.magicDef/100;
        if (hero.health<MIN_HEALTH){
            hero.health = 0;
        }

    }
    @Override
    public String toString(){
        return "Magician{health="+health+"}";
    }

}
