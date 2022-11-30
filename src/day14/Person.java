package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;


    public static List<Person> parseFileToObjList(File file) {
        List<Person> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                Person person = new Person();
                String line = scanner.nextLine();
                String[] nameAge = line.split(" ");

                if (Integer.parseInt(nameAge[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                    person.name = nameAge[0];
                    person.age = Integer.parseInt(nameAge[1]);

                    list.add(person);
            }

        } catch(FileNotFoundException e){
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e){
            System.out.println("Некорретный входной файл");
        }
            return list;
    }
    public String toString(){
        return "{name='"+name+"', "+"year="+age+"}";
    }
}

