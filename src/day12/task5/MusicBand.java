package day12.task5;

import java.util.List;

public class MusicBand {
    private List<MusicArtist> members;

    public MusicBand(List<MusicArtist> members) {
        this.members = members;
    }
    public List<MusicArtist> getMembers() {
        return members;
    }

    static void transferMembers(MusicBand b1, MusicBand b2) {
        b2.getMembers().addAll(b1.getMembers());
        b1.getMembers().removeAll(b1.getMembers());
    }

    static void printMembers(MusicBand b) {
        for (MusicArtist member: b.getMembers()){
            System.out.println(member);
        }
    }
}
