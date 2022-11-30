package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addNumbers(0,30,list);
        addNumbers(300,350,list);
        addNumbers(400,430,list);
        addNumbers(500,550,list);
        addNumbers(620,690,list);
        addNumbers(780,910,list);
        addNumbers(1000,1030,list);
        addNumbers(1130,1300,list);
        addNumbers(1350,1530,list);
        addNumbers(1600,1750,list);
    }

    public static void addNumbers(int a, int b, List<Integer> someList){
            for (int i=a; i<=b; i++){
                if (i%2 == 0){
                    someList.add(i);
                }
            }
        System.out.println(someList);
    }

}
