package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test");
        printResult(file);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        double average = 0;
        int sum = 0;
        for(String number : numbers) {
            sum = sum + Integer.parseInt(number);
        }
        average = (double) sum / numbers.length;
        System.out.print(average + " --> ");
        System.out.printf("%.3f", average);
    }
}

