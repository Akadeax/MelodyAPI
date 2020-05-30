package me.akadeax.melody;

import org.bukkit.Note;

public interface MelodyNote {
    MelodyInstrument getInstrument();
    MelodyTone getTone();
    Note getBkkitNote();
    int getOctave();
    boolean isPause();
}
