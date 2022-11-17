package day11.Task2;

public class Magician extends Hero implements MagicAttack {
    private int magicAtt = 20;
    public Magician(){
        physDef = 0;
        magicDef = 80;
        physAtt = 5;
    }
    @Override
    public void magicalAttack(Hero hero){
        int magicAttValue = magicAtt-(magicAtt*hero.magicDef/100);
        if (hero.health-magicAttValue < MIN_HEALTH){
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= magicAttValue;
        }

    }
    @Override
    public String toString(){
        return "Magician{health="+health+"}";
    }

}
