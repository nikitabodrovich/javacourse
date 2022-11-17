package day11.Task1;

import java.security.PrivilegedAction;

public class Courier implements Worker {
    private int salary;
    private int isPayed;
    private Warehouse wh;
    private final int BONUS_PAYED = 50000;
    private final int ONE_ORDER_SALARY = 100;


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
        salary +=ONE_ORDER_SALARY;
    }
    @Override
    public void bonus(){
        if (wh.getCountDeliveredOrders()<wh.ORDERS_TO_BONUS|| getSalary()<salary*wh.WORKER_ORDERS_TO_BONUS) {
            System.out.println("Бонус пока не доступен");
        }
        if (isPayed>0) {
            System.out.println("Бонус уже был выплачен");
        } else  {
            isPayed+=BONUS_PAYED;
        }
    }

}
