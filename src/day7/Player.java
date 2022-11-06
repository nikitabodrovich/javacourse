package day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public int getCountPlayers() {
        return countPlayers;
    }

    void run() {
        if (stamina == 0) {
            return;
        }
        stamina--;

        if(stamina==0){
        countPlayers--;
        }
    }

    {
        countPlayers--;
    }



    static void info(){
        if (countPlayers<6){
            switch(countPlayers){
                case 5:
                    System.out.println("Команды неполные("+countPlayers+" чел.). На поле еще есть "+(6-countPlayers)+" свободное место");
            break;
                case 4:
                case 3:
                case 2:
                    System.out.println("Команды неполные("+countPlayers+" чел.). На поле еще есть "+(6-countPlayers)+" свободных места");
                    break;
                default:
                    System.out.println("Команды неполные("+countPlayers+"(чел.). На поле еще есть "+(6-countPlayers)+" свободных мест");
            }
        } else{
            System.out.println("На поле нет свободных мест("+countPlayers+"чел).");
        }
    }

}

