package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class D4Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите размер массива: ");
        int arrayLength = scan.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Количество элементова в массиве: "+arrayLength);
        int counterMore8 = 0;
        int counterEq1 = 0;
        int counterEven = 0;
        int counterOdd = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8)
                counterMore8++;
            if (array[i] == 1)
                counterEq1++;
            if (array[i]%2 == 0)
                counterEven++;
            if (array[i]%2 != 0)
                counterOdd++;
            sum = array[i]+sum;
            }
        System.out.println("Элементов больше 8: "+counterMore8);
        System.out.println("Элементов, равных 1: "+counterEq1);
        System.out.println("Четных элементов: "+counterEven);
        System.out.println("Нечетных элементов: "+counterOdd);
        System.out.println("Сумма всех элементов массива: "+sum);

        }
}





