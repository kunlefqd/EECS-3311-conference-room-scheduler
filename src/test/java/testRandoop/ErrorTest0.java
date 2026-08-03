package testRandoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator0 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor1 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.conferenceroomscheduler.model.Account account6 = chiefEventCoordinator0.generateAdminAccount("Unverified badge detected for Cancelled.", "", "student");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator0 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor1 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.conferenceroomscheduler.model.Account account6 = chiefEventCoordinator0.generateAdminAccount("Unverified badge detected for Cancelled.", "faculty", "ADMIN-69");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator0 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        chiefEventCoordinator0.notifyObservers("");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator0 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        chiefEventCoordinator0.notifyObservers("Booking confirmed.");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator0 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor1 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        chiefEventCoordinator0.notifyObservers("ADMIN-69");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator0 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        chiefEventCoordinator0.notifyObservers("Unverified badge detected for .");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Booking confirmed.", true, false);
        com.conferenceroomscheduler.model.AdminAccount adminAccount4 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str5 = adminAccount4.getEmail();
        adminAccount4.setVerified(false);
        adminAccount4.setIdentifier("Checked in.");
        boolean boolean10 = adminAccount4.isVerified();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator0 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor1 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor1);
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator3 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor4 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator3.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor4);
        roomSensor4.update("Unverified badge detected for Cancelled.");
        roomSensor4.update("Booking complete");
        chiefEventCoordinator0.removeObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor4);
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor11 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor11.update("Checked in.");
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        chiefEventCoordinator0.notifyObservers("Cancelled");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator0 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor1 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor1);
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator3 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor4 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator3.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor4);
        roomSensor4.update("Unverified badge detected for Cancelled.");
        roomSensor4.update("Booking complete");
        chiefEventCoordinator0.removeObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor4);
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor11 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor11.update("Checked in.");
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        chiefEventCoordinator0.notifyObservers("ADMIN-69");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator0 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.conferenceroomscheduler.model.Account account4 = chiefEventCoordinator0.generateAdminAccount("Booking confirmed.", "admin", "hi!");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator0 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor1 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor1);
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator3 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor4 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator3.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor4);
        roomSensor4.update("Unverified badge detected for Cancelled.");
        roomSensor4.update("Booking complete");
        chiefEventCoordinator0.removeObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor4);
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor11 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor11.update("Checked in.");
        roomSensor11.update("Booking confirmed.");
        roomSensor11.update("Booking complete");
        roomSensor11.update("");
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.conferenceroomscheduler.model.Account account24 = chiefEventCoordinator0.generateAdminAccount("", "faculty", "Cancelled");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator0 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor1 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor1);
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator3 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor4 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator3.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor4);
        roomSensor4.update("Unverified badge detected for Cancelled.");
        roomSensor4.update("Booking complete");
        chiefEventCoordinator0.removeObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor4);
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor11 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor11.update("Checked in.");
        roomSensor11.update("Checked in.");
        roomSensor11.update("Cancelled");
        roomSensor11.update("Booking confirmed.");
        chiefEventCoordinator0.removeObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.conferenceroomscheduler.model.Account account24 = chiefEventCoordinator0.generateAdminAccount("student", "partner", "admin");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator0 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor1 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor1);
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator3 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor4 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator3.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor4);
        roomSensor4.update("Unverified badge detected for Cancelled.");
        roomSensor4.update("Booking complete");
        chiefEventCoordinator0.removeObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor4);
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor11 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor11.update("Checked in.");
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor11);
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor15 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor15.update("Checked in.");
        roomSensor15.update("Booking confirmed.");
        roomSensor15.update("Booking complete");
        roomSensor15.update("");
        roomSensor15.update("faculty");
        roomSensor15.update("faculty");
        chiefEventCoordinator0.removeObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor15);
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor29 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor29.update("Checked in.");
        roomSensor29.update("Checked in.");
        roomSensor29.update("Cancelled");
        roomSensor29.update("admin");
        roomSensor29.update("Booking confirmed.");
        roomSensor29.update("Unverified badge detected for Cancelled.");
        roomSensor29.update("Booking confirmed.");
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor29);
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor45 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.conferenceroomscheduler.model.Account account50 = chiefEventCoordinator0.generateAdminAccount("faculty", "ADMIN-69", "");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator0 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor1 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor1);
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator3 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor4 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator3.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor4);
        roomSensor4.update("Unverified badge detected for Cancelled.");
        roomSensor4.update("Booking complete");
        chiefEventCoordinator0.removeObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor4);
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor11 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor11.update("Checked in.");
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor11);
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor15 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor15.update("Checked in.");
        roomSensor15.update("Booking confirmed.");
        roomSensor15.update("Booking complete");
        roomSensor15.update("");
        roomSensor15.update("faculty");
        roomSensor15.update("faculty");
        chiefEventCoordinator0.removeObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor15);
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor29 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor29.update("Checked in.");
        roomSensor29.update("Checked in.");
        roomSensor29.update("Cancelled");
        roomSensor29.update("admin");
        roomSensor29.update("Booking confirmed.");
        roomSensor29.update("Unverified badge detected for Cancelled.");
        roomSensor29.update("Booking confirmed.");
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor29);
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor45 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        chiefEventCoordinator0.notifyObservers("ADMIN-69");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator0 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor1 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.conferenceroomscheduler.model.Account account6 = chiefEventCoordinator0.generateAdminAccount("", "Unverified badge detected for Cancelled.", "partner");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator0 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor1 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor1);
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator3 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor4 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator3.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor4);
        roomSensor4.update("Unverified badge detected for Cancelled.");
        roomSensor4.update("Booking complete");
        chiefEventCoordinator0.removeObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor4);
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor11 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor11.update("Checked in.");
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor11);
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor15 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor15.update("Checked in.");
        roomSensor15.update("Booking confirmed.");
        roomSensor15.update("Booking complete");
        roomSensor15.update("");
        roomSensor15.update("faculty");
        roomSensor15.update("faculty");
        chiefEventCoordinator0.removeObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor15);
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor29 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor29.update("Checked in.");
        roomSensor29.update("Checked in.");
        roomSensor29.update("Cancelled");
        roomSensor29.update("admin");
        roomSensor29.update("Booking confirmed.");
        roomSensor29.update("Unverified badge detected for Cancelled.");
        roomSensor29.update("Booking confirmed.");
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor29);
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor45 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor45.update("Checked in.");
        roomSensor45.update("Checked in.");
        roomSensor45.update("Cancelled");
        roomSensor45.update("admin");
        roomSensor45.update("Checked in.");
        chiefEventCoordinator0.removeObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.conferenceroomscheduler.model.Account account60 = chiefEventCoordinator0.generateAdminAccount("", "partner", "faculty");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator0 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor1 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor1);
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator3 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor4 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator3.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor4);
        roomSensor4.update("Unverified badge detected for Cancelled.");
        roomSensor4.update("Booking complete");
        chiefEventCoordinator0.removeObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor4);
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor11 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor11.update("Checked in.");
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor11);
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor15 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor15.update("Checked in.");
        roomSensor15.update("Booking confirmed.");
        roomSensor15.update("Booking complete");
        roomSensor15.update("");
        roomSensor15.update("faculty");
        roomSensor15.update("faculty");
        chiefEventCoordinator0.removeObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor15);
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor29 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor29.update("Checked in.");
        roomSensor29.update("Checked in.");
        roomSensor29.update("Cancelled");
        roomSensor29.update("admin");
        roomSensor29.update("Booking confirmed.");
        roomSensor29.update("Unverified badge detected for Cancelled.");
        roomSensor29.update("Booking confirmed.");
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor29);
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor45 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor45.update("Checked in.");
        roomSensor45.update("Checked in.");
        roomSensor45.update("Cancelled");
        roomSensor45.update("admin");
        roomSensor45.update("Checked in.");
        chiefEventCoordinator0.removeObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        chiefEventCoordinator0.notifyObservers("Verified badge detected for ADMIN-69.");
    }
}

