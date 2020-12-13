package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String nameOfBand;
    private int year;
    public List<MusicArtist> listOfMembers;


    public MusicBand(String nameOfBand, int year, List<MusicArtist > listOfMembers) {
        this.nameOfBand = nameOfBand;
        this.year = year;
        this.listOfMembers = listOfMembers;
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



    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        for (int i = musicBand1.listOfMembers.size() - 1; i >= 0; i--) {
            musicBand2.listOfMembers.add(musicBand1.listOfMembers.get(i));
            musicBand1.listOfMembers.remove(i);
        }

    }

    public static void printMembers(MusicBand musicBand) {
        System.out.println(musicBand.listOfMembers);
    }

    public List<MusicArtist> getMembers() {
         return listOfMembers;
    }
}
