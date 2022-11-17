package day11.Task2;

public class Shaman extends Hero implements Healer, MagicAttack {
    private final int SELF_HEAL = 50;
    private final int TEAMMATE_HEAL = 30;
    private int magicAtt = 15;
    public Shaman(){
        physDef = 20;
        magicDef = 20;
        physAtt = 10;
    }
    @Override
    public void magicalAttack(Hero hero) {
        int magicAttValue = magicAtt-(magicAtt*hero.magicDef/100);
        if (hero.health-magicAttValue < MIN_HEALTH){
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= magicAttValue;
        }
    }
    @Override
    public void healHimself(){
        if (health+SELF_HEAL > MAX_HEALTH){
            health = MAX_HEALTH;
        } else {
            health +=SELF_HEAL;
        }
    }
    @Override
    public void healTeammate(Hero hero){
        if (hero.health+TEAMMATE_HEAL>MAX_HEALTH){
            hero.health = MAX_HEALTH;
        } else {
            hero.health+=TEAMMATE_HEAL;
        }
    }
    @Override
    public String toString(){
        return "Shaman{health="+health+"}";
    }


}
