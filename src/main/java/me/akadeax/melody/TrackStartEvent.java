package me.akadeax.melody;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Called when any Track starts to play.
 */
public class TrackStartEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private MelodyTrack track;
    private Player forPlayer;

    public TrackStartEvent(MelodyTrack track, Player forPlayer) {
        this.track = track;
        this.forPlayer = forPlayer;
    }

    public MelodyTrack getTrack() {
        return track;
    }

    public Player getPlayingFor() {
        return forPlayer;
    }

    public HandlerList getHandlers() {
        return handlers;
    }
    public HandlerList getHandlerList() {
        return handlers;
    }
}
