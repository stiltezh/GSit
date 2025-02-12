package dev.geco.gsit.api.event;

import org.bukkit.event.*;
import org.bukkit.event.player.PlayerEvent;

import dev.geco.gsit.objects.*;

public class PrePlayerGetUpSitEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();

    private boolean cancel = false;

    private final GSeat s;

    private final GetUpReason r;

    public PrePlayerGetUpSitEvent(GSeat Seat, GetUpReason Reason) {
        super(Seat.getPlayer());
        s = Seat;
        r = Reason;
    }

    public boolean isCancelled() {
        return cancel;
    }

    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    public GSeat getSeat() { return s; }

    public GetUpReason getReason() { return r; }

    public HandlerList getHandlers() { return HANDLERS; }

    public static HandlerList getHandlerList() { return HANDLERS; }

}