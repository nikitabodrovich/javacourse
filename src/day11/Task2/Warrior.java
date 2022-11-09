package day11.Task2;

public class Warrior extends Hero {

    public Warrior(){
        super(80, 0, 30, 0);
    }
    @Override
    public String toString(){
        return "Warrior{health="+health+"}";
    }

}
