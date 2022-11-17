package day12.taks4;

import java.util.*;

public class MusicBand {
    private List<String> members;

    public MusicBand(List<String> members) {
        this.members = members;
    }
    public List<String> getMembers() {
        return members;
    }
    static void transferMembers(MusicBand b1, MusicBand b2) {
        b2.getMembers().addAll(b1.getMembers());
        b1.getMembers().removeAll(b1.getMembers());
    }
    static void printMembers(MusicBand someBand) {
        System.out.println("Состав группы : "+ someBand.getMembers());
    }
}
