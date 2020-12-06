package day7;

import com.sun.xml.bind.v2.runtime.output.SAXOutput;

public class Player {
    private int stamina;
    public static final int MIN_STAMINA = 0;
    public static final int MAX_STAMINA = 100;
    public static int countPlayers = 0;
    public static final int MAX_PLAYERS = 6;

    public Player(int stamina) {
        this.stamina = stamina;
        if(countPlayers <6){
            countPlayers++;
        }
    }
    public void run() {
        if (stamina > 0) {
            stamina--;
            if (stamina == 0) {
                countPlayers--;
                stamina = MIN_STAMINA;
            }
        }/*else if (stamina > 0) {
            stamina--;
        }*/
        /*if(stamina == 0) {
            countPlayers--;
            stamina = MIN_STAMINA;
        }
        stamina--;
*/
    }
    public int getStamina() {
        return stamina;
    }
    public static int getCountPlayers() {
        return countPlayers;
    }
    public static void info() {
        if(countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        }
        else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
