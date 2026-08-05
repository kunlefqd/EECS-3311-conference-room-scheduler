//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.conferenceroomscheduler.service;

import com.conferenceroomscheduler.model.PaymentMethod;
import com.conferenceroomscheduler.model.Reservation;
import com.conferenceroomscheduler.model.Room;
import java.time.LocalDateTime;

public class RoomSchedulerServiceAdminRoomTest {
    public RoomSchedulerServiceAdminRoomTest() {
    }

    public static void main(String[] var0) {
        RoomSchedulerService var1 = new RoomSchedulerService();
        Room var2 = var1.createRoom("R-TEST-ADMIN", "Test Admin Room", 12, "Main", "101");
        if (var2 == null) {
            throw new AssertionError("Expected room to be created");
        } else {
            var1.disableRoom(var2.getRoomId());
            if (var1.isRoomAvailable(var2.getRoomId(), LocalDateTime.now(), LocalDateTime.now().plusHours(1L))) {
                throw new AssertionError("Disabled rooms should not be available for booking");
            } else {
                var1.addReservation(new Reservation("RES-TEST-1", var2.getRoomId(), "ACC-TEST-1", "Blocked booking", LocalDateTime.now().plusHours(1L), LocalDateTime.now().plusHours(2L), "student", 20.0, 20.0, 40.0, PaymentMethod.CREDIT_CARD));
                if (!var1.getReservationsForRoom(var2.getRoomId()).isEmpty()) {
                    throw new AssertionError("Disabled rooms should reject new reservations");
                } else {
                    var1.enableRoom(var2.getRoomId());
                    var1.closeRoomForMaintenance(var2.getRoomId());
                    if (var1.isRoomAvailable(var2.getRoomId(), LocalDateTime.now(), LocalDateTime.now().plusHours(1L))) {
                        throw new AssertionError("Rooms under maintenance should not be available for booking");
                    } else {
                        var1.enableRoom(var2.getRoomId());
                        if (var2.isClosedForMaintenance()) {
                            throw new AssertionError("Re-enabling a room should clear the maintenance flag");
                        } else {
                            System.out.println("RoomSchedulerServiceAdminRoomTest passed");
                        }
                    }
                }
            }
        }
    }
}
