package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addNumbers(300,350,list);
    }

    public static void addNumbers(int a, int b, List<Integer> someList){
        if (a==0 && b == 30){
            for (int i=0; i-1<30; i++){
                if (i%2 == 0){
                    someList.add(i);
                }
            }
            System.out.println(someList);

        } else if (a == 300 && b == 350){
            for (int j = 300; j-1<350; j++){
                if (j%2==0){
                    someList.add(j);
                }
            }
            System.out.println(someList);
        }
        else {
            System.out.println("Invalid interval");
        }
    }

}
