package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Red", "Java", 1980);
        System.out.println("Мотоцикл модели: " + motorbike.getModel());
        System.out.println("Мотоцикл цвета: " + motorbike.getColour());
        System.out.println("Мотоцикл цвета: " + motorbike.getYear());
    }
}
