package day7;

public class Airplane {
    private String manufacturer;
    private int length;
    private int year;
    private int weight;
    private int fuel;


    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setLength(int length){
        this.length = length;
    }
    public int getLength(){return length;}
    public void setWeight(int weight){
        this.weight = weight;
    }
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
    public int getFuel(){
        return fuel;
    }
    public Airplane(String manufacturer, int year, int length, int weight){
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }
    public void fillUp(int n){
        fuel = this.fuel+n;
    }
    void info() {
        System.out.println("Изготовитель: "+manufacturer+", Длина: "+length+", Вес: "+weight+", Количество топлива в баке: "+fuel);
    }

    public static void compareAirplanes(Airplane p1,Airplane p2){
        if (p1.getLength() < p2.getLength()) {
            System.out.println("Второй самолёт длиннее");
        } else if (p1.getLength()>p2.getLength()){
            System.out.println("Первый самолёт длиннее");
        } else {
            System.out.println("Самолёты равны");
        }
    }
}
