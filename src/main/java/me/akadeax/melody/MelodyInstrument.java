package me.akadeax.melody;

import org.bukkit.Instrument;

public enum MelodyInstrument {
    PAUSE,
    PIANO,
    BELL;

    public Instrument toBukkitInstrument() {
        return Instrument.valueOf(name());
    }
}
