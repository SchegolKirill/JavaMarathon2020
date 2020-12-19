package day15.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("Z:\\JavaProjects\\JavaMarathon2020\\src\\main\\resources\\shoes.csv");
        File file2 = new File("missing_shoes.txt");
        List<String> missingShoes = new ArrayList<>();
        Scanner scanner = new Scanner(file1);
        PrintWriter pw = new PrintWriter(file2);

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] person = line.split(";");
            if(Integer.parseInt(person[2]) == 0) {
                pw.println(line);
            }
        }
        pw.close();
    }
}
