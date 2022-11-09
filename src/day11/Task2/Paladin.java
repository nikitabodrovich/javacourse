package day11.Task2;

public class Paladin extends Hero implements Healer {

    public Paladin(){
        super(50, 20, 15, 0);
    }
    @Override
    public void healHimself(){
        health +=25;
        if (health>MAX_HEALTH){
            health = 100;
        }

    }

    @Override
    public void healTeammate(Hero hero){
        hero.health+=10;
        if (hero.health>MAX_HEALTH){
            hero.health = 100;
        }
    }
    @Override
    public String toString(){
        return "Paladin{health="+health+"}";
    }

}
