package day5;

public class Task1 {
    public static void main(String[] args){
        Car car = new Car();
        car.setModel("Toyota Camry");
        car.setColor("Midnight Blue");
        car.setManufactureYear(2020);
        System.out.println("Модель автомобиля: "+car.getModel()+", Цвет: "+car.getColor()+", Год выпуска: "+car.getManufactureYear());

    }
}
class Car{
    private String model;
    private String color;
    private int manufactureYear;

    public void setModel(String carModel){
        model = carModel;
    }
    public String getModel(){
        return model;
    }
    public void setColor(String carColor){
        color = carColor;
    }
    public String getColor(){
        return color;
    }
    public void setManufactureYear(int carManufactureYear){
        manufactureYear = carManufactureYear;
    }
    public int getManufactureYear(){
        return manufactureYear;
    }

}