package day12.task4;

public class MusicBand {
    private String nameOfBand;
    private int year;

    public MusicBand(String name, int year) {
        this.nameOfBand = name;
        this.year = year;
    }

    public String getName() {
        return nameOfBand;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return nameOfBand + ", " + year;
    }
}
