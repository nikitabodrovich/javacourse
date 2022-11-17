package day11.Task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;
    protected final int ORDERS_TO_BONUS = 10000;
    protected final int WORKER_ORDERS_TO_BONUS = 1000;


    public int getCountPickedOrders(){
        return countPickedOrders;
    }
    public int getCountDeliveredOrders(){
        return countDeliveredOrders;
    }
    public String toString(){
        return "количество собранных заказов: "+getCountPickedOrders()+"; количество доставленных заказов: "+getCountDeliveredOrders();
    }
    public void plusPicked(){
       countPickedOrders++;
    }
    public void plusDelivered(){
        countDeliveredOrders++;
    }
}
