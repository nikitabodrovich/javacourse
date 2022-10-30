package day3;

import java.util.Scanner;
public class D3Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = new String();
        while (!city.equals("Stop")) {
            System.out.println("Введите город: ");
            city = scanner.nextLine();
            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                case "Stop":
                    System.out.println("Программа остановлена.");
                    break;
                default:
                    System.out.println("Неизвестная страна :(");
            }


        }
    }
}





