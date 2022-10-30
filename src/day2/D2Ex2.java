package day2;

import java.util.Scanner;
public class D2Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i < b; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.println(i);
                }
            }
        if(a>b){
            System.out.println("Некорректный ввод!");
        }
    }
}