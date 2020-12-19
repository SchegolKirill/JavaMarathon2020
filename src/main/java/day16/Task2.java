package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) throws FileNotFoundException{
        Random random = new Random();
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        PrintWriter pw1 = new PrintWriter("file1.txt");
        PrintWriter pw2 = new PrintWriter("file2.txt");
        Scanner scanner1 = new Scanner(file1);
        Scanner scanner2 = new Scanner(file2);
        for(int i = 0; i < 1000; i++) {
            pw1.print(random.nextInt(1000) + " ");
        }
        pw1.close();
        String line1 = scanner1.nextLine();
        String[] numbers = line1.split(" ");
        int sum = 0;
        int sum2 = 0;
        double average = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum = sum + Integer.parseInt(numbers[i]);
            if(i % 20 == 0) {
                average= (double) sum / 20;
                pw2.print(average + " ");
                sum = 0;
                sum2 += i;
            }
        }
        scanner1.close();
        pw2.close();
        scanner2.close();
        printResult(file2);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner3 = new Scanner(file);
        String line3 = scanner3.nextLine();
        String[] numbers3 = line3.split(" ");
        double sum3 = 0;
        double average3 = 0;
        for(String x : numbers3) {
            sum3 += Double.parseDouble(x);
        }
        average3 = sum3 / numbers3.length;
        System.out.println((int) average3);
    }
}
