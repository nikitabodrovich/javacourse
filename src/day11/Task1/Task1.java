package day11.Task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse wh1 = new Warehouse();
        Picker p1 = new Picker(0, 0, wh1);
        Courier c1 = new Courier(0, 0, wh1);
        businessProcess(p1);
        businessProcess(c1);
        System.out.println("Первый склад: "+wh1);
        System.out.println("Сборщик1 "+p1+"/ Курьер1 "+c1);

        Warehouse wh2 = new Warehouse();
        Picker p2 = new Picker(0, 0, wh2);
        Courier c2 = new Courier(0, 0, wh2);
        p2.doWork();
        c2.doWork();
        System.out.println("Второй склад: "+wh2);
        System.out.println("Сборщик2 "+p2+"/ Курьер2 "+c2);
        System.out.println("Первый склад: "+wh1);
        System.out.println("Сборщик1 "+p1+"/ Курьер1 "+c1);



    }
    static void businessProcess(Worker worker){
        for (int i = 0; i<1000; i++){
            worker.doWork();
        }
        worker.bonus();
    }

}
