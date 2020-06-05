package me.akadeax.melody;

import java.util.List;

public interface MelodyTrack {
    List<List<MelodyNote>> getNoteCols();
    String getName();
    int getBPM();
}
