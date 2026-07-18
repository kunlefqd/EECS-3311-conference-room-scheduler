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
    private final JTextField registerEmailField = new JTextField();
    private final JPasswordField registerPasswordField = new JPasswordField();
    private final JPasswordField confirmPasswordField = new JPasswordField();
    private final JComboBox<String> accountTypeCombo = new JComboBox<>(new String[]{
            "student", "faculty", "staff", "partner"
    });
    private final JCheckBox universityAccountCheckBox = new JCheckBox("University account (requires verification)");
    private final JButton registerButton = new JButton("Register");
    private final JButton addRoomButton = new JButton("Add Room");
    private final JButton reserveButton = new JButton("Create Booking");
    private final JComboBox<String> paymentMethodCombo = new JComboBox<>(new String[]{"CREDIT_CARD", "DEBIT_CARD", "INSTITUTIONAL_BILLING"});
    private final JButton maintenanceButton = new JButton("Close for Maintenance");
    private final JButton generateAdminButton = new JButton("Generate Admin Account");
    private final JButton checkInButton = new JButton("Check In");
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

        JPanel actionPanel = new JPanel(new GridLayout(1, 6, 5, 5));
        actionPanel.add(reserveButton);
        actionPanel.add(paymentMethodCombo);
        actionPanel.add(addRoomButton);
        actionPanel.add(maintenanceButton);
        actionPanel.add(generateAdminButton);
        actionPanel.add(checkInButton);
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
        registerButton.addActionListener(e -> register());
        addRoomButton.addActionListener(e -> addSampleRoom());
        reserveButton.addActionListener(e -> createSampleReservation());
        maintenanceButton.addActionListener(e -> closeRoomForMaintenance());
        generateAdminButton.addActionListener(e -> generateAdminAccount());
        checkInButton.addActionListener(e -> checkIn());
        refreshButton.addActionListener(e -> refreshRooms());
        signOutButton.addActionListener(e -> signOut());

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

        JPanel registerForm = new JPanel(new GridLayout(6, 2, 8, 8));
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
        registerForm.add(new JLabel(""));
        registerForm.add(registerButton);

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

    private void login() {
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());
        Account account = service.authenticate(email, password);
        if (account == null) {
            JOptionPane.showMessageDialog(this, "Login failed. Check your email and password.",
                    "Login", JOptionPane.ERROR_MESSAGE);
            return;
        }
        currentAccount = account;
        welcomeLabel.setText("Signed in as " + account.getEmail() + " (" + account.getAccountType() + ")");
        outputArea.setText("Welcome to the room booking system.");
        updateActionVisibility();
        refreshRooms();
        cardLayout.show(cards, "dashboard");
    }

    private void register() {
        String email = registerEmailField.getText();
        String password = new String(registerPasswordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());
        String accountType = (String) accountTypeCombo.getSelectedItem();
        boolean universityAccount = universityAccountCheckBox.isSelected();

        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match.",
                    "Register", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String error = service.registerAccount(email, password, accountType, universityAccount);
        if (error != null) {
            JOptionPane.showMessageDialog(this, error, "Register", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String successMessage = "Account created successfully. You can now log in.";
        if (universityAccount) {
            successMessage = "Account created. Verification required before full access.";
        }
        JOptionPane.showMessageDialog(this, successMessage, "Register", JOptionPane.INFORMATION_MESSAGE);

        registerEmailField.setText("");
        registerPasswordField.setText("");
        confirmPasswordField.setText("");
        universityAccountCheckBox.setSelected(false);
        accountTypeCombo.setSelectedIndex(0);
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
        generateAdminButton.setVisible(loggedIn && "coordinator".equalsIgnoreCase(currentAccount.getAccountType()));
        checkInButton.setVisible(loggedIn);
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

        int selectedIndex = roomList.getSelectedIndex();
        if (selectedIndex < 0) {
            outputArea.append("\nPlease select a room first.");
            return;
        }

        Room selected = rooms.get(selectedIndex);
        PaymentMethod selectedPaymentMethod = PaymentMethod.valueOf((String) paymentMethodCombo.getSelectedItem());
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
                selectedPaymentMethod
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

        int selectedIndex = roomList.getSelectedIndex();
        if (selectedIndex < 0) {
            outputArea.append("\nPlease select a room first.");
            return;
        }

        Room selected = rooms.get(selectedIndex);
        service.closeRoomForMaintenance(selected.getRoomId());
        outputArea.append("\nClosed room for maintenance: " + selected.getName());
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
        service.checkIn(selected.getRoomId());
        outputArea.append("\nChecked in to: " + selected.getName());
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
