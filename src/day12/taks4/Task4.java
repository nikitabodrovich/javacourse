package day12.taks4;

import java.util.*;



public class Task4 {
    public static void main(String[] args) {
        List<String> bandMembers1 = new ArrayList<>(Arrays.asList("Corey Tailor", "Mick Thompson", "Jay Weinberg", "Alessandro Venturella"));
        List<String> bandMembers2 = new ArrayList<>(Arrays.asList("Sid Wilson", "Jim Root", "Shawn Crahan", "Craig Jones"));
        MusicBand band1 = new MusicBand(bandMembers1);
        MusicBand band2 = new MusicBand(bandMembers2);
        MusicBand.transferMembers(band1, band2);
        MusicBand.printMembers(band1);
        MusicBand.printMembers(band2);
    }
}
