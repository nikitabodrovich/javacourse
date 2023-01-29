package day18;

public class Task2 {
    public static void main(String[] args) {

        System.out.println(count7(2347756));
    }
    public static int count7(int a){
        if (a == 0){
            return 0;
        }
        if (a%10 == 7)
            return 1+count7(a/10);

        return count7(a/10);

    }
}
