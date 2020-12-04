package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Random random = new Random();
        int[] arr = new int[n];
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
            if (arr[i] > 8) {
                sum1++;
            }
            if (arr[i] == 1) {
                sum2++;
            }
            if (arr[i] % 2 == 0) {
                sum3++;
            }
            else {
                sum4++;
            }
            sum5 = sum5 + arr[i];
        }
        System.out.println("\nДлина массива: " + arr.length);
        System.out.println("Количество чисел больше 8: " + sum1);
        System.out.println("Количество чисел равных 1: " + sum2);
        System.out.println("Количество четных чисел: " + sum3);
        System.out.println("Количество нечетных чисел: " + sum4);
        System.out.println("Сумма всех элементов массива: " + sum5);
    }
}
