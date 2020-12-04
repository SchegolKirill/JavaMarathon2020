package day5;

public class Motorbike {
    private String colour;
    private String model;
    private int year;
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
}
