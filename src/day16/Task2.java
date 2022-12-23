package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Random random = new Random();
        try {
            File file1 = new File("file1.txt");
            PrintWriter pw1 = new PrintWriter(file1);
            File file2 = new File("file2.txt");

            for (int i = 0; i < 1000; i++){
                pw1.print(random.nextInt(100)+" ");
            }
            pw1.close();

            PrintWriter pw2 = new PrintWriter(file2);
            Scanner scanner = new Scanner(file1);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] numbersArray = line.split(" ");
                int sum = 0;
                int counter = 0;
                for (int i = 0; i<numbersArray.length; i++){
                    sum += Integer.parseInt(numbersArray[i]);
                    counter++;

                    if (counter == 20){
                        double average = (double)sum/counter;
                        pw2.print(average+" ");
                        counter = 0;
                        sum = 0;
                    }
                }
            }
            pw2.close();
            scanner.close();
            printResult(file2);


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
    public static void printResult(File file){
        try {
            Scanner scanner1 = new Scanner(file);
            while (scanner1.hasNextLine()) {
                String fileNumbers = scanner1.nextLine();
                String[] fileNumbersArray = fileNumbers.split(" ");
                double fileNumbersSum = 0;
                for (String fileNumber: fileNumbersArray){
                    fileNumbersSum += Double.parseDouble(fileNumber);
                }
                System.out.println((int)fileNumbersSum);
            }

            scanner1.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
