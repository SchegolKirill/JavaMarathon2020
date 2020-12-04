package day4;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] arr3 = new int[100000];
        Random random3 = new Random();
        int sum3 = 0;
        int index = 0;
        int max = 0;
        int indexmax = 0;
        int k = 50;
        for(int i = 0; i < arr3.length; i++) {
            arr3[i] = random3.nextInt(10000);
            //System.out.print(arr3[i] + " ");
        }
        while(index < arr3.length - 2){
            sum3 = arr3[index] + arr3[index+1] + arr3[index+2];
            index++;
            //System.out.println(sum3);
            if(sum3 > max) {
                max = sum3;
                indexmax = index;
            }
        }
        System.out.println(max);
        System.out.println(indexmax);

    }
}
