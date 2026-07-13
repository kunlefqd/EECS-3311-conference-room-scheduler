package com.conferenceroomscheduler.patterns;

import com.conferenceroomscheduler.model.Room;
import com.conferenceroomscheduler.model.RoomType;

public class RoomFactory {
    public Room createRoom(String roomId, String name, int capacity, RoomType roomType) {
        return new Room(roomId, name, capacity, true, roomType);
    }
}
