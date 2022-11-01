package day6;

public class Task1 {
    public static void main(String[] args) {
        Car camry = new Car();
        camry.setModel("Toyota Camry");
        camry.setColor("Midnight Blue");
        camry.setManufactureYear(2020);
        int yearCamry = camry.yearDifference(2022);
        camry.info();
        System.out.println("Разница между введённым годом и годом производства: "+yearCamry);
        Motorbike yamaha = new Motorbike("Yamaha Ы-1337", "Pink gold", 1992);
        int yearYamaha = yamaha.yearDifference(2027);
        yamaha.info();
        System.out.println("Разница между введённым годом и годом производства: "+yearYamaha);
    }
}
