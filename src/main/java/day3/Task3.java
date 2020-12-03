package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);
        double dividend2;
        double divisor2;
        /*int i = 0;
        while(i < 5) {
            dividend2 = scanner2.nextDouble();
            divisor2 = scanner2.nextDouble();
            if (divisor2 == 0){
                System.out.println("Деление на 0");
            }
            if(divisor2 != 0){
                System.out.println(dividend2 / divisor2);
            }
            i++;
        }*/
        for(int i = 0; i < 5; i++) {
            dividend2 = scanner2.nextDouble();
            divisor2 = scanner2.nextDouble();
            if (divisor2 == 0){
                System.out.println("Деление на 0");
                continue;
            }
                System.out.println(dividend2 / divisor2);
        }
    }
}
