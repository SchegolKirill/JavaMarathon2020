package day8;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;
    private int forUp;


    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }
    public void info(){
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }
    public void fillUp(int forUp) {
        fuel = fuel + forUp;
    }
    public int getFuel() {
        return fuel;
    }
    public void setYear(int year){
        this.year = year;
    }
    int getYear(){
        return year;
    }
    public void setLength(int length){
        this.length = length;
    }
    int getLength(){
        return length;
    }
    public String toString() {
        return "Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel;
    }
}
