package me.akadeax.melody;

import org.bukkit.entity.Player;

import java.util.List;

public interface Melody {
    /**
     * Plays a track at a players position
     * @param track the track to play
     * @param player the player that should be able to hear the track
     */
    void playTrack(MelodyTrack track, Player player);

    /**
     * substitute for MelodyTrack constructor
     * @param sounds the sounds the track should consist of
     * @return the track that was created
     */
    MelodyTrack createTrack(List<MelodyNote> sounds);

    /**
     * Substitute for MelodyNote constructor
     * MelodyInstrument.Pause indicates a pause of length "octave"
     */
    MelodyNote createNote(MelodyInstrument instrument, MelodyTone tone, int octave);

    /**
     * Returns a note that indicates a pause for 'time' milliseconds
     */
    MelodyNote createPause(int time);

    /**
     * Converts 'track' to a string
     */
    String serializeTrack(MelodyTrack track);

    /**
     * Constructs a track from 'serializedTrack'
     */
    MelodyTrack deserializeTrack(String serializedTrack);

    /**
     * Saves a track to Melody's data folder in a given folder.
     * if relPath is empty, save in dataFolder itself
     */
    void saveTrack(MelodyTrack track, String relPath);

    /**
     * load a track from Melody's data folder, i.e. if
     * the track file is located in {DATAFOLDER}/test.mel, give
     * "test.mel" as arg. if it's located in {DATAFOLDER}/folder/test.mel,
     * give "folder/test.mel" as arg, etc.
     */
    MelodyTrack loadTrack(String relFilePath);
}

