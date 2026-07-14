package com.conferenceroomscheduler.service;

import com.conferenceroomscheduler.model.Account;
import com.conferenceroomscheduler.model.BookingRequest;
import com.conferenceroomscheduler.model.PaymentMethod;
import com.conferenceroomscheduler.model.Reservation;
import com.conferenceroomscheduler.model.Room;
import com.conferenceroomscheduler.model.User;
import com.conferenceroomscheduler.patterns.BookingContext;
import com.conferenceroomscheduler.patterns.CardPaymentStrategy;
import com.conferenceroomscheduler.patterns.ChiefEventCoordinator;
import com.conferenceroomscheduler.patterns.Command;
import com.conferenceroomscheduler.patterns.ConfirmedBookingState;
import com.conferenceroomscheduler.patterns.CreateBookingCommand;
import com.conferenceroomscheduler.patterns.PaymentStrategy;
import com.conferenceroomscheduler.patterns.RoomFactory;
import com.conferenceroomscheduler.patterns.RoomSensor;
import com.conferenceroomscheduler.patterns.UserFactory;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RoomSchedulerService {
    private final List<Room> rooms = new ArrayList<>();
    private final List<Reservation> reservations = new ArrayList<>();
    private final List<User> users = new ArrayList<>();
    private final List<Account> accounts = new ArrayList<>();
    private final RoomFactory roomFactory = new RoomFactory();
    private final ChiefEventCoordinator coordinator = ChiefEventCoordinator.getInstance();
    private final BookingContext bookingContext = new BookingContext();

    public RoomSchedulerService() {
        coordinator.registerObserver(new RoomSensor());
    }

    public Account createAccount(String email, String password, String accountType,
                                 boolean universityAccount, String identifier) {
        Account account = new Account(
                "ACC" + (accounts.size() + 1),
                email,
                password,
                accountType,
                universityAccount,
                !universityAccount,
                identifier
        );
        accounts.add(account);
        return account;
    }

    public User createUser(String userId, String name, String email, String password,
                           String role, boolean universityAccount, String identifier) {
        User user = new User(userId, name, email, password, role, universityAccount, !universityAccount, identifier);
        users.add(user);
        return user;
    }

    public Room createRoom(String roomId, String name, int capacity, String building, String roomNumber) {
        Room room = roomFactory.createRoom(roomId, name, capacity, building, roomNumber);
        if (room != null && room.isEnabled() && room.getCapacity() > 0) {
            rooms.add(room);
            coordinator.notifyObservers("Room created: " + room.getName());
        }
        return room;
    }

    public List<Room> getAllRooms() {
        return new ArrayList<>(rooms);
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
        coordinator.notifyObservers("Reservation created: " + reservation.getTitle());
        bookingContext.setState(new ConfirmedBookingState());
        bookingContext.request();
    }

    public List<Reservation> getReservationsForRoom(String roomId) {
        return reservations.stream()
                .filter(reservation -> reservation.getRoomId().equals(roomId))
                .collect(Collectors.toList());
    }

    public boolean isRoomAvailable(String roomId, LocalDateTime start, LocalDateTime end) {
        return reservations.stream()
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

    public void closeRoomForMaintenance(String roomId) {
        rooms.stream()
                .filter(room -> room.getRoomId().equals(roomId))
                .findFirst()
                .ifPresent(room -> room.setClosedForMaintenance(true));
    }

    public void submitBookingRequest(BookingRequest request) {
        coordinator.notifyObservers("New booking request: " + request.getTitle());
    }

    public void createBookingWithCommand(Reservation reservation) {
        Command command = new CreateBookingCommand(this, reservation);
        command.execute();
    }

    public boolean processPayment(String bookingId, double amount, PaymentMethod paymentMethod) {
        PaymentStrategy strategy = new CardPaymentStrategy();
        return strategy.processPayment(bookingId, amount);
    }

    public UserFactory createUserFactory(String role) {
        if ("ADMIN".equalsIgnoreCase(role)) {
            return new com.conferenceroomscheduler.patterns.AdminFactory();
        }
        return new com.conferenceroomscheduler.patterns.AttendeeFactory();
    }

    public double calculateHourlyRate(String role) {
        return switch (role.toLowerCase()) {
            case "student" -> 20.0;
            case "faculty" -> 30.0;
            case "staff" -> 40.0;
            case "partner" -> 50.0;
            default -> 25.0;
        };
    }

    public void applyCheckInRules(Reservation reservation, LocalDateTime checkInTime) {
        if (checkInTime.isAfter(reservation.getStartTime().plusMinutes(30))) {
            reservation.setDepositLost(true);
        } else {
            reservation.setDepositLost(false);
        }
    }

    public void extendBooking(Reservation reservation, LocalDateTime newEndTime) {
        if (isRoomAvailable(reservation.getRoomId(), reservation.getEndTime(), newEndTime)) {
            reservation.setEndTime(newEndTime);
            reservation.setExtended(true);
        }
    }

    public void cancelBooking(Reservation reservation) {
        reservation.setCanceled(true);
    }
}
