package day11.Task1;

import day11.Task1.Warehouse;
import day11.Task1.Worker;

public class Picker implements Worker {
    private int salary;
    private int isPayed;
    private Warehouse wh;
    private final int BONUS_PAYED = 70000;
    private final int ONE_ORDER_SALARY = 80;

    public Picker(int salary, int isPayed, Warehouse wh) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.wh = wh;
    }

    public int getSalary() {
        return salary;
    }

    public int getIsPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "ЗП: " + getSalary() + "₸, Бонус: " + getIsPayed()+"₸";
    }

    @Override
    public void doWork() {
        wh.plusPicked();
        salary += ONE_ORDER_SALARY;
    }

    @Override
    public void bonus() {
        if (wh.getCountPickedOrders() < wh.ORDERS_TO_BONUS || getSalary()<salary*wh.WORKER_ORDERS_TO_BONUS) {
            System.out.println("Бонус пока не доступен");

        }
        if (isPayed>0) {
            System.out.println("Бонус уже был выплачен");
        } else  {
            isPayed+=BONUS_PAYED;
        }
    }
}
