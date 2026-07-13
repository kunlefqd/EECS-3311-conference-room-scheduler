package com.conferenceroomscheduler.patterns;

import com.conferenceroomscheduler.model.Room;

public class RoomProxy extends Room {
    private final Room realRoom;

    public RoomProxy(Room realRoom) {
        this.realRoom = realRoom;
    }

    @Override
    public boolean isEnabled() {
        return realRoom != null && realRoom.isEnabled();
    }
}
