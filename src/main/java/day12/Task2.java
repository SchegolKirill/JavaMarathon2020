package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= 30; i++) {
            list.add(i);
        }
        for(int i = 500; i >= 350; i--) {
            list.add(31, i);
        }
        System.out.println(list);
    }
}
