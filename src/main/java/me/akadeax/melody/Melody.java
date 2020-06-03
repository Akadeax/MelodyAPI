package me.akadeax.melody;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;

import java.util.List;

public interface Melody {
    /**
     * Plays a track at a players position
     * @param track the track to play
     * @param player the player that should be able to hear the track
     * @return the task ID of the runnable that's going to play this song. use this for cancelling, etc.
     */
    int playTrack(MelodyTrack track, Player player);

    /**
     * Stops a playing track by the task ID that's playing it. get the task ID from the return of playTrack.
     */
    boolean stopTrack(int taskId);

    /**
     * fades a track out over x ticks. TrackEndEvent is called only after fadeoutTime.
     */
    boolean fadeoutTrack(int taskId, int fadeoutTime);

    /**
     * determine whether a track (task) is currently still playing.
     */
    boolean isTrackPlaying(int taskID);

        /**
         * substitute for MelodyTrack constructor
         * @param sounds the sounds the track should consist of
         * @return the track that was created
         */
    MelodyTrack createTrack(String name, List<MelodyNote> sounds, int BPM);

    /**
     * Substitute for MelodyNote constructor
     * MelodyInstrument.Pause indicates a pause of length "octave"
     */
    MelodyNote createNote(MelodyInstrument instrument, MelodyTone tone, int octave);

    /**
     * Returns a note that indicates a pause for 'pauseBeatAmount' beats
     */
    MelodyNote createPause();

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
     * @return success of operation
     */
    boolean saveTrack(MelodyTrack track, String folder);

    /**
     * load a track from Melody's data folder, i.e. if
     * the track file is located in {DATAFOLDER}/test.mel, give
     * "test.mel" as arg. if it's located in {DATAFOLDER}/folder/test.mel,
     * give "folder/test.mel" as arg, etc.
     */
    MelodyTrack loadTrack(String relFilePath);


    void callEvent(Event e);
}