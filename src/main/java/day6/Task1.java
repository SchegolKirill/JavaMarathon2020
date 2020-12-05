package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2015);
        car.info();
        System.out.println("Автомобилю " + car.yearDifference(2020) + " лет");
        Motorbike motorbike = new Motorbike("Green", "Java", 1930);
        motorbike.info();
        System.out.println("Мотоциклу " + motorbike.yearDifference(2020) + " лет");
    }
}
