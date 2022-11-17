package day11.Task2;

public class Paladin extends Hero implements Healer {
    private final int SELF_HEAL = 25;
    private final int TEAMMATE_HEAL = 10;

    public Paladin(){
        physDef = 50;
        magicDef = 20;
        physAtt = 15;
    }
    @Override
    public void healHimself(){
        if (health+SELF_HEAL>MAX_HEALTH){
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
        return "Paladin{health="+health+"}";
    }

}
