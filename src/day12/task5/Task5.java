package day12.task5;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>(Arrays.asList(new MusicArtist("Corey Tailor", 44),
                                                                    new MusicArtist("Mick Thompson",42),
                                                                    new MusicArtist("Shawn Crahan",47),
                                                                    new MusicArtist("Alessandro Venturella", 32)));

        List<MusicArtist> members2 = new ArrayList<>(Arrays.asList(new MusicArtist("Corey Tailor", 44),
                                                                    new MusicArtist("Sid Wilson",40),
                                                                    new MusicArtist("Jim Root",41),
                                                                    new MusicArtist("Jay Weinberg", 39),
                                                                    new MusicArtist("Craig Jones", 50)));
        MusicBand band1 = new MusicBand(members1);
        MusicBand band2 = new MusicBand(members2);
        MusicBand.transferMembers(band1,band2);
        MusicBand.printMembers(band2);
        MusicBand.printMembers(band1);
    }
}
