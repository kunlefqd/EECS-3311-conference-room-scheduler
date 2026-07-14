package com.conferenceroomscheduler.ui;

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

    public SchedulerFrame(RoomSchedulerService service) {
        this.service = service;
        setTitle("York University Room Booking System");
        setSize(800, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        buildUI();
        loadSampleData();
    }

    private void buildUI() {
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel leftPanel = new JPanel(new BorderLayout(5, 5));
        leftPanel.setPreferredSize(new Dimension(280, 0));
        leftPanel.add(new JLabel("Available Rooms"), BorderLayout.NORTH);
        leftPanel.add(new JScrollPane(roomList), BorderLayout.CENTER);

        JPanel rightPanel = new JPanel(new BorderLayout(5, 5));
        rightPanel.add(new JLabel("Event Services Actions"), BorderLayout.NORTH);

        JButton addRoomButton = new JButton("Add Room");
        JButton reserveButton = new JButton("Create Booking");
        JButton maintenanceButton = new JButton("Close for Maintenance");
        JButton refreshButton = new JButton("Refresh");

        JPanel buttonPanel = new JPanel(new GridLayout(1, 4, 5, 5));
        buttonPanel.add(addRoomButton);
        buttonPanel.add(reserveButton);
        buttonPanel.add(maintenanceButton);
        buttonPanel.add(refreshButton);
        rightPanel.add(buttonPanel, BorderLayout.NORTH);

        outputArea.setEditable(false);
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);
        JScrollPane outputScroll = new JScrollPane(outputArea);
        rightPanel.add(outputScroll, BorderLayout.CENTER);

        addRoomButton.addActionListener(e -> addSampleRoom());
        reserveButton.addActionListener(e -> createSampleReservation());
        maintenanceButton.addActionListener(e -> closeRoomForMaintenance());
        refreshButton.addActionListener(e -> refreshRooms());

        mainPanel.add(leftPanel, BorderLayout.WEST);
        mainPanel.add(rightPanel, BorderLayout.CENTER);
        setContentPane(mainPanel);
    }

    private void loadSampleData() {
        service.createRoom("R101", "Meeting Room A", 12, "Ross Building", "101");
        service.createRoom("R202", "Conference Room B", 30, "Accolade East", "202");
        outputArea.setText("York University room booking system ready.\nRooms loaded from Event Services.");
        refreshRooms();
    }

    private void addSampleRoom() {
        int nextId = service.getAllRooms().size() + 1;
        Room room = service.createRoom("R" + 100 + nextId, "Room " + nextId, 10 + nextId, "Main Building", String.valueOf(nextId));
        outputArea.append("\nAdded room: " + room.getName());
        refreshRooms();
    }

    private void createSampleReservation() {
        List<Room> rooms = service.getAllRooms();
        if (rooms.isEmpty()) {
            outputArea.append("\nNo rooms available to reserve.");
            return;
        }

        Room selected = rooms.get(0);
        Reservation reservation = new Reservation(
                "RES" + System.currentTimeMillis(),
                selected.getRoomId(),
                "U1",
                "Student Team Meeting",
                LocalDateTime.now().plusHours(1),
                LocalDateTime.now().plusHours(2),
                "student",
                service.calculateHourlyRate("student"),
                service.calculateHourlyRate("student"),
                service.calculateHourlyRate("student"),
                PaymentMethod.CREDIT_CARD
        );
        service.addReservation(reservation);
        outputArea.append("\nCreated booking for: " + selected.getName());
        refreshRooms();
    }

    private void closeRoomForMaintenance() {
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
