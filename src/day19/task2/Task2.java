package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Task2 {
        public static void main(String[] args) {
            Map<Integer, Point> map = new HashMap<>();
            File file = new File("resources\\taxi_cars.txt");
            try {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()){
                    String line = scanner.nextLine();
                    String[] carsArray = line.split(" ");
                    for (String car: carsArray){
                        map.put(Integer.parseInt(carsArray[0]), new Point(Integer.parseInt(carsArray[1]), Integer.parseInt(carsArray[2])));
                    }
                }
                scanner.close();

                Scanner inputValues = new Scanner(System.in);
                System.out.println("Координаты первой точки x1,y1:");
                int x1 = inputValues.nextInt();
                int y1 = inputValues.nextInt();
                System.out.println("Координаты второй точки x2,y2:");
                int x2 = inputValues.nextInt();
                int y2 = inputValues.nextInt();


                System.out.println("Машины в квадрате: ");
                for (Map.Entry<Integer, Point> entry: map.entrySet()){
                    if (entry.getValue().getX() < x1 && entry.getValue().getX() > x2 &&
                            entry.getValue().getY() > y1 && entry.getValue().getY() < y2){
                        System.out.print(entry.getKey()+" ");
                    }
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException("file not founded");
            }
        }
    }

