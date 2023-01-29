package day18;


public class Task1 {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6};
        System.out.println(sum(numbers, 0));
    }
    public static int sum(int[] array, int i){
        if (i == array.length)
            return 0;
        return array[i]+sum(array, i+1);
    }
}


