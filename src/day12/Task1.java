package day12;

import javax.xml.xpath.XPathVariableResolver;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> autos = new ArrayList<>();
        autos.add("BMW");
        autos.add("Mercedes");
        autos.add("Audi");
        autos.add("Opel");
        autos.add("Volkswagen");
        System.out.println(autos);

        autos.add(3,"Toyota");
        autos.remove(0);
        System.out.println(autos);
    }



}
