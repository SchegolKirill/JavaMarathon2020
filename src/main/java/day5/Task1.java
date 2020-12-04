package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColour("Grey");
        car1.setModel("Audi TT");
        car1.setYear(2017);
        System.out.println("Модель автомобиля: " + car1.getModel());
        System.out.println("Цвет автомобиля: " + car1.getColour());
        System.out.println("Год выпуска автомобиля: " + car1.getYear());
    }
}
