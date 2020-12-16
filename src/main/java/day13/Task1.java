package day13;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        User u1 = new User("user1");
        User u2 = new User("user2");
        User u3 = new User("user3");

        u1.sendMessage(u2, "salampopolam");
        u1.sendMessage(u2, "kak jizn'?");

        u2.sendMessage(u1, "assalam bratishka");
        u2.sendMessage(u1, "che kak sam?");

        u3.sendMessage(u1, "zdarova");
        u3.sendMessage(u1, "che delaete?");
        u3.sendMessage(u1, "spice bush?");

        u1.sendMessage(u3, "eeeee neee");
        u1.sendMessage(u3, "vibros' etu dich");
        u1.sendMessage(u3, "ya tol'ko nasvay kidayu da");

        u3.sendMessage(u1, "ti che dyadya");

        MessageDatabase.showDialog(u1, u3);
    }
}
