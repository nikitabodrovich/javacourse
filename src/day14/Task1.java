package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File someFile = new File("someFile");
        printSumDigits(someFile);
    }
    public static void printSumDigits(File file){
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            int[] numbers = new int[10];
            int counter = 0;
            int sumNumbers = 0;
            for (String number: numbersString){
            numbers[counter++] = Integer.parseInt(number);
            sumNumbers+=Integer.parseInt(number);
            }
            if (counter < 10){
                throw new IndexOutOfBoundsException();
            }
            System.out.println(sumNumbers);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Некорректный входной файл");
        }
    }

}
