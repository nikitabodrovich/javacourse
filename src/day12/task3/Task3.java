package day12.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Slipknot", 1995);
        MusicBand band2 = new MusicBand("Ранетки", 2008);
        MusicBand band3 = new MusicBand("Кино", 1981);
        MusicBand band4 = new MusicBand("Rammstein", 1994);
        MusicBand band5 = new MusicBand("Red Hot Chili Peppers", 1983);
        MusicBand band6 = new MusicBand("Meshuggah", 1987);
        MusicBand band7 = new MusicBand("Green Day", 1995);
        MusicBand band8 = new MusicBand("Arctic Monkeys", 2002);
        MusicBand band9 = new MusicBand("Black Veil Brides", 2006);
        MusicBand band10 = new MusicBand("Chelsea Grin", 2008);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);
        System.out.println(musicBands);

        Collections.shuffle(musicBands);
        System.out.println(groupsAfter2000(musicBands));


    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> after2000List = new ArrayList<>();
        for (int i = 0; i < bands.size(); i++){
            if (bands.get(i).getYear()>=2000){
                after2000List.add(bands.get(i));
            }
        }
        return after2000List;
    }

}
