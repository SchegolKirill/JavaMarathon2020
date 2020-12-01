package day2;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner3 = new Scanner(System.in);
        double x = scanner3.nextInt();
        double y;
        if(x >= 5) {
            System.out.println(y = ((pow(x, 2) - 10)/(x +7)));
        }
        else if (x > -3 && x < 5) {
            System.out.println(y = ((x + 3)*(pow(x, 2) - 2)));
        }
        else {
            System.out.println(y = 420);
        }
    }
}
