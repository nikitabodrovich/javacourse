package day6;

public class Task2 {
    public static void main(String[] args){
    Airplane plane = new Airplane("The Boeing Company", 1998, 50, 50000);
    plane.setYear(2006);
    plane.setLength(60);
    plane.fillUp(500);
    plane.fillUp(200);
    plane.info();
    }
}
