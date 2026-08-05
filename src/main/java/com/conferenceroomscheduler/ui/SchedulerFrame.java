package com.conferenceroomscheduler.ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.time.LocalDateTime;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.conferenceroomscheduler.model.Account;
import com.conferenceroomscheduler.model.PaymentMethod;
import com.conferenceroomscheduler.model.Reservation;
import com.conferenceroomscheduler.model.Room;
import com.conferenceroomscheduler.patterns.BookingContext;
import com.conferenceroomscheduler.patterns.CancelBookingCommand;
import com.conferenceroomscheduler.patterns.EditBookingCommand;
import com.conferenceroomscheduler.patterns.ExtendBookingCommand;
import com.conferenceroomscheduler.service.RoomSchedulerService;

public class SchedulerFrame extends JFrame {
    private final RoomSchedulerService service;
    private final DefaultListModel<String> roomListModel = new DefaultListModel<>();
    private final JList<String> roomList = new JList<>(roomListModel);
    private final JTextArea outputArea = new JTextArea();
    private final JTextField emailField = new JTextField();
    private final JPasswordField passwordField = new JPasswordField();
    private final JButton loginButton = new JButton("Login");
    private final JTextField registerEmailField = new JTextField();
    private final JPasswordField registerPasswordField = new JPasswordField();
    private final JPasswordField confirmPasswordField = new JPasswordField();
    private final JComboBox<String> accountTypeCombo = new JComboBox<>(new String[]{
            "student", "faculty", "staff", "partner"
    });
    private final JCheckBox universityAccountCheckBox = new JCheckBox("University account (requires verification)");
    private final JLabel universityAccountNumberLabel = new JLabel("University Account Number");
    private final JTextField universityAccountNumberField = new JTextField();
    private final JButton registerButton = new JButton("Register");
    private final JButton addRoomButton = new JButton("Add Room");
    private final JButton roomStateButton = new JButton("Enable/Disable Room");
    private final JButton reserveButton = new JButton("Create Booking");
    private final JComboBox<String> paymentMethodCombo = new JComboBox<>(new String[]{"CREDIT_CARD", "DEBIT_CARD", "INSTITUTIONAL_BILLING"});
    private final JButton maintenanceButton = new JButton("Maintenance/Repairs");
    private final JButton generateAdminButton = new JButton("Generate Admin Account");
    private final JButton checkInButton = new JButton("Check In");
    private final JButton refreshButton = new JButton("Refresh");
    private final JButton signOutButton = new JButton("Sign Out");
    private final DefaultListModel<String> reservationListModel = new DefaultListModel<>();
    private final JList<String> reservationList = new JList<>(reservationListModel);
    private final JButton cancelBookingButton = new JButton("Cancel Booking");
    private final JButton editBookingButton = new JButton("Edit Booking");
    private final JButton extendBookingButton = new JButton("Extend Booking");
    
    private final CardLayout cardLayout = new CardLayout();
    private final JPanel cards = new JPanel(cardLayout);
    private final JLabel welcomeLabel = new JLabel("Please sign in to continue");
    private Account currentAccount;
    private BookingContext currentBookingContext;

    public SchedulerFrame(RoomSchedulerService service) {
        this.service = service;
        setTitle("York University Room Booking System");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        buildUI();
        refreshRooms();
    }

    private void buildUI() {
        JPanel authPanel = new JPanel(new BorderLayout(10, 10));
        authPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JTabbedPane authTabs = new JTabbedPane();
        authTabs.addTab("Login", buildLoginTab());
        authTabs.addTab("Register", buildRegisterTab());
        authPanel.add(authTabs, BorderLayout.CENTER);

        JPanel dashboardPanel = new JPanel(new BorderLayout(10, 10));
        dashboardPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel topBar = new JPanel(new BorderLayout(10, 10));
        topBar.add(welcomeLabel, BorderLayout.WEST);
        topBar.add(signOutButton, BorderLayout.EAST);

        JPanel actionPanel = new JPanel(new GridLayout(1, 8, 5, 5));
        actionPanel.add(reserveButton);
        actionPanel.add(paymentMethodCombo);
        actionPanel.add(addRoomButton);
        actionPanel.add(generateAdminButton);
        actionPanel.add(roomStateButton);
        actionPanel.add(maintenanceButton);
        actionPanel.add(checkInButton);
        actionPanel.add(refreshButton);

        JPanel leftPanel = new JPanel(new BorderLayout(5, 5));
        leftPanel.setPreferredSize(new Dimension(320, 0));
        leftPanel.add(new JLabel("Available Rooms"), BorderLayout.NORTH);
        leftPanel.add(new JScrollPane(roomList), BorderLayout.CENTER);

        JPanel bookingsPanel = new JPanel(new BorderLayout(5, 5));
        bookingsPanel.add(new JLabel("My Bookings"), BorderLayout.NORTH);
        bookingsPanel.add(new JScrollPane(reservationList), BorderLayout.CENTER);
        JPanel bookingActionsPanel = new JPanel(new GridLayout(1, 3, 5, 5));
        bookingActionsPanel.add(cancelBookingButton);
        bookingActionsPanel.add(editBookingButton);
        bookingActionsPanel.add(extendBookingButton);
        bookingsPanel.add(bookingActionsPanel, BorderLayout.SOUTH);
        bookingsPanel.setPreferredSize(new Dimension(0, 160));

        JPanel rightPanel = new JPanel(new BorderLayout(5, 5));
        rightPanel.add(new JLabel("Event Services Actions"), BorderLayout.NORTH);
        rightPanel.add(bookingsPanel, BorderLayout.CENTER);
        JScrollPane outputScrollPane = new JScrollPane(outputArea);
        outputScrollPane.setPreferredSize(new Dimension(0, 160));
        rightPanel.add(outputScrollPane, BorderLayout.SOUTH);

        dashboardPanel.add(topBar, BorderLayout.NORTH);
        dashboardPanel.add(actionPanel, BorderLayout.SOUTH);
        dashboardPanel.add(leftPanel, BorderLayout.WEST);
        dashboardPanel.add(rightPanel, BorderLayout.CENTER);

        loginButton.addActionListener(e -> login());
        passwordField.addActionListener(e -> login());
        registerButton.addActionListener(e -> register());
        addRoomButton.addActionListener(e -> addNewRoom());
        roomStateButton.addActionListener(e -> toggleSelectedRoomState());
        reserveButton.addActionListener(e -> createSampleReservation());
        maintenanceButton.addActionListener(e -> closeRoomForMaintenance());
        generateAdminButton.addActionListener(e -> generateAdminAccount());
        checkInButton.addActionListener(e -> checkIn());
        refreshButton.addActionListener(e -> refreshRooms());
        signOutButton.addActionListener(e -> signOut());
        cancelBookingButton.addActionListener(e -> cancelSelectedBooking());
        editBookingButton.addActionListener(e -> editSelectedBooking());
        extendBookingButton.addActionListener(e -> extendSelectedBooking());

        outputArea.setEditable(false);
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);

        cards.add(authPanel, "login");
        cards.add(dashboardPanel, "dashboard");
        setContentPane(cards);
        cardLayout.show(cards, "login");
        updateActionVisibility();
    }

    private JPanel buildLoginTab() {
        JPanel loginPanel = new JPanel(new BorderLayout(10, 10));
        loginPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel loginForm = new JPanel(new GridLayout(3, 2, 8, 8));
        loginForm.add(new JLabel("Email"));
        loginForm.add(emailField);
        loginForm.add(new JLabel("Password"));
        loginForm.add(passwordField);
        loginForm.add(new JLabel(""));
        loginForm.add(loginButton);

        JTextArea loginInfo = new JTextArea(
                "Log in with an existing account, or use the Register tab to create one.\n"
                        + "Demo accounts are also available in the CSV data file."
        );
        loginInfo.setEditable(false);
        loginInfo.setOpaque(false);
        loginInfo.setLineWrap(true);
        loginInfo.setWrapStyleWord(true);

        loginPanel.add(loginInfo, BorderLayout.NORTH);
        loginPanel.add(loginForm, BorderLayout.CENTER);
        return loginPanel;
    }

    private JPanel buildRegisterTab() {
        JPanel registerPanel = new JPanel(new BorderLayout(10, 10));
        registerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel registerForm = new JPanel(new GridLayout(7, 2, 8, 8));
        registerForm.add(new JLabel("Email"));
        registerForm.add(registerEmailField);
        registerForm.add(new JLabel("Password"));
        registerForm.add(registerPasswordField);
        registerForm.add(new JLabel("Confirm Password"));
        registerForm.add(confirmPasswordField);
        registerForm.add(new JLabel("Account Type"));
        registerForm.add(accountTypeCombo);
        registerForm.add(new JLabel(""));
        registerForm.add(universityAccountCheckBox);
        registerForm.add(universityAccountNumberLabel);
        registerForm.add(universityAccountNumberField);
        registerForm.add(new JLabel(""));
        registerForm.add(registerButton);

        universityAccountCheckBox.addActionListener(e -> updateUniversityAccountNumberVisibility());
        updateUniversityAccountNumberVisibility();

        JTextArea registerInfo = new JTextArea(
                "Create an account with a unique valid email and a strong password "
                        + "(uppercase, lowercase, numbers, and symbols)."
        );
        registerInfo.setEditable(false);
        registerInfo.setOpaque(false);
        registerInfo.setLineWrap(true);
        registerInfo.setWrapStyleWord(true);

        registerPanel.add(registerInfo, BorderLayout.NORTH);
        registerPanel.add(registerForm, BorderLayout.CENTER);
        return registerPanel;
    }

    private void updateUniversityAccountNumberVisibility() {
        boolean show = universityAccountCheckBox.isSelected();
        universityAccountNumberLabel.setVisible(show);
        universityAccountNumberField.setVisible(show);
        if (!show) {
            universityAccountNumberField.setText("");
        }
        universityAccountNumberLabel.getParent().revalidate();
        universityAccountNumberLabel.getParent().repaint();
    }

    private void login() {
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());
        Account account = service.authenticate(email, password);
        if (account == null) {
            JOptionPane.showMessageDialog(this, "Login failed. Check your email and password.",
                    "Login", JOptionPane.ERROR_MESSAGE);
            return;
        }
        openDashboard(account);
    }

    private void openDashboard(Account account) {
        currentAccount = account;
        welcomeLabel.setText("Signed in as " + account.getEmail() + " (" + account.getAccountType() + ")");
        showAccountPricingInfo();
        updateActionVisibility();
        refreshRooms();
        cardLayout.show(cards, "dashboard");
    }

    private void showAccountPricingInfo() {
        if (currentAccount == null) {
            return;
        }
        double hourlyRate = service.calculateHourlyRate(currentAccount.getAccountType());
        outputArea.setText(
                "Welcome to the room booking system.\n"
                        + "Account type: " + currentAccount.getAccountType() + "\n"
                        + "Your hourly rate: $" + String.format("%.2f", hourlyRate) + "\n"
                        + "A one-hour deposit ($" + String.format("%.2f", hourlyRate)
                        + ") is charged upfront when you book.\n"
                        + "Check in within 30 minutes of the start time to apply that deposit to your final cost;"
                        + " otherwise the deposit is lost."
        );
    }

    private void register() {
        String email = registerEmailField.getText();
        String password = new String(registerPasswordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());
        String accountType = (String) accountTypeCombo.getSelectedItem();
        boolean universityAccount = universityAccountCheckBox.isSelected();
        String universityAccountNumber = universityAccountNumberField.getText().trim();

        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match.",
                    "Register", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String error = service.registerAccount(
                email, password, accountType, universityAccount, universityAccountNumber);
        if (error != null) {
            JOptionPane.showMessageDialog(this, error, "Register", JOptionPane.ERROR_MESSAGE);
            return;
        }

        registerEmailField.setText("");
        registerPasswordField.setText("");
        confirmPasswordField.setText("");
        universityAccountNumberField.setText("");
        universityAccountCheckBox.setSelected(false);
        accountTypeCombo.setSelectedIndex(0);
        updateUniversityAccountNumberVisibility();

        if (universityAccount) {
            Account account = service.authenticate(email, password);
            if (account != null) {
                openDashboard(account);
                return;
            }
        }

        JOptionPane.showMessageDialog(this,
                "Account created successfully. You can now log in.",
                "Register", JOptionPane.INFORMATION_MESSAGE);
    }

    private void signOut() {
        currentAccount = null;
        emailField.setText("");
        passwordField.setText("");
        welcomeLabel.setText("Please sign in to continue");
        outputArea.setText("Signed out. Please sign in again.");
        updateActionVisibility();
        cardLayout.show(cards, "login");
    }

    private void updateActionVisibility() {
        boolean loggedIn = currentAccount != null;
        boolean canManageRooms = loggedIn && "admin".equalsIgnoreCase(currentAccount.getAccountType());
        reserveButton.setVisible(loggedIn);
        addRoomButton.setVisible(canManageRooms);
        roomStateButton.setVisible(canManageRooms);
        maintenanceButton.setVisible(canManageRooms);
        generateAdminButton.setVisible(loggedIn && "coordinator".equalsIgnoreCase(currentAccount.getAccountType()));
        checkInButton.setVisible(loggedIn);
        refreshButton.setVisible(loggedIn);
        signOutButton.setVisible(loggedIn);
        welcomeLabel.setVisible(loggedIn);
        cancelBookingButton.setVisible(loggedIn);
        editBookingButton.setVisible(loggedIn);
        extendBookingButton.setVisible(loggedIn);
    }

    private void addNewRoom() {
        if (currentAccount == null) {
            outputArea.setText("Please log in first.");
            return;
        }
        if (!canManageRooms()) {
            outputArea.setText("Only admins can add rooms.");
            return;
        }

        JTextField roomIdField = new JTextField("R-" + System.currentTimeMillis());
        JTextField roomNameField = new JTextField();
        JTextField capacityField = new JTextField("10");
        JTextField buildingField = new JTextField();
        JTextField roomNumberField = new JTextField();

        JPanel roomForm = new JPanel(new GridLayout(0, 2, 8, 8));
        roomForm.add(new JLabel("Room ID:"));
        roomForm.add(roomIdField);
        roomForm.add(new JLabel("Room Name:"));
        roomForm.add(roomNameField);
        roomForm.add(new JLabel("Capacity:"));
        roomForm.add(capacityField);
        roomForm.add(new JLabel("Building:"));
        roomForm.add(buildingField);
        roomForm.add(new JLabel("Room Number:"));
        roomForm.add(roomNumberField);

        int result = JOptionPane.showConfirmDialog(this, roomForm, "Add Room", JOptionPane.OK_CANCEL_OPTION);
        if (result != JOptionPane.OK_OPTION) {
            outputArea.append("\nRoom addition cancelled.");
            return;
        }

        String roomId = roomIdField.getText().trim();
        String roomName = roomNameField.getText().trim();
        String capacityInput = capacityField.getText().trim();
        String building = buildingField.getText().trim();
        String roomNumber = roomNumberField.getText().trim();

        if (roomId.isBlank() || roomName.isBlank() || building.isBlank() || roomNumber.isBlank()) {
            JOptionPane.showMessageDialog(this, "Room ID, name, building, and room number are required.", "Invalid room details", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int capacity;
        try {
            capacity = Integer.parseInt(capacityInput);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Capacity must be a whole number.", "Invalid room details", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Room room = service.createRoom(roomId, roomName, capacity, building, roomNumber);
        if (room != null) {
            outputArea.append("\nAdded room: " + room.getName() + " (" + room.getRoomId() + ")");
        } else {
            outputArea.append("\nCould not add room.");
        }
        refreshRooms();
    }

    private void toggleSelectedRoomState() {
        if (!canManageRooms()) {
            outputArea.setText("Only admins can manage rooms.");
            return;
        }

        Room selected = getSelectedRoom();
        if (selected == null) {
            return;
        }

        if (selected.isEnabled()) {
            service.disableRoom(selected.getRoomId());
            outputArea.append("\nDisabled room: " + selected.getName());
        } else {
            service.enableRoom(selected.getRoomId());
            outputArea.append("\nEnabled room: " + selected.getName());
        }
        refreshRooms();
    }

    private boolean canManageRooms() {
        return currentAccount != null && "admin".equalsIgnoreCase(currentAccount.getAccountType());
    }

    private Room getSelectedRoom() {
        if (currentAccount == null) {
            outputArea.setText("Please log in first.");
            return null;
        }
        List<Room> rooms = service.getAllRooms();
        if (rooms.isEmpty()) {
            outputArea.append("\nNo rooms available.");
            return null;
        }

        int selectedIndex = roomList.getSelectedIndex();
        if (selectedIndex < 0) {
            outputArea.append("\nPlease select a room first.");
            return null;
        }

        return rooms.get(selectedIndex);
    }

    private void createSampleReservation() {
        if (currentAccount == null) {
            outputArea.setText("Please log in first.");
            return;
        }
        List<Room> rooms = service.getAllRooms();
        if (rooms.isEmpty()) {
            outputArea.append("\nNo rooms available to reserve.");
            return;
        }

        int selectedIndex = roomList.getSelectedIndex();
        if (selectedIndex < 0) {
            outputArea.append("\nPlease select a room first.");
            return;
        }

        Room selected = rooms.get(selectedIndex);
        if (!selected.isEnabled() || selected.isClosedForMaintenance()) {
            JOptionPane.showMessageDialog(this,
                    "This room is currently disabled or under maintenance and cannot be booked.",
                    "Room unavailable",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        double hourlyRate = service.calculateHourlyRate(currentAccount.getAccountType());
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = LocalDateTime.now().plusHours(2);
        double durationHours = Math.max(1.0,
                java.time.Duration.between(start, end).toMinutes() / 60.0);
        double depositAmount = hourlyRate;
        double estimatedFinal = hourlyRate * durationHours;
        PaymentMethod selectedPaymentMethod = PaymentMethod.valueOf((String) paymentMethodCombo.getSelectedItem());

        String confirmMessage =
                "Confirm booking for " + selected.getName() + "?\n\n"
                        + "Account type: " + currentAccount.getAccountType() + "\n"
                        + "Hourly rate: $" + String.format("%.2f", hourlyRate) + "\n"
                        + "Deposit due now (1 hour): $" + String.format("%.2f", depositAmount) + "\n"
                        + "Estimated final amount: $" + String.format("%.2f", estimatedFinal) + "\n"
                        + "Payment method: " + selectedPaymentMethod + "\n\n"
                        + "A deposit fee will be charged upfront.\n"
                        + "If you do not check in within 30 minutes of the start time, the deposit is lost.\n"
                        + "Otherwise, it is applied to the final cost.";
        int confirm = JOptionPane.showConfirmDialog(
                this,
                confirmMessage,
                "Confirm Booking",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE
        );
        if (confirm != JOptionPane.OK_OPTION) {
            outputArea.append("\nBooking cancelled.");
            return;
        }

        Reservation reservation = new Reservation(
                "RES" + System.currentTimeMillis(),
                selected.getRoomId(),
                currentAccount.getAccountId(),
                "Booking from GUI",
                start,
                end,
                currentAccount.getAccountType(),
                hourlyRate,
                depositAmount,
                estimatedFinal,
                selectedPaymentMethod
        );
        currentBookingContext = new BookingContext(reservation);
        currentBookingContext.request();
        service.addReservation(reservation);
        outputArea.append(
                "\nCreated booking for: " + selected.getName()
                        + "\nHourly rate: $" + String.format("%.2f", reservation.getHourlyRate())
                        + "\nDeposit charged: $" + String.format("%.2f", reservation.getDepositAmount())
                        + "\nFinal amount due: $" + String.format("%.2f", reservation.getFinalAmount())
                        + "\nPayment method: " + reservation.getPaymentMethod() + "\nBooking Status: " + currentBookingContext.getStatus());
        
        refreshRooms();

    }

    private void closeRoomForMaintenance() {
        if (currentAccount == null) {
            outputArea.setText("Please log in first.");
            return;
        }
        List<Room> rooms = service.getAllRooms();
        if (rooms.isEmpty()) {
            outputArea.append("\nNo rooms to close.");
            return;
        }

        int selectedIndex = roomList.getSelectedIndex();
        if (selectedIndex < 0) {
            outputArea.append("\nPlease select a room first.");
            return;
        }

        Room selected = rooms.get(selectedIndex);
        service.closeRoomForMaintenance(selected.getRoomId());
        if (selected.isClosedForMaintenance()) {
            outputArea.append("\nClosed room for maintenance/repairs: " + selected.getName());
        } else {
            outputArea.append("\nRe-enabled room: " + selected.getName());
        }
        refreshRooms();
    }
    
    private void generateAdminAccount() {
        if (currentAccount == null || !"coordinator".equalsIgnoreCase(currentAccount.getAccountType())) {
            outputArea.setText("Only the chief event coordinator can generate admin accounts.");
            return;
        }
        JTextField newEmailField = new JTextField();
        JPasswordField newPasswordField = new JPasswordField();
        Object[] fields = {"New admin email:", newEmailField, "New admin password:", newPasswordField};
        int result = JOptionPane.showConfirmDialog(this, fields, "Generate Admin Account", JOptionPane.OK_CANCEL_OPTION);
        if (result != JOptionPane.OK_OPTION) {
            return;
        }
        String newEmail = newEmailField.getText().trim();
        String newPassword = new String(newPasswordField.getPassword());
        if (newEmail.isEmpty() || newPassword.isEmpty()) {
            outputArea.append("\nAdmin generation cancelled: email and password are required.");
            return;
        }
        Account admin = service.createAdminAccount(newEmail, newPassword);
        outputArea.append("\nGenerated admin account: " + admin.getEmail() + " (" + admin.getAccountId() + ")");
    }

    private void checkIn() {
        if (currentAccount == null) {
            outputArea.setText("Please log in first.");
            return;
        }
        List<Room> rooms = service.getAllRooms();
        if (rooms.isEmpty()) {
            outputArea.append("\nNo rooms available to check in to.");
            return;
        }

        int selectedIndex = roomList.getSelectedIndex();
        if (selectedIndex < 0) {
            outputArea.append("\nPlease select a room first.");
            return;
        }

        Room selected = rooms.get(selectedIndex);
        Reservation reservation = service.checkIn(selected.getRoomId());
        if (reservation != null) {
            outputArea.append("\nChecked in to: " + selected.getName());
            if (reservation.isDepositLost()) {
                outputArea.append(
                        "\nDeposit of $" + String.format("%.2f", reservation.getDepositAmount())
                                + " was lost (checked in more than 30 minutes after start)."
                                + "\nFinal amount due: $" + String.format("%.2f", reservation.getFinalAmount())
                );
            } else {
                outputArea.append(
                        "\nDeposit of $" + String.format("%.2f", reservation.getDepositAmount())
                                + " applied to the final cost."
                                + "\nRemaining amount due: $" + String.format("%.2f", reservation.getFinalAmount())
                );
            }
            String event = service.getLastCheckInEvent(selected.getRoomId());
            if (event != null) {
                outputArea.append("\n" + event);
            }
            refreshReservations();
        } else {
            outputArea.append("\nCannot check in: " + selected.getName()
                    + " has no active booking for your account.");
        }
    }

    private void refreshRooms() {
        roomListModel.clear();
        for (Room room : service.getAllRooms()) {
            String status = room.isEnabled() ? "Active" : "Disabled";
            String maintenance = room.isClosedForMaintenance() ? " | Maintenance/Repairs" : "";
            roomListModel.addElement(room.getName() + " (" + room.getRoomId() + ") - " + status + maintenance);
        }
        refreshReservations();
    }

    private void refreshReservations() {
        reservationListModel.clear();
        if (currentAccount == null) {
            return;
        }
        for (Reservation reservation : service.getReservationsForAccount(currentAccount.getAccountId())) {
            String status = reservation.isCanceled() ? "Cancelled"
                    : reservation.isCheckedIn() ? "Checked In"
                    : "Confirmed";
            String depositStatus = reservation.isDepositLost() ? "deposit lost"
                    : reservation.isCheckedIn() ? "deposit applied"
                    : "deposit pending";
            reservationListModel.addElement(
                    reservation.getReservationId() + " | " + reservation.getRoomId()
                            + " | " + reservation.getStartTime() + " - " + reservation.getEndTime()
                            + " | $" + String.format("%.2f", reservation.getHourlyRate()) + "/hr"
                            + " | final $" + String.format("%.2f", reservation.getFinalAmount())
                            + " | " + depositStatus
                            + " | " + status
            );
        }
    }

    private Reservation getSelectedReservation() {
        if (currentAccount == null) {
            outputArea.setText("Please log in first.");
            return null;
        }
        int index = reservationList.getSelectedIndex();
        List<Reservation> myReservations = service.getReservationsForAccount(currentAccount.getAccountId());
        if (index < 0 || index >= myReservations.size()) {
            outputArea.append("\nPlease select a booking first.");
            return null;
        }
        return myReservations.get(index);
    }

    private void cancelSelectedBooking() {
        Reservation reservation = getSelectedReservation();
        if (reservation == null) {
            return;
        }
        CancelBookingCommand command = new CancelBookingCommand(service, reservation);
        command.execute();
        outputArea.append("\n" + (command.wasSuccessful()
                ? "Cancelled booking: " + reservation.getReservationId()
                : "Could not cancel booking " + reservation.getReservationId() + " (already cancelled or past start time)."));
        refreshReservations();
    }

    private void editSelectedBooking() {
        Reservation reservation = getSelectedReservation();
        if (reservation == null) {
            return;
        }
        String minutesInput = JOptionPane.showInputDialog(this,
                "Shift booking by how many minutes? (e.g. 30, or -30 to move earlier)");
        if (minutesInput == null || minutesInput.isBlank()) {
            return;
        }
        long minutes;
        try {
            minutes = Long.parseLong(minutesInput.trim());
        } catch (NumberFormatException ex) {
            outputArea.append("\nInvalid number entered.");
            return;
        }
        LocalDateTime newStart = reservation.getStartTime().plusMinutes(minutes);
        LocalDateTime newEnd = reservation.getEndTime().plusMinutes(minutes);
        
        EditBookingCommand command = new EditBookingCommand(service, reservation, newStart, newEnd);
        command.execute();
        outputArea.append("\n" + (command.wasSuccessful()
                ? "Edited booking: " + reservation.getReservationId()
                : "Could not edit booking " + reservation.getReservationId() + " (past start time, cancelled, or room unavailable)."));
        refreshReservations();
    }

    private void extendSelectedBooking() {
        Reservation reservation = getSelectedReservation();
        if (reservation == null) {
            return;
        }
        String minutesInput = JOptionPane.showInputDialog(this, "Extend booking by how many minutes?");
        if (minutesInput == null || minutesInput.isBlank()) {
            return;
        }
        long minutes;
        try {
            minutes = Long.parseLong(minutesInput.trim());
        } catch (NumberFormatException ex) {
            outputArea.append("\nInvalid number entered.");
            return;
        }
        LocalDateTime newEnd = reservation.getEndTime().plusMinutes(minutes);
        ExtendBookingCommand command = new ExtendBookingCommand(service, reservation, newEnd);
        command.execute();
        outputArea.append("\n" + (command.wasSuccessful()
                ? "Extended booking: " + reservation.getReservationId()
                : "Could not extend booking " + reservation.getReservationId() + " (cancelled, or room unavailable, or not a later time)."));
        refreshReservations();
    }
}
