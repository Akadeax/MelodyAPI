package me.akadeax.melody;

public interface MelodySound {
    MelodyInstrument getInstrument();
    int getPitch();
    boolean isPause();
}
