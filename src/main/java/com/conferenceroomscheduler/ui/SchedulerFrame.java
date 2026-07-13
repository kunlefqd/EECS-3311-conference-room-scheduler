package com.conferenceroomscheduler.ui;

import com.conferenceroomscheduler.model.Reservation;
import com.conferenceroomscheduler.model.Room;
import com.conferenceroomscheduler.model.RoomType;
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
        setTitle("Conference Room Scheduler");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        buildUI();
        loadSampleData();
    }

    private void buildUI() {
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel leftPanel = new JPanel(new BorderLayout(5, 5));
        leftPanel.setPreferredSize(new Dimension(250, 0));
        leftPanel.add(new JLabel("Available Rooms"), BorderLayout.NORTH);
        leftPanel.add(new JScrollPane(roomList), BorderLayout.CENTER);

        JPanel rightPanel = new JPanel(new BorderLayout(5, 5));
        rightPanel.add(new JLabel("Scheduler Actions"), BorderLayout.NORTH);

        JButton addRoomButton = new JButton("Add Sample Room");
        JButton reserveButton = new JButton("Create Sample Reservation");
        JButton refreshButton = new JButton("Refresh Rooms");

        JPanel buttonPanel = new JPanel(new GridLayout(1, 3, 5, 5));
        buttonPanel.add(addRoomButton);
        buttonPanel.add(reserveButton);
        buttonPanel.add(refreshButton);
        rightPanel.add(buttonPanel, BorderLayout.NORTH);

        outputArea.setEditable(false);
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);
        JScrollPane outputScroll = new JScrollPane(outputArea);
        rightPanel.add(outputScroll, BorderLayout.CENTER);

        addRoomButton.addActionListener(e -> addSampleRoom());
        reserveButton.addActionListener(e -> createSampleReservation());
        refreshButton.addActionListener(e -> refreshRooms());

        mainPanel.add(leftPanel, BorderLayout.WEST);
        mainPanel.add(rightPanel, BorderLayout.CENTER);
        setContentPane(mainPanel);
    }

    private void loadSampleData() {
        Room room = service.createRoom("R1", "Conference Room A", 12, RoomType.MEETING);
        service.createRoom("R2", "Training Lab", 20, RoomType.TRAINING);
        outputArea.setText("Loaded sample rooms.\n" + "Room " + room.getName() + " is ready.");
        refreshRooms();
    }

    private void addSampleRoom() {
        int nextId = service.getAllRooms().size() + 1;
        Room room = service.createRoom("R" + nextId, "New Room " + nextId, 10 + nextId, RoomType.BOARDROOM);
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
                "Student",
                "Team Meeting",
                LocalDateTime.now().plusHours(1),
                LocalDateTime.now().plusHours(2),
                false
        );
        service.addReservation(reservation);
        outputArea.append("\nCreated reservation for: " + selected.getName());
        refreshRooms();
    }

    private void refreshRooms() {
        roomListModel.clear();
        for (Room room : service.getAllRooms()) {
            roomListModel.addElement(room.getName() + " (" + room.getRoomId() + ")");
        }
    }
}
