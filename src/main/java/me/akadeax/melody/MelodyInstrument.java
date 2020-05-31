package me.akadeax.melody;

public enum MelodyInstrument {
    Pause(0),
    Piano(1);

    public final int index;

    MelodyInstrument(int index) {
        this.index = index;
    }

    public static MelodyInstrument getByIndex(int index) {
        for(MelodyInstrument inst : values()) {
            if(inst.index == index) return inst;
        }
        return null;
    }
}
