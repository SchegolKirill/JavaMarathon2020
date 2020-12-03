package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random2 = new Random();
        int m = 12;
        int n = 8;
        int a = 0;
        int sumj = 0;
        int index = 0;
        int[][] arr2 = new int[m][n];
        for(int i = 0; i < m; i++) {
            System.out.println("Строка №" + i);
            for(int j = 0; j < n; j++){
                arr2[i][j] = random2.nextInt(50);
                sumj = sumj + arr2[i][j];

                System.out.print(arr2[i][j] + " ");
            }
            if(sumj > a) {
                a = sumj;
                index = i;
            }
            System.out.print("//       " + sumj);
            System.out.println();
            sumj = 0;
        }
        System.out.println("Максимальная сумма равна " + a);
        System.out.println("Максимальная сумма в строке с индексом " + index);
    }
}
