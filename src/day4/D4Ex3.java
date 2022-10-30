package day4;

import java.util.Random;
public class D4Ex3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] array = new int[12][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(50);
            }
        }
        int maxSum = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum = array[i][j]+sum;
                }
            if (sum>=maxSum){
                maxSum = sum;
                index = i;
            }

        }
        System.out.println("Индекс строки с максимальной суммой чисел: "+index);

    }
}
