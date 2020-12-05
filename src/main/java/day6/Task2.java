package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Russia", 2000, 25, 10);
        airplane.setYear(2010);
        airplane.setLength(35);
        airplane.fillUp(1000);
        airplane.fillUp(1500);
        airplane.info();
    }
}
