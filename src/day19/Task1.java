package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        File file = new File("resources\\dushi.txt");
        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");

            while (scanner.hasNext()){
                String line = scanner.next();
                for (String word: line.split(" ")){
                    if (!map.containsKey(word)){
                        map.put(word, 1);
                    } else {
                        map.put(word, map.get(word)+1);
                    }
                }
            }
            scanner.close();

            for (int i = 0; i<100; i++){
                int maxMapValue = Collections.max(map.values());
                Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
                while (iterator.hasNext()){
                    Map.Entry<String, Integer>  entry = iterator.next();
                    if (entry.getValue() == maxMapValue){
                        System.out.println(entry.getKey()+" : "+ entry.getValue());
                        iterator.remove();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("file not founded :c");
        }
    }
}
