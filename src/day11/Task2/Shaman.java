package day11.Task2;

public class Shaman extends Hero implements Healer, MagicAttack {


    public Shaman(){
    super(20, 20, 10, 15);

    }
    @Override
    public void magicalAttack(Hero hero) {
        hero.health -=magicAtt-magicAtt*hero.magicDef/100;
        if (hero.health<MIN_HEALTH){
            hero.health = 0;
        }
    }
    @Override
    public void healHimself(){
        health +=50;
        if (health>MAX_HEALTH){
            health = 100;
        }
    }
    @Override
    public void healTeammate(Hero hero){
        hero.health+=30;
        if (hero.health>MAX_HEALTH){
            hero.health = 100;
        }
    }
    @Override
    public String toString(){
        return "Shaman{health="+health+"}";
    }


}
