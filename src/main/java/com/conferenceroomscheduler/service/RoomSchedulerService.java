package com.conferenceroomscheduler.service;

import com.conferenceroomscheduler.model.Account;
import com.conferenceroomscheduler.model.Badge;
import com.conferenceroomscheduler.model.BookingRequest;
import com.conferenceroomscheduler.model.OccupancySensor;
import com.conferenceroomscheduler.model.PaymentMethod;
import com.conferenceroomscheduler.model.Reservation;
import com.conferenceroomscheduler.model.Room;
import com.conferenceroomscheduler.patterns.AccountFactory;
import com.conferenceroomscheduler.patterns.BookingContext;
import com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy;
import com.conferenceroomscheduler.patterns.ChiefEventCoordinator;
import com.conferenceroomscheduler.patterns.Command;
import com.conferenceroomscheduler.patterns.ConfirmedBookingState;
import com.conferenceroomscheduler.patterns.CreateBookingCommand;
import com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy;
import com.conferenceroomscheduler.patterns.FacultyFactory;
import com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy;
import com.conferenceroomscheduler.patterns.PartnerFactory;
import com.conferenceroomscheduler.patterns.PaymentStrategy;
import com.conferenceroomscheduler.patterns.RoomFactory;
import com.conferenceroomscheduler.patterns.RoomSensor;
import com.conferenceroomscheduler.patterns.StaffFactory;
import com.conferenceroomscheduler.patterns.StudentFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RoomSchedulerService {
    private final List<Room> rooms = new ArrayList<>();
    private final List<Reservation> reservations = new ArrayList<>();
    private final List<Account> accounts = new ArrayList<>();
    private final RoomFactory roomFactory = new RoomFactory();
    private final ChiefEventCoordinator coordinator = ChiefEventCoordinator.getInstance();
    private final BookingContext bookingContext = new BookingContext();
    private final Path accountsFile = Paths.get("data/accounts.csv");
    private final Path roomsFile = Paths.get("data/rooms.csv");
    private final Path reservationsFile = Paths.get("data/reservations.csv");
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    private Account loggedInAccount;

    public RoomSchedulerService() {
        coordinator.registerObserver(new RoomSensor()); // TODO: call the correct sensor
        loadData();
    }

    public void loadData() {
        loadAccounts();
        loadRooms();
        loadReservations();
    }

    public void saveData() {
        saveAccounts();
        saveRooms();
        saveReservations();
    }

    private void loadAccounts() {
        try {
            List<String> lines = Files.readAllLines(accountsFile);
            for (int i = 1; i < lines.size(); i++) {
                String[] values = lines.get(i).split(",");
                if (values.length >= 7) {
                    accounts.add(new Account(values[0], values[1], values[2], values[3], Boolean.parseBoolean(values[4]), Boolean.parseBoolean(values[5]), values[6]));
                }
            }
        } catch (IOException e) {
            System.out.println("No accounts file found; using empty data.");
        }
    }

    private void loadRooms() {
        try {
            List<String> lines = Files.readAllLines(roomsFile);
            for (int i = 1; i < lines.size(); i++) {
                String[] values = lines.get(i).split(",");
                if (values.length >= 7) {
                    Room room = new Room(values[0], values[1], Integer.parseInt(values[2]), Boolean.parseBoolean(values[3]), values[5], values[6]);
                    room.setClosedForMaintenance(Boolean.parseBoolean(values[4]));
                    rooms.add(room);
                }
            }
        } catch (IOException e) {
            System.out.println("No rooms file found; using empty data.");
        }
    }

    private void loadReservations() {
        try {
            List<String> lines = Files.readAllLines(reservationsFile);
            for (int i = 1; i < lines.size(); i++) {
                String[] values = lines.get(i).split(",");
                if (values.length >= 15) {
                    Reservation reservation = new Reservation(values[0], values[1], values[2], values[3], LocalDateTime.parse(values[4], formatter), LocalDateTime.parse(values[5], formatter), values[6], Double.parseDouble(values[7]), Double.parseDouble(values[8]), Double.parseDouble(values[9]), PaymentMethod.valueOf(values[10]));
                    reservation.setCheckedIn(Boolean.parseBoolean(values[11]));
                    reservation.setCanceled(Boolean.parseBoolean(values[12]));
                    reservation.setExtended(Boolean.parseBoolean(values[13]));
                    reservation.setDepositLost(Boolean.parseBoolean(values[14]));
                    reservations.add(reservation);
                }
            }
        } catch (IOException e) {
            System.out.println("No reservations file found; using empty data.");
        }
    }

    private void saveAccounts() {
        try {
            List<String> lines = new ArrayList<>();
            lines.add("accountId,email,password,accountType,universityAccount,verified,identifier");
            for (Account account : accounts) {
                lines.add(String.join(",", account.getAccountId(), account.getEmail(), account.getPassword(), account.getAccountType(), Boolean.toString(account.isUniversityAccount()), Boolean.toString(account.isVerified()), account.getIdentifier()));
            }
            Files.write(reservationsFile.getParent().resolve("accounts.csv"), lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveRooms() {
        try {
            List<String> lines = new ArrayList<>();
            lines.add("roomId,name,capacity,enabled,closedForMaintenance,building,roomNumber");
            for (Room room : rooms) {
                lines.add(String.join(",", room.getRoomId(), room.getName(), String.valueOf(room.getCapacity()), Boolean.toString(room.isEnabled()), Boolean.toString(room.isClosedForMaintenance()), room.getBuilding(), room.getRoomNumber()));
            }
            Files.write(roomsFile, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveReservations() {
        try {
            List<String> lines = new ArrayList<>();
            lines.add("reservationId,roomId,userId,title,startTime,endTime,accountType,hourlyRate,depositAmount,finalAmount,paymentMethod,checkedIn,canceled,extended,depositLost");
            for (Reservation reservation : reservations) {
                lines.add(String.join(",", reservation.getReservationId(), reservation.getRoomId(), reservation.getUserId(), reservation.getTitle(), reservation.getStartTime().format(formatter), reservation.getEndTime().format(formatter), reservation.getAccountType(), String.valueOf(reservation.getHourlyRate()), String.valueOf(reservation.getDepositAmount()), String.valueOf(reservation.getFinalAmount()), reservation.getPaymentMethod().name(), Boolean.toString(reservation.isCheckedIn()), Boolean.toString(reservation.isCanceled()), Boolean.toString(reservation.isExtended()), Boolean.toString(reservation.isDepositLost())));
            }
            Files.write(reservationsFile, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Account createAccount(String email, String password, String accountType,
                                 boolean universityAccount, String identifier) {
        AccountFactory factory = createAccountFactory(accountType);
        Account account = factory.createAccount(
                "ACC" + (accounts.size() + 1),
                email,
                password,
                accountType,
                universityAccount,
                !universityAccount,
                identifier
        );
        accounts.add(account);
        saveData();
        return account;
    }

    /**
     * Req1 registration. Returns null on success, otherwise a user-facing error message.
     */
    public String registerAccount(String email, String password, String accountType,
                                  boolean universityAccount) {
        if (email == null || !isValidEmail(email)) {
            return "Invalid email address.";
        }
        if (isDuplicateEmail(email)) {
            return "An account with this email already exists.";
        }
        if (!isStrongPassword(password)) {
            return "Weak password. Use at least 8 characters with uppercase, lowercase, numbers, and symbols.";
        }
        if (!isSupportedAccountType(accountType)) {
            return "Unsupported account type. Choose student, faculty, staff, or partner.";
        }

        String identifier = "ID" + (accounts.size() + 1);
        createAccount(email.trim(), password, accountType.toLowerCase(), universityAccount, identifier);
        return null;
    }

    public AccountFactory createAccountFactory(String accountType) {
        if (accountType == null) {
            throw new IllegalArgumentException("Unsupported account type.");
        }
        return switch (accountType.toLowerCase()) {
            case "student" -> new StudentFactory();
            case "faculty" -> new FacultyFactory();
            case "staff" -> new StaffFactory();
            case "partner" -> new PartnerFactory();
            default -> throw new IllegalArgumentException("Unsupported account type.");
        };
    }

    private boolean isValidEmail(String email) {
        return Pattern.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$", email.trim());
    }

    private boolean isStrongPassword(String password) {
        return password != null
                && password.length() >= 8
                && Pattern.compile("[A-Z]").matcher(password).find()
                && Pattern.compile("[a-z]").matcher(password).find()
                && Pattern.compile("\\d").matcher(password).find()
                && Pattern.compile("[^A-Za-z0-9]").matcher(password).find();
    }

    private boolean isDuplicateEmail(String email) {
        return accounts.stream().anyMatch(account -> account.getEmail().equalsIgnoreCase(email.trim()));
    }

    private boolean isSupportedAccountType(String accountType) {
        if (accountType == null) {
            return false;
        }
        return switch (accountType.toLowerCase()) {
            case "student", "faculty", "staff", "partner" -> true;
            default -> false;
        };
    }

    public Room createRoom(String roomId, String name, int capacity, String building, String roomNumber) {
        Room room = roomFactory.createRoom(roomId, name, capacity, building, roomNumber);
        if (room != null && room.isEnabled() && room.getCapacity() > 0) {
            rooms.add(room);
            saveData();
            coordinator.notifyObservers("Room created: " + room.getName());
        }
        return room;
    }

    public List<Room> getAllRooms() {
        return new ArrayList<>(rooms);
    }

    public void addReservation(Reservation reservation) {
        if (reservation == null) {
            return;
        }

        double hourlyRate = reservation.getHourlyRate() > 0
                ? reservation.getHourlyRate()
                : calculateHourlyRate(reservation.getAccountType());
        double depositAmount = reservation.getDepositAmount() > 0
                ? reservation.getDepositAmount()
                : hourlyRate;

        double durationHours = Math.max(1.0, Duration.between(reservation.getStartTime(), reservation.getEndTime()).toMinutes() / 60.0);
        double finalAmount = hourlyRate * durationHours;

        reservation.setHourlyRate(hourlyRate);
        reservation.setDepositAmount(depositAmount);
        reservation.setFinalAmount(finalAmount);

        if (reservation.getPaymentMethod() != null) {
            processPayment(reservation.getReservationId(), depositAmount, reservation.getPaymentMethod());
        }

        reservations.add(reservation);
        saveData();
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
        PaymentStrategy strategy = switch (paymentMethod) {
            case DEBIT_CARD -> new DebitCardPaymentStrategy();
            case INSTITUTIONAL_BILLING -> new InstitutionalBillingPaymentStrategy();
            case CREDIT_CARD -> new CreditCardPaymentStrategy();
        };
        return strategy.processPayment(bookingId, amount);
    }


    /**
     * Req2: admin accounts can only be minted through the Singleton chief event
     * coordinator, which builds the account via the AdminFactory (Factory Method).
     */
    public Account createAdminAccount(String email, String password) {
        Account admin = coordinator.generateAdminAccount("ACC" + (accounts.size() + 1), email, password);
        accounts.add(admin);
        saveData();
        return admin;
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
        if (reservation == null) {
            return;
        }

        reservation.setCheckedIn(true);
        if (checkInTime.isAfter(reservation.getStartTime().plusMinutes(30))) {
            reservation.setDepositLost(true);
        } else {
            reservation.setDepositLost(false);
            reservation.setFinalAmount(Math.max(0.0, reservation.getFinalAmount() - reservation.getDepositAmount()));
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

    public Account authenticate(String email, String password) {
        for (Account account : accounts) {
            if (account.getEmail().equalsIgnoreCase(email) && account.getPassword().equals(password)) {
                loggedInAccount = account;
                return account;
            }
        }
        return null;
    }

    public Account getLoggedInAccount() {
        return loggedInAccount;
    }
    
    public void checkIn(String roomId) {
        Room checkedInRoom = getRoomById(roomId);
        Badge badge = loggedInAccount.getBadge();
        if (checkedInRoom != null) {
            OccupancySensor sensor = checkedInRoom.getOccupancySensor();
            sensor.scanIdBadge(badge);
        }
    }

    private Room getRoomById(String roomId) {
        for (Room room : rooms) {
            if (room.getRoomId().equals(roomId)) {
                return room;
            }
        }
        return null;
    }
}
