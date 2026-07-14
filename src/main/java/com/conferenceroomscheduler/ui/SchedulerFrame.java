package com.conferenceroomscheduler.ui;

import com.conferenceroomscheduler.model.Account;
import com.conferenceroomscheduler.model.PaymentMethod;
import com.conferenceroomscheduler.model.Reservation;
import com.conferenceroomscheduler.model.Room;
import com.conferenceroomscheduler.service.RoomSchedulerService;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.util.List;

public class SchedulerFrame extends JFrame {
    private final RoomSchedulerService service;
    private final DefaultListModel<String> roomListModel = new DefaultListModel<>();
    private final JList<String> roomList = new JList<>(roomListModel);
    private final JTextArea outputArea = new JTextArea();
    private final JTextField emailField = new JTextField();
    private final JPasswordField passwordField = new JPasswordField();
    private final JButton loginButton = new JButton("Login");
    private final JButton addRoomButton = new JButton("Add Room");
    private final JButton reserveButton = new JButton("Create Booking");
    private final JButton maintenanceButton = new JButton("Close for Maintenance");
    private final JButton refreshButton = new JButton("Refresh");
    private final JButton signOutButton = new JButton("Sign Out");
    private final CardLayout cardLayout = new CardLayout();
    private final JPanel cards = new JPanel(cardLayout);
    private final JLabel welcomeLabel = new JLabel("Please sign in to continue");
    private Account currentAccount;

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
        JPanel loginPanel = new JPanel(new BorderLayout(10, 10));
        loginPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel loginForm = new JPanel(new GridLayout(3, 2, 8, 8));
        loginForm.add(new JLabel("Email"));
        loginForm.add(emailField);
        loginForm.add(new JLabel("Password"));
        loginForm.add(passwordField);
        loginForm.add(new JLabel(""));
        loginForm.add(loginButton);

        JTextArea loginInfo = new JTextArea("Use one of the CSV accounts to sign in.\nStudent, faculty, staff, and partner accounts are available.");
        loginInfo.setEditable(false);
        loginInfo.setOpaque(false);
        loginInfo.setLineWrap(true);
        loginInfo.setWrapStyleWord(true);

        loginPanel.add(loginInfo, BorderLayout.NORTH);
        loginPanel.add(loginForm, BorderLayout.CENTER);

        JPanel dashboardPanel = new JPanel(new BorderLayout(10, 10));
        dashboardPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel topBar = new JPanel(new BorderLayout(10, 10));
        topBar.add(welcomeLabel, BorderLayout.WEST);
        topBar.add(signOutButton, BorderLayout.EAST);

        JPanel actionPanel = new JPanel(new GridLayout(1, 4, 5, 5));
        actionPanel.add(reserveButton);
        actionPanel.add(addRoomButton);
        actionPanel.add(maintenanceButton);
        actionPanel.add(refreshButton);

        JPanel leftPanel = new JPanel(new BorderLayout(5, 5));
        leftPanel.setPreferredSize(new Dimension(320, 0));
        leftPanel.add(new JLabel("Available Rooms"), BorderLayout.NORTH);
        leftPanel.add(new JScrollPane(roomList), BorderLayout.CENTER);

        JPanel rightPanel = new JPanel(new BorderLayout(5, 5));
        rightPanel.add(new JLabel("Event Services Actions"), BorderLayout.NORTH);
        rightPanel.add(outputArea, BorderLayout.CENTER);

        dashboardPanel.add(topBar, BorderLayout.NORTH);
        dashboardPanel.add(actionPanel, BorderLayout.SOUTH);
        dashboardPanel.add(leftPanel, BorderLayout.WEST);
        dashboardPanel.add(rightPanel, BorderLayout.CENTER);

        loginButton.addActionListener(e -> login());
        passwordField.addActionListener(e -> login());
        addRoomButton.addActionListener(e -> addSampleRoom());
        reserveButton.addActionListener(e -> createSampleReservation());
        maintenanceButton.addActionListener(e -> closeRoomForMaintenance());
        refreshButton.addActionListener(e -> refreshRooms());
        signOutButton.addActionListener(e -> signOut());

        outputArea.setEditable(false);
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);

        cards.add(loginPanel, "login");
        cards.add(dashboardPanel, "dashboard");
        setContentPane(cards);
        cardLayout.show(cards, "login");
        updateActionVisibility();
    }

    private void login() {
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());
        Account account = service.authenticate(email, password);
        if (account == null) {
            outputArea.setText("Login failed. Use one of the CSV accounts.");
            return;
        }
        currentAccount = account;
        welcomeLabel.setText("Signed in as " + account.getEmail() + " (" + account.getAccountType() + ")");
        outputArea.setText("Welcome to the room booking system.");
        updateActionVisibility();
        refreshRooms();
        cardLayout.show(cards, "dashboard");
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
        reserveButton.setVisible(loggedIn);
        addRoomButton.setVisible(loggedIn && "staff".equalsIgnoreCase(currentAccount.getAccountType()));
        maintenanceButton.setVisible(loggedIn && "staff".equalsIgnoreCase(currentAccount.getAccountType()));
        refreshButton.setVisible(loggedIn);
        signOutButton.setVisible(loggedIn);
        welcomeLabel.setVisible(loggedIn);
    }

    private void addSampleRoom() {
        if (currentAccount == null) {
            outputArea.setText("Please log in first.");
            return;
        }
        int nextId = service.getAllRooms().size() + 1;
        Room room = service.createRoom("R" + 100 + nextId, "Room " + nextId, 10 + nextId, "Main Building", String.valueOf(nextId));
        outputArea.append("\nAdded room: " + room.getName());
        refreshRooms();
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

        Room selected = rooms.get(0);
        Reservation reservation = new Reservation(
                "RES" + System.currentTimeMillis(),
                selected.getRoomId(),
                currentAccount.getAccountId(),
                "Booking from GUI",
                LocalDateTime.now().plusHours(1),
                LocalDateTime.now().plusHours(2),
                currentAccount.getAccountType(),
                service.calculateHourlyRate(currentAccount.getAccountType()),
                service.calculateHourlyRate(currentAccount.getAccountType()),
                service.calculateHourlyRate(currentAccount.getAccountType()),
                PaymentMethod.CREDIT_CARD
        );
        service.addReservation(reservation);
        outputArea.append("\nCreated booking for: " + selected.getName());
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
        service.closeRoomForMaintenance(rooms.get(0).getRoomId());
        outputArea.append("\nClosed room for maintenance: " + rooms.get(0).getName());
        refreshRooms();
    }

    private void refreshRooms() {
        roomListModel.clear();
        for (Room room : service.getAllRooms()) {
            String status = room.isEnabled() ? "Active" : "Disabled";
            String maintenance = room.isClosedForMaintenance() ? " | Maintenance" : "";
            roomListModel.addElement(room.getName() + " (" + room.getRoomId() + ") - " + status + maintenance);
        }
    }
}
