package day4;

import java.util.Random;
public class D4Ex2 {
    public static void main(String[] args){
        Random ran = new Random();
        int [] array = new int[100];
        for (int i = 0; i<array.length; i++){
            array[i] = ran.nextInt(10000);
        }
        int max = array[0];
        int min = array[99];
        int el10 = 0;
        int sum = 0;
        for (int element: array){
            if (element>max) {
                max = element;
            }
            if (element<min){
                min = element;
            }
            if (element%10 == 0){
                el10++;

            }
            if (element%10 ==0){
                sum = element+sum;
            }
        }
        System.out.println("Наибольший: "+max);
        System.out.println("Наименьший: "+min);
        System.out.println("Делятся на 10: "+el10);
        System.out.println("Сумма тех, что делятся на 10: "+sum);


    }

}
