package me.akadeax.melody;

import org.bukkit.Note;

public interface MelodyNote {
    MelodyInstrument getInstrument();
    MelodyTone getTone();
    Note getBukkitNote();
    int getOctave();
    boolean isPause();
}
