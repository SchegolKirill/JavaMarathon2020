package day12.task5;

import day12.task5.MusicBand;

public class MusicArtist {
    private String nameOfArtist;
    private int ageOfArtist;

    public MusicArtist(String nameOfArtist, int ageOfArtist) {
        this.nameOfArtist = nameOfArtist;
        this.ageOfArtist = ageOfArtist;
    }

    @Override
    public String toString() {
        return nameOfArtist + " " + ageOfArtist;
    }
}
