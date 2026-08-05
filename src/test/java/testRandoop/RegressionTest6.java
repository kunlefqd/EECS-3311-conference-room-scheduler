package testRandoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getRoomId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.lang.String str11 = bookingRequest7.getTitle();
        java.time.LocalDateTime localDateTime12 = bookingRequest7.getStartTime();
        java.lang.String str13 = bookingRequest7.getOrganizerId();
        int int14 = bookingRequest7.getAttendeeCount();
        java.lang.String str15 = bookingRequest7.getRequestId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("Unverified badge detected for Cancelled.", "Unverified badge detected for admin.", "partner", false, true, "Cancelled");
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = null;
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime5, localDateTime6, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod11);
        reservation12.setDepositLost(true);
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand16 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation12, localDateTime15);
        reservation12.setHourlyRate((double) (-1.0f));
        reservation12.setTitle("Pending");
        boolean boolean21 = reservation12.isDepositLost();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext22 = new com.conferenceroomscheduler.patterns.BookingContext(reservation12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
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
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService21 = null;
        com.conferenceroomscheduler.model.Reservation reservation22 = new com.conferenceroomscheduler.model.Reservation();
        reservation22.setFinalAmount((double) (byte) 100);
        java.lang.String str25 = reservation22.getRoomId();
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand28 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService21, reservation22, localDateTime26, localDateTime27);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext29 = new com.conferenceroomscheduler.patterns.BookingContext(reservation22);
        cancelledBookingState0.handle(bookingContext29);
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState31 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation32 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext33 = new com.conferenceroomscheduler.patterns.BookingContext(reservation32);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState34 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext33.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState34);
        completedBookingState31.handle(bookingContext33);
        java.lang.String str37 = completedBookingState31.getName();
        bookingContext29.setState((com.conferenceroomscheduler.patterns.BookingState) completedBookingState31);
        bookingContext29.request();
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNull(reservation13);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Booking complete" + "'", str37, "Booking complete");
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setHourlyRate((double) (byte) 100);
        boolean boolean4 = reservation1.isDepositLost();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand5 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        boolean boolean6 = cancelBookingCommand5.wasSuccessful();
        boolean boolean7 = cancelBookingCommand5.wasSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand5.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        java.lang.String str54 = occupancySensor3.getLastEvent();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher55 = occupancySensor3.getSubject();
        boolean boolean56 = occupancySensor3.isOccupied();
        boolean boolean57 = occupancySensor3.isDetected();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(checkInPublisher55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setHourlyRate((double) (byte) 100);
        boolean boolean5 = reservation2.isDepositLost();
        java.lang.String str6 = reservation2.getUserId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand7 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService1, reservation2);
        reservation2.setAccountType("ADMIN-69");
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand10 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
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
        com.conferenceroomscheduler.model.Reservation reservation46 = new com.conferenceroomscheduler.model.Reservation("Booking complete", "Booking complete", "", "Booking complete", localDateTime14, localDateTime15, "Cancelled", (double) 0L, (double) (-1), (double) 0, paymentMethod43);
        com.conferenceroomscheduler.model.Reservation reservation47 = new com.conferenceroomscheduler.model.Reservation("faculty", "Booking complete", "ADMIN-69", "student", localDateTime4, localDateTime5, "ADMIN-69", (double) 10L, (double) (byte) 1, (double) 0, paymentMethod43);
        reservation47.setCanceled(false);
        java.lang.String str50 = reservation47.getTitle();
        reservation47.setAccountType("student");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod43 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod43.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "student" + "'", str50, "student");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("Booking complete", "Pending", "student", false, false, "");
        adminAccount6.setUniversityAccount(true);
        boolean boolean9 = adminAccount6.isUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean4 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor3.subject = checkInPublisher5;
        occupancySensor3.occupied = false;
        java.lang.String str9 = occupancySensor3.getLastEvent();
        com.conferenceroomscheduler.model.AdminAccount adminAccount10 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount10.setAccountNumber("hi!");
        java.lang.String str13 = adminAccount10.getAccountId();
        adminAccount10.setAccountType("Booking complete");
        boolean boolean16 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount10);
        occupancySensor3.setDetected(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Pending", "Cancelled", (int) (byte) 10, "Checked in.", "Cancelled");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("Booking complete", "student", (int) (byte) 100, "Booking complete", "faculty");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("partner", "student", (int) (short) 100, "Unverified badge detected for Cancelled.", "faculty");
        boolean boolean25 = room24.isEnabled();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor15 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor15.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount24 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount24.setEmail("");
        boolean boolean27 = occupancySensor15.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount24);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor31 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean32 = occupancySensor31.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher33 = null;
        occupancySensor31.subject = checkInPublisher33;
        occupancySensor31.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher37 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor41 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher42 = null;
        occupancySensor41.setSubject(checkInPublisher42);
        occupancySensor41.occupied = true;
        occupancySensor41.setDetected(false);
        checkInPublisher37.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor41);
        occupancySensor31.setSubject(checkInPublisher37);
        com.conferenceroomscheduler.model.StudentAccount studentAccount56 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        checkInPublisher37.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount56);
        occupancySensor15.subject = checkInPublisher37;
        occupancySensor3.subject = checkInPublisher37;
        com.conferenceroomscheduler.model.StaffAccount staffAccount66 = new com.conferenceroomscheduler.model.StaffAccount("hi!", "Booking complete", "Booking confirmed.", false, false, "Booking complete");
        checkInPublisher37.notifyObservers((com.conferenceroomscheduler.model.Account) staffAccount66);
        com.conferenceroomscheduler.model.StaffAccount staffAccount68 = new com.conferenceroomscheduler.model.StaffAccount();
        checkInPublisher37.notifyObservers((com.conferenceroomscheduler.model.Account) staffAccount68);
        staffAccount68.setAccountId("Unverified badge detected for .");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Unverified badge detected for admin.", "partner", "Unverified badge detected for admin.", true, false, "partner");
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getTitle();
        double double4 = reservation1.getDepositAmount();
        reservation1.setTitle("");
        double double7 = reservation1.getFinalAmount();
        reservation1.setFinalAmount((double) (short) 0);
        reservation1.setExtended(true);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod32 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation33 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "hi!", "Booking complete", "Checked in.", localDateTime26, localDateTime27, "hi!", (double) 97, (double) 100L, (double) (byte) 100, paymentMethod32);
        com.conferenceroomscheduler.model.Reservation reservation34 = new com.conferenceroomscheduler.model.Reservation("Unverified badge detected for .", "faculty", "", "Unverified badge detected for .", localDateTime16, localDateTime17, "faculty", (double) (short) 100, (double) 97, (double) 1L, paymentMethod32);
        reservation1.setPaymentMethod(paymentMethod32);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod32 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod32.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Checked in.", "", "Unverified badge detected for .", true, true, "Unverified badge detected for .");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        room6.setCapacity((int) '4');
        room6.setName("hi!");
        room6.setEnabled(false);
        room6.setRoomNumber("ADMIN-69");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor22 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor26 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean27 = occupancySensor26.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher28 = null;
        occupancySensor26.subject = checkInPublisher28;
        occupancySensor26.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher32 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor36 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher37 = null;
        occupancySensor36.setSubject(checkInPublisher37);
        occupancySensor36.occupied = true;
        occupancySensor36.setDetected(false);
        checkInPublisher32.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor36);
        occupancySensor26.setSubject(checkInPublisher32);
        occupancySensor22.setSubject(checkInPublisher32);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher46 = occupancySensor22.getSubject();
        occupancySensor22.roomId = "";
        occupancySensor22.setDetected(false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor54 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount61 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean62 = occupancySensor54.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount61);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher63 = null;
        occupancySensor54.setSubject(checkInPublisher63);
        occupancySensor54.isDetected = false;
        boolean boolean67 = occupancySensor54.isOccupied();
        com.conferenceroomscheduler.model.Badge badge71 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str72 = badge71.getEmail();
        boolean boolean73 = occupancySensor54.scanIdBadge(badge71);
        java.lang.String str74 = badge71.getAccountId();
        badge71.setAccountId("Cancelled");
        badge71.setAccountId("");
        java.lang.String str79 = badge71.getAccountId();
        badge71.setEmail("student");
        boolean boolean82 = occupancySensor22.scanIdBadge(badge71);
        occupancySensor22.setDetected(false);
        occupancySensor22.setDetected(false);
        occupancySensor22.roomId = "staff";
        room6.setOccupancySensor(occupancySensor22);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(checkInPublisher46);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Cancelled" + "'", str72, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Booking confirmed." + "'", str74, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Booking complete", "Booking confirmed.", (int) '4', true, "Booking confirmed.", "Pending");
        room6.setClosedForMaintenance(false);
        java.lang.String str9 = room6.getName();
        room6.setRoomNumber("faculty");
        boolean boolean12 = room6.isClosedForMaintenance();
        room6.setRoomNumber("faculty");
        room6.setRoomId("hi!");
        java.lang.String str17 = room6.getName();
        boolean boolean18 = room6.isClosedForMaintenance();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking confirmed." + "'", str9, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking confirmed." + "'", str17, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
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
        boolean boolean29 = occupancySensor15.isDetected;
        com.conferenceroomscheduler.model.StudentAccount studentAccount36 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Booking complete", true, true, "Checked in.");
        boolean boolean37 = occupancySensor15.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount36);
        boolean boolean38 = occupancySensor15.occupied;
        boolean boolean39 = occupancySensor15.occupied;
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("staff", "Verified badge detected for ADMIN-69.", false);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
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
        com.conferenceroomscheduler.model.Reservation reservation20 = new com.conferenceroomscheduler.model.Reservation();
        reservation20.setFinalAmount((double) (byte) 100);
        reservation20.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext25 = new com.conferenceroomscheduler.patterns.BookingContext(reservation20);
        checkedInBookingState10.handle(bookingContext25);
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState27 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation28 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext29 = new com.conferenceroomscheduler.patterns.BookingContext(reservation28);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState30 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext29.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState30);
        completedBookingState27.handle(bookingContext29);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState33 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation34 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext35 = new com.conferenceroomscheduler.patterns.BookingContext(reservation34);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState36 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext35.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState36);
        com.conferenceroomscheduler.patterns.BookingState bookingState38 = bookingContext35.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState39 = bookingContext35.getState();
        cancelledBookingState33.handle(bookingContext35);
        completedBookingState27.handle(bookingContext35);
        com.conferenceroomscheduler.model.Reservation reservation42 = bookingContext35.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation43 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext44 = new com.conferenceroomscheduler.patterns.BookingContext(reservation43);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState45 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext44.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState45);
        com.conferenceroomscheduler.model.Reservation reservation47 = bookingContext44.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation48 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext49 = new com.conferenceroomscheduler.patterns.BookingContext(reservation48);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState50 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext49.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState50);
        com.conferenceroomscheduler.patterns.BookingState bookingState52 = bookingContext49.getState();
        bookingContext44.setState(bookingState52);
        bookingContext35.setState(bookingState52);
        checkedInBookingState10.handle(bookingContext35);
        checkedInBookingState0.handle(bookingContext35);
        java.lang.String str57 = checkedInBookingState0.getName();
        java.lang.String str58 = checkedInBookingState0.getName();
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState59 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        java.lang.String str60 = completedBookingState59.getName();
        java.lang.String str61 = completedBookingState59.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState62 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState63 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation64 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext65 = new com.conferenceroomscheduler.patterns.BookingContext(reservation64);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState66 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext65.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState66);
        com.conferenceroomscheduler.patterns.BookingState bookingState68 = bookingContext65.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState69 = bookingContext65.getState();
        cancelledBookingState63.handle(bookingContext65);
        checkedInBookingState62.handle(bookingContext65);
        java.lang.String str72 = checkedInBookingState62.getName();
        com.conferenceroomscheduler.model.Reservation reservation73 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext74 = new com.conferenceroomscheduler.patterns.BookingContext(reservation73);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState75 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext74.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState75);
        com.conferenceroomscheduler.model.Reservation reservation77 = bookingContext74.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation78 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext79 = new com.conferenceroomscheduler.patterns.BookingContext(reservation78);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState80 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext79.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState80);
        com.conferenceroomscheduler.patterns.BookingState bookingState82 = bookingContext79.getState();
        bookingContext74.setState(bookingState82);
        checkedInBookingState62.handle(bookingContext74);
        com.conferenceroomscheduler.model.Reservation reservation85 = bookingContext74.getReservation();
        completedBookingState59.handle(bookingContext74);
        checkedInBookingState0.handle(bookingContext74);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertNotNull(bookingState17);
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertNotNull(bookingState39);
        org.junit.Assert.assertNull(reservation42);
        org.junit.Assert.assertNull(reservation47);
        org.junit.Assert.assertNotNull(bookingState52);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Checked in." + "'", str57, "Checked in.");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Checked in." + "'", str58, "Checked in.");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Booking complete" + "'", str60, "Booking complete");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Booking complete" + "'", str61, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState68);
        org.junit.Assert.assertNotNull(bookingState69);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Checked in." + "'", str72, "Checked in.");
        org.junit.Assert.assertNull(reservation77);
        org.junit.Assert.assertNotNull(bookingState82);
        org.junit.Assert.assertNull(reservation85);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setDepositAmount(0.0d);
        reservation0.setAccountType("");
        java.lang.String str8 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (short) 100);
        java.lang.String str11 = reservation0.getRoomId();
        java.time.LocalDateTime localDateTime12 = null;
        reservation0.setEndTime(localDateTime12);
        reservation0.setAccountType("");
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        com.conferenceroomscheduler.model.AdminAccount adminAccount11 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount11.setAccountNumber("hi!");
        java.lang.String str14 = adminAccount11.getAccountId();
        room6.checkIn((com.conferenceroomscheduler.model.Account) adminAccount11);
        room6.setEnabled(false);
        room6.setName("Booking confirmed.");
        boolean boolean20 = room6.isEnabled();
        java.lang.String str21 = room6.getBuilding();
        java.lang.String str22 = room6.getBuilding();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
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
        room6.setRoomId("Cancelled");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor23 = room6.getOccupancySensor();
        room6.setBuilding("Booking complete");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(occupancySensor23);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        java.time.LocalDateTime localDateTime6 = reservation0.getEndTime();
        boolean boolean7 = reservation0.isCheckedIn();
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        reservation0.setDepositLost(true);
        java.lang.String str12 = reservation0.getUserId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        room6.setBuilding("Booking complete");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor21 = room6.getOccupancySensor();
        room6.setName("");
        int int24 = room6.getCapacity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(occupancySensor21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState0 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str1 = cancelledBookingState0.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState2 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState3 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation4 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = new com.conferenceroomscheduler.patterns.BookingContext(reservation4);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState6 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext5.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState6);
        com.conferenceroomscheduler.patterns.BookingState bookingState8 = bookingContext5.getState();
        com.conferenceroomscheduler.model.Reservation reservation9 = bookingContext5.getReservation();
        cancelledBookingState3.handle(bookingContext5);
        checkedInBookingState2.handle(bookingContext5);
        bookingContext5.request();
        com.conferenceroomscheduler.model.Reservation reservation13 = bookingContext5.getReservation();
        cancelledBookingState0.handle(bookingContext5);
        java.lang.String str15 = cancelledBookingState0.getName();
        java.lang.String str16 = cancelledBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cancelled" + "'", str1, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertNull(reservation9);
        org.junit.Assert.assertNull(reservation13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cancelled" + "'", str15, "Cancelled");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cancelled" + "'", str16, "Cancelled");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "Checked in.", true);
        badgeScan3.setVerified(false);
        java.lang.String str6 = badgeScan3.getRoomId();
        boolean boolean7 = badgeScan3.isVerified();
        java.lang.String str8 = badgeScan3.getBadgeId();
        java.lang.String str9 = badgeScan3.getRoomId();
        boolean boolean10 = badgeScan3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Checked in." + "'", str6, "Checked in.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Checked in." + "'", str9, "Checked in.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("hi!", "student", true);
        java.lang.String str4 = badgeScan3.getRoomId();
        boolean boolean5 = badgeScan3.isVerified();
        badgeScan3.setBadgeId("Cancelled");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.occupied;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean11 = occupancySensor10.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = null;
        occupancySensor10.subject = checkInPublisher12;
        occupancySensor10.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher16 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor20 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher21 = null;
        occupancySensor20.setSubject(checkInPublisher21);
        occupancySensor20.occupied = true;
        occupancySensor20.setDetected(false);
        checkInPublisher16.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor20);
        occupancySensor10.setSubject(checkInPublisher16);
        com.conferenceroomscheduler.model.StudentAccount studentAccount35 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        checkInPublisher16.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount35);
        occupancySensor3.subject = checkInPublisher16;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor41 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor45 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean46 = occupancySensor45.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher47 = null;
        occupancySensor45.subject = checkInPublisher47;
        occupancySensor45.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher51 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor55 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher56 = null;
        occupancySensor55.setSubject(checkInPublisher56);
        occupancySensor55.occupied = true;
        occupancySensor55.setDetected(false);
        checkInPublisher51.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor55);
        occupancySensor45.setSubject(checkInPublisher51);
        occupancySensor41.setSubject(checkInPublisher51);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher65 = occupancySensor41.getSubject();
        checkInPublisher16.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor41);
        com.conferenceroomscheduler.model.StudentAccount studentAccount73 = new com.conferenceroomscheduler.model.StudentAccount("", "Booking complete", "Booking confirmed.", false, true, "Booking confirmed.");
        checkInPublisher16.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount73);
        boolean boolean75 = studentAccount73.isUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(checkInPublisher65);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
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
        com.conferenceroomscheduler.model.Reservation reservation54 = new com.conferenceroomscheduler.model.Reservation("Unverified badge detected for admin.", "Pending", "faculty", "", localDateTime4, localDateTime5, "Verified badge detected for ADMIN-69.", 10.0d, (-1.0d), (double) 0, paymentMethod49);
        org.junit.Assert.assertNull(paymentMethod33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + paymentMethod49 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod49.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setReservationId("Checked in.");
        double double9 = reservation0.getDepositAmount();
        boolean boolean10 = reservation0.isExtended();
        reservation0.setRoomId("faculty");
        boolean boolean13 = reservation0.isExtended();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setBuilding("hi!");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = room6.getOccupancySensor();
        occupancySensor10.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher13 = occupancySensor10.subject;
        com.conferenceroomscheduler.model.StudentAccount studentAccount20 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        com.conferenceroomscheduler.model.Badge badge21 = studentAccount20.getBadge();
        badge21.setEmail("Pending");
        boolean boolean24 = occupancySensor10.scanIdBadge(badge21);
        boolean boolean25 = badge21.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(occupancySensor10);
        org.junit.Assert.assertNull(checkInPublisher13);
        org.junit.Assert.assertNotNull(badge21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
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
        com.conferenceroomscheduler.model.StudentAccount studentAccount32 = new com.conferenceroomscheduler.model.StudentAccount("hi!", "faculty", "", false, false, "hi!");
        boolean boolean33 = occupancySensor4.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount32);
        studentAccount32.setIdentifier("Unverified badge detected for Cancelled.");
        studentAccount32.setEmail("student");
        studentAccount32.setVerified(true);
        studentAccount32.setUniversityAccount(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(account18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        com.conferenceroomscheduler.model.Reservation reservation0 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext1 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState2 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext1.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState2);
        java.lang.String str4 = cancelledBookingState2.getName();
        java.lang.String str5 = cancelledBookingState2.getName();
        com.conferenceroomscheduler.model.Reservation reservation6 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext7 = new com.conferenceroomscheduler.patterns.BookingContext(reservation6);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState8 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext7.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState8);
        com.conferenceroomscheduler.patterns.BookingState bookingState10 = bookingContext7.getState();
        java.lang.String str11 = bookingContext7.getStatus();
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
        java.lang.String str27 = completedBookingState12.getName();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext28 = null;
        completedBookingState12.handle(bookingContext28);
        java.lang.String str30 = completedBookingState12.getName();
        bookingContext7.setState((com.conferenceroomscheduler.patterns.BookingState) completedBookingState12);
        java.lang.String str32 = bookingContext7.getStatus();
        cancelledBookingState2.handle(bookingContext7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cancelled" + "'", str4, "Cancelled");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cancelled" + "'", str5, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cancelled" + "'", str11, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertNotNull(bookingState24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Booking complete" + "'", str27, "Booking complete");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Booking complete" + "'", str30, "Booking complete");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Booking complete" + "'", str32, "Booking complete");
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Pending", "", false);
        boolean boolean4 = badgeScan3.isVerified();
        badgeScan3.setVerified(true);
        badgeScan3.setRoomId("Unverified badge detected for Cancelled.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("student", "", "admin", false, false, "partner");
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setFinalAmount((double) ' ');
        double double9 = reservation0.getHourlyRate();
        reservation0.setCanceled(true);
        boolean boolean12 = reservation0.isExtended();
        boolean boolean13 = reservation0.isCheckedIn();
        java.time.LocalDateTime localDateTime14 = null;
        reservation0.setEndTime(localDateTime14);
        double double16 = reservation0.getHourlyRate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("", "Checked in.", "student", false, true, "Pending");
        java.lang.String str7 = adminAccount6.getPassword();
        adminAccount6.setUniversityAccount(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("Verified badge detected for Checked in..", "staff", "", true, true, "");
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        room6.setRoomId("Booking complete");
        int int21 = room6.getCapacity();
        java.lang.String str22 = room6.getRoomId();
        java.lang.String str23 = room6.getRoomNumber();
        java.lang.String str24 = room6.getBuilding();
        room6.setName("Checked in.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Booking complete" + "'", str22, "Booking complete");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        boolean boolean4 = badgeScan3.isVerified();
        boolean boolean5 = badgeScan3.isVerified();
        java.lang.String str6 = badgeScan3.getRoomId();
        badgeScan3.setBadgeId("");
        java.lang.String str9 = badgeScan3.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory0 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account8 = facultyFactory0.createAccount("Booking confirmed.", "hi!", "Cancelled", "student", true, false, "Booking complete");
        com.conferenceroomscheduler.model.Badge badge9 = account8.getBadge();
        java.lang.String str10 = badge9.getEmail();
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(badge9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState0 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str1 = confirmedBookingState0.getName();
        java.lang.String str2 = confirmedBookingState0.getName();
        java.lang.String str3 = confirmedBookingState0.getName();
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState4 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation5 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext6 = new com.conferenceroomscheduler.patterns.BookingContext(reservation5);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState7 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext6.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState7);
        completedBookingState4.handle(bookingContext6);
        confirmedBookingState0.handle(bookingContext6);
        com.conferenceroomscheduler.model.Reservation reservation11 = new com.conferenceroomscheduler.model.Reservation();
        reservation11.setFinalAmount((double) (byte) 100);
        java.lang.String str14 = reservation11.getRoomId();
        reservation11.setFinalAmount((double) 10.0f);
        java.lang.String str17 = reservation11.getUserId();
        reservation11.setFinalAmount((double) ' ');
        java.lang.String str20 = reservation11.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext21 = new com.conferenceroomscheduler.patterns.BookingContext(reservation11);
        confirmedBookingState0.handle(bookingContext21);
        java.lang.String str23 = confirmedBookingState0.getName();
        java.lang.String str24 = confirmedBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking confirmed." + "'", str1, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking confirmed." + "'", str2, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking confirmed." + "'", str3, "Booking confirmed.");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking confirmed." + "'", str23, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Booking confirmed." + "'", str24, "Booking confirmed.");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
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
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState18 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState19 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation20 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext21 = new com.conferenceroomscheduler.patterns.BookingContext(reservation20);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState22 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext21.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState22);
        com.conferenceroomscheduler.patterns.BookingState bookingState24 = bookingContext21.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState25 = bookingContext21.getState();
        cancelledBookingState19.handle(bookingContext21);
        checkedInBookingState18.handle(bookingContext21);
        java.lang.String str28 = checkedInBookingState18.getName();
        com.conferenceroomscheduler.model.Reservation reservation29 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext30 = new com.conferenceroomscheduler.patterns.BookingContext(reservation29);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState31 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext30.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState31);
        com.conferenceroomscheduler.model.Reservation reservation33 = bookingContext30.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation34 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext35 = new com.conferenceroomscheduler.patterns.BookingContext(reservation34);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState36 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext35.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState36);
        com.conferenceroomscheduler.patterns.BookingState bookingState38 = bookingContext35.getState();
        bookingContext30.setState(bookingState38);
        checkedInBookingState18.handle(bookingContext30);
        com.conferenceroomscheduler.patterns.BookingState bookingState41 = bookingContext30.getState();
        checkedInBookingState0.handle(bookingContext30);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod73 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation74 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime67, localDateTime68, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod73);
        com.conferenceroomscheduler.model.Reservation reservation75 = new com.conferenceroomscheduler.model.Reservation("admin", "", "Booking complete", "Pending", localDateTime57, localDateTime58, "", (double) 'a', (double) 10L, 0.0d, paymentMethod73);
        com.conferenceroomscheduler.model.Reservation reservation76 = new com.conferenceroomscheduler.model.Reservation("hi!", "faculty", "", "Pending", localDateTime47, localDateTime48, "Unverified badge detected for Cancelled.", (double) 1.0f, (double) 0L, (-1.0d), paymentMethod73);
        java.time.LocalDateTime localDateTime77 = null;
        reservation76.setEndTime(localDateTime77);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext79 = new com.conferenceroomscheduler.patterns.BookingContext(reservation76);
        checkedInBookingState0.handle(bookingContext79);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Checked in." + "'", str17, "Checked in.");
        org.junit.Assert.assertNotNull(bookingState24);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Checked in." + "'", str28, "Checked in.");
        org.junit.Assert.assertNull(reservation33);
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertNotNull(bookingState41);
        org.junit.Assert.assertTrue("'" + paymentMethod73 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod73.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("admin", "Verified badge detected for Checked in..", "admin", false, true, "student");
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
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
        reservation0.setHourlyRate((double) (short) 10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking complete" + "'", str14, "Booking complete");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        reservation0.setCanceled(false);
        reservation0.setCanceled(false);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod10 = reservation0.getPaymentMethod();
        reservation0.setRoomId("Checked in.");
        java.lang.String str13 = reservation0.getUserId();
        reservation0.setFinalAmount((double) 52);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(paymentMethod10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
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
        boolean boolean49 = occupancySensor3.isOccupied();
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount56 = new com.conferenceroomscheduler.model.PartnerAccount("Booking confirmed.", "hi!", "Pending", false, true, "Checked in.");
        java.lang.String str57 = partnerAccount56.getEmail();
        boolean boolean58 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) partnerAccount56);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        java.lang.String str3 = reservation0.getUserId();
        boolean boolean4 = reservation0.isDepositLost();
        reservation0.setDepositLost(false);
        java.lang.String str7 = reservation0.getRoomId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation("Pending", "admin", "Cancelled", "Booking confirmed.", localDateTime5, localDateTime6, "admin", (double) (short) 1, (double) (short) 100, (double) (-1L), paymentMethod11);
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand13 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation12);
        org.junit.Assert.assertTrue("'" + paymentMethod11 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod11.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("Verified badge detected for Checked in..", "faculty", "Unverified badge detected for .", false, true, "hi!");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
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
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState23 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str24 = pendingBookingState23.getName();
        com.conferenceroomscheduler.model.Reservation reservation25 = new com.conferenceroomscheduler.model.Reservation();
        reservation25.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod28 = reservation25.getPaymentMethod();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext29 = new com.conferenceroomscheduler.patterns.BookingContext(reservation25);
        pendingBookingState23.handle(bookingContext29);
        checkedInBookingState0.handle(bookingContext29);
        java.lang.String str32 = checkedInBookingState0.getName();
        java.lang.String str33 = checkedInBookingState0.getName();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Checked in." + "'", str10, "Checked in.");
        org.junit.Assert.assertNull(reservation15);
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Pending" + "'", str24, "Pending");
        org.junit.Assert.assertNull(paymentMethod28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Checked in." + "'", str32, "Checked in.");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Checked in." + "'", str33, "Checked in.");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Booking confirmed.", "Unverified badge detected for admin.", false);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext6 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState7 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str8 = cancelledBookingState7.getName();
        bookingContext6.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState7);
        com.conferenceroomscheduler.model.Reservation reservation10 = bookingContext6.getReservation();
        reservation10.setReservationId("");
        double double13 = reservation10.getHourlyRate();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod14 = null;
        reservation10.setPaymentMethod(paymentMethod14);
        reservation10.setCanceled(false);
        java.lang.String str18 = reservation10.getAccountType();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand21 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation10, localDateTime19, localDateTime20);
        java.lang.String str22 = reservation10.getReservationId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNotNull(reservation10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("student", "Booking confirmed.", "Unverified badge detected for Cancelled.", false, false, "Unverified badge detected for Cancelled.");
        studentAccount6.setPassword("admin");
        java.lang.String str9 = studentAccount6.getAccountType();
        java.lang.String str10 = studentAccount6.getAccountId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        double double8 = reservation1.getFinalAmount();
        reservation1.setCanceled(false);
        reservation1.setCanceled(true);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand15 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime16 = reservation1.getEndTime();
        double double17 = reservation1.getDepositAmount();
        java.time.LocalDateTime localDateTime18 = reservation1.getStartTime();
        java.lang.String str19 = reservation1.getReservationId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext6 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState7 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str8 = cancelledBookingState7.getName();
        bookingContext6.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState7);
        com.conferenceroomscheduler.model.Reservation reservation10 = bookingContext6.getReservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand11 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation10);
        boolean boolean12 = cancelBookingCommand11.wasSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand11.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNotNull(reservation10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setHourlyRate((double) (byte) 100);
        boolean boolean4 = reservation1.isDepositLost();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand5 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        boolean boolean6 = cancelBookingCommand5.wasSuccessful();
        boolean boolean7 = cancelBookingCommand5.wasSuccessful();
        boolean boolean8 = cancelBookingCommand5.wasSuccessful();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setAccountType("hi!");
        java.lang.String str5 = reservation2.getUserId();
        boolean boolean6 = reservation2.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod7 = reservation2.getPaymentMethod();
        reservation2.setAccountType("hi!");
        java.lang.String str10 = reservation2.getAccountType();
        java.time.LocalDateTime localDateTime11 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand12 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService1, reservation2, localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand15 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation2, localDateTime13, localDateTime14);
        boolean boolean16 = editBookingCommand15.wasSuccessful();
        boolean boolean17 = editBookingCommand15.wasSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            editBookingCommand15.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.editBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(paymentMethod7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
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
        boolean boolean30 = occupancySensor4.isOccupied();
        occupancySensor4.setRoomId("Booking complete");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Pending", (int) (byte) 1, true, "hi!", "Pending");
        room6.setRoomNumber("Booking complete");
        room6.setName("Checked in.");
        boolean boolean11 = room6.isEnabled();
        room6.setClosedForMaintenance(false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        reservation0.setCheckedIn(true);
        boolean boolean11 = reservation0.isCheckedIn();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("partner", "Cancelled", "Booking confirmed.", false, true, "staff");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        com.conferenceroomscheduler.model.Reservation reservation0 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext1 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState2 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext1.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState2);
        com.conferenceroomscheduler.patterns.BookingState bookingState4 = bookingContext1.getState();
        java.lang.String str5 = bookingContext1.getStatus();
        bookingContext1.request();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState7 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation8 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext9 = new com.conferenceroomscheduler.patterns.BookingContext(reservation8);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState10 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext9.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState10);
        com.conferenceroomscheduler.patterns.BookingState bookingState12 = bookingContext9.getState();
        com.conferenceroomscheduler.model.Reservation reservation13 = bookingContext9.getReservation();
        cancelledBookingState7.handle(bookingContext9);
        java.lang.String str15 = cancelledBookingState7.getName();
        java.lang.String str16 = cancelledBookingState7.getName();
        java.lang.String str17 = cancelledBookingState7.getName();
        bookingContext1.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState7);
        com.conferenceroomscheduler.model.Reservation reservation19 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext20 = new com.conferenceroomscheduler.patterns.BookingContext(reservation19);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState21 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext20.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState21);
        com.conferenceroomscheduler.patterns.BookingState bookingState23 = bookingContext20.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState24 = bookingContext20.getState();
        bookingContext20.request();
        com.conferenceroomscheduler.model.Reservation reservation26 = bookingContext20.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation27 = bookingContext20.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation28 = bookingContext20.getReservation();
        cancelledBookingState7.handle(bookingContext20);
        bookingContext20.request();
        org.junit.Assert.assertNotNull(bookingState4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cancelled" + "'", str5, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState12);
        org.junit.Assert.assertNull(reservation13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cancelled" + "'", str15, "Cancelled");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cancelled" + "'", str16, "Cancelled");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cancelled" + "'", str17, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertNotNull(bookingState24);
        org.junit.Assert.assertNull(reservation26);
        org.junit.Assert.assertNull(reservation27);
        org.junit.Assert.assertNull(reservation28);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("Verified badge detected for ADMIN-69.", "faculty", "Checked in.", true, false, "student");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("faculty", "partner", 0, "ADMIN-69", "");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Unverified badge detected for Cancelled.", "Pending", (int) (short) 100, "hi!", "staff");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Cancelled", "partner", true);
        badgeScan3.setRoomId("Checked in.");
        badgeScan3.setRoomId("Booking confirmed.");
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "Checked in.", true);
        badgeScan3.setVerified(false);
        java.lang.String str6 = badgeScan3.getRoomId();
        boolean boolean7 = badgeScan3.isVerified();
        badgeScan3.setRoomId("Cancelled");
        badgeScan3.setRoomId("ADMIN-69");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Checked in." + "'", str6, "Checked in.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getOrganizerId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.lang.String str11 = bookingRequest7.getTitle();
        int int12 = bookingRequest7.getAttendeeCount();
        java.lang.String str13 = bookingRequest7.getRoomId();
        java.lang.String str14 = bookingRequest7.getRoomId();
        java.lang.String str15 = bookingRequest7.getRequestId();
        java.lang.String str16 = bookingRequest7.getRoomId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cancelled" + "'", str14, "Cancelled");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cancelled" + "'", str16, "Cancelled");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setRoomId("hi!");
        java.lang.String str6 = reservation0.getReservationId();
        reservation0.setExtended(true);
        double double9 = reservation0.getHourlyRate();
        java.time.LocalDateTime localDateTime10 = reservation0.getEndTime();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("partner", "Verified badge detected for Checked in..", false);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Verified badge detected for ADMIN-69.", "Checked in.", "student", true, true, "Booking confirmed.");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setFinalAmount((double) ' ');
        java.lang.String str9 = reservation0.getTitle();
        java.lang.String str10 = reservation0.getUserId();
        reservation0.setAccountType("Verified badge detected for ADMIN-69.");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor9 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean14 = occupancySensor13.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher15 = null;
        occupancySensor13.subject = checkInPublisher15;
        occupancySensor13.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher19 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor23 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher24 = null;
        occupancySensor23.setSubject(checkInPublisher24);
        occupancySensor23.occupied = true;
        occupancySensor23.setDetected(false);
        checkInPublisher19.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor23);
        occupancySensor13.setSubject(checkInPublisher19);
        occupancySensor9.setSubject(checkInPublisher19);
        occupancySensor3.setSubject(checkInPublisher19);
        occupancySensor3.setRoomId("ADMIN-69");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState0 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext2 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState3 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext2.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState3);
        completedBookingState0.handle(bookingContext2);
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState6 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        java.lang.String str7 = completedBookingState6.getName();
        java.lang.String str8 = completedBookingState6.getName();
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
        java.lang.String str19 = checkedInBookingState9.getName();
        com.conferenceroomscheduler.model.Reservation reservation20 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext21 = new com.conferenceroomscheduler.patterns.BookingContext(reservation20);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState22 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext21.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState22);
        com.conferenceroomscheduler.model.Reservation reservation24 = bookingContext21.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation25 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext26 = new com.conferenceroomscheduler.patterns.BookingContext(reservation25);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState27 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext26.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState27);
        com.conferenceroomscheduler.patterns.BookingState bookingState29 = bookingContext26.getState();
        bookingContext21.setState(bookingState29);
        checkedInBookingState9.handle(bookingContext21);
        com.conferenceroomscheduler.model.Reservation reservation32 = bookingContext21.getReservation();
        completedBookingState6.handle(bookingContext21);
        java.lang.String str34 = completedBookingState6.getName();
        bookingContext2.setState((com.conferenceroomscheduler.patterns.BookingState) completedBookingState6);
        java.lang.String str36 = completedBookingState6.getName();
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState37 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation38 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext39 = new com.conferenceroomscheduler.patterns.BookingContext(reservation38);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState40 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext39.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState40);
        completedBookingState37.handle(bookingContext39);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState43 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation44 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext45 = new com.conferenceroomscheduler.patterns.BookingContext(reservation44);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState46 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext45.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState46);
        com.conferenceroomscheduler.patterns.BookingState bookingState48 = bookingContext45.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState49 = bookingContext45.getState();
        cancelledBookingState43.handle(bookingContext45);
        completedBookingState37.handle(bookingContext45);
        bookingContext45.request();
        completedBookingState6.handle(bookingContext45);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking complete" + "'", str7, "Booking complete");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking complete" + "'", str8, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Checked in." + "'", str19, "Checked in.");
        org.junit.Assert.assertNull(reservation24);
        org.junit.Assert.assertNotNull(bookingState29);
        org.junit.Assert.assertNull(reservation32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Booking complete" + "'", str34, "Booking complete");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Booking complete" + "'", str36, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState48);
        org.junit.Assert.assertNotNull(bookingState49);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "", "Booking complete", "Checked in.", (int) (byte) 1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getOrganizerId();
        java.lang.String str9 = bookingRequest7.getRequestId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking complete" + "'", str8, "Booking complete");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = null;
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime5, localDateTime6, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod11);
        reservation12.setDepositLost(true);
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand16 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation12, localDateTime15);
        java.lang.String str17 = reservation12.getUserId();
        boolean boolean18 = reservation12.isExtended();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cancelled" + "'", str17, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        java.lang.String str3 = reservation0.getUserId();
        boolean boolean4 = reservation0.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation0.getPaymentMethod();
        reservation0.setUserId("");
        boolean boolean8 = reservation0.isExtended();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("Unverified badge detected for .", "Cancelled", "", false, false, "Checked in.");
        facultyAccount6.setVerified(true);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount6.setVerified(false);
        java.lang.String str9 = adminAccount6.getAccountId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        java.lang.String str6 = occupancySensor3.getRoomId();
        occupancySensor3.roomId = "hi!";
        com.conferenceroomscheduler.model.Badge badge12 = new com.conferenceroomscheduler.model.Badge("Checked in.", "Pending", true);
        java.lang.String str13 = badge12.getAccountId();
        boolean boolean14 = occupancySensor3.scanIdBadge(badge12);
        java.lang.String str15 = badge12.getAccountId();
        badge12.setEmail("Unverified badge detected for .");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pending" + "'", str13, "Pending");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Pending" + "'", str15, "Pending");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState0 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext2 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState3 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext2.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState3);
        com.conferenceroomscheduler.patterns.BookingState bookingState5 = bookingContext2.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState6 = bookingContext2.getState();
        cancelledBookingState0.handle(bookingContext2);
        java.lang.String str8 = cancelledBookingState0.getName();
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState9 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str10 = confirmedBookingState9.getName();
        java.lang.String str11 = confirmedBookingState9.getName();
        java.lang.String str12 = confirmedBookingState9.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState13 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState14 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation15 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext16 = new com.conferenceroomscheduler.patterns.BookingContext(reservation15);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState17 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext16.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState17);
        com.conferenceroomscheduler.patterns.BookingState bookingState19 = bookingContext16.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState20 = bookingContext16.getState();
        cancelledBookingState14.handle(bookingContext16);
        checkedInBookingState13.handle(bookingContext16);
        java.lang.String str23 = checkedInBookingState13.getName();
        com.conferenceroomscheduler.model.Reservation reservation24 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext25 = new com.conferenceroomscheduler.patterns.BookingContext(reservation24);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState26 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext25.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState26);
        com.conferenceroomscheduler.model.Reservation reservation28 = bookingContext25.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation29 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext30 = new com.conferenceroomscheduler.patterns.BookingContext(reservation29);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState31 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext30.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState31);
        com.conferenceroomscheduler.patterns.BookingState bookingState33 = bookingContext30.getState();
        bookingContext25.setState(bookingState33);
        checkedInBookingState13.handle(bookingContext25);
        com.conferenceroomscheduler.model.Reservation reservation36 = bookingContext25.getReservation();
        confirmedBookingState9.handle(bookingContext25);
        java.lang.String str38 = confirmedBookingState9.getName();
        java.lang.String str39 = confirmedBookingState9.getName();
        java.lang.String str40 = confirmedBookingState9.getName();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState41 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation42 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext43 = new com.conferenceroomscheduler.patterns.BookingContext(reservation42);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState44 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext43.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState44);
        com.conferenceroomscheduler.patterns.BookingState bookingState46 = bookingContext43.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState47 = bookingContext43.getState();
        cancelledBookingState41.handle(bookingContext43);
        com.conferenceroomscheduler.patterns.BookingState bookingState49 = bookingContext43.getState();
        bookingContext43.request();
        confirmedBookingState9.handle(bookingContext43);
        com.conferenceroomscheduler.patterns.BookingState bookingState52 = bookingContext43.getState();
        cancelledBookingState0.handle(bookingContext43);
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState54 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation55 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext56 = new com.conferenceroomscheduler.patterns.BookingContext(reservation55);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState57 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext56.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState57);
        completedBookingState54.handle(bookingContext56);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState60 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation61 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext62 = new com.conferenceroomscheduler.patterns.BookingContext(reservation61);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState63 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext62.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState63);
        com.conferenceroomscheduler.patterns.BookingState bookingState65 = bookingContext62.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState66 = bookingContext62.getState();
        cancelledBookingState60.handle(bookingContext62);
        completedBookingState54.handle(bookingContext62);
        com.conferenceroomscheduler.model.Reservation reservation69 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext70 = new com.conferenceroomscheduler.patterns.BookingContext(reservation69);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState71 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext70.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState71);
        com.conferenceroomscheduler.patterns.BookingState bookingState73 = bookingContext70.getState();
        com.conferenceroomscheduler.model.Reservation reservation74 = bookingContext70.getReservation();
        completedBookingState54.handle(bookingContext70);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState76 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation77 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext78 = new com.conferenceroomscheduler.patterns.BookingContext(reservation77);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState79 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext78.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState79);
        com.conferenceroomscheduler.patterns.BookingState bookingState81 = bookingContext78.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState82 = bookingContext78.getState();
        cancelledBookingState76.handle(bookingContext78);
        com.conferenceroomscheduler.model.Reservation reservation84 = bookingContext78.getReservation();
        completedBookingState54.handle(bookingContext78);
        cancelledBookingState0.handle(bookingContext78);
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking confirmed." + "'", str10, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking confirmed." + "'", str11, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking confirmed." + "'", str12, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState19);
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Checked in." + "'", str23, "Checked in.");
        org.junit.Assert.assertNull(reservation28);
        org.junit.Assert.assertNotNull(bookingState33);
        org.junit.Assert.assertNull(reservation36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Booking confirmed." + "'", str38, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Booking confirmed." + "'", str39, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Booking confirmed." + "'", str40, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState46);
        org.junit.Assert.assertNotNull(bookingState47);
        org.junit.Assert.assertNotNull(bookingState49);
        org.junit.Assert.assertNotNull(bookingState52);
        org.junit.Assert.assertNotNull(bookingState65);
        org.junit.Assert.assertNotNull(bookingState66);
        org.junit.Assert.assertNotNull(bookingState73);
        org.junit.Assert.assertNull(reservation74);
        org.junit.Assert.assertNotNull(bookingState81);
        org.junit.Assert.assertNotNull(bookingState82);
        org.junit.Assert.assertNull(reservation84);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator0 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor1 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor1);
        roomSensor1.update("Booking confirmed.");
        roomSensor1.update("Checked in.");
        roomSensor1.update("staff");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        room6.setCapacity((int) '4');
        room6.setName("hi!");
        room6.setRoomId("partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        java.lang.String str10 = reservation0.getRoomId();
        reservation0.setReservationId("student");
        reservation0.setCanceled(true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("student", "student", "partner", true, true, "admin");
        java.lang.String str7 = adminAccount6.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
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
        com.conferenceroomscheduler.patterns.BookingState bookingState23 = bookingContext12.getState();
        java.lang.Class<?> wildcardClass24 = bookingContext12.getClass();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Checked in." + "'", str10, "Checked in.");
        org.junit.Assert.assertNull(reservation15);
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        room6.setClosedForMaintenance(false);
        room6.setEnabled(true);
        java.lang.String str17 = room6.getRoomNumber();
        boolean boolean18 = room6.isClosedForMaintenance();
        java.lang.String str19 = room6.getBuilding();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor20 = room6.getOccupancySensor();
        boolean boolean21 = room6.isClosedForMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(occupancySensor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        com.conferenceroomscheduler.model.Badge badge7 = studentAccount6.getBadge();
        badge7.setEmail("Pending");
        java.lang.String str10 = badge7.getEmail();
        java.lang.String str11 = badge7.getEmail();
        org.junit.Assert.assertNotNull(badge7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Pending" + "'", str10, "Pending");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pending" + "'", str11, "Pending");
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        java.lang.String str6 = badgeScan3.getBadgeId();
        boolean boolean7 = badgeScan3.isVerified();
        badgeScan3.setRoomId("Unverified badge detected for admin.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Booking complete", "hi!", "student", true, false, "Checked in.");
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Booking complete", "Cancelled", (int) (short) 1, "Booking complete", "");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("ADMIN-69", "Pending", 10, "hi!", "");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("student", "", (int) (byte) 10, "Unverified badge detected for Cancelled.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room30 = roomFactory0.createRoom("Pending", "hi!", (-1), "", "faculty");
        room30.setCapacity((int) (byte) 10);
        com.conferenceroomscheduler.model.StudentAccount studentAccount39 = new com.conferenceroomscheduler.model.StudentAccount("", "Pending", "", true, false, "Pending");
        room30.checkIn((com.conferenceroomscheduler.model.Account) studentAccount39);
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
        org.junit.Assert.assertNotNull(room30);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setEnabled(true);
        java.lang.String str13 = room6.getName();
        boolean boolean14 = room6.isEnabled();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor15 = room6.getOccupancySensor();
        room6.setCapacity((int) (short) 100);
        java.lang.String str18 = room6.getRoomId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(occupancySensor15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("Unverified badge detected for .", "Unverified badge detected for Cancelled.", "Booking complete", false, false, "Checked in.");
        facultyAccount6.setIdentifier("Unverified badge detected for admin.");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("ADMIN-69", "Pending", "", false, false, "Booking complete");
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        reservation0.setTitle("Booking confirmed.");
        reservation0.setDepositLost(false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        occupancySensor3.occupied = true;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor11 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount18 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean19 = occupancySensor11.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount18);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher20 = null;
        occupancySensor11.setSubject(checkInPublisher20);
        occupancySensor11.isDetected = false;
        boolean boolean24 = occupancySensor11.isOccupied();
        com.conferenceroomscheduler.model.Badge badge28 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str29 = badge28.getEmail();
        boolean boolean30 = occupancySensor11.scanIdBadge(badge28);
        badge28.setAccountId("hi!");
        java.lang.String str33 = badge28.getAccountId();
        badge28.setEmail("admin");
        boolean boolean36 = occupancySensor3.scanIdBadge(badge28);
        occupancySensor3.setRoomId("partner");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Cancelled" + "'", str29, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        double double8 = reservation1.getFinalAmount();
        reservation1.setCanceled(false);
        reservation1.setCanceled(true);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand15 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime16 = reservation1.getStartTime();
        reservation1.setAccountType("Unverified badge detected for Cancelled.");
        reservation1.setAccountType("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        room6.setBuilding("partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("", "Booking complete", "Cancelled", true, false, "hi!");
        staffAccount6.setIdentifier("");
        boolean boolean9 = staffAccount6.isVerified();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        java.lang.String str8 = room6.getBuilding();
        java.lang.String str9 = room6.getRoomNumber();
        java.lang.String str10 = room6.getRoomNumber();
        room6.setRoomId("Pending");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        java.time.LocalDateTime localDateTime10 = reservation0.getStartTime();
        boolean boolean11 = reservation0.isExtended();
        boolean boolean12 = reservation0.isCheckedIn();
        reservation0.setExtended(true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Verified badge detected for ADMIN-69.", "faculty", "partner", true, false, "Cancelled");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean4 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor3.subject = checkInPublisher5;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher7 = occupancySensor3.getSubject();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor11 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean12 = occupancySensor11.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher13 = null;
        occupancySensor11.subject = checkInPublisher13;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher15 = occupancySensor11.getSubject();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher16 = occupancySensor11.getSubject();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor20 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher21 = null;
        occupancySensor20.setSubject(checkInPublisher21);
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
        occupancySensor20.setSubject(checkInPublisher36);
        occupancySensor11.setSubject(checkInPublisher36);
        occupancySensor3.setSubject(checkInPublisher36);
        java.lang.String str53 = occupancySensor3.getRoomId();
        com.conferenceroomscheduler.model.AdminAccount adminAccount54 = new com.conferenceroomscheduler.model.AdminAccount();
        boolean boolean55 = adminAccount54.isVerified();
        adminAccount54.setUniversityAccount(false);
        com.conferenceroomscheduler.model.Badge badge58 = adminAccount54.getBadge();
        com.conferenceroomscheduler.model.Badge badge59 = adminAccount54.getBadge();
        boolean boolean60 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount54);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(checkInPublisher7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(checkInPublisher15);
        org.junit.Assert.assertNull(checkInPublisher16);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Pending" + "'", str53, "Pending");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(badge58);
        org.junit.Assert.assertNull(badge59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setReservationId("Checked in.");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod19 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation20 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime13, localDateTime14, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod19);
        reservation0.setPaymentMethod(paymentMethod19);
        java.time.LocalDateTime localDateTime22 = reservation0.getEndTime();
        reservation0.setDepositAmount((double) ' ');
        reservation0.setRoomId("hi!");
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + paymentMethod19 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod19.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("Verified badge detected for ADMIN-69.", "faculty", "", false, true, "Checked in.");
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
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
        reservation0.setCanceled(true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("hi!", "admin", true);
        badge3.setEmail("Cancelled");
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        boolean boolean11 = room6.isEnabled();
        boolean boolean12 = room6.isClosedForMaintenance();
        int int13 = room6.getCapacity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        room6.setBuilding("Booking complete");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor21 = room6.getOccupancySensor();
        boolean boolean22 = occupancySensor21.isOccupied();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(occupancySensor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) 10);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("Cancelled", 1.0d);
        boolean boolean9 = creditCardPaymentStrategy0.processPayment("Cancelled", (double) 100);
        boolean boolean12 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) (short) -1);
        boolean boolean15 = creditCardPaymentStrategy0.processPayment("admin", (double) 100.0f);
        boolean boolean18 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        badge3.setAccountId("Checked in.");
        java.lang.String str6 = badge3.getAccountId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Checked in." + "'", str6, "Checked in.");
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
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
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher89 = occupancySensor3.subject;
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
        org.junit.Assert.assertNotNull(checkInPublisher89);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setDepositAmount(0.0d);
        reservation1.setAccountType("");
        java.lang.String str9 = reservation1.getUserId();
        reservation1.setDepositAmount((double) (short) 100);
        boolean boolean12 = reservation1.isCanceled();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand13 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        // The following exception was thrown during execution in test generation
        try {
            createBookingCommand13.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.addReservation(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        java.lang.String str8 = reservation1.getAccountType();
        double double9 = reservation1.getFinalAmount();
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
        reservation1.setPaymentMethod(paymentMethod33);
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand39 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime37, localDateTime38);
        // The following exception was thrown during execution in test generation
        try {
            editBookingCommand39.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.editBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod33 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod33.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Booking confirmed.", "", "Booking confirmed.", true, true, "hi!");
        boolean boolean7 = partnerAccount6.isVerified();
        partnerAccount6.setPassword("");
        java.lang.String str10 = partnerAccount6.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
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
        boolean boolean15 = reservation1.isCheckedIn();
        java.lang.String str16 = reservation1.getAccountType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        java.lang.String str6 = badgeScan3.getBadgeId();
        java.lang.String str7 = badgeScan3.getRoomId();
        java.lang.String str8 = badgeScan3.getRoomId();
        badgeScan3.setVerified(true);
        badgeScan3.setRoomId("Booking complete");
        boolean boolean13 = badgeScan3.isVerified();
        boolean boolean14 = badgeScan3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
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
        occupancySensor48.setDetected(true);
        java.lang.String str56 = occupancySensor48.getLastEvent();
        occupancySensor48.setOccupied(true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(checkInPublisher52);
        org.junit.Assert.assertNull(str56);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("staff", false, true);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setRoomId("hi!");
        java.lang.String str6 = reservation0.getReservationId();
        double double7 = reservation0.getHourlyRate();
        double double8 = reservation0.getHourlyRate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
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
        com.conferenceroomscheduler.model.Reservation reservation30 = new com.conferenceroomscheduler.model.Reservation("Unverified badge detected for admin.", "Unverified badge detected for .", "staff", "Verified badge detected for ADMIN-69.", localDateTime4, localDateTime5, "Unverified badge detected for Cancelled.", (double) 10, (double) '4', 0.0d, paymentMethod27);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + paymentMethod27 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod27.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getOrganizerId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.lang.String str11 = bookingRequest7.getTitle();
        java.lang.String str12 = bookingRequest7.getRoomId();
        java.lang.String str13 = bookingRequest7.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cancelled" + "'", str12, "Cancelled");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "hi!", "Booking complete", "Unverified badge detected for .", (int) (byte) 10, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.time.LocalDateTime localDateTime9 = bookingRequest7.getStartTime();
        java.lang.String str10 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking complete" + "'", str10, "Booking complete");
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator0 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor1 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor1);
        roomSensor1.update("Booking confirmed.");
        roomSensor1.update("Checked in.");
        roomSensor1.update("Verified badge detected for ADMIN-69.");
        roomSensor1.update("ADMIN-69");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, true);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        java.lang.String str6 = badgeScan3.getBadgeId();
        boolean boolean7 = badgeScan3.isVerified();
        java.lang.String str8 = badgeScan3.getBadgeId();
        badgeScan3.setBadgeId("partner");
        badgeScan3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        badgeScan3.setVerified(false);
        badgeScan3.setVerified(false);
        badgeScan3.setRoomId("hi!");
        boolean boolean12 = badgeScan3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("faculty", "Pending", (int) '#', "Cancelled", "Pending");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("admin", "Booking complete", (int) (byte) 1, "hi!", "Checked in.");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("faculty", "admin", (int) (byte) 100, "hi!", "Checked in.");
        com.conferenceroomscheduler.model.Room room30 = roomFactory0.createRoom("Checked in.", "admin", (int) (short) 1, "Cancelled", "Booking confirmed.");
        room30.setBuilding("student");
        room30.setCapacity(0);
        java.lang.String str35 = room30.getRoomId();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
        org.junit.Assert.assertNotNull(room30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Checked in." + "'", str35, "Checked in.");
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        java.lang.String str4 = reservation1.getUserId();
        boolean boolean5 = reservation1.isDepositLost();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand8 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime6, localDateTime7);
        reservation1.setRoomId("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getTitle();
        double double5 = reservation2.getDepositAmount();
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand7 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation2, localDateTime6);
        java.time.LocalDateTime localDateTime8 = reservation2.getEndTime();
        java.time.LocalDateTime localDateTime9 = null;
        reservation2.setEndTime(localDateTime9);
        java.lang.String str11 = reservation2.getTitle();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setRoomId("hi!");
        java.time.LocalDateTime localDateTime5 = null;
        reservation0.setStartTime(localDateTime5);
        reservation0.setTitle("Unverified badge detected for .");
        java.lang.String str9 = reservation0.getTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Unverified badge detected for ." + "'", str9, "Unverified badge detected for .");
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = null;
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime5, localDateTime6, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod11);
        reservation12.setDepositLost(true);
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand16 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation12, localDateTime15);
        reservation12.setHourlyRate((double) (-1.0f));
        reservation12.setRoomId("admin");
        java.lang.String str21 = reservation12.getTitle();
        boolean boolean22 = reservation12.isExtended();
        java.lang.String str23 = reservation12.getReservationId();
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        java.lang.String str11 = room6.getName();
        room6.setEnabled(true);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor14 = room6.getOccupancySensor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cancelled" + "'", str11, "Cancelled");
        org.junit.Assert.assertNotNull(occupancySensor14);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService20 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod31 = null;
        com.conferenceroomscheduler.model.Reservation reservation32 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime25, localDateTime26, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod31);
        reservation32.setDepositLost(true);
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand35 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService20, reservation32);
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService36 = null;
        com.conferenceroomscheduler.model.Reservation reservation37 = new com.conferenceroomscheduler.model.Reservation();
        reservation37.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod40 = reservation37.getPaymentMethod();
        reservation37.setDepositAmount(0.0d);
        java.lang.String str43 = reservation37.getReservationId();
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand46 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService36, reservation37, localDateTime44, localDateTime45);
        com.conferenceroomscheduler.model.Reservation reservation47 = new com.conferenceroomscheduler.model.Reservation();
        reservation47.setFinalAmount((double) (byte) 100);
        reservation47.setRoomId("hi!");
        reservation47.setRoomId("Booking confirmed.");
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime59 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod64 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation65 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime58, localDateTime59, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod64);
        reservation47.setPaymentMethod(paymentMethod64);
        reservation37.setPaymentMethod(paymentMethod64);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod68 = reservation37.getPaymentMethod();
        reservation32.setPaymentMethod(paymentMethod68);
        com.conferenceroomscheduler.model.Reservation reservation70 = new com.conferenceroomscheduler.model.Reservation("admin", "Pending", "Cancelled", "Cancelled", localDateTime14, localDateTime15, "Booking confirmed.", 10.0d, (double) (-1.0f), (double) 0.0f, paymentMethod68);
        com.conferenceroomscheduler.model.Reservation reservation71 = new com.conferenceroomscheduler.model.Reservation("staff", "Booking complete", "Checked in.", "Unverified badge detected for Cancelled.", localDateTime4, localDateTime5, "Unverified badge detected for .", (double) ' ', (double) 100L, (double) (-1.0f), paymentMethod68);
        reservation71.setUserId("ADMIN-69");
        org.junit.Assert.assertNull(paymentMethod40);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + paymentMethod64 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod64.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertTrue("'" + paymentMethod68 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod68.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        java.time.LocalDateTime localDateTime1 = null;
        reservation0.setEndTime(localDateTime1);
        java.time.LocalDateTime localDateTime3 = reservation0.getStartTime();
        reservation0.setHourlyRate((double) (short) -1);
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService6 = null;
        com.conferenceroomscheduler.model.Reservation reservation7 = new com.conferenceroomscheduler.model.Reservation();
        reservation7.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod10 = reservation7.getPaymentMethod();
        reservation7.setDepositAmount(0.0d);
        java.lang.String str13 = reservation7.getReservationId();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand16 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService6, reservation7, localDateTime14, localDateTime15);
        java.time.LocalDateTime localDateTime17 = reservation7.getEndTime();
        com.conferenceroomscheduler.model.Reservation reservation18 = new com.conferenceroomscheduler.model.Reservation();
        reservation18.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod21 = reservation18.getPaymentMethod();
        reservation18.setFinalAmount((double) (byte) 1);
        java.lang.String str24 = reservation18.getRoomId();
        reservation18.setCheckedIn(true);
        reservation18.setDepositAmount((double) 10.0f);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod29 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        reservation18.setPaymentMethod(paymentMethod29);
        reservation7.setPaymentMethod(paymentMethod29);
        reservation0.setPaymentMethod(paymentMethod29);
        org.junit.Assert.assertNull(localDateTime3);
        org.junit.Assert.assertNull(paymentMethod10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(paymentMethod21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + paymentMethod29 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod29.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        room6.setCapacity((int) '4');
        room6.setName("Cancelled");
        room6.setRoomNumber("student");
        java.lang.String str17 = room6.getBuilding();
        int int18 = room6.getCapacity();
        com.conferenceroomscheduler.model.StudentAccount studentAccount25 = new com.conferenceroomscheduler.model.StudentAccount("", "Booking confirmed.", "hi!", false, true, "Checked in.");
        studentAccount25.setUniversityAccount(false);
        studentAccount25.setEmail("Checked in.");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount25);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str1 = adminAccount0.getEmail();
        com.conferenceroomscheduler.model.Badge badge2 = adminAccount0.getBadge();
        java.lang.String str3 = adminAccount0.getPassword();
        adminAccount0.setAccountType("Unverified badge detected for Cancelled.");
        adminAccount0.setIdentifier("partner");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(badge2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setBuilding("hi!");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = room6.getOccupancySensor();
        occupancySensor10.occupied = false;
        java.lang.String str13 = occupancySensor10.roomId;
        occupancySensor10.setRoomId("faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(occupancySensor10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getReservationId();
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService4 = null;
        com.conferenceroomscheduler.model.Reservation reservation5 = new com.conferenceroomscheduler.model.Reservation();
        reservation5.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod8 = reservation5.getPaymentMethod();
        reservation5.setDepositAmount(0.0d);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand13 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService4, reservation5, localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod34 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation35 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime28, localDateTime29, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod34);
        com.conferenceroomscheduler.model.Reservation reservation36 = new com.conferenceroomscheduler.model.Reservation("", "Pending", "Pending", "Booking complete", localDateTime18, localDateTime19, "Booking confirmed.", (double) 0.0f, (double) 1, (double) (byte) 100, paymentMethod34);
        reservation5.setPaymentMethod(paymentMethod34);
        reservation1.setPaymentMethod(paymentMethod34);
        double double39 = reservation1.getFinalAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(paymentMethod8);
        org.junit.Assert.assertTrue("'" + paymentMethod34 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod34.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        java.lang.String str12 = occupancySensor3.roomId;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor16 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount23 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean24 = occupancySensor16.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount23);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher25 = null;
        occupancySensor16.setSubject(checkInPublisher25);
        occupancySensor16.isDetected = false;
        boolean boolean29 = occupancySensor16.isOccupied();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor33 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor37 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean38 = occupancySensor37.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher39 = null;
        occupancySensor37.subject = checkInPublisher39;
        occupancySensor37.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher43 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor47 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher48 = null;
        occupancySensor47.setSubject(checkInPublisher48);
        occupancySensor47.occupied = true;
        occupancySensor47.setDetected(false);
        checkInPublisher43.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor47);
        occupancySensor37.setSubject(checkInPublisher43);
        occupancySensor33.setSubject(checkInPublisher43);
        occupancySensor16.subject = checkInPublisher43;
        com.conferenceroomscheduler.model.AdminAccount adminAccount64 = new com.conferenceroomscheduler.model.AdminAccount("hi!", "", "hi!", true, false, "hi!");
        adminAccount64.setAccountNumber("Cancelled");
        checkInPublisher43.notifyObservers((com.conferenceroomscheduler.model.Account) adminAccount64);
        occupancySensor3.setSubject(checkInPublisher43);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher69 = occupancySensor3.getSubject();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher70 = occupancySensor3.getSubject();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pending" + "'", str12, "Pending");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(checkInPublisher69);
        org.junit.Assert.assertNotNull(checkInPublisher70);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
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
        com.conferenceroomscheduler.model.Reservation reservation20 = new com.conferenceroomscheduler.model.Reservation();
        reservation20.setFinalAmount((double) (byte) 100);
        reservation20.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext25 = new com.conferenceroomscheduler.patterns.BookingContext(reservation20);
        checkedInBookingState10.handle(bookingContext25);
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState27 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation28 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext29 = new com.conferenceroomscheduler.patterns.BookingContext(reservation28);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState30 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext29.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState30);
        completedBookingState27.handle(bookingContext29);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState33 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation34 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext35 = new com.conferenceroomscheduler.patterns.BookingContext(reservation34);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState36 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext35.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState36);
        com.conferenceroomscheduler.patterns.BookingState bookingState38 = bookingContext35.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState39 = bookingContext35.getState();
        cancelledBookingState33.handle(bookingContext35);
        completedBookingState27.handle(bookingContext35);
        com.conferenceroomscheduler.model.Reservation reservation42 = bookingContext35.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation43 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext44 = new com.conferenceroomscheduler.patterns.BookingContext(reservation43);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState45 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext44.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState45);
        com.conferenceroomscheduler.model.Reservation reservation47 = bookingContext44.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation48 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext49 = new com.conferenceroomscheduler.patterns.BookingContext(reservation48);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState50 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext49.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState50);
        com.conferenceroomscheduler.patterns.BookingState bookingState52 = bookingContext49.getState();
        bookingContext44.setState(bookingState52);
        bookingContext35.setState(bookingState52);
        checkedInBookingState10.handle(bookingContext35);
        checkedInBookingState0.handle(bookingContext35);
        java.lang.String str57 = checkedInBookingState0.getName();
        java.lang.String str58 = checkedInBookingState0.getName();
        java.lang.String str59 = checkedInBookingState0.getName();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertNotNull(bookingState17);
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertNotNull(bookingState39);
        org.junit.Assert.assertNull(reservation42);
        org.junit.Assert.assertNull(reservation47);
        org.junit.Assert.assertNotNull(bookingState52);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Checked in." + "'", str57, "Checked in.");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Checked in." + "'", str58, "Checked in.");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Checked in." + "'", str59, "Checked in.");
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        com.conferenceroomscheduler.model.Reservation reservation0 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext1 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState2 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext1.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState2);
        java.lang.String str4 = cancelledBookingState2.getName();
        java.lang.String str5 = cancelledBookingState2.getName();
        com.conferenceroomscheduler.model.Reservation reservation6 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext7 = new com.conferenceroomscheduler.patterns.BookingContext(reservation6);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState8 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext7.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState8);
        com.conferenceroomscheduler.patterns.BookingState bookingState10 = bookingContext7.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState11 = bookingContext7.getState();
        bookingContext7.request();
        bookingContext7.request();
        cancelledBookingState2.handle(bookingContext7);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState15 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation16 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext17 = new com.conferenceroomscheduler.patterns.BookingContext(reservation16);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState18 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext17.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState18);
        com.conferenceroomscheduler.patterns.BookingState bookingState20 = bookingContext17.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState21 = bookingContext17.getState();
        cancelledBookingState15.handle(bookingContext17);
        java.lang.String str23 = cancelledBookingState15.getName();
        com.conferenceroomscheduler.model.Reservation reservation24 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext25 = new com.conferenceroomscheduler.patterns.BookingContext(reservation24);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState26 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext25.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState26);
        com.conferenceroomscheduler.model.Reservation reservation28 = bookingContext25.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation29 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext30 = new com.conferenceroomscheduler.patterns.BookingContext(reservation29);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState31 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext30.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState31);
        com.conferenceroomscheduler.patterns.BookingState bookingState33 = bookingContext30.getState();
        bookingContext25.setState(bookingState33);
        cancelledBookingState15.handle(bookingContext25);
        com.conferenceroomscheduler.model.Reservation reservation36 = bookingContext25.getReservation();
        cancelledBookingState2.handle(bookingContext25);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cancelled" + "'", str4, "Cancelled");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cancelled" + "'", str5, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState10);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertNotNull(bookingState21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Cancelled" + "'", str23, "Cancelled");
        org.junit.Assert.assertNull(reservation28);
        org.junit.Assert.assertNotNull(bookingState33);
        org.junit.Assert.assertNull(reservation36);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setCheckedIn(true);
        reservation0.setCheckedIn(false);
        reservation0.setReservationId("Booking complete");
        java.lang.String str13 = reservation0.getUserId();
        double double14 = reservation0.getFinalAmount();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getReservationId();
        java.lang.String str4 = reservation1.getTitle();
        boolean boolean5 = reservation1.isExtended();
        reservation1.setTitle("ADMIN-69");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        java.lang.String str7 = reservation0.getAccountType();
        reservation0.setExtended(false);
        java.lang.String str10 = reservation0.getTitle();
        java.time.LocalDateTime localDateTime11 = reservation0.getEndTime();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
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
        boolean boolean20 = room6.isClosedForMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("faculty", "Pending", false);
        badgeScan3.setBadgeId("ADMIN-69");
        java.lang.String str6 = badgeScan3.getRoomId();
        boolean boolean7 = badgeScan3.isVerified();
        badgeScan3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pending" + "'", str6, "Pending");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "admin", (int) '4', true, "Unverified badge detected for .", "");
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
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
        java.lang.String str15 = bookingRequest7.getOrganizerId();
        java.time.LocalDateTime localDateTime16 = bookingRequest7.getStartTime();
        java.lang.String str17 = bookingRequest7.getRequestId();
        java.lang.String str18 = bookingRequest7.getRoomId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Cancelled" + "'", str18, "Cancelled");
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        java.lang.String str4 = reservation1.getAccountType();
        java.time.LocalDateTime localDateTime5 = reservation1.getEndTime();
        java.lang.String str6 = reservation1.getTitle();
        boolean boolean7 = reservation1.isExtended();
        reservation1.setFinalAmount((double) (short) -1);
        reservation1.setCheckedIn(true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        room6.setClosedForMaintenance(false);
        room6.setEnabled(true);
        java.lang.String str17 = room6.getName();
        room6.setRoomNumber("student");
        java.lang.String str20 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor21 = room6.getOccupancySensor();
        room6.setRoomNumber("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cancelled" + "'", str17, "Cancelled");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(occupancySensor21);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Verified badge detected for ADMIN-69.", "Unverified badge detected for admin.", "Cancelled", false, true, "Pending");
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
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
        java.lang.String str53 = reservation34.getRoomId();
        org.junit.Assert.assertTrue("'" + paymentMethod31 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod31.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertTrue("'" + paymentMethod45 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod45.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Booking complete" + "'", str53, "Booking complete");
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("ADMIN-69", "student", "partner", false, true, "admin");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("", "Unverified badge detected for Cancelled.", "hi!", true, false, "student");
        java.lang.String str7 = adminAccount6.getAccountNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("Unverified badge detected for .", "", "Booking complete", true, false, "Booking complete");
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setName("hi!");
        room6.setName("");
        boolean boolean11 = room6.isClosedForMaintenance();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor12 = room6.getOccupancySensor();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = room6.getOccupancySensor();
        boolean boolean14 = room6.isEnabled();
        java.lang.String str15 = room6.getName();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(occupancySensor12);
        org.junit.Assert.assertNotNull(occupancySensor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getReservationId();
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setDepositLost(true);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod7 = reservation1.getPaymentMethod();
        boolean boolean8 = reservation1.isExtended();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(paymentMethod7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService10 = null;
        com.conferenceroomscheduler.model.Reservation reservation11 = new com.conferenceroomscheduler.model.Reservation();
        reservation11.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod14 = reservation11.getPaymentMethod();
        reservation11.setDepositAmount(0.0d);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand19 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService10, reservation11, localDateTime17, localDateTime18);
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod40 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation41 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime34, localDateTime35, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod40);
        com.conferenceroomscheduler.model.Reservation reservation42 = new com.conferenceroomscheduler.model.Reservation("", "Pending", "Pending", "Booking complete", localDateTime24, localDateTime25, "Booking confirmed.", (double) 0.0f, (double) 1, (double) (byte) 100, paymentMethod40);
        reservation11.setPaymentMethod(paymentMethod40);
        com.conferenceroomscheduler.model.Reservation reservation44 = new com.conferenceroomscheduler.model.Reservation("Verified badge detected for Checked in..", "Booking complete", "Booking complete", "admin", localDateTime4, localDateTime5, "", (double) 0, 0.0d, (double) 0.0f, paymentMethod40);
        org.junit.Assert.assertNull(paymentMethod14);
        org.junit.Assert.assertTrue("'" + paymentMethod40 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod40.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState0 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState1 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState2 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation3 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext4 = new com.conferenceroomscheduler.patterns.BookingContext(reservation3);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState5 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext4.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState5);
        com.conferenceroomscheduler.patterns.BookingState bookingState7 = bookingContext4.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState8 = bookingContext4.getState();
        cancelledBookingState2.handle(bookingContext4);
        checkedInBookingState1.handle(bookingContext4);
        com.conferenceroomscheduler.model.Reservation reservation11 = new com.conferenceroomscheduler.model.Reservation();
        reservation11.setFinalAmount((double) (byte) 100);
        reservation11.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext16 = new com.conferenceroomscheduler.patterns.BookingContext(reservation11);
        checkedInBookingState1.handle(bookingContext16);
        cancelledBookingState0.handle(bookingContext16);
        com.conferenceroomscheduler.patterns.BookingState bookingState19 = null;
        bookingContext16.setState(bookingState19);
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState21 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation22 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext23 = new com.conferenceroomscheduler.patterns.BookingContext(reservation22);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState24 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext23.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState24);
        completedBookingState21.handle(bookingContext23);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState27 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation28 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext29 = new com.conferenceroomscheduler.patterns.BookingContext(reservation28);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState30 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext29.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState30);
        com.conferenceroomscheduler.patterns.BookingState bookingState32 = bookingContext29.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState33 = bookingContext29.getState();
        cancelledBookingState27.handle(bookingContext29);
        completedBookingState21.handle(bookingContext29);
        com.conferenceroomscheduler.model.Reservation reservation36 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext37 = new com.conferenceroomscheduler.patterns.BookingContext(reservation36);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState38 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext37.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState38);
        com.conferenceroomscheduler.patterns.BookingState bookingState40 = bookingContext37.getState();
        com.conferenceroomscheduler.model.Reservation reservation41 = bookingContext37.getReservation();
        completedBookingState21.handle(bookingContext37);
        bookingContext16.setState((com.conferenceroomscheduler.patterns.BookingState) completedBookingState21);
        java.lang.String str44 = completedBookingState21.getName();
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertNotNull(bookingState32);
        org.junit.Assert.assertNotNull(bookingState33);
        org.junit.Assert.assertNotNull(bookingState40);
        org.junit.Assert.assertNull(reservation41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Booking complete" + "'", str44, "Booking complete");
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("student", "Checked in.", true);
        boolean boolean4 = badgeScan3.isVerified();
        badgeScan3.setBadgeId("ADMIN-69");
        java.lang.String str7 = badgeScan3.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Checked in." + "'", str7, "Checked in.");
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("ADMIN-69", "Unverified badge detected for admin.", (int) (byte) -1, true, "hi!", "Cancelled");
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
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
        com.conferenceroomscheduler.patterns.BookingContext bookingContext17 = new com.conferenceroomscheduler.patterns.BookingContext(reservation2);
        reservation2.setCanceled(true);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand22 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation2, localDateTime20, localDateTime21);
        // The following exception was thrown during execution in test generation
        try {
            editBookingCommand22.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.editBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Booking confirmed.", "Booking complete", (int) (short) 1, false, "ADMIN-69", "Cancelled");
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor78 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean79 = occupancySensor78.isDetected();
        occupancySensor78.occupied = false;
        checkInPublisher74.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor78);
        boolean boolean83 = occupancySensor78.isDetected;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher84 = occupancySensor78.subject;
        occupancySensor78.roomId = "hi!";
        checkInPublisher58.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor78);
        java.lang.String str88 = occupancySensor78.getLastEvent();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(checkInPublisher84);
        org.junit.Assert.assertNull(str88);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("admin", "student", "", false, false, "student");
        facultyAccount6.setVerified(true);
        facultyAccount6.setAccountType("");
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("admin", true, true);
        boolean boolean4 = occupancySensor3.occupied;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        java.lang.String str2 = reservation1.getTitle();
        java.time.LocalDateTime localDateTime3 = reservation1.getStartTime();
        java.lang.String str4 = reservation1.getAccountType();
        boolean boolean5 = reservation1.isDepositLost();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand8 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime6, localDateTime7);
        boolean boolean9 = editBookingCommand8.wasSuccessful();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(localDateTime3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
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
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState29 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        java.lang.String str30 = completedBookingState29.getName();
        bookingContext16.setState((com.conferenceroomscheduler.patterns.BookingState) completedBookingState29);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking confirmed." + "'", str1, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking confirmed." + "'", str2, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking confirmed." + "'", str3, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState10);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Checked in." + "'", str14, "Checked in.");
        org.junit.Assert.assertNull(reservation19);
        org.junit.Assert.assertNotNull(bookingState24);
        org.junit.Assert.assertNull(reservation27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Booking complete" + "'", str30, "Booking complete");
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
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
        reservation1.setTitle("Cancelled");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        java.lang.String str3 = reservation2.getTitle();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand4 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str5 = reservation2.getTitle();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand8 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation2, localDateTime6, localDateTime7);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
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
        java.lang.String str14 = confirmedBookingState11.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState15 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState16 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation17 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext18 = new com.conferenceroomscheduler.patterns.BookingContext(reservation17);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState19 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext18.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState19);
        com.conferenceroomscheduler.patterns.BookingState bookingState21 = bookingContext18.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState22 = bookingContext18.getState();
        cancelledBookingState16.handle(bookingContext18);
        checkedInBookingState15.handle(bookingContext18);
        java.lang.String str25 = checkedInBookingState15.getName();
        com.conferenceroomscheduler.model.Reservation reservation26 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext27 = new com.conferenceroomscheduler.patterns.BookingContext(reservation26);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState28 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext27.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState28);
        com.conferenceroomscheduler.model.Reservation reservation30 = bookingContext27.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation31 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext32 = new com.conferenceroomscheduler.patterns.BookingContext(reservation31);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState33 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext32.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState33);
        com.conferenceroomscheduler.patterns.BookingState bookingState35 = bookingContext32.getState();
        bookingContext27.setState(bookingState35);
        checkedInBookingState15.handle(bookingContext27);
        com.conferenceroomscheduler.model.Reservation reservation38 = bookingContext27.getReservation();
        confirmedBookingState11.handle(bookingContext27);
        bookingContext3.setState((com.conferenceroomscheduler.patterns.BookingState) confirmedBookingState11);
        com.conferenceroomscheduler.model.Reservation reservation41 = new com.conferenceroomscheduler.model.Reservation();
        reservation41.setFinalAmount((double) (byte) 100);
        reservation41.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext46 = new com.conferenceroomscheduler.patterns.BookingContext(reservation41);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState47 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str48 = cancelledBookingState47.getName();
        bookingContext46.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState47);
        confirmedBookingState11.handle(bookingContext46);
        com.conferenceroomscheduler.model.Reservation reservation51 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext52 = new com.conferenceroomscheduler.patterns.BookingContext(reservation51);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState53 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext52.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState53);
        bookingContext52.request();
        confirmedBookingState11.handle(bookingContext52);
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
        java.lang.String str67 = checkedInBookingState57.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState68 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState69 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation70 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext71 = new com.conferenceroomscheduler.patterns.BookingContext(reservation70);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState72 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext71.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState72);
        com.conferenceroomscheduler.patterns.BookingState bookingState74 = bookingContext71.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState75 = bookingContext71.getState();
        cancelledBookingState69.handle(bookingContext71);
        checkedInBookingState68.handle(bookingContext71);
        com.conferenceroomscheduler.model.Reservation reservation78 = new com.conferenceroomscheduler.model.Reservation();
        reservation78.setFinalAmount((double) (byte) 100);
        reservation78.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext83 = new com.conferenceroomscheduler.patterns.BookingContext(reservation78);
        checkedInBookingState68.handle(bookingContext83);
        com.conferenceroomscheduler.model.Reservation reservation85 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext86 = new com.conferenceroomscheduler.patterns.BookingContext(reservation85);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState87 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext86.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState87);
        checkedInBookingState68.handle(bookingContext86);
        checkedInBookingState57.handle(bookingContext86);
        com.conferenceroomscheduler.patterns.BookingState bookingState91 = bookingContext86.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState92 = bookingContext86.getState();
        confirmedBookingState11.handle(bookingContext86);
        java.lang.String str94 = bookingContext86.getStatus();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking confirmed." + "'", str12, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking confirmed." + "'", str13, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking confirmed." + "'", str14, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState21);
        org.junit.Assert.assertNotNull(bookingState22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Checked in." + "'", str25, "Checked in.");
        org.junit.Assert.assertNull(reservation30);
        org.junit.Assert.assertNotNull(bookingState35);
        org.junit.Assert.assertNull(reservation38);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Cancelled" + "'", str48, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState63);
        org.junit.Assert.assertNotNull(bookingState64);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Checked in." + "'", str67, "Checked in.");
        org.junit.Assert.assertNotNull(bookingState74);
        org.junit.Assert.assertNotNull(bookingState75);
        org.junit.Assert.assertNotNull(bookingState91);
        org.junit.Assert.assertNotNull(bookingState92);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "Checked in." + "'", str94, "Checked in.");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        room6.setRoomId("Booking complete");
        room6.setEnabled(false);
        room6.setRoomId("admin");
        java.lang.String str25 = room6.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cancelled" + "'", str25, "Cancelled");
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
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
        com.conferenceroomscheduler.model.Reservation reservation20 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext21 = new com.conferenceroomscheduler.patterns.BookingContext(reservation20);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState22 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext21.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState22);
        com.conferenceroomscheduler.model.Reservation reservation24 = bookingContext21.getReservation();
        java.lang.String str25 = bookingContext21.getStatus();
        bookingState18.handle(bookingContext21);
        com.conferenceroomscheduler.patterns.BookingState bookingState27 = bookingContext21.getState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState28 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
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
        com.conferenceroomscheduler.model.Reservation reservation39 = new com.conferenceroomscheduler.model.Reservation();
        reservation39.setFinalAmount((double) (byte) 100);
        reservation39.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext44 = new com.conferenceroomscheduler.patterns.BookingContext(reservation39);
        checkedInBookingState29.handle(bookingContext44);
        cancelledBookingState28.handle(bookingContext44);
        com.conferenceroomscheduler.patterns.BookingState bookingState47 = null;
        bookingContext44.setState(bookingState47);
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState49 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation50 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext51 = new com.conferenceroomscheduler.patterns.BookingContext(reservation50);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState52 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext51.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState52);
        completedBookingState49.handle(bookingContext51);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState55 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation56 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext57 = new com.conferenceroomscheduler.patterns.BookingContext(reservation56);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState58 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext57.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState58);
        com.conferenceroomscheduler.patterns.BookingState bookingState60 = bookingContext57.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState61 = bookingContext57.getState();
        cancelledBookingState55.handle(bookingContext57);
        completedBookingState49.handle(bookingContext57);
        com.conferenceroomscheduler.model.Reservation reservation64 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext65 = new com.conferenceroomscheduler.patterns.BookingContext(reservation64);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState66 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext65.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState66);
        com.conferenceroomscheduler.patterns.BookingState bookingState68 = bookingContext65.getState();
        com.conferenceroomscheduler.model.Reservation reservation69 = bookingContext65.getReservation();
        completedBookingState49.handle(bookingContext65);
        bookingContext44.setState((com.conferenceroomscheduler.patterns.BookingState) completedBookingState49);
        bookingContext21.setState((com.conferenceroomscheduler.patterns.BookingState) completedBookingState49);
        org.junit.Assert.assertNotNull(bookingState4);
        org.junit.Assert.assertNull(reservation5);
        org.junit.Assert.assertNull(reservation6);
        org.junit.Assert.assertNotNull(bookingState13);
        org.junit.Assert.assertNull(reservation14);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertNull(reservation24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cancelled" + "'", str25, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState27);
        org.junit.Assert.assertNotNull(bookingState35);
        org.junit.Assert.assertNotNull(bookingState36);
        org.junit.Assert.assertNotNull(bookingState60);
        org.junit.Assert.assertNotNull(bookingState61);
        org.junit.Assert.assertNotNull(bookingState68);
        org.junit.Assert.assertNull(reservation69);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState6 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str7 = cancelledBookingState6.getName();
        bookingContext5.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState6);
        com.conferenceroomscheduler.model.Reservation reservation9 = bookingContext5.getReservation();
        reservation9.setReservationId("");
        boolean boolean12 = reservation9.isCanceled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cancelled" + "'", str7, "Cancelled");
        org.junit.Assert.assertNotNull(reservation9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy institutionalBillingPaymentStrategy0 = new com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy();
        boolean boolean3 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", 0.0d);
        boolean boolean6 = institutionalBillingPaymentStrategy0.processPayment("", (double) (-1));
        boolean boolean9 = institutionalBillingPaymentStrategy0.processPayment("Unverified badge detected for .", 100.0d);
        boolean boolean12 = institutionalBillingPaymentStrategy0.processPayment("", (double) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("partner", "Unverified badge detected for Cancelled.", "Unverified badge detected for .", false, false, "Booking confirmed.");
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation2.getPaymentMethod();
        reservation2.setFinalAmount((double) (byte) 1);
        java.lang.String str8 = reservation2.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand9 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService1, reservation2);
        reservation2.setHourlyRate((double) 0L);
        boolean boolean12 = reservation2.isExtended();
        java.time.LocalDateTime localDateTime13 = null;
        reservation2.setStartTime(localDateTime13);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand17 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation2, localDateTime15, localDateTime16);
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "Checked in.", true);
        java.lang.String str4 = badgeScan3.getBadgeId();
        boolean boolean5 = badgeScan3.isVerified();
        badgeScan3.setVerified(false);
        badgeScan3.setRoomId("Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("student", "hi!", "Booking confirmed.", "Cancelled", 100, localDateTime5, localDateTime6);
        int int8 = bookingRequest7.getAttendeeCount();
        java.lang.String str9 = bookingRequest7.getRequestId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        room6.setRoomId("Booking complete");
        int int21 = room6.getCapacity();
        java.lang.String str22 = room6.getRoomId();
        room6.setName("admin");
        room6.setClosedForMaintenance(false);
        boolean boolean27 = room6.isClosedForMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Booking complete" + "'", str22, "Booking complete");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
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
        adminAccount27.setAccountNumber("Unverified badge detected for admin.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
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
        java.lang.String str29 = occupancySensor15.roomId;
        occupancySensor15.isDetected = true;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor35 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount42 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean43 = occupancySensor35.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount42);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher44 = null;
        occupancySensor35.setSubject(checkInPublisher44);
        occupancySensor35.isDetected = false;
        boolean boolean48 = occupancySensor35.isOccupied();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor52 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor56 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean57 = occupancySensor56.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher58 = null;
        occupancySensor56.subject = checkInPublisher58;
        occupancySensor56.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher62 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor66 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher67 = null;
        occupancySensor66.setSubject(checkInPublisher67);
        occupancySensor66.occupied = true;
        occupancySensor66.setDetected(false);
        checkInPublisher62.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor66);
        occupancySensor56.setSubject(checkInPublisher62);
        occupancySensor52.setSubject(checkInPublisher62);
        occupancySensor35.subject = checkInPublisher62;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor80 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean81 = occupancySensor80.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher82 = null;
        occupancySensor80.subject = checkInPublisher82;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher84 = occupancySensor80.getSubject();
        checkInPublisher62.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor80);
        occupancySensor15.setSubject(checkInPublisher62);
        com.conferenceroomscheduler.model.StudentAccount studentAccount93 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        com.conferenceroomscheduler.model.Badge badge94 = studentAccount93.getBadge();
        checkInPublisher62.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount93);
        com.conferenceroomscheduler.patterns.CheckInObserver checkInObserver96 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkInPublisher62.registerObserver(checkInObserver96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.patterns.CheckInObserver.setSubject(com.conferenceroomscheduler.patterns.CheckInPublisher)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Pending" + "'", str29, "Pending");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(checkInPublisher84);
        org.junit.Assert.assertNotNull(badge94);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
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
        occupancySensor3.isDetected = false;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(checkInPublisher53);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Checked in.", "Booking complete", (int) (byte) -1, true, "Pending", "Pending");
        room6.setName("partner");
        room6.setRoomId("ADMIN-69");
        room6.setEnabled(false);
        int int13 = room6.getCapacity();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = null;
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime5, localDateTime6, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod11);
        reservation12.setDepositLost(true);
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand16 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation12, localDateTime15);
        reservation12.setHourlyRate((double) (-1.0f));
        boolean boolean19 = reservation12.isDepositLost();
        java.lang.String str20 = reservation12.getReservationId();
        java.time.LocalDateTime localDateTime21 = reservation12.getEndTime();
        java.lang.String str22 = reservation12.getReservationId();
        reservation12.setCheckedIn(false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
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
        occupancySensor3.setRoomId("Booking confirmed.");
        occupancySensor3.setDetected(true);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher79 = occupancySensor3.getSubject();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher80 = occupancySensor3.getSubject();
        occupancySensor3.setDetected(false);
        org.junit.Assert.assertNull(checkInPublisher4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(badge72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(checkInPublisher79);
        org.junit.Assert.assertNull(checkInPublisher80);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Unverified badge detected for admin.", "Pending", true);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("hi!", "student", "admin", false, false, "Cancelled");
        java.lang.String str7 = partnerAccount6.getAccountId();
        partnerAccount6.setAccountId("Unverified badge detected for Cancelled.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str1 = adminAccount0.getEmail();
        boolean boolean2 = adminAccount0.isUniversityAccount();
        adminAccount0.setVerified(true);
        boolean boolean5 = adminAccount0.isVerified();
        adminAccount0.setAccountType("ADMIN-69");
        com.conferenceroomscheduler.model.Badge badge8 = adminAccount0.getBadge();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(badge8);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        room6.setRoomId("Booking complete");
        room6.setEnabled(false);
        room6.setClosedForMaintenance(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        java.lang.String str3 = reservation0.getUserId();
        boolean boolean4 = reservation0.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation0.getPaymentMethod();
        reservation0.setDepositLost(true);
        double double8 = reservation0.getHourlyRate();
        java.lang.String str9 = reservation0.getReservationId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount0.setAccountNumber("hi!");
        java.lang.String str3 = adminAccount0.getAccountId();
        adminAccount0.setAccountType("Booking complete");
        java.lang.String str6 = adminAccount0.getAccountType();
        adminAccount0.setUniversityAccount(true);
        adminAccount0.setAccountType("staff");
        java.lang.String str11 = adminAccount0.getEmail();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking complete" + "'", str6, "Booking complete");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor15 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor15.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount24 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount24.setEmail("");
        boolean boolean27 = occupancySensor15.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount24);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor31 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean32 = occupancySensor31.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher33 = null;
        occupancySensor31.subject = checkInPublisher33;
        occupancySensor31.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher37 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor41 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher42 = null;
        occupancySensor41.setSubject(checkInPublisher42);
        occupancySensor41.occupied = true;
        occupancySensor41.setDetected(false);
        checkInPublisher37.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor41);
        occupancySensor31.setSubject(checkInPublisher37);
        com.conferenceroomscheduler.model.StudentAccount studentAccount56 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        checkInPublisher37.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount56);
        occupancySensor15.subject = checkInPublisher37;
        occupancySensor3.subject = checkInPublisher37;
        com.conferenceroomscheduler.model.StaffAccount staffAccount66 = new com.conferenceroomscheduler.model.StaffAccount("hi!", "Booking complete", "Booking confirmed.", false, false, "Booking complete");
        checkInPublisher37.notifyObservers((com.conferenceroomscheduler.model.Account) staffAccount66);
        com.conferenceroomscheduler.model.StaffAccount staffAccount68 = new com.conferenceroomscheduler.model.StaffAccount();
        checkInPublisher37.notifyObservers((com.conferenceroomscheduler.model.Account) staffAccount68);
        staffAccount68.setPassword("partner");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
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
        reservation0.setAccountType("Verified badge detected for ADMIN-69.");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, false);
        java.lang.String str4 = occupancySensor3.getRoomId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pending" + "'", str4, "Pending");
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        boolean boolean10 = room6.isClosedForMaintenance();
        room6.setEnabled(false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor16 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
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
        occupancySensor16.setSubject(checkInPublisher26);
        com.conferenceroomscheduler.model.Badge badge43 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str44 = badge43.getAccountId();
        boolean boolean45 = occupancySensor16.scanIdBadge(badge43);
        occupancySensor16.setOccupied(false);
        occupancySensor16.roomId = "";
        boolean boolean50 = occupancySensor16.isDetected;
        room6.setOccupancySensor(occupancySensor16);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Booking confirmed." + "'", str44, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setRoomId("hi!");
        java.lang.String str6 = reservation0.getReservationId();
        java.time.LocalDateTime localDateTime7 = reservation0.getEndTime();
        java.lang.String str8 = reservation0.getTitle();
        java.lang.String str9 = reservation0.getReservationId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        boolean boolean9 = reservation0.isExtended();
        java.lang.String str10 = reservation0.getUserId();
        reservation0.setHourlyRate((double) (short) -1);
        boolean boolean13 = reservation0.isDepositLost();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod24 = null;
        com.conferenceroomscheduler.model.Reservation reservation25 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime18, localDateTime19, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod24);
        reservation25.setUserId("");
        reservation25.setCheckedIn(true);
        java.lang.String str30 = reservation25.getReservationId();
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        com.conferenceroomscheduler.model.Reservation reservation41 = new com.conferenceroomscheduler.model.Reservation();
        reservation41.setFinalAmount((double) (byte) 100);
        java.lang.String str44 = reservation41.getRoomId();
        reservation41.setFinalAmount((double) 10.0f);
        java.lang.String str47 = reservation41.getUserId();
        reservation41.setDepositAmount((double) (byte) 0);
        double double50 = reservation41.getHourlyRate();
        reservation41.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext53 = new com.conferenceroomscheduler.patterns.BookingContext(reservation41);
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime59 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod64 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation65 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime58, localDateTime59, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod64);
        reservation41.setPaymentMethod(paymentMethod64);
        com.conferenceroomscheduler.model.Reservation reservation67 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "Booking complete", "admin", "Booking complete", localDateTime35, localDateTime36, "Booking confirmed.", (double) (short) -1, (double) 0.0f, (double) 0, paymentMethod64);
        reservation25.setPaymentMethod(paymentMethod64);
        reservation0.setPaymentMethod(paymentMethod64);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod64 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod64.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation2.getPaymentMethod();
        reservation2.setDepositAmount(0.0d);
        reservation2.setAccountType("");
        reservation2.setAccountType("faculty");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand12 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand13 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation2);
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand13.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paymentMethod5);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        java.lang.String str3 = reservation0.getUserId();
        boolean boolean4 = reservation0.isDepositLost();
        reservation0.setReservationId("");
        java.lang.String str7 = reservation0.getAccountType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("", "Booking complete", "Verified badge detected for Checked in..", "Booking confirmed.", 10, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Verified badge detected for Checked in.." + "'", str8, "Verified badge detected for Checked in..");
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod10 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation11 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime4, localDateTime5, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod10);
        java.time.LocalDateTime localDateTime12 = reservation11.getEndTime();
        java.time.LocalDateTime localDateTime13 = reservation11.getStartTime();
        org.junit.Assert.assertTrue("'" + paymentMethod10 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod10.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Unverified badge detected for Cancelled.", "partner", (int) (short) 1, false, "", "Verified badge detected for ADMIN-69.");
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor77 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher78 = null;
        occupancySensor77.setSubject(checkInPublisher78);
        boolean boolean80 = occupancySensor77.isDetected;
        occupancySensor77.setRoomId("");
        java.lang.String str83 = occupancySensor77.roomId;
        checkInPublisher58.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor77);
        occupancySensor77.occupied = true;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState0 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext2 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState3 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext2.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState3);
        completedBookingState0.handle(bookingContext2);
        java.lang.String str6 = completedBookingState0.getName();
        java.lang.String str7 = completedBookingState0.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState8 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState9 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation10 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext11 = new com.conferenceroomscheduler.patterns.BookingContext(reservation10);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState12 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext11.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState12);
        com.conferenceroomscheduler.patterns.BookingState bookingState14 = bookingContext11.getState();
        com.conferenceroomscheduler.model.Reservation reservation15 = bookingContext11.getReservation();
        cancelledBookingState9.handle(bookingContext11);
        checkedInBookingState8.handle(bookingContext11);
        bookingContext11.request();
        com.conferenceroomscheduler.model.Reservation reservation19 = bookingContext11.getReservation();
        completedBookingState0.handle(bookingContext11);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking complete" + "'", str6, "Booking complete");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking complete" + "'", str7, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState14);
        org.junit.Assert.assertNull(reservation15);
        org.junit.Assert.assertNull(reservation19);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount0 = new com.conferenceroomscheduler.model.PartnerAccount();
        partnerAccount0.setVerified(false);
        java.lang.String str3 = partnerAccount0.getAccountNumber();
        boolean boolean4 = partnerAccount0.isUniversityAccount();
        java.lang.String str5 = partnerAccount0.getAccountNumber();
        partnerAccount0.setAccountNumber("admin");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        boolean boolean9 = reservation0.isExtended();
        reservation0.setReservationId("admin");
        double double12 = reservation0.getFinalAmount();
        reservation0.setFinalAmount((double) 100.0f);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("admin", "hi!", false);
        badge3.setAccountId("staff");
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor3.isDetected = false;
        occupancySensor3.roomId = "hi!";
        occupancySensor3.isDetected = false;
        boolean boolean10 = occupancySensor3.isOccupied();
        occupancySensor3.setRoomId("admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        boolean boolean11 = room6.isEnabled();
        boolean boolean12 = room6.isClosedForMaintenance();
        java.lang.String str13 = room6.getRoomNumber();
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
        room6.setOccupancySensor(occupancySensor17);
        occupancySensor17.occupied = true;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Cancelled" + "'", str35, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.isDetected;
        boolean boolean7 = occupancySensor3.isDetected;
        occupancySensor3.occupied = false;
        java.lang.String str10 = occupancySensor3.getRoomId();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher11 = null;
        occupancySensor3.subject = checkInPublisher11;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
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
        boolean boolean16 = editBookingCommand15.wasSuccessful();
        boolean boolean17 = editBookingCommand15.wasSuccessful();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState6 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str7 = cancelledBookingState6.getName();
        bookingContext5.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState6);
        com.conferenceroomscheduler.model.Reservation reservation9 = bookingContext5.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation10 = bookingContext5.getReservation();
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState11 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str12 = confirmedBookingState11.getName();
        bookingContext5.setState((com.conferenceroomscheduler.patterns.BookingState) confirmedBookingState11);
        com.conferenceroomscheduler.model.Reservation reservation14 = new com.conferenceroomscheduler.model.Reservation();
        java.time.LocalDateTime localDateTime15 = null;
        reservation14.setEndTime(localDateTime15);
        reservation14.setHourlyRate((double) 'a');
        com.conferenceroomscheduler.patterns.BookingContext bookingContext19 = new com.conferenceroomscheduler.patterns.BookingContext(reservation14);
        confirmedBookingState11.handle(bookingContext19);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState21 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation22 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext23 = new com.conferenceroomscheduler.patterns.BookingContext(reservation22);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState24 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext23.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState24);
        com.conferenceroomscheduler.patterns.BookingState bookingState26 = bookingContext23.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState27 = bookingContext23.getState();
        cancelledBookingState21.handle(bookingContext23);
        com.conferenceroomscheduler.patterns.BookingState bookingState29 = bookingContext23.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState30 = bookingContext23.getState();
        java.lang.String str31 = bookingState30.getName();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState32 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str33 = cancelledBookingState32.getName();
        com.conferenceroomscheduler.model.Reservation reservation34 = new com.conferenceroomscheduler.model.Reservation();
        reservation34.setFinalAmount((double) (byte) 100);
        reservation34.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext39 = new com.conferenceroomscheduler.patterns.BookingContext(reservation34);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState40 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str41 = cancelledBookingState40.getName();
        bookingContext39.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState40);
        bookingContext39.request();
        cancelledBookingState32.handle(bookingContext39);
        com.conferenceroomscheduler.model.Reservation reservation45 = bookingContext39.getReservation();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState46 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState47 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation48 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext49 = new com.conferenceroomscheduler.patterns.BookingContext(reservation48);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState50 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext49.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState50);
        com.conferenceroomscheduler.patterns.BookingState bookingState52 = bookingContext49.getState();
        com.conferenceroomscheduler.model.Reservation reservation53 = bookingContext49.getReservation();
        cancelledBookingState47.handle(bookingContext49);
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState55 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str56 = confirmedBookingState55.getName();
        java.lang.String str57 = confirmedBookingState55.getName();
        com.conferenceroomscheduler.model.Reservation reservation58 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext59 = new com.conferenceroomscheduler.patterns.BookingContext(reservation58);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState60 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext59.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState60);
        com.conferenceroomscheduler.model.Reservation reservation62 = bookingContext59.getReservation();
        confirmedBookingState55.handle(bookingContext59);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState64 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState65 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation66 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext67 = new com.conferenceroomscheduler.patterns.BookingContext(reservation66);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState68 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext67.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState68);
        com.conferenceroomscheduler.patterns.BookingState bookingState70 = bookingContext67.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState71 = bookingContext67.getState();
        cancelledBookingState65.handle(bookingContext67);
        checkedInBookingState64.handle(bookingContext67);
        java.lang.String str74 = checkedInBookingState64.getName();
        com.conferenceroomscheduler.model.Reservation reservation75 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext76 = new com.conferenceroomscheduler.patterns.BookingContext(reservation75);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState77 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext76.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState77);
        com.conferenceroomscheduler.model.Reservation reservation79 = bookingContext76.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation80 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext81 = new com.conferenceroomscheduler.patterns.BookingContext(reservation80);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState82 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext81.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState82);
        com.conferenceroomscheduler.patterns.BookingState bookingState84 = bookingContext81.getState();
        bookingContext76.setState(bookingState84);
        checkedInBookingState64.handle(bookingContext76);
        com.conferenceroomscheduler.model.Reservation reservation87 = bookingContext76.getReservation();
        java.lang.String str88 = bookingContext76.getStatus();
        java.lang.String str89 = bookingContext76.getStatus();
        confirmedBookingState55.handle(bookingContext76);
        cancelledBookingState47.handle(bookingContext76);
        checkedInBookingState46.handle(bookingContext76);
        bookingContext39.setState((com.conferenceroomscheduler.patterns.BookingState) checkedInBookingState46);
        bookingState30.handle(bookingContext39);
        confirmedBookingState11.handle(bookingContext39);
        bookingContext39.request();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cancelled" + "'", str7, "Cancelled");
        org.junit.Assert.assertNotNull(reservation9);
        org.junit.Assert.assertNotNull(reservation10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking confirmed." + "'", str12, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState26);
        org.junit.Assert.assertNotNull(bookingState27);
        org.junit.Assert.assertNotNull(bookingState29);
        org.junit.Assert.assertNotNull(bookingState30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Cancelled" + "'", str31, "Cancelled");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Cancelled" + "'", str33, "Cancelled");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Cancelled" + "'", str41, "Cancelled");
        org.junit.Assert.assertNotNull(reservation45);
        org.junit.Assert.assertNotNull(bookingState52);
        org.junit.Assert.assertNull(reservation53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Booking confirmed." + "'", str56, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Booking confirmed." + "'", str57, "Booking confirmed.");
        org.junit.Assert.assertNull(reservation62);
        org.junit.Assert.assertNotNull(bookingState70);
        org.junit.Assert.assertNotNull(bookingState71);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Checked in." + "'", str74, "Checked in.");
        org.junit.Assert.assertNull(reservation79);
        org.junit.Assert.assertNotNull(bookingState84);
        org.junit.Assert.assertNull(reservation87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Booking complete" + "'", str88, "Booking complete");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Booking complete" + "'", str89, "Booking complete");
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Booking complete", "Cancelled", (int) (short) 1, "Booking complete", "");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("ADMIN-69", "Pending", 10, "hi!", "");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("", "Booking confirmed.", (-1), "student", "admin");
        room24.setName("");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = occupancySensor3.getSubject();
        com.conferenceroomscheduler.model.AdminAccount adminAccount19 = new com.conferenceroomscheduler.model.AdminAccount("", "Booking confirmed.", "", false, false, "");
        adminAccount19.setAccountId("");
        boolean boolean22 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount19);
        com.conferenceroomscheduler.model.Badge badge23 = adminAccount19.getBadge();
        badge23.setEmail("Verified badge detected for ADMIN-69.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(checkInPublisher12);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(badge23);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Unverified badge detected for Cancelled.", "Unverified badge detected for admin.", 0, false, "", "Booking complete");
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Booking complete", "Cancelled", (int) (short) 1, "Booking complete", "");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("faculty", "Unverified badge detected for admin.", 52, "Checked in.", "Unverified badge detected for Cancelled.");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("staff", "Booking confirmed.", 100, "Verified badge detected for ADMIN-69.", "Cancelled");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getAccountType();
        boolean boolean5 = reservation2.isCheckedIn();
        reservation2.setDepositLost(true);
        reservation2.setTitle("Booking confirmed.");
        boolean boolean10 = reservation2.isCheckedIn();
        double double11 = reservation2.getDepositAmount();
        double double12 = reservation2.getDepositAmount();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand13 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation2);
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand13.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        java.time.LocalDateTime localDateTime10 = reservation0.getStartTime();
        boolean boolean11 = reservation0.isExtended();
        boolean boolean12 = reservation0.isCheckedIn();
        reservation0.setTitle("hi!");
        java.lang.String str15 = reservation0.getTitle();
        reservation0.setCheckedIn(true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        java.lang.String str3 = reservation0.getUserId();
        boolean boolean4 = reservation0.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation0.getPaymentMethod();
        reservation0.setCanceled(false);
        reservation0.setRoomId("");
        java.lang.String str10 = reservation0.getRoomId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Unverified badge detected for admin.", "Verified badge detected for ADMIN-69.", "Unverified badge detected for Cancelled.", false, true, "");
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean4 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor3.subject = checkInPublisher5;
        occupancySensor3.setRoomId("faculty");
        boolean boolean9 = occupancySensor3.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = null;
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime5, localDateTime6, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod11);
        reservation12.setDepositLost(true);
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand16 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation12, localDateTime15);
        reservation12.setHourlyRate((double) (-1.0f));
        boolean boolean19 = reservation12.isDepositLost();
        java.lang.String str20 = reservation12.getReservationId();
        java.time.LocalDateTime localDateTime21 = reservation12.getEndTime();
        reservation12.setFinalAmount(10.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod40 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation41 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime34, localDateTime35, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod40);
        com.conferenceroomscheduler.model.Reservation reservation42 = new com.conferenceroomscheduler.model.Reservation("admin", "", "Booking complete", "Pending", localDateTime24, localDateTime25, "", (double) 'a', (double) 10L, 0.0d, paymentMethod40);
        com.conferenceroomscheduler.model.Reservation reservation43 = new com.conferenceroomscheduler.model.Reservation("hi!", "faculty", "", "Pending", localDateTime14, localDateTime15, "Unverified badge detected for Cancelled.", (double) 1.0f, (double) 0L, (-1.0d), paymentMethod40);
        com.conferenceroomscheduler.model.Reservation reservation44 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "Booking confirmed.", "hi!", "Pending", localDateTime4, localDateTime5, "Cancelled", (double) '4', (double) (-1.0f), (double) 0L, paymentMethod40);
        reservation44.setCanceled(true);
        double double47 = reservation44.getFinalAmount();
        double double48 = reservation44.getFinalAmount();
        org.junit.Assert.assertTrue("'" + paymentMethod40 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod40.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod20 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation21 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime14, localDateTime15, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod20);
        com.conferenceroomscheduler.model.Reservation reservation22 = new com.conferenceroomscheduler.model.Reservation("admin", "", "Booking complete", "Pending", localDateTime4, localDateTime5, "", (double) 'a', (double) 10L, 0.0d, paymentMethod20);
        reservation22.setDepositAmount((double) 100.0f);
        java.lang.String str25 = reservation22.getRoomId();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod26 = reservation22.getPaymentMethod();
        double double27 = reservation22.getHourlyRate();
        reservation22.setCheckedIn(false);
        org.junit.Assert.assertTrue("'" + paymentMethod20 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod20.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + paymentMethod26 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod26.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 97.0d + "'", double27 == 97.0d);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Booking complete", "Cancelled", (int) (short) 1, "Booking complete", "");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("ADMIN-69", "Pending", 10, "hi!", "");
        java.lang.String str19 = room18.getName();
        room18.setRoomId("partner");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Pending" + "'", str19, "Pending");
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) '4');
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("Cancelled", 1.0d);
        boolean boolean9 = debitCardPaymentStrategy0.processPayment("Pending", (double) ' ');
        boolean boolean12 = debitCardPaymentStrategy0.processPayment("", (double) 10L);
        boolean boolean15 = debitCardPaymentStrategy0.processPayment("admin", (double) 1.0f);
        boolean boolean18 = debitCardPaymentStrategy0.processPayment("Verified badge detected for Checked in..", (double) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy institutionalBillingPaymentStrategy0 = new com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy();
        boolean boolean3 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", 0.0d);
        boolean boolean6 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", (double) (short) 1);
        boolean boolean9 = institutionalBillingPaymentStrategy0.processPayment("Cancelled", 32.0d);
        boolean boolean12 = institutionalBillingPaymentStrategy0.processPayment("faculty", (double) 1);
        boolean boolean15 = institutionalBillingPaymentStrategy0.processPayment("Verified badge detected for Checked in..", 97.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("", "", "hi!", true, true, "Cancelled");
        com.conferenceroomscheduler.model.Badge badge7 = partnerAccount6.getBadge();
        badge7.setAccountId("ADMIN-69");
        badge7.setEmail("");
        org.junit.Assert.assertNotNull(badge7);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Pending", "Pending", (int) (short) -1, "", "Cancelled");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("admin", "student", 97, "Pending", "student");
        room18.setBuilding("admin");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount27 = new com.conferenceroomscheduler.model.PartnerAccount("Booking confirmed.", "hi!", "Pending", false, true, "Checked in.");
        java.lang.String str28 = partnerAccount27.getAccountNumber();
        partnerAccount27.setAccountNumber("student");
        com.conferenceroomscheduler.model.Badge badge31 = partnerAccount27.getBadge();
        room18.checkIn((com.conferenceroomscheduler.model.Account) partnerAccount27);
        boolean boolean33 = room18.isEnabled();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Checked in." + "'", str28, "Checked in.");
        org.junit.Assert.assertNotNull(badge31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        com.conferenceroomscheduler.patterns.StaffFactory staffFactory0 = new com.conferenceroomscheduler.patterns.StaffFactory();
        com.conferenceroomscheduler.model.Account account8 = staffFactory0.createAccount("", "Booking complete", "Booking confirmed.", "Cancelled", false, true, "Booking complete");
        com.conferenceroomscheduler.model.Account account16 = staffFactory0.createAccount("student", "Booking confirmed.", "admin", "student", false, true, "admin");
        com.conferenceroomscheduler.model.Account account24 = staffFactory0.createAccount("Cancelled", "Unverified badge detected for admin.", "Cancelled", "ADMIN-69", false, true, "");
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("partner", "admin", true);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Pending", "student", "student", true, true, "ADMIN-69");
        boolean boolean7 = studentAccount6.isUniversityAccount();
        java.lang.String str8 = studentAccount6.getAccountId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Pending" + "'", str8, "Pending");
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("hi!", "Booking complete", "Booking confirmed.", false, false, "Booking complete");
        staffAccount6.setVerified(true);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        java.time.LocalDateTime localDateTime1 = null;
        reservation0.setEndTime(localDateTime1);
        reservation0.setHourlyRate((double) 'a');
        reservation0.setUserId("Cancelled");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Unverified badge detected for .", "Booking complete", 1, false, "hi!", "hi!");
        boolean boolean7 = room6.isEnabled();
        room6.setClosedForMaintenance(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setHourlyRate((double) (byte) 100);
        boolean boolean4 = reservation1.isDepositLost();
        java.time.LocalDateTime localDateTime5 = null;
        reservation1.setEndTime(localDateTime5);
        java.lang.String str7 = reservation1.getTitle();
        reservation1.setUserId("student");
        reservation1.setExtended(true);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand12 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.time.LocalDateTime localDateTime13 = null;
        reservation1.setEndTime(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        java.lang.String str6 = occupancySensor3.getRoomId();
        com.conferenceroomscheduler.model.StudentAccount studentAccount13 = new com.conferenceroomscheduler.model.StudentAccount("", "Booking confirmed.", "hi!", false, true, "Checked in.");
        studentAccount13.setUniversityAccount(false);
        studentAccount13.setEmail("Checked in.");
        boolean boolean18 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount13);
        studentAccount13.setAccountNumber("student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Checked in.", false, false);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Unverified badge detected for .", "student", "partner", "Checked in.", (int) (short) -1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRoomId();
        java.lang.String str9 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        double double7 = reservation0.getFinalAmount();
        reservation0.setReservationId("Pending");
        reservation0.setDepositLost(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setBuilding("hi!");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = room6.getOccupancySensor();
        occupancySensor10.occupied = false;
        occupancySensor10.setDetected(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(occupancySensor10);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("hi!", "student", true);
        java.lang.String str4 = badgeScan3.getRoomId();
        badgeScan3.setBadgeId("Pending");
        badgeScan3.setBadgeId("admin");
        badgeScan3.setRoomId("faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        java.lang.String str9 = reservation0.getAccountType();
        reservation0.setHourlyRate((double) '#');
        reservation0.setFinalAmount((double) 1.0f);
        java.lang.String str14 = reservation0.getRoomId();
        reservation0.setCanceled(true);
        boolean boolean17 = reservation0.isCheckedIn();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "Checked in.", true);
        java.lang.String str4 = badgeScan3.getBadgeId();
        boolean boolean5 = badgeScan3.isVerified();
        boolean boolean6 = badgeScan3.isVerified();
        badgeScan3.setRoomId("ADMIN-69");
        java.lang.String str9 = badgeScan3.getRoomId();
        badgeScan3.setRoomId("Cancelled");
        java.lang.String str12 = badgeScan3.getRoomId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ADMIN-69" + "'", str9, "ADMIN-69");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cancelled" + "'", str12, "Cancelled");
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        java.lang.String str6 = badgeScan3.getBadgeId();
        java.lang.String str7 = badgeScan3.getRoomId();
        java.lang.String str8 = badgeScan3.getRoomId();
        badgeScan3.setVerified(true);
        badgeScan3.setRoomId("Booking complete");
        java.lang.String str13 = badgeScan3.getBadgeId();
        boolean boolean14 = badgeScan3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) '4');
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("", (double) (-1));
        boolean boolean9 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) (byte) 0);
        boolean boolean12 = debitCardPaymentStrategy0.processPayment("faculty", (double) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory0 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account8 = facultyFactory0.createAccount("", "Cancelled", "", "hi!", false, false, "");
        account8.setAccountNumber("hi!");
        account8.setUniversityAccount(true);
        account8.setAccountType("Cancelled");
        java.lang.String str15 = account8.getPassword();
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        reservation1.setDepositAmount((double) (byte) 0);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand10 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setReservationId("Booking complete");
        reservation1.setRoomId("student");
        reservation1.setCanceled(false);
        reservation1.setDepositLost(true);
        java.lang.String str19 = reservation1.getTitle();
        double double20 = reservation1.getFinalAmount();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Pending", "hi!", "Booking confirmed.", "", 97, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRoomId();
        java.lang.String str9 = bookingRequest7.getRoomId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        int int11 = bookingRequest7.getAttendeeCount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        reservation1.setDepositAmount((double) (byte) 0);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand10 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setReservationId("Booking complete");
        reservation1.setRoomId("student");
        reservation1.setCanceled(false);
        reservation1.setDepositLost(true);
        boolean boolean19 = reservation1.isCheckedIn();
        boolean boolean20 = reservation1.isDepositLost();
        java.lang.String str21 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "student" + "'", str21, "student");
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, true);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
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
        room6.setRoomId("faculty");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor23 = room6.getOccupancySensor();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher24 = occupancySensor23.getSubject();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(occupancySensor23);
        org.junit.Assert.assertNull(checkInPublisher24);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("staff", "student", "Booking confirmed.", "faculty", (-1), localDateTime5, localDateTime6);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = null;
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime5, localDateTime6, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod11);
        reservation12.setDepositLost(true);
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand16 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation12, localDateTime15);
        reservation12.setHourlyRate((double) (-1.0f));
        reservation12.setRoomId("admin");
        java.lang.String str21 = reservation12.getTitle();
        double double22 = reservation12.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService10 = null;
        com.conferenceroomscheduler.model.Reservation reservation11 = new com.conferenceroomscheduler.model.Reservation();
        reservation11.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod14 = reservation11.getPaymentMethod();
        reservation11.setDepositAmount(0.0d);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand19 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService10, reservation11, localDateTime17, localDateTime18);
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod40 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation41 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime34, localDateTime35, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod40);
        com.conferenceroomscheduler.model.Reservation reservation42 = new com.conferenceroomscheduler.model.Reservation("", "Pending", "Pending", "Booking complete", localDateTime24, localDateTime25, "Booking confirmed.", (double) 0.0f, (double) 1, (double) (byte) 100, paymentMethod40);
        reservation11.setPaymentMethod(paymentMethod40);
        com.conferenceroomscheduler.model.Reservation reservation44 = new com.conferenceroomscheduler.model.Reservation("admin", "Booking complete", "", "student", localDateTime4, localDateTime5, "Booking confirmed.", (double) 0, (double) (-1L), (-1.0d), paymentMethod40);
        reservation44.setCheckedIn(true);
        reservation44.setAccountType("Pending");
        org.junit.Assert.assertNull(paymentMethod14);
        org.junit.Assert.assertTrue("'" + paymentMethod40 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod40.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Booking confirmed.", "Booking complete", 100, true, "Pending", "ADMIN-69");
        java.lang.String str7 = room6.getBuilding();
        com.conferenceroomscheduler.model.Account account15 = new com.conferenceroomscheduler.model.Account("Pending", "Pending", "Checked in.", "Cancelled", false, false, "ADMIN-69");
        account15.setAccountNumber("admin");
        room6.checkIn(account15);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pending" + "'", str7, "Pending");
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("staff", "Pending", "Unverified badge detected for .", "Pending", true, false, "partner");
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
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
        java.lang.String str23 = occupancySensor3.getRoomId();
        com.conferenceroomscheduler.model.AdminAccount adminAccount30 = new com.conferenceroomscheduler.model.AdminAccount("Booking complete", "Pending", "student", false, false, "");
        boolean boolean31 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount30);
        java.lang.String str32 = occupancySensor3.roomId;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher33 = occupancySensor3.getSubject();
        com.conferenceroomscheduler.model.AdminAccount adminAccount34 = new com.conferenceroomscheduler.model.AdminAccount();
        boolean boolean35 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount34);
        occupancySensor3.setDetected(true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pending" + "'", str23, "Pending");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Pending" + "'", str32, "Pending");
        org.junit.Assert.assertNull(checkInPublisher33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
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
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher27 = occupancySensor3.subject;
        com.conferenceroomscheduler.model.StudentAccount studentAccount34 = new com.conferenceroomscheduler.model.StudentAccount("Cancelled", "Cancelled", "Pending", false, true, "Checked in.");
        java.lang.String str35 = studentAccount34.getPassword();
        checkInPublisher27.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount34);
        java.lang.String str37 = studentAccount34.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(checkInPublisher27);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Pending" + "'", str35, "Pending");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "student" + "'", str37, "student");
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("student", "admin", "partner", true, false, "Pending");
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
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
        reservation1.setUserId("Cancelled");
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("hi!", "hi!", "hi!", true, true, "Pending");
        boolean boolean7 = facultyAccount6.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState0 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str1 = cancelledBookingState0.getName();
        java.lang.String str2 = cancelledBookingState0.getName();
        java.lang.String str3 = cancelledBookingState0.getName();
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState4 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str5 = pendingBookingState4.getName();
        com.conferenceroomscheduler.model.Reservation reservation6 = new com.conferenceroomscheduler.model.Reservation();
        reservation6.setFinalAmount((double) (byte) 100);
        reservation6.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext11 = new com.conferenceroomscheduler.patterns.BookingContext(reservation6);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState12 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str13 = cancelledBookingState12.getName();
        bookingContext11.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState12);
        pendingBookingState4.handle(bookingContext11);
        java.lang.String str16 = pendingBookingState4.getName();
        java.lang.String str17 = pendingBookingState4.getName();
        com.conferenceroomscheduler.model.Reservation reservation18 = new com.conferenceroomscheduler.model.Reservation();
        reservation18.setFinalAmount((double) (byte) 100);
        java.lang.String str21 = reservation18.getRoomId();
        reservation18.setFinalAmount((double) 10.0f);
        java.lang.String str24 = reservation18.getUserId();
        reservation18.setFinalAmount((double) ' ');
        java.lang.String str27 = reservation18.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext28 = new com.conferenceroomscheduler.patterns.BookingContext(reservation18);
        bookingContext28.request();
        pendingBookingState4.handle(bookingContext28);
        cancelledBookingState0.handle(bookingContext28);
        java.lang.String str32 = bookingContext28.getStatus();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cancelled" + "'", str1, "Cancelled");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cancelled" + "'", str2, "Cancelled");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cancelled" + "'", str3, "Cancelled");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pending" + "'", str5, "Pending");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pending" + "'", str16, "Pending");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Pending" + "'", str17, "Pending");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Pending" + "'", str32, "Pending");
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "", "hi!", "", (int) '4', localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getOrganizerId();
        int int9 = bookingRequest7.getAttendeeCount();
        java.lang.String str10 = bookingRequest7.getRequestId();
        java.lang.String str11 = bookingRequest7.getRequestId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        boolean boolean19 = room6.isEnabled();
        java.lang.String str20 = room6.getName();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor24 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount31 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean32 = occupancySensor24.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount31);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor36 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor36.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount45 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount45.setEmail("");
        boolean boolean48 = occupancySensor36.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount45);
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
        com.conferenceroomscheduler.model.StudentAccount studentAccount77 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        checkInPublisher58.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount77);
        occupancySensor36.subject = checkInPublisher58;
        occupancySensor24.subject = checkInPublisher58;
        com.conferenceroomscheduler.model.StaffAccount staffAccount87 = new com.conferenceroomscheduler.model.StaffAccount("hi!", "Booking complete", "Booking confirmed.", false, false, "Booking complete");
        checkInPublisher58.notifyObservers((com.conferenceroomscheduler.model.Account) staffAccount87);
        room6.checkIn((com.conferenceroomscheduler.model.Account) staffAccount87);
        room6.setRoomId("Checked in.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cancelled" + "'", str20, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Checked in.", "Cancelled", "admin", true, true, "Pending");
        partnerAccount6.setIdentifier("Cancelled");
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand8 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setHourlyRate((double) 0L);
        reservation1.setReservationId("Booking confirmed.");
        boolean boolean13 = reservation1.isExtended();
        boolean boolean14 = reservation1.isDepositLost();
        double double15 = reservation1.getDepositAmount();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        java.lang.String str6 = badgeScan3.getBadgeId();
        badgeScan3.setVerified(false);
        badgeScan3.setVerified(false);
        boolean boolean11 = badgeScan3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
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
        boolean boolean23 = occupancySensor3.occupied;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher24 = occupancySensor3.getSubject();
        occupancySensor3.isDetected = true;
        occupancySensor3.setDetected(false);
        boolean boolean29 = occupancySensor3.isDetected();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(checkInPublisher24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Cancelled", "faculty", "student", "Pending", 52, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getTitle();
        int int9 = bookingRequest7.getAttendeeCount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Pending" + "'", str8, "Pending");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = null;
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime5, localDateTime6, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod11);
        reservation12.setDepositLost(true);
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand16 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation12, localDateTime15);
        reservation12.setExtended(true);
        reservation12.setFinalAmount((double) (byte) 0);
        java.time.LocalDateTime localDateTime21 = null;
        reservation12.setStartTime(localDateTime21);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        java.lang.String str8 = room6.getBuilding();
        com.conferenceroomscheduler.model.StudentAccount studentAccount15 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        studentAccount15.setUniversityAccount(false);
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount15);
        room6.setEnabled(false);
        java.lang.String str21 = room6.getName();
        com.conferenceroomscheduler.model.AdminAccount adminAccount22 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str23 = adminAccount22.getEmail();
        boolean boolean24 = adminAccount22.isUniversityAccount();
        java.lang.String str25 = adminAccount22.getPassword();
        room6.checkIn((com.conferenceroomscheduler.model.Account) adminAccount22);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Cancelled", true, false);
        java.lang.String str4 = occupancySensor3.roomId;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cancelled" + "'", str4, "Cancelled");
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        studentAccount10.setEmail("Checked in.");
        java.lang.String str14 = studentAccount10.getAccountNumber();
        boolean boolean15 = studentAccount10.isVerified();
        studentAccount10.setIdentifier("Booking confirmed.");
        studentAccount10.setIdentifier("");
        studentAccount10.setEmail("Unverified badge detected for .");
        java.lang.String str22 = studentAccount10.getPassword();
        studentAccount10.setUniversityAccount(true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cancelled" + "'", str22, "Cancelled");
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
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
        double double12 = reservation11.getHourlyRate();
        boolean boolean13 = reservation11.isDepositLost();
        java.time.LocalDateTime localDateTime14 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand15 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation11, localDateTime14);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNotNull(reservation10);
        org.junit.Assert.assertNotNull(reservation11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        java.time.LocalDateTime localDateTime4 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand5 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime4);
        reservation1.setHourlyRate((double) (short) 1);
        java.time.LocalDateTime localDateTime8 = null;
        reservation1.setEndTime(localDateTime8);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        java.lang.String str12 = occupancySensor3.roomId;
        boolean boolean13 = occupancySensor3.isOccupied();
        com.conferenceroomscheduler.model.StudentAccount studentAccount20 = new com.conferenceroomscheduler.model.StudentAccount("Cancelled", "Cancelled", "Pending", false, true, "Checked in.");
        boolean boolean21 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount20);
        java.lang.String str22 = studentAccount20.getEmail();
        java.lang.String str23 = studentAccount20.getPassword();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pending" + "'", str12, "Pending");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cancelled" + "'", str22, "Cancelled");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pending" + "'", str23, "Pending");
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        java.lang.String str4 = reservation1.getAccountType();
        double double5 = reservation1.getDepositAmount();
        java.lang.String str6 = reservation1.getAccountType();
        java.lang.String str7 = reservation1.getAccountType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setCheckedIn(true);
        reservation0.setCheckedIn(false);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = reservation0.getPaymentMethod();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext12 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState13 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState14 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation15 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext16 = new com.conferenceroomscheduler.patterns.BookingContext(reservation15);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState17 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext16.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState17);
        com.conferenceroomscheduler.patterns.BookingState bookingState19 = bookingContext16.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState20 = bookingContext16.getState();
        cancelledBookingState14.handle(bookingContext16);
        checkedInBookingState13.handle(bookingContext16);
        com.conferenceroomscheduler.model.Reservation reservation23 = new com.conferenceroomscheduler.model.Reservation();
        reservation23.setFinalAmount((double) (byte) 100);
        reservation23.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext28 = new com.conferenceroomscheduler.patterns.BookingContext(reservation23);
        checkedInBookingState13.handle(bookingContext28);
        com.conferenceroomscheduler.model.Reservation reservation30 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext31 = new com.conferenceroomscheduler.patterns.BookingContext(reservation30);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState32 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext31.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState32);
        com.conferenceroomscheduler.patterns.BookingState bookingState34 = bookingContext31.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState35 = bookingContext31.getState();
        bookingContext31.request();
        bookingContext31.request();
        com.conferenceroomscheduler.model.Reservation reservation38 = bookingContext31.getReservation();
        checkedInBookingState13.handle(bookingContext31);
        java.lang.String str40 = checkedInBookingState13.getName();
        com.conferenceroomscheduler.model.Reservation reservation41 = new com.conferenceroomscheduler.model.Reservation();
        reservation41.setFinalAmount((double) (byte) 100);
        java.lang.String str44 = reservation41.getRoomId();
        reservation41.setFinalAmount((double) 10.0f);
        java.lang.String str47 = reservation41.getUserId();
        reservation41.setFinalAmount((double) ' ');
        java.lang.String str50 = reservation41.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext51 = new com.conferenceroomscheduler.patterns.BookingContext(reservation41);
        bookingContext51.request();
        checkedInBookingState13.handle(bookingContext51);
        java.lang.String str54 = checkedInBookingState13.getName();
        bookingContext12.setState((com.conferenceroomscheduler.patterns.BookingState) checkedInBookingState13);
        java.lang.String str56 = checkedInBookingState13.getName();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(paymentMethod11);
        org.junit.Assert.assertNotNull(bookingState19);
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertNotNull(bookingState34);
        org.junit.Assert.assertNotNull(bookingState35);
        org.junit.Assert.assertNull(reservation38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Checked in." + "'", str40, "Checked in.");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Checked in." + "'", str54, "Checked in.");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Checked in." + "'", str56, "Checked in.");
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        java.lang.String str3 = reservation0.getUserId();
        boolean boolean4 = reservation0.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation0.getPaymentMethod();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext8 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.BookingState bookingState9 = bookingContext8.getState();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertNotNull(bookingState9);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        room6.setName("Pending");
        int int9 = room6.getCapacity();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = room6.getOccupancySensor();
        room6.setBuilding("staff");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(occupancySensor10);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setReservationId("Checked in.");
        double double9 = reservation0.getDepositAmount();
        reservation0.setCheckedIn(true);
        boolean boolean12 = reservation0.isCheckedIn();
        boolean boolean13 = reservation0.isCanceled();
        reservation0.setHourlyRate((double) (-1.0f));
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("partner", "Unverified badge detected for .", "Unverified badge detected for .", "Unverified badge detected for Cancelled.", false, false, "Cancelled");
        account7.setPassword("ADMIN-69");
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
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
        java.lang.String str60 = occupancySensor3.getLastEvent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(checkInPublisher12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(checkInPublisher20);
        org.junit.Assert.assertNull(checkInPublisher21);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(checkInPublisher59);
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
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
        reservation1.setTitle("Unverified badge detected for admin.");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor47 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount54 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean55 = occupancySensor47.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount54);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher56 = null;
        occupancySensor47.setSubject(checkInPublisher56);
        occupancySensor47.isDetected = false;
        boolean boolean60 = occupancySensor47.isOccupied();
        com.conferenceroomscheduler.model.Badge badge64 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str65 = badge64.getEmail();
        boolean boolean66 = occupancySensor47.scanIdBadge(badge64);
        java.lang.String str67 = badge64.getAccountId();
        badge64.setAccountId("Checked in.");
        boolean boolean70 = occupancySensor3.scanIdBadge(badge64);
        java.lang.String str71 = badge64.getEmail();
        java.lang.String str72 = badge64.getAccountId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(checkInPublisher7);
        org.junit.Assert.assertNull(checkInPublisher8);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Cancelled" + "'", str65, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Booking confirmed." + "'", str67, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Cancelled" + "'", str71, "Cancelled");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Checked in." + "'", str72, "Checked in.");
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
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
        boolean boolean29 = occupancySensor15.isDetected;
        boolean boolean30 = occupancySensor15.isDetected();
        occupancySensor15.setRoomId("Unverified badge detected for .");
        java.lang.String str33 = occupancySensor15.roomId;
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Unverified badge detected for ." + "'", str33, "Unverified badge detected for .");
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount0.setAccountNumber("hi!");
        com.conferenceroomscheduler.model.Badge badge3 = adminAccount0.getBadge();
        org.junit.Assert.assertNull(badge3);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
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
        boolean boolean27 = badge20.isVerified();
        java.lang.String str28 = badge20.getEmail();
        badge20.setAccountId("faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking confirmed." + "'", str23, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Cancelled" + "'", str26, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Cancelled" + "'", str28, "Cancelled");
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("", (double) (byte) 1);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("admin", (double) 'a');
        boolean boolean9 = creditCardPaymentStrategy0.processPayment("Unverified badge detected for .", (double) (short) 0);
        boolean boolean12 = creditCardPaymentStrategy0.processPayment("Pending", (double) ' ');
        boolean boolean15 = creditCardPaymentStrategy0.processPayment("", (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        occupancySensor3.occupied = true;
        occupancySensor3.setDetected(false);
        java.lang.String str10 = occupancySensor3.getLastEvent();
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount17 = new com.conferenceroomscheduler.model.PartnerAccount("Booking complete", "Checked in.", "Unverified badge detected for .", false, true, "Pending");
        boolean boolean18 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) partnerAccount17);
        occupancySensor3.roomId = "admin";
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("student", "Booking complete", "Cancelled", true, false, "hi!");
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = bookingRequest7.getEndTime();
        java.lang.String str9 = bookingRequest7.getTitle();
        java.lang.String str10 = bookingRequest7.getRoomId();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cancelled" + "'", str10, "Cancelled");
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        java.lang.String str4 = reservation1.getAccountType();
        java.time.LocalDateTime localDateTime5 = null;
        reservation1.setStartTime(localDateTime5);
        java.time.LocalDateTime localDateTime7 = reservation1.getEndTime();
        double double8 = reservation1.getHourlyRate();
        double double9 = reservation1.getHourlyRate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setHourlyRate((double) (byte) 100);
        boolean boolean4 = reservation1.isDepositLost();
        java.lang.String str5 = reservation1.getUserId();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand8 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime6, localDateTime7);
        reservation1.setCheckedIn(true);
        reservation1.setCanceled(true);
        reservation1.setAccountType("Booking complete");
        java.time.LocalDateTime localDateTime15 = null;
        reservation1.setEndTime(localDateTime15);
        double double17 = reservation1.getFinalAmount();
        reservation1.setExtended(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        reservation1.setDepositAmount((double) (byte) 0);
        double double10 = reservation1.getHourlyRate();
        reservation1.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext13 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod24 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation25 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime18, localDateTime19, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod24);
        reservation1.setPaymentMethod(paymentMethod24);
        java.time.LocalDateTime localDateTime27 = reservation1.getStartTime();
        java.time.LocalDateTime localDateTime28 = reservation1.getStartTime();
        reservation1.setTitle("");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand31 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod32 = reservation1.getPaymentMethod();
        double double33 = reservation1.getFinalAmount();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod24 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod24.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + paymentMethod32 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod32.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("hi!", "Booking complete", "Booking confirmed.", false, false, "Booking complete");
        staffAccount6.setIdentifier("");
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setName("faculty");
        room6.setEnabled(true);
        room6.setRoomId("Unverified badge detected for Cancelled.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.isDetected;
        com.conferenceroomscheduler.model.Badge badge10 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        boolean boolean11 = occupancySensor3.scanIdBadge(badge10);
        occupancySensor3.roomId = "";
        com.conferenceroomscheduler.model.Account account14 = null;
        boolean boolean15 = occupancySensor3.detectOccupancy(account14);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
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
        badge72.setAccountId("");
        badge72.setEmail("admin");
        org.junit.Assert.assertNull(checkInPublisher4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(badge72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
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
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState35 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str36 = cancelledBookingState35.getName();
        com.conferenceroomscheduler.model.Reservation reservation37 = new com.conferenceroomscheduler.model.Reservation();
        reservation37.setFinalAmount((double) (byte) 100);
        reservation37.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext42 = new com.conferenceroomscheduler.patterns.BookingContext(reservation37);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState43 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str44 = cancelledBookingState43.getName();
        bookingContext42.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState43);
        bookingContext42.request();
        cancelledBookingState35.handle(bookingContext42);
        bookingContext42.request();
        checkedInBookingState0.handle(bookingContext42);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Checked in." + "'", str10, "Checked in.");
        org.junit.Assert.assertNull(reservation15);
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Cancelled" + "'", str30, "Cancelled");
        org.junit.Assert.assertNotNull(reservation32);
        org.junit.Assert.assertNotNull(reservation33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Cancelled" + "'", str36, "Cancelled");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Cancelled" + "'", str44, "Cancelled");
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "Booking confirmed.", false);
        boolean boolean4 = badgeScan3.isVerified();
        badgeScan3.setBadgeId("staff");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Booking confirmed.", "Unverified badge detected for admin.", "Pending", "Checked in.", (int) (byte) -1, localDateTime5, localDateTime6);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("student", "Booking complete", "Pending", false, false, "");
        java.lang.String str7 = facultyAccount6.getAccountType();
        java.lang.String str8 = facultyAccount6.getEmail();
        facultyAccount6.setAccountId("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking complete" + "'", str8, "Booking complete");
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        java.lang.String str8 = room6.getBuilding();
        java.lang.String str9 = room6.getRoomNumber();
        int int10 = room6.getCapacity();
        boolean boolean11 = room6.isEnabled();
        room6.setCapacity((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
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
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(chiefEventCoordinator3);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        java.lang.String str6 = badgeScan3.getBadgeId();
        boolean boolean7 = badgeScan3.isVerified();
        java.lang.String str8 = badgeScan3.getBadgeId();
        badgeScan3.setBadgeId("partner");
        badgeScan3.setRoomId("Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory0 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account8 = facultyFactory0.createAccount("", "Cancelled", "", "hi!", false, false, "");
        account8.setAccountNumber("hi!");
        account8.setUniversityAccount(true);
        account8.setAccountType("Cancelled");
        account8.setPassword("");
        org.junit.Assert.assertNotNull(account8);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("admin", (double) (short) -1);
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("Pending", (double) (short) 10);
        boolean boolean9 = debitCardPaymentStrategy0.processPayment("hi!", (double) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        java.lang.String str4 = badgeScan3.getBadgeId();
        java.lang.String str5 = badgeScan3.getRoomId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        room6.setClosedForMaintenance(false);
        room6.setCapacity(100);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher17 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor21 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher22 = null;
        occupancySensor21.setSubject(checkInPublisher22);
        occupancySensor21.occupied = true;
        occupancySensor21.setDetected(false);
        checkInPublisher17.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor21);
        occupancySensor21.roomId = "hi!";
        room6.setOccupancySensor(occupancySensor21);
        java.lang.String str32 = room6.getBuilding();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher33 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
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
        boolean boolean61 = occupancySensor37.isDetected;
        checkInPublisher33.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor37);
        com.conferenceroomscheduler.model.AdminAccount adminAccount63 = new com.conferenceroomscheduler.model.AdminAccount();
        checkInPublisher33.notifyObservers((com.conferenceroomscheduler.model.Account) adminAccount63);
        com.conferenceroomscheduler.model.StaffAccount staffAccount71 = new com.conferenceroomscheduler.model.StaffAccount("hi!", "Booking complete", "Booking confirmed.", false, false, "Booking complete");
        checkInPublisher33.notifyObservers((com.conferenceroomscheduler.model.Account) staffAccount71);
        staffAccount71.setPassword("hi!");
        room6.checkIn((com.conferenceroomscheduler.model.Account) staffAccount71);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getTitle();
        double double5 = reservation2.getDepositAmount();
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand7 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation2, localDateTime6);
        java.lang.Class<?> wildcardClass8 = extendBookingCommand7.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getOrganizerId();
        java.lang.String str10 = bookingRequest7.getTitle();
        java.lang.String str11 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
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
        com.conferenceroomscheduler.patterns.BookingState bookingState27 = bookingContext20.getState();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState28 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState29 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation30 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext31 = new com.conferenceroomscheduler.patterns.BookingContext(reservation30);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState32 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext31.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState32);
        com.conferenceroomscheduler.patterns.BookingState bookingState34 = bookingContext31.getState();
        com.conferenceroomscheduler.model.Reservation reservation35 = bookingContext31.getReservation();
        cancelledBookingState29.handle(bookingContext31);
        checkedInBookingState28.handle(bookingContext31);
        bookingContext31.request();
        com.conferenceroomscheduler.model.Reservation reservation39 = bookingContext31.getReservation();
        java.lang.String str40 = bookingContext31.getStatus();
        bookingState27.handle(bookingContext31);
        java.lang.String str42 = bookingContext31.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            pendingBookingState0.handle(bookingContext31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.model.Reservation.getDepositAmount()\" because the return value of \"com.conferenceroomscheduler.patterns.BookingContext.getReservation()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pending" + "'", str1, "Pending");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertNotNull(bookingState24);
        org.junit.Assert.assertNotNull(bookingState27);
        org.junit.Assert.assertNotNull(bookingState34);
        org.junit.Assert.assertNull(reservation35);
        org.junit.Assert.assertNull(reservation39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Booking complete" + "'", str40, "Booking complete");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Booking complete" + "'", str42, "Booking complete");
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor0 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor0.update("Checked in.");
        roomSensor0.update("Booking confirmed.");
        roomSensor0.update("Booking complete");
        roomSensor0.update("");
        roomSensor0.update("faculty");
        roomSensor0.update("Cancelled");
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Pending", "Cancelled", (int) (byte) 10, "Checked in.", "Cancelled");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("Booking complete", "student", (int) (byte) 100, "Booking complete", "faculty");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("partner", "student", (int) (short) 100, "Unverified badge detected for Cancelled.", "faculty");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor25 = room24.getOccupancySensor();
        java.lang.String str26 = room24.getName();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
        org.junit.Assert.assertNotNull(occupancySensor25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "student" + "'", str26, "student");
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        com.conferenceroomscheduler.model.AdminAccount adminAccount11 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount11.setAccountNumber("hi!");
        java.lang.String str14 = adminAccount11.getAccountId();
        room6.checkIn((com.conferenceroomscheduler.model.Account) adminAccount11);
        java.lang.String str16 = adminAccount11.getPassword();
        java.lang.String str17 = adminAccount11.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setEnabled(true);
        java.lang.String str13 = room6.getName();
        room6.setBuilding("Unverified badge detected for Cancelled.");
        room6.setClosedForMaintenance(false);
        boolean boolean18 = room6.isEnabled();
        java.lang.String str19 = room6.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "Verified badge detected for ADMIN-69.", false);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getTitle();
        double double4 = reservation1.getDepositAmount();
        reservation1.setTitle("");
        double double7 = reservation1.getFinalAmount();
        reservation1.setFinalAmount((double) (short) 0);
        double double10 = reservation1.getHourlyRate();
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService11 = null;
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation();
        reservation12.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod15 = reservation12.getPaymentMethod();
        reservation12.setFinalAmount((double) (byte) 1);
        java.lang.String str18 = reservation12.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand19 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService11, reservation12);
        reservation12.setHourlyRate((double) 0L);
        reservation12.setReservationId("Booking confirmed.");
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService34 = null;
        com.conferenceroomscheduler.model.Reservation reservation35 = new com.conferenceroomscheduler.model.Reservation();
        reservation35.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod38 = reservation35.getPaymentMethod();
        reservation35.setDepositAmount(0.0d);
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand43 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService34, reservation35, localDateTime41, localDateTime42);
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime59 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod64 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation65 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime58, localDateTime59, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod64);
        com.conferenceroomscheduler.model.Reservation reservation66 = new com.conferenceroomscheduler.model.Reservation("", "Pending", "Pending", "Booking complete", localDateTime48, localDateTime49, "Booking confirmed.", (double) 0.0f, (double) 1, (double) (byte) 100, paymentMethod64);
        reservation35.setPaymentMethod(paymentMethod64);
        com.conferenceroomscheduler.model.Reservation reservation68 = new com.conferenceroomscheduler.model.Reservation("admin", "Booking complete", "", "student", localDateTime28, localDateTime29, "Booking confirmed.", (double) 0, (double) (-1L), (-1.0d), paymentMethod64);
        reservation12.setPaymentMethod(paymentMethod64);
        reservation1.setPaymentMethod(paymentMethod64);
        double double71 = reservation1.getDepositAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(paymentMethod15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(paymentMethod38);
        org.junit.Assert.assertTrue("'" + paymentMethod64 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod64.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
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
        boolean boolean47 = occupancySensor3.isDetected();
        boolean boolean48 = occupancySensor3.occupied;
        occupancySensor3.setRoomId("");
        java.lang.String str51 = occupancySensor3.getLastEvent();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pending" + "'", str12, "Pending");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Cancelled" + "'", str35, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Booking confirmed." + "'", str37, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Unverified badge detected for Cancelled." + "'", str51, "Unverified badge detected for Cancelled.");
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
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
        reservation1.setTitle("partner");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor77 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher78 = null;
        occupancySensor77.setSubject(checkInPublisher78);
        boolean boolean80 = occupancySensor77.isDetected;
        occupancySensor77.setRoomId("");
        java.lang.String str83 = occupancySensor77.roomId;
        checkInPublisher58.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor77);
        java.lang.String str85 = occupancySensor77.getLastEvent();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNull(str85);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        int int8 = bookingRequest7.getAttendeeCount();
        java.lang.String str9 = bookingRequest7.getTitle();
        java.lang.String str10 = bookingRequest7.getTitle();
        java.lang.String str11 = bookingRequest7.getRequestId();
        java.time.LocalDateTime localDateTime12 = bookingRequest7.getStartTime();
        java.lang.String str13 = bookingRequest7.getOrganizerId();
        int int14 = bookingRequest7.getAttendeeCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Pending", "Pending", (int) (short) -1, "", "Cancelled");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("Cancelled", "ADMIN-69", (-1), "faculty", "Pending");
        room18.setCapacity(10);
        room18.setBuilding("Verified badge detected for ADMIN-69.");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
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
        java.lang.String str15 = bookingRequest7.getOrganizerId();
        java.time.LocalDateTime localDateTime16 = bookingRequest7.getStartTime();
        java.lang.String str17 = bookingRequest7.getTitle();
        java.lang.String str18 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor3.isDetected = false;
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount12 = new com.conferenceroomscheduler.model.PartnerAccount("hi!", "student", "admin", false, false, "Cancelled");
        java.lang.String str13 = partnerAccount12.getAccountId();
        boolean boolean14 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) partnerAccount12);
        java.lang.String str15 = occupancySensor3.roomId;
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Pending" + "'", str15, "Pending");
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        double double7 = reservation0.getFinalAmount();
        reservation0.setCanceled(false);
        reservation0.setDepositLost(false);
        java.lang.String str12 = reservation0.getAccountType();
        java.lang.String str13 = reservation0.getAccountType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
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
        java.lang.String str19 = checkedInBookingState9.getName();
        com.conferenceroomscheduler.model.Reservation reservation20 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext21 = new com.conferenceroomscheduler.patterns.BookingContext(reservation20);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState22 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext21.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState22);
        com.conferenceroomscheduler.model.Reservation reservation24 = bookingContext21.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation25 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext26 = new com.conferenceroomscheduler.patterns.BookingContext(reservation25);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState27 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext26.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState27);
        com.conferenceroomscheduler.patterns.BookingState bookingState29 = bookingContext26.getState();
        bookingContext21.setState(bookingState29);
        checkedInBookingState9.handle(bookingContext21);
        com.conferenceroomscheduler.model.Reservation reservation32 = bookingContext21.getReservation();
        java.lang.String str33 = bookingContext21.getStatus();
        java.lang.String str34 = bookingContext21.getStatus();
        confirmedBookingState0.handle(bookingContext21);
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
        java.lang.String str46 = checkedInBookingState36.getName();
        com.conferenceroomscheduler.model.Reservation reservation47 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext48 = new com.conferenceroomscheduler.patterns.BookingContext(reservation47);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState49 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext48.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState49);
        com.conferenceroomscheduler.model.Reservation reservation51 = bookingContext48.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation52 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext53 = new com.conferenceroomscheduler.patterns.BookingContext(reservation52);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState54 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext53.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState54);
        com.conferenceroomscheduler.patterns.BookingState bookingState56 = bookingContext53.getState();
        bookingContext48.setState(bookingState56);
        checkedInBookingState36.handle(bookingContext48);
        com.conferenceroomscheduler.model.Reservation reservation59 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext60 = new com.conferenceroomscheduler.patterns.BookingContext(reservation59);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState61 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext60.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState61);
        com.conferenceroomscheduler.patterns.BookingState bookingState63 = bookingContext60.getState();
        com.conferenceroomscheduler.model.Reservation reservation64 = bookingContext60.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation65 = bookingContext60.getReservation();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState66 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState67 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation68 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext69 = new com.conferenceroomscheduler.patterns.BookingContext(reservation68);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState70 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext69.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState70);
        com.conferenceroomscheduler.patterns.BookingState bookingState72 = bookingContext69.getState();
        com.conferenceroomscheduler.model.Reservation reservation73 = bookingContext69.getReservation();
        cancelledBookingState67.handle(bookingContext69);
        checkedInBookingState66.handle(bookingContext69);
        bookingContext69.request();
        com.conferenceroomscheduler.patterns.BookingState bookingState77 = bookingContext69.getState();
        bookingContext60.setState(bookingState77);
        checkedInBookingState36.handle(bookingContext60);
        com.conferenceroomscheduler.patterns.BookingState bookingState80 = null;
        bookingContext60.setState(bookingState80);
        confirmedBookingState0.handle(bookingContext60);
        java.lang.String str83 = confirmedBookingState0.getName();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext84 = null;
        // The following exception was thrown during execution in test generation
        try {
            confirmedBookingState0.handle(bookingContext84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.patterns.BookingContext.setState(com.conferenceroomscheduler.patterns.BookingState)\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking confirmed." + "'", str1, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking confirmed." + "'", str2, "Booking confirmed.");
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Checked in." + "'", str19, "Checked in.");
        org.junit.Assert.assertNull(reservation24);
        org.junit.Assert.assertNotNull(bookingState29);
        org.junit.Assert.assertNull(reservation32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Booking complete" + "'", str33, "Booking complete");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Booking complete" + "'", str34, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState42);
        org.junit.Assert.assertNotNull(bookingState43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Checked in." + "'", str46, "Checked in.");
        org.junit.Assert.assertNull(reservation51);
        org.junit.Assert.assertNotNull(bookingState56);
        org.junit.Assert.assertNotNull(bookingState63);
        org.junit.Assert.assertNull(reservation64);
        org.junit.Assert.assertNull(reservation65);
        org.junit.Assert.assertNotNull(bookingState72);
        org.junit.Assert.assertNull(reservation73);
        org.junit.Assert.assertNotNull(bookingState77);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Booking confirmed." + "'", str83, "Booking confirmed.");
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
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
        java.lang.String str12 = pendingBookingState0.getName();
        java.lang.String str13 = pendingBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation14 = new com.conferenceroomscheduler.model.Reservation();
        reservation14.setFinalAmount((double) (byte) 100);
        java.lang.String str17 = reservation14.getRoomId();
        reservation14.setFinalAmount((double) 10.0f);
        java.lang.String str20 = reservation14.getUserId();
        reservation14.setFinalAmount((double) ' ');
        java.lang.String str23 = reservation14.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext24 = new com.conferenceroomscheduler.patterns.BookingContext(reservation14);
        bookingContext24.request();
        pendingBookingState0.handle(bookingContext24);
        java.lang.String str27 = pendingBookingState0.getName();
        java.lang.String str28 = pendingBookingState0.getName();
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService29 = null;
        com.conferenceroomscheduler.model.Reservation reservation30 = new com.conferenceroomscheduler.model.Reservation();
        reservation30.setFinalAmount((double) (byte) 100);
        java.lang.String str33 = reservation30.getRoomId();
        reservation30.setFinalAmount((double) 10.0f);
        java.lang.String str36 = reservation30.getUserId();
        reservation30.setDepositAmount((double) (byte) 0);
        double double39 = reservation30.getHourlyRate();
        reservation30.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext42 = new com.conferenceroomscheduler.patterns.BookingContext(reservation30);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod53 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation54 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime47, localDateTime48, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod53);
        reservation30.setPaymentMethod(paymentMethod53);
        java.time.LocalDateTime localDateTime56 = reservation30.getStartTime();
        java.time.LocalDateTime localDateTime57 = reservation30.getStartTime();
        reservation30.setTitle("");
        java.time.LocalDateTime localDateTime60 = null;
        java.time.LocalDateTime localDateTime61 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand62 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService29, reservation30, localDateTime60, localDateTime61);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext63 = new com.conferenceroomscheduler.patterns.BookingContext(reservation30);
        pendingBookingState0.handle(bookingContext63);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState65 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState66 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation67 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext68 = new com.conferenceroomscheduler.patterns.BookingContext(reservation67);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState69 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext68.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState69);
        com.conferenceroomscheduler.patterns.BookingState bookingState71 = bookingContext68.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState72 = bookingContext68.getState();
        cancelledBookingState66.handle(bookingContext68);
        checkedInBookingState65.handle(bookingContext68);
        com.conferenceroomscheduler.model.Reservation reservation75 = new com.conferenceroomscheduler.model.Reservation();
        reservation75.setFinalAmount((double) (byte) 100);
        reservation75.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext80 = new com.conferenceroomscheduler.patterns.BookingContext(reservation75);
        checkedInBookingState65.handle(bookingContext80);
        com.conferenceroomscheduler.model.Reservation reservation82 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext83 = new com.conferenceroomscheduler.patterns.BookingContext(reservation82);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState84 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext83.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState84);
        checkedInBookingState65.handle(bookingContext83);
        com.conferenceroomscheduler.model.Reservation reservation87 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext88 = new com.conferenceroomscheduler.patterns.BookingContext(reservation87);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState89 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext88.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState89);
        com.conferenceroomscheduler.patterns.BookingState bookingState91 = bookingContext88.getState();
        com.conferenceroomscheduler.model.Reservation reservation92 = bookingContext88.getReservation();
        checkedInBookingState65.handle(bookingContext88);
        // The following exception was thrown during execution in test generation
        try {
            pendingBookingState0.handle(bookingContext88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.model.Reservation.getDepositAmount()\" because the return value of \"com.conferenceroomscheduler.patterns.BookingContext.getReservation()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pending" + "'", str1, "Pending");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pending" + "'", str12, "Pending");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pending" + "'", str13, "Pending");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Pending" + "'", str27, "Pending");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Pending" + "'", str28, "Pending");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod53 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod53.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertNull(localDateTime56);
        org.junit.Assert.assertNull(localDateTime57);
        org.junit.Assert.assertNotNull(bookingState71);
        org.junit.Assert.assertNotNull(bookingState72);
        org.junit.Assert.assertNotNull(bookingState91);
        org.junit.Assert.assertNull(reservation92);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
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
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher27 = occupancySensor3.getSubject();
        occupancySensor3.roomId = "";
        occupancySensor3.setDetected(false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor35 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount42 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean43 = occupancySensor35.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount42);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher44 = null;
        occupancySensor35.setSubject(checkInPublisher44);
        occupancySensor35.isDetected = false;
        boolean boolean48 = occupancySensor35.isOccupied();
        com.conferenceroomscheduler.model.Badge badge52 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str53 = badge52.getEmail();
        boolean boolean54 = occupancySensor35.scanIdBadge(badge52);
        java.lang.String str55 = badge52.getAccountId();
        badge52.setAccountId("Cancelled");
        badge52.setAccountId("");
        java.lang.String str60 = badge52.getAccountId();
        badge52.setEmail("student");
        boolean boolean63 = occupancySensor3.scanIdBadge(badge52);
        occupancySensor3.setDetected(false);
        java.lang.String str66 = occupancySensor3.roomId;
        boolean boolean67 = occupancySensor3.isOccupied();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher68 = occupancySensor3.getSubject();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(checkInPublisher27);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Cancelled" + "'", str53, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Booking confirmed." + "'", str55, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(checkInPublisher68);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Unverified badge detected for Cancelled.", "", "", "faculty", 100, localDateTime5, localDateTime6);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Unverified badge detected for Cancelled.", "Unverified badge detected for admin.", (int) (short) 1, true, "", "Pending");
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
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
        occupancySensor48.setDetected(true);
        com.conferenceroomscheduler.model.Account account63 = new com.conferenceroomscheduler.model.Account("Pending", "ADMIN-69", "Booking confirmed.", "faculty", false, true, "Pending");
        boolean boolean64 = occupancySensor48.detectOccupancy(account63);
        java.lang.String str65 = account63.getPassword();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(checkInPublisher52);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Booking confirmed." + "'", str65, "Booking confirmed.");
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        reservation0.setAccountType("");
        java.lang.String str12 = reservation0.getUserId();
        java.time.LocalDateTime localDateTime13 = null;
        reservation0.setEndTime(localDateTime13);
        java.time.LocalDateTime localDateTime15 = reservation0.getStartTime();
        double double16 = reservation0.getDepositAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("", "", "Cancelled", false, true, "Booking complete");
        boolean boolean7 = staffAccount6.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
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
        java.lang.String str12 = pendingBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation13 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext14 = new com.conferenceroomscheduler.patterns.BookingContext(reservation13);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState15 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext14.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState15);
        com.conferenceroomscheduler.patterns.BookingState bookingState17 = bookingContext14.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState18 = bookingContext14.getState();
        bookingContext14.request();
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState20 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str21 = confirmedBookingState20.getName();
        java.lang.String str22 = confirmedBookingState20.getName();
        java.lang.String str23 = confirmedBookingState20.getName();
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
        com.conferenceroomscheduler.model.Reservation reservation47 = bookingContext36.getReservation();
        confirmedBookingState20.handle(bookingContext36);
        java.lang.String str49 = confirmedBookingState20.getName();
        java.lang.String str50 = confirmedBookingState20.getName();
        java.lang.String str51 = confirmedBookingState20.getName();
        bookingContext14.setState((com.conferenceroomscheduler.patterns.BookingState) confirmedBookingState20);
        java.lang.String str53 = confirmedBookingState20.getName();
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState54 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str55 = confirmedBookingState54.getName();
        java.lang.String str56 = confirmedBookingState54.getName();
        java.lang.String str57 = confirmedBookingState54.getName();
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState58 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation59 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext60 = new com.conferenceroomscheduler.patterns.BookingContext(reservation59);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState61 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext60.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState61);
        completedBookingState58.handle(bookingContext60);
        confirmedBookingState54.handle(bookingContext60);
        confirmedBookingState20.handle(bookingContext60);
        java.lang.String str66 = bookingContext60.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            pendingBookingState0.handle(bookingContext60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.model.Reservation.getDepositAmount()\" because the return value of \"com.conferenceroomscheduler.patterns.BookingContext.getReservation()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pending" + "'", str1, "Pending");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pending" + "'", str12, "Pending");
        org.junit.Assert.assertNotNull(bookingState17);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Booking confirmed." + "'", str21, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Booking confirmed." + "'", str22, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking confirmed." + "'", str23, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState30);
        org.junit.Assert.assertNotNull(bookingState31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Checked in." + "'", str34, "Checked in.");
        org.junit.Assert.assertNull(reservation39);
        org.junit.Assert.assertNotNull(bookingState44);
        org.junit.Assert.assertNull(reservation47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Booking confirmed." + "'", str49, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Booking confirmed." + "'", str50, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Booking confirmed." + "'", str51, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Booking confirmed." + "'", str53, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Booking confirmed." + "'", str55, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Booking confirmed." + "'", str56, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Booking confirmed." + "'", str57, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Checked in." + "'", str66, "Checked in.");
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Pending", "Cancelled", (int) (byte) 10, "Checked in.", "Cancelled");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("", "student", (int) '4', "student", "Cancelled");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("hi!", "faculty", (int) (short) 1, "student", "student");
        com.conferenceroomscheduler.model.Room room30 = roomFactory0.createRoom("admin", "hi!", (int) '4', "admin", "admin");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
        org.junit.Assert.assertNotNull(room30);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        boolean boolean4 = badgeScan3.isVerified();
        boolean boolean5 = badgeScan3.isVerified();
        java.lang.String str6 = badgeScan3.getBadgeId();
        badgeScan3.setVerified(false);
        java.lang.String str9 = badgeScan3.getBadgeId();
        badgeScan3.setVerified(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation2.getPaymentMethod();
        reservation2.setFinalAmount((double) (byte) 1);
        java.lang.String str8 = reservation2.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand9 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService1, reservation2);
        reservation2.setAccountType("Pending");
        java.time.LocalDateTime localDateTime12 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand13 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation2, localDateTime12);
        boolean boolean14 = reservation2.isCheckedIn();
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher9 = occupancySensor4.subject;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = new com.conferenceroomscheduler.model.OccupancySensor("Cancelled", false, false);
        checkInPublisher9.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor13);
        occupancySensor13.isDetected = true;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(checkInPublisher9);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Checked in.", "Checked in.", false);
        badge3.setAccountId("Booking complete");
        java.lang.String str6 = badge3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Checked in." + "'", str6, "Checked in.");
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Booking complete", "Cancelled", (int) (short) 1, "Booking complete", "");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = room12.getOccupancySensor();
        boolean boolean14 = occupancySensor13.occupied;
        boolean boolean15 = occupancySensor13.occupied;
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(occupancySensor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = room6.getOccupancySensor();
        boolean boolean11 = occupancySensor10.isOccupied();
        com.conferenceroomscheduler.model.StudentAccount studentAccount18 = new com.conferenceroomscheduler.model.StudentAccount("", "Pending", "", true, false, "Pending");
        boolean boolean19 = occupancySensor10.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount18);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(occupancySensor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("hi!", "student", true);
        java.lang.String str4 = badgeScan3.getRoomId();
        boolean boolean5 = badgeScan3.isVerified();
        badgeScan3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
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
        boolean boolean15 = reservation1.isCheckedIn();
        java.time.LocalDateTime localDateTime16 = null;
        reservation1.setStartTime(localDateTime16);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod18 = reservation1.getPaymentMethod();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(paymentMethod18);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        java.lang.String str3 = reservation0.getUserId();
        boolean boolean4 = reservation0.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation0.getPaymentMethod();
        reservation0.setUserId("");
        reservation0.setDepositLost(false);
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService10 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod21 = null;
        com.conferenceroomscheduler.model.Reservation reservation22 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime15, localDateTime16, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod21);
        reservation22.setDepositLost(true);
        java.time.LocalDateTime localDateTime25 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand26 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService10, reservation22, localDateTime25);
        reservation22.setHourlyRate((double) (-1.0f));
        boolean boolean29 = reservation22.isDepositLost();
        java.lang.String str30 = reservation22.getReservationId();
        java.time.LocalDateTime localDateTime31 = reservation22.getEndTime();
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        com.conferenceroomscheduler.model.Reservation reservation52 = new com.conferenceroomscheduler.model.Reservation();
        reservation52.setFinalAmount((double) (byte) 100);
        java.lang.String str55 = reservation52.getRoomId();
        reservation52.setFinalAmount((double) 10.0f);
        java.lang.String str58 = reservation52.getUserId();
        reservation52.setDepositAmount((double) (byte) 0);
        double double61 = reservation52.getHourlyRate();
        reservation52.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext64 = new com.conferenceroomscheduler.patterns.BookingContext(reservation52);
        java.time.LocalDateTime localDateTime69 = null;
        java.time.LocalDateTime localDateTime70 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod75 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation76 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime69, localDateTime70, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod75);
        reservation52.setPaymentMethod(paymentMethod75);
        com.conferenceroomscheduler.model.Reservation reservation78 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "Booking complete", "admin", "Booking complete", localDateTime46, localDateTime47, "Booking confirmed.", (double) (short) -1, (double) 0.0f, (double) 0, paymentMethod75);
        com.conferenceroomscheduler.model.Reservation reservation79 = new com.conferenceroomscheduler.model.Reservation("student", "", "Booking complete", "Pending", localDateTime36, localDateTime37, "Checked in.", 0.0d, (double) 'a', (double) (-1.0f), paymentMethod75);
        reservation22.setPaymentMethod(paymentMethod75);
        reservation0.setPaymentMethod(paymentMethod75);
        double double82 = reservation0.getHourlyRate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(localDateTime31);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod75 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod75.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        boolean boolean9 = reservation0.isCheckedIn();
        boolean boolean10 = reservation0.isDepositLost();
        java.lang.String str11 = reservation0.getTitle();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = null;
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime5, localDateTime6, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod11);
        reservation12.setDepositLost(true);
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand16 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation12, localDateTime15);
        double double17 = reservation12.getHourlyRate();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext18 = new com.conferenceroomscheduler.patterns.BookingContext(reservation12);
        com.conferenceroomscheduler.model.Reservation reservation19 = new com.conferenceroomscheduler.model.Reservation();
        reservation19.setFinalAmount((double) (byte) 100);
        java.lang.String str22 = reservation19.getRoomId();
        reservation19.setRoomId("hi!");
        java.lang.String str25 = reservation19.getReservationId();
        com.conferenceroomscheduler.model.Reservation reservation26 = new com.conferenceroomscheduler.model.Reservation();
        reservation26.setFinalAmount((double) (byte) 100);
        reservation26.setRoomId("hi!");
        reservation26.setTitle("Pending");
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod73 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation74 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime67, localDateTime68, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod73);
        com.conferenceroomscheduler.model.Reservation reservation75 = new com.conferenceroomscheduler.model.Reservation("", "Pending", "Pending", "Booking complete", localDateTime57, localDateTime58, "Booking confirmed.", (double) 0.0f, (double) 1, (double) (byte) 100, paymentMethod73);
        com.conferenceroomscheduler.model.Reservation reservation76 = new com.conferenceroomscheduler.model.Reservation("Pending", "Booking complete", "Cancelled", "hi!", localDateTime47, localDateTime48, "", (double) '4', (double) 100.0f, (double) ' ', paymentMethod73);
        com.conferenceroomscheduler.model.Reservation reservation77 = new com.conferenceroomscheduler.model.Reservation("faculty", "student", "student", "Cancelled", localDateTime37, localDateTime38, "", (double) 'a', (double) 100L, 32.0d, paymentMethod73);
        reservation26.setPaymentMethod(paymentMethod73);
        reservation19.setPaymentMethod(paymentMethod73);
        reservation12.setPaymentMethod(paymentMethod73);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod81 = reservation12.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + paymentMethod73 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod73.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertTrue("'" + paymentMethod81 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod81.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
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
        com.conferenceroomscheduler.model.Reservation reservation47 = new com.conferenceroomscheduler.model.Reservation("Verified badge detected for Checked in..", "Booking complete", "Verified badge detected for Checked in..", "admin", localDateTime4, localDateTime5, "hi!", (double) 100, (double) 1L, (double) (short) 0, paymentMethod43);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod43 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod43.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("", (double) 0);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("", 0.0d);
        boolean boolean9 = creditCardPaymentStrategy0.processPayment("Verified badge detected for ADMIN-69.", (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("ADMIN-69", "Unverified badge detected for Cancelled.", (int) '#', false, "Unverified badge detected for .", "faculty");
        room6.setBuilding("Verified badge detected for ADMIN-69.");
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("Pending", "staff", "Unverified badge detected for Cancelled.", "admin", false, false, "faculty");
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Booking complete", "Pending", "Verified badge detected for ADMIN-69.", false, true, "faculty");
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Booking confirmed.", (int) (byte) 10, false, "Booking complete", "Unverified badge detected for Cancelled.");
        room6.setRoomNumber("Unverified badge detected for admin.");
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Unverified badge detected for .", false, false);
        occupancySensor3.setDetected(false);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        boolean boolean9 = reservation0.isExtended();
        java.lang.String str10 = reservation0.getUserId();
        java.lang.String str11 = reservation0.getUserId();
        reservation0.setDepositLost(false);
        java.time.LocalDateTime localDateTime14 = reservation0.getEndTime();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
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
        java.lang.String str14 = confirmedBookingState11.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState15 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState16 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation17 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext18 = new com.conferenceroomscheduler.patterns.BookingContext(reservation17);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState19 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext18.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState19);
        com.conferenceroomscheduler.patterns.BookingState bookingState21 = bookingContext18.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState22 = bookingContext18.getState();
        cancelledBookingState16.handle(bookingContext18);
        checkedInBookingState15.handle(bookingContext18);
        java.lang.String str25 = checkedInBookingState15.getName();
        com.conferenceroomscheduler.model.Reservation reservation26 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext27 = new com.conferenceroomscheduler.patterns.BookingContext(reservation26);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState28 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext27.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState28);
        com.conferenceroomscheduler.model.Reservation reservation30 = bookingContext27.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation31 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext32 = new com.conferenceroomscheduler.patterns.BookingContext(reservation31);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState33 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext32.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState33);
        com.conferenceroomscheduler.patterns.BookingState bookingState35 = bookingContext32.getState();
        bookingContext27.setState(bookingState35);
        checkedInBookingState15.handle(bookingContext27);
        com.conferenceroomscheduler.model.Reservation reservation38 = bookingContext27.getReservation();
        confirmedBookingState11.handle(bookingContext27);
        bookingContext3.setState((com.conferenceroomscheduler.patterns.BookingState) confirmedBookingState11);
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState41 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str42 = confirmedBookingState41.getName();
        java.lang.String str43 = confirmedBookingState41.getName();
        com.conferenceroomscheduler.model.Reservation reservation44 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext45 = new com.conferenceroomscheduler.patterns.BookingContext(reservation44);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState46 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext45.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState46);
        com.conferenceroomscheduler.model.Reservation reservation48 = bookingContext45.getReservation();
        confirmedBookingState41.handle(bookingContext45);
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
        confirmedBookingState41.handle(bookingContext68);
        confirmedBookingState11.handle(bookingContext68);
        java.lang.String str74 = bookingContext68.getStatus();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState75 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState76 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation77 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext78 = new com.conferenceroomscheduler.patterns.BookingContext(reservation77);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState79 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext78.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState79);
        com.conferenceroomscheduler.patterns.BookingState bookingState81 = bookingContext78.getState();
        com.conferenceroomscheduler.model.Reservation reservation82 = bookingContext78.getReservation();
        cancelledBookingState76.handle(bookingContext78);
        checkedInBookingState75.handle(bookingContext78);
        bookingContext78.request();
        com.conferenceroomscheduler.model.Reservation reservation86 = bookingContext78.getReservation();
        com.conferenceroomscheduler.patterns.BookingState bookingState87 = bookingContext78.getState();
        bookingContext68.setState(bookingState87);
        bookingContext68.request();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking confirmed." + "'", str12, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking confirmed." + "'", str13, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking confirmed." + "'", str14, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState21);
        org.junit.Assert.assertNotNull(bookingState22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Checked in." + "'", str25, "Checked in.");
        org.junit.Assert.assertNull(reservation30);
        org.junit.Assert.assertNotNull(bookingState35);
        org.junit.Assert.assertNull(reservation38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Booking confirmed." + "'", str42, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Booking confirmed." + "'", str43, "Booking confirmed.");
        org.junit.Assert.assertNull(reservation48);
        org.junit.Assert.assertNotNull(bookingState56);
        org.junit.Assert.assertNotNull(bookingState57);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Checked in." + "'", str74, "Checked in.");
        org.junit.Assert.assertNotNull(bookingState81);
        org.junit.Assert.assertNull(reservation82);
        org.junit.Assert.assertNull(reservation86);
        org.junit.Assert.assertNotNull(bookingState87);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory0 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account8 = facultyFactory0.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account16 = facultyFactory0.createAccount("", "hi!", "", "", false, true, "");
        com.conferenceroomscheduler.model.Account account24 = facultyFactory0.createAccount("Cancelled", "Pending", "Cancelled", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account32 = facultyFactory0.createAccount("Pending", "Cancelled", "Booking complete", "partner", false, true, "Booking confirmed.");
        com.conferenceroomscheduler.model.Account account40 = facultyFactory0.createAccount("hi!", "hi!", "faculty", "partner", false, true, "staff");
        com.conferenceroomscheduler.model.Account account48 = facultyFactory0.createAccount("Booking confirmed.", "Pending", "Unverified badge detected for Cancelled.", "admin", true, true, "Cancelled");
        account48.setVerified(true);
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
        org.junit.Assert.assertNotNull(account32);
        org.junit.Assert.assertNotNull(account40);
        org.junit.Assert.assertNotNull(account48);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("ADMIN-69", false, false);
        com.conferenceroomscheduler.model.Account account4 = null;
        boolean boolean5 = occupancySensor3.detectOccupancy(account4);
        occupancySensor3.roomId = "staff";
        boolean boolean8 = occupancySensor3.occupied;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        occupancySensor3.setDetected(true);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher8 = null;
        occupancySensor3.setSubject(checkInPublisher8);
        occupancySensor3.occupied = true;
        java.lang.Class<?> wildcardClass12 = occupancySensor3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setDepositAmount(0.0d);
        java.lang.String str7 = reservation1.getReservationId();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand10 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime8, localDateTime9);
        com.conferenceroomscheduler.model.Reservation reservation11 = new com.conferenceroomscheduler.model.Reservation();
        reservation11.setFinalAmount((double) (byte) 100);
        reservation11.setRoomId("hi!");
        reservation11.setRoomId("Booking confirmed.");
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod28 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation29 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime22, localDateTime23, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod28);
        reservation11.setPaymentMethod(paymentMethod28);
        reservation1.setPaymentMethod(paymentMethod28);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod32 = reservation1.getPaymentMethod();
        java.lang.String str33 = reservation1.getReservationId();
        java.lang.String str34 = reservation1.getRoomId();
        java.lang.String str35 = reservation1.getUserId();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + paymentMethod28 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod28.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertTrue("'" + paymentMethod32 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod32.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setName("hi!");
        room6.setName("");
        boolean boolean11 = room6.isClosedForMaintenance();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor12 = room6.getOccupancySensor();
        boolean boolean13 = room6.isClosedForMaintenance();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(occupancySensor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod30 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation31 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime24, localDateTime25, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod30);
        com.conferenceroomscheduler.model.Reservation reservation32 = new com.conferenceroomscheduler.model.Reservation("", "Pending", "Pending", "Booking complete", localDateTime14, localDateTime15, "Booking confirmed.", (double) 0.0f, (double) 1, (double) (byte) 100, paymentMethod30);
        com.conferenceroomscheduler.model.Reservation reservation33 = new com.conferenceroomscheduler.model.Reservation("Pending", "Booking complete", "Cancelled", "hi!", localDateTime4, localDateTime5, "", (double) '4', (double) 100.0f, (double) ' ', paymentMethod30);
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod44 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation45 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "hi!", "Booking complete", "Checked in.", localDateTime38, localDateTime39, "hi!", (double) 97, (double) 100L, (double) (byte) 100, paymentMethod44);
        reservation33.setPaymentMethod(paymentMethod44);
        java.time.LocalDateTime localDateTime47 = null;
        reservation33.setEndTime(localDateTime47);
        java.lang.String str49 = reservation33.getUserId();
        org.junit.Assert.assertTrue("'" + paymentMethod30 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod30.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertTrue("'" + paymentMethod44 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod44.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Cancelled" + "'", str49, "Cancelled");
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Booking complete", "Verified badge detected for ADMIN-69.", "Unverified badge detected for admin.", false, false, "ADMIN-69");
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Verified badge detected for ADMIN-69.", "", 0, true, "faculty", "hi!");
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("student", "faculty", "admin", "Checked in.", false, false, "faculty");
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setHourlyRate((double) (byte) 100);
        double double4 = reservation1.getFinalAmount();
        boolean boolean5 = reservation1.isDepositLost();
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand7 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime6);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand7.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.extendBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
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
        com.conferenceroomscheduler.model.Room room60 = roomFactory0.createRoom("Unverified badge detected for admin.", "staff", (int) 'a', "hi!", "Cancelled");
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
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        room6.setBuilding("Booking complete");
        room6.setClosedForMaintenance(true);
        room6.setRoomNumber("Booking confirmed.");
        room6.setClosedForMaintenance(true);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher27 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor31 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher32 = null;
        occupancySensor31.setSubject(checkInPublisher32);
        occupancySensor31.occupied = true;
        occupancySensor31.setDetected(false);
        checkInPublisher27.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor31);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor42 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor42.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount51 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount51.setEmail("");
        boolean boolean54 = occupancySensor42.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount51);
        checkInPublisher27.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor42);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor59 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor59.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount68 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount68.setEmail("");
        boolean boolean71 = occupancySensor59.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount68);
        checkInPublisher27.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor59);
        room6.setOccupancySensor(occupancySensor59);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher74 = occupancySensor59.subject;
        java.lang.String str75 = occupancySensor59.getLastEvent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(checkInPublisher74);
        org.junit.Assert.assertNull(str75);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        boolean boolean13 = room6.isEnabled();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor17 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher18 = null;
        occupancySensor17.setSubject(checkInPublisher18);
        occupancySensor17.setDetected(true);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher22 = null;
        occupancySensor17.setSubject(checkInPublisher22);
        room6.setOccupancySensor(occupancySensor17);
        boolean boolean25 = occupancySensor17.isDetected();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod20 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation21 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime14, localDateTime15, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod20);
        com.conferenceroomscheduler.model.Reservation reservation22 = new com.conferenceroomscheduler.model.Reservation("Booking confirmed.", "Booking confirmed.", "", "", localDateTime4, localDateTime5, "Booking complete", 0.0d, (double) 0, (double) 100.0f, paymentMethod20);
        reservation22.setReservationId("faculty");
        reservation22.setReservationId("student");
        java.time.LocalDateTime localDateTime27 = null;
        reservation22.setStartTime(localDateTime27);
        org.junit.Assert.assertTrue("'" + paymentMethod20 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod20.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        com.conferenceroomscheduler.patterns.StaffFactory staffFactory0 = new com.conferenceroomscheduler.patterns.StaffFactory();
        com.conferenceroomscheduler.model.Account account8 = staffFactory0.createAccount("", "Booking complete", "Booking confirmed.", "Cancelled", false, true, "Booking complete");
        com.conferenceroomscheduler.model.Account account16 = staffFactory0.createAccount("student", "Booking confirmed.", "admin", "student", false, true, "admin");
        com.conferenceroomscheduler.model.Account account24 = staffFactory0.createAccount("Cancelled", "Booking confirmed.", "Cancelled", "", true, true, "Cancelled");
        com.conferenceroomscheduler.model.Account account32 = staffFactory0.createAccount("ADMIN-69", "Booking confirmed.", "Checked in.", "hi!", true, true, "Checked in.");
        com.conferenceroomscheduler.model.Account account40 = staffFactory0.createAccount("faculty", "admin", "Checked in.", "Booking complete", false, true, "");
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
        org.junit.Assert.assertNotNull(account32);
        org.junit.Assert.assertNotNull(account40);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        reservation1.setDepositAmount((double) (byte) 0);
        double double10 = reservation1.getHourlyRate();
        reservation1.setExtended(true);
        java.lang.String str13 = reservation1.getTitle();
        java.lang.String str14 = reservation1.getReservationId();
        reservation1.setDepositLost(true);
        java.lang.String str17 = reservation1.getTitle();
        java.time.LocalDateTime localDateTime18 = reservation1.getStartTime();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand21 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime19, localDateTime20);
        java.lang.String str22 = reservation1.getReservationId();
        boolean boolean23 = reservation1.isDepositLost();
        reservation1.setDepositAmount((double) (byte) 10);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor30 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount37 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean38 = occupancySensor30.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount37);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher39 = null;
        occupancySensor30.setSubject(checkInPublisher39);
        occupancySensor30.isDetected = false;
        boolean boolean43 = occupancySensor30.isOccupied();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor47 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
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
        occupancySensor47.setSubject(checkInPublisher57);
        occupancySensor30.subject = checkInPublisher57;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor75 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean76 = occupancySensor75.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher77 = null;
        occupancySensor75.subject = checkInPublisher77;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher79 = occupancySensor75.getSubject();
        checkInPublisher57.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor75);
        occupancySensor20.setSubject(checkInPublisher57);
        java.lang.String str82 = occupancySensor20.roomId;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(checkInPublisher79);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Booking confirmed." + "'", str82, "Booking confirmed.");
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setEnabled(true);
        java.lang.String str13 = room6.getName();
        room6.setBuilding("Unverified badge detected for Cancelled.");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor16 = room6.getOccupancySensor();
        room6.setRoomId("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertNull(occupancySensor16);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Booking confirmed.", "Cancelled", "Booking confirmed.", 0, localDateTime5, localDateTime6);
        int int8 = bookingRequest7.getAttendeeCount();
        java.lang.String str9 = bookingRequest7.getTitle();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.time.LocalDateTime localDateTime11 = bookingRequest7.getEndTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking confirmed." + "'", str9, "Booking confirmed.");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Pending", "hi!", "Booking confirmed.", "", 97, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRoomId();
        java.lang.String str9 = bookingRequest7.getRoomId();
        java.lang.String str10 = bookingRequest7.getRequestId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Pending" + "'", str10, "Pending");
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy institutionalBillingPaymentStrategy0 = new com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy();
        boolean boolean3 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", 0.0d);
        boolean boolean6 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", (double) (short) 1);
        boolean boolean9 = institutionalBillingPaymentStrategy0.processPayment("Cancelled", 32.0d);
        boolean boolean12 = institutionalBillingPaymentStrategy0.processPayment("Verified badge detected for Checked in..", (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod8 = reservation1.getPaymentMethod();
        boolean boolean9 = reservation1.isCanceled();
        java.lang.String str10 = reservation1.getUserId();
        java.time.LocalDateTime localDateTime11 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand12 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime11);
        boolean boolean13 = reservation1.isDepositLost();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(paymentMethod8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        room6.setBuilding("Booking complete");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor21 = room6.getOccupancySensor();
        java.lang.String str22 = room6.getBuilding();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor23 = room6.getOccupancySensor();
        room6.setEnabled(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(occupancySensor21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Booking complete" + "'", str22, "Booking complete");
        org.junit.Assert.assertNotNull(occupancySensor23);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = bookingRequest7.getEndTime();
        java.lang.String str9 = bookingRequest7.getTitle();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getStartTime();
        java.time.LocalDateTime localDateTime11 = bookingRequest7.getStartTime();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState0 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext6 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState7 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str8 = cancelledBookingState7.getName();
        bookingContext6.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState7);
        completedBookingState0.handle(bookingContext6);
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState11 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        java.lang.String str12 = completedBookingState11.getName();
        java.lang.String str13 = completedBookingState11.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState14 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState15 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation16 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext17 = new com.conferenceroomscheduler.patterns.BookingContext(reservation16);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState18 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext17.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState18);
        com.conferenceroomscheduler.patterns.BookingState bookingState20 = bookingContext17.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState21 = bookingContext17.getState();
        cancelledBookingState15.handle(bookingContext17);
        checkedInBookingState14.handle(bookingContext17);
        java.lang.String str24 = checkedInBookingState14.getName();
        com.conferenceroomscheduler.model.Reservation reservation25 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext26 = new com.conferenceroomscheduler.patterns.BookingContext(reservation25);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState27 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext26.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState27);
        com.conferenceroomscheduler.model.Reservation reservation29 = bookingContext26.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation30 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext31 = new com.conferenceroomscheduler.patterns.BookingContext(reservation30);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState32 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext31.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState32);
        com.conferenceroomscheduler.patterns.BookingState bookingState34 = bookingContext31.getState();
        bookingContext26.setState(bookingState34);
        checkedInBookingState14.handle(bookingContext26);
        com.conferenceroomscheduler.model.Reservation reservation37 = bookingContext26.getReservation();
        completedBookingState11.handle(bookingContext26);
        java.lang.String str39 = completedBookingState11.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState40 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState41 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation42 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext43 = new com.conferenceroomscheduler.patterns.BookingContext(reservation42);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState44 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext43.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState44);
        com.conferenceroomscheduler.patterns.BookingState bookingState46 = bookingContext43.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState47 = bookingContext43.getState();
        cancelledBookingState41.handle(bookingContext43);
        checkedInBookingState40.handle(bookingContext43);
        java.lang.String str50 = bookingContext43.getStatus();
        completedBookingState11.handle(bookingContext43);
        completedBookingState0.handle(bookingContext43);
        java.lang.String str53 = completedBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation54 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext55 = new com.conferenceroomscheduler.patterns.BookingContext(reservation54);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState56 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext55.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState56);
        com.conferenceroomscheduler.model.Reservation reservation58 = bookingContext55.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation59 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext60 = new com.conferenceroomscheduler.patterns.BookingContext(reservation59);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState61 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext60.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState61);
        com.conferenceroomscheduler.patterns.BookingState bookingState63 = bookingContext60.getState();
        bookingContext55.setState(bookingState63);
        completedBookingState0.handle(bookingContext55);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking complete" + "'", str12, "Booking complete");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking complete" + "'", str13, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertNotNull(bookingState21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Checked in." + "'", str24, "Checked in.");
        org.junit.Assert.assertNull(reservation29);
        org.junit.Assert.assertNotNull(bookingState34);
        org.junit.Assert.assertNull(reservation37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Booking complete" + "'", str39, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState46);
        org.junit.Assert.assertNotNull(bookingState47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Booking complete" + "'", str50, "Booking complete");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Booking complete" + "'", str53, "Booking complete");
        org.junit.Assert.assertNull(reservation58);
        org.junit.Assert.assertNotNull(bookingState63);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = null;
        occupancySensor3.setSubject(checkInPublisher12);
        occupancySensor3.occupied = true;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor19 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, true);
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory20 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account28 = facultyFactory20.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account36 = facultyFactory20.createAccount("", "hi!", "", "", false, true, "");
        account36.setAccountType("Cancelled");
        java.lang.String str39 = account36.getAccountId();
        boolean boolean40 = occupancySensor19.detectOccupancy(account36);
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
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory70 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account78 = facultyFactory70.createAccount("", "Cancelled", "", "hi!", false, false, "");
        account78.setAccountNumber("hi!");
        account78.setUniversityAccount(true);
        account78.setAccountType("Cancelled");
        checkInPublisher41.notifyObservers(account78);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor89 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, true);
        boolean boolean90 = occupancySensor89.isOccupied();
        checkInPublisher41.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor89);
        occupancySensor19.setSubject(checkInPublisher41);
        java.lang.String str93 = occupancySensor19.roomId;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher94 = occupancySensor19.getSubject();
        occupancySensor3.setSubject(checkInPublisher94);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(account28);
        org.junit.Assert.assertNotNull(account36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(account78);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Pending" + "'", str93, "Pending");
        org.junit.Assert.assertNotNull(checkInPublisher94);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        reservation1.setDepositAmount((double) (byte) 0);
        boolean boolean10 = reservation1.isExtended();
        reservation1.setReservationId("admin");
        java.time.LocalDateTime localDateTime13 = reservation1.getEndTime();
        reservation1.setTitle("ADMIN-69");
        reservation1.setHourlyRate((double) 100.0f);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand20 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime18, localDateTime19);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor15 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor15.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount24 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount24.setEmail("");
        boolean boolean27 = occupancySensor15.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount24);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor31 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean32 = occupancySensor31.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher33 = null;
        occupancySensor31.subject = checkInPublisher33;
        occupancySensor31.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher37 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor41 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher42 = null;
        occupancySensor41.setSubject(checkInPublisher42);
        occupancySensor41.occupied = true;
        occupancySensor41.setDetected(false);
        checkInPublisher37.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor41);
        occupancySensor31.setSubject(checkInPublisher37);
        com.conferenceroomscheduler.model.StudentAccount studentAccount56 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        checkInPublisher37.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount56);
        occupancySensor15.subject = checkInPublisher37;
        occupancySensor3.subject = checkInPublisher37;
        com.conferenceroomscheduler.model.StaffAccount staffAccount66 = new com.conferenceroomscheduler.model.StaffAccount("hi!", "Booking complete", "Booking confirmed.", false, false, "Booking complete");
        checkInPublisher37.notifyObservers((com.conferenceroomscheduler.model.Account) staffAccount66);
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount74 = new com.conferenceroomscheduler.model.PartnerAccount("hi!", "", "", true, true, "");
        checkInPublisher37.notifyObservers((com.conferenceroomscheduler.model.Account) partnerAccount74);
        com.conferenceroomscheduler.model.AdminAccount adminAccount76 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount76.setAccountNumber("hi!");
        java.lang.String str79 = adminAccount76.getAccountId();
        java.lang.String str80 = adminAccount76.getEmail();
        java.lang.String str81 = adminAccount76.getAccountType();
        java.lang.String str82 = adminAccount76.getPassword();
        checkInPublisher37.notifyObservers((com.conferenceroomscheduler.model.Account) adminAccount76);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNull(str82);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("", "Booking confirmed.", "Unverified badge detected for .", false, false, "Unverified badge detected for Cancelled.");
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getReservationId();
        java.lang.String str5 = reservation2.getTitle();
        java.time.LocalDateTime localDateTime6 = null;
        reservation2.setStartTime(localDateTime6);
        java.lang.String str8 = reservation2.getTitle();
        java.time.LocalDateTime localDateTime9 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand10 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation2, localDateTime9);
        reservation2.setCanceled(true);
        reservation2.setTitle("Booking confirmed.");
        java.lang.String str15 = reservation2.getAccountType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor3.setDetected(false);
        com.conferenceroomscheduler.model.Badge badge9 = new com.conferenceroomscheduler.model.Badge("Checked in.", "Pending", true);
        java.lang.String str10 = badge9.getAccountId();
        boolean boolean11 = occupancySensor3.scanIdBadge(badge9);
        occupancySensor3.occupied = false;
        boolean boolean14 = occupancySensor3.isDetected;
        occupancySensor3.occupied = true;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Pending" + "'", str10, "Pending");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) 10);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("Cancelled", 1.0d);
        boolean boolean9 = creditCardPaymentStrategy0.processPayment("Cancelled", (double) 100);
        boolean boolean12 = creditCardPaymentStrategy0.processPayment("partner", (double) (-1L));
        boolean boolean15 = creditCardPaymentStrategy0.processPayment("Unverified badge detected for admin.", (double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Pending", (int) (byte) 1, true, "hi!", "Pending");
        room6.setRoomNumber("Booking complete");
        room6.setName("Checked in.");
        boolean boolean11 = room6.isEnabled();
        int int12 = room6.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
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
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState26 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState27 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation28 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext29 = new com.conferenceroomscheduler.patterns.BookingContext(reservation28);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState30 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext29.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState30);
        com.conferenceroomscheduler.patterns.BookingState bookingState32 = bookingContext29.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState33 = bookingContext29.getState();
        cancelledBookingState27.handle(bookingContext29);
        checkedInBookingState26.handle(bookingContext29);
        com.conferenceroomscheduler.model.Reservation reservation36 = new com.conferenceroomscheduler.model.Reservation();
        reservation36.setFinalAmount((double) (byte) 100);
        reservation36.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext41 = new com.conferenceroomscheduler.patterns.BookingContext(reservation36);
        checkedInBookingState26.handle(bookingContext41);
        com.conferenceroomscheduler.model.Reservation reservation43 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext44 = new com.conferenceroomscheduler.patterns.BookingContext(reservation43);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState45 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext44.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState45);
        com.conferenceroomscheduler.patterns.BookingState bookingState47 = bookingContext44.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState48 = bookingContext44.getState();
        bookingContext44.request();
        bookingContext44.request();
        com.conferenceroomscheduler.model.Reservation reservation51 = bookingContext44.getReservation();
        checkedInBookingState26.handle(bookingContext44);
        java.lang.String str53 = checkedInBookingState26.getName();
        com.conferenceroomscheduler.model.Reservation reservation54 = new com.conferenceroomscheduler.model.Reservation();
        reservation54.setFinalAmount((double) (byte) 100);
        java.lang.String str57 = reservation54.getRoomId();
        reservation54.setFinalAmount((double) 10.0f);
        java.lang.String str60 = reservation54.getUserId();
        reservation54.setFinalAmount((double) ' ');
        java.lang.String str63 = reservation54.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext64 = new com.conferenceroomscheduler.patterns.BookingContext(reservation54);
        bookingContext64.request();
        checkedInBookingState26.handle(bookingContext64);
        pendingBookingState0.handle(bookingContext64);
        java.lang.String str68 = pendingBookingState0.getName();
        java.lang.String str69 = pendingBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pending" + "'", str1, "Pending");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Pending" + "'", str24, "Pending");
        org.junit.Assert.assertNotNull(bookingState32);
        org.junit.Assert.assertNotNull(bookingState33);
        org.junit.Assert.assertNotNull(bookingState47);
        org.junit.Assert.assertNotNull(bookingState48);
        org.junit.Assert.assertNull(reservation51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Checked in." + "'", str53, "Checked in.");
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Pending" + "'", str68, "Pending");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Pending" + "'", str69, "Pending");
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
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
        java.lang.String str33 = occupancySensor3.getRoomId();
        java.lang.String str34 = occupancySensor3.getLastEvent();
        com.conferenceroomscheduler.model.AdminAccount adminAccount41 = new com.conferenceroomscheduler.model.AdminAccount("", "Booking confirmed.", "hi!", false, false, "");
        adminAccount41.setVerified(true);
        boolean boolean44 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount41);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Booking confirmed." + "'", str31, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Unverified badge detected for Cancelled." + "'", str34, "Unverified badge detected for Cancelled.");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        reservation1.setDepositAmount((double) (byte) 0);
        double double10 = reservation1.getHourlyRate();
        reservation1.setExtended(true);
        reservation1.setAccountType("hi!");
        double double15 = reservation1.getHourlyRate();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand16 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        boolean boolean17 = cancelBookingCommand16.wasSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand16.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        java.lang.String str13 = room6.getBuilding();
        java.lang.String str14 = room6.getBuilding();
        room6.setBuilding("Checked in.");
        int int17 = room6.getCapacity();
        java.lang.String str18 = room6.getRoomId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("faculty", "hi!", "Unverified badge detected for .", true, true, "staff");
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
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
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory29 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account37 = facultyFactory29.createAccount("", "Cancelled", "", "hi!", false, false, "");
        account37.setAccountNumber("hi!");
        account37.setUniversityAccount(true);
        account37.setAccountType("Cancelled");
        checkInPublisher0.notifyObservers(account37);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor48 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher49 = null;
        occupancySensor48.setSubject(checkInPublisher49);
        occupancySensor48.occupied = true;
        occupancySensor48.setDetected(false);
        java.lang.String str55 = occupancySensor48.getLastEvent();
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
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher83 = occupancySensor59.getSubject();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor87 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher88 = null;
        occupancySensor87.setSubject(checkInPublisher88);
        checkInPublisher83.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor87);
        occupancySensor48.subject = checkInPublisher83;
        boolean boolean92 = occupancySensor48.isDetected;
        boolean boolean93 = occupancySensor48.occupied;
        checkInPublisher0.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor48);
        boolean boolean95 = occupancySensor48.occupied;
        occupancySensor48.roomId = "partner";
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(account37);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(checkInPublisher83);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setRoomId("Booking confirmed.");
        java.lang.String str6 = badgeScan3.getBadgeId();
        badgeScan3.setRoomId("Pending");
        badgeScan3.setVerified(true);
        badgeScan3.setVerified(true);
        boolean boolean13 = badgeScan3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        com.conferenceroomscheduler.patterns.StaffFactory staffFactory0 = new com.conferenceroomscheduler.patterns.StaffFactory();
        com.conferenceroomscheduler.model.Account account8 = staffFactory0.createAccount("Cancelled", "Checked in.", "", "Cancelled", true, true, "");
        account8.setVerified(false);
        org.junit.Assert.assertNotNull(account8);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Booking confirmed.", "Cancelled", "Booking confirmed.", 0, localDateTime5, localDateTime6);
        int int8 = bookingRequest7.getAttendeeCount();
        java.lang.String str9 = bookingRequest7.getRequestId();
        java.lang.String str10 = bookingRequest7.getOrganizerId();
        java.lang.String str11 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cancelled" + "'", str10, "Cancelled");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cancelled" + "'", str11, "Cancelled");
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        int int8 = bookingRequest7.getAttendeeCount();
        java.time.LocalDateTime localDateTime9 = bookingRequest7.getEndTime();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.lang.String str11 = bookingRequest7.getRequestId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
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
        com.conferenceroomscheduler.model.StudentAccount studentAccount84 = new com.conferenceroomscheduler.model.StudentAccount("admin", "hi!", "ADMIN-69", false, false, "staff");
        boolean boolean85 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount84);
        studentAccount84.setEmail("admin");
        org.junit.Assert.assertNotNull(account12);
        org.junit.Assert.assertNotNull(account20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(account62);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("Verified badge detected for ADMIN-69.", "partner", "Unverified badge detected for Cancelled.", false, false, "partner");
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) 10);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("Cancelled", 1.0d);
        boolean boolean9 = creditCardPaymentStrategy0.processPayment("Cancelled", (double) 100);
        boolean boolean12 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) (short) -1);
        boolean boolean15 = creditCardPaymentStrategy0.processPayment("hi!", (double) 100L);
        boolean boolean18 = creditCardPaymentStrategy0.processPayment("Cancelled", (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Unverified badge detected for Cancelled.", "Unverified badge detected for Cancelled.", "Verified badge detected for Checked in..", true, false, "Booking confirmed.");
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
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
        java.lang.String str15 = completedBookingState0.getName();
        java.lang.String str16 = completedBookingState0.getName();
        java.lang.String str17 = completedBookingState0.getName();
        java.lang.String str18 = completedBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation19 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext20 = new com.conferenceroomscheduler.patterns.BookingContext(reservation19);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState21 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext20.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState21);
        com.conferenceroomscheduler.patterns.BookingState bookingState23 = bookingContext20.getState();
        com.conferenceroomscheduler.model.Reservation reservation24 = bookingContext20.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation25 = bookingContext20.getReservation();
        java.lang.String str26 = bookingContext20.getStatus();
        completedBookingState0.handle(bookingContext20);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNotNull(bookingState12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking complete" + "'", str15, "Booking complete");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking complete" + "'", str16, "Booking complete");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking complete" + "'", str17, "Booking complete");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking complete" + "'", str18, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertNull(reservation24);
        org.junit.Assert.assertNull(reservation25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Cancelled" + "'", str26, "Cancelled");
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
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
        occupancySensor3.roomId = "Booking confirmed.";
        boolean boolean25 = occupancySensor3.occupied;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod10 = null;
        com.conferenceroomscheduler.model.Reservation reservation11 = new com.conferenceroomscheduler.model.Reservation("Booking complete", "admin", "Cancelled", "partner", localDateTime4, localDateTime5, "", (double) 1L, (double) 1, (double) 10L, paymentMethod10);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext4 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        bookingContext4.request();
        java.lang.Class<?> wildcardClass6 = bookingContext4.getClass();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
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
        boolean boolean23 = occupancySensor3.occupied;
        boolean boolean24 = occupancySensor3.isDetected;
        occupancySensor3.isDetected = false;
        boolean boolean27 = occupancySensor3.occupied;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
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
        bookingContext8.request();
        java.lang.String str16 = bookingContext8.getStatus();
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
        com.conferenceroomscheduler.patterns.BookingState bookingState41 = bookingContext29.getState();
        bookingContext8.setState(bookingState41);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNotNull(bookingState12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cancelled" + "'", str16, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertNotNull(bookingState24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Checked in." + "'", str27, "Checked in.");
        org.junit.Assert.assertNull(reservation32);
        org.junit.Assert.assertNotNull(bookingState37);
        org.junit.Assert.assertNull(reservation40);
        org.junit.Assert.assertNotNull(bookingState41);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Verified badge detected for Checked in..", "ADMIN-69", false);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        java.lang.String str10 = reservation0.getUserId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        room6.setBuilding("Booking complete");
        java.lang.String str21 = room6.getBuilding();
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount28 = new com.conferenceroomscheduler.model.FacultyAccount("Cancelled", "Unverified badge detected for admin.", "Booking complete", false, false, "Unverified badge detected for admin.");
        room6.checkIn((com.conferenceroomscheduler.model.Account) facultyAccount28);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Booking complete" + "'", str21, "Booking complete");
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setDepositAmount(0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand9 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime7, localDateTime8);
        reservation1.setTitle("");
        reservation1.setReservationId("admin");
        reservation1.setDepositLost(true);
        reservation1.setTitle("student");
        org.junit.Assert.assertNull(paymentMethod4);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory0 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account8 = facultyFactory0.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account16 = facultyFactory0.createAccount("", "hi!", "", "", false, true, "");
        account16.setPassword("Cancelled");
        java.lang.String str19 = account16.getPassword();
        account16.setUniversityAccount(false);
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Cancelled" + "'", str19, "Cancelled");
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Booking complete", "Unverified badge detected for .", true);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext6 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        java.time.LocalDateTime localDateTime7 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand8 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime7);
        boolean boolean9 = extendBookingCommand8.wasSuccessful();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("faculty", "Pending", (int) '#', "Cancelled", "Pending");
        java.lang.String str13 = room12.getRoomId();
        room12.setRoomNumber("Pending");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        boolean boolean10 = room6.isClosedForMaintenance();
        room6.setEnabled(false);
        room6.setEnabled(true);
        java.lang.String str15 = room6.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cancelled" + "'", str15, "Cancelled");
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setEnabled(true);
        room6.setBuilding("Checked in.");
        boolean boolean15 = room6.isEnabled();
        room6.setName("Unverified badge detected for admin.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        java.lang.String str4 = reservation1.getAccountType();
        java.time.LocalDateTime localDateTime5 = null;
        reservation1.setStartTime(localDateTime5);
        java.time.LocalDateTime localDateTime7 = reservation1.getEndTime();
        boolean boolean8 = reservation1.isExtended();
        java.lang.String str9 = reservation1.getTitle();
        java.lang.String str10 = reservation1.getReservationId();
        java.lang.String str11 = reservation1.getTitle();
        double double12 = reservation1.getHourlyRate();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod13 = null;
        reservation1.setPaymentMethod(paymentMethod13);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        com.conferenceroomscheduler.model.Reservation reservation0 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext1 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState2 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext1.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState2);
        com.conferenceroomscheduler.patterns.BookingState bookingState4 = bookingContext1.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState5 = bookingContext1.getState();
        bookingContext1.request();
        bookingContext1.request();
        com.conferenceroomscheduler.model.Reservation reservation8 = bookingContext1.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation9 = bookingContext1.getReservation();
        java.lang.String str10 = bookingContext1.getStatus();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState11 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation12 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext13 = new com.conferenceroomscheduler.patterns.BookingContext(reservation12);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState14 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext13.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState14);
        com.conferenceroomscheduler.patterns.BookingState bookingState16 = bookingContext13.getState();
        com.conferenceroomscheduler.model.Reservation reservation17 = bookingContext13.getReservation();
        cancelledBookingState11.handle(bookingContext13);
        java.lang.String str19 = bookingContext13.getStatus();
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
        bookingContext13.setState((com.conferenceroomscheduler.patterns.BookingState) checkedInBookingState20);
        bookingContext13.request();
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState32 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation33 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext34 = new com.conferenceroomscheduler.patterns.BookingContext(reservation33);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState35 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext34.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState35);
        completedBookingState32.handle(bookingContext34);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState38 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation39 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext40 = new com.conferenceroomscheduler.patterns.BookingContext(reservation39);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState41 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext40.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState41);
        com.conferenceroomscheduler.patterns.BookingState bookingState43 = bookingContext40.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState44 = bookingContext40.getState();
        cancelledBookingState38.handle(bookingContext40);
        completedBookingState32.handle(bookingContext40);
        java.lang.String str47 = completedBookingState32.getName();
        java.lang.String str48 = completedBookingState32.getName();
        java.lang.String str49 = completedBookingState32.getName();
        bookingContext13.setState((com.conferenceroomscheduler.patterns.BookingState) completedBookingState32);
        bookingContext1.setState((com.conferenceroomscheduler.patterns.BookingState) completedBookingState32);
        org.junit.Assert.assertNotNull(bookingState4);
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNull(reservation8);
        org.junit.Assert.assertNull(reservation9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cancelled" + "'", str10, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertNull(reservation17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Cancelled" + "'", str19, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState26);
        org.junit.Assert.assertNotNull(bookingState27);
        org.junit.Assert.assertNotNull(bookingState43);
        org.junit.Assert.assertNotNull(bookingState44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Booking complete" + "'", str47, "Booking complete");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Booking complete" + "'", str48, "Booking complete");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Booking complete" + "'", str49, "Booking complete");
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        java.lang.String str3 = reservation0.getUserId();
        boolean boolean4 = reservation0.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation0.getPaymentMethod();
        reservation0.setUserId("");
        reservation0.setDepositLost(false);
        java.time.LocalDateTime localDateTime10 = null;
        reservation0.setEndTime(localDateTime10);
        java.lang.String str12 = reservation0.getAccountType();
        reservation0.setRoomId("partner");
        java.time.LocalDateTime localDateTime15 = null;
        reservation0.setStartTime(localDateTime15);
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        com.conferenceroomscheduler.model.Reservation reservation37 = new com.conferenceroomscheduler.model.Reservation();
        reservation37.setFinalAmount((double) (byte) 100);
        java.lang.String str40 = reservation37.getRoomId();
        reservation37.setFinalAmount((double) 10.0f);
        java.lang.String str43 = reservation37.getUserId();
        reservation37.setDepositAmount((double) (byte) 0);
        double double46 = reservation37.getHourlyRate();
        reservation37.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext49 = new com.conferenceroomscheduler.patterns.BookingContext(reservation37);
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod60 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation61 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime54, localDateTime55, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod60);
        reservation37.setPaymentMethod(paymentMethod60);
        com.conferenceroomscheduler.model.Reservation reservation63 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "Booking complete", "admin", "Booking complete", localDateTime31, localDateTime32, "Booking confirmed.", (double) (short) -1, (double) 0.0f, (double) 0, paymentMethod60);
        com.conferenceroomscheduler.model.Reservation reservation64 = new com.conferenceroomscheduler.model.Reservation("", "student", "partner", "Unverified badge detected for .", localDateTime21, localDateTime22, "hi!", (double) 100L, (double) 35, (double) 100L, paymentMethod60);
        reservation0.setPaymentMethod(paymentMethod60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod60 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod60.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("Cancelled", "Cancelled", "Booking confirmed.", "hi!", false, false, "");
        account7.setAccountType("admin");
        account7.setAccountId("Unverified badge detected for .");
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "Checked in.", false);
        boolean boolean4 = badgeScan3.isVerified();
        boolean boolean5 = badgeScan3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.occupied;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean11 = occupancySensor10.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = null;
        occupancySensor10.subject = checkInPublisher12;
        occupancySensor10.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher16 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor20 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher21 = null;
        occupancySensor20.setSubject(checkInPublisher21);
        occupancySensor20.occupied = true;
        occupancySensor20.setDetected(false);
        checkInPublisher16.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor20);
        occupancySensor10.setSubject(checkInPublisher16);
        com.conferenceroomscheduler.model.StudentAccount studentAccount35 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        checkInPublisher16.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount35);
        occupancySensor3.subject = checkInPublisher16;
        boolean boolean38 = occupancySensor3.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("admin", "", "student", "student", true, false, "Verified badge detected for Checked in..");
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy institutionalBillingPaymentStrategy0 = new com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy();
        boolean boolean3 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", 0.0d);
        boolean boolean6 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", (double) (short) 1);
        boolean boolean9 = institutionalBillingPaymentStrategy0.processPayment("Cancelled", 32.0d);
        boolean boolean12 = institutionalBillingPaymentStrategy0.processPayment("faculty", (double) 1);
        boolean boolean15 = institutionalBillingPaymentStrategy0.processPayment("Cancelled", 100.0d);
        boolean boolean18 = institutionalBillingPaymentStrategy0.processPayment("Cancelled", (double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setRoomNumber("Pending");
        java.lang.String str13 = room6.getName();
        room6.setRoomNumber("Checked in.");
        room6.setName("Booking complete");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor21 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean22 = occupancySensor21.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher23 = null;
        occupancySensor21.subject = checkInPublisher23;
        occupancySensor21.occupied = false;
        java.lang.String str27 = occupancySensor21.getLastEvent();
        com.conferenceroomscheduler.model.AdminAccount adminAccount28 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount28.setAccountNumber("hi!");
        java.lang.String str31 = adminAccount28.getAccountId();
        adminAccount28.setAccountType("Booking complete");
        boolean boolean34 = occupancySensor21.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount28);
        adminAccount28.setAccountType("Cancelled");
        java.lang.String str37 = adminAccount28.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            room6.checkIn((com.conferenceroomscheduler.model.Account) adminAccount28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.model.OccupancySensor.setOccupied(boolean)\" because \"this.occupancySensor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Cancelled" + "'", str37, "Cancelled");
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Unverified badge detected for .", "Unverified badge detected for Cancelled.", "Verified badge detected for Checked in..", true, false, "ADMIN-69");
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
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
        // The following exception was thrown during execution in test generation
        try {
            createBookingCommand16.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.addReservation(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
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
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand16.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.extendBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
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
        java.lang.String str28 = badge20.getAccountId();
        badge20.setVerified(true);
        java.lang.String str31 = badge20.getAccountId();
        boolean boolean32 = badge20.isVerified();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking confirmed." + "'", str23, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
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
        bookingContext19.request();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Pending" + "'", str20, "Pending");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Pending" + "'", str21, "Pending");
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Verified badge detected for Checked in..", "Booking confirmed.", false);
        badgeScan3.setRoomId("faculty");
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Booking complete", "Cancelled", (int) (byte) -1, true, "", "Cancelled");
        int int7 = room6.getCapacity();
        java.lang.String str8 = room6.getBuilding();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Booking confirmed.", "Verified badge detected for ADMIN-69.", false);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Booking confirmed.", "", "Booking complete", "Verified badge detected for Checked in..", (int) 'a', localDateTime5, localDateTime6);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setAccountType("hi!");
        java.lang.String str5 = reservation2.getUserId();
        boolean boolean6 = reservation2.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod7 = reservation2.getPaymentMethod();
        reservation2.setUserId("");
        reservation2.setDepositLost(false);
        java.lang.String str12 = reservation2.getReservationId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand13 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str14 = reservation2.getTitle();
        reservation2.setDepositLost(true);
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand17 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation2);
        boolean boolean18 = reservation2.isDepositLost();
        reservation2.setReservationId("partner");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(paymentMethod7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        reservation0.setTitle("Booking confirmed.");
        java.lang.String str8 = reservation0.getRoomId();
        java.time.LocalDateTime localDateTime9 = reservation0.getEndTime();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext10 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        reservation0.setFinalAmount((double) (byte) 1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor9 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean14 = occupancySensor13.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher15 = null;
        occupancySensor13.subject = checkInPublisher15;
        occupancySensor13.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher19 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor23 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher24 = null;
        occupancySensor23.setSubject(checkInPublisher24);
        occupancySensor23.occupied = true;
        occupancySensor23.setDetected(false);
        checkInPublisher19.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor23);
        occupancySensor13.setSubject(checkInPublisher19);
        occupancySensor9.setSubject(checkInPublisher19);
        occupancySensor3.setSubject(checkInPublisher19);
        boolean boolean34 = occupancySensor3.isOccupied();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor38 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor38.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount47 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount47.setEmail("");
        boolean boolean50 = occupancySensor38.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount47);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher51 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor55 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean56 = occupancySensor55.isDetected();
        occupancySensor55.occupied = false;
        checkInPublisher51.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor55);
        occupancySensor38.setSubject(checkInPublisher51);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor64 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor68 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean69 = occupancySensor68.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher70 = null;
        occupancySensor68.subject = checkInPublisher70;
        occupancySensor68.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher74 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor78 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher79 = null;
        occupancySensor78.setSubject(checkInPublisher79);
        occupancySensor78.occupied = true;
        occupancySensor78.setDetected(false);
        checkInPublisher74.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor78);
        occupancySensor68.setSubject(checkInPublisher74);
        occupancySensor64.setSubject(checkInPublisher74);
        occupancySensor38.setSubject(checkInPublisher74);
        occupancySensor3.setSubject(checkInPublisher74);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor93 = new com.conferenceroomscheduler.model.OccupancySensor("student", true, true);
        boolean boolean94 = occupancySensor93.isDetected;
        checkInPublisher74.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor93);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, true);
        boolean boolean4 = occupancySensor3.isDetected;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        room6.setBuilding("Booking complete");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor21 = room6.getOccupancySensor();
        room6.setName("");
        com.conferenceroomscheduler.model.AdminAccount adminAccount24 = new com.conferenceroomscheduler.model.AdminAccount();
        boolean boolean25 = adminAccount24.isVerified();
        adminAccount24.setUniversityAccount(false);
        com.conferenceroomscheduler.model.Badge badge28 = adminAccount24.getBadge();
        java.lang.String str29 = adminAccount24.getAccountNumber();
        room6.checkIn((com.conferenceroomscheduler.model.Account) adminAccount24);
        com.conferenceroomscheduler.model.AdminAccount adminAccount31 = new com.conferenceroomscheduler.model.AdminAccount();
        boolean boolean32 = adminAccount31.isVerified();
        adminAccount31.setUniversityAccount(false);
        java.lang.String str35 = adminAccount31.getAccountType();
        java.lang.String str36 = adminAccount31.getAccountNumber();
        room6.checkIn((com.conferenceroomscheduler.model.Account) adminAccount31);
        adminAccount31.setUniversityAccount(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(occupancySensor21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(badge28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        room6.setCapacity((int) '4');
        room6.setName("hi!");
        java.lang.String str15 = room6.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        java.time.LocalDateTime localDateTime1 = null;
        reservation0.setEndTime(localDateTime1);
        reservation0.setHourlyRate((double) 'a');
        double double5 = reservation0.getFinalAmount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
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
        java.lang.String str12 = pendingBookingState0.getName();
        java.lang.String str13 = pendingBookingState0.getName();
        java.lang.String str14 = pendingBookingState0.getName();
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService15 = null;
        com.conferenceroomscheduler.model.Reservation reservation16 = new com.conferenceroomscheduler.model.Reservation();
        reservation16.setFinalAmount((double) (byte) 100);
        java.lang.String str19 = reservation16.getRoomId();
        reservation16.setFinalAmount((double) 10.0f);
        java.lang.String str22 = reservation16.getUserId();
        reservation16.setDepositAmount((double) (byte) 0);
        java.lang.String str25 = reservation16.getAccountType();
        reservation16.setHourlyRate((double) '#');
        reservation16.setFinalAmount((double) 1.0f);
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand32 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService15, reservation16, localDateTime30, localDateTime31);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext33 = new com.conferenceroomscheduler.patterns.BookingContext(reservation16);
        pendingBookingState0.handle(bookingContext33);
        java.lang.String str35 = pendingBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pending" + "'", str1, "Pending");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pending" + "'", str12, "Pending");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pending" + "'", str13, "Pending");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Pending" + "'", str14, "Pending");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Pending" + "'", str35, "Pending");
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy institutionalBillingPaymentStrategy0 = new com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy();
        boolean boolean3 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", 0.0d);
        boolean boolean6 = institutionalBillingPaymentStrategy0.processPayment("Booking confirmed.", (double) '#');
        boolean boolean9 = institutionalBillingPaymentStrategy0.processPayment("admin", (double) (short) -1);
        boolean boolean12 = institutionalBillingPaymentStrategy0.processPayment("Cancelled", (double) (short) 0);
        boolean boolean15 = institutionalBillingPaymentStrategy0.processPayment("Booking confirmed.", (double) 100);
        boolean boolean18 = institutionalBillingPaymentStrategy0.processPayment("Unverified badge detected for Cancelled.", (double) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        boolean boolean13 = room6.isClosedForMaintenance();
        int int14 = room6.getCapacity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setRoomNumber("Pending");
        java.lang.String str13 = room6.getName();
        room6.setRoomId("admin");
        room6.setClosedForMaintenance(false);
        boolean boolean18 = room6.isEnabled();
        int int19 = room6.getCapacity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("", "Verified badge detected for Checked in..", "", false, false, "Unverified badge detected for .");
        java.lang.String str7 = studentAccount6.getAccountNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Unverified badge detected for ." + "'", str7, "Unverified badge detected for .");
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor4.setSubject(checkInPublisher5);
        occupancySensor4.occupied = true;
        occupancySensor4.setDetected(false);
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        occupancySensor4.setRoomId("Booking confirmed.");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher14 = occupancySensor4.subject;
        com.conferenceroomscheduler.patterns.CheckInObserver checkInObserver15 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkInPublisher14.removeObserver(checkInObserver15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.patterns.CheckInObserver.setSubject(com.conferenceroomscheduler.patterns.CheckInPublisher)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(checkInPublisher14);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory0 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account8 = facultyFactory0.createAccount("Checked in.", "faculty", "Unverified badge detected for .", "Booking confirmed.", true, true, "partner");
        java.lang.String str9 = account8.getAccountType();
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setRoomId("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation0.getPaymentMethod();
        boolean boolean6 = reservation0.isDepositLost();
        reservation0.setCanceled(true);
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
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
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount53 = new com.conferenceroomscheduler.model.FacultyAccount("hi!", "Pending", "Checked in.", false, true, "hi!");
        checkInPublisher25.notifyObservers((com.conferenceroomscheduler.model.Account) facultyAccount53);
        com.conferenceroomscheduler.model.StaffAccount staffAccount61 = new com.conferenceroomscheduler.model.StaffAccount("Pending", "Unverified badge detected for .", "Booking confirmed.", true, false, "");
        com.conferenceroomscheduler.model.Badge badge62 = staffAccount61.getBadge();
        checkInPublisher25.notifyObservers((com.conferenceroomscheduler.model.Account) staffAccount61);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(badge62);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setAccountType("hi!");
        java.lang.String str5 = reservation2.getUserId();
        boolean boolean6 = reservation2.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod7 = reservation2.getPaymentMethod();
        reservation2.setUserId("");
        reservation2.setDepositLost(false);
        java.lang.String str12 = reservation2.getReservationId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand13 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str14 = reservation2.getTitle();
        reservation2.setDepositLost(true);
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand17 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation2);
        boolean boolean18 = reservation2.isDepositLost();
        java.lang.String str19 = reservation2.getAccountType();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(paymentMethod7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        boolean boolean9 = reservation0.isExtended();
        java.lang.String str10 = reservation0.getUserId();
        java.lang.String str11 = reservation0.getUserId();
        double double12 = reservation0.getFinalAmount();
        boolean boolean13 = reservation0.isDepositLost();
        boolean boolean14 = reservation0.isCanceled();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("", "Booking confirmed.", "", false, false, "");
        adminAccount6.setAccountId("");
        boolean boolean9 = adminAccount6.isVerified();
        adminAccount6.setIdentifier("staff");
        adminAccount6.setPassword("faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        java.time.LocalDateTime localDateTime2 = null;
        reservation1.setEndTime(localDateTime2);
        reservation1.setHourlyRate((double) 'a');
        boolean boolean6 = reservation1.isCheckedIn();
        boolean boolean7 = reservation1.isCanceled();
        java.time.LocalDateTime localDateTime8 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand9 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        com.conferenceroomscheduler.model.AdminAccount adminAccount11 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount11.setAccountNumber("hi!");
        java.lang.String str14 = adminAccount11.getAccountId();
        room6.checkIn((com.conferenceroomscheduler.model.Account) adminAccount11);
        room6.setEnabled(false);
        room6.setName("Booking confirmed.");
        java.lang.String str20 = room6.getRoomNumber();
        java.lang.String str21 = room6.getName();
        int int22 = room6.getCapacity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Booking confirmed." + "'", str21, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        double double7 = reservation0.getFinalAmount();
        reservation0.setCanceled(false);
        reservation0.setDepositLost(false);
        java.lang.String str12 = reservation0.getAccountType();
        reservation0.setTitle("Unverified badge detected for Cancelled.");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        room6.setClosedForMaintenance(true);
        com.conferenceroomscheduler.model.Account account27 = new com.conferenceroomscheduler.model.Account("Unverified badge detected for .", "hi!", "", "ADMIN-69", false, false, "");
        room6.checkIn(account27);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Booking complete", "Cancelled", (int) (short) 1, "Booking complete", "");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("ADMIN-69", "Pending", 10, "hi!", "");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("", "Booking confirmed.", (-1), "student", "admin");
        com.conferenceroomscheduler.model.Room room30 = roomFactory0.createRoom("partner", "hi!", (int) '4', "student", "Pending");
        com.conferenceroomscheduler.model.Room room36 = roomFactory0.createRoom("Cancelled", "Cancelled", (int) (byte) -1, "", "partner");
        room36.setEnabled(true);
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
        org.junit.Assert.assertNotNull(room30);
        org.junit.Assert.assertNotNull(room36);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setEnabled(false);
        java.lang.String str9 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = room6.getOccupancySensor();
        occupancySensor10.occupied = true;
        com.conferenceroomscheduler.model.StudentAccount studentAccount19 = new com.conferenceroomscheduler.model.StudentAccount("hi!", "Checked in.", "Checked in.", true, true, "hi!");
        boolean boolean20 = occupancySensor10.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount19);
        java.lang.String str21 = studentAccount19.getPassword();
        studentAccount19.setUniversityAccount(false);
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(occupancySensor10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Checked in." + "'", str21, "Checked in.");
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("staff", "Verified badge detected for ADMIN-69.", "Verified badge detected for Checked in..", true, true, "Unverified badge detected for admin.");
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
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
        com.conferenceroomscheduler.patterns.RoomSensorObserver roomSensorObserver45 = null;
        chiefEventCoordinator0.registerObserver(roomSensorObserver45);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(chiefEventCoordinator3);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setAccountType("hi!");
        java.lang.String str5 = reservation2.getUserId();
        boolean boolean6 = reservation2.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod7 = reservation2.getPaymentMethod();
        reservation2.setAccountType("hi!");
        java.lang.String str10 = reservation2.getAccountType();
        java.time.LocalDateTime localDateTime11 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand12 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService1, reservation2, localDateTime11);
        reservation2.setReservationId("faculty");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand15 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(paymentMethod7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor3.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount12 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount12.setEmail("");
        boolean boolean15 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount12);
        com.conferenceroomscheduler.model.Badge badge16 = adminAccount12.getBadge();
        java.lang.String str17 = badge16.getEmail();
        java.lang.String str18 = badge16.getAccountId();
        java.lang.String str19 = badge16.getAccountId();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(badge16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cancelled" + "'", str17, "Cancelled");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Cancelled" + "'", str18, "Cancelled");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Cancelled" + "'", str19, "Cancelled");
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        boolean boolean6 = badgeScan3.isVerified();
        badgeScan3.setBadgeId("admin");
        badgeScan3.setBadgeId("Unverified badge detected for .");
        java.lang.String str11 = badgeScan3.getRoomId();
        java.lang.String str12 = badgeScan3.getBadgeId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Unverified badge detected for ." + "'", str12, "Unverified badge detected for .");
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        boolean boolean13 = room6.isEnabled();
        int int14 = room6.getCapacity();
        room6.setEnabled(false);
        room6.setRoomId("Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
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
        confirmedBookingState7.handle(bookingContext44);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState52 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation53 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext54 = new com.conferenceroomscheduler.patterns.BookingContext(reservation53);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState55 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext54.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState55);
        com.conferenceroomscheduler.patterns.BookingState bookingState57 = bookingContext54.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState58 = bookingContext54.getState();
        cancelledBookingState52.handle(bookingContext54);
        com.conferenceroomscheduler.patterns.BookingState bookingState60 = bookingContext54.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState61 = bookingContext54.getState();
        confirmedBookingState7.handle(bookingContext54);
        com.conferenceroomscheduler.model.Reservation reservation63 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext64 = new com.conferenceroomscheduler.patterns.BookingContext(reservation63);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState65 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext64.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState65);
        com.conferenceroomscheduler.patterns.BookingState bookingState67 = bookingContext64.getState();
        com.conferenceroomscheduler.model.Reservation reservation68 = bookingContext64.getReservation();
        confirmedBookingState7.handle(bookingContext64);
        com.conferenceroomscheduler.model.Reservation reservation70 = bookingContext64.getReservation();
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
        org.junit.Assert.assertNotNull(bookingState47);
        org.junit.Assert.assertNotNull(bookingState48);
        org.junit.Assert.assertNotNull(bookingState57);
        org.junit.Assert.assertNotNull(bookingState58);
        org.junit.Assert.assertNotNull(bookingState60);
        org.junit.Assert.assertNotNull(bookingState61);
        org.junit.Assert.assertNotNull(bookingState67);
        org.junit.Assert.assertNull(reservation68);
        org.junit.Assert.assertNull(reservation70);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "faculty", false);
        boolean boolean4 = badgeScan3.isVerified();
        badgeScan3.setRoomId("admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
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
        java.lang.String str14 = confirmedBookingState11.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState15 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState16 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation17 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext18 = new com.conferenceroomscheduler.patterns.BookingContext(reservation17);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState19 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext18.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState19);
        com.conferenceroomscheduler.patterns.BookingState bookingState21 = bookingContext18.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState22 = bookingContext18.getState();
        cancelledBookingState16.handle(bookingContext18);
        checkedInBookingState15.handle(bookingContext18);
        java.lang.String str25 = checkedInBookingState15.getName();
        com.conferenceroomscheduler.model.Reservation reservation26 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext27 = new com.conferenceroomscheduler.patterns.BookingContext(reservation26);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState28 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext27.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState28);
        com.conferenceroomscheduler.model.Reservation reservation30 = bookingContext27.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation31 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext32 = new com.conferenceroomscheduler.patterns.BookingContext(reservation31);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState33 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext32.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState33);
        com.conferenceroomscheduler.patterns.BookingState bookingState35 = bookingContext32.getState();
        bookingContext27.setState(bookingState35);
        checkedInBookingState15.handle(bookingContext27);
        com.conferenceroomscheduler.model.Reservation reservation38 = bookingContext27.getReservation();
        confirmedBookingState11.handle(bookingContext27);
        bookingContext3.setState((com.conferenceroomscheduler.patterns.BookingState) confirmedBookingState11);
        com.conferenceroomscheduler.model.Reservation reservation41 = new com.conferenceroomscheduler.model.Reservation();
        reservation41.setFinalAmount((double) (byte) 100);
        reservation41.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext46 = new com.conferenceroomscheduler.patterns.BookingContext(reservation41);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState47 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str48 = cancelledBookingState47.getName();
        bookingContext46.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState47);
        confirmedBookingState11.handle(bookingContext46);
        com.conferenceroomscheduler.model.Reservation reservation51 = new com.conferenceroomscheduler.model.Reservation();
        reservation51.setFinalAmount((double) (byte) 100);
        reservation51.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext56 = new com.conferenceroomscheduler.patterns.BookingContext(reservation51);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState57 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str58 = cancelledBookingState57.getName();
        bookingContext56.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState57);
        com.conferenceroomscheduler.model.Reservation reservation60 = bookingContext56.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation61 = bookingContext56.getReservation();
        confirmedBookingState11.handle(bookingContext56);
        java.time.LocalDateTime localDateTime67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod73 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation74 = new com.conferenceroomscheduler.model.Reservation("Pending", "admin", "Cancelled", "Booking confirmed.", localDateTime67, localDateTime68, "admin", (double) (short) 1, (double) (short) 100, (double) (-1L), paymentMethod73);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext75 = new com.conferenceroomscheduler.patterns.BookingContext(reservation74);
        confirmedBookingState11.handle(bookingContext75);
        com.conferenceroomscheduler.model.Reservation reservation77 = bookingContext75.getReservation();
        java.lang.String str78 = bookingContext75.getStatus();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking confirmed." + "'", str12, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking confirmed." + "'", str13, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking confirmed." + "'", str14, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState21);
        org.junit.Assert.assertNotNull(bookingState22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Checked in." + "'", str25, "Checked in.");
        org.junit.Assert.assertNull(reservation30);
        org.junit.Assert.assertNotNull(bookingState35);
        org.junit.Assert.assertNull(reservation38);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Cancelled" + "'", str48, "Cancelled");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Cancelled" + "'", str58, "Cancelled");
        org.junit.Assert.assertNotNull(reservation60);
        org.junit.Assert.assertNotNull(reservation61);
        org.junit.Assert.assertTrue("'" + paymentMethod73 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod73.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertNotNull(reservation77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Checked in." + "'", str78, "Checked in.");
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "Checked in.", true);
        java.lang.String str4 = badgeScan3.getBadgeId();
        boolean boolean5 = badgeScan3.isVerified();
        boolean boolean6 = badgeScan3.isVerified();
        badgeScan3.setRoomId("ADMIN-69");
        java.lang.String str9 = badgeScan3.getBadgeId();
        badgeScan3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
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
        java.lang.String str63 = cancelledBookingState12.getName();
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
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Cancelled" + "'", str63, "Cancelled");
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        room6.setClosedForMaintenance(false);
        room6.setCapacity(100);
        room6.setCapacity(0);
        room6.setRoomNumber("faculty");
        boolean boolean21 = room6.isEnabled();
        room6.setClosedForMaintenance(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        room6.setBuilding("Booking complete");
        java.lang.String str21 = room6.getRoomNumber();
        java.lang.Class<?> wildcardClass22 = room6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        occupancySensor4.setOccupied(true);
        occupancySensor4.occupied = false;
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount19 = new com.conferenceroomscheduler.model.PartnerAccount("Booking complete", "hi!", "", true, true, "Unverified badge detected for Cancelled.");
        boolean boolean20 = occupancySensor4.detectOccupancy((com.conferenceroomscheduler.model.Account) partnerAccount19);
        java.lang.String str21 = occupancySensor4.getLastEvent();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher22 = occupancySensor4.subject;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor26 = new com.conferenceroomscheduler.model.OccupancySensor("Booking complete", false, false);
        java.lang.String str27 = occupancySensor26.roomId;
        boolean boolean28 = occupancySensor26.isDetected;
        checkInPublisher22.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor26);
        boolean boolean30 = occupancySensor26.isDetected();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(checkInPublisher22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Booking complete" + "'", str27, "Booking complete");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        boolean boolean4 = badgeScan3.isVerified();
        boolean boolean5 = badgeScan3.isVerified();
        java.lang.String str6 = badgeScan3.getBadgeId();
        badgeScan3.setVerified(false);
        badgeScan3.setVerified(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        room6.setClosedForMaintenance(false);
        room6.setEnabled(true);
        java.lang.String str17 = room6.getName();
        room6.setRoomNumber("student");
        java.lang.String str20 = room6.getRoomId();
        room6.setName("Checked in.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cancelled" + "'", str17, "Cancelled");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Booking complete", "Cancelled", (int) (short) 1, "Booking complete", "");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("ADMIN-69", "Pending", 10, "hi!", "");
        room18.setCapacity((int) (byte) 10);
        java.lang.String str21 = room18.getRoomNumber();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        java.time.LocalDateTime localDateTime9 = null;
        reservation0.setStartTime(localDateTime9);
        reservation0.setUserId("Cancelled");
        boolean boolean13 = reservation0.isCanceled();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Unverified badge detected for .", "ADMIN-69", true);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("", "", "hi!", true, true, "Cancelled");
        com.conferenceroomscheduler.model.Badge badge7 = partnerAccount6.getBadge();
        badge7.setEmail("");
        java.lang.String str10 = badge7.getAccountId();
        org.junit.Assert.assertNotNull(badge7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.isDetected;
        boolean boolean7 = occupancySensor3.isDetected;
        boolean boolean8 = occupancySensor3.isDetected();
        occupancySensor3.setDetected(false);
        boolean boolean11 = occupancySensor3.isDetected;
        occupancySensor3.setOccupied(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        occupancySensor3.occupied = true;
        occupancySensor3.setDetected(false);
        java.lang.String str10 = occupancySensor3.getLastEvent();
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
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher38 = occupancySensor14.getSubject();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor42 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher43 = null;
        occupancySensor42.setSubject(checkInPublisher43);
        checkInPublisher38.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor42);
        occupancySensor3.subject = checkInPublisher38;
        boolean boolean47 = occupancySensor3.isDetected;
        boolean boolean48 = occupancySensor3.occupied;
        com.conferenceroomscheduler.model.Badge badge52 = new com.conferenceroomscheduler.model.Badge("", "Booking complete", false);
        java.lang.String str53 = badge52.getEmail();
        boolean boolean54 = occupancySensor3.scanIdBadge(badge52);
        badge52.setVerified(false);
        badge52.setAccountId("");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(checkInPublisher38);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        boolean boolean10 = room6.isClosedForMaintenance();
        com.conferenceroomscheduler.model.StudentAccount studentAccount17 = new com.conferenceroomscheduler.model.StudentAccount("Checked in.", "Cancelled", "admin", false, false, "ADMIN-69");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount17);
        boolean boolean19 = room6.isClosedForMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("ADMIN-69", "hi!", true);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = null;
        occupancySensor3.setSubject(checkInPublisher12);
        occupancySensor3.isDetected = false;
        occupancySensor3.setDetected(true);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher18 = occupancySensor3.subject;
        boolean boolean19 = occupancySensor3.isDetected();
        occupancySensor3.occupied = false;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(checkInPublisher18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        java.lang.String str8 = room6.getBuilding();
        java.lang.String str9 = room6.getRoomNumber();
        int int10 = room6.getCapacity();
        boolean boolean11 = room6.isEnabled();
        room6.setRoomNumber("Checked in.");
        room6.setEnabled(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        boolean boolean4 = badgeScan3.isVerified();
        boolean boolean5 = badgeScan3.isVerified();
        java.lang.String str6 = badgeScan3.getBadgeId();
        badgeScan3.setVerified(true);
        java.lang.String str9 = badgeScan3.getRoomId();
        badgeScan3.setRoomId("Booking complete");
        badgeScan3.setVerified(false);
        boolean boolean14 = badgeScan3.isVerified();
        java.lang.String str15 = badgeScan3.getBadgeId();
        java.lang.String str16 = badgeScan3.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking complete" + "'", str16, "Booking complete");
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        com.conferenceroomscheduler.model.Reservation reservation0 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext1 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState2 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext1.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState2);
        com.conferenceroomscheduler.patterns.BookingState bookingState4 = bookingContext1.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState5 = bookingContext1.getState();
        bookingContext1.request();
        com.conferenceroomscheduler.model.Reservation reservation7 = bookingContext1.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation8 = bookingContext1.getReservation();
        java.lang.String str9 = bookingContext1.getStatus();
        org.junit.Assert.assertNotNull(bookingState4);
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertNull(reservation8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setRoomId("hi!");
        boolean boolean5 = reservation0.isDepositLost();
        reservation0.setCheckedIn(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod30 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation31 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "hi!", "Booking complete", "Checked in.", localDateTime24, localDateTime25, "hi!", (double) 97, (double) 100L, (double) (byte) 100, paymentMethod30);
        com.conferenceroomscheduler.model.Reservation reservation32 = new com.conferenceroomscheduler.model.Reservation("Unverified badge detected for .", "faculty", "", "Unverified badge detected for .", localDateTime14, localDateTime15, "faculty", (double) (short) 100, (double) 97, (double) 1L, paymentMethod30);
        com.conferenceroomscheduler.model.Reservation reservation33 = new com.conferenceroomscheduler.model.Reservation("Pending", "faculty", "Unverified badge detected for admin.", "", localDateTime4, localDateTime5, "student", (double) 100, (double) 10L, (double) (short) 1, paymentMethod30);
        org.junit.Assert.assertTrue("'" + paymentMethod30 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod30.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Booking confirmed.", "", "Booking confirmed.", true, true, "hi!");
        boolean boolean7 = partnerAccount6.isVerified();
        partnerAccount6.setPassword("Pending");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
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
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory29 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account37 = facultyFactory29.createAccount("", "Cancelled", "", "hi!", false, false, "");
        account37.setAccountNumber("hi!");
        account37.setUniversityAccount(true);
        account37.setAccountType("Cancelled");
        checkInPublisher0.notifyObservers(account37);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor48 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, true);
        boolean boolean49 = occupancySensor48.isOccupied();
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor48);
        occupancySensor48.roomId = "student";
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(account37);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }
}

