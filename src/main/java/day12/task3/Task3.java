package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand mb1 = new MusicBand("Ария", 1985);
        MusicBand mb2 = new MusicBand("Кино", 1982);
        MusicBand mb3 = new MusicBand("Король и шут", 1988);
        MusicBand mb4 = new MusicBand("Imagine Dragons", 2008);
        MusicBand mb5 = new MusicBand("AC/DC", 1973);
        MusicBand mb6 = new MusicBand("Little Big", 2013);
        MusicBand mb7 = new MusicBand("Linkin park", 1996);
        MusicBand mb8 = new MusicBand("Limp Bizkit", 1994);
        MusicBand mb9 = new MusicBand("Serebro", 2006);
        MusicBand mb10 = new MusicBand("Arctic Monkeys", 2002);

        List<MusicBand> bands = new ArrayList<>(Arrays.asList(mb1, mb2, mb3, mb4, mb5, mb6, mb7, mb8, mb9, mb10));
        Collections.shuffle(bands);
        groupsAfter2000(bands);
        System.out.println(bandsAfter2000);

    }
    public static List<MusicBand> bandsAfter2000 = new ArrayList<MusicBand>();

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        for(int i = 0; i < bands.size(); i++){
            if(bands.get(i).getYear() > 2000){
                bandsAfter2000.add(bands.get(i));
            }
        }
        return bandsAfter2000;
    }
}
