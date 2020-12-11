package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }
    public static double calculateRedPerimeter(Figure[] figures) {
        double sump = 0;
        for(int i = 0; i < figures.length; i++) {
            if (figures[i].getColor().equals("Red")) {
                sump = sump + figures[i].perimeter();
            }
        }
        return sump;
    }
    public static double calculateRedArea(Figure[] figures) {
        double suma = 0;
        for(int i = 0; i < figures.length; i++) {
            if (figures[i].getColor() == "Red") {
                suma = suma + figures[i].area();
            }
        }
        return suma;
    }

}
