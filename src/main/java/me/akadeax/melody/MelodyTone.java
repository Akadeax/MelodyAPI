package me.akadeax.melody;

import org.bukkit.Note;

public enum MelodyTone {
    C, CS,
    D, DS,
    E,
    F, FS,
    G, GS,
    A, AS,
    B;

    public Note getBukkitNote(int octave) {
        switch(this) {
            case C:
                return Note.natural(octave - 1, Note.Tone.C);
            case CS:
                return Note.sharp(octave - 1, Note.Tone.C);
            case D:
                return Note.natural(octave - 1, Note.Tone.D);
            case DS:
                return Note.sharp(octave - 1, Note.Tone.D);
            case E:
                return Note.natural(octave - 1, Note.Tone.E);
            case F:
                return Note.natural(octave - 1, Note.Tone.F);
            case FS:
                return Note.sharp(octave - 1, Note.Tone.F);
            case G:
                return Note.natural(octave, Note.Tone.G);
            case GS:
                return Note.sharp(octave, Note.Tone.G);
            case A:
                return Note.natural(octave, Note.Tone.A);
            case AS:
                return Note.sharp(octave, Note.Tone.A);
            case B:
                return Note.natural(octave, Note.Tone.B);
            default:
                return null;
        }
    }
}
