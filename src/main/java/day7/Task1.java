package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Russia", 2016, 150, 2000);
        Airplane airplane2 = new Airplane("USA", 2015, 170, 1890);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}