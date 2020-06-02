package me.akadeax.melody;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Called when any track ticks (plays 1 column of music). How often
 * this is triggered is based on the track's BPM.
 */
public class TrackTickEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private MelodyTrack track;
    private Player forPlayer;

    public TrackTickEvent(MelodyTrack track, Player forPlayer) {
        this.track = track;
        this.forPlayer = forPlayer;
    }

    public MelodyTrack getTrack() {
        return track;
    }

    public Player getPlayingFor() {
        return forPlayer;
    }

    public int getTickTime() {
        return (int)((double)60 / track.getBPM() * 20);
    }

    public HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
