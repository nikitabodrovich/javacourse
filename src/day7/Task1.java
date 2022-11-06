package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("The Boeing Company", 1998, 100, 50000);
        Airplane plane2 = new Airplane("The Boys Company", 2008, 100, 50000);
        Airplane.compareAirplanes(plane1,plane2);
    }
}
