package day5;

public class Car {
    private String colour;
    private String model;
    private int year;

    public void setColour(String carColour) {
        if(carColour.isEmpty()) {
            System.out.println("Нужно ввести цвет автомобиля");
        }
        else {
            colour = carColour;
        }
    }
    public String getColour(){
        return colour;
    }
    public void setModel(String carModel) {
        if(carModel.isEmpty()) {
            System.out.println("Нужно ввести модель автомобиля");
        }
        else {
            model = carModel;
        }
    }
    public String getModel() {
        return model;
    }
    public void setYear(int carYear) {
        if(carYear < 0) {
            System.out.println("Год выпуска должен быть больше 0");
        }
        else {
            year = carYear;
        }
    }
    public int getYear() {
        return year;
    }
}
