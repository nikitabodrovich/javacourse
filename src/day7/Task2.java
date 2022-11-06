package day7;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Player player1 = new Player(rand.nextInt(100-89)+90);
        Player player2 = new Player(rand.nextInt(100-89)+90);
        Player player3 = new Player(rand.nextInt(100-89)+90);
        Player player4 = new Player(rand.nextInt(100-89)+90);
        Player player5 = new Player(rand.nextInt(100-89)+90);
        Player player6 = new Player(rand.nextInt(100-89)+90);
        Player.info();
        Player player7 = new Player(rand.nextInt(100-89)+90);
        Player player8 = new Player(rand.nextInt(100-89)+90);
        Player.info();
        while (player3.getStamina()>0){
            player3.run();
        }
        System.out.println("Игрок выбыл...:с");
        Player.info();

    }
}
