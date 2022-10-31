package day5;

public class Task2 {
    public static void main(String[] args) {
    Motorbike bike = new Motorbike("Harley-Davidson Pan America 1250", "Black",2017);
    System.out.println("Модель мотоцикла: "+bike.getModel()+", Цвет: "+bike.getColor()+", Год выпуска: "+bike.getManufactureYear());

    }
}
class Motorbike{
    private String model;
    private String color;
    private int manufactureYear;
    public Motorbike(String model, String color, int manufactureYear){
        this.model = model;
        this.color = color;
        this.manufactureYear = manufactureYear;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getManufactureYear(){
        return manufactureYear;
    }

}
