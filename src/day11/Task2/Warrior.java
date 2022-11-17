package day11.Task2;

public class Warrior extends Hero {

    public Warrior(){
        physDef = 80;
        magicDef = 0;
        physAtt = 30;
    }
    @Override
    public String toString(){
        return "Warrior{health="+health+"}";
    }

}
