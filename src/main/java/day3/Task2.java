package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        double dividend;
        double divisor;
        while(true) {
            dividend = scanner1.nextDouble();
            divisor = scanner1.nextDouble();
            if(divisor == 0) {
                break;
            }
            System.out.println(dividend / divisor);
        }

    }
}
