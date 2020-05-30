package me.akadeax.melody;

import org.bukkit.entity.Player;

import java.util.List;

public interface Melody {
    void test();
    void playTrack(MelodyTrack track, Player player);

    MelodyTrack createTrack(List<MelodySound> sounds);
    MelodySound createSound(MelodyInstrument instrument, int pitch);
}

