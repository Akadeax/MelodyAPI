package me.akadeax.melody;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Called when any track ends playing.
 */
public class TrackEndEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private MelodyTrack track;
    private Player forPlayer;

    private boolean forced;

    public TrackEndEvent(MelodyTrack track, Player forPlayer) {
        this.track = track;
        this.forPlayer = forPlayer;

        this.forced = false;
    }

    public TrackEndEvent(MelodyTrack track, Player forPlayer, boolean forced) {
        this(track, forPlayer);
        this.forced = forced;
    }

    public MelodyTrack getTrack() {
        return track;
    }

    public Player getPlayingFor() {
        return forPlayer;
    }

    public boolean isForced() {
        return forced;
    }

    public HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
