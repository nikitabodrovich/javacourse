package day6;

class Car {
    private String model;
    private String color;
    private int manufactureYear;

    int yearDifference(int inputYear){
        int years = Math.abs(inputYear - manufactureYear);
        return years;
    }
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
    void info(){
        System.out.println("Это автомобиль");
    }

}