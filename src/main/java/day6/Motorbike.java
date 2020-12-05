package day6;

public class Motorbike {
    private String colour;
    private String model;
    private int year;
    private int age;

    public Motorbike(String colour, String model, int year){
        this.colour = colour;
        this.model = model;
        this.year = year;
    }
    public String getColour() {
        return colour;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public void info() {
        System.out.println("Это мотоцикл");
    }
    public int yearDifference(int yd) {
        int age = year - yd;
        return age;
    }
}
