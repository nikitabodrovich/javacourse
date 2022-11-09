package day11.Task1;

public class Courier implements Worker {
    private int salary;
    private int isPayed;
    private Warehouse wh;
    private int plusDelivered;

    public Courier(int salary, int isPayed, Warehouse wh){
        this.wh = wh;
        this.salary = salary;
        this.isPayed = isPayed;
    }
    public int getSalary(){
        return salary;
    }
    public int getIsPayed(){
        return isPayed;
    }
    @Override
    public String toString(){
        return "ЗП: " + getSalary() + "₸, Бонус: " + getIsPayed()+"₸";
    }
    @Override
    public void doWork(){
        wh.plusDelivered();
        salary +=100;
    }
    @Override
    public void bonus(){
        if (wh.getCountDeliveredOrders()<10000 || getSalary()<salary*1000) {
            System.out.println("Бонус пока не доступен");
        }
        if (isPayed>0) {
            System.out.println("Бонус уже был выплачен");
        } else  {
            isPayed+=50000;
        }
    }

}
