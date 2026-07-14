package com.conferenceroomscheduler.patterns;

import com.conferenceroomscheduler.model.Room;

public class RoomFactory {
    public Room createRoom(String roomId, String name, int capacity, String building, String roomNumber) {
        return new Room(roomId, name, capacity, true, building, roomNumber);
    }
}
