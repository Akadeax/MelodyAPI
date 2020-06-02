package me.akadeax.melody;

import org.bukkit.Instrument;

public enum MelodyInstrument {
    PAUSE,
    PIANO,
    BASS_DRUM,
    BASS_GUITAR,
    BELL,
    BIT,
    CHIME,
    COW_BELL,
    DIDGERIDOO,
    FLUTE,
    GUITAR,
    IRON_XYLOPHONE,
    BANJO,
    PLING,
    SNARE_DRUM,
    STICKS,
    XYLOPHONE;

    public Instrument toBukkitInstrument() {
        return Instrument.valueOf(name());
    }
}
