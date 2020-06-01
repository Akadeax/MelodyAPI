package me.akadeax.melody;

import org.bukkit.Note;

public interface MelodyNote {
    MelodyInstrument getInstrument();
    MelodyTone getTone();
    int getOctave();

    /**
     * Converts this Note into a bukkit note (so it can be played in-game)
     * @return the org.bukkit.Note version of this obj
     */
    Note getBukkitNote();


    /**
     * Determines whether this note is a pause
     */
    boolean isPause();

    /**
     * Determines whether this note is in between F#0 and F#2 (Minecraft's supported sound range)
     */
    boolean isPlayableInGame();


    /**
     * The amount of different tones in different octaves bukkit can play (F#0 - F#2) -> 25
     */
    static int bukkitToneAmount() { return 25; }
}
