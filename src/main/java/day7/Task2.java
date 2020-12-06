package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player player1 = new Player(1   );
        /*Player player2 = new Player(random.nextInt(100) + 90);
        Player player3 = new Player(random.nextInt(100) + 90);
        Player player4 = new Player(random.nextInt(100) + 90);
        Player player5 = new Player(random.nextInt(100) + 90);
        Player player6 = new Player(random.nextInt(100) + 90);*/

        Player.info();
        System.out.println(Player.getCountPlayers());
        System.out.println(player1.getStamina());
        /*for(int i = player1.getStamina(); i > 0; i--) {
            player1.run();
            System.out.println(player1.getStamina());
        }*/
        while (player1.getStamina() > 0) {
            player1.run();
            System.out.println(player1.getStamina());
        }
        Player.info();
        System.out.println(Player.getCountPlayers());
    }
}
