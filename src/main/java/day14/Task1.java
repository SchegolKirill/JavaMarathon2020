package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)  {
        File file = new File("test");
        printSumDigits(file);
    }



    public static void printSumDigits(File file){
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            int[] numbers = new int[10];
            int sum = 0;

            if(numbersString.length != 10) {
                throw new IllegalArgumentException();
            }

            for(String number : numbersString) {
                sum += Integer.parseInt(number);
            }

            System.out.println(sum);
            scanner.close();
        }

        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");;
        }
        catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }

    }
}
