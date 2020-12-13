package day12.task4;

import com.sun.xml.bind.v2.runtime.output.SAXOutput;

import java.util.ArrayList;
import java.util.List;

import static day12.task4.MusicBand.printMembers;
import static day12.task4.MusicBand.transferMembers;

public class Task4 {
    public static void main(String[] args) {
        List<String> member1 = new ArrayList<>();
        MusicBand band1 = new MusicBand("eafsdafd", 2015, member1);

        band1.listOfMembers.add("vasya ivanov");
        band1.listOfMembers.add("vasya ivanov");
        band1.listOfMembers.add("vasya ivanov");
        band1.listOfMembers.add("vasya ivanov");
        band1.listOfMembers.add("vasya ivanov");
        System.out.println(band1.listOfMembers);

        List<String> member2 = new ArrayList<>();
        MusicBand band2 = new MusicBand("sfasdfasd", 1990, member2);
        band2.listOfMembers.add("gosha kutsenko");

        System.out.println(band2.listOfMembers);

        transferMembers(band1, band2);
        printMembers(band2);
        printMembers(band1);

    }


}
