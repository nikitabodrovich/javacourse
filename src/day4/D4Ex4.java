package day4;

import java.util.Random;
public class D4Ex4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10000);
        }
        int maxSum = 0;
        int maxSumIdx = 0;
        for (int i = 0; i < array.length-2; i++) {
            int sum = 0;
            for (int j = i; j<i+3; j++){
                sum += array[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIdx = i;
            }
        }


        System.out.println("суммы 3х элементов: " + maxSum);
        System.out.println("индекс первого элемента тройки: " + maxSumIdx);


    }
}
