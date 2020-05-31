package me.akadeax.melody;

import org.bukkit.Note;

public interface MelodyNote {
    MelodyInstrument getInstrument();
    MelodyTone getTone();

    /**
     * Converts this Note into a bukkit note (so it can be played in-game)
     * @return the org.bukkit.Note version of this obj
     */
    Note getBukkitNote();
    int getOctave();
    boolean isPause();

    /**
     * Determines whether this note is in between F#0 and F#2 (Minecraft's supported sound range)
     */
    boolean isPlayableInGame();

    String serialize();
    MelodyNote deserialize();
}
