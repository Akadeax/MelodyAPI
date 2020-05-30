package me.akadeax.melody;

import org.bukkit.entity.Player;

import java.util.List;

public interface Melody {
    void test();
    void playTrack(MelodyTrack track, Player player);

    MelodyTrack createTrack(List<MelodyNote> sounds);
    MelodyNote createNote(MelodyInstrument instrument, int pitch);
}

