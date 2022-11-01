package day6;

class Motorbike {
    private String model;
    private String color;
    private int manufactureYear;
    public Motorbike(String model, String color, int manufactureYear){
        this.model = model;
        this.color = color;
        this.manufactureYear = manufactureYear;
    }
    int yearDifference(int inputYear){
        int years = Math.abs(inputYear - manufactureYear);
        return years;
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
    void info(){
        System.out.println("Это мотоцикл");
    }
}
