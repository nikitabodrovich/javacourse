package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("someFile");
        printResult(file);
    }
    public static void printResult(File file){
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersArray = line.split(" ");
            int counter = 0;
            int sumNumbers = 0;
            for (String number: numbersArray){
                counter++;
                sumNumbers+= Integer.parseInt(number);
            }
            double average = (double)sumNumbers/counter;
            scanner.close();
            System.out.printf(average+" ----> "+"%.3f", average);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
