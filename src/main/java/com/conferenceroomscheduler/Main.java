package com.conferenceroomscheduler;

import javax.swing.SwingUtilities;

import com.conferenceroomscheduler.service.RoomSchedulerService;
import com.conferenceroomscheduler.ui.SchedulerFrame;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RoomSchedulerService service = new RoomSchedulerService();
            SchedulerFrame frame = new SchedulerFrame(service);
            frame.setVisible(true);
        });
    }
}
