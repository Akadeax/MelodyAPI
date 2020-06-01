package me.akadeax.melody;

import java.util.List;

public interface MelodyTrack {
    List<MelodyNote> getNotes();
    String getName();
    int getBPM();
}
