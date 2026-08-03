package testRandoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod12 = null;
        com.conferenceroomscheduler.model.Reservation reservation13 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime6, localDateTime7, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod12);
        reservation13.setDepositLost(true);
        java.time.LocalDateTime localDateTime16 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand17 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService1, reservation13, localDateTime16);
        reservation13.setHourlyRate((double) (-1.0f));
        boolean boolean20 = reservation13.isDepositLost();
        java.lang.String str21 = reservation13.getReservationId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand22 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation13);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod23 = reservation13.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentMethod23);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, true);
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory4 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account12 = facultyFactory4.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account20 = facultyFactory4.createAccount("", "hi!", "", "", false, true, "");
        account20.setAccountType("Cancelled");
        java.lang.String str23 = account20.getAccountId();
        boolean boolean24 = occupancySensor3.detectOccupancy(account20);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher25 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor29 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher30 = null;
        occupancySensor29.setSubject(checkInPublisher30);
        occupancySensor29.occupied = true;
        occupancySensor29.setDetected(false);
        checkInPublisher25.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor29);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor40 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor40.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount49 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount49.setEmail("");
        boolean boolean52 = occupancySensor40.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount49);
        checkInPublisher25.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor40);
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory54 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account62 = facultyFactory54.createAccount("", "Cancelled", "", "hi!", false, false, "");
        account62.setAccountNumber("hi!");
        account62.setUniversityAccount(true);
        account62.setAccountType("Cancelled");
        checkInPublisher25.notifyObservers(account62);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor73 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, true);
        boolean boolean74 = occupancySensor73.isOccupied();
        checkInPublisher25.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor73);
        occupancySensor3.setSubject(checkInPublisher25);
        com.conferenceroomscheduler.model.AdminAccount adminAccount83 = new com.conferenceroomscheduler.model.AdminAccount("Booking confirmed.", "ADMIN-69", "Booking complete", true, true, "");
        checkInPublisher25.notifyObservers((com.conferenceroomscheduler.model.Account) adminAccount83);
        adminAccount83.setAccountType("Cancelled");
        org.junit.Assert.assertNotNull(account12);
        org.junit.Assert.assertNotNull(account20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(account62);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getReservationId();
        java.lang.String str4 = reservation1.getTitle();
        java.time.LocalDateTime localDateTime5 = null;
        reservation1.setStartTime(localDateTime5);
        java.lang.String str7 = reservation1.getTitle();
        reservation1.setRoomId("partner");
        double double10 = reservation1.getFinalAmount();
        java.lang.String str11 = reservation1.getTitle();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        java.lang.String str6 = badgeScan3.getBadgeId();
        java.lang.String str7 = badgeScan3.getRoomId();
        java.lang.String str8 = badgeScan3.getBadgeId();
        java.lang.String str9 = badgeScan3.getRoomId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setRoomId("Booking confirmed.");
        java.lang.String str6 = badgeScan3.getBadgeId();
        badgeScan3.setVerified(true);
        java.lang.String str9 = badgeScan3.getBadgeId();
        boolean boolean10 = badgeScan3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState0 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str1 = pendingBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setFinalAmount((double) (byte) 100);
        reservation2.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext7 = new com.conferenceroomscheduler.patterns.BookingContext(reservation2);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState8 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str9 = cancelledBookingState8.getName();
        bookingContext7.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState8);
        pendingBookingState0.handle(bookingContext7);
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation();
        reservation12.setFinalAmount((double) (byte) 100);
        java.lang.String str15 = reservation12.getRoomId();
        reservation12.setFinalAmount((double) 10.0f);
        java.lang.String str18 = reservation12.getUserId();
        reservation12.setFinalAmount((double) ' ');
        java.lang.String str21 = reservation12.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext22 = new com.conferenceroomscheduler.patterns.BookingContext(reservation12);
        bookingContext22.request();
        java.lang.String str24 = bookingContext22.getStatus();
        pendingBookingState0.handle(bookingContext22);
        java.lang.String str26 = pendingBookingState0.getName();
        java.lang.String str27 = pendingBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pending" + "'", str1, "Pending");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Pending" + "'", str24, "Pending");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Pending" + "'", str26, "Pending");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Pending" + "'", str27, "Pending");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand8 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str9 = reservation1.getTitle();
        reservation1.setFinalAmount((double) (-1.0f));
        reservation1.setAccountType("Checked in.");
        java.time.LocalDateTime localDateTime14 = reservation1.getStartTime();
        reservation1.setExtended(false);
        java.lang.String str17 = reservation1.getUserId();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("student", true, true);
        com.conferenceroomscheduler.model.AdminAccount adminAccount4 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str5 = adminAccount4.getAccountId();
        adminAccount4.setIdentifier("hi!");
        java.lang.String str8 = adminAccount4.getAccountNumber();
        java.lang.String str9 = adminAccount4.getPassword();
        boolean boolean10 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount4);
        com.conferenceroomscheduler.model.Badge badge11 = adminAccount4.getBadge();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(badge11);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        reservation1.setDepositAmount((double) (byte) 0);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand10 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str11 = reservation1.getTitle();
        reservation1.setRoomId("Cancelled");
        java.lang.String str14 = reservation1.getTitle();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState0 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext2 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState3 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext2.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState3);
        com.conferenceroomscheduler.patterns.BookingState bookingState5 = bookingContext2.getState();
        com.conferenceroomscheduler.model.Reservation reservation6 = bookingContext2.getReservation();
        cancelledBookingState0.handle(bookingContext2);
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState8 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str9 = confirmedBookingState8.getName();
        java.lang.String str10 = confirmedBookingState8.getName();
        com.conferenceroomscheduler.model.Reservation reservation11 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext12 = new com.conferenceroomscheduler.patterns.BookingContext(reservation11);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState13 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext12.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState13);
        com.conferenceroomscheduler.model.Reservation reservation15 = bookingContext12.getReservation();
        confirmedBookingState8.handle(bookingContext12);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState17 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState18 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation19 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext20 = new com.conferenceroomscheduler.patterns.BookingContext(reservation19);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState21 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext20.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState21);
        com.conferenceroomscheduler.patterns.BookingState bookingState23 = bookingContext20.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState24 = bookingContext20.getState();
        cancelledBookingState18.handle(bookingContext20);
        checkedInBookingState17.handle(bookingContext20);
        java.lang.String str27 = checkedInBookingState17.getName();
        com.conferenceroomscheduler.model.Reservation reservation28 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext29 = new com.conferenceroomscheduler.patterns.BookingContext(reservation28);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState30 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext29.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState30);
        com.conferenceroomscheduler.model.Reservation reservation32 = bookingContext29.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation33 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext34 = new com.conferenceroomscheduler.patterns.BookingContext(reservation33);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState35 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext34.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState35);
        com.conferenceroomscheduler.patterns.BookingState bookingState37 = bookingContext34.getState();
        bookingContext29.setState(bookingState37);
        checkedInBookingState17.handle(bookingContext29);
        com.conferenceroomscheduler.model.Reservation reservation40 = bookingContext29.getReservation();
        java.lang.String str41 = bookingContext29.getStatus();
        java.lang.String str42 = bookingContext29.getStatus();
        confirmedBookingState8.handle(bookingContext29);
        cancelledBookingState0.handle(bookingContext29);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState45 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation46 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext47 = new com.conferenceroomscheduler.patterns.BookingContext(reservation46);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState48 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext47.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState48);
        com.conferenceroomscheduler.patterns.BookingState bookingState50 = bookingContext47.getState();
        com.conferenceroomscheduler.model.Reservation reservation51 = bookingContext47.getReservation();
        cancelledBookingState45.handle(bookingContext47);
        java.lang.String str53 = cancelledBookingState45.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState54 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState55 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation56 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext57 = new com.conferenceroomscheduler.patterns.BookingContext(reservation56);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState58 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext57.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState58);
        com.conferenceroomscheduler.patterns.BookingState bookingState60 = bookingContext57.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState61 = bookingContext57.getState();
        cancelledBookingState55.handle(bookingContext57);
        checkedInBookingState54.handle(bookingContext57);
        com.conferenceroomscheduler.model.Reservation reservation64 = new com.conferenceroomscheduler.model.Reservation();
        reservation64.setFinalAmount((double) (byte) 100);
        reservation64.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext69 = new com.conferenceroomscheduler.patterns.BookingContext(reservation64);
        checkedInBookingState54.handle(bookingContext69);
        com.conferenceroomscheduler.model.Reservation reservation71 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext72 = new com.conferenceroomscheduler.patterns.BookingContext(reservation71);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState73 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext72.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState73);
        checkedInBookingState54.handle(bookingContext72);
        com.conferenceroomscheduler.model.Reservation reservation76 = new com.conferenceroomscheduler.model.Reservation();
        reservation76.setFinalAmount((double) (byte) 100);
        java.lang.String str79 = reservation76.getRoomId();
        reservation76.setFinalAmount((double) 10.0f);
        java.lang.String str82 = reservation76.getUserId();
        reservation76.setFinalAmount((double) ' ');
        java.lang.String str85 = reservation76.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext86 = new com.conferenceroomscheduler.patterns.BookingContext(reservation76);
        bookingContext86.request();
        java.lang.String str88 = bookingContext86.getStatus();
        checkedInBookingState54.handle(bookingContext86);
        cancelledBookingState45.handle(bookingContext86);
        java.lang.String str91 = cancelledBookingState45.getName();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext92 = null;
        cancelledBookingState45.handle(bookingContext92);
        bookingContext29.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState45);
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNull(reservation6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking confirmed." + "'", str9, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking confirmed." + "'", str10, "Booking confirmed.");
        org.junit.Assert.assertNull(reservation15);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertNotNull(bookingState24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Checked in." + "'", str27, "Checked in.");
        org.junit.Assert.assertNull(reservation32);
        org.junit.Assert.assertNotNull(bookingState37);
        org.junit.Assert.assertNull(reservation40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Booking complete" + "'", str41, "Booking complete");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Booking complete" + "'", str42, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState50);
        org.junit.Assert.assertNull(reservation51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Cancelled" + "'", str53, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState60);
        org.junit.Assert.assertNotNull(bookingState61);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Pending" + "'", str88, "Pending");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "Cancelled" + "'", str91, "Cancelled");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Booking complete", true, true, "Checked in.");
        com.conferenceroomscheduler.model.Badge badge7 = studentAccount6.getBadge();
        org.junit.Assert.assertNotNull(badge7);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState0 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext6 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState7 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str8 = cancelledBookingState7.getName();
        bookingContext6.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState7);
        pendingBookingState0.handle(bookingContext6);
        java.lang.String str11 = pendingBookingState0.getName();
        java.lang.String str12 = pendingBookingState0.getName();
        java.lang.String str13 = pendingBookingState0.getName();
        java.lang.String str14 = pendingBookingState0.getName();
        java.lang.String str15 = pendingBookingState0.getName();
        java.lang.String str16 = pendingBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pending" + "'", str11, "Pending");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pending" + "'", str12, "Pending");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pending" + "'", str13, "Pending");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Pending" + "'", str14, "Pending");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Pending" + "'", str15, "Pending");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pending" + "'", str16, "Pending");
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setDepositAmount(0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand9 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime7, localDateTime8);
        java.lang.String str10 = reservation1.getUserId();
        reservation1.setExtended(false);
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        java.lang.String str6 = badgeScan3.getBadgeId();
        java.lang.String str7 = badgeScan3.getRoomId();
        boolean boolean8 = badgeScan3.isVerified();
        badgeScan3.setVerified(false);
        java.lang.String str11 = badgeScan3.getRoomId();
        badgeScan3.setRoomId("admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean4 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor3.subject = checkInPublisher5;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher7 = occupancySensor3.getSubject();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher8 = occupancySensor3.getSubject();
        occupancySensor3.roomId = "faculty";
        com.conferenceroomscheduler.model.AdminAccount adminAccount11 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str12 = adminAccount11.getEmail();
        boolean boolean13 = adminAccount11.isUniversityAccount();
        adminAccount11.setVerified(true);
        java.lang.String str16 = adminAccount11.getEmail();
        java.lang.String str17 = adminAccount11.getEmail();
        boolean boolean18 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount11);
        java.lang.String str19 = adminAccount11.getAccountNumber();
        java.lang.String str20 = adminAccount11.getEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(checkInPublisher7);
        org.junit.Assert.assertNull(checkInPublisher8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Pending", (int) (byte) 1, true, "hi!", "Pending");
        room6.setRoomNumber("Booking complete");
        room6.setName("Checked in.");
        boolean boolean11 = room6.isEnabled();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor15 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean16 = occupancySensor15.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher17 = null;
        occupancySensor15.subject = checkInPublisher17;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher19 = occupancySensor15.getSubject();
        room6.setOccupancySensor(occupancySensor15);
        occupancySensor15.setDetected(false);
        occupancySensor15.setDetected(true);
        boolean boolean25 = occupancySensor15.isOccupied();
        com.conferenceroomscheduler.model.Badge badge26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = occupancySensor15.scanIdBadge(badge26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.model.Badge.getEmail()\" because \"badge\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(checkInPublisher19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        java.lang.String str4 = reservation1.getAccountType();
        java.time.LocalDateTime localDateTime5 = reservation1.getEndTime();
        java.time.LocalDateTime localDateTime6 = reservation1.getEndTime();
        java.lang.String str7 = reservation1.getAccountType();
        double double8 = reservation1.getFinalAmount();
        reservation1.setCheckedIn(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod30 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation31 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime24, localDateTime25, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod30);
        com.conferenceroomscheduler.model.Reservation reservation32 = new com.conferenceroomscheduler.model.Reservation("admin", "", "Booking complete", "Pending", localDateTime14, localDateTime15, "", (double) 'a', (double) 10L, 0.0d, paymentMethod30);
        com.conferenceroomscheduler.model.Reservation reservation33 = new com.conferenceroomscheduler.model.Reservation("hi!", "faculty", "", "Pending", localDateTime4, localDateTime5, "Unverified badge detected for Cancelled.", (double) 1.0f, (double) 0L, (-1.0d), paymentMethod30);
        java.lang.String str34 = reservation33.getReservationId();
        java.time.LocalDateTime localDateTime35 = null;
        reservation33.setStartTime(localDateTime35);
        boolean boolean37 = reservation33.isCanceled();
        reservation33.setCanceled(false);
        org.junit.Assert.assertTrue("'" + paymentMethod30 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod30.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory0 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account8 = facultyFactory0.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account16 = facultyFactory0.createAccount("", "hi!", "", "", false, true, "");
        com.conferenceroomscheduler.model.Account account24 = facultyFactory0.createAccount("Cancelled", "Pending", "Cancelled", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account32 = facultyFactory0.createAccount("", "hi!", "", "Pending", true, false, "Cancelled");
        com.conferenceroomscheduler.model.Account account40 = facultyFactory0.createAccount("faculty", "Pending", "Checked in.", "faculty", true, true, "Booking confirmed.");
        com.conferenceroomscheduler.model.Badge badge41 = account40.getBadge();
        java.lang.String str42 = badge41.getAccountId();
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
        org.junit.Assert.assertNotNull(account32);
        org.junit.Assert.assertNotNull(account40);
        org.junit.Assert.assertNotNull(badge41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "faculty" + "'", str42, "faculty");
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState0 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState1 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation2 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext3 = new com.conferenceroomscheduler.patterns.BookingContext(reservation2);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState4 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext3.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState4);
        com.conferenceroomscheduler.patterns.BookingState bookingState6 = bookingContext3.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState7 = bookingContext3.getState();
        cancelledBookingState1.handle(bookingContext3);
        checkedInBookingState0.handle(bookingContext3);
        java.lang.String str10 = checkedInBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation11 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext12 = new com.conferenceroomscheduler.patterns.BookingContext(reservation11);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState13 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext12.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState13);
        com.conferenceroomscheduler.model.Reservation reservation15 = bookingContext12.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation16 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext17 = new com.conferenceroomscheduler.patterns.BookingContext(reservation16);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState18 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext17.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState18);
        com.conferenceroomscheduler.patterns.BookingState bookingState20 = bookingContext17.getState();
        bookingContext12.setState(bookingState20);
        checkedInBookingState0.handle(bookingContext12);
        com.conferenceroomscheduler.model.Reservation reservation23 = new com.conferenceroomscheduler.model.Reservation();
        reservation23.setFinalAmount((double) (byte) 100);
        reservation23.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext28 = new com.conferenceroomscheduler.patterns.BookingContext(reservation23);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState29 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str30 = cancelledBookingState29.getName();
        bookingContext28.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState29);
        com.conferenceroomscheduler.model.Reservation reservation32 = bookingContext28.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation33 = bookingContext28.getReservation();
        checkedInBookingState0.handle(bookingContext28);
        com.conferenceroomscheduler.model.Reservation reservation35 = new com.conferenceroomscheduler.model.Reservation();
        reservation35.setFinalAmount((double) (byte) 100);
        reservation35.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext40 = new com.conferenceroomscheduler.patterns.BookingContext(reservation35);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState41 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str42 = cancelledBookingState41.getName();
        bookingContext40.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState41);
        bookingContext40.request();
        checkedInBookingState0.handle(bookingContext40);
        java.lang.String str46 = bookingContext40.getStatus();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Checked in." + "'", str10, "Checked in.");
        org.junit.Assert.assertNull(reservation15);
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Cancelled" + "'", str30, "Cancelled");
        org.junit.Assert.assertNotNull(reservation32);
        org.junit.Assert.assertNotNull(reservation33);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Cancelled" + "'", str42, "Cancelled");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Booking complete" + "'", str46, "Booking complete");
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setName("faculty");
        room6.setEnabled(true);
        java.lang.String str15 = room6.getBuilding();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("Unverified badge detected for Cancelled.", "Pending", "faculty", true, false, "partner");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Unverified badge detected for .", "Checked in.", false);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Pending", "Pending", (int) (short) -1, "", "Cancelled");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("Cancelled", "ADMIN-69", (-1), "faculty", "Pending");
        room18.setName("partner");
        java.lang.String str21 = room18.getBuilding();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "faculty" + "'", str21, "faculty");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("admin", (double) (short) -1);
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("hi!", (double) (-1.0f));
        boolean boolean9 = debitCardPaymentStrategy0.processPayment("Booking complete", (double) '#');
        boolean boolean12 = debitCardPaymentStrategy0.processPayment("ADMIN-69", (double) 'a');
        boolean boolean15 = debitCardPaymentStrategy0.processPayment("Checked in.", (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setRoomId("hi!");
        reservation0.setCheckedIn(true);
        reservation0.setHourlyRate((double) 'a');
        java.lang.String str10 = reservation0.getAccountType();
        reservation0.setExtended(false);
        java.time.LocalDateTime localDateTime13 = null;
        reservation0.setStartTime(localDateTime13);
        boolean boolean15 = reservation0.isDepositLost();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Cancelled", "hi!", "hi!", "", (int) (short) 1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRoomId();
        java.lang.String str9 = bookingRequest7.getRequestId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.lang.String str11 = bookingRequest7.getRequestId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cancelled" + "'", str11, "Cancelled");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        com.conferenceroomscheduler.model.Reservation reservation0 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext1 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState2 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext1.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState2);
        com.conferenceroomscheduler.patterns.BookingState bookingState4 = bookingContext1.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState5 = bookingContext1.getState();
        bookingContext1.request();
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState7 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str8 = confirmedBookingState7.getName();
        java.lang.String str9 = confirmedBookingState7.getName();
        java.lang.String str10 = confirmedBookingState7.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState11 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState12 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation13 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext14 = new com.conferenceroomscheduler.patterns.BookingContext(reservation13);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState15 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext14.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState15);
        com.conferenceroomscheduler.patterns.BookingState bookingState17 = bookingContext14.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState18 = bookingContext14.getState();
        cancelledBookingState12.handle(bookingContext14);
        checkedInBookingState11.handle(bookingContext14);
        java.lang.String str21 = checkedInBookingState11.getName();
        com.conferenceroomscheduler.model.Reservation reservation22 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext23 = new com.conferenceroomscheduler.patterns.BookingContext(reservation22);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState24 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext23.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState24);
        com.conferenceroomscheduler.model.Reservation reservation26 = bookingContext23.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation27 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext28 = new com.conferenceroomscheduler.patterns.BookingContext(reservation27);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState29 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext28.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState29);
        com.conferenceroomscheduler.patterns.BookingState bookingState31 = bookingContext28.getState();
        bookingContext23.setState(bookingState31);
        checkedInBookingState11.handle(bookingContext23);
        com.conferenceroomscheduler.model.Reservation reservation34 = bookingContext23.getReservation();
        confirmedBookingState7.handle(bookingContext23);
        java.lang.String str36 = confirmedBookingState7.getName();
        java.lang.String str37 = confirmedBookingState7.getName();
        java.lang.String str38 = confirmedBookingState7.getName();
        bookingContext1.setState((com.conferenceroomscheduler.patterns.BookingState) confirmedBookingState7);
        java.lang.String str40 = confirmedBookingState7.getName();
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState41 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str42 = confirmedBookingState41.getName();
        java.lang.String str43 = confirmedBookingState41.getName();
        java.lang.String str44 = confirmedBookingState41.getName();
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState45 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation46 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext47 = new com.conferenceroomscheduler.patterns.BookingContext(reservation46);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState48 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext47.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState48);
        completedBookingState45.handle(bookingContext47);
        confirmedBookingState41.handle(bookingContext47);
        confirmedBookingState7.handle(bookingContext47);
        java.lang.String str53 = confirmedBookingState7.getName();
        java.lang.String str54 = confirmedBookingState7.getName();
        com.conferenceroomscheduler.model.Reservation reservation55 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext56 = new com.conferenceroomscheduler.patterns.BookingContext(reservation55);
        confirmedBookingState7.handle(bookingContext56);
        org.junit.Assert.assertNotNull(bookingState4);
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking confirmed." + "'", str8, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking confirmed." + "'", str9, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking confirmed." + "'", str10, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState17);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Checked in." + "'", str21, "Checked in.");
        org.junit.Assert.assertNull(reservation26);
        org.junit.Assert.assertNotNull(bookingState31);
        org.junit.Assert.assertNull(reservation34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Booking confirmed." + "'", str36, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Booking confirmed." + "'", str37, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Booking confirmed." + "'", str38, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Booking confirmed." + "'", str40, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Booking confirmed." + "'", str42, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Booking confirmed." + "'", str43, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Booking confirmed." + "'", str44, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Booking confirmed." + "'", str53, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Booking confirmed." + "'", str54, "Booking confirmed.");
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setName("hi!");
        room6.setName("");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor14 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor18 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean19 = occupancySensor18.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher20 = null;
        occupancySensor18.subject = checkInPublisher20;
        occupancySensor18.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher24 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor28 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher29 = null;
        occupancySensor28.setSubject(checkInPublisher29);
        occupancySensor28.occupied = true;
        occupancySensor28.setDetected(false);
        checkInPublisher24.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor28);
        occupancySensor18.setSubject(checkInPublisher24);
        occupancySensor14.setSubject(checkInPublisher24);
        boolean boolean38 = occupancySensor14.isDetected;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor42 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount49 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean50 = occupancySensor42.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount49);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher51 = null;
        occupancySensor42.setSubject(checkInPublisher51);
        occupancySensor42.isDetected = false;
        boolean boolean55 = occupancySensor42.isOccupied();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor59 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor63 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean64 = occupancySensor63.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher65 = null;
        occupancySensor63.subject = checkInPublisher65;
        occupancySensor63.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher69 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor73 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher74 = null;
        occupancySensor73.setSubject(checkInPublisher74);
        occupancySensor73.occupied = true;
        occupancySensor73.setDetected(false);
        checkInPublisher69.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor73);
        occupancySensor63.setSubject(checkInPublisher69);
        occupancySensor59.setSubject(checkInPublisher69);
        occupancySensor42.subject = checkInPublisher69;
        occupancySensor14.setSubject(checkInPublisher69);
        com.conferenceroomscheduler.model.StaffAccount staffAccount91 = new com.conferenceroomscheduler.model.StaffAccount("", "Pending", "Pending", false, false, "hi!");
        boolean boolean92 = occupancySensor14.detectOccupancy((com.conferenceroomscheduler.model.Account) staffAccount91);
        staffAccount91.setEmail("Booking complete");
        room6.checkIn((com.conferenceroomscheduler.model.Account) staffAccount91);
        boolean boolean96 = staffAccount91.isVerified();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Cancelled", false, true);
        occupancySensor3.occupied = true;
        occupancySensor3.setOccupied(false);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("student", "staff", "hi!", "", (int) (short) 1, localDateTime5, localDateTime6);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, true);
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory4 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account12 = facultyFactory4.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account20 = facultyFactory4.createAccount("", "hi!", "", "", false, true, "");
        account20.setAccountType("Cancelled");
        java.lang.String str23 = account20.getAccountId();
        boolean boolean24 = occupancySensor3.detectOccupancy(account20);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher25 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor29 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher30 = null;
        occupancySensor29.setSubject(checkInPublisher30);
        occupancySensor29.occupied = true;
        occupancySensor29.setDetected(false);
        checkInPublisher25.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor29);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor40 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor40.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount49 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount49.setEmail("");
        boolean boolean52 = occupancySensor40.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount49);
        checkInPublisher25.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor40);
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory54 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account62 = facultyFactory54.createAccount("", "Cancelled", "", "hi!", false, false, "");
        account62.setAccountNumber("hi!");
        account62.setUniversityAccount(true);
        account62.setAccountType("Cancelled");
        checkInPublisher25.notifyObservers(account62);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor73 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, true);
        boolean boolean74 = occupancySensor73.isOccupied();
        checkInPublisher25.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor73);
        occupancySensor3.setSubject(checkInPublisher25);
        boolean boolean77 = occupancySensor3.isDetected();
        boolean boolean78 = occupancySensor3.isOccupied();
        org.junit.Assert.assertNotNull(account12);
        org.junit.Assert.assertNotNull(account20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(account62);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setBuilding("hi!");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = room6.getOccupancySensor();
        com.conferenceroomscheduler.model.AdminAccount adminAccount11 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str12 = adminAccount11.getAccountId();
        boolean boolean13 = adminAccount11.isUniversityAccount();
        boolean boolean14 = occupancySensor10.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount11);
        java.lang.String str15 = occupancySensor10.roomId;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(occupancySensor10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        occupancySensor4.setOccupied(true);
        occupancySensor4.occupied = false;
        com.conferenceroomscheduler.model.Badge badge16 = new com.conferenceroomscheduler.model.Badge("hi!", "Pending", false);
        boolean boolean17 = occupancySensor4.scanIdBadge(badge16);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomNumber();
        java.lang.String str8 = room6.getRoomNumber();
        room6.setCapacity(97);
        room6.setRoomId("Verified badge detected for ADMIN-69.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) 10);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("Cancelled", 1.0d);
        boolean boolean9 = creditCardPaymentStrategy0.processPayment("Cancelled", (double) 100);
        boolean boolean12 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) (short) -1);
        boolean boolean15 = creditCardPaymentStrategy0.processPayment("admin", (double) 100.0f);
        boolean boolean18 = creditCardPaymentStrategy0.processPayment("ADMIN-69", (double) (byte) 1);
        boolean boolean21 = creditCardPaymentStrategy0.processPayment("admin", (double) 100);
        boolean boolean24 = creditCardPaymentStrategy0.processPayment("", 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand8 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setAccountType("Pending");
        java.time.LocalDateTime localDateTime11 = null;
        reservation1.setStartTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = reservation1.getEndTime();
        reservation1.setFinalAmount((double) 0L);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext16 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getOrganizerId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.lang.String str11 = bookingRequest7.getTitle();
        int int12 = bookingRequest7.getAttendeeCount();
        java.time.LocalDateTime localDateTime13 = bookingRequest7.getEndTime();
        java.time.LocalDateTime localDateTime14 = bookingRequest7.getEndTime();
        java.lang.String str15 = bookingRequest7.getRoomId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cancelled" + "'", str15, "Cancelled");
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setEnabled(true);
        java.lang.String str13 = room6.getName();
        room6.setName("Cancelled");
        java.lang.String str16 = room6.getName();
        boolean boolean17 = room6.isClosedForMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cancelled" + "'", str16, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        java.lang.String str8 = room6.getBuilding();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor12 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher13 = null;
        occupancySensor12.setSubject(checkInPublisher13);
        boolean boolean15 = occupancySensor12.isDetected;
        occupancySensor12.roomId = "Booking confirmed.";
        room6.setOccupancySensor(occupancySensor12);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor22 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean23 = occupancySensor22.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher24 = null;
        occupancySensor22.subject = checkInPublisher24;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher26 = occupancySensor22.getSubject();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher27 = occupancySensor22.getSubject();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor31 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher32 = null;
        occupancySensor31.setSubject(checkInPublisher32);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor37 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor41 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean42 = occupancySensor41.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher43 = null;
        occupancySensor41.subject = checkInPublisher43;
        occupancySensor41.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher47 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor51 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher52 = null;
        occupancySensor51.setSubject(checkInPublisher52);
        occupancySensor51.occupied = true;
        occupancySensor51.setDetected(false);
        checkInPublisher47.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor51);
        occupancySensor41.setSubject(checkInPublisher47);
        occupancySensor37.setSubject(checkInPublisher47);
        occupancySensor31.setSubject(checkInPublisher47);
        occupancySensor22.setSubject(checkInPublisher47);
        occupancySensor12.subject = checkInPublisher47;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher64 = occupancySensor12.getSubject();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor68 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean69 = occupancySensor68.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher70 = null;
        occupancySensor68.subject = checkInPublisher70;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher72 = occupancySensor68.getSubject();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher73 = occupancySensor68.getSubject();
        occupancySensor68.roomId = "faculty";
        checkInPublisher64.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor68);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(checkInPublisher26);
        org.junit.Assert.assertNull(checkInPublisher27);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(checkInPublisher64);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(checkInPublisher72);
        org.junit.Assert.assertNull(checkInPublisher73);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        reservation1.setCheckedIn(true);
        reservation1.setCheckedIn(false);
        java.lang.String str12 = reservation1.getUserId();
        double double13 = reservation1.getDepositAmount();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod14 = reservation1.getPaymentMethod();
        reservation1.setCanceled(false);
        boolean boolean17 = reservation1.isCheckedIn();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand18 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        boolean boolean19 = cancelBookingCommand18.wasSuccessful();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(paymentMethod14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setDepositAmount(0.0d);
        reservation1.setAccountType("");
        java.lang.String str9 = reservation1.getUserId();
        reservation1.setReservationId("student");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand12 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setReservationId("Unverified badge detected for Cancelled.");
        reservation1.setCanceled(false);
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("hi!", "Booking confirmed.", false);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "student", (int) (short) 1, true, "Checked in.", "staff");
        room6.setBuilding("Booking confirmed.");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.time.LocalDateTime localDateTime9 = bookingRequest7.getEndTime();
        java.lang.String str10 = bookingRequest7.getOrganizerId();
        java.time.LocalDateTime localDateTime11 = bookingRequest7.getEndTime();
        java.lang.String str12 = bookingRequest7.getRequestId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        room6.setCapacity((int) 'a');
        room6.setBuilding("hi!");
        java.lang.String str22 = room6.getName();
        int int23 = room6.getCapacity();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor24 = room6.getOccupancySensor();
        occupancySensor24.setOccupied(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cancelled" + "'", str22, "Cancelled");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(occupancySensor24);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Cancelled", "Unverified badge detected for .", "", false, true, "Verified badge detected for ADMIN-69.");
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setCheckedIn(true);
        reservation0.setCheckedIn(false);
        java.lang.String str11 = reservation0.getUserId();
        java.time.LocalDateTime localDateTime12 = null;
        reservation0.setStartTime(localDateTime12);
        java.lang.String str14 = reservation0.getAccountType();
        reservation0.setCanceled(false);
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.isDetected;
        boolean boolean7 = occupancySensor3.isDetected;
        boolean boolean8 = occupancySensor3.isDetected();
        java.lang.String str9 = occupancySensor3.getRoomId();
        boolean boolean10 = occupancySensor3.occupied;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod7 = reservation0.getPaymentMethod();
        reservation0.setCheckedIn(false);
        java.time.LocalDateTime localDateTime10 = reservation0.getStartTime();
        reservation0.setDepositAmount((double) (byte) -1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(paymentMethod7);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        boolean boolean6 = badgeScan3.isVerified();
        badgeScan3.setBadgeId("admin");
        badgeScan3.setBadgeId("Unverified badge detected for .");
        java.lang.String str11 = badgeScan3.getBadgeId();
        boolean boolean12 = badgeScan3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Unverified badge detected for ." + "'", str11, "Unverified badge detected for .");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor3.isDetected = false;
        java.lang.String str6 = occupancySensor3.getRoomId();
        occupancySensor3.isDetected = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher9 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher14 = null;
        occupancySensor13.setSubject(checkInPublisher14);
        occupancySensor13.occupied = true;
        occupancySensor13.setDetected(false);
        checkInPublisher9.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor13);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor24 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor24.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount33 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount33.setEmail("");
        boolean boolean36 = occupancySensor24.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount33);
        checkInPublisher9.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor24);
        occupancySensor3.setSubject(checkInPublisher9);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher39 = occupancySensor3.subject;
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount46 = new com.conferenceroomscheduler.model.FacultyAccount("", "Cancelled", "Cancelled", true, true, "Pending");
        facultyAccount46.setEmail("");
        checkInPublisher39.notifyObservers((com.conferenceroomscheduler.model.Account) facultyAccount46);
        com.conferenceroomscheduler.model.StudentAccount studentAccount56 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Booking complete", true, true, "Checked in.");
        checkInPublisher39.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount56);
        studentAccount56.setAccountId("faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pending" + "'", str6, "Pending");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(checkInPublisher39);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = null;
        occupancySensor3.setSubject(checkInPublisher12);
        occupancySensor3.isDetected = false;
        boolean boolean16 = occupancySensor3.isOccupied();
        com.conferenceroomscheduler.model.Badge badge20 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str21 = badge20.getEmail();
        boolean boolean22 = occupancySensor3.scanIdBadge(badge20);
        java.lang.String str23 = badge20.getAccountId();
        badge20.setAccountId("Cancelled");
        badge20.setAccountId("");
        java.lang.String str28 = badge20.getEmail();
        badge20.setEmail("admin");
        java.lang.String str31 = badge20.getAccountId();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking confirmed." + "'", str23, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Cancelled" + "'", str28, "Cancelled");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setName("hi!");
        room6.setName("");
        java.lang.String str11 = room6.getName();
        int int12 = room6.getCapacity();
        java.lang.String str13 = room6.getRoomNumber();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        reservation1.setCheckedIn(true);
        reservation1.setCheckedIn(false);
        reservation1.setExtended(true);
        reservation1.setAccountType("student");
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand16 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod17 = reservation1.getPaymentMethod();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(paymentMethod17);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        room6.setClosedForMaintenance(false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor17 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher18 = null;
        occupancySensor17.setSubject(checkInPublisher18);
        java.lang.String str20 = occupancySensor17.getRoomId();
        room6.setOccupancySensor(occupancySensor17);
        com.conferenceroomscheduler.model.StudentAccount studentAccount28 = new com.conferenceroomscheduler.model.StudentAccount("", "Pending", "", true, false, "Pending");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount28);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor33 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount40 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean41 = occupancySensor33.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount40);
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount40);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState0 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext2 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState3 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext2.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState3);
        com.conferenceroomscheduler.patterns.BookingState bookingState5 = bookingContext2.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState6 = bookingContext2.getState();
        cancelledBookingState0.handle(bookingContext2);
        java.lang.String str8 = cancelledBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation9 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext10 = new com.conferenceroomscheduler.patterns.BookingContext(reservation9);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState11 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext10.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState11);
        com.conferenceroomscheduler.model.Reservation reservation13 = bookingContext10.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation14 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext15 = new com.conferenceroomscheduler.patterns.BookingContext(reservation14);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState16 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext15.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState16);
        com.conferenceroomscheduler.patterns.BookingState bookingState18 = bookingContext15.getState();
        bookingContext10.setState(bookingState18);
        cancelledBookingState0.handle(bookingContext10);
        java.lang.String str21 = cancelledBookingState0.getName();
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNull(reservation13);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = null;
        occupancySensor3.setSubject(checkInPublisher12);
        occupancySensor3.isDetected = false;
        boolean boolean16 = occupancySensor3.isOccupied();
        com.conferenceroomscheduler.model.Badge badge20 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str21 = badge20.getEmail();
        boolean boolean22 = occupancySensor3.scanIdBadge(badge20);
        java.lang.String str23 = badge20.getAccountId();
        badge20.setAccountId("Cancelled");
        badge20.setAccountId("");
        badge20.setAccountId("");
        badge20.setAccountId("Checked in.");
        boolean boolean32 = badge20.isVerified();
        badge20.setVerified(true);
        badge20.setAccountId("Cancelled");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking confirmed." + "'", str23, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.model.Reservation reservation10 = new com.conferenceroomscheduler.model.Reservation();
        reservation10.setFinalAmount((double) (byte) 100);
        java.lang.String str13 = reservation10.getRoomId();
        reservation10.setFinalAmount((double) 10.0f);
        java.lang.String str16 = reservation10.getUserId();
        reservation10.setDepositAmount((double) (byte) 0);
        double double19 = reservation10.getHourlyRate();
        reservation10.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext22 = new com.conferenceroomscheduler.patterns.BookingContext(reservation10);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod33 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation34 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime27, localDateTime28, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod33);
        reservation10.setPaymentMethod(paymentMethod33);
        com.conferenceroomscheduler.model.Reservation reservation36 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "Booking complete", "admin", "Booking complete", localDateTime4, localDateTime5, "Booking confirmed.", (double) (short) -1, (double) 0.0f, (double) 0, paymentMethod33);
        reservation36.setHourlyRate((double) (short) 1);
        reservation36.setExtended(false);
        reservation36.setDepositAmount((double) '4');
        reservation36.setCanceled(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext45 = new com.conferenceroomscheduler.patterns.BookingContext(reservation36);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod33 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod33.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setEnabled(true);
        java.lang.String str13 = room6.getName();
        boolean boolean14 = room6.isClosedForMaintenance();
        boolean boolean15 = room6.isClosedForMaintenance();
        java.lang.String str16 = room6.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cancelled" + "'", str16, "Cancelled");
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Verified badge detected for Checked in..", "ADMIN-69", false);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getAccountType();
        java.lang.String str5 = reservation2.getAccountType();
        boolean boolean6 = reservation2.isCheckedIn();
        java.time.LocalDateTime localDateTime7 = reservation2.getStartTime();
        java.time.LocalDateTime localDateTime8 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand9 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation2, localDateTime8);
        double double10 = reservation2.getHourlyRate();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState0 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext6 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState7 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str8 = cancelledBookingState7.getName();
        bookingContext6.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState7);
        completedBookingState0.handle(bookingContext6);
        java.lang.String str11 = completedBookingState0.getName();
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState12 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation13 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext14 = new com.conferenceroomscheduler.patterns.BookingContext(reservation13);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState15 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext14.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState15);
        completedBookingState12.handle(bookingContext14);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState18 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation19 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext20 = new com.conferenceroomscheduler.patterns.BookingContext(reservation19);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState21 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext20.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState21);
        com.conferenceroomscheduler.patterns.BookingState bookingState23 = bookingContext20.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState24 = bookingContext20.getState();
        cancelledBookingState18.handle(bookingContext20);
        completedBookingState12.handle(bookingContext20);
        com.conferenceroomscheduler.model.Reservation reservation27 = bookingContext20.getReservation();
        completedBookingState0.handle(bookingContext20);
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState29 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str30 = confirmedBookingState29.getName();
        java.lang.String str31 = confirmedBookingState29.getName();
        com.conferenceroomscheduler.model.Reservation reservation32 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext33 = new com.conferenceroomscheduler.patterns.BookingContext(reservation32);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState34 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext33.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState34);
        com.conferenceroomscheduler.model.Reservation reservation36 = bookingContext33.getReservation();
        confirmedBookingState29.handle(bookingContext33);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState38 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState39 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation40 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext41 = new com.conferenceroomscheduler.patterns.BookingContext(reservation40);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState42 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext41.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState42);
        com.conferenceroomscheduler.patterns.BookingState bookingState44 = bookingContext41.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState45 = bookingContext41.getState();
        cancelledBookingState39.handle(bookingContext41);
        checkedInBookingState38.handle(bookingContext41);
        com.conferenceroomscheduler.model.Reservation reservation48 = new com.conferenceroomscheduler.model.Reservation();
        reservation48.setFinalAmount((double) (byte) 100);
        reservation48.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext53 = new com.conferenceroomscheduler.patterns.BookingContext(reservation48);
        checkedInBookingState38.handle(bookingContext53);
        com.conferenceroomscheduler.model.Reservation reservation55 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext56 = new com.conferenceroomscheduler.patterns.BookingContext(reservation55);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState57 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext56.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState57);
        checkedInBookingState38.handle(bookingContext56);
        confirmedBookingState29.handle(bookingContext56);
        completedBookingState0.handle(bookingContext56);
        com.conferenceroomscheduler.model.Reservation reservation62 = new com.conferenceroomscheduler.model.Reservation();
        reservation62.setFinalAmount((double) (byte) 100);
        java.lang.String str65 = reservation62.getRoomId();
        reservation62.setFinalAmount((double) 10.0f);
        java.lang.String str68 = reservation62.getUserId();
        reservation62.setDepositAmount((double) (byte) 0);
        double double71 = reservation62.getHourlyRate();
        reservation62.setExtended(true);
        java.lang.String str74 = reservation62.getTitle();
        boolean boolean75 = reservation62.isExtended();
        boolean boolean76 = reservation62.isCanceled();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext77 = new com.conferenceroomscheduler.patterns.BookingContext(reservation62);
        completedBookingState0.handle(bookingContext77);
        java.lang.String str79 = completedBookingState0.getName();
        java.lang.Class<?> wildcardClass80 = completedBookingState0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking complete" + "'", str11, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertNotNull(bookingState24);
        org.junit.Assert.assertNull(reservation27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Booking confirmed." + "'", str30, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Booking confirmed." + "'", str31, "Booking confirmed.");
        org.junit.Assert.assertNull(reservation36);
        org.junit.Assert.assertNotNull(bookingState44);
        org.junit.Assert.assertNotNull(bookingState45);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Booking complete" + "'", str79, "Booking complete");
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory0 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account8 = facultyFactory0.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account16 = facultyFactory0.createAccount("Cancelled", "ADMIN-69", "", "Pending", false, false, "Cancelled");
        com.conferenceroomscheduler.model.Account account24 = facultyFactory0.createAccount("Booking complete", "hi!", "Unverified badge detected for .", "Unverified badge detected for .", false, false, "Pending");
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("", "Unverified badge detected for .", "Checked in.", "faculty", (int) '4', localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.time.LocalDateTime localDateTime9 = bookingRequest7.getEndTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setCheckedIn(true);
        reservation0.setCheckedIn(false);
        reservation0.setReservationId("Booking complete");
        double double13 = reservation0.getHourlyRate();
        reservation0.setFinalAmount((double) 52);
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("partner", "student", "partner", true, false, "Unverified badge detected for Cancelled.");
        com.conferenceroomscheduler.model.Badge badge7 = facultyAccount6.getBadge();
        org.junit.Assert.assertNotNull(badge7);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("student", "Booking confirmed.", true);
        java.lang.String str4 = badgeScan3.getRoomId();
        badgeScan3.setVerified(false);
        badgeScan3.setBadgeId("staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Booking confirmed." + "'", str4, "Booking confirmed.");
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor3.isDetected = false;
        java.lang.String str6 = occupancySensor3.getRoomId();
        boolean boolean7 = occupancySensor3.isDetected();
        occupancySensor3.occupied = false;
        occupancySensor3.occupied = false;
        occupancySensor3.setOccupied(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pending" + "'", str6, "Pending");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("hi!", "Unverified badge detected for Cancelled.", "", true, false, "");
        studentAccount6.setIdentifier("staff");
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Booking complete", "Booking confirmed.", (int) '4', true, "Booking confirmed.", "Pending");
        room6.setClosedForMaintenance(false);
        java.lang.String str9 = room6.getName();
        room6.setCapacity((int) '4');
        boolean boolean12 = room6.isClosedForMaintenance();
        java.lang.String str13 = room6.getRoomId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking confirmed." + "'", str9, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking complete" + "'", str13, "Booking complete");
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Cancelled", "hi!", "hi!", "", (int) (short) 1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRoomId();
        java.time.LocalDateTime localDateTime9 = bookingRequest7.getEndTime();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod30 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation31 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime24, localDateTime25, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod30);
        com.conferenceroomscheduler.model.Reservation reservation32 = new com.conferenceroomscheduler.model.Reservation("admin", "", "Booking complete", "Pending", localDateTime14, localDateTime15, "", (double) 'a', (double) 10L, 0.0d, paymentMethod30);
        com.conferenceroomscheduler.model.Reservation reservation33 = new com.conferenceroomscheduler.model.Reservation("hi!", "faculty", "", "Pending", localDateTime4, localDateTime5, "Unverified badge detected for Cancelled.", (double) 1.0f, (double) 0L, (-1.0d), paymentMethod30);
        reservation33.setCanceled(false);
        java.time.LocalDateTime localDateTime36 = null;
        reservation33.setStartTime(localDateTime36);
        org.junit.Assert.assertTrue("'" + paymentMethod30 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod30.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand8 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setDepositLost(false);
        java.lang.String str11 = reservation1.getUserId();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod12 = reservation1.getPaymentMethod();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(paymentMethod12);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        java.time.LocalDateTime localDateTime4 = reservation1.getStartTime();
        boolean boolean5 = reservation1.isCheckedIn();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean4 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor3.subject = checkInPublisher5;
        occupancySensor3.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher9 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher14 = null;
        occupancySensor13.setSubject(checkInPublisher14);
        occupancySensor13.occupied = true;
        occupancySensor13.setDetected(false);
        checkInPublisher9.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor13);
        occupancySensor3.setSubject(checkInPublisher9);
        boolean boolean22 = occupancySensor3.occupied;
        com.conferenceroomscheduler.model.AdminAccount adminAccount23 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str24 = adminAccount23.getEmail();
        boolean boolean25 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount23);
        boolean boolean26 = occupancySensor3.occupied;
        occupancySensor3.isDetected = false;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean4 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor3.subject = checkInPublisher5;
        occupancySensor3.occupied = false;
        java.lang.String str9 = occupancySensor3.getLastEvent();
        occupancySensor3.setOccupied(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        room6.setClosedForMaintenance(false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor17 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher18 = null;
        occupancySensor17.setSubject(checkInPublisher18);
        java.lang.String str20 = occupancySensor17.getRoomId();
        room6.setOccupancySensor(occupancySensor17);
        java.lang.String str22 = room6.getRoomId();
        room6.setEnabled(false);
        boolean boolean25 = room6.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean4 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor3.subject = checkInPublisher5;
        occupancySensor3.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher9 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher14 = null;
        occupancySensor13.setSubject(checkInPublisher14);
        occupancySensor13.occupied = true;
        occupancySensor13.setDetected(false);
        checkInPublisher9.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor13);
        occupancySensor3.setSubject(checkInPublisher9);
        boolean boolean22 = occupancySensor3.occupied;
        com.conferenceroomscheduler.model.AdminAccount adminAccount23 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str24 = adminAccount23.getEmail();
        boolean boolean25 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount23);
        boolean boolean26 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory27 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account35 = facultyFactory27.createAccount("", "Cancelled", "", "hi!", false, false, "");
        account35.setAccountNumber("hi!");
        java.lang.String str38 = account35.getAccountId();
        java.lang.String str39 = account35.getAccountId();
        java.lang.String str40 = account35.getAccountNumber();
        boolean boolean41 = occupancySensor3.detectOccupancy(account35);
        account35.setEmail("Verified badge detected for Checked in..");
        account35.setAccountId("Verified badge detected for ADMIN-69.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(account35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.isDetected;
        boolean boolean7 = occupancySensor3.isDetected;
        occupancySensor3.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher10 = occupancySensor3.subject;
        java.lang.String str11 = occupancySensor3.getLastEvent();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(checkInPublisher10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("student", "Unverified badge detected for Cancelled.", false);
        badgeScan3.setVerified(true);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setFinalAmount((double) (byte) 100);
        java.lang.String str5 = reservation2.getRoomId();
        reservation2.setFinalAmount((double) 10.0f);
        java.lang.String str8 = reservation2.getUserId();
        double double9 = reservation2.getFinalAmount();
        reservation2.setReservationId("Pending");
        java.time.LocalDateTime localDateTime12 = null;
        reservation2.setStartTime(localDateTime12);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand16 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService1, reservation2, localDateTime14, localDateTime15);
        boolean boolean17 = reservation2.isCanceled();
        java.lang.String str18 = reservation2.getTitle();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand19 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation2);
        boolean boolean20 = cancelBookingCommand19.wasSuccessful();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("partner", "partner", true);
        java.lang.String str4 = badge3.getAccountId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy institutionalBillingPaymentStrategy0 = new com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy();
        boolean boolean3 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", 0.0d);
        boolean boolean6 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", (double) (short) 1);
        boolean boolean9 = institutionalBillingPaymentStrategy0.processPayment("Cancelled", 32.0d);
        boolean boolean12 = institutionalBillingPaymentStrategy0.processPayment("faculty", (double) 1);
        boolean boolean15 = institutionalBillingPaymentStrategy0.processPayment("admin", 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod40 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation41 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime34, localDateTime35, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod40);
        com.conferenceroomscheduler.model.Reservation reservation42 = new com.conferenceroomscheduler.model.Reservation("", "Pending", "Pending", "Booking complete", localDateTime24, localDateTime25, "Booking confirmed.", (double) 0.0f, (double) 1, (double) (byte) 100, paymentMethod40);
        com.conferenceroomscheduler.model.Reservation reservation43 = new com.conferenceroomscheduler.model.Reservation("Pending", "Booking complete", "Cancelled", "hi!", localDateTime14, localDateTime15, "", (double) '4', (double) 100.0f, (double) ' ', paymentMethod40);
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod54 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation55 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "hi!", "Booking complete", "Checked in.", localDateTime48, localDateTime49, "hi!", (double) 97, (double) 100L, (double) (byte) 100, paymentMethod54);
        reservation43.setPaymentMethod(paymentMethod54);
        com.conferenceroomscheduler.model.Reservation reservation57 = new com.conferenceroomscheduler.model.Reservation("", "", "hi!", "Booking confirmed.", localDateTime4, localDateTime5, "student", (double) (byte) 1, 0.0d, (double) 0L, paymentMethod54);
        double double58 = reservation57.getHourlyRate();
        reservation57.setAccountType("Pending");
        java.lang.String str61 = reservation57.getUserId();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod62 = reservation57.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + paymentMethod40 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod40.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertTrue("'" + paymentMethod54 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod54.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + paymentMethod62 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod62.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        room6.setClosedForMaintenance(false);
        room6.setEnabled(true);
        java.lang.String str17 = room6.getName();
        room6.setBuilding("student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cancelled" + "'", str17, "Cancelled");
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("student", "faculty", "ADMIN-69", false, true, "Unverified badge detected for .");
        staffAccount6.setAccountNumber("Pending");
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setBadgeId("admin");
        badgeScan3.setRoomId("Unverified badge detected for Cancelled.");
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState0 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext2 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState3 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext2.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState3);
        com.conferenceroomscheduler.patterns.BookingState bookingState5 = bookingContext2.getState();
        com.conferenceroomscheduler.model.Reservation reservation6 = bookingContext2.getReservation();
        cancelledBookingState0.handle(bookingContext2);
        java.lang.String str8 = cancelledBookingState0.getName();
        java.lang.String str9 = cancelledBookingState0.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState10 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState11 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation12 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext13 = new com.conferenceroomscheduler.patterns.BookingContext(reservation12);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState14 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext13.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState14);
        com.conferenceroomscheduler.patterns.BookingState bookingState16 = bookingContext13.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState17 = bookingContext13.getState();
        cancelledBookingState11.handle(bookingContext13);
        checkedInBookingState10.handle(bookingContext13);
        java.lang.String str20 = checkedInBookingState10.getName();
        com.conferenceroomscheduler.model.Reservation reservation21 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext22 = new com.conferenceroomscheduler.patterns.BookingContext(reservation21);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState23 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext22.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState23);
        com.conferenceroomscheduler.model.Reservation reservation25 = bookingContext22.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation26 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext27 = new com.conferenceroomscheduler.patterns.BookingContext(reservation26);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState28 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext27.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState28);
        com.conferenceroomscheduler.patterns.BookingState bookingState30 = bookingContext27.getState();
        bookingContext22.setState(bookingState30);
        checkedInBookingState10.handle(bookingContext22);
        java.lang.String str33 = checkedInBookingState10.getName();
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState34 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str35 = pendingBookingState34.getName();
        com.conferenceroomscheduler.model.Reservation reservation36 = new com.conferenceroomscheduler.model.Reservation();
        reservation36.setFinalAmount((double) (byte) 100);
        reservation36.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext41 = new com.conferenceroomscheduler.patterns.BookingContext(reservation36);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState42 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str43 = cancelledBookingState42.getName();
        bookingContext41.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState42);
        pendingBookingState34.handle(bookingContext41);
        java.lang.String str46 = bookingContext41.getStatus();
        checkedInBookingState10.handle(bookingContext41);
        com.conferenceroomscheduler.patterns.BookingState bookingState48 = bookingContext41.getState();
        cancelledBookingState0.handle(bookingContext41);
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNull(reservation6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertNotNull(bookingState17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Checked in." + "'", str20, "Checked in.");
        org.junit.Assert.assertNull(reservation25);
        org.junit.Assert.assertNotNull(bookingState30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Checked in." + "'", str33, "Checked in.");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Pending" + "'", str35, "Pending");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Cancelled" + "'", str43, "Cancelled");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Cancelled" + "'", str46, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState48);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Pending", "Pending", (int) (short) -1, "", "Cancelled");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("Cancelled", "ADMIN-69", (-1), "faculty", "Pending");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("Unverified badge detected for admin.", "Pending", 100, "ADMIN-69", "partner");
        com.conferenceroomscheduler.model.Room room30 = roomFactory0.createRoom("Verified badge detected for ADMIN-69.", "faculty", (int) (short) 1, "", "ADMIN-69");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor31 = room30.getOccupancySensor();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
        org.junit.Assert.assertNotNull(room30);
        org.junit.Assert.assertNotNull(occupancySensor31);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory0 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account8 = facultyFactory0.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account16 = facultyFactory0.createAccount("", "hi!", "", "", false, true, "");
        com.conferenceroomscheduler.model.Account account24 = facultyFactory0.createAccount("Cancelled", "Pending", "Cancelled", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account32 = facultyFactory0.createAccount("Pending", "Cancelled", "Booking complete", "partner", false, true, "Booking confirmed.");
        com.conferenceroomscheduler.model.Account account40 = facultyFactory0.createAccount("hi!", "hi!", "faculty", "partner", false, true, "staff");
        com.conferenceroomscheduler.model.Account account48 = facultyFactory0.createAccount("Booking confirmed.", "Pending", "Unverified badge detected for Cancelled.", "admin", true, true, "Cancelled");
        com.conferenceroomscheduler.model.Account account56 = facultyFactory0.createAccount("Pending", "faculty", "", "", true, false, "");
        java.lang.String str57 = account56.getAccountId();
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
        org.junit.Assert.assertNotNull(account32);
        org.junit.Assert.assertNotNull(account40);
        org.junit.Assert.assertNotNull(account48);
        org.junit.Assert.assertNotNull(account56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Pending" + "'", str57, "Pending");
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        java.lang.String str6 = occupancySensor3.getRoomId();
        occupancySensor3.roomId = "hi!";
        com.conferenceroomscheduler.model.Badge badge12 = new com.conferenceroomscheduler.model.Badge("Checked in.", "Pending", true);
        java.lang.String str13 = badge12.getAccountId();
        boolean boolean14 = occupancySensor3.scanIdBadge(badge12);
        boolean boolean15 = occupancySensor3.isDetected;
        occupancySensor3.isDetected = true;
        java.lang.String str18 = occupancySensor3.getRoomId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pending" + "'", str13, "Pending");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setFinalAmount((double) ' ');
        java.lang.String str9 = reservation0.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext10 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.model.Reservation reservation11 = bookingContext10.getReservation();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState12 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState13 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation14 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext15 = new com.conferenceroomscheduler.patterns.BookingContext(reservation14);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState16 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext15.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState16);
        com.conferenceroomscheduler.patterns.BookingState bookingState18 = bookingContext15.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState19 = bookingContext15.getState();
        cancelledBookingState13.handle(bookingContext15);
        checkedInBookingState12.handle(bookingContext15);
        com.conferenceroomscheduler.model.Reservation reservation22 = new com.conferenceroomscheduler.model.Reservation();
        reservation22.setFinalAmount((double) (byte) 100);
        reservation22.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext27 = new com.conferenceroomscheduler.patterns.BookingContext(reservation22);
        checkedInBookingState12.handle(bookingContext27);
        java.lang.String str29 = checkedInBookingState12.getName();
        com.conferenceroomscheduler.model.Reservation reservation30 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext31 = new com.conferenceroomscheduler.patterns.BookingContext(reservation30);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState32 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext31.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState32);
        com.conferenceroomscheduler.model.Reservation reservation34 = bookingContext31.getReservation();
        checkedInBookingState12.handle(bookingContext31);
        java.lang.String str36 = checkedInBookingState12.getName();
        com.conferenceroomscheduler.model.Reservation reservation37 = new com.conferenceroomscheduler.model.Reservation();
        java.time.LocalDateTime localDateTime38 = null;
        reservation37.setEndTime(localDateTime38);
        reservation37.setHourlyRate((double) 'a');
        com.conferenceroomscheduler.patterns.BookingContext bookingContext42 = new com.conferenceroomscheduler.patterns.BookingContext(reservation37);
        checkedInBookingState12.handle(bookingContext42);
        bookingContext10.setState((com.conferenceroomscheduler.patterns.BookingState) checkedInBookingState12);
        java.lang.String str45 = bookingContext10.getStatus();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(reservation11);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertNotNull(bookingState19);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Checked in." + "'", str29, "Checked in.");
        org.junit.Assert.assertNull(reservation34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Checked in." + "'", str36, "Checked in.");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Checked in." + "'", str45, "Checked in.");
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        boolean boolean9 = occupancySensor4.isDetected;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher10 = occupancySensor4.subject;
        occupancySensor4.roomId = "hi!";
        java.lang.String str13 = occupancySensor4.getRoomId();
        boolean boolean14 = occupancySensor4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(checkInPublisher10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("student", "", "partner", "Verified badge detected for ADMIN-69.", 0, localDateTime5, localDateTime6);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        com.conferenceroomscheduler.model.Reservation reservation21 = new com.conferenceroomscheduler.model.Reservation();
        reservation21.setAccountType("hi!");
        java.lang.String str24 = reservation21.getUserId();
        boolean boolean25 = reservation21.isDepositLost();
        reservation21.setCheckedIn(false);
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        com.conferenceroomscheduler.model.Reservation reservation38 = new com.conferenceroomscheduler.model.Reservation();
        reservation38.setFinalAmount((double) (byte) 100);
        java.lang.String str41 = reservation38.getRoomId();
        reservation38.setFinalAmount((double) 10.0f);
        java.lang.String str44 = reservation38.getUserId();
        reservation38.setDepositAmount((double) (byte) 0);
        double double47 = reservation38.getHourlyRate();
        reservation38.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext50 = new com.conferenceroomscheduler.patterns.BookingContext(reservation38);
        java.time.LocalDateTime localDateTime55 = null;
        java.time.LocalDateTime localDateTime56 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod61 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation62 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime55, localDateTime56, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod61);
        reservation38.setPaymentMethod(paymentMethod61);
        com.conferenceroomscheduler.model.Reservation reservation64 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "Booking complete", "admin", "Booking complete", localDateTime32, localDateTime33, "Booking confirmed.", (double) (short) -1, (double) 0.0f, (double) 0, paymentMethod61);
        reservation21.setPaymentMethod(paymentMethod61);
        com.conferenceroomscheduler.model.Reservation reservation66 = new com.conferenceroomscheduler.model.Reservation("admin", "admin", "student", "Booking complete", localDateTime15, localDateTime16, "Booking confirmed.", (double) 1, (double) 10.0f, (double) 0, paymentMethod61);
        com.conferenceroomscheduler.model.Reservation reservation67 = new com.conferenceroomscheduler.model.Reservation("Unverified badge detected for admin.", "Booking confirmed.", "partner", "hi!", localDateTime5, localDateTime6, "admin", (double) 0L, (double) 'a', (double) 52, paymentMethod61);
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand68 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation67);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod61 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod61.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod31 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation32 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime25, localDateTime26, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod31);
        com.conferenceroomscheduler.model.Reservation reservation33 = new com.conferenceroomscheduler.model.Reservation("admin", "", "Booking complete", "Pending", localDateTime15, localDateTime16, "", (double) 'a', (double) 10L, 0.0d, paymentMethod31);
        com.conferenceroomscheduler.model.Reservation reservation34 = new com.conferenceroomscheduler.model.Reservation("hi!", "faculty", "", "Pending", localDateTime5, localDateTime6, "Unverified badge detected for Cancelled.", (double) 1.0f, (double) 0L, (-1.0d), paymentMethod31);
        reservation34.setCanceled(false);
        java.time.LocalDateTime localDateTime37 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand38 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation34, localDateTime37);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand38.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.extendBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + paymentMethod31 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod31.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState0 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState1 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation2 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext3 = new com.conferenceroomscheduler.patterns.BookingContext(reservation2);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState4 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext3.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState4);
        com.conferenceroomscheduler.patterns.BookingState bookingState6 = bookingContext3.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState7 = bookingContext3.getState();
        cancelledBookingState1.handle(bookingContext3);
        checkedInBookingState0.handle(bookingContext3);
        com.conferenceroomscheduler.model.Reservation reservation10 = new com.conferenceroomscheduler.model.Reservation();
        reservation10.setFinalAmount((double) (byte) 100);
        reservation10.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext15 = new com.conferenceroomscheduler.patterns.BookingContext(reservation10);
        checkedInBookingState0.handle(bookingContext15);
        java.lang.String str17 = checkedInBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation18 = new com.conferenceroomscheduler.model.Reservation();
        reservation18.setFinalAmount((double) (byte) 100);
        java.lang.String str21 = reservation18.getRoomId();
        reservation18.setFinalAmount((double) 10.0f);
        java.lang.String str24 = reservation18.getUserId();
        reservation18.setFinalAmount((double) ' ');
        java.lang.String str27 = reservation18.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext28 = new com.conferenceroomscheduler.patterns.BookingContext(reservation18);
        com.conferenceroomscheduler.patterns.BookingState bookingState29 = null;
        bookingContext28.setState(bookingState29);
        checkedInBookingState0.handle(bookingContext28);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState32 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation33 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext34 = new com.conferenceroomscheduler.patterns.BookingContext(reservation33);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState35 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext34.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState35);
        com.conferenceroomscheduler.patterns.BookingState bookingState37 = bookingContext34.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState38 = bookingContext34.getState();
        cancelledBookingState32.handle(bookingContext34);
        java.lang.String str40 = cancelledBookingState32.getName();
        com.conferenceroomscheduler.model.Reservation reservation41 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext42 = new com.conferenceroomscheduler.patterns.BookingContext(reservation41);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState43 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext42.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState43);
        com.conferenceroomscheduler.model.Reservation reservation45 = bookingContext42.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation46 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext47 = new com.conferenceroomscheduler.patterns.BookingContext(reservation46);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState48 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext47.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState48);
        com.conferenceroomscheduler.patterns.BookingState bookingState50 = bookingContext47.getState();
        bookingContext42.setState(bookingState50);
        cancelledBookingState32.handle(bookingContext42);
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService53 = null;
        com.conferenceroomscheduler.model.Reservation reservation54 = new com.conferenceroomscheduler.model.Reservation();
        reservation54.setFinalAmount((double) (byte) 100);
        java.lang.String str57 = reservation54.getRoomId();
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime59 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand60 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService53, reservation54, localDateTime58, localDateTime59);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext61 = new com.conferenceroomscheduler.patterns.BookingContext(reservation54);
        cancelledBookingState32.handle(bookingContext61);
        bookingContext28.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState32);
        java.lang.String str64 = cancelledBookingState32.getName();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Checked in." + "'", str17, "Checked in.");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(bookingState37);
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Cancelled" + "'", str40, "Cancelled");
        org.junit.Assert.assertNull(reservation45);
        org.junit.Assert.assertNotNull(bookingState50);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Cancelled" + "'", str64, "Cancelled");
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState0 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str1 = confirmedBookingState0.getName();
        java.lang.String str2 = confirmedBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation3 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext4 = new com.conferenceroomscheduler.patterns.BookingContext(reservation3);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState5 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext4.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState5);
        com.conferenceroomscheduler.model.Reservation reservation7 = bookingContext4.getReservation();
        confirmedBookingState0.handle(bookingContext4);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState9 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState10 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation11 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext12 = new com.conferenceroomscheduler.patterns.BookingContext(reservation11);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState13 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext12.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState13);
        com.conferenceroomscheduler.patterns.BookingState bookingState15 = bookingContext12.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState16 = bookingContext12.getState();
        cancelledBookingState10.handle(bookingContext12);
        checkedInBookingState9.handle(bookingContext12);
        com.conferenceroomscheduler.model.Reservation reservation19 = new com.conferenceroomscheduler.model.Reservation();
        reservation19.setFinalAmount((double) (byte) 100);
        reservation19.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext24 = new com.conferenceroomscheduler.patterns.BookingContext(reservation19);
        checkedInBookingState9.handle(bookingContext24);
        com.conferenceroomscheduler.model.Reservation reservation26 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext27 = new com.conferenceroomscheduler.patterns.BookingContext(reservation26);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState28 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext27.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState28);
        checkedInBookingState9.handle(bookingContext27);
        confirmedBookingState0.handle(bookingContext27);
        com.conferenceroomscheduler.patterns.BookingState bookingState32 = bookingContext27.getState();
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState33 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation34 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext35 = new com.conferenceroomscheduler.patterns.BookingContext(reservation34);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState36 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext35.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState36);
        completedBookingState33.handle(bookingContext35);
        bookingContext27.setState((com.conferenceroomscheduler.patterns.BookingState) completedBookingState33);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking confirmed." + "'", str1, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking confirmed." + "'", str2, "Booking confirmed.");
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertNotNull(bookingState32);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        boolean boolean9 = reservation0.isExtended();
        reservation0.setReservationId("admin");
        java.time.LocalDateTime localDateTime12 = reservation0.getEndTime();
        java.time.LocalDateTime localDateTime13 = null;
        reservation0.setStartTime(localDateTime13);
        double double15 = reservation0.getDepositAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        boolean boolean9 = occupancySensor4.isDetected;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher10 = occupancySensor4.subject;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher11 = occupancySensor4.subject;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor15 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean16 = occupancySensor15.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher17 = null;
        occupancySensor15.subject = checkInPublisher17;
        occupancySensor15.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher21 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor25 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher26 = null;
        occupancySensor25.setSubject(checkInPublisher26);
        occupancySensor25.occupied = true;
        occupancySensor25.setDetected(false);
        checkInPublisher21.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor25);
        occupancySensor15.setSubject(checkInPublisher21);
        boolean boolean34 = occupancySensor15.occupied;
        com.conferenceroomscheduler.model.AdminAccount adminAccount35 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str36 = adminAccount35.getEmail();
        boolean boolean37 = occupancySensor15.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount35);
        boolean boolean38 = occupancySensor15.occupied;
        boolean boolean39 = occupancySensor15.isDetected;
        checkInPublisher11.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor15);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher41 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor45 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher46 = null;
        occupancySensor45.setSubject(checkInPublisher46);
        occupancySensor45.occupied = true;
        occupancySensor45.setDetected(false);
        checkInPublisher41.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor45);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor56 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor56.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount65 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount65.setEmail("");
        boolean boolean68 = occupancySensor56.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount65);
        checkInPublisher41.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor56);
        java.lang.String str70 = occupancySensor56.roomId;
        occupancySensor56.isDetected = true;
        occupancySensor56.setDetected(true);
        java.lang.String str75 = occupancySensor56.getLastEvent();
        checkInPublisher11.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor56);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(checkInPublisher10);
        org.junit.Assert.assertNotNull(checkInPublisher11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Pending" + "'", str70, "Pending");
        org.junit.Assert.assertNull(str75);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getRoomId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.lang.String str11 = bookingRequest7.getTitle();
        int int12 = bookingRequest7.getAttendeeCount();
        java.time.LocalDateTime localDateTime13 = bookingRequest7.getStartTime();
        java.lang.String str14 = bookingRequest7.getOrganizerId();
        java.lang.String str15 = bookingRequest7.getRoomId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cancelled" + "'", str15, "Cancelled");
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        boolean boolean10 = room6.isClosedForMaintenance();
        room6.setEnabled(false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = room6.getOccupancySensor();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor14 = room6.getOccupancySensor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(occupancySensor13);
        org.junit.Assert.assertNotNull(occupancySensor14);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getOrganizerId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.lang.String str11 = bookingRequest7.getTitle();
        int int12 = bookingRequest7.getAttendeeCount();
        java.time.LocalDateTime localDateTime13 = bookingRequest7.getEndTime();
        java.lang.String str14 = bookingRequest7.getTitle();
        java.lang.String str15 = bookingRequest7.getRequestId();
        java.lang.String str16 = bookingRequest7.getRoomId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cancelled" + "'", str16, "Cancelled");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount0.setAccountNumber("hi!");
        java.lang.String str3 = adminAccount0.getAccountId();
        adminAccount0.setAccountType("Booking complete");
        java.lang.String str6 = adminAccount0.getAccountType();
        adminAccount0.setUniversityAccount(true);
        adminAccount0.setAccountType("staff");
        adminAccount0.setEmail("admin");
        adminAccount0.setUniversityAccount(true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking complete" + "'", str6, "Booking complete");
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("Unverified badge detected for admin.", "student", "Cancelled", false, false, "");
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Checked in.", "Booking complete", 10, "faculty", "Pending");
        room12.setName("Verified badge detected for Checked in..");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        reservation1.setFinalAmount((double) ' ');
        java.lang.String str10 = reservation1.getTitle();
        reservation1.setDepositAmount((double) (-1.0f));
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod13 = reservation1.getPaymentMethod();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand14 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        // The following exception was thrown during execution in test generation
        try {
            createBookingCommand14.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.addReservation(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(paymentMethod13);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, true);
        occupancySensor3.occupied = false;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor9 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, true);
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory10 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account18 = facultyFactory10.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account26 = facultyFactory10.createAccount("", "hi!", "", "", false, true, "");
        account26.setAccountType("Cancelled");
        java.lang.String str29 = account26.getAccountId();
        boolean boolean30 = occupancySensor9.detectOccupancy(account26);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher31 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor35 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher36 = null;
        occupancySensor35.setSubject(checkInPublisher36);
        occupancySensor35.occupied = true;
        occupancySensor35.setDetected(false);
        checkInPublisher31.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor35);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor46 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor46.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount55 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount55.setEmail("");
        boolean boolean58 = occupancySensor46.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount55);
        checkInPublisher31.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor46);
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory60 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account68 = facultyFactory60.createAccount("", "Cancelled", "", "hi!", false, false, "");
        account68.setAccountNumber("hi!");
        account68.setUniversityAccount(true);
        account68.setAccountType("Cancelled");
        checkInPublisher31.notifyObservers(account68);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor79 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, true);
        boolean boolean80 = occupancySensor79.isOccupied();
        checkInPublisher31.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor79);
        occupancySensor9.setSubject(checkInPublisher31);
        occupancySensor3.setSubject(checkInPublisher31);
        org.junit.Assert.assertNotNull(account18);
        org.junit.Assert.assertNotNull(account26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(account68);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setBuilding("hi!");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = room6.getOccupancySensor();
        occupancySensor10.occupied = false;
        java.lang.String str13 = occupancySensor10.roomId;
        occupancySensor10.setDetected(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(occupancySensor10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState0 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState1 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation2 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext3 = new com.conferenceroomscheduler.patterns.BookingContext(reservation2);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState4 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext3.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState4);
        com.conferenceroomscheduler.patterns.BookingState bookingState6 = bookingContext3.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState7 = bookingContext3.getState();
        cancelledBookingState1.handle(bookingContext3);
        checkedInBookingState0.handle(bookingContext3);
        com.conferenceroomscheduler.model.Reservation reservation10 = new com.conferenceroomscheduler.model.Reservation();
        reservation10.setFinalAmount((double) (byte) 100);
        reservation10.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext15 = new com.conferenceroomscheduler.patterns.BookingContext(reservation10);
        checkedInBookingState0.handle(bookingContext15);
        com.conferenceroomscheduler.model.Reservation reservation17 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext18 = new com.conferenceroomscheduler.patterns.BookingContext(reservation17);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState19 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext18.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState19);
        checkedInBookingState0.handle(bookingContext18);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState22 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str23 = cancelledBookingState22.getName();
        bookingContext18.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState22);
        java.lang.String str25 = cancelledBookingState22.getName();
        java.lang.String str26 = cancelledBookingState22.getName();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Cancelled" + "'", str23, "Cancelled");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cancelled" + "'", str25, "Cancelled");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Cancelled" + "'", str26, "Cancelled");
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor0 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor0.update("Checked in.");
        roomSensor0.update("Checked in.");
        roomSensor0.update("Cancelled");
        roomSensor0.update("admin");
        roomSensor0.update("Booking confirmed.");
        roomSensor0.update("Unverified badge detected for Cancelled.");
        roomSensor0.update("Unverified badge detected for .");
        roomSensor0.update("Booking confirmed.");
        roomSensor0.update("Pending");
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        boolean boolean13 = room6.isEnabled();
        int int14 = room6.getCapacity();
        room6.setEnabled(false);
        java.lang.String str17 = room6.getRoomNumber();
        room6.setEnabled(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor4.setSubject(checkInPublisher5);
        occupancySensor4.occupied = true;
        occupancySensor4.setDetected(false);
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        occupancySensor4.roomId = "hi!";
        com.conferenceroomscheduler.model.StudentAccount studentAccount20 = new com.conferenceroomscheduler.model.StudentAccount("Checked in.", "Pending", "Cancelled", true, false, "Booking confirmed.");
        com.conferenceroomscheduler.model.Badge badge21 = studentAccount20.getBadge();
        studentAccount20.setIdentifier("Unverified badge detected for .");
        boolean boolean24 = occupancySensor4.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount20);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor28 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher29 = null;
        occupancySensor28.setSubject(checkInPublisher29);
        boolean boolean31 = occupancySensor28.occupied;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor35 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean36 = occupancySensor35.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher37 = null;
        occupancySensor35.subject = checkInPublisher37;
        occupancySensor35.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher41 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor45 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher46 = null;
        occupancySensor45.setSubject(checkInPublisher46);
        occupancySensor45.occupied = true;
        occupancySensor45.setDetected(false);
        checkInPublisher41.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor45);
        occupancySensor35.setSubject(checkInPublisher41);
        com.conferenceroomscheduler.model.StudentAccount studentAccount60 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        checkInPublisher41.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount60);
        occupancySensor28.subject = checkInPublisher41;
        com.conferenceroomscheduler.model.AdminAccount adminAccount63 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str64 = adminAccount63.getEmail();
        com.conferenceroomscheduler.model.Badge badge65 = adminAccount63.getBadge();
        checkInPublisher41.notifyObservers((com.conferenceroomscheduler.model.Account) adminAccount63);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor70 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher71 = null;
        occupancySensor70.setSubject(checkInPublisher71);
        occupancySensor70.setDetected(true);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher75 = occupancySensor70.subject;
        occupancySensor70.occupied = false;
        checkInPublisher41.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor70);
        occupancySensor4.setSubject(checkInPublisher41);
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory80 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room86 = roomFactory80.createRoom("", "", (-1), "", "Cancelled");
        room86.setName("hi!");
        room86.setName("");
        boolean boolean91 = room86.isClosedForMaintenance();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor92 = room86.getOccupancySensor();
        checkInPublisher41.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor92);
        org.junit.Assert.assertNotNull(badge21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNull(badge65);
        org.junit.Assert.assertNull(checkInPublisher75);
        org.junit.Assert.assertNotNull(room86);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(occupancySensor92);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("", "faculty", "faculty", false, false, "admin");
        boolean boolean7 = studentAccount6.isUniversityAccount();
        studentAccount6.setUniversityAccount(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str1 = adminAccount0.getEmail();
        com.conferenceroomscheduler.model.Badge badge2 = adminAccount0.getBadge();
        boolean boolean3 = adminAccount0.isUniversityAccount();
        adminAccount0.setAccountType("Pending");
        java.lang.String str6 = adminAccount0.getAccountId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(badge2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str1 = adminAccount0.getEmail();
        adminAccount0.setVerified(false);
        java.lang.String str4 = adminAccount0.getAccountNumber();
        adminAccount0.setVerified(false);
        boolean boolean7 = adminAccount0.isUniversityAccount();
        adminAccount0.setEmail("Unverified badge detected for admin.");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("Pending", "admin", "Booking complete", false, true, "");
        staffAccount6.setAccountNumber("Booking confirmed.");
        java.lang.String str9 = staffAccount6.getPassword();
        staffAccount6.setAccountType("");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking complete" + "'", str9, "Booking complete");
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("faculty", "Cancelled", 100, false, "admin", "ADMIN-69");
        room6.setClosedForMaintenance(false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor9 = room6.getOccupancySensor();
        org.junit.Assert.assertNotNull(occupancySensor9);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "", "Booking complete", "Checked in.", (int) (byte) 1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getTitle();
        int int9 = bookingRequest7.getAttendeeCount();
        java.lang.String str10 = bookingRequest7.getTitle();
        java.lang.String str11 = bookingRequest7.getRoomId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Checked in." + "'", str8, "Checked in.");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Checked in." + "'", str10, "Checked in.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Booking complete", "", true);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("", "partner", "Pending", "ADMIN-69", true, false, "Checked in.");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("partner", "Booking complete", true);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getAccountType();
        java.lang.String str5 = reservation2.getAccountType();
        boolean boolean6 = reservation2.isCheckedIn();
        java.time.LocalDateTime localDateTime7 = reservation2.getStartTime();
        java.lang.String str8 = reservation2.getReservationId();
        reservation2.setRoomId("Checked in.");
        double double11 = reservation2.getHourlyRate();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand12 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        reservation0.setDepositLost(true);
        java.lang.String str12 = reservation0.getReservationId();
        reservation0.setRoomId("Unverified badge detected for Cancelled.");
        reservation0.setAccountType("");
        boolean boolean17 = reservation0.isCanceled();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("faculty", "faculty", true);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setBuilding("hi!");
        int int10 = room6.getCapacity();
        boolean boolean11 = room6.isClosedForMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState0 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState1 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation2 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext3 = new com.conferenceroomscheduler.patterns.BookingContext(reservation2);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState4 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext3.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState4);
        com.conferenceroomscheduler.patterns.BookingState bookingState6 = bookingContext3.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState7 = bookingContext3.getState();
        cancelledBookingState1.handle(bookingContext3);
        checkedInBookingState0.handle(bookingContext3);
        java.lang.String str10 = checkedInBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation11 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext12 = new com.conferenceroomscheduler.patterns.BookingContext(reservation11);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState13 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext12.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState13);
        com.conferenceroomscheduler.model.Reservation reservation15 = bookingContext12.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation16 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext17 = new com.conferenceroomscheduler.patterns.BookingContext(reservation16);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState18 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext17.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState18);
        com.conferenceroomscheduler.patterns.BookingState bookingState20 = bookingContext17.getState();
        bookingContext12.setState(bookingState20);
        checkedInBookingState0.handle(bookingContext12);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState23 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState24 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation25 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext26 = new com.conferenceroomscheduler.patterns.BookingContext(reservation25);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState27 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext26.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState27);
        com.conferenceroomscheduler.patterns.BookingState bookingState29 = bookingContext26.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState30 = bookingContext26.getState();
        cancelledBookingState24.handle(bookingContext26);
        checkedInBookingState23.handle(bookingContext26);
        java.lang.String str33 = checkedInBookingState23.getName();
        com.conferenceroomscheduler.model.Reservation reservation34 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext35 = new com.conferenceroomscheduler.patterns.BookingContext(reservation34);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState36 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext35.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState36);
        com.conferenceroomscheduler.model.Reservation reservation38 = bookingContext35.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation39 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext40 = new com.conferenceroomscheduler.patterns.BookingContext(reservation39);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState41 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext40.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState41);
        com.conferenceroomscheduler.patterns.BookingState bookingState43 = bookingContext40.getState();
        bookingContext35.setState(bookingState43);
        checkedInBookingState23.handle(bookingContext35);
        bookingContext12.setState((com.conferenceroomscheduler.patterns.BookingState) checkedInBookingState23);
        java.lang.String str47 = checkedInBookingState23.getName();
        java.lang.String str48 = checkedInBookingState23.getName();
        com.conferenceroomscheduler.model.Reservation reservation49 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext50 = new com.conferenceroomscheduler.patterns.BookingContext(reservation49);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState51 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext50.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState51);
        com.conferenceroomscheduler.patterns.BookingState bookingState53 = bookingContext50.getState();
        com.conferenceroomscheduler.model.Reservation reservation54 = bookingContext50.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation55 = bookingContext50.getReservation();
        com.conferenceroomscheduler.patterns.BookingState bookingState56 = bookingContext50.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState57 = bookingContext50.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState58 = bookingContext50.getState();
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState59 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str60 = pendingBookingState59.getName();
        com.conferenceroomscheduler.model.Reservation reservation61 = new com.conferenceroomscheduler.model.Reservation();
        reservation61.setFinalAmount((double) (byte) 100);
        reservation61.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext66 = new com.conferenceroomscheduler.patterns.BookingContext(reservation61);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState67 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str68 = cancelledBookingState67.getName();
        bookingContext66.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState67);
        pendingBookingState59.handle(bookingContext66);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState71 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation72 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext73 = new com.conferenceroomscheduler.patterns.BookingContext(reservation72);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState74 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext73.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState74);
        com.conferenceroomscheduler.patterns.BookingState bookingState76 = bookingContext73.getState();
        com.conferenceroomscheduler.model.Reservation reservation77 = bookingContext73.getReservation();
        cancelledBookingState71.handle(bookingContext73);
        java.lang.String str79 = cancelledBookingState71.getName();
        bookingContext66.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState71);
        java.lang.String str81 = cancelledBookingState71.getName();
        bookingContext50.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState71);
        java.lang.String str83 = bookingContext50.getStatus();
        checkedInBookingState23.handle(bookingContext50);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Checked in." + "'", str10, "Checked in.");
        org.junit.Assert.assertNull(reservation15);
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertNotNull(bookingState29);
        org.junit.Assert.assertNotNull(bookingState30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Checked in." + "'", str33, "Checked in.");
        org.junit.Assert.assertNull(reservation38);
        org.junit.Assert.assertNotNull(bookingState43);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Checked in." + "'", str47, "Checked in.");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Checked in." + "'", str48, "Checked in.");
        org.junit.Assert.assertNotNull(bookingState53);
        org.junit.Assert.assertNull(reservation54);
        org.junit.Assert.assertNull(reservation55);
        org.junit.Assert.assertNotNull(bookingState56);
        org.junit.Assert.assertNotNull(bookingState57);
        org.junit.Assert.assertNotNull(bookingState58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Pending" + "'", str60, "Pending");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Cancelled" + "'", str68, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState76);
        org.junit.Assert.assertNull(reservation77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Cancelled" + "'", str79, "Cancelled");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Cancelled" + "'", str81, "Cancelled");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Cancelled" + "'", str83, "Cancelled");
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        com.conferenceroomscheduler.model.Reservation reservation0 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext1 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState2 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext1.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState2);
        com.conferenceroomscheduler.patterns.BookingState bookingState4 = bookingContext1.getState();
        java.lang.String str5 = bookingContext1.getStatus();
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState6 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation7 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext8 = new com.conferenceroomscheduler.patterns.BookingContext(reservation7);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState9 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext8.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState9);
        completedBookingState6.handle(bookingContext8);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState12 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation13 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext14 = new com.conferenceroomscheduler.patterns.BookingContext(reservation13);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState15 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext14.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState15);
        com.conferenceroomscheduler.patterns.BookingState bookingState17 = bookingContext14.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState18 = bookingContext14.getState();
        cancelledBookingState12.handle(bookingContext14);
        completedBookingState6.handle(bookingContext14);
        java.lang.String str21 = completedBookingState6.getName();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext22 = null;
        completedBookingState6.handle(bookingContext22);
        java.lang.String str24 = completedBookingState6.getName();
        bookingContext1.setState((com.conferenceroomscheduler.patterns.BookingState) completedBookingState6);
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState26 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str27 = pendingBookingState26.getName();
        com.conferenceroomscheduler.model.Reservation reservation28 = new com.conferenceroomscheduler.model.Reservation();
        reservation28.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod31 = reservation28.getPaymentMethod();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext32 = new com.conferenceroomscheduler.patterns.BookingContext(reservation28);
        pendingBookingState26.handle(bookingContext32);
        completedBookingState6.handle(bookingContext32);
        com.conferenceroomscheduler.model.Reservation reservation35 = bookingContext32.getReservation();
        org.junit.Assert.assertNotNull(bookingState4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cancelled" + "'", str5, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState17);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Booking complete" + "'", str21, "Booking complete");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Booking complete" + "'", str24, "Booking complete");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Pending" + "'", str27, "Pending");
        org.junit.Assert.assertNull(paymentMethod31);
        org.junit.Assert.assertNotNull(reservation35);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState0 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str1 = confirmedBookingState0.getName();
        java.lang.String str2 = confirmedBookingState0.getName();
        java.lang.String str3 = confirmedBookingState0.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState4 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState5 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation6 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext7 = new com.conferenceroomscheduler.patterns.BookingContext(reservation6);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState8 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext7.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState8);
        com.conferenceroomscheduler.patterns.BookingState bookingState10 = bookingContext7.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState11 = bookingContext7.getState();
        cancelledBookingState5.handle(bookingContext7);
        checkedInBookingState4.handle(bookingContext7);
        java.lang.String str14 = checkedInBookingState4.getName();
        com.conferenceroomscheduler.model.Reservation reservation15 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext16 = new com.conferenceroomscheduler.patterns.BookingContext(reservation15);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState17 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext16.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState17);
        com.conferenceroomscheduler.model.Reservation reservation19 = bookingContext16.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation20 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext21 = new com.conferenceroomscheduler.patterns.BookingContext(reservation20);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState22 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext21.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState22);
        com.conferenceroomscheduler.patterns.BookingState bookingState24 = bookingContext21.getState();
        bookingContext16.setState(bookingState24);
        checkedInBookingState4.handle(bookingContext16);
        com.conferenceroomscheduler.model.Reservation reservation27 = bookingContext16.getReservation();
        confirmedBookingState0.handle(bookingContext16);
        java.lang.String str29 = confirmedBookingState0.getName();
        java.lang.String str30 = confirmedBookingState0.getName();
        java.lang.String str31 = confirmedBookingState0.getName();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState32 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation33 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext34 = new com.conferenceroomscheduler.patterns.BookingContext(reservation33);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState35 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext34.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState35);
        com.conferenceroomscheduler.patterns.BookingState bookingState37 = bookingContext34.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState38 = bookingContext34.getState();
        cancelledBookingState32.handle(bookingContext34);
        com.conferenceroomscheduler.patterns.BookingState bookingState40 = bookingContext34.getState();
        bookingContext34.request();
        confirmedBookingState0.handle(bookingContext34);
        com.conferenceroomscheduler.patterns.BookingState bookingState43 = bookingContext34.getState();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState44 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState45 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation46 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext47 = new com.conferenceroomscheduler.patterns.BookingContext(reservation46);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState48 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext47.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState48);
        com.conferenceroomscheduler.patterns.BookingState bookingState50 = bookingContext47.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState51 = bookingContext47.getState();
        cancelledBookingState45.handle(bookingContext47);
        checkedInBookingState44.handle(bookingContext47);
        com.conferenceroomscheduler.model.Reservation reservation54 = new com.conferenceroomscheduler.model.Reservation();
        reservation54.setFinalAmount((double) (byte) 100);
        reservation54.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext59 = new com.conferenceroomscheduler.patterns.BookingContext(reservation54);
        checkedInBookingState44.handle(bookingContext59);
        com.conferenceroomscheduler.model.Reservation reservation61 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext62 = new com.conferenceroomscheduler.patterns.BookingContext(reservation61);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState63 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext62.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState63);
        checkedInBookingState44.handle(bookingContext62);
        com.conferenceroomscheduler.model.Reservation reservation66 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext67 = new com.conferenceroomscheduler.patterns.BookingContext(reservation66);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState68 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext67.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState68);
        com.conferenceroomscheduler.patterns.BookingState bookingState70 = bookingContext67.getState();
        com.conferenceroomscheduler.model.Reservation reservation71 = bookingContext67.getReservation();
        checkedInBookingState44.handle(bookingContext67);
        bookingState43.handle(bookingContext67);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking confirmed." + "'", str1, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking confirmed." + "'", str2, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking confirmed." + "'", str3, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState10);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Checked in." + "'", str14, "Checked in.");
        org.junit.Assert.assertNull(reservation19);
        org.junit.Assert.assertNotNull(bookingState24);
        org.junit.Assert.assertNull(reservation27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Booking confirmed." + "'", str29, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Booking confirmed." + "'", str30, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Booking confirmed." + "'", str31, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState37);
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertNotNull(bookingState40);
        org.junit.Assert.assertNotNull(bookingState43);
        org.junit.Assert.assertNotNull(bookingState50);
        org.junit.Assert.assertNotNull(bookingState51);
        org.junit.Assert.assertNotNull(bookingState70);
        org.junit.Assert.assertNull(reservation71);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod12 = null;
        com.conferenceroomscheduler.model.Reservation reservation13 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime6, localDateTime7, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod12);
        reservation13.setDepositLost(true);
        java.time.LocalDateTime localDateTime16 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand17 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService1, reservation13, localDateTime16);
        reservation13.setHourlyRate((double) (-1.0f));
        boolean boolean20 = reservation13.isDepositLost();
        java.lang.String str21 = reservation13.getReservationId();
        java.time.LocalDateTime localDateTime22 = reservation13.getEndTime();
        reservation13.setAccountType("Cancelled");
        double double25 = reservation13.getHourlyRate();
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand28 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation13, localDateTime26, localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState0 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext2 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState3 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext2.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState3);
        completedBookingState0.handle(bookingContext2);
        com.conferenceroomscheduler.model.Reservation reservation6 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext7 = new com.conferenceroomscheduler.patterns.BookingContext(reservation6);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState8 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext7.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState8);
        com.conferenceroomscheduler.patterns.BookingState bookingState10 = bookingContext7.getState();
        completedBookingState0.handle(bookingContext7);
        bookingContext7.request();
        org.junit.Assert.assertNotNull(bookingState10);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = occupancySensor3.subject;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor8.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount17 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount17.setEmail("");
        boolean boolean20 = occupancySensor8.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount17);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor24 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean25 = occupancySensor24.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher26 = null;
        occupancySensor24.subject = checkInPublisher26;
        occupancySensor24.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher30 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor34 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher35 = null;
        occupancySensor34.setSubject(checkInPublisher35);
        occupancySensor34.occupied = true;
        occupancySensor34.setDetected(false);
        checkInPublisher30.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor34);
        occupancySensor24.setSubject(checkInPublisher30);
        com.conferenceroomscheduler.model.StudentAccount studentAccount49 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        checkInPublisher30.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount49);
        occupancySensor8.subject = checkInPublisher30;
        occupancySensor8.setRoomId("Checked in.");
        com.conferenceroomscheduler.model.Room room60 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str61 = room60.getRoomId();
        room60.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount70 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room60.checkIn((com.conferenceroomscheduler.model.Account) studentAccount70);
        com.conferenceroomscheduler.model.Badge badge72 = studentAccount70.getBadge();
        boolean boolean73 = occupancySensor8.scanIdBadge(badge72);
        boolean boolean74 = occupancySensor3.scanIdBadge(badge72);
        badge72.setAccountId("faculty");
        badge72.setAccountId("");
        boolean boolean79 = badge72.isVerified();
        org.junit.Assert.assertNull(checkInPublisher4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(badge72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        java.lang.String str6 = badgeScan3.getBadgeId();
        badgeScan3.setVerified(false);
        badgeScan3.setVerified(false);
        badgeScan3.setRoomId("Booking complete");
        badgeScan3.setBadgeId("admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState0 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext2 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState3 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext2.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState3);
        com.conferenceroomscheduler.patterns.BookingState bookingState5 = bookingContext2.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState6 = bookingContext2.getState();
        cancelledBookingState0.handle(bookingContext2);
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState8 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str9 = pendingBookingState8.getName();
        com.conferenceroomscheduler.model.Reservation reservation10 = new com.conferenceroomscheduler.model.Reservation();
        reservation10.setFinalAmount((double) (byte) 100);
        reservation10.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext15 = new com.conferenceroomscheduler.patterns.BookingContext(reservation10);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState16 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str17 = cancelledBookingState16.getName();
        bookingContext15.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState16);
        pendingBookingState8.handle(bookingContext15);
        cancelledBookingState0.handle(bookingContext15);
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState21 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str22 = pendingBookingState21.getName();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState23 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation24 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext25 = new com.conferenceroomscheduler.patterns.BookingContext(reservation24);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState26 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext25.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState26);
        com.conferenceroomscheduler.patterns.BookingState bookingState28 = bookingContext25.getState();
        com.conferenceroomscheduler.model.Reservation reservation29 = bookingContext25.getReservation();
        cancelledBookingState23.handle(bookingContext25);
        java.lang.String str31 = cancelledBookingState23.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState32 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState33 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation34 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext35 = new com.conferenceroomscheduler.patterns.BookingContext(reservation34);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState36 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext35.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState36);
        com.conferenceroomscheduler.patterns.BookingState bookingState38 = bookingContext35.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState39 = bookingContext35.getState();
        cancelledBookingState33.handle(bookingContext35);
        checkedInBookingState32.handle(bookingContext35);
        com.conferenceroomscheduler.model.Reservation reservation42 = new com.conferenceroomscheduler.model.Reservation();
        reservation42.setFinalAmount((double) (byte) 100);
        reservation42.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext47 = new com.conferenceroomscheduler.patterns.BookingContext(reservation42);
        checkedInBookingState32.handle(bookingContext47);
        com.conferenceroomscheduler.model.Reservation reservation49 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext50 = new com.conferenceroomscheduler.patterns.BookingContext(reservation49);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState51 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext50.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState51);
        checkedInBookingState32.handle(bookingContext50);
        com.conferenceroomscheduler.model.Reservation reservation54 = new com.conferenceroomscheduler.model.Reservation();
        reservation54.setFinalAmount((double) (byte) 100);
        java.lang.String str57 = reservation54.getRoomId();
        reservation54.setFinalAmount((double) 10.0f);
        java.lang.String str60 = reservation54.getUserId();
        reservation54.setFinalAmount((double) ' ');
        java.lang.String str63 = reservation54.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext64 = new com.conferenceroomscheduler.patterns.BookingContext(reservation54);
        bookingContext64.request();
        java.lang.String str66 = bookingContext64.getStatus();
        checkedInBookingState32.handle(bookingContext64);
        cancelledBookingState23.handle(bookingContext64);
        bookingContext64.request();
        com.conferenceroomscheduler.patterns.BookingState bookingState70 = bookingContext64.getState();
        java.lang.String str71 = bookingContext64.getStatus();
        pendingBookingState21.handle(bookingContext64);
        java.lang.String str73 = bookingContext64.getStatus();
        cancelledBookingState0.handle(bookingContext64);
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Pending" + "'", str9, "Pending");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cancelled" + "'", str17, "Cancelled");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pending" + "'", str22, "Pending");
        org.junit.Assert.assertNotNull(bookingState28);
        org.junit.Assert.assertNull(reservation29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Cancelled" + "'", str31, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertNotNull(bookingState39);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Pending" + "'", str66, "Pending");
        org.junit.Assert.assertNotNull(bookingState70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Booking complete" + "'", str71, "Booking complete");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Booking complete" + "'", str73, "Booking complete");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("student", "Cancelled", "Unverified badge detected for admin.", true, true, "");
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Booking complete", false, false);
        java.lang.String str4 = occupancySensor3.roomId;
        boolean boolean5 = occupancySensor3.isDetected;
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount12 = new com.conferenceroomscheduler.model.FacultyAccount("Booking complete", "hi!", "admin", true, true, "Booking confirmed.");
        java.lang.String str13 = facultyAccount12.getEmail();
        boolean boolean14 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) facultyAccount12);
        occupancySensor3.setDetected(false);
        occupancySensor3.occupied = false;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Booking complete" + "'", str4, "Booking complete");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Booking confirmed.", "staff", "Unverified badge detected for .", true, true, "Unverified badge detected for admin.");
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor3.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount12 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount12.setEmail("");
        boolean boolean15 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount12);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher16 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor20 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean21 = occupancySensor20.isDetected();
        occupancySensor20.occupied = false;
        checkInPublisher16.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor20);
        occupancySensor3.setSubject(checkInPublisher16);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor29 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor33 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean34 = occupancySensor33.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher35 = null;
        occupancySensor33.subject = checkInPublisher35;
        occupancySensor33.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher39 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor43 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher44 = null;
        occupancySensor43.setSubject(checkInPublisher44);
        occupancySensor43.occupied = true;
        occupancySensor43.setDetected(false);
        checkInPublisher39.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor43);
        occupancySensor33.setSubject(checkInPublisher39);
        occupancySensor29.setSubject(checkInPublisher39);
        occupancySensor3.setSubject(checkInPublisher39);
        com.conferenceroomscheduler.model.AdminAccount adminAccount54 = new com.conferenceroomscheduler.model.AdminAccount();
        boolean boolean55 = adminAccount54.isVerified();
        adminAccount54.setUniversityAccount(false);
        com.conferenceroomscheduler.model.Badge badge58 = adminAccount54.getBadge();
        java.lang.String str59 = adminAccount54.getAccountNumber();
        boolean boolean60 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount54);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(badge58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        java.lang.String str6 = badgeScan3.getBadgeId();
        java.lang.String str7 = badgeScan3.getRoomId();
        java.lang.String str8 = badgeScan3.getRoomId();
        badgeScan3.setVerified(true);
        badgeScan3.setRoomId("Booking complete");
        boolean boolean13 = badgeScan3.isVerified();
        java.lang.String str14 = badgeScan3.getBadgeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = occupancySensor3.subject;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor8.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount17 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount17.setEmail("");
        boolean boolean20 = occupancySensor8.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount17);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor24 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean25 = occupancySensor24.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher26 = null;
        occupancySensor24.subject = checkInPublisher26;
        occupancySensor24.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher30 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor34 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher35 = null;
        occupancySensor34.setSubject(checkInPublisher35);
        occupancySensor34.occupied = true;
        occupancySensor34.setDetected(false);
        checkInPublisher30.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor34);
        occupancySensor24.setSubject(checkInPublisher30);
        com.conferenceroomscheduler.model.StudentAccount studentAccount49 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        checkInPublisher30.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount49);
        occupancySensor8.subject = checkInPublisher30;
        occupancySensor8.setRoomId("Checked in.");
        com.conferenceroomscheduler.model.Room room60 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str61 = room60.getRoomId();
        room60.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount70 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room60.checkIn((com.conferenceroomscheduler.model.Account) studentAccount70);
        com.conferenceroomscheduler.model.Badge badge72 = studentAccount70.getBadge();
        boolean boolean73 = occupancySensor8.scanIdBadge(badge72);
        boolean boolean74 = occupancySensor3.scanIdBadge(badge72);
        java.lang.String str75 = occupancySensor3.getRoomId();
        org.junit.Assert.assertNull(checkInPublisher4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(badge72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Pending" + "'", str75, "Pending");
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("student", "Pending", "", false, true, "admin");
        adminAccount6.setAccountId("hi!");
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("Unverified badge detected for .", "ADMIN-69", "Verified badge detected for Checked in..", true, false, "partner");
        staffAccount6.setIdentifier("Cancelled");
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setDepositAmount(0.0d);
        reservation0.setAccountType("");
        java.lang.String str8 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (short) 100);
        reservation0.setExtended(true);
        reservation0.setAccountType("");
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState0 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str1 = confirmedBookingState0.getName();
        java.lang.String str2 = confirmedBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation3 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext4 = new com.conferenceroomscheduler.patterns.BookingContext(reservation3);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState5 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext4.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState5);
        com.conferenceroomscheduler.model.Reservation reservation7 = bookingContext4.getReservation();
        confirmedBookingState0.handle(bookingContext4);
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState9 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        java.lang.String str10 = completedBookingState9.getName();
        java.lang.String str11 = completedBookingState9.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState12 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState13 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation14 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext15 = new com.conferenceroomscheduler.patterns.BookingContext(reservation14);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState16 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext15.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState16);
        com.conferenceroomscheduler.patterns.BookingState bookingState18 = bookingContext15.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState19 = bookingContext15.getState();
        cancelledBookingState13.handle(bookingContext15);
        checkedInBookingState12.handle(bookingContext15);
        java.lang.String str22 = checkedInBookingState12.getName();
        com.conferenceroomscheduler.model.Reservation reservation23 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext24 = new com.conferenceroomscheduler.patterns.BookingContext(reservation23);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState25 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext24.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState25);
        com.conferenceroomscheduler.model.Reservation reservation27 = bookingContext24.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation28 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext29 = new com.conferenceroomscheduler.patterns.BookingContext(reservation28);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState30 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext29.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState30);
        com.conferenceroomscheduler.patterns.BookingState bookingState32 = bookingContext29.getState();
        bookingContext24.setState(bookingState32);
        checkedInBookingState12.handle(bookingContext24);
        com.conferenceroomscheduler.model.Reservation reservation35 = bookingContext24.getReservation();
        completedBookingState9.handle(bookingContext24);
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState37 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation38 = new com.conferenceroomscheduler.model.Reservation();
        reservation38.setFinalAmount((double) (byte) 100);
        reservation38.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext43 = new com.conferenceroomscheduler.patterns.BookingContext(reservation38);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState44 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str45 = cancelledBookingState44.getName();
        bookingContext43.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState44);
        completedBookingState37.handle(bookingContext43);
        completedBookingState9.handle(bookingContext43);
        confirmedBookingState0.handle(bookingContext43);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState50 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState51 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation52 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext53 = new com.conferenceroomscheduler.patterns.BookingContext(reservation52);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState54 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext53.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState54);
        com.conferenceroomscheduler.patterns.BookingState bookingState56 = bookingContext53.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState57 = bookingContext53.getState();
        cancelledBookingState51.handle(bookingContext53);
        checkedInBookingState50.handle(bookingContext53);
        com.conferenceroomscheduler.model.Reservation reservation60 = new com.conferenceroomscheduler.model.Reservation();
        reservation60.setFinalAmount((double) (byte) 100);
        reservation60.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext65 = new com.conferenceroomscheduler.patterns.BookingContext(reservation60);
        checkedInBookingState50.handle(bookingContext65);
        com.conferenceroomscheduler.model.Reservation reservation67 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext68 = new com.conferenceroomscheduler.patterns.BookingContext(reservation67);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState69 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext68.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState69);
        checkedInBookingState50.handle(bookingContext68);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState72 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str73 = cancelledBookingState72.getName();
        bookingContext68.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState72);
        com.conferenceroomscheduler.patterns.BookingState bookingState75 = bookingContext68.getState();
        confirmedBookingState0.handle(bookingContext68);
        com.conferenceroomscheduler.patterns.BookingState bookingState77 = bookingContext68.getState();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking confirmed." + "'", str1, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking confirmed." + "'", str2, "Booking confirmed.");
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking complete" + "'", str10, "Booking complete");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking complete" + "'", str11, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertNotNull(bookingState19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Checked in." + "'", str22, "Checked in.");
        org.junit.Assert.assertNull(reservation27);
        org.junit.Assert.assertNotNull(bookingState32);
        org.junit.Assert.assertNull(reservation35);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Cancelled" + "'", str45, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState56);
        org.junit.Assert.assertNotNull(bookingState57);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Cancelled" + "'", str73, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState75);
        org.junit.Assert.assertNotNull(bookingState77);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("faculty", "Pending", (int) '#', "Cancelled", "Pending");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("admin", "Booking complete", (int) (byte) 1, "hi!", "Checked in.");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("faculty", "admin", (int) (byte) 100, "hi!", "Checked in.");
        com.conferenceroomscheduler.model.Room room30 = roomFactory0.createRoom("Checked in.", "admin", (int) (short) 1, "Cancelled", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room36 = roomFactory0.createRoom("admin", "admin", (-1), "student", "ADMIN-69");
        com.conferenceroomscheduler.model.Room room42 = roomFactory0.createRoom("ADMIN-69", "Verified badge detected for Checked in..", (int) (short) 0, "Booking complete", "Cancelled");
        com.conferenceroomscheduler.model.Room room48 = roomFactory0.createRoom("Verified badge detected for ADMIN-69.", "", (int) 'a', "admin", "student");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
        org.junit.Assert.assertNotNull(room30);
        org.junit.Assert.assertNotNull(room36);
        org.junit.Assert.assertNotNull(room42);
        org.junit.Assert.assertNotNull(room48);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy institutionalBillingPaymentStrategy0 = new com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy();
        boolean boolean3 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", 0.0d);
        boolean boolean6 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", (double) (short) 1);
        boolean boolean9 = institutionalBillingPaymentStrategy0.processPayment("Pending", (double) (short) -1);
        boolean boolean12 = institutionalBillingPaymentStrategy0.processPayment("Booking confirmed.", 0.0d);
        boolean boolean15 = institutionalBillingPaymentStrategy0.processPayment("staff", (double) 52);
        boolean boolean18 = institutionalBillingPaymentStrategy0.processPayment("hi!", (double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setCheckedIn(true);
        reservation0.setCheckedIn(false);
        reservation0.setExtended(true);
        reservation0.setAccountType("student");
        reservation0.setCheckedIn(false);
        reservation0.setAccountType("");
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getAccountType();
        java.lang.String str5 = reservation2.getAccountType();
        boolean boolean6 = reservation2.isCheckedIn();
        java.time.LocalDateTime localDateTime7 = reservation2.getStartTime();
        java.time.LocalDateTime localDateTime8 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand9 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation2, localDateTime8);
        reservation2.setDepositAmount((double) 0L);
        java.lang.String str12 = reservation2.getTitle();
        reservation2.setFinalAmount((double) 0.0f);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor15 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount22 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean23 = occupancySensor15.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount22);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher24 = null;
        occupancySensor15.setSubject(checkInPublisher24);
        occupancySensor15.isDetected = false;
        boolean boolean28 = occupancySensor15.isOccupied();
        com.conferenceroomscheduler.model.Badge badge32 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str33 = badge32.getEmail();
        boolean boolean34 = occupancySensor15.scanIdBadge(badge32);
        java.lang.String str35 = badge32.getAccountId();
        badge32.setAccountId("Cancelled");
        java.lang.String str38 = badge32.getEmail();
        java.lang.String str39 = badge32.getAccountId();
        boolean boolean40 = occupancySensor3.scanIdBadge(badge32);
        boolean boolean41 = occupancySensor3.occupied;
        boolean boolean42 = occupancySensor3.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Cancelled" + "'", str33, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Booking confirmed." + "'", str35, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Cancelled" + "'", str38, "Cancelled");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Cancelled" + "'", str39, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = occupancySensor3.subject;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor8.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount17 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount17.setEmail("");
        boolean boolean20 = occupancySensor8.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount17);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor24 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean25 = occupancySensor24.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher26 = null;
        occupancySensor24.subject = checkInPublisher26;
        occupancySensor24.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher30 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor34 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher35 = null;
        occupancySensor34.setSubject(checkInPublisher35);
        occupancySensor34.occupied = true;
        occupancySensor34.setDetected(false);
        checkInPublisher30.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor34);
        occupancySensor24.setSubject(checkInPublisher30);
        com.conferenceroomscheduler.model.StudentAccount studentAccount49 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        checkInPublisher30.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount49);
        occupancySensor8.subject = checkInPublisher30;
        occupancySensor8.setRoomId("Checked in.");
        com.conferenceroomscheduler.model.Room room60 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str61 = room60.getRoomId();
        room60.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount70 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room60.checkIn((com.conferenceroomscheduler.model.Account) studentAccount70);
        com.conferenceroomscheduler.model.Badge badge72 = studentAccount70.getBadge();
        boolean boolean73 = occupancySensor8.scanIdBadge(badge72);
        boolean boolean74 = occupancySensor3.scanIdBadge(badge72);
        badge72.setAccountId("faculty");
        boolean boolean77 = badge72.isVerified();
        org.junit.Assert.assertNull(checkInPublisher4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(badge72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("partner", "Unverified badge detected for .", "Booking complete", true, false, "Booking confirmed.");
        java.lang.String str7 = staffAccount6.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod1 = reservation0.getPaymentMethod();
        java.lang.String str2 = reservation0.getTitle();
        org.junit.Assert.assertNull(paymentMethod1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("partner", "Checked in.", true);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("partner", "partner", true);
        boolean boolean4 = badge3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setCheckedIn(true);
        java.lang.String str9 = reservation0.getAccountType();
        reservation0.setReservationId("student");
        java.time.LocalDateTime localDateTime12 = null;
        reservation0.setStartTime(localDateTime12);
        java.time.LocalDateTime localDateTime14 = null;
        reservation0.setStartTime(localDateTime14);
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        double double7 = reservation0.getDepositAmount();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod8 = reservation0.getPaymentMethod();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(paymentMethod8);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        java.lang.String str6 = badgeScan3.getBadgeId();
        java.lang.String str7 = badgeScan3.getRoomId();
        boolean boolean8 = badgeScan3.isVerified();
        java.lang.String str9 = badgeScan3.getBadgeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState0 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str1 = confirmedBookingState0.getName();
        java.lang.String str2 = confirmedBookingState0.getName();
        java.lang.String str3 = confirmedBookingState0.getName();
        java.lang.String str4 = confirmedBookingState0.getName();
        java.lang.String str5 = confirmedBookingState0.getName();
        java.lang.String str6 = confirmedBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking confirmed." + "'", str1, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking confirmed." + "'", str2, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking confirmed." + "'", str3, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Booking confirmed." + "'", str4, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking confirmed." + "'", str5, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking confirmed." + "'", str6, "Booking confirmed.");
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setName("student");
        room6.setEnabled(true);
        room6.setRoomNumber("Verified badge detected for Checked in..");
        org.junit.Assert.assertNotNull(room6);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState0 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext2 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState3 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext2.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState3);
        com.conferenceroomscheduler.patterns.BookingState bookingState5 = bookingContext2.getState();
        com.conferenceroomscheduler.model.Reservation reservation6 = bookingContext2.getReservation();
        cancelledBookingState0.handle(bookingContext2);
        java.lang.String str8 = cancelledBookingState0.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState9 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState10 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation11 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext12 = new com.conferenceroomscheduler.patterns.BookingContext(reservation11);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState13 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext12.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState13);
        com.conferenceroomscheduler.patterns.BookingState bookingState15 = bookingContext12.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState16 = bookingContext12.getState();
        cancelledBookingState10.handle(bookingContext12);
        checkedInBookingState9.handle(bookingContext12);
        com.conferenceroomscheduler.model.Reservation reservation19 = new com.conferenceroomscheduler.model.Reservation();
        reservation19.setFinalAmount((double) (byte) 100);
        reservation19.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext24 = new com.conferenceroomscheduler.patterns.BookingContext(reservation19);
        checkedInBookingState9.handle(bookingContext24);
        com.conferenceroomscheduler.model.Reservation reservation26 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext27 = new com.conferenceroomscheduler.patterns.BookingContext(reservation26);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState28 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext27.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState28);
        checkedInBookingState9.handle(bookingContext27);
        com.conferenceroomscheduler.model.Reservation reservation31 = new com.conferenceroomscheduler.model.Reservation();
        reservation31.setFinalAmount((double) (byte) 100);
        java.lang.String str34 = reservation31.getRoomId();
        reservation31.setFinalAmount((double) 10.0f);
        java.lang.String str37 = reservation31.getUserId();
        reservation31.setFinalAmount((double) ' ');
        java.lang.String str40 = reservation31.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext41 = new com.conferenceroomscheduler.patterns.BookingContext(reservation31);
        bookingContext41.request();
        java.lang.String str43 = bookingContext41.getStatus();
        checkedInBookingState9.handle(bookingContext41);
        cancelledBookingState0.handle(bookingContext41);
        java.lang.String str46 = cancelledBookingState0.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState47 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState48 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation49 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext50 = new com.conferenceroomscheduler.patterns.BookingContext(reservation49);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState51 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext50.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState51);
        com.conferenceroomscheduler.patterns.BookingState bookingState53 = bookingContext50.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState54 = bookingContext50.getState();
        cancelledBookingState48.handle(bookingContext50);
        checkedInBookingState47.handle(bookingContext50);
        com.conferenceroomscheduler.model.Reservation reservation57 = new com.conferenceroomscheduler.model.Reservation();
        reservation57.setFinalAmount((double) (byte) 100);
        reservation57.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext62 = new com.conferenceroomscheduler.patterns.BookingContext(reservation57);
        checkedInBookingState47.handle(bookingContext62);
        java.lang.String str64 = checkedInBookingState47.getName();
        com.conferenceroomscheduler.model.Reservation reservation65 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext66 = new com.conferenceroomscheduler.patterns.BookingContext(reservation65);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState67 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext66.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState67);
        com.conferenceroomscheduler.model.Reservation reservation69 = bookingContext66.getReservation();
        checkedInBookingState47.handle(bookingContext66);
        cancelledBookingState0.handle(bookingContext66);
        java.lang.String str72 = bookingContext66.getStatus();
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNull(reservation6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Pending" + "'", str43, "Pending");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Cancelled" + "'", str46, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState53);
        org.junit.Assert.assertNotNull(bookingState54);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Checked in." + "'", str64, "Checked in.");
        org.junit.Assert.assertNull(reservation69);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Booking complete" + "'", str72, "Booking complete");
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Booking confirmed.", true, false);
        java.lang.String str4 = occupancySensor3.getRoomId();
        boolean boolean5 = occupancySensor3.isOccupied();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Booking confirmed." + "'", str4, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setFinalAmount((double) (byte) 100);
        reservation2.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext7 = new com.conferenceroomscheduler.patterns.BookingContext(reservation2);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState8 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str9 = cancelledBookingState8.getName();
        bookingContext7.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState8);
        com.conferenceroomscheduler.model.Reservation reservation11 = bookingContext7.getReservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand12 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation11);
        reservation11.setTitle("");
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand16 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation11, localDateTime15);
        boolean boolean17 = extendBookingCommand16.wasSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand16.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.extendBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertNotNull(reservation11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor3.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount12 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount12.setEmail("");
        boolean boolean15 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount12);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor19 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean20 = occupancySensor19.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher21 = null;
        occupancySensor19.subject = checkInPublisher21;
        occupancySensor19.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher25 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor29 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher30 = null;
        occupancySensor29.setSubject(checkInPublisher30);
        occupancySensor29.occupied = true;
        occupancySensor29.setDetected(false);
        checkInPublisher25.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor29);
        occupancySensor19.setSubject(checkInPublisher25);
        com.conferenceroomscheduler.model.StudentAccount studentAccount44 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        checkInPublisher25.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount44);
        occupancySensor3.subject = checkInPublisher25;
        occupancySensor3.setRoomId("Checked in.");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher49 = occupancySensor3.subject;
        com.conferenceroomscheduler.patterns.CheckInObserver checkInObserver50 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkInPublisher49.removeObserver(checkInObserver50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.patterns.CheckInObserver.setSubject(com.conferenceroomscheduler.patterns.CheckInPublisher)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(checkInPublisher49);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Booking complete", "Booking confirmed.", (int) '4', true, "Booking confirmed.", "Pending");
        room6.setClosedForMaintenance(false);
        java.lang.String str9 = room6.getName();
        room6.setRoomNumber("Pending");
        com.conferenceroomscheduler.model.Room room18 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str19 = room18.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor20 = null;
        room18.setOccupancySensor(occupancySensor20);
        room18.setBuilding("");
        room18.setClosedForMaintenance(false);
        boolean boolean26 = room18.isEnabled();
        room18.setEnabled(false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor32 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher33 = null;
        occupancySensor32.setSubject(checkInPublisher33);
        boolean boolean35 = occupancySensor32.isDetected;
        occupancySensor32.roomId = "Booking confirmed.";
        room18.setOccupancySensor(occupancySensor32);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor39 = room18.getOccupancySensor();
        occupancySensor39.setOccupied(true);
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory42 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account50 = facultyFactory42.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account58 = facultyFactory42.createAccount("", "hi!", "", "", false, true, "");
        account58.setAccountNumber("Checked in.");
        account58.setIdentifier("hi!");
        java.lang.String str63 = account58.getPassword();
        account58.setAccountType("");
        boolean boolean66 = occupancySensor39.detectOccupancy(account58);
        room6.setOccupancySensor(occupancySensor39);
        room6.setBuilding("Booking complete");
        boolean boolean70 = room6.isClosedForMaintenance();
        room6.setClosedForMaintenance(false);
        room6.setCapacity((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking confirmed." + "'", str9, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(occupancySensor39);
        org.junit.Assert.assertNotNull(account50);
        org.junit.Assert.assertNotNull(account58);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService11 = null;
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation();
        reservation12.setAccountType("hi!");
        java.lang.String str15 = reservation12.getUserId();
        boolean boolean16 = reservation12.isDepositLost();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand17 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService11, reservation12);
        reservation12.setDepositLost(false);
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod40 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation41 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime34, localDateTime35, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod40);
        com.conferenceroomscheduler.model.Reservation reservation42 = new com.conferenceroomscheduler.model.Reservation("", "Pending", "Pending", "Booking complete", localDateTime24, localDateTime25, "Booking confirmed.", (double) 0.0f, (double) 1, (double) (byte) 100, paymentMethod40);
        reservation12.setPaymentMethod(paymentMethod40);
        com.conferenceroomscheduler.model.Reservation reservation44 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "admin", "staff", localDateTime5, localDateTime6, "Unverified badge detected for Cancelled.", 100.0d, (double) (byte) 1, 97.0d, paymentMethod40);
        reservation44.setHourlyRate((double) (byte) 10);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand47 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation44);
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand47.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + paymentMethod40 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod40.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        reservation0.setExtended(true);
        java.time.LocalDateTime localDateTime12 = reservation0.getStartTime();
        reservation0.setExtended(true);
        boolean boolean15 = reservation0.isExtended();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Pending", "hi!", "Pending", "faculty", 1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getOrganizerId();
        java.lang.String str9 = bookingRequest7.getRoomId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getStartTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Pending" + "'", str8, "Pending");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        java.lang.String str12 = occupancySensor3.roomId;
        boolean boolean13 = occupancySensor3.isOccupied();
        boolean boolean14 = occupancySensor3.isDetected();
        occupancySensor3.roomId = "Verified badge detected for Checked in..";
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pending" + "'", str12, "Pending");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "", "hi!", "", (int) '4', localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getTitle();
        java.time.LocalDateTime localDateTime9 = bookingRequest7.getStartTime();
        java.lang.String str10 = bookingRequest7.getOrganizerId();
        java.lang.String str11 = bookingRequest7.getRoomId();
        int int12 = bookingRequest7.getAttendeeCount();
        java.time.LocalDateTime localDateTime13 = bookingRequest7.getStartTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.model.Reservation reservation10 = new com.conferenceroomscheduler.model.Reservation();
        reservation10.setAccountType("hi!");
        java.lang.String str13 = reservation10.getUserId();
        boolean boolean14 = reservation10.isDepositLost();
        reservation10.setHourlyRate(1.0d);
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod27 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation28 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime21, localDateTime22, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod27);
        reservation10.setPaymentMethod(paymentMethod27);
        com.conferenceroomscheduler.model.Reservation reservation30 = new com.conferenceroomscheduler.model.Reservation("hi!", "faculty", "", "Cancelled", localDateTime4, localDateTime5, "Booking confirmed.", 97.0d, (double) (-1.0f), (-1.0d), paymentMethod27);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod31 = reservation30.getPaymentMethod();
        reservation30.setRoomId("hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + paymentMethod27 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod27.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertTrue("'" + paymentMethod31 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod31.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getRoomId();
        java.lang.String str10 = bookingRequest7.getRequestId();
        java.lang.String str11 = bookingRequest7.getRoomId();
        int int12 = bookingRequest7.getAttendeeCount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cancelled" + "'", str11, "Cancelled");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean4 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor3.subject = checkInPublisher5;
        occupancySensor3.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher9 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher14 = null;
        occupancySensor13.setSubject(checkInPublisher14);
        occupancySensor13.occupied = true;
        occupancySensor13.setDetected(false);
        checkInPublisher9.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor13);
        occupancySensor3.setSubject(checkInPublisher9);
        com.conferenceroomscheduler.model.StudentAccount studentAccount28 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        checkInPublisher9.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount28);
        boolean boolean30 = studentAccount28.isUniversityAccount();
        studentAccount28.setIdentifier("Unverified badge detected for Cancelled.");
        studentAccount28.setVerified(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getTitle();
        double double4 = reservation1.getDepositAmount();
        reservation1.setTitle("");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod7 = reservation1.getPaymentMethod();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(paymentMethod7);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.isDetected;
        java.lang.String str7 = occupancySensor3.getLastEvent();
        java.lang.String str8 = occupancySensor3.getLastEvent();
        boolean boolean9 = occupancySensor3.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setHourlyRate((double) (byte) 100);
        boolean boolean4 = reservation1.isDepositLost();
        java.lang.String str5 = reservation1.getUserId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand6 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setAccountType("ADMIN-69");
        reservation1.setFinalAmount((double) 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        java.lang.String str18 = room6.getRoomId();
        java.lang.String str19 = room6.getRoomId();
        java.lang.String str20 = room6.getBuilding();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = null;
        occupancySensor3.setSubject(checkInPublisher12);
        occupancySensor3.isDetected = false;
        boolean boolean16 = occupancySensor3.isOccupied();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor20 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor24 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean25 = occupancySensor24.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher26 = null;
        occupancySensor24.subject = checkInPublisher26;
        occupancySensor24.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher30 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor34 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher35 = null;
        occupancySensor34.setSubject(checkInPublisher35);
        occupancySensor34.occupied = true;
        occupancySensor34.setDetected(false);
        checkInPublisher30.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor34);
        occupancySensor24.setSubject(checkInPublisher30);
        occupancySensor20.setSubject(checkInPublisher30);
        occupancySensor3.subject = checkInPublisher30;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor48 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean49 = occupancySensor48.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher50 = null;
        occupancySensor48.subject = checkInPublisher50;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher52 = occupancySensor48.getSubject();
        checkInPublisher30.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor48);
        boolean boolean54 = occupancySensor48.occupied;
        occupancySensor48.setRoomId("Unverified badge detected for Cancelled.");
        com.conferenceroomscheduler.model.Account account57 = null;
        boolean boolean58 = occupancySensor48.detectOccupancy(account57);
        occupancySensor48.setRoomId("Pending");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(checkInPublisher52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor4.setSubject(checkInPublisher5);
        occupancySensor4.occupied = true;
        occupancySensor4.setDetected(false);
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor15 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor15.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount24 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount24.setEmail("");
        boolean boolean27 = occupancySensor15.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount24);
        checkInPublisher0.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor15);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor32 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor32.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount41 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount41.setEmail("");
        boolean boolean44 = occupancySensor32.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount41);
        checkInPublisher0.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor32);
        occupancySensor32.setOccupied(true);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor51 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean52 = occupancySensor51.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher53 = null;
        occupancySensor51.subject = checkInPublisher53;
        occupancySensor51.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher57 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor61 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher62 = null;
        occupancySensor61.setSubject(checkInPublisher62);
        occupancySensor61.occupied = true;
        occupancySensor61.setDetected(false);
        checkInPublisher57.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor61);
        occupancySensor51.setSubject(checkInPublisher57);
        boolean boolean70 = occupancySensor51.occupied;
        com.conferenceroomscheduler.model.AdminAccount adminAccount71 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str72 = adminAccount71.getEmail();
        boolean boolean73 = occupancySensor51.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount71);
        boolean boolean74 = occupancySensor51.occupied;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher75 = occupancySensor51.subject;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor79 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount86 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean87 = occupancySensor79.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount86);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher88 = null;
        occupancySensor79.setSubject(checkInPublisher88);
        checkInPublisher75.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor79);
        occupancySensor32.subject = checkInPublisher75;
        occupancySensor32.isDetected = true;
        boolean boolean94 = occupancySensor32.occupied;
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(checkInPublisher75);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        boolean boolean9 = reservation0.isExtended();
        reservation0.setReservationId("admin");
        java.time.LocalDateTime localDateTime12 = reservation0.getEndTime();
        java.time.LocalDateTime localDateTime13 = null;
        reservation0.setStartTime(localDateTime13);
        boolean boolean15 = reservation0.isCanceled();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        java.lang.String str4 = reservation1.getUserId();
        boolean boolean5 = reservation1.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod6 = reservation1.getPaymentMethod();
        reservation1.setCheckedIn(true);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand9 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentMethod6);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor7 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean8 = occupancySensor7.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher9 = null;
        occupancySensor7.subject = checkInPublisher9;
        occupancySensor7.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher13 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor17 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher18 = null;
        occupancySensor17.setSubject(checkInPublisher18);
        occupancySensor17.occupied = true;
        occupancySensor17.setDetected(false);
        checkInPublisher13.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor17);
        occupancySensor7.setSubject(checkInPublisher13);
        occupancySensor3.setSubject(checkInPublisher13);
        boolean boolean27 = occupancySensor3.isDetected;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor31 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount38 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean39 = occupancySensor31.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount38);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher40 = null;
        occupancySensor31.setSubject(checkInPublisher40);
        occupancySensor31.isDetected = false;
        boolean boolean44 = occupancySensor31.isOccupied();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor48 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor52 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean53 = occupancySensor52.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher54 = null;
        occupancySensor52.subject = checkInPublisher54;
        occupancySensor52.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher58 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor62 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher63 = null;
        occupancySensor62.setSubject(checkInPublisher63);
        occupancySensor62.occupied = true;
        occupancySensor62.setDetected(false);
        checkInPublisher58.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor62);
        occupancySensor52.setSubject(checkInPublisher58);
        occupancySensor48.setSubject(checkInPublisher58);
        occupancySensor31.subject = checkInPublisher58;
        occupancySensor3.setSubject(checkInPublisher58);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher74 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor78 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher79 = null;
        occupancySensor78.setSubject(checkInPublisher79);
        occupancySensor78.occupied = true;
        occupancySensor78.setDetected(false);
        checkInPublisher74.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor78);
        occupancySensor78.setRoomId("Booking confirmed.");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher88 = occupancySensor78.subject;
        occupancySensor3.setSubject(checkInPublisher88);
        occupancySensor3.isDetected = false;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(checkInPublisher88);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Cancelled", "admin", "Booking confirmed.", true, false, "");
        studentAccount6.setVerified(false);
        studentAccount6.setUniversityAccount(false);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        room6.setCapacity((int) 'a');
        com.conferenceroomscheduler.model.AdminAccount adminAccount26 = new com.conferenceroomscheduler.model.AdminAccount("hi!", "", "hi!", true, false, "hi!");
        adminAccount26.setEmail("");
        java.lang.String str29 = adminAccount26.getAccountId();
        room6.checkIn((com.conferenceroomscheduler.model.Account) adminAccount26);
        java.lang.String str31 = room6.getBuilding();
        room6.setCapacity(100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        boolean boolean9 = reservation0.isExtended();
        reservation0.setReservationId("admin");
        java.time.LocalDateTime localDateTime12 = reservation0.getStartTime();
        java.time.LocalDateTime localDateTime13 = null;
        reservation0.setEndTime(localDateTime13);
        java.time.LocalDateTime localDateTime15 = reservation0.getStartTime();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("", "partner", "", "Pending", (int) (short) 100, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Pending" + "'", str8, "Pending");
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Booking complete", "Cancelled", (int) (short) 1, "Booking complete", "");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = room12.getOccupancySensor();
        boolean boolean14 = occupancySensor13.occupied;
        boolean boolean15 = occupancySensor13.isDetected;
        occupancySensor13.occupied = false;
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(occupancySensor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Booking complete", "Cancelled", (int) ' ', false, "Cancelled", "ADMIN-69");
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setRoomNumber("Pending");
        java.lang.String str13 = room6.getName();
        room6.setRoomNumber("Checked in.");
        room6.setName("Booking complete");
        room6.setCapacity((int) (short) 100);
        room6.setCapacity(97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Unverified badge detected for .", "Verified badge detected for ADMIN-69.", false);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        reservation1.setDepositAmount((double) (byte) 0);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand10 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setReservationId("Booking complete");
        java.time.LocalDateTime localDateTime13 = null;
        reservation1.setEndTime(localDateTime13);
        reservation1.setDepositAmount((double) (short) 100);
        java.lang.String str17 = reservation1.getUserId();
        reservation1.setTitle("faculty");
        boolean boolean20 = reservation1.isDepositLost();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Booking confirmed.", false, true);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        java.lang.String str8 = room6.getBuilding();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor12 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher13 = null;
        occupancySensor12.setSubject(checkInPublisher13);
        boolean boolean15 = occupancySensor12.isDetected;
        occupancySensor12.roomId = "Booking confirmed.";
        room6.setOccupancySensor(occupancySensor12);
        room6.setClosedForMaintenance(false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount27 = new com.conferenceroomscheduler.model.StudentAccount("", "Booking confirmed.", "partner", false, true, "Unverified badge detected for Cancelled.");
        java.lang.String str28 = studentAccount27.getAccountType();
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount27);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "student" + "'", str28, "student");
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.occupied;
        java.lang.String str7 = occupancySensor3.roomId;
        boolean boolean8 = occupancySensor3.isDetected();
        occupancySensor3.roomId = "";
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Unverified badge detected for admin.", "student", "student", true, false, "Verified badge detected for Checked in..");
        java.lang.String str7 = studentAccount6.getAccountNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Verified badge detected for Checked in.." + "'", str7, "Verified badge detected for Checked in..");
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("faculty", "Unverified badge detected for .", "ADMIN-69", "hi!", true, false, "partner");
        java.lang.String str8 = account7.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ADMIN-69" + "'", str8, "ADMIN-69");
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("Unverified badge detected for .", "Verified badge detected for ADMIN-69.", "Verified badge detected for Checked in..", "Cancelled", false, false, "partner");
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState0 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        java.lang.String str1 = completedBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation2 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext3 = new com.conferenceroomscheduler.patterns.BookingContext(reservation2);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState4 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext3.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState4);
        java.lang.String str6 = cancelledBookingState4.getName();
        java.lang.String str7 = cancelledBookingState4.getName();
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState8 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str9 = confirmedBookingState8.getName();
        java.lang.String str10 = confirmedBookingState8.getName();
        java.lang.String str11 = confirmedBookingState8.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState12 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState13 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation14 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext15 = new com.conferenceroomscheduler.patterns.BookingContext(reservation14);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState16 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext15.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState16);
        com.conferenceroomscheduler.patterns.BookingState bookingState18 = bookingContext15.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState19 = bookingContext15.getState();
        cancelledBookingState13.handle(bookingContext15);
        checkedInBookingState12.handle(bookingContext15);
        java.lang.String str22 = checkedInBookingState12.getName();
        com.conferenceroomscheduler.model.Reservation reservation23 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext24 = new com.conferenceroomscheduler.patterns.BookingContext(reservation23);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState25 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext24.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState25);
        com.conferenceroomscheduler.model.Reservation reservation27 = bookingContext24.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation28 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext29 = new com.conferenceroomscheduler.patterns.BookingContext(reservation28);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState30 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext29.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState30);
        com.conferenceroomscheduler.patterns.BookingState bookingState32 = bookingContext29.getState();
        bookingContext24.setState(bookingState32);
        checkedInBookingState12.handle(bookingContext24);
        com.conferenceroomscheduler.model.Reservation reservation35 = bookingContext24.getReservation();
        confirmedBookingState8.handle(bookingContext24);
        java.lang.String str37 = confirmedBookingState8.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState38 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState39 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation40 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext41 = new com.conferenceroomscheduler.patterns.BookingContext(reservation40);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState42 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext41.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState42);
        com.conferenceroomscheduler.patterns.BookingState bookingState44 = bookingContext41.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState45 = bookingContext41.getState();
        cancelledBookingState39.handle(bookingContext41);
        checkedInBookingState38.handle(bookingContext41);
        com.conferenceroomscheduler.model.Reservation reservation48 = new com.conferenceroomscheduler.model.Reservation();
        reservation48.setFinalAmount((double) (byte) 100);
        reservation48.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext53 = new com.conferenceroomscheduler.patterns.BookingContext(reservation48);
        checkedInBookingState38.handle(bookingContext53);
        confirmedBookingState8.handle(bookingContext53);
        cancelledBookingState4.handle(bookingContext53);
        completedBookingState0.handle(bookingContext53);
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState58 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation59 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext60 = new com.conferenceroomscheduler.patterns.BookingContext(reservation59);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState61 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext60.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState61);
        completedBookingState58.handle(bookingContext60);
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState64 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        java.lang.String str65 = completedBookingState64.getName();
        java.lang.String str66 = completedBookingState64.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState67 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState68 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation69 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext70 = new com.conferenceroomscheduler.patterns.BookingContext(reservation69);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState71 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext70.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState71);
        com.conferenceroomscheduler.patterns.BookingState bookingState73 = bookingContext70.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState74 = bookingContext70.getState();
        cancelledBookingState68.handle(bookingContext70);
        checkedInBookingState67.handle(bookingContext70);
        java.lang.String str77 = checkedInBookingState67.getName();
        com.conferenceroomscheduler.model.Reservation reservation78 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext79 = new com.conferenceroomscheduler.patterns.BookingContext(reservation78);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState80 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext79.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState80);
        com.conferenceroomscheduler.model.Reservation reservation82 = bookingContext79.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation83 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext84 = new com.conferenceroomscheduler.patterns.BookingContext(reservation83);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState85 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext84.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState85);
        com.conferenceroomscheduler.patterns.BookingState bookingState87 = bookingContext84.getState();
        bookingContext79.setState(bookingState87);
        checkedInBookingState67.handle(bookingContext79);
        com.conferenceroomscheduler.model.Reservation reservation90 = bookingContext79.getReservation();
        completedBookingState64.handle(bookingContext79);
        java.lang.String str92 = completedBookingState64.getName();
        bookingContext60.setState((com.conferenceroomscheduler.patterns.BookingState) completedBookingState64);
        com.conferenceroomscheduler.model.Reservation reservation94 = bookingContext60.getReservation();
        completedBookingState0.handle(bookingContext60);
        bookingContext60.request();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking complete" + "'", str1, "Booking complete");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cancelled" + "'", str6, "Cancelled");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cancelled" + "'", str7, "Cancelled");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking confirmed." + "'", str9, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking confirmed." + "'", str10, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking confirmed." + "'", str11, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertNotNull(bookingState19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Checked in." + "'", str22, "Checked in.");
        org.junit.Assert.assertNull(reservation27);
        org.junit.Assert.assertNotNull(bookingState32);
        org.junit.Assert.assertNull(reservation35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Booking confirmed." + "'", str37, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState44);
        org.junit.Assert.assertNotNull(bookingState45);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Booking complete" + "'", str65, "Booking complete");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Booking complete" + "'", str66, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState73);
        org.junit.Assert.assertNotNull(bookingState74);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Checked in." + "'", str77, "Checked in.");
        org.junit.Assert.assertNull(reservation82);
        org.junit.Assert.assertNotNull(bookingState87);
        org.junit.Assert.assertNull(reservation90);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "Booking complete" + "'", str92, "Booking complete");
        org.junit.Assert.assertNull(reservation94);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        boolean boolean7 = room6.isEnabled();
        boolean boolean8 = room6.isClosedForMaintenance();
        room6.setRoomNumber("Cancelled");
        room6.setEnabled(false);
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        java.lang.String str4 = reservation1.getAccountType();
        java.time.LocalDateTime localDateTime5 = reservation1.getEndTime();
        java.lang.String str6 = reservation1.getTitle();
        java.lang.String str7 = reservation1.getUserId();
        boolean boolean8 = reservation1.isCanceled();
        reservation1.setDepositAmount((double) (byte) 1);
        boolean boolean11 = reservation1.isExtended();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = null;
        occupancySensor3.setSubject(checkInPublisher12);
        occupancySensor3.isDetected = false;
        java.lang.String str16 = occupancySensor3.getRoomId();
        occupancySensor3.occupied = false;
        occupancySensor3.occupied = false;
        occupancySensor3.setRoomId("student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pending" + "'", str16, "Pending");
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getAccountType();
        java.lang.String str5 = reservation2.getAccountType();
        boolean boolean6 = reservation2.isCheckedIn();
        java.time.LocalDateTime localDateTime7 = reservation2.getStartTime();
        java.time.LocalDateTime localDateTime8 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand9 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation2, localDateTime8);
        reservation2.setDepositAmount((double) 0L);
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation();
        reservation12.setFinalAmount((double) (byte) 100);
        java.lang.String str15 = reservation12.getRoomId();
        reservation12.setFinalAmount((double) 10.0f);
        java.lang.String str18 = reservation12.getUserId();
        reservation12.setDepositAmount((double) (byte) 0);
        double double21 = reservation12.getHourlyRate();
        reservation12.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext24 = new com.conferenceroomscheduler.patterns.BookingContext(reservation12);
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod35 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation36 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime29, localDateTime30, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod35);
        reservation12.setPaymentMethod(paymentMethod35);
        java.time.LocalDateTime localDateTime38 = reservation12.getStartTime();
        java.time.LocalDateTime localDateTime39 = reservation12.getStartTime();
        boolean boolean40 = reservation12.isDepositLost();
        java.lang.String str41 = reservation12.getUserId();
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod62 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation63 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime56, localDateTime57, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod62);
        com.conferenceroomscheduler.model.Reservation reservation64 = new com.conferenceroomscheduler.model.Reservation("Booking confirmed.", "Booking confirmed.", "", "", localDateTime46, localDateTime47, "Booking complete", 0.0d, (double) 0, (double) 100.0f, paymentMethod62);
        reservation12.setPaymentMethod(paymentMethod62);
        reservation2.setPaymentMethod(paymentMethod62);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod35 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod35.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertNull(localDateTime38);
        org.junit.Assert.assertNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + paymentMethod62 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod62.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("admin", "student", "", false, false, "student");
        com.conferenceroomscheduler.model.Badge badge7 = facultyAccount6.getBadge();
        java.lang.String str8 = badge7.getEmail();
        badge7.setEmail("Unverified badge detected for admin.");
        org.junit.Assert.assertNotNull(badge7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) (short) 1, false, "staff", "");
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Pending", "Pending", true);
        java.lang.String str4 = badge3.getEmail();
        java.lang.String str5 = badge3.getAccountId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pending" + "'", str4, "Pending");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pending" + "'", str5, "Pending");
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("faculty", "Pending", (int) '#', "Cancelled", "Pending");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("admin", "Booking complete", (int) (byte) 1, "hi!", "Checked in.");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("faculty", "admin", (int) (byte) 100, "hi!", "Checked in.");
        com.conferenceroomscheduler.model.Room room30 = roomFactory0.createRoom("Checked in.", "admin", (int) (short) 1, "Cancelled", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room36 = roomFactory0.createRoom("Unverified badge detected for .", "Unverified badge detected for .", 100, "admin", "Pending");
        com.conferenceroomscheduler.model.Room room42 = roomFactory0.createRoom("admin", "ADMIN-69", (int) (short) -1, "Checked in.", "Verified badge detected for ADMIN-69.");
        java.lang.String str43 = room42.getRoomNumber();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
        org.junit.Assert.assertNotNull(room30);
        org.junit.Assert.assertNotNull(room36);
        org.junit.Assert.assertNotNull(room42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Verified badge detected for ADMIN-69." + "'", str43, "Verified badge detected for ADMIN-69.");
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getRoomId();
        java.lang.String str10 = bookingRequest7.getRequestId();
        java.time.LocalDateTime localDateTime11 = bookingRequest7.getEndTime();
        java.lang.String str12 = bookingRequest7.getOrganizerId();
        java.time.LocalDateTime localDateTime13 = bookingRequest7.getStartTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("faculty", "Booking complete", "student", true, false, "ADMIN-69");
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand3 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime2);
        boolean boolean4 = extendBookingCommand3.wasSuccessful();
        boolean boolean5 = extendBookingCommand3.wasSuccessful();
        boolean boolean6 = extendBookingCommand3.wasSuccessful();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setHourlyRate((double) (byte) 100);
        boolean boolean3 = reservation0.isDepositLost();
        java.lang.String str4 = reservation0.getUserId();
        java.lang.String str5 = reservation0.getUserId();
        reservation0.setDepositLost(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("Pending", "ADMIN-69", "Booking confirmed.", "faculty", false, true, "Pending");
        account7.setUniversityAccount(true);
        account7.setIdentifier("faculty");
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        room6.setCapacity((int) 'a');
        java.lang.String str20 = room6.getName();
        java.lang.String str21 = room6.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cancelled" + "'", str20, "Cancelled");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        reservation1.setCanceled(false);
        reservation1.setCanceled(false);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = reservation1.getPaymentMethod();
        reservation1.setRoomId("Checked in.");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand16 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime14, localDateTime15);
        java.lang.String str17 = reservation1.getReservationId();
        reservation1.setReservationId("Unverified badge detected for .");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(paymentMethod11);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        java.lang.String str6 = badgeScan3.getBadgeId();
        badgeScan3.setVerified(false);
        boolean boolean9 = badgeScan3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Booking complete", (int) ' ', true, "", "ADMIN-69");
        java.lang.String str7 = room6.getName();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = room6.getOccupancySensor();
        com.conferenceroomscheduler.model.Account account16 = new com.conferenceroomscheduler.model.Account("Cancelled", "Cancelled", "Booking confirmed.", "hi!", false, false, "");
        account16.setAccountType("admin");
        room6.checkIn(account16);
        java.lang.String str20 = account16.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking complete" + "'", str7, "Booking complete");
        org.junit.Assert.assertNotNull(occupancySensor8);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, true);
        boolean boolean4 = occupancySensor3.isOccupied();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean9 = occupancySensor8.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher10 = null;
        occupancySensor8.subject = checkInPublisher10;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = occupancySensor8.getSubject();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor16 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean17 = occupancySensor16.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher18 = null;
        occupancySensor16.subject = checkInPublisher18;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher20 = occupancySensor16.getSubject();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher21 = occupancySensor16.getSubject();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor25 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher26 = null;
        occupancySensor25.setSubject(checkInPublisher26);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor31 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor35 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean36 = occupancySensor35.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher37 = null;
        occupancySensor35.subject = checkInPublisher37;
        occupancySensor35.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher41 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor45 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher46 = null;
        occupancySensor45.setSubject(checkInPublisher46);
        occupancySensor45.occupied = true;
        occupancySensor45.setDetected(false);
        checkInPublisher41.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor45);
        occupancySensor35.setSubject(checkInPublisher41);
        occupancySensor31.setSubject(checkInPublisher41);
        occupancySensor25.setSubject(checkInPublisher41);
        occupancySensor16.setSubject(checkInPublisher41);
        occupancySensor8.setSubject(checkInPublisher41);
        occupancySensor3.subject = checkInPublisher41;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher59 = occupancySensor3.getSubject();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor63 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher64 = null;
        occupancySensor63.setSubject(checkInPublisher64);
        boolean boolean66 = occupancySensor63.isDetected;
        java.lang.String str67 = occupancySensor63.getLastEvent();
        java.lang.String str68 = occupancySensor63.getRoomId();
        occupancySensor63.setRoomId("staff");
        checkInPublisher59.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor63);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(checkInPublisher12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(checkInPublisher20);
        org.junit.Assert.assertNull(checkInPublisher21);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(checkInPublisher59);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("student", "faculty", "", "Cancelled", (int) (short) 10, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRoomId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        reservation1.setDepositAmount((double) (byte) 0);
        boolean boolean10 = reservation1.isExtended();
        reservation1.setRoomId("Checked in.");
        reservation1.setReservationId("Booking complete");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand15 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext16 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.BookingState bookingState17 = bookingContext16.getState();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookingState17);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand6 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setAccountType("Cancelled");
        java.lang.String str9 = reservation1.getReservationId();
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setEnabled(true);
        java.lang.String str13 = room6.getName();
        boolean boolean14 = room6.isClosedForMaintenance();
        room6.setClosedForMaintenance(true);
        java.lang.String str17 = room6.getRoomNumber();
        room6.setName("Cancelled");
        room6.setClosedForMaintenance(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setHourlyRate((double) (byte) 100);
        boolean boolean3 = reservation0.isDepositLost();
        java.time.LocalDateTime localDateTime4 = null;
        reservation0.setEndTime(localDateTime4);
        java.lang.String str6 = reservation0.getTitle();
        boolean boolean7 = reservation0.isCheckedIn();
        reservation0.setUserId("partner");
        reservation0.setReservationId("Booking complete");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Pending", "Cancelled", (int) (byte) 10, "Checked in.", "Cancelled");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("Booking complete", "student", (int) (byte) 100, "Booking complete", "faculty");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor19 = room18.getOccupancySensor();
        boolean boolean20 = room18.isClosedForMaintenance();
        java.lang.String str21 = room18.getName();
        boolean boolean22 = room18.isClosedForMaintenance();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(occupancySensor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "student" + "'", str21, "student");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("admin", "Pending", false);
        boolean boolean4 = badgeScan3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("", "Verified badge detected for ADMIN-69.", "faculty", "Unverified badge detected for Cancelled.", (int) '4', localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Unverified badge detected for Cancelled." + "'", str8, "Unverified badge detected for Cancelled.");
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("", "Booking complete", false);
        java.lang.String str4 = badge3.getEmail();
        boolean boolean5 = badge3.isVerified();
        badge3.setAccountId("student");
        badge3.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = null;
        occupancySensor3.setSubject(checkInPublisher12);
        occupancySensor3.isDetected = false;
        boolean boolean16 = occupancySensor3.isOccupied();
        com.conferenceroomscheduler.model.Badge badge20 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str21 = badge20.getEmail();
        boolean boolean22 = occupancySensor3.scanIdBadge(badge20);
        badge20.setAccountId("hi!");
        java.lang.String str25 = badge20.getAccountId();
        java.lang.String str26 = badge20.getEmail();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Cancelled" + "'", str26, "Cancelled");
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState0 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext2 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState3 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext2.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState3);
        com.conferenceroomscheduler.patterns.BookingState bookingState5 = bookingContext2.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState6 = bookingContext2.getState();
        cancelledBookingState0.handle(bookingContext2);
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState8 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str9 = pendingBookingState8.getName();
        com.conferenceroomscheduler.model.Reservation reservation10 = new com.conferenceroomscheduler.model.Reservation();
        reservation10.setFinalAmount((double) (byte) 100);
        reservation10.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext15 = new com.conferenceroomscheduler.patterns.BookingContext(reservation10);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState16 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str17 = cancelledBookingState16.getName();
        bookingContext15.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState16);
        pendingBookingState8.handle(bookingContext15);
        cancelledBookingState0.handle(bookingContext15);
        com.conferenceroomscheduler.model.Reservation reservation21 = bookingContext15.getReservation();
        reservation21.setCheckedIn(true);
        reservation21.setRoomId("faculty");
        java.lang.String str26 = reservation21.getUserId();
        boolean boolean27 = reservation21.isExtended();
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Pending" + "'", str9, "Pending");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cancelled" + "'", str17, "Cancelled");
        org.junit.Assert.assertNotNull(reservation21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setName("hi!");
        room6.setName("");
        room6.setRoomNumber("");
        java.lang.String str13 = room6.getBuilding();
        room6.setClosedForMaintenance(false);
        room6.setName("admin");
        java.lang.String str18 = room6.getRoomNumber();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        boolean boolean1 = adminAccount0.isVerified();
        adminAccount0.setUniversityAccount(false);
        java.lang.String str4 = adminAccount0.getPassword();
        java.lang.String str5 = adminAccount0.getEmail();
        adminAccount0.setUniversityAccount(true);
        adminAccount0.setAccountType("faculty");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        reservation0.setDepositLost(true);
        double double12 = reservation0.getDepositAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) 10);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("Cancelled", 1.0d);
        boolean boolean9 = creditCardPaymentStrategy0.processPayment("Cancelled", (double) 100);
        boolean boolean12 = creditCardPaymentStrategy0.processPayment("hi!", (double) 0L);
        boolean boolean15 = creditCardPaymentStrategy0.processPayment("Booking confirmed.", (double) (short) 100);
        boolean boolean18 = creditCardPaymentStrategy0.processPayment("Cancelled", (double) (short) 1);
        boolean boolean21 = creditCardPaymentStrategy0.processPayment("Pending", (double) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("faculty", "Cancelled", 100, false, "admin", "ADMIN-69");
        boolean boolean7 = room6.isEnabled();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = room6.getOccupancySensor();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor12 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher13 = null;
        occupancySensor12.setSubject(checkInPublisher13);
        occupancySensor12.occupied = true;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher17 = occupancySensor12.subject;
        occupancySensor12.setDetected(true);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor23 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount30 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean31 = occupancySensor23.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount30);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher32 = null;
        occupancySensor23.setSubject(checkInPublisher32);
        occupancySensor23.isDetected = false;
        boolean boolean36 = occupancySensor23.isOccupied();
        com.conferenceroomscheduler.model.Badge badge40 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str41 = badge40.getEmail();
        boolean boolean42 = occupancySensor23.scanIdBadge(badge40);
        java.lang.String str43 = badge40.getAccountId();
        badge40.setAccountId("Cancelled");
        badge40.setAccountId("");
        java.lang.String str48 = badge40.getAccountId();
        java.lang.String str49 = badge40.getEmail();
        boolean boolean50 = occupancySensor12.scanIdBadge(badge40);
        java.lang.String str51 = badge40.getAccountId();
        boolean boolean52 = occupancySensor8.scanIdBadge(badge40);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(occupancySensor8);
        org.junit.Assert.assertNull(checkInPublisher17);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Cancelled" + "'", str41, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Booking confirmed." + "'", str43, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Cancelled" + "'", str49, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        reservation1.setFinalAmount((double) ' ');
        reservation1.setAccountType("Booking confirmed.");
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand12 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        java.time.LocalDateTime localDateTime1 = null;
        reservation0.setEndTime(localDateTime1);
        reservation0.setHourlyRate((double) 'a');
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        java.time.LocalDateTime localDateTime6 = reservation0.getEndTime();
        boolean boolean7 = reservation0.isCheckedIn();
        double double8 = reservation0.getFinalAmount();
        reservation0.setFinalAmount((double) (short) 10);
        reservation0.setUserId("staff");
        java.time.LocalDateTime localDateTime13 = reservation0.getEndTime();
        java.lang.String str14 = reservation0.getReservationId();
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.model.Reservation reservation20 = new com.conferenceroomscheduler.model.Reservation();
        reservation20.setFinalAmount((double) (byte) 100);
        java.lang.String str23 = reservation20.getRoomId();
        reservation20.setFinalAmount((double) 10.0f);
        java.lang.String str26 = reservation20.getUserId();
        reservation20.setDepositAmount((double) (byte) 0);
        double double29 = reservation20.getHourlyRate();
        reservation20.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext32 = new com.conferenceroomscheduler.patterns.BookingContext(reservation20);
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod43 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation44 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime37, localDateTime38, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod43);
        reservation20.setPaymentMethod(paymentMethod43);
        com.conferenceroomscheduler.model.Reservation reservation46 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "Booking complete", "admin", "Booking complete", localDateTime14, localDateTime15, "Booking confirmed.", (double) (short) -1, (double) 0.0f, (double) 0, paymentMethod43);
        com.conferenceroomscheduler.model.Reservation reservation47 = new com.conferenceroomscheduler.model.Reservation("faculty", "ADMIN-69", "Cancelled", "student", localDateTime4, localDateTime5, "Booking confirmed.", (double) (short) 1, (-1.0d), (double) 100, paymentMethod43);
        java.lang.String str48 = reservation47.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext49 = new com.conferenceroomscheduler.patterns.BookingContext(reservation47);
        reservation47.setUserId("admin");
        reservation47.setTitle("Unverified badge detected for .");
        reservation47.setDepositLost(true);
        reservation47.setFinalAmount((double) 'a');
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod43 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod43.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "student" + "'", str48, "student");
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        reservation0.setExtended(true);
        java.lang.String str12 = reservation0.getTitle();
        boolean boolean13 = reservation0.isExtended();
        boolean boolean14 = reservation0.isCanceled();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext15 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        java.lang.String str16 = reservation0.getAccountType();
        java.lang.String str17 = reservation0.getRoomId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("student", false, true);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        com.conferenceroomscheduler.model.Account account0 = new com.conferenceroomscheduler.model.Account();
        account0.setPassword("Pending");
        java.lang.String str3 = account0.getAccountNumber();
        account0.setIdentifier("");
        account0.setUniversityAccount(false);
        account0.setAccountType("Pending");
        account0.setAccountNumber("partner");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setDepositAmount(0.0d);
        reservation0.setAccountType("");
        java.lang.String str8 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (short) 100);
        reservation0.setCheckedIn(false);
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setEnabled(true);
        int int10 = room6.getCapacity();
        java.lang.String str11 = room6.getRoomId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation2.getPaymentMethod();
        reservation2.setDepositAmount(0.0d);
        java.lang.String str8 = reservation2.getReservationId();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand11 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService1, reservation2, localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime12 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand13 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation2, localDateTime12);
        reservation2.setTitle("Checked in.");
        boolean boolean16 = reservation2.isExtended();
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService17 = null;
        com.conferenceroomscheduler.model.Reservation reservation18 = new com.conferenceroomscheduler.model.Reservation();
        reservation18.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod21 = reservation18.getPaymentMethod();
        reservation18.setDepositAmount(0.0d);
        java.lang.String str24 = reservation18.getReservationId();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand27 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService17, reservation18, localDateTime25, localDateTime26);
        java.time.LocalDateTime localDateTime28 = reservation18.getEndTime();
        com.conferenceroomscheduler.model.Reservation reservation29 = new com.conferenceroomscheduler.model.Reservation();
        reservation29.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod32 = reservation29.getPaymentMethod();
        reservation29.setFinalAmount((double) (byte) 1);
        java.lang.String str35 = reservation29.getRoomId();
        reservation29.setCheckedIn(true);
        reservation29.setDepositAmount((double) 10.0f);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod40 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        reservation29.setPaymentMethod(paymentMethod40);
        reservation18.setPaymentMethod(paymentMethod40);
        reservation2.setPaymentMethod(paymentMethod40);
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(paymentMethod21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(localDateTime28);
        org.junit.Assert.assertNull(paymentMethod32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + paymentMethod40 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod40.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        reservation0.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext12 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod23 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation24 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime17, localDateTime18, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod23);
        reservation0.setPaymentMethod(paymentMethod23);
        java.time.LocalDateTime localDateTime26 = reservation0.getStartTime();
        java.time.LocalDateTime localDateTime27 = reservation0.getStartTime();
        boolean boolean28 = reservation0.isDepositLost();
        double double29 = reservation0.getDepositAmount();
        java.lang.String str30 = reservation0.getTitle();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod23 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod23.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState6 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str7 = cancelledBookingState6.getName();
        bookingContext5.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState6);
        com.conferenceroomscheduler.model.Reservation reservation9 = bookingContext5.getReservation();
        reservation9.setReservationId("");
        double double12 = reservation9.getHourlyRate();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod13 = null;
        reservation9.setPaymentMethod(paymentMethod13);
        reservation9.setCanceled(false);
        java.lang.String str17 = reservation9.getAccountType();
        java.lang.String str18 = reservation9.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cancelled" + "'", str7, "Cancelled");
        org.junit.Assert.assertNotNull(reservation9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean4 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor3.subject = checkInPublisher5;
        occupancySensor3.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher9 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher14 = null;
        occupancySensor13.setSubject(checkInPublisher14);
        occupancySensor13.occupied = true;
        occupancySensor13.setDetected(false);
        checkInPublisher9.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor13);
        occupancySensor3.setSubject(checkInPublisher9);
        com.conferenceroomscheduler.model.StudentAccount studentAccount28 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        checkInPublisher9.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount28);
        com.conferenceroomscheduler.model.Room room36 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str37 = room36.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor38 = null;
        room36.setOccupancySensor(occupancySensor38);
        room36.setBuilding("");
        java.lang.String str42 = room36.getRoomNumber();
        boolean boolean43 = room36.isEnabled();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor47 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher48 = null;
        occupancySensor47.setSubject(checkInPublisher48);
        occupancySensor47.setDetected(true);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher52 = null;
        occupancySensor47.setSubject(checkInPublisher52);
        room36.setOccupancySensor(occupancySensor47);
        checkInPublisher9.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor47);
        boolean boolean56 = occupancySensor47.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState0 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str1 = confirmedBookingState0.getName();
        java.lang.String str2 = confirmedBookingState0.getName();
        java.lang.String str3 = confirmedBookingState0.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState4 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState5 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation6 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext7 = new com.conferenceroomscheduler.patterns.BookingContext(reservation6);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState8 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext7.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState8);
        com.conferenceroomscheduler.patterns.BookingState bookingState10 = bookingContext7.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState11 = bookingContext7.getState();
        cancelledBookingState5.handle(bookingContext7);
        checkedInBookingState4.handle(bookingContext7);
        java.lang.String str14 = checkedInBookingState4.getName();
        com.conferenceroomscheduler.model.Reservation reservation15 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext16 = new com.conferenceroomscheduler.patterns.BookingContext(reservation15);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState17 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext16.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState17);
        com.conferenceroomscheduler.model.Reservation reservation19 = bookingContext16.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation20 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext21 = new com.conferenceroomscheduler.patterns.BookingContext(reservation20);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState22 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext21.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState22);
        com.conferenceroomscheduler.patterns.BookingState bookingState24 = bookingContext21.getState();
        bookingContext16.setState(bookingState24);
        checkedInBookingState4.handle(bookingContext16);
        com.conferenceroomscheduler.model.Reservation reservation27 = bookingContext16.getReservation();
        confirmedBookingState0.handle(bookingContext16);
        java.lang.String str29 = confirmedBookingState0.getName();
        java.lang.String str30 = confirmedBookingState0.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState31 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState32 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation33 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext34 = new com.conferenceroomscheduler.patterns.BookingContext(reservation33);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState35 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext34.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState35);
        com.conferenceroomscheduler.patterns.BookingState bookingState37 = bookingContext34.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState38 = bookingContext34.getState();
        cancelledBookingState32.handle(bookingContext34);
        checkedInBookingState31.handle(bookingContext34);
        java.lang.String str41 = checkedInBookingState31.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState42 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState43 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation44 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext45 = new com.conferenceroomscheduler.patterns.BookingContext(reservation44);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState46 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext45.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState46);
        com.conferenceroomscheduler.patterns.BookingState bookingState48 = bookingContext45.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState49 = bookingContext45.getState();
        cancelledBookingState43.handle(bookingContext45);
        checkedInBookingState42.handle(bookingContext45);
        com.conferenceroomscheduler.model.Reservation reservation52 = new com.conferenceroomscheduler.model.Reservation();
        reservation52.setFinalAmount((double) (byte) 100);
        reservation52.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext57 = new com.conferenceroomscheduler.patterns.BookingContext(reservation52);
        checkedInBookingState42.handle(bookingContext57);
        com.conferenceroomscheduler.model.Reservation reservation59 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext60 = new com.conferenceroomscheduler.patterns.BookingContext(reservation59);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState61 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext60.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState61);
        checkedInBookingState42.handle(bookingContext60);
        checkedInBookingState31.handle(bookingContext60);
        java.lang.String str65 = checkedInBookingState31.getName();
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState66 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str67 = pendingBookingState66.getName();
        com.conferenceroomscheduler.model.Reservation reservation68 = new com.conferenceroomscheduler.model.Reservation();
        reservation68.setFinalAmount((double) (byte) 100);
        reservation68.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext73 = new com.conferenceroomscheduler.patterns.BookingContext(reservation68);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState74 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str75 = cancelledBookingState74.getName();
        bookingContext73.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState74);
        pendingBookingState66.handle(bookingContext73);
        java.lang.String str78 = pendingBookingState66.getName();
        java.lang.String str79 = pendingBookingState66.getName();
        com.conferenceroomscheduler.model.Reservation reservation80 = new com.conferenceroomscheduler.model.Reservation();
        reservation80.setFinalAmount((double) (byte) 100);
        java.lang.String str83 = reservation80.getRoomId();
        reservation80.setFinalAmount((double) 10.0f);
        java.lang.String str86 = reservation80.getUserId();
        reservation80.setFinalAmount((double) ' ');
        java.lang.String str89 = reservation80.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext90 = new com.conferenceroomscheduler.patterns.BookingContext(reservation80);
        bookingContext90.request();
        pendingBookingState66.handle(bookingContext90);
        checkedInBookingState31.handle(bookingContext90);
        confirmedBookingState0.handle(bookingContext90);
        java.lang.String str95 = confirmedBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking confirmed." + "'", str1, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking confirmed." + "'", str2, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking confirmed." + "'", str3, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState10);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Checked in." + "'", str14, "Checked in.");
        org.junit.Assert.assertNull(reservation19);
        org.junit.Assert.assertNotNull(bookingState24);
        org.junit.Assert.assertNull(reservation27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Booking confirmed." + "'", str29, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Booking confirmed." + "'", str30, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState37);
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Checked in." + "'", str41, "Checked in.");
        org.junit.Assert.assertNotNull(bookingState48);
        org.junit.Assert.assertNotNull(bookingState49);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Checked in." + "'", str65, "Checked in.");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Pending" + "'", str67, "Pending");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Cancelled" + "'", str75, "Cancelled");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Pending" + "'", str78, "Pending");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Pending" + "'", str79, "Pending");
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "Booking confirmed." + "'", str95, "Booking confirmed.");
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "Checked in.", false);
        java.lang.String str4 = badgeScan3.getBadgeId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount0 = new com.conferenceroomscheduler.model.PartnerAccount();
        partnerAccount0.setVerified(false);
        boolean boolean3 = partnerAccount0.isVerified();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Cancelled", "", "", "admin", (int) (byte) 100, localDateTime5, localDateTime6);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) '4');
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("Cancelled", 1.0d);
        boolean boolean9 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) (-1.0f));
        boolean boolean12 = debitCardPaymentStrategy0.processPayment("faculty", (double) (-1L));
        boolean boolean15 = debitCardPaymentStrategy0.processPayment("Booking confirmed.", (double) 'a');
        boolean boolean18 = debitCardPaymentStrategy0.processPayment("faculty", (double) 100.0f);
        boolean boolean21 = debitCardPaymentStrategy0.processPayment("hi!", (double) 1.0f);
        boolean boolean24 = debitCardPaymentStrategy0.processPayment("ADMIN-69", (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Unverified badge detected for admin.", "", "Verified badge detected for ADMIN-69.", true, false, "ADMIN-69");
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        reservation1.setDepositAmount((double) (byte) 0);
        boolean boolean10 = reservation1.isExtended();
        reservation1.setRoomId("Checked in.");
        reservation1.setReservationId("Booking complete");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand15 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext16 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        reservation1.setDepositLost(false);
        boolean boolean19 = reservation1.isCanceled();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState0 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState1 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation2 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext3 = new com.conferenceroomscheduler.patterns.BookingContext(reservation2);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState4 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext3.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState4);
        com.conferenceroomscheduler.patterns.BookingState bookingState6 = bookingContext3.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState7 = bookingContext3.getState();
        cancelledBookingState1.handle(bookingContext3);
        checkedInBookingState0.handle(bookingContext3);
        java.lang.String str10 = checkedInBookingState0.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState11 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState12 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation13 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext14 = new com.conferenceroomscheduler.patterns.BookingContext(reservation13);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState15 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext14.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState15);
        com.conferenceroomscheduler.patterns.BookingState bookingState17 = bookingContext14.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState18 = bookingContext14.getState();
        cancelledBookingState12.handle(bookingContext14);
        checkedInBookingState11.handle(bookingContext14);
        com.conferenceroomscheduler.model.Reservation reservation21 = new com.conferenceroomscheduler.model.Reservation();
        reservation21.setFinalAmount((double) (byte) 100);
        reservation21.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext26 = new com.conferenceroomscheduler.patterns.BookingContext(reservation21);
        checkedInBookingState11.handle(bookingContext26);
        com.conferenceroomscheduler.model.Reservation reservation28 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext29 = new com.conferenceroomscheduler.patterns.BookingContext(reservation28);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState30 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext29.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState30);
        checkedInBookingState11.handle(bookingContext29);
        checkedInBookingState0.handle(bookingContext29);
        java.lang.String str34 = checkedInBookingState0.getName();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState35 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation36 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext37 = new com.conferenceroomscheduler.patterns.BookingContext(reservation36);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState38 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext37.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState38);
        com.conferenceroomscheduler.patterns.BookingState bookingState40 = bookingContext37.getState();
        com.conferenceroomscheduler.model.Reservation reservation41 = bookingContext37.getReservation();
        cancelledBookingState35.handle(bookingContext37);
        java.lang.String str43 = cancelledBookingState35.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState44 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState45 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation46 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext47 = new com.conferenceroomscheduler.patterns.BookingContext(reservation46);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState48 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext47.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState48);
        com.conferenceroomscheduler.patterns.BookingState bookingState50 = bookingContext47.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState51 = bookingContext47.getState();
        cancelledBookingState45.handle(bookingContext47);
        checkedInBookingState44.handle(bookingContext47);
        com.conferenceroomscheduler.model.Reservation reservation54 = new com.conferenceroomscheduler.model.Reservation();
        reservation54.setFinalAmount((double) (byte) 100);
        reservation54.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext59 = new com.conferenceroomscheduler.patterns.BookingContext(reservation54);
        checkedInBookingState44.handle(bookingContext59);
        com.conferenceroomscheduler.model.Reservation reservation61 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext62 = new com.conferenceroomscheduler.patterns.BookingContext(reservation61);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState63 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext62.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState63);
        checkedInBookingState44.handle(bookingContext62);
        com.conferenceroomscheduler.model.Reservation reservation66 = new com.conferenceroomscheduler.model.Reservation();
        reservation66.setFinalAmount((double) (byte) 100);
        java.lang.String str69 = reservation66.getRoomId();
        reservation66.setFinalAmount((double) 10.0f);
        java.lang.String str72 = reservation66.getUserId();
        reservation66.setFinalAmount((double) ' ');
        java.lang.String str75 = reservation66.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext76 = new com.conferenceroomscheduler.patterns.BookingContext(reservation66);
        bookingContext76.request();
        java.lang.String str78 = bookingContext76.getStatus();
        checkedInBookingState44.handle(bookingContext76);
        cancelledBookingState35.handle(bookingContext76);
        bookingContext76.request();
        com.conferenceroomscheduler.patterns.BookingState bookingState82 = bookingContext76.getState();
        checkedInBookingState0.handle(bookingContext76);
        java.lang.String str84 = checkedInBookingState0.getName();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Checked in." + "'", str10, "Checked in.");
        org.junit.Assert.assertNotNull(bookingState17);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Checked in." + "'", str34, "Checked in.");
        org.junit.Assert.assertNotNull(bookingState40);
        org.junit.Assert.assertNull(reservation41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Cancelled" + "'", str43, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState50);
        org.junit.Assert.assertNotNull(bookingState51);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Pending" + "'", str78, "Pending");
        org.junit.Assert.assertNotNull(bookingState82);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Checked in." + "'", str84, "Checked in.");
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        java.lang.String str3 = reservation0.getUserId();
        boolean boolean4 = reservation0.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation0.getPaymentMethod();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext8 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        reservation0.setRoomId("admin");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        com.conferenceroomscheduler.model.Reservation reservation21 = new com.conferenceroomscheduler.model.Reservation();
        reservation21.setFinalAmount((double) (byte) 100);
        java.lang.String str24 = reservation21.getRoomId();
        reservation21.setFinalAmount((double) 10.0f);
        java.lang.String str27 = reservation21.getUserId();
        reservation21.setDepositAmount((double) (byte) 0);
        double double30 = reservation21.getHourlyRate();
        reservation21.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext33 = new com.conferenceroomscheduler.patterns.BookingContext(reservation21);
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod44 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation45 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime38, localDateTime39, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod44);
        reservation21.setPaymentMethod(paymentMethod44);
        com.conferenceroomscheduler.model.Reservation reservation47 = new com.conferenceroomscheduler.model.Reservation("Booking complete", "Booking complete", "", "Booking complete", localDateTime15, localDateTime16, "Cancelled", (double) 0L, (double) (-1), (double) 0, paymentMethod44);
        reservation0.setPaymentMethod(paymentMethod44);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod44 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod44.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        java.lang.String str4 = reservation1.getAccountType();
        java.time.LocalDateTime localDateTime5 = reservation1.getEndTime();
        reservation1.setDepositAmount((double) 0);
        double double8 = reservation1.getHourlyRate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        double double8 = reservation1.getFinalAmount();
        reservation1.setCanceled(false);
        java.lang.String str11 = reservation1.getUserId();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand14 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime12, localDateTime13);
        // The following exception was thrown during execution in test generation
        try {
            editBookingCommand14.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.editBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        boolean boolean9 = reservation0.isCheckedIn();
        boolean boolean10 = reservation0.isDepositLost();
        reservation0.setAccountType("Cancelled");
        reservation0.setAccountType("Cancelled");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        reservation0.setExtended(true);
        java.lang.String str12 = reservation0.getTitle();
        java.lang.String str13 = reservation0.getReservationId();
        reservation0.setDepositLost(true);
        java.lang.String str16 = reservation0.getTitle();
        java.time.LocalDateTime localDateTime17 = reservation0.getStartTime();
        reservation0.setReservationId("Unverified badge detected for .");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Checked in.", true, true);
        com.conferenceroomscheduler.model.AdminAccount adminAccount10 = new com.conferenceroomscheduler.model.AdminAccount("", "", "admin", false, true, "Cancelled");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount10);
        boolean boolean12 = occupancySensor3.isDetected();
        boolean boolean13 = occupancySensor3.isDetected();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Unverified badge detected for admin.", "partner", (int) (byte) 0, true, "ADMIN-69", "hi!");
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        boolean boolean9 = occupancySensor4.isDetected;
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory10 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account18 = facultyFactory10.createAccount("", "Cancelled", "", "hi!", false, false, "");
        account18.setAccountNumber("hi!");
        account18.setUniversityAccount(true);
        account18.setAccountNumber("");
        boolean boolean25 = occupancySensor4.detectOccupancy(account18);
        occupancySensor4.setOccupied(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(account18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("hi!", "", "hi!", true, false, "hi!");
        adminAccount6.setEmail("");
        java.lang.String str9 = adminAccount6.getAccountId();
        java.lang.String str10 = adminAccount6.getAccountId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("Verified badge detected for ADMIN-69.", "Cancelled", "Checked in.", true, false, "Unverified badge detected for admin.");
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) '4');
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("", (double) (-1));
        boolean boolean9 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) 10L);
        boolean boolean12 = debitCardPaymentStrategy0.processPayment("Unverified badge detected for Cancelled.", (double) (byte) 0);
        boolean boolean15 = debitCardPaymentStrategy0.processPayment("ADMIN-69", (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("Cancelled", "Booking complete", "Pending", true, false, "hi!");
        staffAccount6.setIdentifier("Booking complete");
        staffAccount6.setUniversityAccount(true);
        java.lang.String str11 = staffAccount6.getPassword();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pending" + "'", str11, "Pending");
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setHourlyRate((double) (byte) 100);
        boolean boolean5 = reservation2.isDepositLost();
        java.lang.String str6 = reservation2.getUserId();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand9 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService1, reservation2, localDateTime7, localDateTime8);
        reservation2.setCheckedIn(true);
        reservation2.setCanceled(true);
        reservation2.setAccountType("Booking complete");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand16 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation2);
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand16.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Checked in.", false, true);
        java.lang.String str4 = occupancySensor3.roomId;
        com.conferenceroomscheduler.model.Room room11 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str12 = room11.getRoomId();
        room11.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount21 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room11.checkIn((com.conferenceroomscheduler.model.Account) studentAccount21);
        boolean boolean23 = room11.isEnabled();
        room11.setBuilding("Booking complete");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor26 = room11.getOccupancySensor();
        room11.setName("");
        com.conferenceroomscheduler.model.AdminAccount adminAccount29 = new com.conferenceroomscheduler.model.AdminAccount();
        boolean boolean30 = adminAccount29.isVerified();
        adminAccount29.setUniversityAccount(false);
        com.conferenceroomscheduler.model.Badge badge33 = adminAccount29.getBadge();
        java.lang.String str34 = adminAccount29.getAccountNumber();
        room11.checkIn((com.conferenceroomscheduler.model.Account) adminAccount29);
        com.conferenceroomscheduler.model.AdminAccount adminAccount36 = new com.conferenceroomscheduler.model.AdminAccount();
        boolean boolean37 = adminAccount36.isVerified();
        adminAccount36.setUniversityAccount(false);
        java.lang.String str40 = adminAccount36.getAccountType();
        java.lang.String str41 = adminAccount36.getAccountNumber();
        room11.checkIn((com.conferenceroomscheduler.model.Account) adminAccount36);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor43 = room11.getOccupancySensor();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher44 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor48 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher49 = null;
        occupancySensor48.setSubject(checkInPublisher49);
        occupancySensor48.occupied = true;
        occupancySensor48.setDetected(false);
        checkInPublisher44.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor48);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor59 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor59.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount68 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount68.setEmail("");
        boolean boolean71 = occupancySensor59.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount68);
        checkInPublisher44.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor59);
        com.conferenceroomscheduler.patterns.StudentFactory studentFactory73 = new com.conferenceroomscheduler.patterns.StudentFactory();
        com.conferenceroomscheduler.model.Account account81 = studentFactory73.createAccount("", "hi!", "", "", true, true, "hi!");
        checkInPublisher44.notifyObservers(account81);
        occupancySensor43.setSubject(checkInPublisher44);
        occupancySensor3.subject = checkInPublisher44;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Checked in." + "'", str4, "Checked in.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(occupancySensor26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(badge33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(occupancySensor43);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(account81);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService2 = null;
        com.conferenceroomscheduler.model.Reservation reservation3 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand4 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService2, reservation3);
        java.lang.String str5 = reservation3.getAccountType();
        java.lang.String str6 = reservation3.getAccountType();
        boolean boolean7 = reservation3.isCheckedIn();
        java.time.LocalDateTime localDateTime8 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand9 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService1, reservation3, localDateTime8);
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand10 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation3);
        // The following exception was thrown during execution in test generation
        try {
            createBookingCommand10.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.addReservation(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Pending", "Pending", (int) (short) -1, "", "Cancelled");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("admin", "student", 97, "Pending", "student");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("faculty", "student", 1, "", "faculty");
        com.conferenceroomscheduler.model.Room room30 = roomFactory0.createRoom("ADMIN-69", "partner", 52, "Unverified badge detected for admin.", "hi!");
        com.conferenceroomscheduler.model.Room room36 = roomFactory0.createRoom("faculty", "Unverified badge detected for admin.", (int) (short) 1, "hi!", "Unverified badge detected for .");
        com.conferenceroomscheduler.model.Room room42 = roomFactory0.createRoom("Booking complete", "Verified badge detected for ADMIN-69.", (int) (byte) 100, "Unverified badge detected for .", "Pending");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
        org.junit.Assert.assertNotNull(room30);
        org.junit.Assert.assertNotNull(room36);
        org.junit.Assert.assertNotNull(room42);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand6 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime5);
        boolean boolean7 = extendBookingCommand6.wasSuccessful();
        boolean boolean8 = extendBookingCommand6.wasSuccessful();
        boolean boolean9 = extendBookingCommand6.wasSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand6.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.extendBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        java.lang.String str8 = room6.getBuilding();
        com.conferenceroomscheduler.model.StudentAccount studentAccount15 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        studentAccount15.setUniversityAccount(false);
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount15);
        int int19 = room6.getCapacity();
        room6.setRoomId("");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher22 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor26 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean27 = occupancySensor26.isDetected();
        occupancySensor26.occupied = false;
        checkInPublisher22.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor26);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher31 = occupancySensor26.subject;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor35 = new com.conferenceroomscheduler.model.OccupancySensor("Cancelled", false, false);
        checkInPublisher31.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor35);
        boolean boolean37 = occupancySensor35.isDetected;
        room6.setOccupancySensor(occupancySensor35);
        com.conferenceroomscheduler.model.AdminAccount adminAccount45 = new com.conferenceroomscheduler.model.AdminAccount("partner", "Cancelled", "", false, true, "Booking complete");
        room6.checkIn((com.conferenceroomscheduler.model.Account) adminAccount45);
        room6.setBuilding("student");
        room6.setCapacity((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(checkInPublisher31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Verified badge detected for Checked in..", "", "Verified badge detected for ADMIN-69.", true, true, "admin");
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState0 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext2 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState3 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext2.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState3);
        completedBookingState0.handle(bookingContext2);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState6 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation7 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext8 = new com.conferenceroomscheduler.patterns.BookingContext(reservation7);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState9 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext8.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState9);
        com.conferenceroomscheduler.patterns.BookingState bookingState11 = bookingContext8.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState12 = bookingContext8.getState();
        cancelledBookingState6.handle(bookingContext8);
        completedBookingState0.handle(bookingContext8);
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState15 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation16 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext17 = new com.conferenceroomscheduler.patterns.BookingContext(reservation16);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState18 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext17.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState18);
        completedBookingState15.handle(bookingContext17);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState21 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation22 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext23 = new com.conferenceroomscheduler.patterns.BookingContext(reservation22);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState24 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext23.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState24);
        com.conferenceroomscheduler.patterns.BookingState bookingState26 = bookingContext23.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState27 = bookingContext23.getState();
        cancelledBookingState21.handle(bookingContext23);
        completedBookingState15.handle(bookingContext23);
        com.conferenceroomscheduler.model.Reservation reservation30 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext31 = new com.conferenceroomscheduler.patterns.BookingContext(reservation30);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState32 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext31.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState32);
        com.conferenceroomscheduler.patterns.BookingState bookingState34 = bookingContext31.getState();
        com.conferenceroomscheduler.model.Reservation reservation35 = bookingContext31.getReservation();
        completedBookingState15.handle(bookingContext31);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState37 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation38 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext39 = new com.conferenceroomscheduler.patterns.BookingContext(reservation38);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState40 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext39.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState40);
        com.conferenceroomscheduler.patterns.BookingState bookingState42 = bookingContext39.getState();
        com.conferenceroomscheduler.model.Reservation reservation43 = bookingContext39.getReservation();
        cancelledBookingState37.handle(bookingContext39);
        java.lang.String str45 = bookingContext39.getStatus();
        completedBookingState15.handle(bookingContext39);
        bookingContext8.setState((com.conferenceroomscheduler.patterns.BookingState) completedBookingState15);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNotNull(bookingState12);
        org.junit.Assert.assertNotNull(bookingState26);
        org.junit.Assert.assertNotNull(bookingState27);
        org.junit.Assert.assertNotNull(bookingState34);
        org.junit.Assert.assertNull(reservation35);
        org.junit.Assert.assertNotNull(bookingState42);
        org.junit.Assert.assertNull(reservation43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Cancelled" + "'", str45, "Cancelled");
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand8 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setHourlyRate((double) 0L);
        boolean boolean11 = reservation1.isCheckedIn();
        boolean boolean12 = reservation1.isDepositLost();
        reservation1.setRoomId("Booking complete");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod15 = reservation1.getPaymentMethod();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(paymentMethod15);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("hi!", (double) (byte) 0);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("partner", (double) '4');
        boolean boolean9 = creditCardPaymentStrategy0.processPayment("Verified badge detected for ADMIN-69.", (double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand8 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setAccountType("Pending");
        java.time.LocalDateTime localDateTime11 = null;
        reservation1.setStartTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = reservation1.getEndTime();
        double double14 = reservation1.getHourlyRate();
        reservation1.setReservationId("staff");
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        reservation0.setHourlyRate((double) 100.0f);
        reservation0.setRoomId("partner");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        java.time.LocalDateTime localDateTime1 = null;
        reservation0.setEndTime(localDateTime1);
        reservation0.setHourlyRate((double) 'a');
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        java.time.LocalDateTime localDateTime6 = reservation0.getEndTime();
        boolean boolean7 = reservation0.isCheckedIn();
        double double8 = reservation0.getHourlyRate();
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setHourlyRate((double) (byte) 100);
        boolean boolean4 = reservation1.isDepositLost();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand5 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand5.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        reservation1.setDepositAmount((double) (byte) 0);
        double double10 = reservation1.getHourlyRate();
        reservation1.setDepositLost(true);
        java.lang.String str13 = reservation1.getReservationId();
        reservation1.setRoomId("Unverified badge detected for Cancelled.");
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand18 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime16, localDateTime17);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext19 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        java.lang.String str20 = bookingContext19.getStatus();
        java.lang.String str21 = bookingContext19.getStatus();
        com.conferenceroomscheduler.patterns.BookingState bookingState22 = bookingContext19.getState();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Pending" + "'", str20, "Pending");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Pending" + "'", str21, "Pending");
        org.junit.Assert.assertNotNull(bookingState22);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Unverified badge detected for Cancelled.", "", "", true, false, "partner");
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        room6.setClosedForMaintenance(false);
        room6.setEnabled(true);
        java.lang.String str17 = room6.getRoomNumber();
        java.lang.String str18 = room6.getName();
        room6.setRoomNumber("staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Cancelled" + "'", str18, "Cancelled");
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        boolean boolean6 = badgeScan3.isVerified();
        badgeScan3.setBadgeId("admin");
        badgeScan3.setBadgeId("Unverified badge detected for .");
        java.lang.String str11 = badgeScan3.getBadgeId();
        java.lang.String str12 = badgeScan3.getBadgeId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Unverified badge detected for ." + "'", str11, "Unverified badge detected for .");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Unverified badge detected for ." + "'", str12, "Unverified badge detected for .");
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Pending", "Cancelled", (int) (byte) 10, "Checked in.", "Cancelled");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("", "student", (int) '4', "student", "Cancelled");
        room18.setName("");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "", "Booking complete", "Checked in.", (int) (byte) 1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getTitle();
        int int9 = bookingRequest7.getAttendeeCount();
        java.lang.String str10 = bookingRequest7.getRequestId();
        int int11 = bookingRequest7.getAttendeeCount();
        java.lang.String str12 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Checked in." + "'", str8, "Checked in.");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking complete" + "'", str12, "Booking complete");
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        reservation1.setDepositAmount((double) (byte) 0);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand10 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str11 = reservation1.getTitle();
        double double12 = reservation1.getFinalAmount();
        java.lang.String str13 = reservation1.getUserId();
        java.lang.String str14 = reservation1.getUserId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Cancelled", "hi!", "hi!", "", (int) (short) 1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRoomId();
        java.lang.String str9 = bookingRequest7.getRequestId();
        java.lang.String str10 = bookingRequest7.getRoomId();
        java.lang.String str11 = bookingRequest7.getRoomId();
        java.lang.String str12 = bookingRequest7.getRequestId();
        java.lang.String str13 = bookingRequest7.getRoomId();
        int int14 = bookingRequest7.getAttendeeCount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cancelled" + "'", str12, "Cancelled");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Unverified badge detected for .", "faculty", "admin", 35, localDateTime5, localDateTime6);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        room6.setClosedForMaintenance(false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor17 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher18 = null;
        occupancySensor17.setSubject(checkInPublisher18);
        java.lang.String str20 = occupancySensor17.getRoomId();
        room6.setOccupancySensor(occupancySensor17);
        java.lang.String str22 = room6.getRoomId();
        room6.setEnabled(false);
        room6.setClosedForMaintenance(false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor27 = room6.getOccupancySensor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(occupancySensor27);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState0 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str1 = confirmedBookingState0.getName();
        java.lang.String str2 = confirmedBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation3 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext4 = new com.conferenceroomscheduler.patterns.BookingContext(reservation3);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState5 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext4.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState5);
        com.conferenceroomscheduler.model.Reservation reservation7 = bookingContext4.getReservation();
        confirmedBookingState0.handle(bookingContext4);
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState9 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        java.lang.String str10 = completedBookingState9.getName();
        java.lang.String str11 = completedBookingState9.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState12 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState13 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation14 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext15 = new com.conferenceroomscheduler.patterns.BookingContext(reservation14);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState16 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext15.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState16);
        com.conferenceroomscheduler.patterns.BookingState bookingState18 = bookingContext15.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState19 = bookingContext15.getState();
        cancelledBookingState13.handle(bookingContext15);
        checkedInBookingState12.handle(bookingContext15);
        java.lang.String str22 = checkedInBookingState12.getName();
        com.conferenceroomscheduler.model.Reservation reservation23 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext24 = new com.conferenceroomscheduler.patterns.BookingContext(reservation23);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState25 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext24.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState25);
        com.conferenceroomscheduler.model.Reservation reservation27 = bookingContext24.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation28 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext29 = new com.conferenceroomscheduler.patterns.BookingContext(reservation28);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState30 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext29.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState30);
        com.conferenceroomscheduler.patterns.BookingState bookingState32 = bookingContext29.getState();
        bookingContext24.setState(bookingState32);
        checkedInBookingState12.handle(bookingContext24);
        com.conferenceroomscheduler.model.Reservation reservation35 = bookingContext24.getReservation();
        completedBookingState9.handle(bookingContext24);
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState37 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation38 = new com.conferenceroomscheduler.model.Reservation();
        reservation38.setFinalAmount((double) (byte) 100);
        reservation38.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext43 = new com.conferenceroomscheduler.patterns.BookingContext(reservation38);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState44 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str45 = cancelledBookingState44.getName();
        bookingContext43.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState44);
        completedBookingState37.handle(bookingContext43);
        completedBookingState9.handle(bookingContext43);
        confirmedBookingState0.handle(bookingContext43);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState50 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState51 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation52 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext53 = new com.conferenceroomscheduler.patterns.BookingContext(reservation52);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState54 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext53.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState54);
        com.conferenceroomscheduler.patterns.BookingState bookingState56 = bookingContext53.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState57 = bookingContext53.getState();
        cancelledBookingState51.handle(bookingContext53);
        checkedInBookingState50.handle(bookingContext53);
        com.conferenceroomscheduler.model.Reservation reservation60 = new com.conferenceroomscheduler.model.Reservation();
        reservation60.setFinalAmount((double) (byte) 100);
        reservation60.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext65 = new com.conferenceroomscheduler.patterns.BookingContext(reservation60);
        checkedInBookingState50.handle(bookingContext65);
        com.conferenceroomscheduler.model.Reservation reservation67 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext68 = new com.conferenceroomscheduler.patterns.BookingContext(reservation67);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState69 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext68.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState69);
        checkedInBookingState50.handle(bookingContext68);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState72 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str73 = cancelledBookingState72.getName();
        bookingContext68.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState72);
        com.conferenceroomscheduler.patterns.BookingState bookingState75 = bookingContext68.getState();
        confirmedBookingState0.handle(bookingContext68);
        java.lang.String str77 = confirmedBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking confirmed." + "'", str1, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking confirmed." + "'", str2, "Booking confirmed.");
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking complete" + "'", str10, "Booking complete");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking complete" + "'", str11, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertNotNull(bookingState19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Checked in." + "'", str22, "Checked in.");
        org.junit.Assert.assertNull(reservation27);
        org.junit.Assert.assertNotNull(bookingState32);
        org.junit.Assert.assertNull(reservation35);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Cancelled" + "'", str45, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState56);
        org.junit.Assert.assertNotNull(bookingState57);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Cancelled" + "'", str73, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState75);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Booking confirmed." + "'", str77, "Booking confirmed.");
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        double double8 = reservation1.getFinalAmount();
        reservation1.setReservationId("Pending");
        java.time.LocalDateTime localDateTime11 = null;
        reservation1.setStartTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand15 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime13, localDateTime14);
        boolean boolean16 = reservation1.isCanceled();
        reservation1.setDepositAmount((double) (byte) 100);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState0 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str1 = confirmedBookingState0.getName();
        java.lang.String str2 = confirmedBookingState0.getName();
        java.lang.String str3 = confirmedBookingState0.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState4 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState5 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation6 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext7 = new com.conferenceroomscheduler.patterns.BookingContext(reservation6);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState8 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext7.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState8);
        com.conferenceroomscheduler.patterns.BookingState bookingState10 = bookingContext7.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState11 = bookingContext7.getState();
        cancelledBookingState5.handle(bookingContext7);
        checkedInBookingState4.handle(bookingContext7);
        java.lang.String str14 = checkedInBookingState4.getName();
        com.conferenceroomscheduler.model.Reservation reservation15 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext16 = new com.conferenceroomscheduler.patterns.BookingContext(reservation15);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState17 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext16.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState17);
        com.conferenceroomscheduler.model.Reservation reservation19 = bookingContext16.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation20 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext21 = new com.conferenceroomscheduler.patterns.BookingContext(reservation20);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState22 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext21.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState22);
        com.conferenceroomscheduler.patterns.BookingState bookingState24 = bookingContext21.getState();
        bookingContext16.setState(bookingState24);
        checkedInBookingState4.handle(bookingContext16);
        com.conferenceroomscheduler.model.Reservation reservation27 = bookingContext16.getReservation();
        confirmedBookingState0.handle(bookingContext16);
        java.lang.String str29 = confirmedBookingState0.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState30 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState31 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation32 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext33 = new com.conferenceroomscheduler.patterns.BookingContext(reservation32);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState34 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext33.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState34);
        com.conferenceroomscheduler.patterns.BookingState bookingState36 = bookingContext33.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState37 = bookingContext33.getState();
        cancelledBookingState31.handle(bookingContext33);
        checkedInBookingState30.handle(bookingContext33);
        com.conferenceroomscheduler.model.Reservation reservation40 = new com.conferenceroomscheduler.model.Reservation();
        reservation40.setFinalAmount((double) (byte) 100);
        reservation40.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext45 = new com.conferenceroomscheduler.patterns.BookingContext(reservation40);
        checkedInBookingState30.handle(bookingContext45);
        confirmedBookingState0.handle(bookingContext45);
        com.conferenceroomscheduler.model.Reservation reservation48 = bookingContext45.getReservation();
        java.lang.String str49 = reservation48.getAccountType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking confirmed." + "'", str1, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking confirmed." + "'", str2, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking confirmed." + "'", str3, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState10);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Checked in." + "'", str14, "Checked in.");
        org.junit.Assert.assertNull(reservation19);
        org.junit.Assert.assertNotNull(bookingState24);
        org.junit.Assert.assertNull(reservation27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Booking confirmed." + "'", str29, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState36);
        org.junit.Assert.assertNotNull(bookingState37);
        org.junit.Assert.assertNotNull(reservation48);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Pending", "Cancelled", (int) (byte) 10, "Checked in.", "Cancelled");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("", "student", (int) '4', "student", "Cancelled");
        room18.setBuilding("Cancelled");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor21 = room18.getOccupancySensor();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher22 = occupancySensor21.getSubject();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(occupancySensor21);
        org.junit.Assert.assertNull(checkInPublisher22);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        room6.setClosedForMaintenance(false);
        boolean boolean14 = room6.isEnabled();
        room6.setEnabled(false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor20 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher21 = null;
        occupancySensor20.setSubject(checkInPublisher21);
        boolean boolean23 = occupancySensor20.isDetected;
        occupancySensor20.roomId = "Booking confirmed.";
        room6.setOccupancySensor(occupancySensor20);
        room6.setBuilding("Pending");
        int int29 = room6.getCapacity();
        java.lang.String str30 = room6.getRoomId();
        room6.setRoomNumber("ADMIN-69");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("hi!", "", "hi!", true, false, "hi!");
        adminAccount6.setPassword("hi!");
        boolean boolean9 = adminAccount6.isVerified();
        adminAccount6.setAccountNumber("student");
        com.conferenceroomscheduler.model.Badge badge12 = adminAccount6.getBadge();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(badge12);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        java.lang.String str7 = studentAccount6.getPassword();
        studentAccount6.setAccountNumber("admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cancelled" + "'", str7, "Cancelled");
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("faculty", "", true);
        badge3.setAccountId("Booking confirmed.");
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Pending", (int) (byte) 10, true, "Unverified badge detected for .", "staff");
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Cancelled", false, false);
        boolean boolean4 = occupancySensor3.occupied;
        com.conferenceroomscheduler.model.StudentAccount studentAccount11 = new com.conferenceroomscheduler.model.StudentAccount("", "Booking confirmed.", "hi!", false, true, "Checked in.");
        boolean boolean12 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount11);
        java.lang.String str13 = studentAccount11.getEmail();
        studentAccount11.setIdentifier("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking confirmed." + "'", str13, "Booking confirmed.");
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = null;
        occupancySensor3.setSubject(checkInPublisher12);
        occupancySensor3.isDetected = false;
        boolean boolean16 = occupancySensor3.isOccupied();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor20 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor24 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean25 = occupancySensor24.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher26 = null;
        occupancySensor24.subject = checkInPublisher26;
        occupancySensor24.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher30 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor34 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher35 = null;
        occupancySensor34.setSubject(checkInPublisher35);
        occupancySensor34.occupied = true;
        occupancySensor34.setDetected(false);
        checkInPublisher30.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor34);
        occupancySensor24.setSubject(checkInPublisher30);
        occupancySensor20.setSubject(checkInPublisher30);
        occupancySensor3.subject = checkInPublisher30;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor48 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean49 = occupancySensor48.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher50 = null;
        occupancySensor48.subject = checkInPublisher50;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher52 = occupancySensor48.getSubject();
        checkInPublisher30.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor48);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor57 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, true);
        checkInPublisher30.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor57);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor62 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean63 = occupancySensor62.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher64 = null;
        occupancySensor62.subject = checkInPublisher64;
        occupancySensor62.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher68 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor72 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher73 = null;
        occupancySensor72.setSubject(checkInPublisher73);
        occupancySensor72.occupied = true;
        occupancySensor72.setDetected(false);
        checkInPublisher68.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor72);
        occupancySensor62.setSubject(checkInPublisher68);
        boolean boolean81 = occupancySensor62.occupied;
        com.conferenceroomscheduler.model.AdminAccount adminAccount82 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str83 = adminAccount82.getEmail();
        boolean boolean84 = occupancySensor62.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount82);
        boolean boolean85 = occupancySensor62.occupied;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher86 = occupancySensor62.subject;
        occupancySensor57.subject = checkInPublisher86;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher88 = occupancySensor57.subject;
        occupancySensor57.occupied = true;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(checkInPublisher52);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(checkInPublisher86);
        org.junit.Assert.assertNotNull(checkInPublisher88);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("partner", "Booking complete", (int) (byte) 10, false, "", "");
        room6.setBuilding("Pending");
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod12 = null;
        com.conferenceroomscheduler.model.Reservation reservation13 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime6, localDateTime7, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod12);
        reservation13.setDepositLost(true);
        java.time.LocalDateTime localDateTime16 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand17 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService1, reservation13, localDateTime16);
        reservation13.setHourlyRate((double) (-1.0f));
        reservation13.setRoomId("admin");
        java.lang.String str22 = reservation13.getTitle();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand23 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation13);
        java.time.LocalDateTime localDateTime24 = null;
        reservation13.setEndTime(localDateTime24);
        boolean boolean26 = reservation13.isCanceled();
        reservation13.setFinalAmount((double) 1.0f);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = null;
        occupancySensor3.setSubject(checkInPublisher12);
        occupancySensor3.isDetected = false;
        boolean boolean16 = occupancySensor3.isOccupied();
        com.conferenceroomscheduler.model.Badge badge20 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str21 = badge20.getEmail();
        boolean boolean22 = occupancySensor3.scanIdBadge(badge20);
        java.lang.String str23 = badge20.getAccountId();
        badge20.setAccountId("Cancelled");
        java.lang.String str26 = badge20.getEmail();
        java.lang.String str27 = badge20.getAccountId();
        boolean boolean28 = badge20.isVerified();
        boolean boolean29 = badge20.isVerified();
        boolean boolean30 = badge20.isVerified();
        badge20.setEmail("partner");
        badge20.setVerified(true);
        badge20.setEmail("");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking confirmed." + "'", str23, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Cancelled" + "'", str26, "Cancelled");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Cancelled" + "'", str27, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Cancelled", "hi!", "hi!", "", (int) (short) 1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRoomId();
        java.lang.String str9 = bookingRequest7.getRequestId();
        java.lang.String str10 = bookingRequest7.getRoomId();
        java.lang.String str11 = bookingRequest7.getRoomId();
        java.time.LocalDateTime localDateTime12 = bookingRequest7.getEndTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Checked in.", "Cancelled", "ADMIN-69", true, false, "Checked in.");
        java.lang.String str7 = studentAccount6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cancelled" + "'", str7, "Cancelled");
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("faculty", "Cancelled", 100, false, "admin", "ADMIN-69");
        room6.setClosedForMaintenance(false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor12 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher13 = null;
        occupancySensor12.setSubject(checkInPublisher13);
        boolean boolean15 = occupancySensor12.isDetected;
        boolean boolean16 = occupancySensor12.isDetected;
        occupancySensor12.occupied = false;
        occupancySensor12.isDetected = false;
        occupancySensor12.setRoomId("ADMIN-69");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor26 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount33 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean34 = occupancySensor26.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount33);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher35 = occupancySensor26.getSubject();
        com.conferenceroomscheduler.model.AdminAccount adminAccount42 = new com.conferenceroomscheduler.model.AdminAccount("", "Booking confirmed.", "", false, false, "");
        adminAccount42.setAccountId("");
        boolean boolean45 = occupancySensor26.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount42);
        com.conferenceroomscheduler.model.Badge badge46 = adminAccount42.getBadge();
        boolean boolean47 = occupancySensor12.scanIdBadge(badge46);
        room6.setOccupancySensor(occupancySensor12);
        occupancySensor12.setDetected(false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(checkInPublisher35);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(badge46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("student", true, true);
        com.conferenceroomscheduler.model.AdminAccount adminAccount4 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str5 = adminAccount4.getAccountId();
        adminAccount4.setIdentifier("hi!");
        java.lang.String str8 = adminAccount4.getAccountNumber();
        java.lang.String str9 = adminAccount4.getPassword();
        boolean boolean10 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount4);
        occupancySensor3.roomId = "hi!";
        java.lang.String str13 = occupancySensor3.getLastEvent();
        occupancySensor3.setRoomId("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor15 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount22 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean23 = occupancySensor15.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount22);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher24 = null;
        occupancySensor15.setSubject(checkInPublisher24);
        occupancySensor15.isDetected = false;
        boolean boolean28 = occupancySensor15.isOccupied();
        com.conferenceroomscheduler.model.Badge badge32 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str33 = badge32.getEmail();
        boolean boolean34 = occupancySensor15.scanIdBadge(badge32);
        java.lang.String str35 = badge32.getAccountId();
        badge32.setAccountId("Cancelled");
        java.lang.String str38 = badge32.getEmail();
        java.lang.String str39 = badge32.getAccountId();
        boolean boolean40 = occupancySensor3.scanIdBadge(badge32);
        badge32.setEmail("Verified badge detected for Checked in..");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Cancelled" + "'", str33, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Booking confirmed." + "'", str35, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Cancelled" + "'", str38, "Cancelled");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Cancelled" + "'", str39, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        room6.setCapacity((int) '4');
        room6.setName("Cancelled");
        room6.setRoomNumber("student");
        java.lang.String str17 = room6.getBuilding();
        boolean boolean18 = room6.isClosedForMaintenance();
        room6.setRoomId("admin");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor21 = room6.getOccupancySensor();
        occupancySensor21.setDetected(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(occupancySensor21);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str1 = adminAccount0.getEmail();
        com.conferenceroomscheduler.model.Badge badge2 = adminAccount0.getBadge();
        com.conferenceroomscheduler.model.Badge badge3 = adminAccount0.getBadge();
        java.lang.String str4 = adminAccount0.getAccountId();
        adminAccount0.setUniversityAccount(false);
        java.lang.String str7 = adminAccount0.getPassword();
        java.lang.String str8 = adminAccount0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(badge2);
        org.junit.Assert.assertNull(badge3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        java.time.LocalDateTime localDateTime10 = reservation0.getStartTime();
        java.lang.String str11 = reservation0.getReservationId();
        reservation0.setAccountType("Checked in.");
        java.time.LocalDateTime localDateTime14 = null;
        reservation0.setEndTime(localDateTime14);
        java.lang.String str16 = reservation0.getAccountType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Checked in." + "'", str16, "Checked in.");
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        java.lang.String str8 = room6.getBuilding();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor12 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher13 = null;
        occupancySensor12.setSubject(checkInPublisher13);
        boolean boolean15 = occupancySensor12.isDetected;
        occupancySensor12.roomId = "Booking confirmed.";
        room6.setOccupancySensor(occupancySensor12);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor22 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean23 = occupancySensor22.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher24 = null;
        occupancySensor22.subject = checkInPublisher24;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher26 = occupancySensor22.getSubject();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher27 = occupancySensor22.getSubject();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor31 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher32 = null;
        occupancySensor31.setSubject(checkInPublisher32);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor37 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor41 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean42 = occupancySensor41.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher43 = null;
        occupancySensor41.subject = checkInPublisher43;
        occupancySensor41.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher47 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor51 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher52 = null;
        occupancySensor51.setSubject(checkInPublisher52);
        occupancySensor51.occupied = true;
        occupancySensor51.setDetected(false);
        checkInPublisher47.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor51);
        occupancySensor41.setSubject(checkInPublisher47);
        occupancySensor37.setSubject(checkInPublisher47);
        occupancySensor31.setSubject(checkInPublisher47);
        occupancySensor22.setSubject(checkInPublisher47);
        occupancySensor12.subject = checkInPublisher47;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor67 = new com.conferenceroomscheduler.model.OccupancySensor("student", true, true);
        com.conferenceroomscheduler.model.AdminAccount adminAccount68 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str69 = adminAccount68.getAccountId();
        adminAccount68.setIdentifier("hi!");
        java.lang.String str72 = adminAccount68.getAccountNumber();
        java.lang.String str73 = adminAccount68.getPassword();
        boolean boolean74 = occupancySensor67.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount68);
        com.conferenceroomscheduler.model.AdminAccount adminAccount75 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str76 = adminAccount75.getEmail();
        com.conferenceroomscheduler.model.Badge badge77 = adminAccount75.getBadge();
        com.conferenceroomscheduler.model.Badge badge78 = adminAccount75.getBadge();
        java.lang.String str79 = adminAccount75.getAccountNumber();
        boolean boolean80 = occupancySensor67.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount75);
        occupancySensor67.setDetected(true);
        checkInPublisher47.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor67);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(checkInPublisher26);
        org.junit.Assert.assertNull(checkInPublisher27);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNull(badge77);
        org.junit.Assert.assertNull(badge78);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState0 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext2 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState3 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext2.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState3);
        completedBookingState0.handle(bookingContext2);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState6 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation7 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext8 = new com.conferenceroomscheduler.patterns.BookingContext(reservation7);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState9 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext8.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState9);
        com.conferenceroomscheduler.patterns.BookingState bookingState11 = bookingContext8.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState12 = bookingContext8.getState();
        cancelledBookingState6.handle(bookingContext8);
        completedBookingState0.handle(bookingContext8);
        com.conferenceroomscheduler.model.Reservation reservation15 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext16 = new com.conferenceroomscheduler.patterns.BookingContext(reservation15);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState17 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext16.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState17);
        com.conferenceroomscheduler.patterns.BookingState bookingState19 = bookingContext16.getState();
        com.conferenceroomscheduler.model.Reservation reservation20 = bookingContext16.getReservation();
        completedBookingState0.handle(bookingContext16);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState22 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation23 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext24 = new com.conferenceroomscheduler.patterns.BookingContext(reservation23);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState25 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext24.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState25);
        com.conferenceroomscheduler.patterns.BookingState bookingState27 = bookingContext24.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState28 = bookingContext24.getState();
        cancelledBookingState22.handle(bookingContext24);
        com.conferenceroomscheduler.model.Reservation reservation30 = bookingContext24.getReservation();
        completedBookingState0.handle(bookingContext24);
        java.lang.String str32 = completedBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation33 = new com.conferenceroomscheduler.model.Reservation();
        reservation33.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod36 = reservation33.getPaymentMethod();
        reservation33.setFinalAmount((double) (byte) 1);
        java.lang.String str39 = reservation33.getRoomId();
        reservation33.setCheckedIn(true);
        reservation33.setCheckedIn(false);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod44 = reservation33.getPaymentMethod();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext45 = new com.conferenceroomscheduler.patterns.BookingContext(reservation33);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState46 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState47 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation48 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext49 = new com.conferenceroomscheduler.patterns.BookingContext(reservation48);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState50 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext49.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState50);
        com.conferenceroomscheduler.patterns.BookingState bookingState52 = bookingContext49.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState53 = bookingContext49.getState();
        cancelledBookingState47.handle(bookingContext49);
        checkedInBookingState46.handle(bookingContext49);
        com.conferenceroomscheduler.model.Reservation reservation56 = new com.conferenceroomscheduler.model.Reservation();
        reservation56.setFinalAmount((double) (byte) 100);
        reservation56.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext61 = new com.conferenceroomscheduler.patterns.BookingContext(reservation56);
        checkedInBookingState46.handle(bookingContext61);
        com.conferenceroomscheduler.model.Reservation reservation63 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext64 = new com.conferenceroomscheduler.patterns.BookingContext(reservation63);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState65 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext64.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState65);
        com.conferenceroomscheduler.patterns.BookingState bookingState67 = bookingContext64.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState68 = bookingContext64.getState();
        bookingContext64.request();
        bookingContext64.request();
        com.conferenceroomscheduler.model.Reservation reservation71 = bookingContext64.getReservation();
        checkedInBookingState46.handle(bookingContext64);
        java.lang.String str73 = checkedInBookingState46.getName();
        com.conferenceroomscheduler.model.Reservation reservation74 = new com.conferenceroomscheduler.model.Reservation();
        reservation74.setFinalAmount((double) (byte) 100);
        java.lang.String str77 = reservation74.getRoomId();
        reservation74.setFinalAmount((double) 10.0f);
        java.lang.String str80 = reservation74.getUserId();
        reservation74.setFinalAmount((double) ' ');
        java.lang.String str83 = reservation74.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext84 = new com.conferenceroomscheduler.patterns.BookingContext(reservation74);
        bookingContext84.request();
        checkedInBookingState46.handle(bookingContext84);
        java.lang.String str87 = checkedInBookingState46.getName();
        bookingContext45.setState((com.conferenceroomscheduler.patterns.BookingState) checkedInBookingState46);
        completedBookingState0.handle(bookingContext45);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNotNull(bookingState12);
        org.junit.Assert.assertNotNull(bookingState19);
        org.junit.Assert.assertNull(reservation20);
        org.junit.Assert.assertNotNull(bookingState27);
        org.junit.Assert.assertNotNull(bookingState28);
        org.junit.Assert.assertNull(reservation30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Booking complete" + "'", str32, "Booking complete");
        org.junit.Assert.assertNull(paymentMethod36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(paymentMethod44);
        org.junit.Assert.assertNotNull(bookingState52);
        org.junit.Assert.assertNotNull(bookingState53);
        org.junit.Assert.assertNotNull(bookingState67);
        org.junit.Assert.assertNotNull(bookingState68);
        org.junit.Assert.assertNull(reservation71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Checked in." + "'", str73, "Checked in.");
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Checked in." + "'", str87, "Checked in.");
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = null;
        occupancySensor3.setSubject(checkInPublisher12);
        occupancySensor3.isDetected = false;
        boolean boolean16 = occupancySensor3.isOccupied();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor20 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor24 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean25 = occupancySensor24.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher26 = null;
        occupancySensor24.subject = checkInPublisher26;
        occupancySensor24.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher30 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor34 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher35 = null;
        occupancySensor34.setSubject(checkInPublisher35);
        occupancySensor34.occupied = true;
        occupancySensor34.setDetected(false);
        checkInPublisher30.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor34);
        occupancySensor24.setSubject(checkInPublisher30);
        occupancySensor20.setSubject(checkInPublisher30);
        occupancySensor3.subject = checkInPublisher30;
        com.conferenceroomscheduler.model.AdminAccount adminAccount51 = new com.conferenceroomscheduler.model.AdminAccount("hi!", "", "hi!", true, false, "hi!");
        adminAccount51.setAccountNumber("Cancelled");
        checkInPublisher30.notifyObservers((com.conferenceroomscheduler.model.Account) adminAccount51);
        com.conferenceroomscheduler.model.Badge badge55 = adminAccount51.getBadge();
        adminAccount51.setAccountId("Pending");
        java.lang.String str58 = adminAccount51.getAccountId();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(badge55);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Pending" + "'", str58, "Pending");
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getAccountType();
        java.lang.String str5 = reservation2.getAccountType();
        java.time.LocalDateTime localDateTime6 = null;
        reservation2.setStartTime(localDateTime6);
        java.time.LocalDateTime localDateTime8 = reservation2.getEndTime();
        reservation2.setFinalAmount((double) 0.0f);
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand11 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation2);
        java.time.LocalDateTime localDateTime12 = reservation2.getStartTime();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean4 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor3.subject = checkInPublisher5;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher7 = occupancySensor3.getSubject();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher8 = occupancySensor3.getSubject();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor12 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher13 = null;
        occupancySensor12.setSubject(checkInPublisher13);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor18 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor22 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean23 = occupancySensor22.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher24 = null;
        occupancySensor22.subject = checkInPublisher24;
        occupancySensor22.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher28 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor32 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher33 = null;
        occupancySensor32.setSubject(checkInPublisher33);
        occupancySensor32.occupied = true;
        occupancySensor32.setDetected(false);
        checkInPublisher28.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor32);
        occupancySensor22.setSubject(checkInPublisher28);
        occupancySensor18.setSubject(checkInPublisher28);
        occupancySensor12.setSubject(checkInPublisher28);
        occupancySensor3.setSubject(checkInPublisher28);
        java.lang.String str44 = occupancySensor3.getRoomId();
        java.lang.String str45 = occupancySensor3.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(checkInPublisher7);
        org.junit.Assert.assertNull(checkInPublisher8);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Pending" + "'", str44, "Pending");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Pending" + "'", str45, "Pending");
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState0 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str1 = confirmedBookingState0.getName();
        java.lang.String str2 = confirmedBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation3 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext4 = new com.conferenceroomscheduler.patterns.BookingContext(reservation3);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState5 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext4.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState5);
        com.conferenceroomscheduler.model.Reservation reservation7 = bookingContext4.getReservation();
        confirmedBookingState0.handle(bookingContext4);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState9 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState10 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation11 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext12 = new com.conferenceroomscheduler.patterns.BookingContext(reservation11);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState13 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext12.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState13);
        com.conferenceroomscheduler.patterns.BookingState bookingState15 = bookingContext12.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState16 = bookingContext12.getState();
        cancelledBookingState10.handle(bookingContext12);
        checkedInBookingState9.handle(bookingContext12);
        com.conferenceroomscheduler.model.Reservation reservation19 = new com.conferenceroomscheduler.model.Reservation();
        reservation19.setFinalAmount((double) (byte) 100);
        reservation19.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext24 = new com.conferenceroomscheduler.patterns.BookingContext(reservation19);
        checkedInBookingState9.handle(bookingContext24);
        com.conferenceroomscheduler.model.Reservation reservation26 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext27 = new com.conferenceroomscheduler.patterns.BookingContext(reservation26);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState28 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext27.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState28);
        checkedInBookingState9.handle(bookingContext27);
        confirmedBookingState0.handle(bookingContext27);
        com.conferenceroomscheduler.patterns.BookingState bookingState32 = bookingContext27.getState();
        java.lang.String str33 = bookingContext27.getStatus();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking confirmed." + "'", str1, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking confirmed." + "'", str2, "Booking confirmed.");
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertNotNull(bookingState32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Checked in." + "'", str33, "Checked in.");
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("ADMIN-69", "ADMIN-69", "Booking confirmed.", true, true, "student");
        java.lang.String str7 = staffAccount6.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking confirmed." + "'", str7, "Booking confirmed.");
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        java.lang.String str12 = occupancySensor3.roomId;
        com.conferenceroomscheduler.model.AdminAccount adminAccount13 = new com.conferenceroomscheduler.model.AdminAccount();
        boolean boolean14 = adminAccount13.isVerified();
        adminAccount13.setUniversityAccount(false);
        com.conferenceroomscheduler.model.Badge badge17 = adminAccount13.getBadge();
        boolean boolean18 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount13);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pending" + "'", str12, "Pending");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(badge17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("admin", "Verified badge detected for ADMIN-69.", false);
        java.lang.String str4 = badgeScan3.getBadgeId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Verified badge detected for Checked in..", "Verified badge detected for ADMIN-69.", true);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("Verified badge detected for ADMIN-69.", "Unverified badge detected for admin.", "", false, true, "Verified badge detected for ADMIN-69.");
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        boolean boolean9 = reservation0.isCheckedIn();
        boolean boolean10 = reservation0.isDepositLost();
        java.time.LocalDateTime localDateTime11 = reservation0.getStartTime();
        double double12 = reservation0.getFinalAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        reservation1.setFinalAmount((double) ' ');
        java.lang.String str10 = reservation1.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext11 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        reservation1.setDepositLost(true);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand16 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime14, localDateTime15);
        reservation1.setCanceled(true);
        java.time.LocalDateTime localDateTime19 = reservation1.getStartTime();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext20 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        reservation1.setDepositAmount((double) (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("hi!", "Checked in.", "Checked in.", true, true, "hi!");
        java.lang.String str7 = studentAccount6.getEmail();
        studentAccount6.setEmail("Checked in.");
        studentAccount6.setAccountType("partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Checked in." + "'", str7, "Checked in.");
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor7 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean8 = occupancySensor7.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher9 = null;
        occupancySensor7.subject = checkInPublisher9;
        occupancySensor7.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher13 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor17 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher18 = null;
        occupancySensor17.setSubject(checkInPublisher18);
        occupancySensor17.occupied = true;
        occupancySensor17.setDetected(false);
        checkInPublisher13.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor17);
        occupancySensor7.setSubject(checkInPublisher13);
        boolean boolean26 = occupancySensor7.occupied;
        com.conferenceroomscheduler.model.AdminAccount adminAccount27 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str28 = adminAccount27.getEmail();
        boolean boolean29 = occupancySensor7.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount27);
        boolean boolean30 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount27);
        adminAccount27.setPassword("ADMIN-69");
        adminAccount27.setAccountType("Checked in.");
        java.lang.String str35 = adminAccount27.getAccountId();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("faculty", "Pending", (int) '#', "Cancelled", "Pending");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("admin", "Booking complete", (int) (byte) 1, "hi!", "Checked in.");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("faculty", "admin", (int) (byte) 100, "hi!", "Checked in.");
        com.conferenceroomscheduler.model.Room room30 = roomFactory0.createRoom("Checked in.", "admin", (int) (short) 1, "Cancelled", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room36 = roomFactory0.createRoom("Unverified badge detected for .", "Unverified badge detected for .", 100, "admin", "Pending");
        com.conferenceroomscheduler.model.Room room42 = roomFactory0.createRoom("Cancelled", "", (int) (short) 0, "student", "Checked in.");
        com.conferenceroomscheduler.model.Room room48 = roomFactory0.createRoom("Checked in.", "faculty", (int) (byte) 0, "Booking confirmed.", "admin");
        com.conferenceroomscheduler.model.Room room54 = roomFactory0.createRoom("admin", "Booking complete", 97, "partner", "ADMIN-69");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor58 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor62 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean63 = occupancySensor62.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher64 = null;
        occupancySensor62.subject = checkInPublisher64;
        occupancySensor62.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher68 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor72 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher73 = null;
        occupancySensor72.setSubject(checkInPublisher73);
        occupancySensor72.occupied = true;
        occupancySensor72.setDetected(false);
        checkInPublisher68.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor72);
        occupancySensor62.setSubject(checkInPublisher68);
        occupancySensor58.setSubject(checkInPublisher68);
        com.conferenceroomscheduler.model.Badge badge85 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str86 = badge85.getAccountId();
        boolean boolean87 = occupancySensor58.scanIdBadge(badge85);
        boolean boolean88 = occupancySensor58.isOccupied();
        room54.setOccupancySensor(occupancySensor58);
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
        org.junit.Assert.assertNotNull(room30);
        org.junit.Assert.assertNotNull(room36);
        org.junit.Assert.assertNotNull(room42);
        org.junit.Assert.assertNotNull(room48);
        org.junit.Assert.assertNotNull(room54);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Booking confirmed." + "'", str86, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        room6.setClosedForMaintenance(false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor15 = room6.getOccupancySensor();
        room6.setRoomId("");
        java.lang.Class<?> wildcardClass18 = room6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(occupancySensor15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.isDetected;
        occupancySensor3.setRoomId("");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher9 = occupancySensor3.getSubject();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(checkInPublisher9);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setFinalAmount((double) (byte) 100);
        java.lang.String str5 = reservation2.getRoomId();
        reservation2.setFinalAmount((double) 10.0f);
        java.lang.String str8 = reservation2.getUserId();
        reservation2.setDepositAmount((double) (byte) 0);
        boolean boolean11 = reservation2.isExtended();
        reservation2.setRoomId("Checked in.");
        reservation2.setReservationId("Booking complete");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand16 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand17 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation2);
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand17.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        room6.setClosedForMaintenance(false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor17 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher18 = null;
        occupancySensor17.setSubject(checkInPublisher18);
        java.lang.String str20 = occupancySensor17.getRoomId();
        room6.setOccupancySensor(occupancySensor17);
        java.lang.String str22 = room6.getRoomId();
        room6.setEnabled(false);
        java.lang.String str25 = room6.getName();
        boolean boolean26 = room6.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cancelled" + "'", str25, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Pending", "Pending", (int) (short) -1, "", "Cancelled");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("Verified badge detected for Checked in..", "Unverified badge detected for Cancelled.", 97, "Unverified badge detected for .", "");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Pending", "hi!", "Booking confirmed.", "", 97, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getTitle();
        java.lang.String str9 = bookingRequest7.getRequestId();
        java.lang.String str10 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Pending" + "'", str9, "Pending");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking confirmed." + "'", str10, "Booking confirmed.");
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.time.LocalDateTime localDateTime7 = reservation1.getStartTime();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand8 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.time.LocalDateTime localDateTime9 = null;
        reservation1.setStartTime(localDateTime9);
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        java.lang.String str4 = reservation1.getUserId();
        boolean boolean5 = reservation1.isDepositLost();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand6 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext7 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        bookingContext7.request();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setDepositLost(true);
        boolean boolean5 = reservation0.isCanceled();
        reservation0.setRoomId("");
        reservation0.setUserId("Cancelled");
        boolean boolean10 = reservation0.isCheckedIn();
        reservation0.setCanceled(false);
        java.lang.String str13 = reservation0.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator0 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor1 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor1);
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor3 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor3.update("Checked in.");
        roomSensor3.update("Booking confirmed.");
        roomSensor3.update("Booking complete");
        roomSensor3.update("");
        roomSensor3.update("student");
        roomSensor3.update("Unverified badge detected for Cancelled.");
        roomSensor3.update("hi!");
        chiefEventCoordinator0.removeObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor3);
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor19 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor19.update("Checked in.");
        roomSensor19.update("Checked in.");
        roomSensor19.update("Cancelled");
        roomSensor19.update("Booking confirmed.");
        roomSensor19.update("admin");
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor19);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("Unverified badge detected for .", "Booking confirmed.", "Unverified badge detected for Cancelled.", false, true, "Unverified badge detected for Cancelled.");
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        java.time.LocalDateTime localDateTime2 = null;
        reservation1.setEndTime(localDateTime2);
        reservation1.setHourlyRate((double) 'a');
        com.conferenceroomscheduler.patterns.BookingContext bookingContext6 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        java.time.LocalDateTime localDateTime7 = reservation1.getEndTime();
        boolean boolean8 = reservation1.isCheckedIn();
        double double9 = reservation1.getFinalAmount();
        reservation1.setFinalAmount((double) (short) 10);
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand12 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        // The following exception was thrown during execution in test generation
        try {
            createBookingCommand12.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.addReservation(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        com.conferenceroomscheduler.model.Badge badge18 = studentAccount16.getBadge();
        studentAccount16.setAccountNumber("");
        boolean boolean21 = studentAccount16.isVerified();
        studentAccount16.setAccountNumber("Cancelled");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(badge18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setCheckedIn(true);
        reservation0.setCheckedIn(false);
        reservation0.setReservationId("Booking complete");
        double double13 = reservation0.getFinalAmount();
        java.time.LocalDateTime localDateTime14 = null;
        reservation0.setEndTime(localDateTime14);
        double double16 = reservation0.getDepositAmount();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getTitle();
        double double5 = reservation2.getDepositAmount();
        double double6 = reservation2.getDepositAmount();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand7 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation2);
        boolean boolean8 = cancelBookingCommand7.wasSuccessful();
        boolean boolean9 = cancelBookingCommand7.wasSuccessful();
        boolean boolean10 = cancelBookingCommand7.wasSuccessful();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Booking complete", "Cancelled", (int) (short) 1, "Booking complete", "");
        boolean boolean13 = room12.isEnabled();
        room12.setCapacity((int) 'a');
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = null;
        occupancySensor3.setSubject(checkInPublisher12);
        occupancySensor3.isDetected = false;
        boolean boolean16 = occupancySensor3.isOccupied();
        com.conferenceroomscheduler.model.Badge badge20 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str21 = badge20.getEmail();
        boolean boolean22 = occupancySensor3.scanIdBadge(badge20);
        java.lang.String str23 = badge20.getAccountId();
        badge20.setAccountId("Cancelled");
        java.lang.String str26 = badge20.getEmail();
        java.lang.String str27 = badge20.getAccountId();
        boolean boolean28 = badge20.isVerified();
        boolean boolean29 = badge20.isVerified();
        java.lang.String str30 = badge20.getAccountId();
        badge20.setAccountId("");
        badge20.setAccountId("admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking confirmed." + "'", str23, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Cancelled" + "'", str26, "Cancelled");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Cancelled" + "'", str27, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Cancelled" + "'", str30, "Cancelled");
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        java.lang.String str6 = occupancySensor3.getRoomId();
        occupancySensor3.roomId = "hi!";
        java.lang.String str9 = occupancySensor3.getLastEvent();
        occupancySensor3.isDetected = true;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = occupancySensor3.getSubject();
        occupancySensor3.isDetected = true;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(checkInPublisher12);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService2 = null;
        com.conferenceroomscheduler.model.Reservation reservation3 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand4 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService2, reservation3);
        java.lang.String str5 = reservation3.getReservationId();
        java.lang.String str6 = reservation3.getRoomId();
        reservation3.setCanceled(true);
        reservation3.setCanceled(false);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand13 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService1, reservation3, localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime14 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand15 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation3, localDateTime14);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = null;
        occupancySensor3.setSubject(checkInPublisher12);
        occupancySensor3.isDetected = false;
        boolean boolean16 = occupancySensor3.isOccupied();
        com.conferenceroomscheduler.model.Badge badge20 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str21 = badge20.getEmail();
        boolean boolean22 = occupancySensor3.scanIdBadge(badge20);
        java.lang.String str23 = badge20.getAccountId();
        badge20.setAccountId("Cancelled");
        badge20.setAccountId("");
        badge20.setAccountId("");
        java.lang.String str30 = badge20.getAccountId();
        badge20.setAccountId("");
        badge20.setAccountId("admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking confirmed." + "'", str23, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setHourlyRate((double) (byte) 100);
        boolean boolean3 = reservation0.isDepositLost();
        java.time.LocalDateTime localDateTime4 = null;
        reservation0.setEndTime(localDateTime4);
        java.lang.String str6 = reservation0.getReservationId();
        reservation0.setFinalAmount((double) (-1L));
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod9 = reservation0.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(paymentMethod9);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        occupancySensor4.setOccupied(true);
        occupancySensor4.isDetected = true;
        boolean boolean13 = occupancySensor4.isDetected();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setFinalAmount((double) (byte) 100);
        java.lang.String str5 = reservation2.getRoomId();
        reservation2.setRoomId("hi!");
        reservation2.setCheckedIn(true);
        reservation2.setHourlyRate((double) 'a');
        java.lang.String str12 = reservation2.getAccountType();
        java.lang.String str13 = reservation2.getRoomId();
        reservation2.setDepositAmount(32.0d);
        java.time.LocalDateTime localDateTime16 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand17 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService1, reservation2, localDateTime16);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand20 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation2, localDateTime18, localDateTime19);
        double double21 = reservation2.getHourlyRate();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "Unverified badge detected for .", false);
        java.lang.String str4 = badgeScan3.getRoomId();
        badgeScan3.setRoomId("staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Unverified badge detected for ." + "'", str4, "Unverified badge detected for .");
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState0 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState1 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation2 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext3 = new com.conferenceroomscheduler.patterns.BookingContext(reservation2);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState4 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext3.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState4);
        com.conferenceroomscheduler.patterns.BookingState bookingState6 = bookingContext3.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState7 = bookingContext3.getState();
        cancelledBookingState1.handle(bookingContext3);
        checkedInBookingState0.handle(bookingContext3);
        java.lang.String str10 = checkedInBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation11 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext12 = new com.conferenceroomscheduler.patterns.BookingContext(reservation11);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState13 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext12.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState13);
        com.conferenceroomscheduler.model.Reservation reservation15 = bookingContext12.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation16 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext17 = new com.conferenceroomscheduler.patterns.BookingContext(reservation16);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState18 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext17.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState18);
        com.conferenceroomscheduler.patterns.BookingState bookingState20 = bookingContext17.getState();
        bookingContext12.setState(bookingState20);
        checkedInBookingState0.handle(bookingContext12);
        com.conferenceroomscheduler.model.Reservation reservation23 = bookingContext12.getReservation();
        java.lang.String str24 = bookingContext12.getStatus();
        java.lang.String str25 = bookingContext12.getStatus();
        com.conferenceroomscheduler.model.Reservation reservation26 = new com.conferenceroomscheduler.model.Reservation();
        reservation26.setFinalAmount((double) (byte) 100);
        reservation26.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext31 = new com.conferenceroomscheduler.patterns.BookingContext(reservation26);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState32 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str33 = cancelledBookingState32.getName();
        bookingContext31.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState32);
        com.conferenceroomscheduler.model.Reservation reservation35 = bookingContext31.getReservation();
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState36 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str37 = confirmedBookingState36.getName();
        java.lang.String str38 = confirmedBookingState36.getName();
        java.lang.String str39 = confirmedBookingState36.getName();
        bookingContext31.setState((com.conferenceroomscheduler.patterns.BookingState) confirmedBookingState36);
        java.lang.String str41 = confirmedBookingState36.getName();
        bookingContext12.setState((com.conferenceroomscheduler.patterns.BookingState) confirmedBookingState36);
        com.conferenceroomscheduler.patterns.BookingState bookingState43 = bookingContext12.getState();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Checked in." + "'", str10, "Checked in.");
        org.junit.Assert.assertNull(reservation15);
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertNull(reservation23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Booking complete" + "'", str24, "Booking complete");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Booking complete" + "'", str25, "Booking complete");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Cancelled" + "'", str33, "Cancelled");
        org.junit.Assert.assertNotNull(reservation35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Booking confirmed." + "'", str37, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Booking confirmed." + "'", str38, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Booking confirmed." + "'", str39, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Booking confirmed." + "'", str41, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState43);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "", "hi!", "", (int) '4', localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = bookingRequest7.getStartTime();
        java.lang.String str9 = bookingRequest7.getRequestId();
        java.lang.String str10 = bookingRequest7.getRoomId();
        java.lang.String str11 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, true);
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory4 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account12 = facultyFactory4.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account20 = facultyFactory4.createAccount("", "hi!", "", "", false, true, "");
        account20.setAccountType("Cancelled");
        java.lang.String str23 = account20.getAccountId();
        boolean boolean24 = occupancySensor3.detectOccupancy(account20);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher25 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor29 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher30 = null;
        occupancySensor29.setSubject(checkInPublisher30);
        occupancySensor29.occupied = true;
        occupancySensor29.setDetected(false);
        checkInPublisher25.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor29);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor40 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor40.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount49 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount49.setEmail("");
        boolean boolean52 = occupancySensor40.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount49);
        checkInPublisher25.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor40);
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory54 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account62 = facultyFactory54.createAccount("", "Cancelled", "", "hi!", false, false, "");
        account62.setAccountNumber("hi!");
        account62.setUniversityAccount(true);
        account62.setAccountType("Cancelled");
        checkInPublisher25.notifyObservers(account62);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor73 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, true);
        boolean boolean74 = occupancySensor73.isOccupied();
        checkInPublisher25.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor73);
        occupancySensor3.setSubject(checkInPublisher25);
        com.conferenceroomscheduler.model.AdminAccount adminAccount83 = new com.conferenceroomscheduler.model.AdminAccount("Booking confirmed.", "ADMIN-69", "Booking complete", true, true, "");
        checkInPublisher25.notifyObservers((com.conferenceroomscheduler.model.Account) adminAccount83);
        adminAccount83.setPassword("Booking confirmed.");
        org.junit.Assert.assertNotNull(account12);
        org.junit.Assert.assertNotNull(account20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(account62);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        room6.setCapacity((int) '4');
        room6.setName("Cancelled");
        room6.setRoomNumber("student");
        java.lang.String str17 = room6.getBuilding();
        int int18 = room6.getCapacity();
        boolean boolean19 = room6.isClosedForMaintenance();
        int int20 = room6.getCapacity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        reservation1.setFinalAmount((double) ' ');
        java.lang.String str10 = reservation1.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext11 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        reservation1.setDepositLost(true);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand16 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime14, localDateTime15);
        java.lang.String str17 = reservation1.getRoomId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setCheckedIn(true);
        reservation0.setCheckedIn(false);
        reservation0.setReservationId("faculty");
        java.lang.String str13 = reservation0.getReservationId();
        reservation0.setCanceled(false);
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("Checked in.", "partner", "hi!", true, false, "staff");
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState0 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState1 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation2 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext3 = new com.conferenceroomscheduler.patterns.BookingContext(reservation2);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState4 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext3.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState4);
        com.conferenceroomscheduler.patterns.BookingState bookingState6 = bookingContext3.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState7 = bookingContext3.getState();
        cancelledBookingState1.handle(bookingContext3);
        checkedInBookingState0.handle(bookingContext3);
        java.lang.String str10 = bookingContext3.getStatus();
        com.conferenceroomscheduler.patterns.BookingState bookingState11 = bookingContext3.getState();
        bookingContext3.request();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking complete" + "'", str10, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState11);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        com.conferenceroomscheduler.model.Reservation reservation30 = new com.conferenceroomscheduler.model.Reservation();
        reservation30.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod33 = reservation30.getPaymentMethod();
        reservation30.setFinalAmount((double) (byte) 1);
        java.lang.String str36 = reservation30.getRoomId();
        reservation30.setReservationId("Checked in.");
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod49 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation50 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime43, localDateTime44, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod49);
        reservation30.setPaymentMethod(paymentMethod49);
        com.conferenceroomscheduler.model.Reservation reservation52 = new com.conferenceroomscheduler.model.Reservation("student", "Checked in.", "admin", "Booking complete", localDateTime24, localDateTime25, "hi!", (double) 100, (double) (short) -1, 0.0d, paymentMethod49);
        com.conferenceroomscheduler.model.Reservation reservation53 = new com.conferenceroomscheduler.model.Reservation("Cancelled", "Pending", "", "Booking confirmed.", localDateTime14, localDateTime15, "Booking confirmed.", 97.0d, (double) 35, (double) 'a', paymentMethod49);
        com.conferenceroomscheduler.model.Reservation reservation54 = new com.conferenceroomscheduler.model.Reservation("", "Verified badge detected for ADMIN-69.", "Checked in.", "Pending", localDateTime4, localDateTime5, "admin", (double) (short) 1, (double) 0, (double) 100, paymentMethod49);
        org.junit.Assert.assertNull(paymentMethod33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + paymentMethod49 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod49.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState0 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState1 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation2 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext3 = new com.conferenceroomscheduler.patterns.BookingContext(reservation2);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState4 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext3.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState4);
        com.conferenceroomscheduler.patterns.BookingState bookingState6 = bookingContext3.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState7 = bookingContext3.getState();
        cancelledBookingState1.handle(bookingContext3);
        checkedInBookingState0.handle(bookingContext3);
        java.lang.String str10 = checkedInBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation11 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext12 = new com.conferenceroomscheduler.patterns.BookingContext(reservation11);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState13 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext12.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState13);
        com.conferenceroomscheduler.model.Reservation reservation15 = bookingContext12.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation16 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext17 = new com.conferenceroomscheduler.patterns.BookingContext(reservation16);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState18 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext17.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState18);
        com.conferenceroomscheduler.patterns.BookingState bookingState20 = bookingContext17.getState();
        bookingContext12.setState(bookingState20);
        checkedInBookingState0.handle(bookingContext12);
        java.lang.String str23 = checkedInBookingState0.getName();
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState24 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str25 = pendingBookingState24.getName();
        com.conferenceroomscheduler.model.Reservation reservation26 = new com.conferenceroomscheduler.model.Reservation();
        reservation26.setFinalAmount((double) (byte) 100);
        reservation26.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext31 = new com.conferenceroomscheduler.patterns.BookingContext(reservation26);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState32 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str33 = cancelledBookingState32.getName();
        bookingContext31.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState32);
        pendingBookingState24.handle(bookingContext31);
        java.lang.String str36 = bookingContext31.getStatus();
        checkedInBookingState0.handle(bookingContext31);
        java.lang.String str38 = checkedInBookingState0.getName();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Checked in." + "'", str10, "Checked in.");
        org.junit.Assert.assertNull(reservation15);
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Checked in." + "'", str23, "Checked in.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Pending" + "'", str25, "Pending");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Cancelled" + "'", str33, "Cancelled");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Cancelled" + "'", str36, "Cancelled");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Checked in." + "'", str38, "Checked in.");
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = null;
        occupancySensor3.setSubject(checkInPublisher12);
        occupancySensor3.isDetected = false;
        boolean boolean16 = occupancySensor3.isOccupied();
        com.conferenceroomscheduler.model.Badge badge20 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str21 = badge20.getEmail();
        boolean boolean22 = occupancySensor3.scanIdBadge(badge20);
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory23 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account31 = facultyFactory23.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account39 = facultyFactory23.createAccount("", "hi!", "", "", false, true, "");
        com.conferenceroomscheduler.model.Account account47 = facultyFactory23.createAccount("Cancelled", "Pending", "Cancelled", "hi!", false, false, "");
        account47.setVerified(false);
        boolean boolean50 = occupancySensor3.detectOccupancy(account47);
        java.lang.String str51 = occupancySensor3.getLastEvent();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(account31);
        org.junit.Assert.assertNotNull(account39);
        org.junit.Assert.assertNotNull(account47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Unverified badge detected for Cancelled." + "'", str51, "Unverified badge detected for Cancelled.");
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState0 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str1 = pendingBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setFinalAmount((double) (byte) 100);
        reservation2.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext7 = new com.conferenceroomscheduler.patterns.BookingContext(reservation2);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState8 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str9 = cancelledBookingState8.getName();
        bookingContext7.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState8);
        pendingBookingState0.handle(bookingContext7);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState12 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation13 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext14 = new com.conferenceroomscheduler.patterns.BookingContext(reservation13);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState15 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext14.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState15);
        com.conferenceroomscheduler.patterns.BookingState bookingState17 = bookingContext14.getState();
        com.conferenceroomscheduler.model.Reservation reservation18 = bookingContext14.getReservation();
        cancelledBookingState12.handle(bookingContext14);
        java.lang.String str20 = cancelledBookingState12.getName();
        bookingContext7.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState12);
        java.lang.String str22 = cancelledBookingState12.getName();
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState23 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str24 = pendingBookingState23.getName();
        com.conferenceroomscheduler.model.Reservation reservation25 = new com.conferenceroomscheduler.model.Reservation();
        reservation25.setFinalAmount((double) (byte) 100);
        reservation25.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext30 = new com.conferenceroomscheduler.patterns.BookingContext(reservation25);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState31 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str32 = cancelledBookingState31.getName();
        bookingContext30.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState31);
        pendingBookingState23.handle(bookingContext30);
        java.lang.String str35 = pendingBookingState23.getName();
        java.lang.String str36 = pendingBookingState23.getName();
        com.conferenceroomscheduler.model.Reservation reservation37 = new com.conferenceroomscheduler.model.Reservation();
        reservation37.setFinalAmount((double) (byte) 100);
        java.lang.String str40 = reservation37.getRoomId();
        reservation37.setFinalAmount((double) 10.0f);
        java.lang.String str43 = reservation37.getUserId();
        reservation37.setFinalAmount((double) ' ');
        java.lang.String str46 = reservation37.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext47 = new com.conferenceroomscheduler.patterns.BookingContext(reservation37);
        bookingContext47.request();
        pendingBookingState23.handle(bookingContext47);
        com.conferenceroomscheduler.model.Reservation reservation50 = new com.conferenceroomscheduler.model.Reservation();
        reservation50.setFinalAmount((double) (byte) 100);
        java.lang.String str53 = reservation50.getRoomId();
        reservation50.setFinalAmount((double) 10.0f);
        java.lang.String str56 = reservation50.getUserId();
        double double57 = reservation50.getFinalAmount();
        reservation50.setReservationId("Pending");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext60 = new com.conferenceroomscheduler.patterns.BookingContext(reservation50);
        pendingBookingState23.handle(bookingContext60);
        cancelledBookingState12.handle(bookingContext60);
        com.conferenceroomscheduler.model.Reservation reservation63 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext64 = new com.conferenceroomscheduler.patterns.BookingContext(reservation63);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState65 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext64.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState65);
        com.conferenceroomscheduler.patterns.BookingState bookingState67 = bookingContext64.getState();
        java.lang.String str68 = bookingContext64.getStatus();
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState69 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation70 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext71 = new com.conferenceroomscheduler.patterns.BookingContext(reservation70);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState72 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext71.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState72);
        completedBookingState69.handle(bookingContext71);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState75 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation76 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext77 = new com.conferenceroomscheduler.patterns.BookingContext(reservation76);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState78 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext77.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState78);
        com.conferenceroomscheduler.patterns.BookingState bookingState80 = bookingContext77.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState81 = bookingContext77.getState();
        cancelledBookingState75.handle(bookingContext77);
        completedBookingState69.handle(bookingContext77);
        java.lang.String str84 = completedBookingState69.getName();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext85 = null;
        completedBookingState69.handle(bookingContext85);
        java.lang.String str87 = completedBookingState69.getName();
        bookingContext64.setState((com.conferenceroomscheduler.patterns.BookingState) completedBookingState69);
        java.lang.String str89 = bookingContext64.getStatus();
        cancelledBookingState12.handle(bookingContext64);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pending" + "'", str1, "Pending");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState17);
        org.junit.Assert.assertNull(reservation18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cancelled" + "'", str20, "Cancelled");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cancelled" + "'", str22, "Cancelled");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Pending" + "'", str24, "Pending");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Cancelled" + "'", str32, "Cancelled");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Pending" + "'", str35, "Pending");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Pending" + "'", str36, "Pending");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertNotNull(bookingState67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Cancelled" + "'", str68, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState80);
        org.junit.Assert.assertNotNull(bookingState81);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Booking complete" + "'", str84, "Booking complete");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Booking complete" + "'", str87, "Booking complete");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Booking complete" + "'", str89, "Booking complete");
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState0 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str1 = confirmedBookingState0.getName();
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState2 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str3 = pendingBookingState2.getName();
        com.conferenceroomscheduler.model.Reservation reservation4 = new com.conferenceroomscheduler.model.Reservation();
        reservation4.setFinalAmount((double) (byte) 100);
        reservation4.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext9 = new com.conferenceroomscheduler.patterns.BookingContext(reservation4);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState10 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str11 = cancelledBookingState10.getName();
        bookingContext9.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState10);
        pendingBookingState2.handle(bookingContext9);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState14 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation15 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext16 = new com.conferenceroomscheduler.patterns.BookingContext(reservation15);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState17 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext16.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState17);
        com.conferenceroomscheduler.patterns.BookingState bookingState19 = bookingContext16.getState();
        com.conferenceroomscheduler.model.Reservation reservation20 = bookingContext16.getReservation();
        cancelledBookingState14.handle(bookingContext16);
        java.lang.String str22 = cancelledBookingState14.getName();
        bookingContext9.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState14);
        com.conferenceroomscheduler.model.Reservation reservation24 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext25 = new com.conferenceroomscheduler.patterns.BookingContext(reservation24);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState26 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext25.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState26);
        java.lang.String str28 = cancelledBookingState26.getName();
        java.lang.String str29 = cancelledBookingState26.getName();
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState30 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str31 = confirmedBookingState30.getName();
        java.lang.String str32 = confirmedBookingState30.getName();
        java.lang.String str33 = confirmedBookingState30.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState34 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState35 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation36 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext37 = new com.conferenceroomscheduler.patterns.BookingContext(reservation36);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState38 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext37.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState38);
        com.conferenceroomscheduler.patterns.BookingState bookingState40 = bookingContext37.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState41 = bookingContext37.getState();
        cancelledBookingState35.handle(bookingContext37);
        checkedInBookingState34.handle(bookingContext37);
        java.lang.String str44 = checkedInBookingState34.getName();
        com.conferenceroomscheduler.model.Reservation reservation45 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext46 = new com.conferenceroomscheduler.patterns.BookingContext(reservation45);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState47 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext46.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState47);
        com.conferenceroomscheduler.model.Reservation reservation49 = bookingContext46.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation50 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext51 = new com.conferenceroomscheduler.patterns.BookingContext(reservation50);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState52 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext51.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState52);
        com.conferenceroomscheduler.patterns.BookingState bookingState54 = bookingContext51.getState();
        bookingContext46.setState(bookingState54);
        checkedInBookingState34.handle(bookingContext46);
        com.conferenceroomscheduler.model.Reservation reservation57 = bookingContext46.getReservation();
        confirmedBookingState30.handle(bookingContext46);
        java.lang.String str59 = confirmedBookingState30.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState60 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState61 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation62 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext63 = new com.conferenceroomscheduler.patterns.BookingContext(reservation62);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState64 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext63.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState64);
        com.conferenceroomscheduler.patterns.BookingState bookingState66 = bookingContext63.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState67 = bookingContext63.getState();
        cancelledBookingState61.handle(bookingContext63);
        checkedInBookingState60.handle(bookingContext63);
        com.conferenceroomscheduler.model.Reservation reservation70 = new com.conferenceroomscheduler.model.Reservation();
        reservation70.setFinalAmount((double) (byte) 100);
        reservation70.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext75 = new com.conferenceroomscheduler.patterns.BookingContext(reservation70);
        checkedInBookingState60.handle(bookingContext75);
        confirmedBookingState30.handle(bookingContext75);
        cancelledBookingState26.handle(bookingContext75);
        com.conferenceroomscheduler.model.Reservation reservation79 = bookingContext75.getReservation();
        cancelledBookingState14.handle(bookingContext75);
        confirmedBookingState0.handle(bookingContext75);
        com.conferenceroomscheduler.model.Reservation reservation82 = new com.conferenceroomscheduler.model.Reservation();
        reservation82.setFinalAmount((double) (byte) 100);
        reservation82.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext87 = new com.conferenceroomscheduler.patterns.BookingContext(reservation82);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState88 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str89 = cancelledBookingState88.getName();
        bookingContext87.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState88);
        java.lang.String str91 = cancelledBookingState88.getName();
        bookingContext75.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState88);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking confirmed." + "'", str1, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pending" + "'", str3, "Pending");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cancelled" + "'", str11, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState19);
        org.junit.Assert.assertNull(reservation20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cancelled" + "'", str22, "Cancelled");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Cancelled" + "'", str28, "Cancelled");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Cancelled" + "'", str29, "Cancelled");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Booking confirmed." + "'", str31, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Booking confirmed." + "'", str32, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Booking confirmed." + "'", str33, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState40);
        org.junit.Assert.assertNotNull(bookingState41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Checked in." + "'", str44, "Checked in.");
        org.junit.Assert.assertNull(reservation49);
        org.junit.Assert.assertNotNull(bookingState54);
        org.junit.Assert.assertNull(reservation57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Booking confirmed." + "'", str59, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState66);
        org.junit.Assert.assertNotNull(bookingState67);
        org.junit.Assert.assertNotNull(reservation79);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Cancelled" + "'", str89, "Cancelled");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "Cancelled" + "'", str91, "Cancelled");
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        java.lang.String str7 = reservation0.getAccountType();
        double double8 = reservation0.getFinalAmount();
        com.conferenceroomscheduler.model.Reservation reservation9 = new com.conferenceroomscheduler.model.Reservation();
        reservation9.setFinalAmount((double) (byte) 100);
        java.lang.String str12 = reservation9.getRoomId();
        reservation9.setFinalAmount((double) 10.0f);
        java.lang.String str15 = reservation9.getUserId();
        reservation9.setDepositAmount((double) (byte) 0);
        double double18 = reservation9.getHourlyRate();
        reservation9.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext21 = new com.conferenceroomscheduler.patterns.BookingContext(reservation9);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod32 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation33 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime26, localDateTime27, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod32);
        reservation9.setPaymentMethod(paymentMethod32);
        reservation0.setPaymentMethod(paymentMethod32);
        reservation0.setTitle("Pending");
        double double38 = reservation0.getHourlyRate();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod32 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod32.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setEnabled(true);
        java.lang.String str13 = room6.getName();
        room6.setName("Cancelled");
        room6.setCapacity((int) (short) 10);
        java.lang.String str18 = room6.getRoomId();
        room6.setRoomNumber("ADMIN-69");
        boolean boolean21 = room6.isEnabled();
        room6.setName("Cancelled");
        java.lang.String str24 = room6.getBuilding();
        boolean boolean25 = room6.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState0 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext2 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState3 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext2.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState3);
        com.conferenceroomscheduler.patterns.BookingState bookingState5 = bookingContext2.getState();
        com.conferenceroomscheduler.model.Reservation reservation6 = bookingContext2.getReservation();
        cancelledBookingState0.handle(bookingContext2);
        java.lang.String str8 = cancelledBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation9 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext10 = new com.conferenceroomscheduler.patterns.BookingContext(reservation9);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState11 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext10.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState11);
        com.conferenceroomscheduler.patterns.BookingState bookingState13 = bookingContext10.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState14 = bookingContext10.getState();
        bookingContext10.request();
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState16 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str17 = confirmedBookingState16.getName();
        java.lang.String str18 = confirmedBookingState16.getName();
        java.lang.String str19 = confirmedBookingState16.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState20 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState21 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation22 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext23 = new com.conferenceroomscheduler.patterns.BookingContext(reservation22);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState24 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext23.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState24);
        com.conferenceroomscheduler.patterns.BookingState bookingState26 = bookingContext23.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState27 = bookingContext23.getState();
        cancelledBookingState21.handle(bookingContext23);
        checkedInBookingState20.handle(bookingContext23);
        java.lang.String str30 = checkedInBookingState20.getName();
        com.conferenceroomscheduler.model.Reservation reservation31 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext32 = new com.conferenceroomscheduler.patterns.BookingContext(reservation31);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState33 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext32.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState33);
        com.conferenceroomscheduler.model.Reservation reservation35 = bookingContext32.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation36 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext37 = new com.conferenceroomscheduler.patterns.BookingContext(reservation36);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState38 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext37.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState38);
        com.conferenceroomscheduler.patterns.BookingState bookingState40 = bookingContext37.getState();
        bookingContext32.setState(bookingState40);
        checkedInBookingState20.handle(bookingContext32);
        com.conferenceroomscheduler.model.Reservation reservation43 = bookingContext32.getReservation();
        confirmedBookingState16.handle(bookingContext32);
        java.lang.String str45 = confirmedBookingState16.getName();
        java.lang.String str46 = confirmedBookingState16.getName();
        java.lang.String str47 = confirmedBookingState16.getName();
        bookingContext10.setState((com.conferenceroomscheduler.patterns.BookingState) confirmedBookingState16);
        java.lang.String str49 = confirmedBookingState16.getName();
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState50 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str51 = confirmedBookingState50.getName();
        java.lang.String str52 = confirmedBookingState50.getName();
        java.lang.String str53 = confirmedBookingState50.getName();
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState54 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation55 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext56 = new com.conferenceroomscheduler.patterns.BookingContext(reservation55);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState57 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext56.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState57);
        completedBookingState54.handle(bookingContext56);
        confirmedBookingState50.handle(bookingContext56);
        confirmedBookingState16.handle(bookingContext56);
        cancelledBookingState0.handle(bookingContext56);
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNull(reservation6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState13);
        org.junit.Assert.assertNotNull(bookingState14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking confirmed." + "'", str17, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking confirmed." + "'", str18, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Booking confirmed." + "'", str19, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState26);
        org.junit.Assert.assertNotNull(bookingState27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Checked in." + "'", str30, "Checked in.");
        org.junit.Assert.assertNull(reservation35);
        org.junit.Assert.assertNotNull(bookingState40);
        org.junit.Assert.assertNull(reservation43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Booking confirmed." + "'", str45, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Booking confirmed." + "'", str46, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Booking confirmed." + "'", str47, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Booking confirmed." + "'", str49, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Booking confirmed." + "'", str51, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Booking confirmed." + "'", str52, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Booking confirmed." + "'", str53, "Booking confirmed.");
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        com.conferenceroomscheduler.patterns.StaffFactory staffFactory0 = new com.conferenceroomscheduler.patterns.StaffFactory();
        com.conferenceroomscheduler.model.Account account8 = staffFactory0.createAccount("Cancelled", "Checked in.", "", "Cancelled", true, true, "");
        com.conferenceroomscheduler.model.Account account16 = staffFactory0.createAccount("Booking complete", "Unverified badge detected for .", "Unverified badge detected for .", "Cancelled", false, false, "Unverified badge detected for .");
        com.conferenceroomscheduler.model.Account account24 = staffFactory0.createAccount("hi!", "partner", "Unverified badge detected for Cancelled.", "Unverified badge detected for Cancelled.", true, false, "ADMIN-69");
        com.conferenceroomscheduler.model.Account account32 = staffFactory0.createAccount("admin", "Unverified badge detected for admin.", "student", "student", true, false, "Unverified badge detected for Cancelled.");
        com.conferenceroomscheduler.model.Account account40 = staffFactory0.createAccount("ADMIN-69", "staff", "student", "Cancelled", false, false, "admin");
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
        org.junit.Assert.assertNotNull(account32);
        org.junit.Assert.assertNotNull(account40);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        com.conferenceroomscheduler.patterns.PartnerFactory partnerFactory0 = new com.conferenceroomscheduler.patterns.PartnerFactory();
        com.conferenceroomscheduler.model.Account account8 = partnerFactory0.createAccount("Checked in.", "hi!", "admin", "", true, false, "Pending");
        com.conferenceroomscheduler.model.Account account16 = partnerFactory0.createAccount("Booking complete", "hi!", "hi!", "", true, false, "Checked in.");
        account16.setUniversityAccount(true);
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        double double7 = reservation0.getFinalAmount();
        java.time.LocalDateTime localDateTime8 = reservation0.getEndTime();
        boolean boolean9 = reservation0.isDepositLost();
        java.lang.String str10 = reservation0.getUserId();
        double double11 = reservation0.getHourlyRate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getRoomId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.time.LocalDateTime localDateTime11 = bookingRequest7.getEndTime();
        java.time.LocalDateTime localDateTime12 = bookingRequest7.getEndTime();
        java.lang.String str13 = bookingRequest7.getTitle();
        java.lang.String str14 = bookingRequest7.getRequestId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("Cancelled", "partner", "Booking complete", "ADMIN-69", false, true, "Verified badge detected for Checked in..");
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Cancelled", "hi!", "hi!", "", (int) (short) 1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getTitle();
        java.lang.String str9 = bookingRequest7.getRoomId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.lang.String str11 = bookingRequest7.getOrganizerId();
        java.time.LocalDateTime localDateTime12 = bookingRequest7.getStartTime();
        java.lang.String str13 = bookingRequest7.getOrganizerId();
        java.lang.String str14 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str4 = badge3.getEmail();
        boolean boolean5 = badge3.isVerified();
        badge3.setAccountId("Pending");
        java.lang.String str8 = badge3.getEmail();
        boolean boolean9 = badge3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cancelled" + "'", str4, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("hi!", "", false);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory0 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account8 = facultyFactory0.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account16 = facultyFactory0.createAccount("", "hi!", "", "", false, true, "");
        com.conferenceroomscheduler.model.Account account24 = facultyFactory0.createAccount("Cancelled", "Pending", "Cancelled", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account32 = facultyFactory0.createAccount("student", "", "Checked in.", "admin", false, true, "Checked in.");
        account32.setAccountType("hi!");
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
        org.junit.Assert.assertNotNull(account32);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = null;
        occupancySensor3.setSubject(checkInPublisher12);
        occupancySensor3.isDetected = false;
        boolean boolean16 = occupancySensor3.isOccupied();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor20 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor24 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean25 = occupancySensor24.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher26 = null;
        occupancySensor24.subject = checkInPublisher26;
        occupancySensor24.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher30 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor34 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher35 = null;
        occupancySensor34.setSubject(checkInPublisher35);
        occupancySensor34.occupied = true;
        occupancySensor34.setDetected(false);
        checkInPublisher30.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor34);
        occupancySensor24.setSubject(checkInPublisher30);
        occupancySensor20.setSubject(checkInPublisher30);
        occupancySensor3.subject = checkInPublisher30;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor48 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean49 = occupancySensor48.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher50 = null;
        occupancySensor48.subject = checkInPublisher50;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher52 = occupancySensor48.getSubject();
        checkInPublisher30.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor48);
        boolean boolean54 = occupancySensor48.isDetected();
        occupancySensor48.roomId = "Booking complete";
        java.lang.String str57 = occupancySensor48.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(checkInPublisher52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Booking complete" + "'", str57, "Booking complete");
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        boolean boolean11 = room6.isEnabled();
        boolean boolean12 = room6.isClosedForMaintenance();
        room6.setCapacity((int) (short) 100);
        room6.setRoomId("Booking confirmed.");
        int int17 = room6.getCapacity();
        room6.setClosedForMaintenance(false);
        room6.setBuilding("student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext6 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState7 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str8 = cancelledBookingState7.getName();
        bookingContext6.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState7);
        com.conferenceroomscheduler.model.Reservation reservation10 = bookingContext6.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation11 = bookingContext6.getReservation();
        reservation11.setCanceled(false);
        java.time.LocalDateTime localDateTime14 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand15 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation11, localDateTime14);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNotNull(reservation10);
        org.junit.Assert.assertNotNull(reservation11);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy institutionalBillingPaymentStrategy0 = new com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy();
        boolean boolean3 = institutionalBillingPaymentStrategy0.processPayment("", (-1.0d));
        boolean boolean6 = institutionalBillingPaymentStrategy0.processPayment("staff", 32.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean4 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor3.subject = checkInPublisher5;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount17 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean18 = occupancySensor10.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount17);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor22 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor22.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount31 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount31.setEmail("");
        boolean boolean34 = occupancySensor22.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount31);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor38 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean39 = occupancySensor38.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher40 = null;
        occupancySensor38.subject = checkInPublisher40;
        occupancySensor38.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher44 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor48 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher49 = null;
        occupancySensor48.setSubject(checkInPublisher49);
        occupancySensor48.occupied = true;
        occupancySensor48.setDetected(false);
        checkInPublisher44.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor48);
        occupancySensor38.setSubject(checkInPublisher44);
        com.conferenceroomscheduler.model.StudentAccount studentAccount63 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        checkInPublisher44.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount63);
        occupancySensor22.subject = checkInPublisher44;
        occupancySensor10.subject = checkInPublisher44;
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount73 = new com.conferenceroomscheduler.model.PartnerAccount("hi!", "", "", true, true, "");
        checkInPublisher44.notifyObservers((com.conferenceroomscheduler.model.Account) partnerAccount73);
        partnerAccount73.setAccountType("Pending");
        boolean boolean77 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) partnerAccount73);
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount84 = new com.conferenceroomscheduler.model.PartnerAccount("Booking confirmed.", "hi!", "Pending", false, true, "Checked in.");
        java.lang.String str85 = partnerAccount84.getAccountNumber();
        java.lang.String str86 = partnerAccount84.getPassword();
        boolean boolean87 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) partnerAccount84);
        occupancySensor3.isDetected = false;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Checked in." + "'", str85, "Checked in.");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Pending" + "'", str86, "Pending");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        boolean boolean13 = room6.isEnabled();
        room6.setName("");
        java.lang.String str16 = room6.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("", "Booking complete", "Cancelled", true, false, "hi!");
        staffAccount6.setIdentifier("Unverified badge detected for .");
        staffAccount6.setUniversityAccount(true);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        boolean boolean4 = badgeScan3.isVerified();
        boolean boolean5 = badgeScan3.isVerified();
        java.lang.String str6 = badgeScan3.getBadgeId();
        badgeScan3.setVerified(true);
        java.lang.String str9 = badgeScan3.getRoomId();
        badgeScan3.setRoomId("Booking complete");
        badgeScan3.setVerified(true);
        java.lang.String str14 = badgeScan3.getBadgeId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Cancelled", "hi!", "hi!", "", (int) (short) 1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRoomId();
        java.lang.String str9 = bookingRequest7.getRoomId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getStartTime();
        java.lang.String str11 = bookingRequest7.getRoomId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod10 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation11 = new com.conferenceroomscheduler.model.Reservation("Unverified badge detected for .", "Pending", "admin", "faculty", localDateTime4, localDateTime5, "student", (double) 35, (double) (short) -1, (double) 35, paymentMethod10);
        reservation11.setUserId("student");
        org.junit.Assert.assertTrue("'" + paymentMethod10 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod10.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        boolean boolean9 = occupancySensor4.isDetected;
        boolean boolean10 = occupancySensor4.isDetected;
        com.conferenceroomscheduler.model.StaffAccount staffAccount17 = new com.conferenceroomscheduler.model.StaffAccount("hi!", "Checked in.", "Cancelled", true, true, "partner");
        boolean boolean18 = occupancySensor4.detectOccupancy((com.conferenceroomscheduler.model.Account) staffAccount17);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setHourlyRate((double) (byte) 100);
        boolean boolean5 = reservation2.isDepositLost();
        java.lang.String str6 = reservation2.getUserId();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand9 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService1, reservation2, localDateTime7, localDateTime8);
        reservation2.setCheckedIn(true);
        reservation2.setCanceled(true);
        reservation2.setAccountType("Booking complete");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand16 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation2);
        boolean boolean17 = cancelBookingCommand16.wasSuccessful();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState0 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str1 = confirmedBookingState0.getName();
        java.lang.String str2 = confirmedBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation3 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext4 = new com.conferenceroomscheduler.patterns.BookingContext(reservation3);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState5 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext4.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState5);
        com.conferenceroomscheduler.model.Reservation reservation7 = bookingContext4.getReservation();
        confirmedBookingState0.handle(bookingContext4);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState9 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState10 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation11 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext12 = new com.conferenceroomscheduler.patterns.BookingContext(reservation11);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState13 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext12.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState13);
        com.conferenceroomscheduler.patterns.BookingState bookingState15 = bookingContext12.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState16 = bookingContext12.getState();
        cancelledBookingState10.handle(bookingContext12);
        checkedInBookingState9.handle(bookingContext12);
        com.conferenceroomscheduler.model.Reservation reservation19 = new com.conferenceroomscheduler.model.Reservation();
        reservation19.setFinalAmount((double) (byte) 100);
        reservation19.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext24 = new com.conferenceroomscheduler.patterns.BookingContext(reservation19);
        checkedInBookingState9.handle(bookingContext24);
        com.conferenceroomscheduler.model.Reservation reservation26 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext27 = new com.conferenceroomscheduler.patterns.BookingContext(reservation26);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState28 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext27.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState28);
        checkedInBookingState9.handle(bookingContext27);
        confirmedBookingState0.handle(bookingContext27);
        java.lang.String str32 = confirmedBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking confirmed." + "'", str1, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking confirmed." + "'", str2, "Booking confirmed.");
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Booking confirmed." + "'", str32, "Booking confirmed.");
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        occupancySensor3.setDetected(true);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher8 = occupancySensor3.subject;
        occupancySensor3.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher11 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor15 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher16 = null;
        occupancySensor15.setSubject(checkInPublisher16);
        occupancySensor15.occupied = true;
        occupancySensor15.setDetected(false);
        checkInPublisher11.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor15);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor26 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor26.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount35 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount35.setEmail("");
        boolean boolean38 = occupancySensor26.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount35);
        checkInPublisher11.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor26);
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory40 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account48 = facultyFactory40.createAccount("", "Cancelled", "", "hi!", false, false, "");
        account48.setAccountNumber("hi!");
        account48.setUniversityAccount(true);
        account48.setAccountType("Cancelled");
        checkInPublisher11.notifyObservers(account48);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor59 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, true);
        boolean boolean60 = occupancySensor59.isOccupied();
        checkInPublisher11.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor59);
        occupancySensor3.setSubject(checkInPublisher11);
        com.conferenceroomscheduler.model.AdminAccount adminAccount63 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str64 = adminAccount63.getEmail();
        adminAccount63.setEmail("Cancelled");
        boolean boolean67 = adminAccount63.isUniversityAccount();
        adminAccount63.setAccountNumber("Cancelled");
        com.conferenceroomscheduler.model.Badge badge70 = adminAccount63.getBadge();
        adminAccount63.setAccountNumber("Verified badge detected for ADMIN-69.");
        checkInPublisher11.notifyObservers((com.conferenceroomscheduler.model.Account) adminAccount63);
        org.junit.Assert.assertNull(checkInPublisher8);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(account48);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(badge70);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor0 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor0.update("Checked in.");
        roomSensor0.update("Checked in.");
        roomSensor0.update("Cancelled");
        roomSensor0.update("admin");
        roomSensor0.update("Checked in.");
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("ADMIN-69", "Cancelled", "Cancelled", true, true, "Checked in.");
        facultyAccount6.setAccountId("");
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor7 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean8 = occupancySensor7.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher9 = null;
        occupancySensor7.subject = checkInPublisher9;
        occupancySensor7.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher13 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor17 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher18 = null;
        occupancySensor17.setSubject(checkInPublisher18);
        occupancySensor17.occupied = true;
        occupancySensor17.setDetected(false);
        checkInPublisher13.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor17);
        occupancySensor7.setSubject(checkInPublisher13);
        occupancySensor3.setSubject(checkInPublisher13);
        boolean boolean27 = occupancySensor3.isDetected;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor31 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount38 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean39 = occupancySensor31.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount38);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher40 = null;
        occupancySensor31.setSubject(checkInPublisher40);
        occupancySensor31.isDetected = false;
        boolean boolean44 = occupancySensor31.isOccupied();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor48 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor52 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean53 = occupancySensor52.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher54 = null;
        occupancySensor52.subject = checkInPublisher54;
        occupancySensor52.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher58 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor62 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher63 = null;
        occupancySensor62.setSubject(checkInPublisher63);
        occupancySensor62.occupied = true;
        occupancySensor62.setDetected(false);
        checkInPublisher58.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor62);
        occupancySensor52.setSubject(checkInPublisher58);
        occupancySensor48.setSubject(checkInPublisher58);
        occupancySensor31.subject = checkInPublisher58;
        occupancySensor3.setSubject(checkInPublisher58);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher74 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor78 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher79 = null;
        occupancySensor78.setSubject(checkInPublisher79);
        occupancySensor78.occupied = true;
        occupancySensor78.setDetected(false);
        checkInPublisher74.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor78);
        occupancySensor78.setRoomId("Booking confirmed.");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher88 = occupancySensor78.subject;
        occupancySensor3.setSubject(checkInPublisher88);
        occupancySensor3.setRoomId("Verified badge detected for ADMIN-69.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(checkInPublisher88);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand3 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime2);
        boolean boolean4 = extendBookingCommand3.wasSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.extendBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("hi!", "Checked in.", "Checked in.", true, true, "hi!");
        java.lang.String str7 = studentAccount6.getEmail();
        studentAccount6.setUniversityAccount(false);
        java.lang.String str10 = studentAccount6.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Checked in." + "'", str7, "Checked in.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor3.isDetected = false;
        java.lang.String str6 = occupancySensor3.getRoomId();
        boolean boolean7 = occupancySensor3.isDetected();
        boolean boolean8 = occupancySensor3.occupied;
        java.lang.String str9 = occupancySensor3.roomId;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pending" + "'", str6, "Pending");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Pending" + "'", str9, "Pending");
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        com.conferenceroomscheduler.model.Reservation reservation0 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext1 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState2 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext1.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState2);
        com.conferenceroomscheduler.patterns.BookingState bookingState4 = bookingContext1.getState();
        com.conferenceroomscheduler.model.Reservation reservation5 = bookingContext1.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation6 = bookingContext1.getReservation();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState7 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState8 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation9 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext10 = new com.conferenceroomscheduler.patterns.BookingContext(reservation9);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState11 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext10.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState11);
        com.conferenceroomscheduler.patterns.BookingState bookingState13 = bookingContext10.getState();
        com.conferenceroomscheduler.model.Reservation reservation14 = bookingContext10.getReservation();
        cancelledBookingState8.handle(bookingContext10);
        checkedInBookingState7.handle(bookingContext10);
        bookingContext10.request();
        com.conferenceroomscheduler.patterns.BookingState bookingState18 = bookingContext10.getState();
        bookingContext1.setState(bookingState18);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState20 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str21 = cancelledBookingState20.getName();
        bookingContext1.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState20);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState23 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState24 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation25 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext26 = new com.conferenceroomscheduler.patterns.BookingContext(reservation25);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState27 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext26.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState27);
        com.conferenceroomscheduler.patterns.BookingState bookingState29 = bookingContext26.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState30 = bookingContext26.getState();
        cancelledBookingState24.handle(bookingContext26);
        checkedInBookingState23.handle(bookingContext26);
        com.conferenceroomscheduler.model.Reservation reservation33 = new com.conferenceroomscheduler.model.Reservation();
        reservation33.setFinalAmount((double) (byte) 100);
        reservation33.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext38 = new com.conferenceroomscheduler.patterns.BookingContext(reservation33);
        checkedInBookingState23.handle(bookingContext38);
        com.conferenceroomscheduler.model.Reservation reservation40 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext41 = new com.conferenceroomscheduler.patterns.BookingContext(reservation40);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState42 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext41.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState42);
        checkedInBookingState23.handle(bookingContext41);
        com.conferenceroomscheduler.model.Reservation reservation45 = new com.conferenceroomscheduler.model.Reservation();
        reservation45.setFinalAmount((double) (byte) 100);
        java.lang.String str48 = reservation45.getRoomId();
        reservation45.setFinalAmount((double) 10.0f);
        java.lang.String str51 = reservation45.getUserId();
        reservation45.setFinalAmount((double) ' ');
        java.lang.String str54 = reservation45.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext55 = new com.conferenceroomscheduler.patterns.BookingContext(reservation45);
        bookingContext55.request();
        java.lang.String str57 = bookingContext55.getStatus();
        checkedInBookingState23.handle(bookingContext55);
        cancelledBookingState20.handle(bookingContext55);
        org.junit.Assert.assertNotNull(bookingState4);
        org.junit.Assert.assertNull(reservation5);
        org.junit.Assert.assertNull(reservation6);
        org.junit.Assert.assertNotNull(bookingState13);
        org.junit.Assert.assertNull(reservation14);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState29);
        org.junit.Assert.assertNotNull(bookingState30);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Pending" + "'", str57, "Pending");
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setRoomId("Booking confirmed.");
        java.lang.String str6 = badgeScan3.getBadgeId();
        java.lang.String str7 = badgeScan3.getRoomId();
        java.lang.String str8 = badgeScan3.getBadgeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking confirmed." + "'", str7, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState0 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext2 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState3 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext2.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState3);
        completedBookingState0.handle(bookingContext2);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState6 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation7 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext8 = new com.conferenceroomscheduler.patterns.BookingContext(reservation7);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState9 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext8.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState9);
        com.conferenceroomscheduler.patterns.BookingState bookingState11 = bookingContext8.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState12 = bookingContext8.getState();
        cancelledBookingState6.handle(bookingContext8);
        completedBookingState0.handle(bookingContext8);
        com.conferenceroomscheduler.model.Reservation reservation15 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext16 = new com.conferenceroomscheduler.patterns.BookingContext(reservation15);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState17 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext16.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState17);
        com.conferenceroomscheduler.patterns.BookingState bookingState19 = bookingContext16.getState();
        com.conferenceroomscheduler.model.Reservation reservation20 = bookingContext16.getReservation();
        completedBookingState0.handle(bookingContext16);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState22 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation23 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext24 = new com.conferenceroomscheduler.patterns.BookingContext(reservation23);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState25 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext24.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState25);
        com.conferenceroomscheduler.patterns.BookingState bookingState27 = bookingContext24.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState28 = bookingContext24.getState();
        cancelledBookingState22.handle(bookingContext24);
        com.conferenceroomscheduler.model.Reservation reservation30 = bookingContext24.getReservation();
        completedBookingState0.handle(bookingContext24);
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState32 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str33 = confirmedBookingState32.getName();
        java.lang.String str34 = confirmedBookingState32.getName();
        com.conferenceroomscheduler.model.Reservation reservation35 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext36 = new com.conferenceroomscheduler.patterns.BookingContext(reservation35);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState37 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext36.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState37);
        com.conferenceroomscheduler.model.Reservation reservation39 = bookingContext36.getReservation();
        confirmedBookingState32.handle(bookingContext36);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState41 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState42 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation43 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext44 = new com.conferenceroomscheduler.patterns.BookingContext(reservation43);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState45 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext44.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState45);
        com.conferenceroomscheduler.patterns.BookingState bookingState47 = bookingContext44.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState48 = bookingContext44.getState();
        cancelledBookingState42.handle(bookingContext44);
        checkedInBookingState41.handle(bookingContext44);
        java.lang.String str51 = checkedInBookingState41.getName();
        com.conferenceroomscheduler.model.Reservation reservation52 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext53 = new com.conferenceroomscheduler.patterns.BookingContext(reservation52);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState54 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext53.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState54);
        com.conferenceroomscheduler.model.Reservation reservation56 = bookingContext53.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation57 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext58 = new com.conferenceroomscheduler.patterns.BookingContext(reservation57);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState59 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext58.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState59);
        com.conferenceroomscheduler.patterns.BookingState bookingState61 = bookingContext58.getState();
        bookingContext53.setState(bookingState61);
        checkedInBookingState41.handle(bookingContext53);
        com.conferenceroomscheduler.model.Reservation reservation64 = bookingContext53.getReservation();
        java.lang.String str65 = bookingContext53.getStatus();
        java.lang.String str66 = bookingContext53.getStatus();
        confirmedBookingState32.handle(bookingContext53);
        com.conferenceroomscheduler.model.Reservation reservation68 = bookingContext53.getReservation();
        completedBookingState0.handle(bookingContext53);
        java.lang.String str70 = bookingContext53.getStatus();
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNotNull(bookingState12);
        org.junit.Assert.assertNotNull(bookingState19);
        org.junit.Assert.assertNull(reservation20);
        org.junit.Assert.assertNotNull(bookingState27);
        org.junit.Assert.assertNotNull(bookingState28);
        org.junit.Assert.assertNull(reservation30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Booking confirmed." + "'", str33, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Booking confirmed." + "'", str34, "Booking confirmed.");
        org.junit.Assert.assertNull(reservation39);
        org.junit.Assert.assertNotNull(bookingState47);
        org.junit.Assert.assertNotNull(bookingState48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Checked in." + "'", str51, "Checked in.");
        org.junit.Assert.assertNull(reservation56);
        org.junit.Assert.assertNotNull(bookingState61);
        org.junit.Assert.assertNull(reservation64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Booking complete" + "'", str65, "Booking complete");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Booking complete" + "'", str66, "Booking complete");
        org.junit.Assert.assertNull(reservation68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Checked in." + "'", str70, "Checked in.");
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        com.conferenceroomscheduler.model.Account account0 = new com.conferenceroomscheduler.model.Account();
        account0.setPassword("Pending");
        java.lang.String str3 = account0.getAccountNumber();
        account0.setIdentifier("");
        account0.setUniversityAccount(false);
        account0.setAccountType("Pending");
        java.lang.String str10 = account0.getEmail();
        account0.setAccountType("Unverified badge detected for Cancelled.");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState0 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext6 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState7 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str8 = cancelledBookingState7.getName();
        bookingContext6.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState7);
        completedBookingState0.handle(bookingContext6);
        java.lang.String str11 = completedBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation();
        reservation12.setFinalAmount((double) (byte) 100);
        java.lang.String str15 = reservation12.getRoomId();
        reservation12.setFinalAmount((double) 10.0f);
        java.lang.String str18 = reservation12.getUserId();
        double double19 = reservation12.getFinalAmount();
        reservation12.setReservationId("Pending");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext22 = new com.conferenceroomscheduler.patterns.BookingContext(reservation12);
        completedBookingState0.handle(bookingContext22);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState24 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState25 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation26 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext27 = new com.conferenceroomscheduler.patterns.BookingContext(reservation26);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState28 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext27.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState28);
        com.conferenceroomscheduler.patterns.BookingState bookingState30 = bookingContext27.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState31 = bookingContext27.getState();
        cancelledBookingState25.handle(bookingContext27);
        checkedInBookingState24.handle(bookingContext27);
        java.lang.String str34 = checkedInBookingState24.getName();
        com.conferenceroomscheduler.model.Reservation reservation35 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext36 = new com.conferenceroomscheduler.patterns.BookingContext(reservation35);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState37 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext36.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState37);
        com.conferenceroomscheduler.model.Reservation reservation39 = bookingContext36.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation40 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext41 = new com.conferenceroomscheduler.patterns.BookingContext(reservation40);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState42 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext41.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState42);
        com.conferenceroomscheduler.patterns.BookingState bookingState44 = bookingContext41.getState();
        bookingContext36.setState(bookingState44);
        checkedInBookingState24.handle(bookingContext36);
        java.lang.String str47 = checkedInBookingState24.getName();
        bookingContext22.setState((com.conferenceroomscheduler.patterns.BookingState) checkedInBookingState24);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking complete" + "'", str11, "Booking complete");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(bookingState30);
        org.junit.Assert.assertNotNull(bookingState31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Checked in." + "'", str34, "Checked in.");
        org.junit.Assert.assertNull(reservation39);
        org.junit.Assert.assertNotNull(bookingState44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Checked in." + "'", str47, "Checked in.");
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        room6.setCapacity((int) '4');
        room6.setBuilding("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = null;
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime5, localDateTime6, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod11);
        reservation12.setDepositLost(true);
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand16 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation12, localDateTime15);
        java.lang.String str17 = reservation12.getUserId();
        reservation12.setFinalAmount((double) 0);
        reservation12.setHourlyRate(1.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cancelled" + "'", str17, "Cancelled");
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) '4');
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("Cancelled", 1.0d);
        boolean boolean9 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) (-1.0f));
        boolean boolean12 = debitCardPaymentStrategy0.processPayment("faculty", (double) (-1L));
        boolean boolean15 = debitCardPaymentStrategy0.processPayment("Booking complete", (double) 1L);
        boolean boolean18 = debitCardPaymentStrategy0.processPayment("ADMIN-69", (double) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod10 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation11 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime4, localDateTime5, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod10);
        reservation11.setDepositLost(false);
        reservation11.setDepositAmount((-1.0d));
        reservation11.setCanceled(false);
        org.junit.Assert.assertTrue("'" + paymentMethod10 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod10.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount0 = new com.conferenceroomscheduler.model.PartnerAccount();
        java.lang.String str1 = partnerAccount0.getAccountNumber();
        java.lang.String str2 = partnerAccount0.getPassword();
        partnerAccount0.setAccountNumber("");
        boolean boolean5 = partnerAccount0.isUniversityAccount();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Pending", (int) (byte) 1, true, "hi!", "Pending");
        room6.setRoomNumber("Booking complete");
        room6.setName("Checked in.");
        boolean boolean11 = room6.isEnabled();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor15 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean16 = occupancySensor15.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher17 = null;
        occupancySensor15.subject = checkInPublisher17;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher19 = occupancySensor15.getSubject();
        room6.setOccupancySensor(occupancySensor15);
        occupancySensor15.setDetected(false);
        occupancySensor15.setRoomId("faculty");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor28 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor28.isDetected = false;
        occupancySensor28.roomId = "hi!";
        occupancySensor28.isDetected = false;
        boolean boolean35 = occupancySensor28.isDetected;
        occupancySensor28.setRoomId("partner");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor41 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount48 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean49 = occupancySensor41.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount48);
        com.conferenceroomscheduler.model.Badge badge50 = studentAccount48.getBadge();
        badge50.setEmail("Pending");
        boolean boolean53 = occupancySensor28.scanIdBadge(badge50);
        badge50.setAccountId("Booking complete");
        boolean boolean56 = occupancySensor15.scanIdBadge(badge50);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(checkInPublisher19);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(badge50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod6 = reservation1.getPaymentMethod();
        java.time.LocalDateTime localDateTime7 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand8 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime7);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext9 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        org.junit.Assert.assertNull(paymentMethod6);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getName();
        room6.setCapacity((int) '4');
        java.lang.String str15 = room6.getName();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher16 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor20 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher21 = null;
        occupancySensor20.setSubject(checkInPublisher21);
        occupancySensor20.occupied = true;
        occupancySensor20.setDetected(false);
        checkInPublisher16.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor20);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor31 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor31.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount40 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount40.setEmail("");
        boolean boolean43 = occupancySensor31.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount40);
        checkInPublisher16.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor31);
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory45 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account53 = facultyFactory45.createAccount("", "Cancelled", "", "hi!", false, false, "");
        account53.setAccountNumber("hi!");
        account53.setUniversityAccount(true);
        account53.setAccountType("Cancelled");
        checkInPublisher16.notifyObservers(account53);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor64 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, true);
        boolean boolean65 = occupancySensor64.isOccupied();
        checkInPublisher16.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor64);
        room6.setOccupancySensor(occupancySensor64);
        boolean boolean68 = occupancySensor64.isDetected;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cancelled" + "'", str12, "Cancelled");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cancelled" + "'", str15, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(account53);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Verified badge detected for Checked in..", "Unverified badge detected for .", true);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = null;
        occupancySensor3.setSubject(checkInPublisher12);
        occupancySensor3.isDetected = false;
        boolean boolean16 = occupancySensor3.isOccupied();
        com.conferenceroomscheduler.model.Badge badge20 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str21 = badge20.getEmail();
        boolean boolean22 = occupancySensor3.scanIdBadge(badge20);
        occupancySensor3.setRoomId("");
        java.lang.String str25 = occupancySensor3.getLastEvent();
        occupancySensor3.isDetected = true;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unverified badge detected for Cancelled." + "'", str25, "Unverified badge detected for Cancelled.");
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        com.conferenceroomscheduler.model.Reservation reservation0 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext1 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState2 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext1.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState2);
        java.lang.String str4 = cancelledBookingState2.getName();
        java.lang.String str5 = cancelledBookingState2.getName();
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState6 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str7 = confirmedBookingState6.getName();
        java.lang.String str8 = confirmedBookingState6.getName();
        java.lang.String str9 = confirmedBookingState6.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState10 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState11 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation12 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext13 = new com.conferenceroomscheduler.patterns.BookingContext(reservation12);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState14 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext13.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState14);
        com.conferenceroomscheduler.patterns.BookingState bookingState16 = bookingContext13.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState17 = bookingContext13.getState();
        cancelledBookingState11.handle(bookingContext13);
        checkedInBookingState10.handle(bookingContext13);
        java.lang.String str20 = checkedInBookingState10.getName();
        com.conferenceroomscheduler.model.Reservation reservation21 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext22 = new com.conferenceroomscheduler.patterns.BookingContext(reservation21);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState23 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext22.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState23);
        com.conferenceroomscheduler.model.Reservation reservation25 = bookingContext22.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation26 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext27 = new com.conferenceroomscheduler.patterns.BookingContext(reservation26);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState28 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext27.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState28);
        com.conferenceroomscheduler.patterns.BookingState bookingState30 = bookingContext27.getState();
        bookingContext22.setState(bookingState30);
        checkedInBookingState10.handle(bookingContext22);
        com.conferenceroomscheduler.model.Reservation reservation33 = bookingContext22.getReservation();
        confirmedBookingState6.handle(bookingContext22);
        java.lang.String str35 = confirmedBookingState6.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState36 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState37 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation38 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext39 = new com.conferenceroomscheduler.patterns.BookingContext(reservation38);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState40 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext39.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState40);
        com.conferenceroomscheduler.patterns.BookingState bookingState42 = bookingContext39.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState43 = bookingContext39.getState();
        cancelledBookingState37.handle(bookingContext39);
        checkedInBookingState36.handle(bookingContext39);
        com.conferenceroomscheduler.model.Reservation reservation46 = new com.conferenceroomscheduler.model.Reservation();
        reservation46.setFinalAmount((double) (byte) 100);
        reservation46.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext51 = new com.conferenceroomscheduler.patterns.BookingContext(reservation46);
        checkedInBookingState36.handle(bookingContext51);
        confirmedBookingState6.handle(bookingContext51);
        cancelledBookingState2.handle(bookingContext51);
        java.lang.String str55 = cancelledBookingState2.getName();
        java.lang.String str56 = cancelledBookingState2.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cancelled" + "'", str4, "Cancelled");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cancelled" + "'", str5, "Cancelled");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking confirmed." + "'", str7, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking confirmed." + "'", str8, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking confirmed." + "'", str9, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertNotNull(bookingState17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Checked in." + "'", str20, "Checked in.");
        org.junit.Assert.assertNull(reservation25);
        org.junit.Assert.assertNotNull(bookingState30);
        org.junit.Assert.assertNull(reservation33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Booking confirmed." + "'", str35, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState42);
        org.junit.Assert.assertNotNull(bookingState43);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Cancelled" + "'", str55, "Cancelled");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Cancelled" + "'", str56, "Cancelled");
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod12 = null;
        com.conferenceroomscheduler.model.Reservation reservation13 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime6, localDateTime7, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod12);
        reservation13.setDepositLost(true);
        java.time.LocalDateTime localDateTime16 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand17 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService1, reservation13, localDateTime16);
        reservation13.setHourlyRate((double) (-1.0f));
        boolean boolean20 = reservation13.isDepositLost();
        java.lang.String str21 = reservation13.getReservationId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand22 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation13);
        // The following exception was thrown during execution in test generation
        try {
            createBookingCommand22.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.addReservation(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        boolean boolean19 = room6.isEnabled();
        boolean boolean20 = room6.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState0 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext2 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState3 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext2.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState3);
        com.conferenceroomscheduler.patterns.BookingState bookingState5 = bookingContext2.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState6 = bookingContext2.getState();
        cancelledBookingState0.handle(bookingContext2);
        java.lang.String str8 = cancelledBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation9 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext10 = new com.conferenceroomscheduler.patterns.BookingContext(reservation9);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState11 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext10.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState11);
        com.conferenceroomscheduler.model.Reservation reservation13 = bookingContext10.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation14 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext15 = new com.conferenceroomscheduler.patterns.BookingContext(reservation14);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState16 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext15.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState16);
        com.conferenceroomscheduler.patterns.BookingState bookingState18 = bookingContext15.getState();
        bookingContext10.setState(bookingState18);
        cancelledBookingState0.handle(bookingContext10);
        com.conferenceroomscheduler.model.Reservation reservation21 = new com.conferenceroomscheduler.model.Reservation();
        reservation21.setFinalAmount((double) (byte) 100);
        reservation21.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext26 = new com.conferenceroomscheduler.patterns.BookingContext(reservation21);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState27 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str28 = cancelledBookingState27.getName();
        bookingContext26.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState27);
        com.conferenceroomscheduler.model.Reservation reservation30 = bookingContext26.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation31 = bookingContext26.getReservation();
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState32 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str33 = confirmedBookingState32.getName();
        bookingContext26.setState((com.conferenceroomscheduler.patterns.BookingState) confirmedBookingState32);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState35 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation36 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext37 = new com.conferenceroomscheduler.patterns.BookingContext(reservation36);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState38 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext37.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState38);
        com.conferenceroomscheduler.patterns.BookingState bookingState40 = bookingContext37.getState();
        com.conferenceroomscheduler.model.Reservation reservation41 = bookingContext37.getReservation();
        cancelledBookingState35.handle(bookingContext37);
        java.lang.String str43 = cancelledBookingState35.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState44 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState45 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation46 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext47 = new com.conferenceroomscheduler.patterns.BookingContext(reservation46);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState48 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext47.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState48);
        com.conferenceroomscheduler.patterns.BookingState bookingState50 = bookingContext47.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState51 = bookingContext47.getState();
        cancelledBookingState45.handle(bookingContext47);
        checkedInBookingState44.handle(bookingContext47);
        com.conferenceroomscheduler.model.Reservation reservation54 = new com.conferenceroomscheduler.model.Reservation();
        reservation54.setFinalAmount((double) (byte) 100);
        reservation54.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext59 = new com.conferenceroomscheduler.patterns.BookingContext(reservation54);
        checkedInBookingState44.handle(bookingContext59);
        com.conferenceroomscheduler.model.Reservation reservation61 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext62 = new com.conferenceroomscheduler.patterns.BookingContext(reservation61);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState63 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext62.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState63);
        checkedInBookingState44.handle(bookingContext62);
        com.conferenceroomscheduler.model.Reservation reservation66 = new com.conferenceroomscheduler.model.Reservation();
        reservation66.setFinalAmount((double) (byte) 100);
        java.lang.String str69 = reservation66.getRoomId();
        reservation66.setFinalAmount((double) 10.0f);
        java.lang.String str72 = reservation66.getUserId();
        reservation66.setFinalAmount((double) ' ');
        java.lang.String str75 = reservation66.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext76 = new com.conferenceroomscheduler.patterns.BookingContext(reservation66);
        bookingContext76.request();
        java.lang.String str78 = bookingContext76.getStatus();
        checkedInBookingState44.handle(bookingContext76);
        cancelledBookingState35.handle(bookingContext76);
        com.conferenceroomscheduler.patterns.BookingState bookingState81 = bookingContext76.getState();
        confirmedBookingState32.handle(bookingContext76);
        cancelledBookingState0.handle(bookingContext76);
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNull(reservation13);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Cancelled" + "'", str28, "Cancelled");
        org.junit.Assert.assertNotNull(reservation30);
        org.junit.Assert.assertNotNull(reservation31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Booking confirmed." + "'", str33, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState40);
        org.junit.Assert.assertNull(reservation41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Cancelled" + "'", str43, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState50);
        org.junit.Assert.assertNotNull(bookingState51);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Pending" + "'", str78, "Pending");
        org.junit.Assert.assertNotNull(bookingState81);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor7 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean8 = occupancySensor7.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher9 = null;
        occupancySensor7.subject = checkInPublisher9;
        occupancySensor7.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher13 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor17 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher18 = null;
        occupancySensor17.setSubject(checkInPublisher18);
        occupancySensor17.occupied = true;
        occupancySensor17.setDetected(false);
        checkInPublisher13.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor17);
        occupancySensor7.setSubject(checkInPublisher13);
        occupancySensor3.setSubject(checkInPublisher13);
        com.conferenceroomscheduler.model.Badge badge30 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str31 = badge30.getAccountId();
        boolean boolean32 = occupancySensor3.scanIdBadge(badge30);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher33 = null;
        occupancySensor3.subject = checkInPublisher33;
        boolean boolean35 = occupancySensor3.occupied;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Booking confirmed." + "'", str31, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Pending", (int) (byte) 1, true, "hi!", "Pending");
        room6.setRoomNumber("Booking complete");
        room6.setName("Checked in.");
        boolean boolean11 = room6.isEnabled();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor15 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean16 = occupancySensor15.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher17 = null;
        occupancySensor15.subject = checkInPublisher17;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher19 = occupancySensor15.getSubject();
        room6.setOccupancySensor(occupancySensor15);
        occupancySensor15.setDetected(false);
        occupancySensor15.setDetected(true);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher25 = occupancySensor15.getSubject();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(checkInPublisher19);
        org.junit.Assert.assertNull(checkInPublisher25);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        com.conferenceroomscheduler.model.Badge badge7 = studentAccount6.getBadge();
        java.lang.String str8 = badge7.getEmail();
        java.lang.String str9 = badge7.getEmail();
        badge7.setEmail("faculty");
        badge7.setAccountId("partner");
        badge7.setAccountId("");
        org.junit.Assert.assertNotNull(badge7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher18 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor22 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean23 = occupancySensor22.isDetected();
        occupancySensor22.occupied = false;
        checkInPublisher18.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor22);
        room6.setOccupancySensor(occupancySensor22);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher28 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor32 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean33 = occupancySensor32.isDetected();
        occupancySensor32.occupied = false;
        checkInPublisher28.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor32);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher37 = occupancySensor32.subject;
        occupancySensor22.subject = checkInPublisher37;
        com.conferenceroomscheduler.model.AdminAccount adminAccount39 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str40 = adminAccount39.getEmail();
        com.conferenceroomscheduler.model.Badge badge41 = adminAccount39.getBadge();
        boolean boolean42 = adminAccount39.isUniversityAccount();
        boolean boolean43 = adminAccount39.isUniversityAccount();
        checkInPublisher37.notifyObservers((com.conferenceroomscheduler.model.Account) adminAccount39);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor48 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean49 = occupancySensor48.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher50 = null;
        occupancySensor48.subject = checkInPublisher50;
        occupancySensor48.occupied = false;
        java.lang.String str54 = occupancySensor48.roomId;
        checkInPublisher37.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor48);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor59 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount66 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean67 = occupancySensor59.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount66);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher68 = null;
        occupancySensor59.setSubject(checkInPublisher68);
        occupancySensor59.isDetected = false;
        boolean boolean72 = occupancySensor59.isOccupied();
        com.conferenceroomscheduler.model.Badge badge76 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str77 = badge76.getEmail();
        boolean boolean78 = occupancySensor59.scanIdBadge(badge76);
        occupancySensor59.roomId = "hi!";
        occupancySensor59.setOccupied(false);
        checkInPublisher37.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor59);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(checkInPublisher37);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(badge41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Pending" + "'", str54, "Pending");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Cancelled" + "'", str77, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.isDetected;
        com.conferenceroomscheduler.model.Badge badge10 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        boolean boolean11 = occupancySensor3.scanIdBadge(badge10);
        occupancySensor3.setRoomId("");
        java.lang.String str14 = occupancySensor3.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("Pending", "admin", "Booking complete", false, true, "");
        staffAccount6.setAccountNumber("Booking confirmed.");
        java.lang.String str9 = staffAccount6.getAccountNumber();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking confirmed." + "'", str9, "Booking confirmed.");
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState0 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState1 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation2 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext3 = new com.conferenceroomscheduler.patterns.BookingContext(reservation2);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState4 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext3.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState4);
        com.conferenceroomscheduler.patterns.BookingState bookingState6 = bookingContext3.getState();
        com.conferenceroomscheduler.model.Reservation reservation7 = bookingContext3.getReservation();
        cancelledBookingState1.handle(bookingContext3);
        checkedInBookingState0.handle(bookingContext3);
        bookingContext3.request();
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState11 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str12 = confirmedBookingState11.getName();
        java.lang.String str13 = confirmedBookingState11.getName();
        com.conferenceroomscheduler.model.Reservation reservation14 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext15 = new com.conferenceroomscheduler.patterns.BookingContext(reservation14);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState16 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext15.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState16);
        com.conferenceroomscheduler.model.Reservation reservation18 = bookingContext15.getReservation();
        confirmedBookingState11.handle(bookingContext15);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState20 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState21 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation22 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext23 = new com.conferenceroomscheduler.patterns.BookingContext(reservation22);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState24 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext23.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState24);
        com.conferenceroomscheduler.patterns.BookingState bookingState26 = bookingContext23.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState27 = bookingContext23.getState();
        cancelledBookingState21.handle(bookingContext23);
        checkedInBookingState20.handle(bookingContext23);
        com.conferenceroomscheduler.model.Reservation reservation30 = new com.conferenceroomscheduler.model.Reservation();
        reservation30.setFinalAmount((double) (byte) 100);
        reservation30.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext35 = new com.conferenceroomscheduler.patterns.BookingContext(reservation30);
        checkedInBookingState20.handle(bookingContext35);
        com.conferenceroomscheduler.model.Reservation reservation37 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext38 = new com.conferenceroomscheduler.patterns.BookingContext(reservation37);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState39 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext38.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState39);
        checkedInBookingState20.handle(bookingContext38);
        confirmedBookingState11.handle(bookingContext38);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState43 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState44 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation45 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext46 = new com.conferenceroomscheduler.patterns.BookingContext(reservation45);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState47 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext46.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState47);
        com.conferenceroomscheduler.patterns.BookingState bookingState49 = bookingContext46.getState();
        com.conferenceroomscheduler.model.Reservation reservation50 = bookingContext46.getReservation();
        cancelledBookingState44.handle(bookingContext46);
        checkedInBookingState43.handle(bookingContext46);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState53 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState54 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation55 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext56 = new com.conferenceroomscheduler.patterns.BookingContext(reservation55);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState57 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext56.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState57);
        com.conferenceroomscheduler.patterns.BookingState bookingState59 = bookingContext56.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState60 = bookingContext56.getState();
        cancelledBookingState54.handle(bookingContext56);
        checkedInBookingState53.handle(bookingContext56);
        checkedInBookingState43.handle(bookingContext56);
        com.conferenceroomscheduler.model.Reservation reservation64 = bookingContext56.getReservation();
        confirmedBookingState11.handle(bookingContext56);
        bookingContext3.setState((com.conferenceroomscheduler.patterns.BookingState) confirmedBookingState11);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking confirmed." + "'", str12, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking confirmed." + "'", str13, "Booking confirmed.");
        org.junit.Assert.assertNull(reservation18);
        org.junit.Assert.assertNotNull(bookingState26);
        org.junit.Assert.assertNotNull(bookingState27);
        org.junit.Assert.assertNotNull(bookingState49);
        org.junit.Assert.assertNull(reservation50);
        org.junit.Assert.assertNotNull(bookingState59);
        org.junit.Assert.assertNotNull(bookingState60);
        org.junit.Assert.assertNull(reservation64);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        boolean boolean9 = occupancySensor4.isDetected;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher10 = occupancySensor4.subject;
        occupancySensor4.roomId = "hi!";
        java.lang.String str13 = occupancySensor4.getRoomId();
        com.conferenceroomscheduler.model.AdminAccount adminAccount14 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str15 = adminAccount14.getEmail();
        boolean boolean16 = adminAccount14.isUniversityAccount();
        adminAccount14.setVerified(true);
        boolean boolean19 = adminAccount14.isVerified();
        boolean boolean20 = adminAccount14.isUniversityAccount();
        boolean boolean21 = occupancySensor4.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount14);
        adminAccount14.setAccountType("ADMIN-69");
        adminAccount14.setEmail("Unverified badge detected for admin.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(checkInPublisher10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean9 = occupancySensor8.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher10 = null;
        occupancySensor8.subject = checkInPublisher10;
        occupancySensor8.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher14 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor18 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher19 = null;
        occupancySensor18.setSubject(checkInPublisher19);
        occupancySensor18.occupied = true;
        occupancySensor18.setDetected(false);
        checkInPublisher14.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor18);
        occupancySensor8.setSubject(checkInPublisher14);
        occupancySensor4.setSubject(checkInPublisher14);
        boolean boolean28 = occupancySensor4.isDetected;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        com.conferenceroomscheduler.model.StudentAccount studentAccount36 = new com.conferenceroomscheduler.model.StudentAccount("hi!", "Booking confirmed.", "Booking confirmed.", false, true, "Booking confirmed.");
        studentAccount36.setAccountId("Unverified badge detected for Cancelled.");
        studentAccount36.setAccountType("Booking confirmed.");
        checkInPublisher0.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount36);
        studentAccount36.setAccountType("admin");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        com.conferenceroomscheduler.patterns.StaffFactory staffFactory0 = new com.conferenceroomscheduler.patterns.StaffFactory();
        com.conferenceroomscheduler.model.Account account8 = staffFactory0.createAccount("Cancelled", "Checked in.", "", "Cancelled", true, true, "");
        com.conferenceroomscheduler.model.Account account16 = staffFactory0.createAccount("Booking complete", "Unverified badge detected for .", "Unverified badge detected for .", "Cancelled", false, false, "Unverified badge detected for .");
        com.conferenceroomscheduler.model.Account account24 = staffFactory0.createAccount("Unverified badge detected for admin.", "Unverified badge detected for admin.", "Booking complete", "Pending", true, true, "Booking complete");
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        boolean boolean9 = reservation0.isExtended();
        reservation0.setReservationId("admin");
        java.time.LocalDateTime localDateTime12 = reservation0.getEndTime();
        reservation0.setTitle("ADMIN-69");
        reservation0.setHourlyRate((double) '4');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor7 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean8 = occupancySensor7.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher9 = null;
        occupancySensor7.subject = checkInPublisher9;
        occupancySensor7.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher13 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor17 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher18 = null;
        occupancySensor17.setSubject(checkInPublisher18);
        occupancySensor17.occupied = true;
        occupancySensor17.setDetected(false);
        checkInPublisher13.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor17);
        occupancySensor7.setSubject(checkInPublisher13);
        occupancySensor3.setSubject(checkInPublisher13);
        com.conferenceroomscheduler.model.Badge badge30 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str31 = badge30.getAccountId();
        boolean boolean32 = occupancySensor3.scanIdBadge(badge30);
        occupancySensor3.setOccupied(false);
        occupancySensor3.roomId = "";
        boolean boolean37 = occupancySensor3.isDetected;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher38 = occupancySensor3.getSubject();
        occupancySensor3.isDetected = true;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Booking confirmed." + "'", str31, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(checkInPublisher38);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        reservation0.setExtended(true);
        reservation0.setFinalAmount((double) 97);
        reservation0.setCheckedIn(true);
        java.time.LocalDateTime localDateTime16 = null;
        reservation0.setEndTime(localDateTime16);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        com.conferenceroomscheduler.model.Reservation reservation0 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext1 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState2 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext1.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState2);
        com.conferenceroomscheduler.patterns.BookingState bookingState4 = bookingContext1.getState();
        com.conferenceroomscheduler.model.Reservation reservation5 = bookingContext1.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation6 = bookingContext1.getReservation();
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState7 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str8 = pendingBookingState7.getName();
        com.conferenceroomscheduler.model.Reservation reservation9 = new com.conferenceroomscheduler.model.Reservation();
        reservation9.setFinalAmount((double) (byte) 100);
        reservation9.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext14 = new com.conferenceroomscheduler.patterns.BookingContext(reservation9);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState15 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str16 = cancelledBookingState15.getName();
        bookingContext14.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState15);
        pendingBookingState7.handle(bookingContext14);
        java.lang.String str19 = pendingBookingState7.getName();
        java.lang.String str20 = pendingBookingState7.getName();
        com.conferenceroomscheduler.model.Reservation reservation21 = new com.conferenceroomscheduler.model.Reservation();
        reservation21.setFinalAmount((double) (byte) 100);
        java.lang.String str24 = reservation21.getRoomId();
        reservation21.setFinalAmount((double) 10.0f);
        java.lang.String str27 = reservation21.getUserId();
        reservation21.setFinalAmount((double) ' ');
        java.lang.String str30 = reservation21.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext31 = new com.conferenceroomscheduler.patterns.BookingContext(reservation21);
        bookingContext31.request();
        pendingBookingState7.handle(bookingContext31);
        java.lang.String str34 = pendingBookingState7.getName();
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService35 = null;
        com.conferenceroomscheduler.model.Reservation reservation36 = new com.conferenceroomscheduler.model.Reservation();
        reservation36.setFinalAmount((double) (byte) 100);
        java.lang.String str39 = reservation36.getRoomId();
        reservation36.setFinalAmount((double) 10.0f);
        java.lang.String str42 = reservation36.getUserId();
        reservation36.setDepositAmount((double) (byte) 0);
        double double45 = reservation36.getHourlyRate();
        reservation36.setDepositLost(true);
        java.lang.String str48 = reservation36.getReservationId();
        reservation36.setRoomId("Unverified badge detected for Cancelled.");
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand53 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService35, reservation36, localDateTime51, localDateTime52);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext54 = new com.conferenceroomscheduler.patterns.BookingContext(reservation36);
        pendingBookingState7.handle(bookingContext54);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState56 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState57 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState58 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation59 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext60 = new com.conferenceroomscheduler.patterns.BookingContext(reservation59);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState61 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext60.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState61);
        com.conferenceroomscheduler.patterns.BookingState bookingState63 = bookingContext60.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState64 = bookingContext60.getState();
        cancelledBookingState58.handle(bookingContext60);
        checkedInBookingState57.handle(bookingContext60);
        com.conferenceroomscheduler.model.Reservation reservation67 = new com.conferenceroomscheduler.model.Reservation();
        reservation67.setFinalAmount((double) (byte) 100);
        reservation67.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext72 = new com.conferenceroomscheduler.patterns.BookingContext(reservation67);
        checkedInBookingState57.handle(bookingContext72);
        cancelledBookingState56.handle(bookingContext72);
        com.conferenceroomscheduler.patterns.BookingState bookingState75 = null;
        bookingContext72.setState(bookingState75);
        com.conferenceroomscheduler.model.Reservation reservation77 = bookingContext72.getReservation();
        pendingBookingState7.handle(bookingContext72);
        java.lang.String str79 = pendingBookingState7.getName();
        bookingContext1.setState((com.conferenceroomscheduler.patterns.BookingState) pendingBookingState7);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState81 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState82 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation83 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext84 = new com.conferenceroomscheduler.patterns.BookingContext(reservation83);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState85 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext84.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState85);
        com.conferenceroomscheduler.patterns.BookingState bookingState87 = bookingContext84.getState();
        com.conferenceroomscheduler.model.Reservation reservation88 = bookingContext84.getReservation();
        cancelledBookingState82.handle(bookingContext84);
        checkedInBookingState81.handle(bookingContext84);
        bookingContext84.request();
        com.conferenceroomscheduler.patterns.BookingState bookingState92 = bookingContext84.getState();
        // The following exception was thrown during execution in test generation
        try {
            pendingBookingState7.handle(bookingContext84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.model.Reservation.getDepositAmount()\" because the return value of \"com.conferenceroomscheduler.patterns.BookingContext.getReservation()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState4);
        org.junit.Assert.assertNull(reservation5);
        org.junit.Assert.assertNull(reservation6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Pending" + "'", str8, "Pending");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cancelled" + "'", str16, "Cancelled");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Pending" + "'", str19, "Pending");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Pending" + "'", str20, "Pending");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Pending" + "'", str34, "Pending");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(bookingState63);
        org.junit.Assert.assertNotNull(bookingState64);
        org.junit.Assert.assertNotNull(reservation77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Pending" + "'", str79, "Pending");
        org.junit.Assert.assertNotNull(bookingState87);
        org.junit.Assert.assertNull(reservation88);
        org.junit.Assert.assertNotNull(bookingState92);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod30 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation31 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "hi!", "Booking complete", "Checked in.", localDateTime24, localDateTime25, "hi!", (double) 97, (double) 100L, (double) (byte) 100, paymentMethod30);
        com.conferenceroomscheduler.model.Reservation reservation32 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "", "ADMIN-69", "Booking complete", localDateTime14, localDateTime15, "Booking complete", 0.0d, (double) 100, (double) (short) 0, paymentMethod30);
        com.conferenceroomscheduler.model.Reservation reservation33 = new com.conferenceroomscheduler.model.Reservation("student", "Cancelled", "", "Unverified badge detected for .", localDateTime4, localDateTime5, "", (-1.0d), 0.0d, (double) (-1.0f), paymentMethod30);
        reservation33.setRoomId("Cancelled");
        org.junit.Assert.assertTrue("'" + paymentMethod30 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod30.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation("", "hi!", "hi!", "Pending", localDateTime5, localDateTime6, "Pending", 10.0d, 0.0d, (double) 100, paymentMethod11);
        java.time.LocalDateTime localDateTime13 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand14 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation12, localDateTime13);
        reservation12.setTitle("faculty");
        boolean boolean17 = reservation12.isCheckedIn();
        reservation12.setExtended(false);
        org.junit.Assert.assertTrue("'" + paymentMethod11 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod11.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Booking complete", "Cancelled", (int) (short) 1, "Booking complete", "");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("ADMIN-69", "Pending", 10, "hi!", "");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("student", "", (int) (byte) 10, "Unverified badge detected for Cancelled.", "Booking confirmed.");
        room24.setRoomId("Booking confirmed.");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount0.setAccountNumber("hi!");
        java.lang.String str3 = adminAccount0.getAccountId();
        adminAccount0.setAccountType("Booking complete");
        adminAccount0.setAccountId("Cancelled");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        double double7 = reservation0.getFinalAmount();
        reservation0.setCanceled(false);
        reservation0.setDepositLost(false);
        java.lang.String str12 = reservation0.getAccountType();
        reservation0.setRoomId("Booking confirmed.");
        java.lang.String str15 = reservation0.getAccountType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        occupancySensor3.setSubject(checkInPublisher4);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher6 = occupancySensor3.subject;
        org.junit.Assert.assertNotNull(checkInPublisher6);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean4 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor3.subject = checkInPublisher5;
        occupancySensor3.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher9 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher14 = null;
        occupancySensor13.setSubject(checkInPublisher14);
        occupancySensor13.occupied = true;
        occupancySensor13.setDetected(false);
        checkInPublisher9.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor13);
        occupancySensor3.setSubject(checkInPublisher9);
        boolean boolean22 = occupancySensor3.occupied;
        com.conferenceroomscheduler.model.AdminAccount adminAccount23 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str24 = adminAccount23.getEmail();
        boolean boolean25 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount23);
        boolean boolean26 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory27 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account35 = facultyFactory27.createAccount("", "Cancelled", "", "hi!", false, false, "");
        account35.setAccountNumber("hi!");
        java.lang.String str38 = account35.getAccountId();
        java.lang.String str39 = account35.getAccountId();
        java.lang.String str40 = account35.getAccountNumber();
        boolean boolean41 = occupancySensor3.detectOccupancy(account35);
        account35.setEmail("Verified badge detected for Checked in..");
        account35.setEmail("Booking complete");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(account35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        java.lang.String str8 = room6.getBuilding();
        com.conferenceroomscheduler.model.StudentAccount studentAccount15 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        studentAccount15.setUniversityAccount(false);
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount15);
        room6.setName("hi!");
        java.lang.String str21 = room6.getRoomId();
        java.lang.String str22 = room6.getRoomId();
        room6.setRoomId("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        com.conferenceroomscheduler.patterns.PartnerFactory partnerFactory0 = new com.conferenceroomscheduler.patterns.PartnerFactory();
        com.conferenceroomscheduler.model.Account account8 = partnerFactory0.createAccount("Checked in.", "hi!", "admin", "", true, false, "Pending");
        com.conferenceroomscheduler.model.Account account16 = partnerFactory0.createAccount("Booking complete", "hi!", "hi!", "", true, false, "Checked in.");
        com.conferenceroomscheduler.model.Account account24 = partnerFactory0.createAccount("Booking complete", "ADMIN-69", "Pending", "Checked in.", true, true, "");
        com.conferenceroomscheduler.model.Account account32 = partnerFactory0.createAccount("partner", "faculty", "student", "ADMIN-69", false, false, "Booking complete");
        com.conferenceroomscheduler.model.Account account40 = partnerFactory0.createAccount("admin", "Pending", "student", "Unverified badge detected for .", true, false, "hi!");
        boolean boolean41 = account40.isVerified();
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
        org.junit.Assert.assertNotNull(account32);
        org.junit.Assert.assertNotNull(account40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        com.conferenceroomscheduler.patterns.StaffFactory staffFactory0 = new com.conferenceroomscheduler.patterns.StaffFactory();
        com.conferenceroomscheduler.model.Account account8 = staffFactory0.createAccount("Unverified badge detected for .", "hi!", "student", "Unverified badge detected for .", false, true, "Cancelled");
        account8.setEmail("Cancelled");
        account8.setUniversityAccount(false);
        org.junit.Assert.assertNotNull(account8);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("hi!", "staff", "ADMIN-69", "Booking complete", true, true, "partner");
        account7.setIdentifier("");
        account7.setAccountNumber("Unverified badge detected for .");
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Verified badge detected for ADMIN-69.", "Booking confirmed.", 0, true, "Verified badge detected for ADMIN-69.", "hi!");
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState0 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        java.lang.String str1 = completedBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation2 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext3 = new com.conferenceroomscheduler.patterns.BookingContext(reservation2);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState4 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext3.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState4);
        java.lang.String str6 = cancelledBookingState4.getName();
        java.lang.String str7 = cancelledBookingState4.getName();
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState8 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str9 = confirmedBookingState8.getName();
        java.lang.String str10 = confirmedBookingState8.getName();
        java.lang.String str11 = confirmedBookingState8.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState12 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState13 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation14 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext15 = new com.conferenceroomscheduler.patterns.BookingContext(reservation14);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState16 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext15.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState16);
        com.conferenceroomscheduler.patterns.BookingState bookingState18 = bookingContext15.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState19 = bookingContext15.getState();
        cancelledBookingState13.handle(bookingContext15);
        checkedInBookingState12.handle(bookingContext15);
        java.lang.String str22 = checkedInBookingState12.getName();
        com.conferenceroomscheduler.model.Reservation reservation23 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext24 = new com.conferenceroomscheduler.patterns.BookingContext(reservation23);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState25 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext24.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState25);
        com.conferenceroomscheduler.model.Reservation reservation27 = bookingContext24.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation28 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext29 = new com.conferenceroomscheduler.patterns.BookingContext(reservation28);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState30 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext29.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState30);
        com.conferenceroomscheduler.patterns.BookingState bookingState32 = bookingContext29.getState();
        bookingContext24.setState(bookingState32);
        checkedInBookingState12.handle(bookingContext24);
        com.conferenceroomscheduler.model.Reservation reservation35 = bookingContext24.getReservation();
        confirmedBookingState8.handle(bookingContext24);
        java.lang.String str37 = confirmedBookingState8.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState38 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState39 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation40 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext41 = new com.conferenceroomscheduler.patterns.BookingContext(reservation40);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState42 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext41.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState42);
        com.conferenceroomscheduler.patterns.BookingState bookingState44 = bookingContext41.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState45 = bookingContext41.getState();
        cancelledBookingState39.handle(bookingContext41);
        checkedInBookingState38.handle(bookingContext41);
        com.conferenceroomscheduler.model.Reservation reservation48 = new com.conferenceroomscheduler.model.Reservation();
        reservation48.setFinalAmount((double) (byte) 100);
        reservation48.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext53 = new com.conferenceroomscheduler.patterns.BookingContext(reservation48);
        checkedInBookingState38.handle(bookingContext53);
        confirmedBookingState8.handle(bookingContext53);
        cancelledBookingState4.handle(bookingContext53);
        completedBookingState0.handle(bookingContext53);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState58 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation59 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext60 = new com.conferenceroomscheduler.patterns.BookingContext(reservation59);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState61 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext60.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState61);
        com.conferenceroomscheduler.patterns.BookingState bookingState63 = bookingContext60.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState64 = bookingContext60.getState();
        cancelledBookingState58.handle(bookingContext60);
        java.lang.String str66 = bookingContext60.getStatus();
        com.conferenceroomscheduler.patterns.BookingState bookingState67 = null;
        bookingContext60.setState(bookingState67);
        completedBookingState0.handle(bookingContext60);
        java.lang.String str70 = completedBookingState0.getName();
        java.lang.String str71 = completedBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking complete" + "'", str1, "Booking complete");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cancelled" + "'", str6, "Cancelled");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cancelled" + "'", str7, "Cancelled");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking confirmed." + "'", str9, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking confirmed." + "'", str10, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking confirmed." + "'", str11, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertNotNull(bookingState19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Checked in." + "'", str22, "Checked in.");
        org.junit.Assert.assertNull(reservation27);
        org.junit.Assert.assertNotNull(bookingState32);
        org.junit.Assert.assertNull(reservation35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Booking confirmed." + "'", str37, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState44);
        org.junit.Assert.assertNotNull(bookingState45);
        org.junit.Assert.assertNotNull(bookingState63);
        org.junit.Assert.assertNotNull(bookingState64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Cancelled" + "'", str66, "Cancelled");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Booking complete" + "'", str70, "Booking complete");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Booking complete" + "'", str71, "Booking complete");
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        java.lang.String str18 = room6.getRoomId();
        java.lang.String str19 = room6.getName();
        room6.setRoomNumber("Verified badge detected for Checked in..");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Cancelled" + "'", str19, "Cancelled");
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        reservation1.setFinalAmount((double) ' ');
        java.lang.String str10 = reservation1.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext11 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        reservation1.setDepositLost(true);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand16 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime14, localDateTime15);
        reservation1.setDepositAmount((double) 97);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("Verified badge detected for ADMIN-69.", "admin", "student", false, true, "Verified badge detected for Checked in..");
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState0 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str1 = confirmedBookingState0.getName();
        java.lang.String str2 = confirmedBookingState0.getName();
        java.lang.String str3 = confirmedBookingState0.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState4 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState5 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation6 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext7 = new com.conferenceroomscheduler.patterns.BookingContext(reservation6);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState8 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext7.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState8);
        com.conferenceroomscheduler.patterns.BookingState bookingState10 = bookingContext7.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState11 = bookingContext7.getState();
        cancelledBookingState5.handle(bookingContext7);
        checkedInBookingState4.handle(bookingContext7);
        java.lang.String str14 = checkedInBookingState4.getName();
        com.conferenceroomscheduler.model.Reservation reservation15 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext16 = new com.conferenceroomscheduler.patterns.BookingContext(reservation15);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState17 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext16.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState17);
        com.conferenceroomscheduler.model.Reservation reservation19 = bookingContext16.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation20 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext21 = new com.conferenceroomscheduler.patterns.BookingContext(reservation20);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState22 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext21.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState22);
        com.conferenceroomscheduler.patterns.BookingState bookingState24 = bookingContext21.getState();
        bookingContext16.setState(bookingState24);
        checkedInBookingState4.handle(bookingContext16);
        com.conferenceroomscheduler.model.Reservation reservation27 = bookingContext16.getReservation();
        confirmedBookingState0.handle(bookingContext16);
        java.lang.String str29 = confirmedBookingState0.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState30 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState31 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation32 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext33 = new com.conferenceroomscheduler.patterns.BookingContext(reservation32);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState34 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext33.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState34);
        com.conferenceroomscheduler.patterns.BookingState bookingState36 = bookingContext33.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState37 = bookingContext33.getState();
        cancelledBookingState31.handle(bookingContext33);
        checkedInBookingState30.handle(bookingContext33);
        com.conferenceroomscheduler.model.Reservation reservation40 = new com.conferenceroomscheduler.model.Reservation();
        reservation40.setFinalAmount((double) (byte) 100);
        reservation40.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext45 = new com.conferenceroomscheduler.patterns.BookingContext(reservation40);
        checkedInBookingState30.handle(bookingContext45);
        confirmedBookingState0.handle(bookingContext45);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState48 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState49 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation50 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext51 = new com.conferenceroomscheduler.patterns.BookingContext(reservation50);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState52 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext51.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState52);
        com.conferenceroomscheduler.patterns.BookingState bookingState54 = bookingContext51.getState();
        com.conferenceroomscheduler.model.Reservation reservation55 = bookingContext51.getReservation();
        cancelledBookingState49.handle(bookingContext51);
        checkedInBookingState48.handle(bookingContext51);
        bookingContext51.request();
        com.conferenceroomscheduler.patterns.BookingState bookingState59 = bookingContext51.getState();
        com.conferenceroomscheduler.model.Reservation reservation60 = bookingContext51.getReservation();
        confirmedBookingState0.handle(bookingContext51);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState62 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState63 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation64 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext65 = new com.conferenceroomscheduler.patterns.BookingContext(reservation64);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState66 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext65.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState66);
        com.conferenceroomscheduler.patterns.BookingState bookingState68 = bookingContext65.getState();
        com.conferenceroomscheduler.model.Reservation reservation69 = bookingContext65.getReservation();
        cancelledBookingState63.handle(bookingContext65);
        checkedInBookingState62.handle(bookingContext65);
        bookingContext65.request();
        com.conferenceroomscheduler.patterns.BookingState bookingState73 = bookingContext65.getState();
        confirmedBookingState0.handle(bookingContext65);
        java.lang.String str75 = confirmedBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking confirmed." + "'", str1, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking confirmed." + "'", str2, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking confirmed." + "'", str3, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState10);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Checked in." + "'", str14, "Checked in.");
        org.junit.Assert.assertNull(reservation19);
        org.junit.Assert.assertNotNull(bookingState24);
        org.junit.Assert.assertNull(reservation27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Booking confirmed." + "'", str29, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState36);
        org.junit.Assert.assertNotNull(bookingState37);
        org.junit.Assert.assertNotNull(bookingState54);
        org.junit.Assert.assertNull(reservation55);
        org.junit.Assert.assertNotNull(bookingState59);
        org.junit.Assert.assertNull(reservation60);
        org.junit.Assert.assertNotNull(bookingState68);
        org.junit.Assert.assertNull(reservation69);
        org.junit.Assert.assertNotNull(bookingState73);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Booking confirmed." + "'", str75, "Booking confirmed.");
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod40 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation41 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime34, localDateTime35, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod40);
        com.conferenceroomscheduler.model.Reservation reservation42 = new com.conferenceroomscheduler.model.Reservation("", "Pending", "Pending", "Booking complete", localDateTime24, localDateTime25, "Booking confirmed.", (double) 0.0f, (double) 1, (double) (byte) 100, paymentMethod40);
        com.conferenceroomscheduler.model.Reservation reservation43 = new com.conferenceroomscheduler.model.Reservation("Pending", "Booking complete", "Cancelled", "hi!", localDateTime14, localDateTime15, "", (double) '4', (double) 100.0f, (double) ' ', paymentMethod40);
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod54 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation55 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "hi!", "Booking complete", "Checked in.", localDateTime48, localDateTime49, "hi!", (double) 97, (double) 100L, (double) (byte) 100, paymentMethod54);
        reservation43.setPaymentMethod(paymentMethod54);
        com.conferenceroomscheduler.model.Reservation reservation57 = new com.conferenceroomscheduler.model.Reservation("", "", "hi!", "Booking confirmed.", localDateTime4, localDateTime5, "student", (double) (byte) 1, 0.0d, (double) 0L, paymentMethod54);
        double double58 = reservation57.getFinalAmount();
        reservation57.setCheckedIn(true);
        org.junit.Assert.assertTrue("'" + paymentMethod40 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod40.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertTrue("'" + paymentMethod54 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod54.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService2 = null;
        com.conferenceroomscheduler.model.Reservation reservation3 = new com.conferenceroomscheduler.model.Reservation();
        reservation3.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod6 = reservation3.getPaymentMethod();
        reservation3.setFinalAmount((double) (byte) 1);
        java.lang.String str9 = reservation3.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand10 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService2, reservation3);
        reservation3.setHourlyRate((double) 0L);
        reservation3.setReservationId("Booking confirmed.");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand15 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation3);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand16 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation3);
        boolean boolean17 = cancelBookingCommand16.wasSuccessful();
        boolean boolean18 = cancelBookingCommand16.wasSuccessful();
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean4 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor3.subject = checkInPublisher5;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount17 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean18 = occupancySensor10.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount17);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor22 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor22.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount31 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount31.setEmail("");
        boolean boolean34 = occupancySensor22.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount31);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor38 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean39 = occupancySensor38.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher40 = null;
        occupancySensor38.subject = checkInPublisher40;
        occupancySensor38.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher44 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor48 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher49 = null;
        occupancySensor48.setSubject(checkInPublisher49);
        occupancySensor48.occupied = true;
        occupancySensor48.setDetected(false);
        checkInPublisher44.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor48);
        occupancySensor38.setSubject(checkInPublisher44);
        com.conferenceroomscheduler.model.StudentAccount studentAccount63 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        checkInPublisher44.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount63);
        occupancySensor22.subject = checkInPublisher44;
        occupancySensor10.subject = checkInPublisher44;
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount73 = new com.conferenceroomscheduler.model.PartnerAccount("hi!", "", "", true, true, "");
        checkInPublisher44.notifyObservers((com.conferenceroomscheduler.model.Account) partnerAccount73);
        partnerAccount73.setAccountType("Pending");
        boolean boolean77 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) partnerAccount73);
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount84 = new com.conferenceroomscheduler.model.PartnerAccount("Booking confirmed.", "hi!", "Pending", false, true, "Checked in.");
        java.lang.String str85 = partnerAccount84.getAccountNumber();
        java.lang.String str86 = partnerAccount84.getPassword();
        boolean boolean87 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) partnerAccount84);
        partnerAccount84.setAccountId("Cancelled");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Checked in." + "'", str85, "Checked in.");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Pending" + "'", str86, "Pending");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        java.lang.String str4 = reservation1.getUserId();
        boolean boolean5 = reservation1.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod6 = reservation1.getPaymentMethod();
        reservation1.setUserId("");
        reservation1.setDepositLost(false);
        java.lang.String str11 = reservation1.getReservationId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand12 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext13 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        reservation1.setCanceled(true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "Checked in.", true);
        badgeScan3.setBadgeId("Booking complete");
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod31 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation32 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime25, localDateTime26, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod31);
        com.conferenceroomscheduler.model.Reservation reservation33 = new com.conferenceroomscheduler.model.Reservation("", "Pending", "Pending", "Booking complete", localDateTime15, localDateTime16, "Booking confirmed.", (double) 0.0f, (double) 1, (double) (byte) 100, paymentMethod31);
        com.conferenceroomscheduler.model.Reservation reservation34 = new com.conferenceroomscheduler.model.Reservation("Pending", "Booking complete", "Cancelled", "hi!", localDateTime5, localDateTime6, "", (double) '4', (double) 100.0f, (double) ' ', paymentMethod31);
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod45 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation46 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "hi!", "Booking complete", "Checked in.", localDateTime39, localDateTime40, "hi!", (double) 97, (double) 100L, (double) (byte) 100, paymentMethod45);
        reservation34.setPaymentMethod(paymentMethod45);
        java.time.LocalDateTime localDateTime48 = null;
        reservation34.setEndTime(localDateTime48);
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand52 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation34, localDateTime50, localDateTime51);
        reservation34.setFinalAmount((double) 97);
        reservation34.setRoomId("hi!");
        boolean boolean57 = reservation34.isDepositLost();
        org.junit.Assert.assertTrue("'" + paymentMethod31 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod31.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertTrue("'" + paymentMethod45 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod45.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("student", "Booking confirmed.", true);
        java.lang.String str4 = badgeScan3.getBadgeId();
        java.lang.String str5 = badgeScan3.getBadgeId();
        java.lang.String str6 = badgeScan3.getBadgeId();
        boolean boolean7 = badgeScan3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", true, false);
        occupancySensor3.setDetected(true);
        occupancySensor3.setRoomId("student");
        java.lang.String str8 = occupancySensor3.roomId;
        com.conferenceroomscheduler.model.AdminAccount adminAccount9 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str10 = adminAccount9.getEmail();
        com.conferenceroomscheduler.model.Badge badge11 = adminAccount9.getBadge();
        com.conferenceroomscheduler.model.Badge badge12 = adminAccount9.getBadge();
        java.lang.String str13 = adminAccount9.getAccountId();
        java.lang.String str14 = adminAccount9.getAccountNumber();
        boolean boolean15 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount9);
        adminAccount9.setVerified(true);
        boolean boolean18 = adminAccount9.isUniversityAccount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(badge11);
        org.junit.Assert.assertNull(badge12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation2.getPaymentMethod();
        reservation2.setFinalAmount((double) (byte) 1);
        java.lang.String str8 = reservation2.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand9 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str10 = reservation2.getTitle();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand11 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation2);
        java.lang.String str12 = reservation2.getTitle();
        reservation2.setDepositLost(true);
        double double15 = reservation2.getFinalAmount();
        reservation2.setCanceled(false);
        reservation2.setAccountType("Booking complete");
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        java.lang.String str12 = occupancySensor3.roomId;
        boolean boolean13 = occupancySensor3.isDetected;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor17 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount24 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean25 = occupancySensor17.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount24);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher26 = null;
        occupancySensor17.setSubject(checkInPublisher26);
        occupancySensor17.isDetected = false;
        boolean boolean30 = occupancySensor17.isOccupied();
        com.conferenceroomscheduler.model.Badge badge34 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str35 = badge34.getEmail();
        boolean boolean36 = occupancySensor17.scanIdBadge(badge34);
        java.lang.String str37 = badge34.getAccountId();
        badge34.setAccountId("Cancelled");
        badge34.setAccountId("");
        badge34.setAccountId("");
        badge34.setAccountId("Checked in.");
        boolean boolean46 = occupancySensor3.scanIdBadge(badge34);
        badge34.setEmail("Booking confirmed.");
        boolean boolean49 = badge34.isVerified();
        java.lang.String str50 = badge34.getEmail();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pending" + "'", str12, "Pending");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Cancelled" + "'", str35, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Booking confirmed." + "'", str37, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Booking confirmed." + "'", str50, "Booking confirmed.");
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        boolean boolean9 = occupancySensor4.isDetected;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher10 = occupancySensor4.subject;
        occupancySensor4.roomId = "hi!";
        java.lang.String str13 = occupancySensor4.getRoomId();
        com.conferenceroomscheduler.model.AdminAccount adminAccount14 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str15 = adminAccount14.getEmail();
        boolean boolean16 = adminAccount14.isUniversityAccount();
        adminAccount14.setVerified(true);
        boolean boolean19 = adminAccount14.isVerified();
        boolean boolean20 = adminAccount14.isUniversityAccount();
        boolean boolean21 = occupancySensor4.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount14);
        adminAccount14.setAccountType("ADMIN-69");
        adminAccount14.setAccountId("Unverified badge detected for Cancelled.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(checkInPublisher10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("", "Booking confirmed.", "", false, false, "");
        adminAccount6.setAccountId("");
        java.lang.String str9 = adminAccount6.getAccountId();
        java.lang.String str10 = adminAccount6.getAccountId();
        boolean boolean11 = adminAccount6.isVerified();
        java.lang.String str12 = adminAccount6.getPassword();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState0 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState1 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation2 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext3 = new com.conferenceroomscheduler.patterns.BookingContext(reservation2);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState4 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext3.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState4);
        com.conferenceroomscheduler.patterns.BookingState bookingState6 = bookingContext3.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState7 = bookingContext3.getState();
        cancelledBookingState1.handle(bookingContext3);
        checkedInBookingState0.handle(bookingContext3);
        com.conferenceroomscheduler.model.Reservation reservation10 = new com.conferenceroomscheduler.model.Reservation();
        reservation10.setFinalAmount((double) (byte) 100);
        reservation10.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext15 = new com.conferenceroomscheduler.patterns.BookingContext(reservation10);
        checkedInBookingState0.handle(bookingContext15);
        com.conferenceroomscheduler.model.Reservation reservation17 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext18 = new com.conferenceroomscheduler.patterns.BookingContext(reservation17);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState19 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext18.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState19);
        checkedInBookingState0.handle(bookingContext18);
        com.conferenceroomscheduler.model.Reservation reservation22 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext23 = new com.conferenceroomscheduler.patterns.BookingContext(reservation22);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState24 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext23.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState24);
        com.conferenceroomscheduler.patterns.BookingState bookingState26 = bookingContext23.getState();
        com.conferenceroomscheduler.model.Reservation reservation27 = bookingContext23.getReservation();
        checkedInBookingState0.handle(bookingContext23);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState29 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState30 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation31 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext32 = new com.conferenceroomscheduler.patterns.BookingContext(reservation31);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState33 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext32.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState33);
        com.conferenceroomscheduler.patterns.BookingState bookingState35 = bookingContext32.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState36 = bookingContext32.getState();
        cancelledBookingState30.handle(bookingContext32);
        checkedInBookingState29.handle(bookingContext32);
        java.lang.String str39 = checkedInBookingState29.getName();
        com.conferenceroomscheduler.model.Reservation reservation40 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext41 = new com.conferenceroomscheduler.patterns.BookingContext(reservation40);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState42 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext41.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState42);
        com.conferenceroomscheduler.model.Reservation reservation44 = bookingContext41.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation45 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext46 = new com.conferenceroomscheduler.patterns.BookingContext(reservation45);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState47 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext46.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState47);
        com.conferenceroomscheduler.patterns.BookingState bookingState49 = bookingContext46.getState();
        bookingContext41.setState(bookingState49);
        checkedInBookingState29.handle(bookingContext41);
        java.lang.String str52 = checkedInBookingState29.getName();
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState53 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str54 = pendingBookingState53.getName();
        com.conferenceroomscheduler.model.Reservation reservation55 = new com.conferenceroomscheduler.model.Reservation();
        reservation55.setFinalAmount((double) (byte) 100);
        reservation55.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext60 = new com.conferenceroomscheduler.patterns.BookingContext(reservation55);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState61 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str62 = cancelledBookingState61.getName();
        bookingContext60.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState61);
        pendingBookingState53.handle(bookingContext60);
        java.lang.String str65 = bookingContext60.getStatus();
        checkedInBookingState29.handle(bookingContext60);
        checkedInBookingState0.handle(bookingContext60);
        com.conferenceroomscheduler.model.Reservation reservation68 = bookingContext60.getReservation();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertNotNull(bookingState26);
        org.junit.Assert.assertNull(reservation27);
        org.junit.Assert.assertNotNull(bookingState35);
        org.junit.Assert.assertNotNull(bookingState36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Checked in." + "'", str39, "Checked in.");
        org.junit.Assert.assertNull(reservation44);
        org.junit.Assert.assertNotNull(bookingState49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Checked in." + "'", str52, "Checked in.");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Pending" + "'", str54, "Pending");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Cancelled" + "'", str62, "Cancelled");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Cancelled" + "'", str65, "Cancelled");
        org.junit.Assert.assertNotNull(reservation68);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setHourlyRate((double) (byte) 100);
        boolean boolean4 = reservation1.isDepositLost();
        java.lang.String str5 = reservation1.getUserId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand6 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setTitle("Checked in.");
        reservation1.setUserId("Cancelled");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher9 = occupancySensor4.subject;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher10 = occupancySensor4.getSubject();
        com.conferenceroomscheduler.model.Account account18 = new com.conferenceroomscheduler.model.Account("student", "Booking complete", "", "faculty", false, true, "");
        account18.setVerified(false);
        checkInPublisher10.notifyObservers(account18);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(checkInPublisher9);
        org.junit.Assert.assertNotNull(checkInPublisher10);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState0 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState1 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation2 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext3 = new com.conferenceroomscheduler.patterns.BookingContext(reservation2);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState4 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext3.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState4);
        com.conferenceroomscheduler.patterns.BookingState bookingState6 = bookingContext3.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState7 = bookingContext3.getState();
        cancelledBookingState1.handle(bookingContext3);
        checkedInBookingState0.handle(bookingContext3);
        com.conferenceroomscheduler.model.Reservation reservation10 = new com.conferenceroomscheduler.model.Reservation();
        reservation10.setFinalAmount((double) (byte) 100);
        reservation10.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext15 = new com.conferenceroomscheduler.patterns.BookingContext(reservation10);
        checkedInBookingState0.handle(bookingContext15);
        com.conferenceroomscheduler.model.Reservation reservation17 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext18 = new com.conferenceroomscheduler.patterns.BookingContext(reservation17);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState19 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext18.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState19);
        checkedInBookingState0.handle(bookingContext18);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState22 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str23 = cancelledBookingState22.getName();
        bookingContext18.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState22);
        java.lang.String str25 = cancelledBookingState22.getName();
        java.lang.String str26 = cancelledBookingState22.getName();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Cancelled" + "'", str23, "Cancelled");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cancelled" + "'", str25, "Cancelled");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Cancelled" + "'", str26, "Cancelled");
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor0 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor0.update("Booking confirmed.");
        roomSensor0.update("Pending");
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", true, false);
        occupancySensor3.setDetected(true);
        occupancySensor3.isDetected = false;
        boolean boolean8 = occupancySensor3.isDetected;
        occupancySensor3.setDetected(true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor7 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean8 = occupancySensor7.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher9 = null;
        occupancySensor7.subject = checkInPublisher9;
        occupancySensor7.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher13 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor17 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher18 = null;
        occupancySensor17.setSubject(checkInPublisher18);
        occupancySensor17.occupied = true;
        occupancySensor17.setDetected(false);
        checkInPublisher13.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor17);
        occupancySensor7.setSubject(checkInPublisher13);
        occupancySensor3.setSubject(checkInPublisher13);
        com.conferenceroomscheduler.model.Badge badge30 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str31 = badge30.getAccountId();
        boolean boolean32 = occupancySensor3.scanIdBadge(badge30);
        occupancySensor3.setOccupied(false);
        boolean boolean35 = occupancySensor3.isDetected();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Booking confirmed." + "'", str31, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("faculty", "Pending", (int) '#', "Cancelled", "Pending");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("admin", "Booking complete", (int) (byte) 1, "hi!", "Checked in.");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("faculty", "admin", (int) (byte) 100, "hi!", "Checked in.");
        com.conferenceroomscheduler.model.Room room30 = roomFactory0.createRoom("Checked in.", "admin", (int) (short) 1, "Cancelled", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room36 = roomFactory0.createRoom("Unverified badge detected for .", "Unverified badge detected for .", 100, "admin", "Pending");
        com.conferenceroomscheduler.model.Room room42 = roomFactory0.createRoom("Cancelled", "", (int) (short) 0, "student", "Checked in.");
        com.conferenceroomscheduler.model.Room room48 = roomFactory0.createRoom("", "Booking confirmed.", (int) (short) 1, "faculty", "");
        com.conferenceroomscheduler.model.Room room54 = roomFactory0.createRoom("Unverified badge detected for Cancelled.", "Pending", (int) '4', "partner", "staff");
        com.conferenceroomscheduler.model.Room room60 = roomFactory0.createRoom("", "faculty", (int) 'a', "faculty", "Checked in.");
        room60.setEnabled(false);
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
        org.junit.Assert.assertNotNull(room30);
        org.junit.Assert.assertNotNull(room36);
        org.junit.Assert.assertNotNull(room42);
        org.junit.Assert.assertNotNull(room48);
        org.junit.Assert.assertNotNull(room54);
        org.junit.Assert.assertNotNull(room60);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        com.conferenceroomscheduler.patterns.PartnerFactory partnerFactory0 = new com.conferenceroomscheduler.patterns.PartnerFactory();
        com.conferenceroomscheduler.model.Account account8 = partnerFactory0.createAccount("Checked in.", "hi!", "admin", "", true, false, "Pending");
        com.conferenceroomscheduler.model.Account account16 = partnerFactory0.createAccount("Booking complete", "hi!", "hi!", "", true, false, "Checked in.");
        com.conferenceroomscheduler.model.Badge badge17 = account16.getBadge();
        java.lang.String str18 = account16.getAccountType();
        account16.setUniversityAccount(true);
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(badge17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor7 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean8 = occupancySensor7.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher9 = null;
        occupancySensor7.subject = checkInPublisher9;
        occupancySensor7.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher13 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor17 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher18 = null;
        occupancySensor17.setSubject(checkInPublisher18);
        occupancySensor17.occupied = true;
        occupancySensor17.setDetected(false);
        checkInPublisher13.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor17);
        occupancySensor7.setSubject(checkInPublisher13);
        occupancySensor3.setSubject(checkInPublisher13);
        com.conferenceroomscheduler.model.Badge badge30 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str31 = badge30.getAccountId();
        boolean boolean32 = occupancySensor3.scanIdBadge(badge30);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher33 = null;
        occupancySensor3.subject = checkInPublisher33;
        boolean boolean35 = occupancySensor3.isDetected;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Booking confirmed." + "'", str31, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        java.lang.String str9 = reservation0.getAccountType();
        reservation0.setHourlyRate((double) '#');
        java.time.LocalDateTime localDateTime12 = null;
        reservation0.setEndTime(localDateTime12);
        reservation0.setTitle("Unverified badge detected for admin.");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy institutionalBillingPaymentStrategy0 = new com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy();
        boolean boolean3 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", 0.0d);
        boolean boolean6 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", (double) (short) 1);
        boolean boolean9 = institutionalBillingPaymentStrategy0.processPayment("Cancelled", (double) 0L);
        boolean boolean12 = institutionalBillingPaymentStrategy0.processPayment("student", (double) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        room6.setClosedForMaintenance(false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor17 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher18 = null;
        occupancySensor17.setSubject(checkInPublisher18);
        java.lang.String str20 = occupancySensor17.getRoomId();
        room6.setOccupancySensor(occupancySensor17);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher22 = occupancySensor17.subject;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(checkInPublisher22);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Unverified badge detected for admin.", "staff", 52, true, "hi!", "faculty");
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod41 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation42 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime35, localDateTime36, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod41);
        com.conferenceroomscheduler.model.Reservation reservation43 = new com.conferenceroomscheduler.model.Reservation("", "Pending", "Pending", "Booking complete", localDateTime25, localDateTime26, "Booking confirmed.", (double) 0.0f, (double) 1, (double) (byte) 100, paymentMethod41);
        com.conferenceroomscheduler.model.Reservation reservation44 = new com.conferenceroomscheduler.model.Reservation("Pending", "Booking complete", "Cancelled", "hi!", localDateTime15, localDateTime16, "", (double) '4', (double) 100.0f, (double) ' ', paymentMethod41);
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod55 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation56 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "hi!", "Booking complete", "Checked in.", localDateTime49, localDateTime50, "hi!", (double) 97, (double) 100L, (double) (byte) 100, paymentMethod55);
        reservation44.setPaymentMethod(paymentMethod55);
        com.conferenceroomscheduler.model.Reservation reservation58 = new com.conferenceroomscheduler.model.Reservation("", "", "hi!", "Booking confirmed.", localDateTime5, localDateTime6, "student", (double) (byte) 1, 0.0d, (double) 0L, paymentMethod55);
        double double59 = reservation58.getFinalAmount();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand60 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation58);
        org.junit.Assert.assertTrue("'" + paymentMethod41 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod41.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertTrue("'" + paymentMethod55 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod55.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        java.lang.String str7 = reservation0.getAccountType();
        double double8 = reservation0.getFinalAmount();
        reservation0.setUserId("Booking complete");
        reservation0.setHourlyRate((double) ' ');
        reservation0.setUserId("partner");
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        java.lang.String str4 = reservation1.getAccountType();
        java.time.LocalDateTime localDateTime5 = null;
        reservation1.setStartTime(localDateTime5);
        java.time.LocalDateTime localDateTime7 = reservation1.getEndTime();
        boolean boolean8 = reservation1.isExtended();
        double double9 = reservation1.getHourlyRate();
        double double10 = reservation1.getDepositAmount();
        reservation1.setTitle("Cancelled");
        double double13 = reservation1.getHourlyRate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getAccountType();
        java.lang.String str5 = reservation2.getAccountType();
        boolean boolean6 = reservation2.isCheckedIn();
        java.time.LocalDateTime localDateTime7 = reservation2.getStartTime();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand8 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation2);
        double double9 = reservation2.getFinalAmount();
        reservation2.setAccountType("Booking complete");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = null;
        occupancySensor3.setSubject(checkInPublisher12);
        occupancySensor3.isDetected = false;
        occupancySensor3.setDetected(true);
        occupancySensor3.setOccupied(false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher20 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor24 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor28 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean29 = occupancySensor28.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher30 = null;
        occupancySensor28.subject = checkInPublisher30;
        occupancySensor28.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher34 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor38 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher39 = null;
        occupancySensor38.setSubject(checkInPublisher39);
        occupancySensor38.occupied = true;
        occupancySensor38.setDetected(false);
        checkInPublisher34.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor38);
        occupancySensor28.setSubject(checkInPublisher34);
        occupancySensor24.setSubject(checkInPublisher34);
        boolean boolean48 = occupancySensor24.isDetected;
        checkInPublisher20.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor24);
        com.conferenceroomscheduler.model.AdminAccount adminAccount50 = new com.conferenceroomscheduler.model.AdminAccount();
        checkInPublisher20.notifyObservers((com.conferenceroomscheduler.model.Account) adminAccount50);
        occupancySensor3.setSubject(checkInPublisher20);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher53 = occupancySensor3.getSubject();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor57 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher58 = null;
        occupancySensor57.setSubject(checkInPublisher58);
        boolean boolean60 = occupancySensor57.isDetected;
        boolean boolean61 = occupancySensor57.isDetected;
        occupancySensor57.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher64 = occupancySensor57.subject;
        java.lang.String str65 = occupancySensor57.getRoomId();
        checkInPublisher53.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor57);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(checkInPublisher53);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(checkInPublisher64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        reservation1.setDepositAmount((double) (byte) 0);
        boolean boolean10 = reservation1.isCheckedIn();
        boolean boolean11 = reservation1.isDepositLost();
        double double12 = reservation1.getDepositAmount();
        reservation1.setReservationId("Booking confirmed.");
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand16 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime15);
        double double17 = reservation1.getHourlyRate();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.model.Reservation reservation10 = new com.conferenceroomscheduler.model.Reservation();
        reservation10.setFinalAmount((double) (byte) 100);
        java.lang.String str13 = reservation10.getRoomId();
        reservation10.setFinalAmount((double) 10.0f);
        java.lang.String str16 = reservation10.getUserId();
        reservation10.setDepositAmount((double) (byte) 0);
        double double19 = reservation10.getHourlyRate();
        reservation10.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext22 = new com.conferenceroomscheduler.patterns.BookingContext(reservation10);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod33 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation34 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime27, localDateTime28, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod33);
        reservation10.setPaymentMethod(paymentMethod33);
        com.conferenceroomscheduler.model.Reservation reservation36 = new com.conferenceroomscheduler.model.Reservation("Booking complete", "Booking complete", "", "Booking complete", localDateTime4, localDateTime5, "Cancelled", (double) 0L, (double) (-1), (double) 0, paymentMethod33);
        reservation36.setCheckedIn(true);
        reservation36.setRoomId("ADMIN-69");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod33 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod33.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean4 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor3.subject = checkInPublisher5;
        occupancySensor3.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher9 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher14 = null;
        occupancySensor13.setSubject(checkInPublisher14);
        occupancySensor13.occupied = true;
        occupancySensor13.setDetected(false);
        checkInPublisher9.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor13);
        occupancySensor3.setSubject(checkInPublisher9);
        boolean boolean22 = occupancySensor3.occupied;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor26 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor30 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean31 = occupancySensor30.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher32 = null;
        occupancySensor30.subject = checkInPublisher32;
        occupancySensor30.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher36 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor40 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher41 = null;
        occupancySensor40.setSubject(checkInPublisher41);
        occupancySensor40.occupied = true;
        occupancySensor40.setDetected(false);
        checkInPublisher36.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor40);
        occupancySensor30.setSubject(checkInPublisher36);
        occupancySensor26.setSubject(checkInPublisher36);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher50 = occupancySensor26.getSubject();
        occupancySensor26.roomId = "";
        occupancySensor26.setDetected(false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor58 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount65 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean66 = occupancySensor58.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount65);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher67 = null;
        occupancySensor58.setSubject(checkInPublisher67);
        occupancySensor58.isDetected = false;
        boolean boolean71 = occupancySensor58.isOccupied();
        com.conferenceroomscheduler.model.Badge badge75 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str76 = badge75.getEmail();
        boolean boolean77 = occupancySensor58.scanIdBadge(badge75);
        java.lang.String str78 = badge75.getAccountId();
        badge75.setAccountId("Cancelled");
        badge75.setAccountId("");
        java.lang.String str83 = badge75.getAccountId();
        badge75.setEmail("student");
        boolean boolean86 = occupancySensor26.scanIdBadge(badge75);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher87 = occupancySensor26.subject;
        occupancySensor3.setSubject(checkInPublisher87);
        com.conferenceroomscheduler.model.AdminAccount adminAccount89 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str90 = adminAccount89.getEmail();
        com.conferenceroomscheduler.model.Badge badge91 = adminAccount89.getBadge();
        com.conferenceroomscheduler.model.Badge badge92 = adminAccount89.getBadge();
        java.lang.String str93 = adminAccount89.getAccountId();
        adminAccount89.setAccountType("Unverified badge detected for .");
        adminAccount89.setUniversityAccount(false);
        // The following exception was thrown during execution in test generation
        try {
            checkInPublisher87.notifyObservers((com.conferenceroomscheduler.model.Account) adminAccount89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.model.Badge.getEmail()\" because \"badge\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(checkInPublisher50);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Cancelled" + "'", str76, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Booking confirmed." + "'", str78, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(checkInPublisher87);
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertNull(badge91);
        org.junit.Assert.assertNull(badge92);
        org.junit.Assert.assertNull(str93);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("admin", (double) (short) -1);
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("hi!", (double) (-1.0f));
        boolean boolean9 = debitCardPaymentStrategy0.processPayment("ADMIN-69", (double) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setCheckedIn(true);
        reservation0.setCheckedIn(false);
        reservation0.setReservationId("Booking complete");
        double double13 = reservation0.getHourlyRate();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod54 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation55 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime48, localDateTime49, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod54);
        com.conferenceroomscheduler.model.Reservation reservation56 = new com.conferenceroomscheduler.model.Reservation("admin", "", "Booking complete", "Pending", localDateTime38, localDateTime39, "", (double) 'a', (double) 10L, 0.0d, paymentMethod54);
        com.conferenceroomscheduler.model.Reservation reservation57 = new com.conferenceroomscheduler.model.Reservation("hi!", "faculty", "", "Pending", localDateTime28, localDateTime29, "Unverified badge detected for Cancelled.", (double) 1.0f, (double) 0L, (-1.0d), paymentMethod54);
        com.conferenceroomscheduler.model.Reservation reservation58 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "Booking confirmed.", "hi!", "Pending", localDateTime18, localDateTime19, "Cancelled", (double) '4', (double) (-1.0f), (double) 0L, paymentMethod54);
        reservation0.setPaymentMethod(paymentMethod54);
        java.lang.Class<?> wildcardClass60 = reservation0.getClass();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod54 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod54.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        java.time.LocalDateTime localDateTime9 = null;
        reservation0.setStartTime(localDateTime9);
        reservation0.setUserId("Cancelled");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod13 = reservation0.getPaymentMethod();
        boolean boolean14 = reservation0.isExtended();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(paymentMethod13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        double double8 = reservation1.getDepositAmount();
        reservation1.setHourlyRate((-1.0d));
        reservation1.setDepositLost(true);
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand13 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        // The following exception was thrown during execution in test generation
        try {
            createBookingCommand13.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.addReservation(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState0 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        java.lang.String str1 = completedBookingState0.getName();
        java.lang.String str2 = completedBookingState0.getName();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState3 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation4 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = new com.conferenceroomscheduler.patterns.BookingContext(reservation4);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState6 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext5.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState6);
        com.conferenceroomscheduler.patterns.BookingState bookingState8 = bookingContext5.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState9 = bookingContext5.getState();
        cancelledBookingState3.handle(bookingContext5);
        java.lang.String str11 = cancelledBookingState3.getName();
        com.conferenceroomscheduler.model.Reservation reservation12 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext13 = new com.conferenceroomscheduler.patterns.BookingContext(reservation12);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState14 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext13.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState14);
        com.conferenceroomscheduler.model.Reservation reservation16 = bookingContext13.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation17 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext18 = new com.conferenceroomscheduler.patterns.BookingContext(reservation17);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState19 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext18.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState19);
        com.conferenceroomscheduler.patterns.BookingState bookingState21 = bookingContext18.getState();
        bookingContext13.setState(bookingState21);
        cancelledBookingState3.handle(bookingContext13);
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService24 = null;
        com.conferenceroomscheduler.model.Reservation reservation25 = new com.conferenceroomscheduler.model.Reservation();
        reservation25.setFinalAmount((double) (byte) 100);
        java.lang.String str28 = reservation25.getRoomId();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand31 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService24, reservation25, localDateTime29, localDateTime30);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext32 = new com.conferenceroomscheduler.patterns.BookingContext(reservation25);
        cancelledBookingState3.handle(bookingContext32);
        completedBookingState0.handle(bookingContext32);
        java.lang.String str35 = completedBookingState0.getName();
        java.lang.String str36 = completedBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking complete" + "'", str1, "Booking complete");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking complete" + "'", str2, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cancelled" + "'", str11, "Cancelled");
        org.junit.Assert.assertNull(reservation16);
        org.junit.Assert.assertNotNull(bookingState21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Booking complete" + "'", str35, "Booking complete");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Booking complete" + "'", str36, "Booking complete");
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand8 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setHourlyRate((double) 0L);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod31 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation32 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime25, localDateTime26, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod31);
        com.conferenceroomscheduler.model.Reservation reservation33 = new com.conferenceroomscheduler.model.Reservation("admin", "", "Booking complete", "Pending", localDateTime15, localDateTime16, "", (double) 'a', (double) 10L, 0.0d, paymentMethod31);
        reservation1.setPaymentMethod(paymentMethod31);
        reservation1.setCheckedIn(false);
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + paymentMethod31 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod31.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor3.isDetected = false;
        java.lang.String str6 = occupancySensor3.getRoomId();
        occupancySensor3.isDetected = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher9 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher14 = null;
        occupancySensor13.setSubject(checkInPublisher14);
        occupancySensor13.occupied = true;
        occupancySensor13.setDetected(false);
        checkInPublisher9.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor13);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor24 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor24.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount33 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount33.setEmail("");
        boolean boolean36 = occupancySensor24.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount33);
        checkInPublisher9.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor24);
        occupancySensor3.setSubject(checkInPublisher9);
        boolean boolean39 = occupancySensor3.isOccupied();
        java.lang.String str40 = occupancySensor3.roomId;
        boolean boolean41 = occupancySensor3.occupied;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pending" + "'", str6, "Pending");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Pending" + "'", str40, "Pending");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) '4');
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("", (double) (-1));
        boolean boolean9 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) 10L);
        boolean boolean12 = debitCardPaymentStrategy0.processPayment("Pending", (-1.0d));
        boolean boolean15 = debitCardPaymentStrategy0.processPayment("Verified badge detected for ADMIN-69.", (double) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        java.lang.String str13 = room6.getBuilding();
        java.lang.String str14 = room6.getBuilding();
        room6.setBuilding("Checked in.");
        room6.setCapacity(100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setRoomId("Booking confirmed.");
        java.lang.String str6 = badgeScan3.getBadgeId();
        badgeScan3.setRoomId("Pending");
        badgeScan3.setVerified(true);
        badgeScan3.setVerified(true);
        java.lang.String str13 = badgeScan3.getBadgeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("ADMIN-69", "Booking complete", "Booking confirmed.", "hi!", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking confirmed." + "'", str8, "Booking confirmed.");
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("Verified badge detected for ADMIN-69.", "partner", "Verified badge detected for ADMIN-69.", false, true, "Verified badge detected for Checked in..");
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        room6.setRoomId("Booking complete");
        room6.setEnabled(false);
        java.lang.String str23 = room6.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean4 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor3.subject = checkInPublisher5;
        occupancySensor3.occupied = false;
        java.lang.String str9 = occupancySensor3.getLastEvent();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher14 = null;
        occupancySensor13.setSubject(checkInPublisher14);
        boolean boolean16 = occupancySensor13.occupied;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor20 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean21 = occupancySensor20.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher22 = null;
        occupancySensor20.subject = checkInPublisher22;
        occupancySensor20.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher26 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor30 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher31 = null;
        occupancySensor30.setSubject(checkInPublisher31);
        occupancySensor30.occupied = true;
        occupancySensor30.setDetected(false);
        checkInPublisher26.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor30);
        occupancySensor20.setSubject(checkInPublisher26);
        com.conferenceroomscheduler.model.StudentAccount studentAccount45 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        checkInPublisher26.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount45);
        occupancySensor13.subject = checkInPublisher26;
        occupancySensor3.subject = checkInPublisher26;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Booking confirmed.", "Checked in.", "hi!", "hi!", (int) 'a', localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = bookingRequest7.getEndTime();
        java.lang.String str9 = bookingRequest7.getRoomId();
        java.lang.String str10 = bookingRequest7.getRoomId();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Checked in." + "'", str9, "Checked in.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Checked in." + "'", str10, "Checked in.");
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("Pending", "Unverified badge detected for admin.", "Verified badge detected for ADMIN-69.", true, true, "Unverified badge detected for admin.");
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        reservation1.setDepositAmount((double) (byte) 0);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand10 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str11 = reservation1.getTitle();
        reservation1.setAccountType("Cancelled");
        java.lang.String str14 = reservation1.getReservationId();
        reservation1.setReservationId("student");
        reservation1.setExtended(true);
        double double19 = reservation1.getHourlyRate();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        com.conferenceroomscheduler.patterns.PartnerFactory partnerFactory0 = new com.conferenceroomscheduler.patterns.PartnerFactory();
        com.conferenceroomscheduler.model.Account account8 = partnerFactory0.createAccount("Verified badge detected for ADMIN-69.", "student", "Cancelled", "", false, false, "Cancelled");
        org.junit.Assert.assertNotNull(account8);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        boolean boolean9 = reservation0.isExtended();
        reservation0.setRoomId("Checked in.");
        reservation0.setReservationId("Booking complete");
        java.lang.String str14 = reservation0.getReservationId();
        double double15 = reservation0.getFinalAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking complete" + "'", str14, "Booking complete");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) '4');
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("Checked in.", (double) 52);
        boolean boolean9 = debitCardPaymentStrategy0.processPayment("Booking complete", 100.0d);
        boolean boolean12 = debitCardPaymentStrategy0.processPayment("Pending", (double) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        java.lang.String str8 = room6.getBuilding();
        com.conferenceroomscheduler.model.StudentAccount studentAccount15 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        studentAccount15.setUniversityAccount(false);
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount15);
        int int19 = room6.getCapacity();
        room6.setRoomId("");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher22 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor26 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean27 = occupancySensor26.isDetected();
        occupancySensor26.occupied = false;
        checkInPublisher22.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor26);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher31 = occupancySensor26.subject;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor35 = new com.conferenceroomscheduler.model.OccupancySensor("Cancelled", false, false);
        checkInPublisher31.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor35);
        boolean boolean37 = occupancySensor35.isDetected;
        room6.setOccupancySensor(occupancySensor35);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher39 = occupancySensor35.getSubject();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(checkInPublisher31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(checkInPublisher39);
    }
}

