package com.conferenceroomscheduler.patterns;

import com.conferenceroomscheduler.model.Room;

public class RoomValidator {
    public boolean validate(Room room) {
        return room != null && room.isEnabled() && room.getCapacity() > 0;
    }
}
