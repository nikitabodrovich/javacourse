package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 20001; i++) {
            String str1 = " "+i;
            str += str1;
        }
        System.out.println(str);
        long stopTime = System.currentTimeMillis();


        long startTime1 = System.currentTimeMillis();
        StringBuilder string = new StringBuilder();
        for (int i=0; i<20001; i++){
            String string1 = " "+i;
            string.append(string1);
        }
        System.out.println(string);
        long stopTime1 = System.currentTimeMillis();
        System.out.println("Длительность работы конкатенации, в мс.: "+(stopTime - startTime));
        System.out.println("Длительность работы стрингбилдера, в мс.: "+(stopTime1 - startTime1));


    }
}
