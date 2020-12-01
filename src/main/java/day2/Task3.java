package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);
        int c = scanner2.nextInt();
        int d = scanner2.nextInt();
        if(c >= d) {
            System.out.println("Некорректный ввод");
        }
        int z = c + 1;
        while(z < d) {
            if(z % 5 == 0 && z % 10 != 0){
                System.out.print(z + " ");
            }
            z++;
        }
    }
}
