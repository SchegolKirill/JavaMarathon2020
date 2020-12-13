package day12.task5;

import day12.task5.MusicBand;

import java.util.ArrayList;
import java.util.List;

import static day12.task5.MusicBand.printMembers;
import static day12.task5.MusicBand.transferMembers;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> listOfMembers1 = new ArrayList<>();
        MusicBand band1 = new MusicBand("kgajskhg", 2015, listOfMembers1);
        MusicArtist ma1 = new MusicArtist("vasya", 32);
        MusicArtist ma2 = new MusicArtist("vasya", 32);
        MusicArtist ma3 = new MusicArtist("vasya", 32);
        MusicArtist ma4 = new MusicArtist("vasya", 32);
        MusicArtist ma5 = new MusicArtist("vasya", 32);
        listOfMembers1.add(ma1);
        listOfMembers1.add(ma2);
        listOfMembers1.add(ma3);
        listOfMembers1.add(ma4);
        listOfMembers1.add(ma5);

        printMembers(band1);

        List<MusicArtist> listOfMembers2 = new ArrayList<>();
        MusicBand band2 = new MusicBand("sfasdfasd", 1990, listOfMembers2);
        MusicArtist ma6 = new MusicArtist("gogi", 26);
        listOfMembers2.add(ma6);

        printMembers(band2);

        transferMembers(band1, band2);
        printMembers(band1);
        printMembers(band2);
    }
}
