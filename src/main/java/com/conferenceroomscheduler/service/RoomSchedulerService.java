package com.conferenceroomscheduler.service;

import com.conferenceroomscheduler.model.BookingRequest;
import com.conferenceroomscheduler.model.Reservation;
import com.conferenceroomscheduler.model.Room;
import com.conferenceroomscheduler.patterns.EmailNotifier;
import com.conferenceroomscheduler.patterns.ReservationRepository;
import com.conferenceroomscheduler.patterns.ReservationService;
import com.conferenceroomscheduler.patterns.RoomFactory;
import com.conferenceroomscheduler.patterns.RoomValidator;
import com.conferenceroomscheduler.patterns.Subject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RoomSchedulerService {
    private final List<Room> rooms = new ArrayList<>();
    private final ReservationRepository reservationRepository = new ReservationRepository();
    private final ReservationService reservationService = new ReservationService();
    private final RoomFactory roomFactory = new RoomFactory();
    private final RoomValidator roomValidator = new RoomValidator();
    private final Subject subject = new Subject();

    public RoomSchedulerService() {
        subject.attach(new EmailNotifier());
    }

    public Room createRoom(String roomId, String name, int capacity, com.conferenceroomscheduler.model.RoomType roomType) {
        Room room = roomFactory.createRoom(roomId, name, capacity, roomType);
        if (roomValidator.validate(room)) {
            rooms.add(room);
            subject.notifyObservers("Room created: " + room.getName());
        }
        return room;
    }

    public List<Room> getAllRooms() {
        return new ArrayList<>(rooms);
    }

    public void addReservation(Reservation reservation) {
        reservationService.createReservation(reservation);
        reservationRepository.save(reservation);
    }

    public List<Reservation> getReservationsForRoom(String roomId) {
        return reservationRepository.findAll().stream()
                .filter(reservation -> reservation.getRoomId().equals(roomId))
                .collect(Collectors.toList());
    }

    public boolean isRoomAvailable(String roomId, LocalDateTime start, LocalDateTime end) {
        return reservationRepository.findAll().stream()
                .filter(reservation -> reservation.getRoomId().equals(roomId))
                .noneMatch(reservation ->
                        (start.isBefore(reservation.getEndTime()) && end.isAfter(reservation.getStartTime()))
                );
    }

    public void enableRoom(String roomId) {
        rooms.stream()
                .filter(room -> room.getRoomId().equals(roomId))
                .findFirst()
                .ifPresent(room -> room.setEnabled(true));
    }

    public void disableRoom(String roomId) {
        rooms.stream()
                .filter(room -> room.getRoomId().equals(roomId))
                .findFirst()
                .ifPresent(room -> room.setEnabled(false));
    }

    public void submitBookingRequest(BookingRequest request) {
        subject.notifyObservers("New booking request: " + request.getTitle());
    }
}
