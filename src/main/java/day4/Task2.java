package day4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arr1 = new int[100];
        Random random1 = new Random();
        for(int i = 0; i < 100; i++) {
            arr1[i] = random1.nextInt(10000);
        }
        System.out.println(Arrays.toString(arr1));
        int min = arr1[0];
        for(int x: arr1) {
            if(x < min) {
                min = x;
            }
        }
        int max = arr1[0];
        for(int y: arr1) {
            if(y > max) {
                max = y;
            }
        }
        int sum0 = 0;
        int sum00 = 0;
        for(int z: arr1) {
            if(z % 10 ==0) {
                sum0++;
                sum00 = sum00 + z;
            }
        }
        System.out.println();
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum0);
        System.out.println(sum00);
    }
}
