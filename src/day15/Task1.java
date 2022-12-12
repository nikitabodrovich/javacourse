package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("resources\\shoes.csv");
        File missingShoes = new File("resources\\missing_shoes");
        try {
            Scanner scanner = new Scanner(file);
            PrintWriter pw = new PrintWriter(missingShoes);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] shoesArray = line.split(";");
                if (Integer.parseInt(shoesArray[2]) == 0) {
                    pw.println(shoesArray[0] + "; "+shoesArray[1]+"; "+shoesArray[2]);
                }
            }
            scanner.close();
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}