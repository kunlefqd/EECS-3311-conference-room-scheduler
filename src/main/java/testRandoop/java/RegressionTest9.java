package testRandoop.java;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.isDetected;
        occupancySensor3.roomId = "Booking confirmed.";
        boolean boolean9 = occupancySensor3.isOccupied();
        boolean boolean10 = occupancySensor3.occupied;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
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
        badge20.setVerified(false);
        badge20.setAccountId("admin");
        badge20.setAccountId("admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking confirmed." + "'", str23, "Booking confirmed.");
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
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
        double double22 = reservation12.getDepositAmount();
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("", 0.0d);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("hi!", (double) (short) 0);
        boolean boolean9 = creditCardPaymentStrategy0.processPayment("Pending", (double) 1.0f);
        boolean boolean12 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) (short) 100);
        boolean boolean15 = creditCardPaymentStrategy0.processPayment("hi!", 1.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation2.getPaymentMethod();
        reservation2.setFinalAmount((double) (byte) 1);
        java.lang.String str8 = reservation2.getRoomId();
        reservation2.setCheckedIn(true);
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand11 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str12 = reservation2.getTitle();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand15 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation2, localDateTime13, localDateTime14);
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        com.conferenceroomscheduler.patterns.StaffFactory staffFactory0 = new com.conferenceroomscheduler.patterns.StaffFactory();
        com.conferenceroomscheduler.model.Account account8 = staffFactory0.createAccount("Cancelled", "Checked in.", "", "Cancelled", true, true, "");
        com.conferenceroomscheduler.model.Account account16 = staffFactory0.createAccount("", "Verified badge detected for ADMIN-69.", "ADMIN-69", "Checked in.", true, true, "");
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Cancelled", "Booking confirmed.", false);
        boolean boolean4 = badgeScan3.isVerified();
        boolean boolean5 = badgeScan3.isVerified();
        badgeScan3.setRoomId("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("ADMIN-69", "admin", 0, true, "", "ADMIN-69");
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("partner", "student", true);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        boolean boolean11 = room6.isEnabled();
        boolean boolean12 = room6.isClosedForMaintenance();
        java.lang.String str13 = room6.getRoomNumber();
        room6.setName("Pending");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher16 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor20 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean21 = occupancySensor20.isDetected();
        occupancySensor20.occupied = false;
        checkInPublisher16.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor20);
        boolean boolean25 = occupancySensor20.isDetected;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher26 = occupancySensor20.subject;
        occupancySensor20.roomId = "hi!";
        java.lang.String str29 = occupancySensor20.getRoomId();
        boolean boolean30 = occupancySensor20.isDetected;
        room6.setOccupancySensor(occupancySensor20);
        com.conferenceroomscheduler.model.AdminAccount adminAccount38 = new com.conferenceroomscheduler.model.AdminAccount("ADMIN-69", "Unverified badge detected for .", "", true, true, "");
        java.lang.String str39 = adminAccount38.getAccountType();
        boolean boolean40 = occupancySensor20.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount38);
        boolean boolean41 = occupancySensor20.isDetected();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(checkInPublisher26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "admin" + "'", str39, "admin");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getBuilding();
        java.lang.String str11 = room6.getName();
        room6.setRoomId("");
        boolean boolean14 = room6.isEnabled();
        room6.setRoomId("Unverified badge detected for admin.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cancelled" + "'", str11, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
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
        com.conferenceroomscheduler.model.Reservation reservation41 = new com.conferenceroomscheduler.model.Reservation();
        reservation41.setFinalAmount((double) (byte) 100);
        reservation41.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext46 = new com.conferenceroomscheduler.patterns.BookingContext(reservation41);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState47 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str48 = cancelledBookingState47.getName();
        bookingContext46.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState47);
        com.conferenceroomscheduler.model.Reservation reservation50 = bookingContext46.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation51 = bookingContext46.getReservation();
        bookingContext46.request();
        confirmedBookingState7.handle(bookingContext46);
        java.lang.String str54 = confirmedBookingState7.getName();
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
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Cancelled" + "'", str48, "Cancelled");
        org.junit.Assert.assertNotNull(reservation50);
        org.junit.Assert.assertNotNull(reservation51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Booking confirmed." + "'", str54, "Booking confirmed.");
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setDepositAmount(0.0d);
        reservation1.setAccountType("");
        reservation1.setAccountType("faculty");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand11 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand11.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paymentMethod4);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState0 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str1 = cancelledBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setFinalAmount((double) (byte) 100);
        reservation2.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext7 = new com.conferenceroomscheduler.patterns.BookingContext(reservation2);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState8 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str9 = cancelledBookingState8.getName();
        bookingContext7.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState8);
        bookingContext7.request();
        cancelledBookingState0.handle(bookingContext7);
        com.conferenceroomscheduler.model.Reservation reservation13 = bookingContext7.getReservation();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState14 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState15 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation16 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext17 = new com.conferenceroomscheduler.patterns.BookingContext(reservation16);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState18 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext17.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState18);
        com.conferenceroomscheduler.patterns.BookingState bookingState20 = bookingContext17.getState();
        com.conferenceroomscheduler.model.Reservation reservation21 = bookingContext17.getReservation();
        cancelledBookingState15.handle(bookingContext17);
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState23 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str24 = confirmedBookingState23.getName();
        java.lang.String str25 = confirmedBookingState23.getName();
        com.conferenceroomscheduler.model.Reservation reservation26 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext27 = new com.conferenceroomscheduler.patterns.BookingContext(reservation26);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState28 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext27.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState28);
        com.conferenceroomscheduler.model.Reservation reservation30 = bookingContext27.getReservation();
        confirmedBookingState23.handle(bookingContext27);
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
        java.lang.String str42 = checkedInBookingState32.getName();
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
        checkedInBookingState32.handle(bookingContext44);
        com.conferenceroomscheduler.model.Reservation reservation55 = bookingContext44.getReservation();
        java.lang.String str56 = bookingContext44.getStatus();
        java.lang.String str57 = bookingContext44.getStatus();
        confirmedBookingState23.handle(bookingContext44);
        cancelledBookingState15.handle(bookingContext44);
        checkedInBookingState14.handle(bookingContext44);
        bookingContext7.setState((com.conferenceroomscheduler.patterns.BookingState) checkedInBookingState14);
        java.lang.String str62 = bookingContext7.getStatus();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cancelled" + "'", str1, "Cancelled");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertNotNull(reservation13);
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertNull(reservation21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Booking confirmed." + "'", str24, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Booking confirmed." + "'", str25, "Booking confirmed.");
        org.junit.Assert.assertNull(reservation30);
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertNotNull(bookingState39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Checked in." + "'", str42, "Checked in.");
        org.junit.Assert.assertNull(reservation47);
        org.junit.Assert.assertNotNull(bookingState52);
        org.junit.Assert.assertNull(reservation55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Booking complete" + "'", str56, "Booking complete");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Booking complete" + "'", str57, "Booking complete");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Checked in." + "'", str62, "Checked in.");
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        occupancySensor4.setOccupied(true);
        occupancySensor4.occupied = false;
        occupancySensor4.setRoomId("Booking confirmed.");
        java.lang.String str15 = occupancySensor4.getLastEvent();
        occupancySensor4.occupied = true;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setName("faculty");
        room6.setEnabled(true);
        java.lang.String str15 = room6.getRoomNumber();
        java.lang.String str16 = room6.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Pending", "Pending", (int) (short) -1, "", "Cancelled");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("Cancelled", "ADMIN-69", (-1), "faculty", "Pending");
        room18.setCapacity(10);
        boolean boolean21 = room18.isClosedForMaintenance();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) '4');
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("Cancelled", 1.0d);
        boolean boolean9 = debitCardPaymentStrategy0.processPayment("Pending", (double) ' ');
        boolean boolean12 = debitCardPaymentStrategy0.processPayment("", (double) 10L);
        boolean boolean15 = debitCardPaymentStrategy0.processPayment("partner", (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("", (double) 0);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("", 0.0d);
        boolean boolean9 = creditCardPaymentStrategy0.processPayment("Pending", (double) 'a');
        boolean boolean12 = creditCardPaymentStrategy0.processPayment("admin", (double) 0L);
        boolean boolean15 = creditCardPaymentStrategy0.processPayment("Verified badge detected for Checked in..", 32.0d);
        boolean boolean18 = creditCardPaymentStrategy0.processPayment("Booking complete", 10.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        com.conferenceroomscheduler.model.AdminAccount adminAccount11 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount11.setAccountNumber("hi!");
        java.lang.String str14 = adminAccount11.getAccountId();
        room6.checkIn((com.conferenceroomscheduler.model.Account) adminAccount11);
        java.lang.String str16 = adminAccount11.getAccountNumber();
        adminAccount11.setAccountId("Booking complete");
        adminAccount11.setAccountId("");
        java.lang.String str21 = adminAccount11.getAccountId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        com.conferenceroomscheduler.patterns.StaffFactory staffFactory0 = new com.conferenceroomscheduler.patterns.StaffFactory();
        com.conferenceroomscheduler.model.Account account8 = staffFactory0.createAccount("", "Booking complete", "Booking confirmed.", "Cancelled", false, true, "Booking complete");
        com.conferenceroomscheduler.model.Account account16 = staffFactory0.createAccount("student", "Booking confirmed.", "admin", "student", false, true, "admin");
        com.conferenceroomscheduler.model.Account account24 = staffFactory0.createAccount("Cancelled", "Booking confirmed.", "Cancelled", "", true, true, "Cancelled");
        com.conferenceroomscheduler.model.Account account32 = staffFactory0.createAccount("hi!", "faculty", "student", "admin", false, false, "staff");
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
        org.junit.Assert.assertNotNull(account32);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        occupancySensor3.roomId = "Booking confirmed.";
        occupancySensor3.isDetected = true;
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount22 = new com.conferenceroomscheduler.model.PartnerAccount("Checked in.", "Unverified badge detected for .", "Booking complete", false, false, "Pending");
        boolean boolean23 = partnerAccount22.isVerified();
        partnerAccount22.setPassword("admin");
        boolean boolean26 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) partnerAccount22);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "Booking confirmed.", false);
        badgeScan3.setVerified(false);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
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
        room6.setEnabled(true);
        boolean boolean92 = room6.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cancelled" + "'", str20, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        reservation1.setReservationId("Checked in.");
        double double10 = reservation1.getDepositAmount();
        boolean boolean11 = reservation1.isExtended();
        reservation1.setTitle("Unverified badge detected for Cancelled.");
        reservation1.setAccountType("admin");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand16 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        boolean boolean17 = cancelBookingCommand16.wasSuccessful();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        com.conferenceroomscheduler.model.Account account0 = new com.conferenceroomscheduler.model.Account();
        com.conferenceroomscheduler.model.Badge badge1 = account0.getBadge();
        org.junit.Assert.assertNull(badge1);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("Pending", "Booking confirmed.", "hi!", false, false, "");
        java.lang.String str7 = adminAccount6.getEmail();
        java.lang.String str8 = adminAccount6.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking confirmed." + "'", str7, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
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
        java.lang.String str36 = confirmedBookingState0.getName();
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Booking confirmed." + "'", str36, "Booking confirmed.");
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        java.lang.String str3 = reservation0.getUserId();
        boolean boolean4 = reservation0.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation0.getPaymentMethod();
        reservation0.setAccountType("hi!");
        reservation0.setTitle("Booking confirmed.");
        reservation0.setReservationId("");
        double double12 = reservation0.getFinalAmount();
        double double13 = reservation0.getDepositAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount0.setAccountNumber("hi!");
        java.lang.String str3 = adminAccount0.getAccountType();
        java.lang.String str4 = adminAccount0.getAccountType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) '4');
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("", (double) (-1));
        boolean boolean9 = debitCardPaymentStrategy0.processPayment("", (double) (byte) -1);
        boolean boolean12 = debitCardPaymentStrategy0.processPayment("Verified badge detected for ADMIN-69.", 1.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("Verified badge detected for ADMIN-69.", "Unverified badge detected for Cancelled.", "staff", false, false, "Verified badge detected for ADMIN-69.");
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
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
        occupancySensor3.setDetected(false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) '4');
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) (byte) 0);
        boolean boolean9 = debitCardPaymentStrategy0.processPayment("Pending", (double) 97);
        boolean boolean12 = debitCardPaymentStrategy0.processPayment("faculty", (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("ADMIN-69", "faculty", "student", "faculty", false, false, "staff");
        account7.setEmail("Verified badge detected for Checked in..");
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation("", "hi!", "hi!", "Pending", localDateTime5, localDateTime6, "Pending", 10.0d, 0.0d, (double) 100, paymentMethod11);
        java.time.LocalDateTime localDateTime13 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand14 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation12, localDateTime13);
        boolean boolean15 = reservation12.isCheckedIn();
        java.lang.String str16 = reservation12.getTitle();
        org.junit.Assert.assertTrue("'" + paymentMethod11 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod11.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pending" + "'", str16, "Pending");
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
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
        boolean boolean26 = badge20.isVerified();
        badge20.setVerified(true);
        badge20.setAccountId("");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Cancelled", "staff", "Unverified badge detected for Cancelled.", false, false, "Booking confirmed.");
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
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
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState17 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation18 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext19 = new com.conferenceroomscheduler.patterns.BookingContext(reservation18);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState20 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext19.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState20);
        completedBookingState17.handle(bookingContext19);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState23 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation24 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext25 = new com.conferenceroomscheduler.patterns.BookingContext(reservation24);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState26 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext25.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState26);
        com.conferenceroomscheduler.patterns.BookingState bookingState28 = bookingContext25.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState29 = bookingContext25.getState();
        cancelledBookingState23.handle(bookingContext25);
        completedBookingState17.handle(bookingContext25);
        com.conferenceroomscheduler.model.Reservation reservation32 = bookingContext25.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation33 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext34 = new com.conferenceroomscheduler.patterns.BookingContext(reservation33);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState35 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext34.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState35);
        com.conferenceroomscheduler.model.Reservation reservation37 = bookingContext34.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation38 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext39 = new com.conferenceroomscheduler.patterns.BookingContext(reservation38);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState40 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext39.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState40);
        com.conferenceroomscheduler.patterns.BookingState bookingState42 = bookingContext39.getState();
        bookingContext34.setState(bookingState42);
        bookingContext25.setState(bookingState42);
        checkedInBookingState0.handle(bookingContext25);
        java.lang.String str46 = checkedInBookingState0.getName();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState47 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation48 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext49 = new com.conferenceroomscheduler.patterns.BookingContext(reservation48);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState50 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext49.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState50);
        com.conferenceroomscheduler.patterns.BookingState bookingState52 = bookingContext49.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState53 = bookingContext49.getState();
        cancelledBookingState47.handle(bookingContext49);
        java.lang.String str55 = cancelledBookingState47.getName();
        com.conferenceroomscheduler.model.Reservation reservation56 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext57 = new com.conferenceroomscheduler.patterns.BookingContext(reservation56);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState58 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext57.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState58);
        com.conferenceroomscheduler.model.Reservation reservation60 = bookingContext57.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation61 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext62 = new com.conferenceroomscheduler.patterns.BookingContext(reservation61);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState63 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext62.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState63);
        com.conferenceroomscheduler.patterns.BookingState bookingState65 = bookingContext62.getState();
        bookingContext57.setState(bookingState65);
        cancelledBookingState47.handle(bookingContext57);
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService68 = null;
        com.conferenceroomscheduler.model.Reservation reservation69 = new com.conferenceroomscheduler.model.Reservation();
        reservation69.setFinalAmount((double) (byte) 100);
        java.lang.String str72 = reservation69.getRoomId();
        java.time.LocalDateTime localDateTime73 = null;
        java.time.LocalDateTime localDateTime74 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand75 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService68, reservation69, localDateTime73, localDateTime74);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext76 = new com.conferenceroomscheduler.patterns.BookingContext(reservation69);
        cancelledBookingState47.handle(bookingContext76);
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState78 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation79 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext80 = new com.conferenceroomscheduler.patterns.BookingContext(reservation79);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState81 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext80.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState81);
        completedBookingState78.handle(bookingContext80);
        java.lang.String str84 = completedBookingState78.getName();
        bookingContext76.setState((com.conferenceroomscheduler.patterns.BookingState) completedBookingState78);
        com.conferenceroomscheduler.model.Reservation reservation86 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext87 = new com.conferenceroomscheduler.patterns.BookingContext(reservation86);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState88 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext87.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState88);
        com.conferenceroomscheduler.patterns.BookingState bookingState90 = bookingContext87.getState();
        com.conferenceroomscheduler.model.Reservation reservation91 = bookingContext87.getReservation();
        completedBookingState78.handle(bookingContext87);
        checkedInBookingState0.handle(bookingContext87);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertNotNull(bookingState28);
        org.junit.Assert.assertNotNull(bookingState29);
        org.junit.Assert.assertNull(reservation32);
        org.junit.Assert.assertNull(reservation37);
        org.junit.Assert.assertNotNull(bookingState42);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Checked in." + "'", str46, "Checked in.");
        org.junit.Assert.assertNotNull(bookingState52);
        org.junit.Assert.assertNotNull(bookingState53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Cancelled" + "'", str55, "Cancelled");
        org.junit.Assert.assertNull(reservation60);
        org.junit.Assert.assertNotNull(bookingState65);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Booking complete" + "'", str84, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState90);
        org.junit.Assert.assertNull(reservation91);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
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
        occupancySensor3.occupied = true;
        boolean boolean91 = occupancySensor3.isOccupied();
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
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomNumber();
        room6.setEnabled(true);
        room6.setClosedForMaintenance(false);
        boolean boolean12 = room6.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
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
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState0 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext6 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState7 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str8 = cancelledBookingState7.getName();
        bookingContext6.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState7);
        completedBookingState0.handle(bookingContext6);
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
        java.lang.String str28 = checkedInBookingState11.getName();
        com.conferenceroomscheduler.model.Reservation reservation29 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext30 = new com.conferenceroomscheduler.patterns.BookingContext(reservation29);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState31 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext30.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState31);
        com.conferenceroomscheduler.model.Reservation reservation33 = bookingContext30.getReservation();
        checkedInBookingState11.handle(bookingContext30);
        completedBookingState0.handle(bookingContext30);
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
        com.conferenceroomscheduler.model.Reservation reservation53 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext54 = new com.conferenceroomscheduler.patterns.BookingContext(reservation53);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState55 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext54.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState55);
        com.conferenceroomscheduler.patterns.BookingState bookingState57 = bookingContext54.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState58 = bookingContext54.getState();
        bookingContext54.request();
        bookingContext54.request();
        com.conferenceroomscheduler.model.Reservation reservation61 = bookingContext54.getReservation();
        checkedInBookingState36.handle(bookingContext54);
        completedBookingState0.handle(bookingContext54);
        java.lang.String str64 = bookingContext54.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState17);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Checked in." + "'", str28, "Checked in.");
        org.junit.Assert.assertNull(reservation33);
        org.junit.Assert.assertNotNull(bookingState42);
        org.junit.Assert.assertNotNull(bookingState43);
        org.junit.Assert.assertNotNull(bookingState57);
        org.junit.Assert.assertNotNull(bookingState58);
        org.junit.Assert.assertNull(reservation61);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Booking complete" + "'", str64, "Booking complete");
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = null;
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime5, localDateTime6, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod11);
        reservation12.setDepositLost(true);
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand16 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation12, localDateTime15);
        double double17 = reservation12.getHourlyRate();
        double double18 = reservation12.getFinalAmount();
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount0.setAccountNumber("hi!");
        java.lang.String str3 = adminAccount0.getAccountType();
        adminAccount0.setAccountType("Verified badge detected for ADMIN-69.");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor50 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount57 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean58 = occupancySensor50.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount57);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher59 = null;
        occupancySensor50.setSubject(checkInPublisher59);
        occupancySensor50.isDetected = false;
        boolean boolean63 = occupancySensor50.isOccupied();
        com.conferenceroomscheduler.model.Badge badge67 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str68 = badge67.getEmail();
        boolean boolean69 = occupancySensor50.scanIdBadge(badge67);
        java.lang.String str70 = occupancySensor50.getRoomId();
        checkInPublisher25.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor50);
        com.conferenceroomscheduler.model.AdminAccount adminAccount72 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str73 = adminAccount72.getEmail();
        adminAccount72.setVerified(false);
        java.lang.String str76 = adminAccount72.getAccountNumber();
        java.lang.String str77 = adminAccount72.getEmail();
        checkInPublisher25.notifyObservers((com.conferenceroomscheduler.model.Account) adminAccount72);
        java.lang.String str79 = adminAccount72.getPassword();
        adminAccount72.setAccountId("admin");
        adminAccount72.setUniversityAccount(false);
        java.lang.String str84 = adminAccount72.getAccountNumber();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Cancelled" + "'", str68, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Pending" + "'", str70, "Pending");
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
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
        double double17 = reservation2.getDepositAmount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("Pending", "admin", "Booking complete", false, true, "");
        staffAccount6.setIdentifier("Cancelled");
        com.conferenceroomscheduler.model.Badge badge9 = staffAccount6.getBadge();
        boolean boolean10 = badge9.isVerified();
        org.junit.Assert.assertNotNull(badge9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
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
        reservation1.setDepositAmount((double) (byte) 100);
        boolean boolean13 = reservation1.isDepositLost();
        double double14 = reservation1.getDepositAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState0 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str1 = cancelledBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setFinalAmount((double) (byte) 100);
        reservation2.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext7 = new com.conferenceroomscheduler.patterns.BookingContext(reservation2);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState8 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str9 = cancelledBookingState8.getName();
        bookingContext7.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState8);
        bookingContext7.request();
        cancelledBookingState0.handle(bookingContext7);
        com.conferenceroomscheduler.model.Reservation reservation13 = bookingContext7.getReservation();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState14 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState15 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation16 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext17 = new com.conferenceroomscheduler.patterns.BookingContext(reservation16);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState18 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext17.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState18);
        com.conferenceroomscheduler.patterns.BookingState bookingState20 = bookingContext17.getState();
        com.conferenceroomscheduler.model.Reservation reservation21 = bookingContext17.getReservation();
        cancelledBookingState15.handle(bookingContext17);
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState23 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str24 = confirmedBookingState23.getName();
        java.lang.String str25 = confirmedBookingState23.getName();
        com.conferenceroomscheduler.model.Reservation reservation26 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext27 = new com.conferenceroomscheduler.patterns.BookingContext(reservation26);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState28 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext27.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState28);
        com.conferenceroomscheduler.model.Reservation reservation30 = bookingContext27.getReservation();
        confirmedBookingState23.handle(bookingContext27);
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
        java.lang.String str42 = checkedInBookingState32.getName();
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
        checkedInBookingState32.handle(bookingContext44);
        com.conferenceroomscheduler.model.Reservation reservation55 = bookingContext44.getReservation();
        java.lang.String str56 = bookingContext44.getStatus();
        java.lang.String str57 = bookingContext44.getStatus();
        confirmedBookingState23.handle(bookingContext44);
        cancelledBookingState15.handle(bookingContext44);
        checkedInBookingState14.handle(bookingContext44);
        bookingContext7.setState((com.conferenceroomscheduler.patterns.BookingState) checkedInBookingState14);
        java.lang.String str62 = checkedInBookingState14.getName();
        com.conferenceroomscheduler.model.Reservation reservation63 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext64 = new com.conferenceroomscheduler.patterns.BookingContext(reservation63);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState65 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext64.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState65);
        checkedInBookingState14.handle(bookingContext64);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cancelled" + "'", str1, "Cancelled");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertNotNull(reservation13);
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertNull(reservation21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Booking confirmed." + "'", str24, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Booking confirmed." + "'", str25, "Booking confirmed.");
        org.junit.Assert.assertNull(reservation30);
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertNotNull(bookingState39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Checked in." + "'", str42, "Checked in.");
        org.junit.Assert.assertNull(reservation47);
        org.junit.Assert.assertNotNull(bookingState52);
        org.junit.Assert.assertNull(reservation55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Booking complete" + "'", str56, "Booking complete");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Booking complete" + "'", str57, "Booking complete");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Checked in." + "'", str62, "Checked in.");
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setRoomId("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation0.getPaymentMethod();
        boolean boolean6 = reservation0.isDepositLost();
        java.lang.String str7 = reservation0.getTitle();
        boolean boolean8 = reservation0.isDepositLost();
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = null;
        occupancySensor3.setSubject(checkInPublisher12);
        occupancySensor3.isDetected = false;
        occupancySensor3.setDetected(true);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher18 = occupancySensor3.subject;
        boolean boolean19 = occupancySensor3.isDetected();
        java.lang.String str20 = occupancySensor3.getLastEvent();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher21 = occupancySensor3.subject;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(checkInPublisher18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(checkInPublisher21);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor0 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor0.update("Checked in.");
        roomSensor0.update("hi!");
        roomSensor0.update("faculty");
        roomSensor0.update("Verified badge detected for Checked in..");
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        java.lang.String str7 = reservation0.getAccountType();
        java.lang.String str8 = reservation0.getTitle();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
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
        occupancySensor3.isDetected = false;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pending" + "'", str12, "Pending");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean4 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor3.subject = checkInPublisher5;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher7 = occupancySensor3.getSubject();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher8 = occupancySensor3.getSubject();
        occupancySensor3.roomId = "faculty";
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
        occupancySensor3.setSubject(checkInPublisher24);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher39 = occupancySensor3.getSubject();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(checkInPublisher7);
        org.junit.Assert.assertNull(checkInPublisher8);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(checkInPublisher39);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor0 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor0.update("Checked in.");
        roomSensor0.update("Checked in.");
        roomSensor0.update("Cancelled");
        roomSensor0.update("admin");
        roomSensor0.update("student");
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setFinalAmount((double) (byte) 100);
        java.lang.String str5 = reservation2.getRoomId();
        reservation2.setFinalAmount((double) 10.0f);
        java.lang.String str8 = reservation2.getUserId();
        reservation2.setDepositAmount((double) (byte) 0);
        boolean boolean11 = reservation2.isExtended();
        java.lang.String str12 = reservation2.getUserId();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand15 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService1, reservation2, localDateTime13, localDateTime14);
        boolean boolean16 = reservation2.isCheckedIn();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand17 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("student", "Booking complete", "Pending", false, false, "");
        java.lang.String str7 = facultyAccount6.getEmail();
        facultyAccount6.setPassword("");
        facultyAccount6.setVerified(true);
        java.lang.String str12 = facultyAccount6.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking complete" + "'", str7, "Booking complete");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        java.lang.String str8 = room6.getRoomNumber();
        java.lang.String str9 = room6.getRoomId();
        room6.setCapacity(100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
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
        java.lang.String str54 = reservation47.getTitle();
        java.lang.String str55 = reservation47.getAccountType();
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod43 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod43.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "student" + "'", str48, "student");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Unverified badge detected for ." + "'", str54, "Unverified badge detected for .");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Booking confirmed." + "'", str55, "Booking confirmed.");
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
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
        boolean boolean41 = occupancySensor3.isOccupied();
        com.conferenceroomscheduler.model.Badge badge45 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        boolean boolean46 = occupancySensor3.scanIdBadge(badge45);
        badge45.setVerified(true);
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
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
        com.conferenceroomscheduler.model.Reservation reservation56 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "Booking complete", "admin", "Booking complete", localDateTime24, localDateTime25, "Booking confirmed.", (double) (short) -1, (double) 0.0f, (double) 0, paymentMethod53);
        com.conferenceroomscheduler.model.Reservation reservation57 = new com.conferenceroomscheduler.model.Reservation("", "student", "partner", "Unverified badge detected for .", localDateTime14, localDateTime15, "hi!", (double) 100L, (double) 35, (double) 100L, paymentMethod53);
        com.conferenceroomscheduler.model.Reservation reservation58 = new com.conferenceroomscheduler.model.Reservation("Unverified badge detected for admin.", "Booking complete", "hi!", "", localDateTime4, localDateTime5, "faculty", (double) (short) 10, (double) (-1L), (double) (short) 10, paymentMethod53);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod53 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod53.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
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
        reservation2.setDepositAmount((double) (byte) -1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(paymentMethod7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("admin", "faculty", true);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setHourlyRate((double) (byte) 100);
        boolean boolean4 = reservation1.isDepositLost();
        java.lang.String str5 = reservation1.getUserId();
        java.lang.String str6 = reservation1.getUserId();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand7 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setCanceled(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        java.lang.String str4 = reservation1.getUserId();
        boolean boolean5 = reservation1.isDepositLost();
        reservation1.setHourlyRate(1.0d);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod8 = reservation1.getPaymentMethod();
        java.time.LocalDateTime localDateTime9 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand10 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime9);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand10.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.extendBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentMethod8);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
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
        com.conferenceroomscheduler.model.Reservation reservation46 = bookingContext41.getReservation();
        java.lang.String str47 = reservation46.getTitle();
        java.lang.String str48 = reservation46.getReservationId();
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNull(reservation6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Pending" + "'", str43, "Pending");
        org.junit.Assert.assertNotNull(reservation46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        com.conferenceroomscheduler.patterns.StaffFactory staffFactory0 = new com.conferenceroomscheduler.patterns.StaffFactory();
        com.conferenceroomscheduler.model.Account account8 = staffFactory0.createAccount("", "Booking complete", "Booking confirmed.", "Cancelled", false, true, "Booking complete");
        com.conferenceroomscheduler.model.Account account16 = staffFactory0.createAccount("student", "Booking confirmed.", "admin", "student", false, true, "admin");
        com.conferenceroomscheduler.model.Account account24 = staffFactory0.createAccount("Cancelled", "Booking confirmed.", "Cancelled", "", true, true, "Cancelled");
        com.conferenceroomscheduler.model.Account account32 = staffFactory0.createAccount("ADMIN-69", "Booking confirmed.", "Checked in.", "hi!", true, true, "Checked in.");
        com.conferenceroomscheduler.model.Account account40 = staffFactory0.createAccount("Booking confirmed.", "admin", "ADMIN-69", "partner", false, true, "student");
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
        org.junit.Assert.assertNotNull(account32);
        org.junit.Assert.assertNotNull(account40);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("", "Booking complete", "", "Checked in.", true, true, "");
        account7.setAccountId("Booking confirmed.");
        account7.setAccountId("Verified badge detected for Checked in..");
        account7.setAccountId("hi!");
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService2 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod13 = null;
        com.conferenceroomscheduler.model.Reservation reservation14 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime7, localDateTime8, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod13);
        reservation14.setDepositLost(true);
        java.time.LocalDateTime localDateTime17 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand18 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService2, reservation14, localDateTime17);
        reservation14.setHourlyRate((double) (-1.0f));
        boolean boolean21 = reservation14.isDepositLost();
        java.lang.String str22 = reservation14.getReservationId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand23 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService1, reservation14);
        boolean boolean24 = reservation14.isCanceled();
        boolean boolean25 = reservation14.isDepositLost();
        reservation14.setDepositAmount((double) (short) 10);
        reservation14.setFinalAmount((double) (short) 10);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand30 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation14);
        boolean boolean31 = cancelBookingCommand30.wasSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand30.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("", (double) (byte) 1);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("", (double) '#');
        boolean boolean9 = creditCardPaymentStrategy0.processPayment("Unverified badge detected for Cancelled.", (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
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
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState15 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState16 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation17 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext18 = new com.conferenceroomscheduler.patterns.BookingContext(reservation17);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState19 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext18.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState19);
        com.conferenceroomscheduler.patterns.BookingState bookingState21 = bookingContext18.getState();
        com.conferenceroomscheduler.model.Reservation reservation22 = bookingContext18.getReservation();
        cancelledBookingState16.handle(bookingContext18);
        checkedInBookingState15.handle(bookingContext18);
        bookingContext18.request();
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState26 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str27 = confirmedBookingState26.getName();
        java.lang.String str28 = confirmedBookingState26.getName();
        java.lang.String str29 = confirmedBookingState26.getName();
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
        java.lang.String str40 = checkedInBookingState30.getName();
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
        checkedInBookingState30.handle(bookingContext42);
        com.conferenceroomscheduler.model.Reservation reservation53 = bookingContext42.getReservation();
        confirmedBookingState26.handle(bookingContext42);
        bookingContext18.setState((com.conferenceroomscheduler.patterns.BookingState) confirmedBookingState26);
        com.conferenceroomscheduler.model.Reservation reservation56 = new com.conferenceroomscheduler.model.Reservation();
        reservation56.setFinalAmount((double) (byte) 100);
        reservation56.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext61 = new com.conferenceroomscheduler.patterns.BookingContext(reservation56);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState62 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str63 = cancelledBookingState62.getName();
        bookingContext61.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState62);
        com.conferenceroomscheduler.model.Reservation reservation65 = bookingContext61.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation66 = bookingContext61.getReservation();
        bookingContext61.request();
        confirmedBookingState26.handle(bookingContext61);
        com.conferenceroomscheduler.model.Reservation reservation69 = bookingContext61.getReservation();
        completedBookingState0.handle(bookingContext61);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNotNull(bookingState12);
        org.junit.Assert.assertNotNull(bookingState21);
        org.junit.Assert.assertNull(reservation22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Booking confirmed." + "'", str27, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Booking confirmed." + "'", str28, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Booking confirmed." + "'", str29, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState36);
        org.junit.Assert.assertNotNull(bookingState37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Checked in." + "'", str40, "Checked in.");
        org.junit.Assert.assertNull(reservation45);
        org.junit.Assert.assertNotNull(bookingState50);
        org.junit.Assert.assertNull(reservation53);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Cancelled" + "'", str63, "Cancelled");
        org.junit.Assert.assertNotNull(reservation65);
        org.junit.Assert.assertNotNull(reservation66);
        org.junit.Assert.assertNotNull(reservation69);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
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
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand33 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime31, localDateTime32);
        boolean boolean34 = editBookingCommand33.wasSuccessful();
        boolean boolean35 = editBookingCommand33.wasSuccessful();
        boolean boolean36 = editBookingCommand33.wasSuccessful();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod24 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod24.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        occupancySensor3.occupied = true;
        occupancySensor3.setDetected(false);
        java.lang.String str10 = occupancySensor3.getLastEvent();
        occupancySensor3.setRoomId("hi!");
        boolean boolean13 = occupancySensor3.isDetected();
        java.lang.String str14 = occupancySensor3.roomId;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.time.LocalDateTime localDateTime9 = bookingRequest7.getEndTime();
        int int10 = bookingRequest7.getAttendeeCount();
        java.time.LocalDateTime localDateTime11 = bookingRequest7.getEndTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        occupancySensor4.setOccupied(true);
        occupancySensor4.occupied = false;
        occupancySensor4.setRoomId("Booking confirmed.");
        java.lang.String str15 = occupancySensor4.getLastEvent();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher16 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor20 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean21 = occupancySensor20.isDetected();
        occupancySensor20.occupied = false;
        checkInPublisher16.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor20);
        boolean boolean25 = occupancySensor20.isDetected;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher26 = occupancySensor20.subject;
        occupancySensor20.roomId = "hi!";
        java.lang.String str29 = occupancySensor20.getRoomId();
        occupancySensor20.occupied = false;
        com.conferenceroomscheduler.model.Account account32 = null;
        boolean boolean33 = occupancySensor20.detectOccupancy(account32);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher34 = occupancySensor20.getSubject();
        occupancySensor4.setSubject(checkInPublisher34);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher36 = occupancySensor4.subject;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(checkInPublisher26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(checkInPublisher34);
        org.junit.Assert.assertNotNull(checkInPublisher36);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
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
        java.lang.String str23 = badge20.getEmail();
        badge20.setAccountId("hi!");
        java.lang.String str26 = badge20.getAccountId();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Cancelled" + "'", str23, "Cancelled");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getRoomId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.lang.String str11 = bookingRequest7.getTitle();
        int int12 = bookingRequest7.getAttendeeCount();
        int int13 = bookingRequest7.getAttendeeCount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
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
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState16 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
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
        com.conferenceroomscheduler.model.Reservation reservation27 = new com.conferenceroomscheduler.model.Reservation();
        reservation27.setFinalAmount((double) (byte) 100);
        reservation27.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext32 = new com.conferenceroomscheduler.patterns.BookingContext(reservation27);
        checkedInBookingState17.handle(bookingContext32);
        cancelledBookingState16.handle(bookingContext32);
        com.conferenceroomscheduler.patterns.BookingState bookingState35 = null;
        bookingContext32.setState(bookingState35);
        completedBookingState0.handle(bookingContext32);
        java.lang.String str38 = completedBookingState0.getName();
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNotNull(bookingState12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking complete" + "'", str15, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertNotNull(bookingState24);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Booking complete" + "'", str38, "Booking complete");
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("", "", "hi!", false, false, "admin");
        boolean boolean7 = studentAccount6.isVerified();
        studentAccount6.setIdentifier("Booking complete");
        com.conferenceroomscheduler.model.Badge badge10 = studentAccount6.getBadge();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(badge10);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Unverified badge detected for Cancelled.", "Unverified badge detected for admin.", "Cancelled", "Booking confirmed.", (int) (short) 10, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setHourlyRate((double) (byte) 100);
        boolean boolean3 = reservation0.isDepositLost();
        java.time.LocalDateTime localDateTime4 = null;
        reservation0.setEndTime(localDateTime4);
        java.lang.String str6 = reservation0.getTitle();
        reservation0.setCheckedIn(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy institutionalBillingPaymentStrategy0 = new com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy();
        boolean boolean3 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", 0.0d);
        boolean boolean6 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", (double) (short) 1);
        boolean boolean9 = institutionalBillingPaymentStrategy0.processPayment("Pending", (double) (short) -1);
        boolean boolean12 = institutionalBillingPaymentStrategy0.processPayment("Booking confirmed.", 0.0d);
        boolean boolean15 = institutionalBillingPaymentStrategy0.processPayment("Pending", (double) (-1.0f));
        boolean boolean18 = institutionalBillingPaymentStrategy0.processPayment("Booking confirmed.", (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
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
        com.conferenceroomscheduler.model.Reservation reservation50 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext51 = new com.conferenceroomscheduler.patterns.BookingContext(reservation50);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState52 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext51.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState52);
        com.conferenceroomscheduler.patterns.BookingState bookingState54 = bookingContext51.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState55 = bookingContext51.getState();
        bookingContext51.request();
        bookingContext51.request();
        confirmedBookingState0.handle(bookingContext51);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState59 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState60 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation61 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext62 = new com.conferenceroomscheduler.patterns.BookingContext(reservation61);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState63 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext62.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState63);
        com.conferenceroomscheduler.patterns.BookingState bookingState65 = bookingContext62.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState66 = bookingContext62.getState();
        cancelledBookingState60.handle(bookingContext62);
        checkedInBookingState59.handle(bookingContext62);
        com.conferenceroomscheduler.model.Reservation reservation69 = new com.conferenceroomscheduler.model.Reservation();
        reservation69.setFinalAmount((double) (byte) 100);
        reservation69.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext74 = new com.conferenceroomscheduler.patterns.BookingContext(reservation69);
        checkedInBookingState59.handle(bookingContext74);
        com.conferenceroomscheduler.model.Reservation reservation76 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext77 = new com.conferenceroomscheduler.patterns.BookingContext(reservation76);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState78 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext77.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState78);
        checkedInBookingState59.handle(bookingContext77);
        com.conferenceroomscheduler.model.Reservation reservation81 = new com.conferenceroomscheduler.model.Reservation();
        reservation81.setFinalAmount((double) (byte) 100);
        java.lang.String str84 = reservation81.getRoomId();
        reservation81.setFinalAmount((double) 10.0f);
        java.lang.String str87 = reservation81.getUserId();
        reservation81.setFinalAmount((double) ' ');
        java.lang.String str90 = reservation81.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext91 = new com.conferenceroomscheduler.patterns.BookingContext(reservation81);
        bookingContext91.request();
        java.lang.String str93 = bookingContext91.getStatus();
        checkedInBookingState59.handle(bookingContext91);
        bookingContext51.setState((com.conferenceroomscheduler.patterns.BookingState) checkedInBookingState59);
        java.lang.String str96 = checkedInBookingState59.getName();
        java.lang.String str97 = checkedInBookingState59.getName();
        java.lang.String str98 = checkedInBookingState59.getName();
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
        org.junit.Assert.assertNotNull(bookingState54);
        org.junit.Assert.assertNotNull(bookingState55);
        org.junit.Assert.assertNotNull(bookingState65);
        org.junit.Assert.assertNotNull(bookingState66);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Pending" + "'", str93, "Pending");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "Checked in." + "'", str96, "Checked in.");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "Checked in." + "'", str97, "Checked in.");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "Checked in." + "'", str98, "Checked in.");
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
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
        com.conferenceroomscheduler.model.Reservation reservation47 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "Booking complete", "admin", "Booking complete", localDateTime15, localDateTime16, "Booking confirmed.", (double) (short) -1, (double) 0.0f, (double) 0, paymentMethod44);
        com.conferenceroomscheduler.model.Reservation reservation48 = new com.conferenceroomscheduler.model.Reservation("faculty", "ADMIN-69", "Cancelled", "student", localDateTime5, localDateTime6, "Booking confirmed.", (double) (short) 1, (-1.0d), (double) 100, paymentMethod44);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand49 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation48);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod44 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod44.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor59 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor59.isDetected = false;
        occupancySensor59.roomId = "hi!";
        occupancySensor59.isDetected = false;
        boolean boolean66 = occupancySensor59.isOccupied();
        occupancySensor59.setOccupied(true);
        checkInPublisher9.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor59);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Verified badge detected for Checked in..", "ADMIN-69", "Booking confirmed.", "staff", (int) (byte) 10, localDateTime5, localDateTime6);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
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
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService22 = null;
        com.conferenceroomscheduler.model.Reservation reservation23 = new com.conferenceroomscheduler.model.Reservation();
        reservation23.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod26 = reservation23.getPaymentMethod();
        reservation23.setDepositAmount(0.0d);
        java.lang.String str29 = reservation23.getReservationId();
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand32 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService22, reservation23, localDateTime30, localDateTime31);
        com.conferenceroomscheduler.model.Reservation reservation33 = new com.conferenceroomscheduler.model.Reservation();
        reservation33.setFinalAmount((double) (byte) 100);
        reservation33.setRoomId("hi!");
        reservation33.setRoomId("Booking confirmed.");
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod50 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation51 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime44, localDateTime45, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod50);
        reservation33.setPaymentMethod(paymentMethod50);
        reservation23.setPaymentMethod(paymentMethod50);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod54 = reservation23.getPaymentMethod();
        reservation10.setPaymentMethod(paymentMethod54);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNotNull(reservation10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(paymentMethod26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + paymentMethod50 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod50.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertTrue("'" + paymentMethod54 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod54.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setRoomId("hi!");
        java.lang.String str6 = reservation0.getReservationId();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext7 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        double double8 = reservation0.getDepositAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        java.lang.String str7 = reservation0.getAccountType();
        double double8 = reservation0.getFinalAmount();
        reservation0.setUserId("Booking complete");
        reservation0.setHourlyRate((double) ' ');
        boolean boolean13 = reservation0.isExtended();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setEnabled(true);
        java.lang.String str13 = room6.getName();
        room6.setRoomId("Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
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
        occupancySensor3.setDetected(false);
        occupancySensor3.setRoomId("student");
        java.lang.String str70 = occupancySensor3.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(checkInPublisher27);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Cancelled" + "'", str53, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Booking confirmed." + "'", str55, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "student" + "'", str70, "student");
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
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
        com.conferenceroomscheduler.model.StaffAccount staffAccount80 = new com.conferenceroomscheduler.model.StaffAccount("", "Pending", "Pending", false, false, "hi!");
        boolean boolean81 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) staffAccount80);
        staffAccount80.setUniversityAccount(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("faculty", "Pending", (int) '#', "Cancelled", "Pending");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("admin", "Booking complete", (int) (byte) 1, "hi!", "Checked in.");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("faculty", "admin", (int) (byte) 100, "hi!", "Checked in.");
        com.conferenceroomscheduler.model.Room room30 = roomFactory0.createRoom("Checked in.", "admin", (int) (short) 1, "Cancelled", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room36 = roomFactory0.createRoom("Unverified badge detected for .", "Unverified badge detected for .", 100, "admin", "Pending");
        com.conferenceroomscheduler.model.Room room42 = roomFactory0.createRoom("Cancelled", "", (int) (short) 0, "student", "Checked in.");
        com.conferenceroomscheduler.model.Room room48 = roomFactory0.createRoom("staff", "", (int) (short) 10, "admin", "");
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
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Booking complete", "", "Unverified badge detected for Cancelled.", 35, localDateTime5, localDateTime6);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) 10);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("Cancelled", 1.0d);
        boolean boolean9 = creditCardPaymentStrategy0.processPayment("Cancelled", (double) 100);
        boolean boolean12 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) (short) -1);
        boolean boolean15 = creditCardPaymentStrategy0.processPayment("Booking confirmed.", (double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        com.conferenceroomscheduler.model.BookingRequest bookingRequest0 = new com.conferenceroomscheduler.model.BookingRequest();
        java.time.LocalDateTime localDateTime1 = bookingRequest0.getEndTime();
        java.lang.String str2 = bookingRequest0.getRoomId();
        java.time.LocalDateTime localDateTime3 = bookingRequest0.getEndTime();
        java.lang.String str4 = bookingRequest0.getRoomId();
        org.junit.Assert.assertNull(localDateTime1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(localDateTime3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        room6.setCapacity((int) '4');
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = room6.getOccupancySensor();
        occupancySensor13.setDetected(false);
        occupancySensor13.roomId = "Unverified badge detected for .";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor13);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        room6.setCapacity((int) (short) 100);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor12 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount19 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean20 = occupancySensor12.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount19);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor24 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount31 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean32 = occupancySensor24.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount31);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher33 = null;
        occupancySensor24.setSubject(checkInPublisher33);
        occupancySensor24.isDetected = false;
        boolean boolean37 = occupancySensor24.isOccupied();
        com.conferenceroomscheduler.model.Badge badge41 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str42 = badge41.getEmail();
        boolean boolean43 = occupancySensor24.scanIdBadge(badge41);
        java.lang.String str44 = badge41.getAccountId();
        badge41.setAccountId("Cancelled");
        java.lang.String str47 = badge41.getEmail();
        java.lang.String str48 = badge41.getAccountId();
        boolean boolean49 = occupancySensor12.scanIdBadge(badge41);
        boolean boolean50 = occupancySensor12.isOccupied();
        java.lang.String str51 = occupancySensor12.roomId;
        room6.setOccupancySensor(occupancySensor12);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher53 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor57 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean58 = occupancySensor57.isDetected();
        occupancySensor57.occupied = false;
        checkInPublisher53.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor57);
        boolean boolean62 = occupancySensor57.isDetected;
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory63 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account71 = facultyFactory63.createAccount("", "Cancelled", "", "hi!", false, false, "");
        account71.setAccountNumber("hi!");
        account71.setUniversityAccount(true);
        account71.setAccountNumber("");
        boolean boolean78 = occupancySensor57.detectOccupancy(account71);
        com.conferenceroomscheduler.model.StudentAccount studentAccount85 = new com.conferenceroomscheduler.model.StudentAccount("hi!", "faculty", "", false, false, "hi!");
        boolean boolean86 = occupancySensor57.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount85);
        studentAccount85.setIdentifier("Unverified badge detected for Cancelled.");
        boolean boolean89 = studentAccount85.isVerified();
        boolean boolean90 = occupancySensor12.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount85);
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Cancelled" + "'", str42, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Booking confirmed." + "'", str44, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Cancelled" + "'", str47, "Cancelled");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Cancelled" + "'", str48, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Pending" + "'", str51, "Pending");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(account71);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Cancelled", true, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = occupancySensor3.getSubject();
        java.lang.String str5 = occupancySensor3.getLastEvent();
        java.lang.Class<?> wildcardClass6 = occupancySensor3.getClass();
        org.junit.Assert.assertNull(checkInPublisher4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService10 = null;
        com.conferenceroomscheduler.model.Reservation reservation11 = new com.conferenceroomscheduler.model.Reservation();
        reservation11.setFinalAmount((double) (byte) 100);
        java.lang.String str14 = reservation11.getRoomId();
        reservation11.setRoomId("hi!");
        reservation11.setCheckedIn(true);
        reservation11.setHourlyRate((double) 'a');
        java.lang.String str21 = reservation11.getAccountType();
        java.lang.String str22 = reservation11.getRoomId();
        reservation11.setDepositAmount(32.0d);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand27 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService10, reservation11, localDateTime25, localDateTime26);
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        com.conferenceroomscheduler.model.Reservation reservation38 = new com.conferenceroomscheduler.model.Reservation();
        reservation38.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod41 = reservation38.getPaymentMethod();
        reservation38.setFinalAmount((double) (byte) 1);
        java.lang.String str44 = reservation38.getRoomId();
        reservation38.setReservationId("Checked in.");
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod57 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation58 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime51, localDateTime52, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod57);
        reservation38.setPaymentMethod(paymentMethod57);
        com.conferenceroomscheduler.model.Reservation reservation60 = new com.conferenceroomscheduler.model.Reservation("Pending", "Unverified badge detected for Cancelled.", "Pending", "partner", localDateTime32, localDateTime33, "Checked in.", (double) 10.0f, (double) (byte) 100, 1.0d, paymentMethod57);
        reservation11.setPaymentMethod(paymentMethod57);
        com.conferenceroomscheduler.model.Reservation reservation62 = new com.conferenceroomscheduler.model.Reservation("Pending", "Booking confirmed.", "Booking complete", "Verified badge detected for Checked in..", localDateTime4, localDateTime5, "Booking confirmed.", 0.0d, 10.0d, (double) 1, paymentMethod57);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(paymentMethod41);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + paymentMethod57 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod57.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
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
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor21 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor21.update("Checked in.");
        roomSensor21.update("hi!");
        roomSensor21.update("Unverified badge detected for Cancelled.");
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor21);
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor29 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor29.update("Checked in.");
        roomSensor29.update("Checked in.");
        roomSensor29.update("Cancelled");
        roomSensor29.update("");
        roomSensor29.update("");
        roomSensor29.update("Checked in.");
        chiefEventCoordinator0.removeObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor29);
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(chiefEventCoordinator3);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("Unverified badge detected for Cancelled.", "Cancelled", "Booking complete", true, false, "Cancelled");
        facultyAccount6.setUniversityAccount(true);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) '4');
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("", (double) (-1));
        boolean boolean9 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) (byte) 0);
        boolean boolean12 = debitCardPaymentStrategy0.processPayment("Booking confirmed.", (double) (byte) -1);
        boolean boolean15 = debitCardPaymentStrategy0.processPayment("", 0.0d);
        boolean boolean18 = debitCardPaymentStrategy0.processPayment("staff", (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
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
        com.conferenceroomscheduler.model.Reservation reservation82 = bookingContext75.getReservation();
        reservation82.setCheckedIn(false);
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
        org.junit.Assert.assertNotNull(reservation82);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Pending", "Cancelled", (int) (byte) 10, "Checked in.", "Cancelled");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("", "student", (int) '4', "student", "Cancelled");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("hi!", "faculty", (int) (short) 1, "student", "student");
        room24.setName("hi!");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor63 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount70 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean71 = occupancySensor63.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount70);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher72 = null;
        occupancySensor63.setSubject(checkInPublisher72);
        occupancySensor63.isDetected = false;
        boolean boolean76 = occupancySensor63.isOccupied();
        com.conferenceroomscheduler.model.Badge badge80 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str81 = badge80.getEmail();
        boolean boolean82 = occupancySensor63.scanIdBadge(badge80);
        java.lang.String str83 = badge80.getAccountId();
        badge80.setAccountId("Cancelled");
        java.lang.String str86 = badge80.getEmail();
        java.lang.String str87 = badge80.getAccountId();
        boolean boolean88 = occupancySensor3.scanIdBadge(badge80);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher89 = occupancySensor3.getSubject();
        boolean boolean90 = occupancySensor3.isDetected;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Cancelled" + "'", str81, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Booking confirmed." + "'", str83, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Cancelled" + "'", str86, "Cancelled");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Cancelled" + "'", str87, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(checkInPublisher89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        boolean boolean4 = badgeScan3.isVerified();
        boolean boolean5 = badgeScan3.isVerified();
        java.lang.String str6 = badgeScan3.getBadgeId();
        java.lang.String str7 = badgeScan3.getBadgeId();
        badgeScan3.setBadgeId("Booking complete");
        java.lang.String str10 = badgeScan3.getBadgeId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking complete" + "'", str10, "Booking complete");
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
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
        java.lang.String str24 = occupancySensor3.roomId;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pending" + "'", str23, "Pending");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Pending" + "'", str24, "Pending");
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor32 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor36 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean37 = occupancySensor36.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher38 = null;
        occupancySensor36.subject = checkInPublisher38;
        occupancySensor36.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher42 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor46 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher47 = null;
        occupancySensor46.setSubject(checkInPublisher47);
        occupancySensor46.occupied = true;
        occupancySensor46.setDetected(false);
        checkInPublisher42.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor46);
        occupancySensor36.setSubject(checkInPublisher42);
        occupancySensor32.setSubject(checkInPublisher42);
        occupancySensor15.subject = checkInPublisher42;
        occupancySensor3.subject = checkInPublisher42;
        boolean boolean58 = occupancySensor3.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount0.setAccountNumber("hi!");
        adminAccount0.setIdentifier("Booking confirmed.");
        adminAccount0.setAccountId("partner");
        boolean boolean7 = adminAccount0.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Booking confirmed.", "hi!", "Pending", false, true, "Checked in.");
        java.lang.String str7 = partnerAccount6.getAccountNumber();
        partnerAccount6.setAccountNumber("student");
        partnerAccount6.setUniversityAccount(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Checked in." + "'", str7, "Checked in.");
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
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
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState29 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str30 = pendingBookingState29.getName();
        com.conferenceroomscheduler.model.Reservation reservation31 = new com.conferenceroomscheduler.model.Reservation();
        reservation31.setFinalAmount((double) (byte) 100);
        reservation31.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext36 = new com.conferenceroomscheduler.patterns.BookingContext(reservation31);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState37 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str38 = cancelledBookingState37.getName();
        bookingContext36.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState37);
        pendingBookingState29.handle(bookingContext36);
        java.lang.String str41 = pendingBookingState29.getName();
        java.lang.String str42 = pendingBookingState29.getName();
        com.conferenceroomscheduler.model.Reservation reservation43 = new com.conferenceroomscheduler.model.Reservation();
        reservation43.setFinalAmount((double) (byte) 100);
        java.lang.String str46 = reservation43.getRoomId();
        reservation43.setFinalAmount((double) 10.0f);
        java.lang.String str49 = reservation43.getUserId();
        reservation43.setFinalAmount((double) ' ');
        java.lang.String str52 = reservation43.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext53 = new com.conferenceroomscheduler.patterns.BookingContext(reservation43);
        bookingContext53.request();
        pendingBookingState29.handle(bookingContext53);
        com.conferenceroomscheduler.model.Reservation reservation56 = new com.conferenceroomscheduler.model.Reservation();
        reservation56.setFinalAmount((double) (byte) 100);
        java.lang.String str59 = reservation56.getRoomId();
        reservation56.setFinalAmount((double) 10.0f);
        java.lang.String str62 = reservation56.getUserId();
        double double63 = reservation56.getFinalAmount();
        reservation56.setReservationId("Pending");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext66 = new com.conferenceroomscheduler.patterns.BookingContext(reservation56);
        pendingBookingState29.handle(bookingContext66);
        pendingBookingState0.handle(bookingContext66);
        java.lang.String str69 = pendingBookingState0.getName();
        java.lang.String str70 = pendingBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pending" + "'", str1, "Pending");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pending" + "'", str12, "Pending");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pending" + "'", str13, "Pending");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Pending" + "'", str27, "Pending");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Pending" + "'", str28, "Pending");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Pending" + "'", str30, "Pending");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Cancelled" + "'", str38, "Cancelled");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Pending" + "'", str41, "Pending");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Pending" + "'", str42, "Pending");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Pending" + "'", str69, "Pending");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Pending" + "'", str70, "Pending");
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        com.conferenceroomscheduler.model.StaffAccount staffAccount0 = new com.conferenceroomscheduler.model.StaffAccount();
        boolean boolean1 = staffAccount0.isUniversityAccount();
        com.conferenceroomscheduler.model.Badge badge2 = staffAccount0.getBadge();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(badge2);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Checked in.", "Pending", "Cancelled", true, false, "Booking confirmed.");
        studentAccount6.setAccountType("student");
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
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
        java.lang.String str22 = room6.getRoomId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor0 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor0.update("Checked in.");
        roomSensor0.update("hi!");
        roomSensor0.update("faculty");
        roomSensor0.update("");
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("ADMIN-69", "Booking confirmed.", "ADMIN-69", "Unverified badge detected for .", (int) (short) 10, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = bookingRequest7.getEndTime();
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getName();
        room6.setCapacity((int) '4');
        room6.setRoomId("student");
        java.lang.String str17 = room6.getBuilding();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor18 = room6.getOccupancySensor();
        java.lang.String str19 = room6.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cancelled" + "'", str12, "Cancelled");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(occupancySensor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Cancelled" + "'", str19, "Cancelled");
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setDepositAmount(0.0d);
        reservation0.setCheckedIn(false);
        java.lang.Class<?> wildcardClass8 = reservation0.getClass();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState1 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str2 = cancelledBookingState1.getName();
        com.conferenceroomscheduler.model.Reservation reservation3 = new com.conferenceroomscheduler.model.Reservation();
        reservation3.setFinalAmount((double) (byte) 100);
        reservation3.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext8 = new com.conferenceroomscheduler.patterns.BookingContext(reservation3);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState9 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str10 = cancelledBookingState9.getName();
        bookingContext8.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState9);
        bookingContext8.request();
        cancelledBookingState1.handle(bookingContext8);
        com.conferenceroomscheduler.model.Reservation reservation14 = bookingContext8.getReservation();
        reservation14.setAccountType("faculty");
        java.lang.String str17 = reservation14.getTitle();
        java.time.LocalDateTime localDateTime18 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand19 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation14, localDateTime18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cancelled" + "'", str2, "Cancelled");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cancelled" + "'", str10, "Cancelled");
        org.junit.Assert.assertNotNull(reservation14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
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
        boolean boolean16 = reservation0.isDepositLost();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean4 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor3.subject = checkInPublisher5;
        occupancySensor3.occupied = false;
        java.lang.String str9 = occupancySensor3.getRoomId();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher10 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor14 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean15 = occupancySensor14.isDetected();
        occupancySensor14.occupied = false;
        checkInPublisher10.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor14);
        occupancySensor14.setOccupied(true);
        occupancySensor14.occupied = false;
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount29 = new com.conferenceroomscheduler.model.PartnerAccount("Booking complete", "hi!", "", true, true, "Unverified badge detected for Cancelled.");
        boolean boolean30 = occupancySensor14.detectOccupancy((com.conferenceroomscheduler.model.Account) partnerAccount29);
        java.lang.String str31 = occupancySensor14.getLastEvent();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor35 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher36 = null;
        occupancySensor35.setSubject(checkInPublisher36);
        boolean boolean38 = occupancySensor35.occupied;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor42 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean43 = occupancySensor42.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher44 = null;
        occupancySensor42.subject = checkInPublisher44;
        occupancySensor42.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher48 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor52 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher53 = null;
        occupancySensor52.setSubject(checkInPublisher53);
        occupancySensor52.occupied = true;
        occupancySensor52.setDetected(false);
        checkInPublisher48.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor52);
        occupancySensor42.setSubject(checkInPublisher48);
        com.conferenceroomscheduler.model.StudentAccount studentAccount67 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        checkInPublisher48.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount67);
        occupancySensor35.subject = checkInPublisher48;
        occupancySensor14.subject = checkInPublisher48;
        occupancySensor3.subject = checkInPublisher48;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Pending" + "'", str9, "Pending");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount0.setAccountNumber("hi!");
        java.lang.String str3 = adminAccount0.getAccountId();
        adminAccount0.setAccountType("Booking complete");
        java.lang.String str6 = adminAccount0.getAccountType();
        adminAccount0.setUniversityAccount(true);
        adminAccount0.setAccountType("staff");
        adminAccount0.setEmail("admin");
        java.lang.String str13 = adminAccount0.getAccountId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking complete" + "'", str6, "Booking complete");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        java.lang.String str3 = reservation0.getUserId();
        boolean boolean4 = reservation0.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation0.getPaymentMethod();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext8 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        reservation0.setAccountType("Cancelled");
        reservation0.setExtended(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(paymentMethod5);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        java.lang.String str8 = room6.getBuilding();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor12 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher13 = null;
        occupancySensor12.setSubject(checkInPublisher13);
        boolean boolean15 = occupancySensor12.isDetected;
        occupancySensor12.roomId = "Booking confirmed.";
        room6.setOccupancySensor(occupancySensor12);
        java.lang.String str19 = room6.getName();
        boolean boolean20 = room6.isEnabled();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor21 = room6.getOccupancySensor();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor25 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor25.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount34 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount34.setEmail("");
        boolean boolean37 = occupancySensor25.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount34);
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
        com.conferenceroomscheduler.model.StudentAccount studentAccount66 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        checkInPublisher47.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount66);
        occupancySensor25.subject = checkInPublisher47;
        occupancySensor25.setRoomId("Checked in.");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher71 = occupancySensor25.subject;
        occupancySensor21.subject = checkInPublisher71;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Cancelled" + "'", str19, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(occupancySensor21);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(checkInPublisher71);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
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
        occupancySensor3.roomId = "faculty";
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Booking confirmed." + "'", str31, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Pending", (int) (byte) 10, true, "hi!", "");
        boolean boolean7 = room6.isClosedForMaintenance();
        room6.setName("Unverified badge detected for admin.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService10 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService11 = null;
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand13 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService11, reservation12);
        java.lang.String str14 = reservation12.getAccountType();
        java.lang.String str15 = reservation12.getAccountType();
        java.time.LocalDateTime localDateTime16 = reservation12.getEndTime();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand17 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService10, reservation12);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService28 = null;
        com.conferenceroomscheduler.model.Reservation reservation29 = new com.conferenceroomscheduler.model.Reservation();
        reservation29.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod32 = reservation29.getPaymentMethod();
        reservation29.setFinalAmount((double) (byte) 1);
        java.lang.String str35 = reservation29.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand36 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService28, reservation29);
        reservation29.setHourlyRate((double) 0L);
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod59 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation60 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime53, localDateTime54, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod59);
        com.conferenceroomscheduler.model.Reservation reservation61 = new com.conferenceroomscheduler.model.Reservation("admin", "", "Booking complete", "Pending", localDateTime43, localDateTime44, "", (double) 'a', (double) 10L, 0.0d, paymentMethod59);
        reservation29.setPaymentMethod(paymentMethod59);
        com.conferenceroomscheduler.model.Reservation reservation63 = new com.conferenceroomscheduler.model.Reservation("partner", "student", "", "student", localDateTime22, localDateTime23, "Unverified badge detected for Cancelled.", (double) (short) -1, 10.0d, 97.0d, paymentMethod59);
        reservation12.setPaymentMethod(paymentMethod59);
        com.conferenceroomscheduler.model.Reservation reservation65 = new com.conferenceroomscheduler.model.Reservation("Pending", "Unverified badge detected for Cancelled.", "student", "ADMIN-69", localDateTime4, localDateTime5, "Cancelled", (double) (-1L), (double) 0.0f, 97.0d, paymentMethod59);
        java.time.LocalDateTime localDateTime66 = null;
        reservation65.setEndTime(localDateTime66);
        java.time.LocalDateTime localDateTime68 = reservation65.getStartTime();
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(paymentMethod32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + paymentMethod59 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod59.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertNull(localDateTime68);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        java.lang.String str3 = reservation2.getTitle();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand4 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.time.LocalDateTime localDateTime5 = reservation2.getEndTime();
        reservation2.setUserId("hi!");
        java.time.LocalDateTime localDateTime8 = reservation2.getStartTime();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand9 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation2);
        boolean boolean10 = reservation2.isCheckedIn();
        java.time.LocalDateTime localDateTime11 = null;
        reservation2.setEndTime(localDateTime11);
        reservation2.setUserId("Pending");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        java.lang.String str7 = reservation0.getAccountType();
        double double8 = reservation0.getFinalAmount();
        reservation0.setUserId("Booking complete");
        reservation0.setHourlyRate((double) ' ');
        double double13 = reservation0.getFinalAmount();
        boolean boolean14 = reservation0.isCanceled();
        reservation0.setReservationId("ADMIN-69");
        boolean boolean17 = reservation0.isCanceled();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        boolean boolean19 = room6.isEnabled();
        room6.setBuilding("Pending");
        int int22 = room6.getCapacity();
        java.lang.String str23 = room6.getBuilding();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pending" + "'", str23, "Pending");
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
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
        reservation2.setDepositLost(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Booking confirmed.", "admin", "", false, false, "Unverified badge detected for Cancelled.");
        boolean boolean7 = studentAccount6.isUniversityAccount();
        com.conferenceroomscheduler.model.Badge badge8 = studentAccount6.getBadge();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(badge8);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState0 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext2 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState3 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext2.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState3);
        com.conferenceroomscheduler.patterns.BookingState bookingState5 = bookingContext2.getState();
        com.conferenceroomscheduler.model.Reservation reservation6 = bookingContext2.getReservation();
        cancelledBookingState0.handle(bookingContext2);
        java.lang.String str8 = bookingContext2.getStatus();
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
        bookingContext2.setState((com.conferenceroomscheduler.patterns.BookingState) checkedInBookingState9);
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState20 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str21 = confirmedBookingState20.getName();
        java.lang.String str22 = confirmedBookingState20.getName();
        com.conferenceroomscheduler.model.Reservation reservation23 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext24 = new com.conferenceroomscheduler.patterns.BookingContext(reservation23);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState25 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext24.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState25);
        com.conferenceroomscheduler.model.Reservation reservation27 = bookingContext24.getReservation();
        confirmedBookingState20.handle(bookingContext24);
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
        com.conferenceroomscheduler.model.Reservation reservation46 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext47 = new com.conferenceroomscheduler.patterns.BookingContext(reservation46);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState48 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext47.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState48);
        checkedInBookingState29.handle(bookingContext47);
        confirmedBookingState20.handle(bookingContext47);
        checkedInBookingState9.handle(bookingContext47);
        com.conferenceroomscheduler.model.Reservation reservation53 = bookingContext47.getReservation();
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNull(reservation6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Booking confirmed." + "'", str21, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Booking confirmed." + "'", str22, "Booking confirmed.");
        org.junit.Assert.assertNull(reservation27);
        org.junit.Assert.assertNotNull(bookingState35);
        org.junit.Assert.assertNotNull(bookingState36);
        org.junit.Assert.assertNull(reservation53);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("faculty", "faculty", "Pending", true, true, "Cancelled");
        boolean boolean7 = partnerAccount6.isUniversityAccount();
        java.lang.String str8 = partnerAccount6.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Pending" + "'", str8, "Pending");
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Checked in.", "Checked in.", false);
        badge3.setAccountId("Booking complete");
        badge3.setAccountId("hi!");
        boolean boolean8 = badge3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService2 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod13 = null;
        com.conferenceroomscheduler.model.Reservation reservation14 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime7, localDateTime8, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod13);
        reservation14.setDepositLost(true);
        java.time.LocalDateTime localDateTime17 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand18 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService2, reservation14, localDateTime17);
        reservation14.setHourlyRate((double) (-1.0f));
        boolean boolean21 = reservation14.isDepositLost();
        java.lang.String str22 = reservation14.getReservationId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand23 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService1, reservation14);
        boolean boolean24 = reservation14.isCanceled();
        boolean boolean25 = reservation14.isDepositLost();
        reservation14.setDepositAmount((double) (short) 10);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod28 = reservation14.getPaymentMethod();
        java.time.LocalDateTime localDateTime29 = reservation14.getStartTime();
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand32 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation14, localDateTime30, localDateTime31);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(paymentMethod28);
        org.junit.Assert.assertNull(localDateTime29);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("partner", "admin", false);
        badgeScan3.setBadgeId("Unverified badge detected for Cancelled.");
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
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
        java.lang.String str22 = completedBookingState0.getName();
        java.lang.String str23 = completedBookingState0.getName();
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
        completedBookingState0.handle(bookingContext31);
        com.conferenceroomscheduler.model.Reservation reservation37 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext38 = new com.conferenceroomscheduler.patterns.BookingContext(reservation37);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState39 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext38.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState39);
        com.conferenceroomscheduler.patterns.BookingState bookingState41 = bookingContext38.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState42 = bookingContext38.getState();
        bookingContext38.request();
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState44 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str45 = confirmedBookingState44.getName();
        java.lang.String str46 = confirmedBookingState44.getName();
        java.lang.String str47 = confirmedBookingState44.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState48 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState49 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation50 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext51 = new com.conferenceroomscheduler.patterns.BookingContext(reservation50);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState52 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext51.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState52);
        com.conferenceroomscheduler.patterns.BookingState bookingState54 = bookingContext51.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState55 = bookingContext51.getState();
        cancelledBookingState49.handle(bookingContext51);
        checkedInBookingState48.handle(bookingContext51);
        java.lang.String str58 = checkedInBookingState48.getName();
        com.conferenceroomscheduler.model.Reservation reservation59 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext60 = new com.conferenceroomscheduler.patterns.BookingContext(reservation59);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState61 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext60.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState61);
        com.conferenceroomscheduler.model.Reservation reservation63 = bookingContext60.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation64 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext65 = new com.conferenceroomscheduler.patterns.BookingContext(reservation64);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState66 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext65.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState66);
        com.conferenceroomscheduler.patterns.BookingState bookingState68 = bookingContext65.getState();
        bookingContext60.setState(bookingState68);
        checkedInBookingState48.handle(bookingContext60);
        com.conferenceroomscheduler.model.Reservation reservation71 = bookingContext60.getReservation();
        confirmedBookingState44.handle(bookingContext60);
        java.lang.String str73 = confirmedBookingState44.getName();
        java.lang.String str74 = confirmedBookingState44.getName();
        java.lang.String str75 = confirmedBookingState44.getName();
        bookingContext38.setState((com.conferenceroomscheduler.patterns.BookingState) confirmedBookingState44);
        java.lang.String str77 = confirmedBookingState44.getName();
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState78 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str79 = confirmedBookingState78.getName();
        java.lang.String str80 = confirmedBookingState78.getName();
        java.lang.String str81 = confirmedBookingState78.getName();
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState82 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation83 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext84 = new com.conferenceroomscheduler.patterns.BookingContext(reservation83);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState85 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext84.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState85);
        completedBookingState82.handle(bookingContext84);
        confirmedBookingState78.handle(bookingContext84);
        confirmedBookingState44.handle(bookingContext84);
        java.lang.String str90 = bookingContext84.getStatus();
        completedBookingState0.handle(bookingContext84);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNotNull(bookingState12);
        org.junit.Assert.assertNotNull(bookingState19);
        org.junit.Assert.assertNull(reservation20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Booking complete" + "'", str22, "Booking complete");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking complete" + "'", str23, "Booking complete");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Pending" + "'", str25, "Pending");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Cancelled" + "'", str33, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState41);
        org.junit.Assert.assertNotNull(bookingState42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Booking confirmed." + "'", str45, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Booking confirmed." + "'", str46, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Booking confirmed." + "'", str47, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState54);
        org.junit.Assert.assertNotNull(bookingState55);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Checked in." + "'", str58, "Checked in.");
        org.junit.Assert.assertNull(reservation63);
        org.junit.Assert.assertNotNull(bookingState68);
        org.junit.Assert.assertNull(reservation71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Booking confirmed." + "'", str73, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Booking confirmed." + "'", str74, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Booking confirmed." + "'", str75, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Booking confirmed." + "'", str77, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Booking confirmed." + "'", str79, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Booking confirmed." + "'", str80, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Booking confirmed." + "'", str81, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Checked in." + "'", str90, "Checked in.");
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("student", "student", 100, false, "", "hi!");
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        java.lang.String str8 = room6.getRoomNumber();
        java.lang.String str9 = room6.getRoomId();
        room6.setEnabled(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        room6.setClosedForMaintenance(false);
        room6.setCapacity(100);
        room6.setRoomId("hi!");
        boolean boolean19 = room6.isClosedForMaintenance();
        room6.setClosedForMaintenance(false);
        java.lang.String str22 = room6.getBuilding();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        reservation0.setCanceled(false);
        java.time.LocalDateTime localDateTime8 = null;
        reservation0.setStartTime(localDateTime8);
        reservation0.setReservationId("hi!");
        boolean boolean12 = reservation0.isDepositLost();
        java.time.LocalDateTime localDateTime13 = null;
        reservation0.setStartTime(localDateTime13);
        reservation0.setDepositLost(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        reservation0.setExtended(true);
        reservation0.setAccountType("hi!");
        boolean boolean14 = reservation0.isDepositLost();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("student", "hi!", (int) (byte) 10, false, "Pending", "Cancelled");
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
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
        occupancySensor4.occupied = true;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(account18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Cancelled", "student", false);
        badgeScan3.setVerified(true);
        badgeScan3.setVerified(false);
        badgeScan3.setVerified(false);
        badgeScan3.setVerified(true);
        badgeScan3.setRoomId("Unverified badge detected for Cancelled.");
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Booking complete", "", false);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        boolean boolean6 = reservation0.isCanceled();
        reservation0.setUserId("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setDepositAmount((double) (-1.0f));
        double double6 = reservation0.getFinalAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Pending", "hi!", "Booking confirmed.", "", 97, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getTitle();
        java.time.LocalDateTime localDateTime9 = bookingRequest7.getStartTime();
        java.lang.String str10 = bookingRequest7.getTitle();
        java.time.LocalDateTime localDateTime11 = bookingRequest7.getStartTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        java.lang.String str3 = reservation0.getUserId();
        boolean boolean4 = reservation0.isDepositLost();
        double double5 = reservation0.getHourlyRate();
        java.lang.String str6 = reservation0.getAccountType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
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
        java.lang.String str18 = adminAccount9.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(badge11);
        org.junit.Assert.assertNull(badge12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        java.lang.String str7 = reservation0.getAccountType();
        double double8 = reservation0.getFinalAmount();
        java.lang.String str9 = reservation0.getUserId();
        java.time.LocalDateTime localDateTime10 = null;
        reservation0.setEndTime(localDateTime10);
        boolean boolean12 = reservation0.isCheckedIn();
        java.lang.String str13 = reservation0.getReservationId();
        reservation0.setHourlyRate((double) (short) 100);
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = null;
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime5, localDateTime6, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod11);
        reservation12.setDepositLost(true);
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand16 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation12, localDateTime15);
        reservation12.setAccountType("Pending");
        double double19 = reservation12.getDepositAmount();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod20 = reservation12.getPaymentMethod();
        reservation12.setHourlyRate((double) (byte) 0);
        java.time.LocalDateTime localDateTime23 = reservation12.getStartTime();
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNull(paymentMethod20);
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
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
        com.conferenceroomscheduler.model.Account account92 = new com.conferenceroomscheduler.model.Account("Pending", "Booking complete", "Checked in.", "Booking confirmed.", false, true, "Pending");
        checkInPublisher25.notifyObservers(account92);
        java.lang.String str94 = account92.getPassword();
        org.junit.Assert.assertNotNull(account12);
        org.junit.Assert.assertNotNull(account20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(account62);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "Checked in." + "'", str94, "Checked in.");
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
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
        com.conferenceroomscheduler.model.Reservation reservation50 = bookingContext46.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation51 = bookingContext46.getReservation();
        bookingContext46.request();
        confirmedBookingState11.handle(bookingContext46);
        java.lang.String str54 = confirmedBookingState11.getName();
        com.conferenceroomscheduler.model.Reservation reservation55 = new com.conferenceroomscheduler.model.Reservation();
        reservation55.setFinalAmount((double) (byte) 100);
        java.lang.String str58 = reservation55.getRoomId();
        reservation55.setFinalAmount((double) 10.0f);
        java.lang.String str61 = reservation55.getUserId();
        reservation55.setFinalAmount((double) ' ');
        java.lang.String str64 = reservation55.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext65 = new com.conferenceroomscheduler.patterns.BookingContext(reservation55);
        bookingContext65.request();
        com.conferenceroomscheduler.patterns.BookingState bookingState67 = bookingContext65.getState();
        confirmedBookingState11.handle(bookingContext65);
        java.lang.String str69 = confirmedBookingState11.getName();
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
        org.junit.Assert.assertNotNull(reservation50);
        org.junit.Assert.assertNotNull(reservation51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Booking confirmed." + "'", str54, "Booking confirmed.");
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(bookingState67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Booking confirmed." + "'", str69, "Booking confirmed.");
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setEnabled(true);
        java.lang.String str13 = room6.getName();
        boolean boolean14 = room6.isClosedForMaintenance();
        boolean boolean15 = room6.isClosedForMaintenance();
        boolean boolean16 = room6.isEnabled();
        room6.setRoomNumber("Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
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
        reservation33.setUserId("Pending");
        org.junit.Assert.assertTrue("'" + paymentMethod30 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod30.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setCheckedIn(true);
        reservation0.setDepositAmount((double) 10.0f);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        reservation0.setPaymentMethod(paymentMethod11);
        reservation0.setCanceled(true);
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + paymentMethod11 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod11.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        com.conferenceroomscheduler.model.Badge badge7 = studentAccount6.getBadge();
        badge7.setEmail("Checked in.");
        badge7.setVerified(false);
        java.lang.String str12 = badge7.getEmail();
        org.junit.Assert.assertNotNull(badge7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Checked in." + "'", str12, "Checked in.");
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Booking confirmed.", "ADMIN-69", "Booking confirmed.", "Checked in.", (int) (short) 1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking confirmed." + "'", str8, "Booking confirmed.");
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) 10);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("Cancelled", 1.0d);
        boolean boolean9 = creditCardPaymentStrategy0.processPayment("Pending", (double) 10);
        boolean boolean12 = creditCardPaymentStrategy0.processPayment("Verified badge detected for ADMIN-69.", 100.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
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
        double double38 = reservation0.getFinalAmount();
        reservation0.setHourlyRate((double) (short) 10);
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod32 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod32.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
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
        boolean boolean87 = occupancySensor15.isDetected();
        occupancySensor15.setDetected(false);
        boolean boolean90 = occupancySensor15.occupied;
        occupancySensor15.isDetected = false;
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Pending" + "'", str29, "Pending");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(checkInPublisher84);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("Cancelled", "staff", "partner", false, false, "hi!");
        java.lang.String str7 = facultyAccount6.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, false);
        occupancySensor3.occupied = true;
        com.conferenceroomscheduler.model.Room room12 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str13 = room12.getRoomId();
        java.lang.String str14 = room12.getBuilding();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor18 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher19 = null;
        occupancySensor18.setSubject(checkInPublisher19);
        boolean boolean21 = occupancySensor18.isDetected;
        occupancySensor18.roomId = "Booking confirmed.";
        room12.setOccupancySensor(occupancySensor18);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor28 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean29 = occupancySensor28.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher30 = null;
        occupancySensor28.subject = checkInPublisher30;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher32 = occupancySensor28.getSubject();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher33 = occupancySensor28.getSubject();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor37 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher38 = null;
        occupancySensor37.setSubject(checkInPublisher38);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor43 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor47 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean48 = occupancySensor47.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher49 = null;
        occupancySensor47.subject = checkInPublisher49;
        occupancySensor47.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher53 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor57 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher58 = null;
        occupancySensor57.setSubject(checkInPublisher58);
        occupancySensor57.occupied = true;
        occupancySensor57.setDetected(false);
        checkInPublisher53.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor57);
        occupancySensor47.setSubject(checkInPublisher53);
        occupancySensor43.setSubject(checkInPublisher53);
        occupancySensor37.setSubject(checkInPublisher53);
        occupancySensor28.setSubject(checkInPublisher53);
        occupancySensor18.subject = checkInPublisher53;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher70 = occupancySensor18.getSubject();
        occupancySensor3.setSubject(checkInPublisher70);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(checkInPublisher32);
        org.junit.Assert.assertNull(checkInPublisher33);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(checkInPublisher70);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext6 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState7 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str8 = cancelledBookingState7.getName();
        bookingContext6.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState7);
        com.conferenceroomscheduler.model.Reservation reservation10 = bookingContext6.getReservation();
        java.time.LocalDateTime localDateTime11 = null;
        reservation10.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        reservation10.setEndTime(localDateTime13);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand15 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation10);
        java.time.LocalDateTime localDateTime16 = reservation10.getEndTime();
        reservation10.setFinalAmount((double) '#');
        java.lang.String str19 = reservation10.getRoomId();
        java.lang.String str20 = reservation10.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNotNull(reservation10);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        boolean boolean4 = badgeScan3.isVerified();
        boolean boolean5 = badgeScan3.isVerified();
        java.lang.String str6 = badgeScan3.getRoomId();
        badgeScan3.setVerified(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = room6.getOccupancySensor();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher11 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor15 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean16 = occupancySensor15.isDetected();
        occupancySensor15.occupied = false;
        checkInPublisher11.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor15);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher20 = occupancySensor15.subject;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor24 = new com.conferenceroomscheduler.model.OccupancySensor("Cancelled", false, false);
        checkInPublisher20.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor24);
        occupancySensor10.subject = checkInPublisher20;
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
        occupancySensor30.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher74 = occupancySensor30.getSubject();
        occupancySensor30.isDetected = false;
        checkInPublisher20.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor30);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(occupancySensor10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(checkInPublisher20);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(checkInPublisher74);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
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
        occupancySensor20.setDetected(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(checkInPublisher79);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        room6.setName("Pending");
        room6.setClosedForMaintenance(true);
        room6.setRoomNumber("Booking complete");
        int int13 = room6.getCapacity();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("Pending", "staff", "faculty", true, true, "Checked in.");
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
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
        boolean boolean34 = occupancySensor3.isDetected();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Verified badge detected for ADMIN-69.", "", false);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
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
        java.lang.String str21 = occupancySensor15.getLastEvent();
        boolean boolean22 = occupancySensor15.occupied;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(checkInPublisher19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        java.lang.String str7 = reservation0.getAccountType();
        double double8 = reservation0.getFinalAmount();
        double double9 = reservation0.getFinalAmount();
        java.time.LocalDateTime localDateTime10 = null;
        reservation0.setStartTime(localDateTime10);
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("hi!", "student", "hi!", false, false, "");
        java.lang.Class<?> wildcardClass7 = partnerAccount6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("admin", "Unverified badge detected for .", "", false, false, "");
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
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
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        java.lang.String str3 = reservation0.getUserId();
        boolean boolean4 = reservation0.isDepositLost();
        reservation0.setHourlyRate(1.0d);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod17 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation18 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime11, localDateTime12, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod17);
        reservation0.setPaymentMethod(paymentMethod17);
        reservation0.setCheckedIn(true);
        reservation0.setHourlyRate((double) (byte) 10);
        double double24 = reservation0.getDepositAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + paymentMethod17 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod17.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        room6.setCapacity((int) '4');
        room6.setName("hi!");
        room6.setName("");
        room6.setName("");
        boolean boolean19 = room6.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setDepositAmount(0.0d);
        java.lang.String str7 = reservation1.getReservationId();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand10 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime11 = reservation1.getEndTime();
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation();
        reservation12.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod15 = reservation12.getPaymentMethod();
        reservation12.setFinalAmount((double) (byte) 1);
        java.lang.String str18 = reservation12.getRoomId();
        reservation12.setCheckedIn(true);
        reservation12.setDepositAmount((double) 10.0f);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod23 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        reservation12.setPaymentMethod(paymentMethod23);
        reservation1.setPaymentMethod(paymentMethod23);
        java.time.LocalDateTime localDateTime26 = reservation1.getEndTime();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(paymentMethod15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + paymentMethod23 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod23.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertNull(localDateTime26);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand6 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setCheckedIn(false);
        double double9 = reservation1.getHourlyRate();
        reservation1.setDepositLost(false);
        boolean boolean12 = reservation1.isDepositLost();
        reservation1.setReservationId("admin");
        boolean boolean15 = reservation1.isDepositLost();
        reservation1.setReservationId("Booking confirmed.");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
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
        boolean boolean29 = badge20.isVerified();
        badge20.setVerified(true);
        badge20.setEmail("Unverified badge detected for .");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking confirmed." + "'", str23, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Pending", "student", false);
        badge3.setEmail("admin");
        boolean boolean6 = badge3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = null;
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime5, localDateTime6, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod11);
        reservation12.setDepositLost(true);
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand16 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation12, localDateTime15);
        double double17 = reservation12.getHourlyRate();
        reservation12.setTitle("faculty");
        reservation12.setAccountType("partner");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setCheckedIn(true);
        java.lang.String str9 = reservation0.getAccountType();
        java.lang.String str10 = reservation0.getRoomId();
        java.time.LocalDateTime localDateTime11 = reservation0.getEndTime();
        reservation0.setExtended(true);
        reservation0.setDepositAmount((double) (byte) -1);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod16 = reservation0.getPaymentMethod();
        java.time.LocalDateTime localDateTime17 = reservation0.getEndTime();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(paymentMethod16);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str1 = adminAccount0.getEmail();
        com.conferenceroomscheduler.model.Badge badge2 = adminAccount0.getBadge();
        com.conferenceroomscheduler.model.Badge badge3 = adminAccount0.getBadge();
        adminAccount0.setIdentifier("Cancelled");
        java.lang.String str6 = adminAccount0.getAccountNumber();
        adminAccount0.setAccountId("Booking confirmed.");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(badge2);
        org.junit.Assert.assertNull(badge3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        room6.setCapacity((int) '4');
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor16 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher17 = null;
        occupancySensor16.setSubject(checkInPublisher17);
        boolean boolean19 = occupancySensor16.isDetected;
        com.conferenceroomscheduler.model.Badge badge23 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        boolean boolean24 = occupancySensor16.scanIdBadge(badge23);
        occupancySensor16.occupied = true;
        room6.setOccupancySensor(occupancySensor16);
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount28 = new com.conferenceroomscheduler.model.PartnerAccount();
        partnerAccount28.setVerified(false);
        java.lang.String str31 = partnerAccount28.getAccountNumber();
        room6.checkIn((com.conferenceroomscheduler.model.Account) partnerAccount28);
        int int33 = room6.getCapacity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState0 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str1 = cancelledBookingState0.getName();
        java.lang.String str2 = cancelledBookingState0.getName();
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService3 = null;
        com.conferenceroomscheduler.model.Reservation reservation4 = new com.conferenceroomscheduler.model.Reservation();
        reservation4.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod7 = reservation4.getPaymentMethod();
        reservation4.setDepositAmount(0.0d);
        java.lang.String str10 = reservation4.getReservationId();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand13 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService3, reservation4, localDateTime11, localDateTime12);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext14 = new com.conferenceroomscheduler.patterns.BookingContext(reservation4);
        cancelledBookingState0.handle(bookingContext14);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cancelled" + "'", str1, "Cancelled");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cancelled" + "'", str2, "Cancelled");
        org.junit.Assert.assertNull(paymentMethod7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("hi!", "Booking confirmed.", "staff", true, false, "ADMIN-69");
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
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
        com.conferenceroomscheduler.model.Reservation reservation15 = bookingContext8.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation16 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext17 = new com.conferenceroomscheduler.patterns.BookingContext(reservation16);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState18 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext17.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState18);
        com.conferenceroomscheduler.model.Reservation reservation20 = bookingContext17.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation21 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext22 = new com.conferenceroomscheduler.patterns.BookingContext(reservation21);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState23 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext22.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState23);
        com.conferenceroomscheduler.patterns.BookingState bookingState25 = bookingContext22.getState();
        bookingContext17.setState(bookingState25);
        bookingContext8.setState(bookingState25);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext28 = null;
        bookingState25.handle(bookingContext28);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNotNull(bookingState12);
        org.junit.Assert.assertNull(reservation15);
        org.junit.Assert.assertNull(reservation20);
        org.junit.Assert.assertNotNull(bookingState25);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState0 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str1 = confirmedBookingState0.getName();
        java.lang.String str2 = confirmedBookingState0.getName();
        java.lang.String str3 = confirmedBookingState0.getName();
        java.lang.String str4 = confirmedBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation5 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext6 = new com.conferenceroomscheduler.patterns.BookingContext(reservation5);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState7 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext6.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState7);
        com.conferenceroomscheduler.patterns.BookingState bookingState9 = bookingContext6.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState10 = bookingContext6.getState();
        bookingContext6.request();
        confirmedBookingState0.handle(bookingContext6);
        java.lang.String str13 = confirmedBookingState0.getName();
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState14 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        java.lang.String str15 = completedBookingState14.getName();
        java.lang.String str16 = completedBookingState14.getName();
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
        completedBookingState14.handle(bookingContext29);
        java.lang.String str42 = bookingContext29.getStatus();
        bookingContext29.request();
        confirmedBookingState0.handle(bookingContext29);
        java.lang.String str45 = bookingContext29.getStatus();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking confirmed." + "'", str1, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking confirmed." + "'", str2, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking confirmed." + "'", str3, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Booking confirmed." + "'", str4, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking confirmed." + "'", str13, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking complete" + "'", str15, "Booking complete");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking complete" + "'", str16, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertNotNull(bookingState24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Checked in." + "'", str27, "Checked in.");
        org.junit.Assert.assertNull(reservation32);
        org.junit.Assert.assertNotNull(bookingState37);
        org.junit.Assert.assertNull(reservation40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Booking complete" + "'", str42, "Booking complete");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Checked in." + "'", str45, "Checked in.");
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
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
        java.time.LocalDateTime localDateTime18 = bookingRequest7.getStartTime();
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
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        java.lang.String str6 = badgeScan3.getBadgeId();
        badgeScan3.setVerified(false);
        badgeScan3.setBadgeId("student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("", "", "Unverified badge detected for .", "Checked in.", false, false, "Pending");
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        occupancySensor3.occupied = true;
        occupancySensor3.occupied = true;
        boolean boolean10 = occupancySensor3.isDetected();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
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
        staffAccount87.setIdentifier("Unverified badge detected for Cancelled.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cancelled" + "'", str20, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        occupancySensor3.occupied = true;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher8 = occupancySensor3.subject;
        boolean boolean9 = occupancySensor3.isDetected;
        com.conferenceroomscheduler.model.Badge badge13 = new com.conferenceroomscheduler.model.Badge("ADMIN-69", "admin", true);
        boolean boolean14 = occupancySensor3.scanIdBadge(badge13);
        boolean boolean15 = occupancySensor3.isDetected();
        java.lang.String str16 = occupancySensor3.getLastEvent();
        occupancySensor3.setDetected(false);
        org.junit.Assert.assertNull(checkInPublisher8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Verified badge detected for ADMIN-69." + "'", str16, "Verified badge detected for ADMIN-69.");
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.isDetected;
        occupancySensor3.setRoomId("");
        java.lang.String str9 = occupancySensor3.roomId;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher10 = occupancySensor3.subject;
        boolean boolean11 = occupancySensor3.isDetected;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(checkInPublisher10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
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
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand15 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation11);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertNotNull(reservation11);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
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
        java.lang.String str21 = room6.getName();
        com.conferenceroomscheduler.model.StaffAccount staffAccount28 = new com.conferenceroomscheduler.model.StaffAccount("Verified badge detected for Checked in..", "Booking confirmed.", "Pending", false, false, "Verified badge detected for ADMIN-69.");
        // The following exception was thrown during execution in test generation
        try {
            room6.checkIn((com.conferenceroomscheduler.model.Account) staffAccount28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.model.OccupancySensor.setOccupied(boolean)\" because \"this.occupancySensor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cancelled" + "'", str17, "Cancelled");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
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
        reservation1.setDepositAmount((double) 97);
        reservation1.setRoomId("staff");
        java.time.LocalDateTime localDateTime39 = null;
        reservation1.setEndTime(localDateTime39);
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + paymentMethod28 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod28.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertTrue("'" + paymentMethod32 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod32.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
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
        reservation1.setAccountType("student");
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand31 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime29, localDateTime30);
        // The following exception was thrown during execution in test generation
        try {
            editBookingCommand31.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.editBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod24 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod24.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand8 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setHourlyRate((double) 0L);
        boolean boolean11 = reservation1.isExtended();
        java.time.LocalDateTime localDateTime12 = null;
        reservation1.setStartTime(localDateTime12);
        java.time.LocalDateTime localDateTime14 = null;
        reservation1.setEndTime(localDateTime14);
        double double16 = reservation1.getHourlyRate();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("student", true, true);
        boolean boolean4 = occupancySensor3.isDetected();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("staff", "hi!", true);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setRoomId("hi!");
        reservation0.setTitle("Pending");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod47 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation48 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime41, localDateTime42, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod47);
        com.conferenceroomscheduler.model.Reservation reservation49 = new com.conferenceroomscheduler.model.Reservation("", "Pending", "Pending", "Booking complete", localDateTime31, localDateTime32, "Booking confirmed.", (double) 0.0f, (double) 1, (double) (byte) 100, paymentMethod47);
        com.conferenceroomscheduler.model.Reservation reservation50 = new com.conferenceroomscheduler.model.Reservation("Pending", "Booking complete", "Cancelled", "hi!", localDateTime21, localDateTime22, "", (double) '4', (double) 100.0f, (double) ' ', paymentMethod47);
        com.conferenceroomscheduler.model.Reservation reservation51 = new com.conferenceroomscheduler.model.Reservation("faculty", "student", "student", "Cancelled", localDateTime11, localDateTime12, "", (double) 'a', (double) 100L, 32.0d, paymentMethod47);
        reservation0.setPaymentMethod(paymentMethod47);
        reservation0.setReservationId("");
        org.junit.Assert.assertTrue("'" + paymentMethod47 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod47.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setBuilding("hi!");
        int int10 = room6.getCapacity();
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor88 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher89 = null;
        occupancySensor88.setSubject(checkInPublisher89);
        boolean boolean91 = occupancySensor88.isDetected;
        occupancySensor88.setRoomId("");
        java.lang.String str94 = occupancySensor88.roomId;
        checkInPublisher69.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor88);
        room6.setOccupancySensor(occupancySensor88);
        java.lang.String str97 = room6.getRoomNumber();
        boolean boolean98 = room6.isClosedForMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "hi!" + "'", str97, "hi!");
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor0 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor0.update("Checked in.");
        roomSensor0.update("Booking confirmed.");
        roomSensor0.update("Booking complete");
        roomSensor0.update("");
        roomSensor0.update("student");
        roomSensor0.update("Unverified badge detected for Cancelled.");
        roomSensor0.update("hi!");
        roomSensor0.update("admin");
        roomSensor0.update("student");
        roomSensor0.update("Checked in.");
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState0 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext2 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState3 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext2.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState3);
        com.conferenceroomscheduler.patterns.BookingState bookingState5 = bookingContext2.getState();
        com.conferenceroomscheduler.model.Reservation reservation6 = bookingContext2.getReservation();
        cancelledBookingState0.handle(bookingContext2);
        java.lang.String str8 = bookingContext2.getStatus();
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
        bookingContext2.setState((com.conferenceroomscheduler.patterns.BookingState) checkedInBookingState9);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState20 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation21 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext22 = new com.conferenceroomscheduler.patterns.BookingContext(reservation21);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState23 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext22.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState23);
        com.conferenceroomscheduler.patterns.BookingState bookingState25 = bookingContext22.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState26 = bookingContext22.getState();
        cancelledBookingState20.handle(bookingContext22);
        com.conferenceroomscheduler.patterns.BookingState bookingState28 = bookingContext22.getState();
        checkedInBookingState9.handle(bookingContext22);
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService30 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService31 = null;
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod42 = null;
        com.conferenceroomscheduler.model.Reservation reservation43 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime36, localDateTime37, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod42);
        reservation43.setDepositLost(true);
        java.time.LocalDateTime localDateTime46 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand47 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService31, reservation43, localDateTime46);
        reservation43.setHourlyRate((double) (-1.0f));
        reservation43.setRoomId("admin");
        java.lang.String str52 = reservation43.getTitle();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand53 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService30, reservation43);
        java.time.LocalDateTime localDateTime54 = null;
        reservation43.setEndTime(localDateTime54);
        boolean boolean56 = reservation43.isCanceled();
        reservation43.setRoomId("Cancelled");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext59 = new com.conferenceroomscheduler.patterns.BookingContext(reservation43);
        checkedInBookingState9.handle(bookingContext59);
        java.lang.String str61 = checkedInBookingState9.getName();
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNull(reservation6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertNotNull(bookingState26);
        org.junit.Assert.assertNotNull(bookingState28);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Checked in." + "'", str61, "Checked in.");
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
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
        occupancySensor3.roomId = "Booking confirmed.";
        boolean boolean28 = occupancySensor3.isDetected();
        boolean boolean29 = occupancySensor3.isDetected;
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("", "Checked in.", "Unverified badge detected for admin.", false, true, "Verified badge detected for ADMIN-69.");
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
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
        room6.setCapacity((int) (short) 100);
        room6.setBuilding("Booking complete");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy institutionalBillingPaymentStrategy0 = new com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy();
        boolean boolean3 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", 0.0d);
        boolean boolean6 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", (double) (short) 1);
        boolean boolean9 = institutionalBillingPaymentStrategy0.processPayment("Cancelled", 32.0d);
        boolean boolean12 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", (double) (byte) -1);
        boolean boolean15 = institutionalBillingPaymentStrategy0.processPayment("hi!", (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        java.time.LocalDateTime localDateTime1 = null;
        reservation0.setEndTime(localDateTime1);
        reservation0.setHourlyRate((double) 'a');
        boolean boolean5 = reservation0.isCheckedIn();
        reservation0.setHourlyRate(10.0d);
        java.lang.String str8 = reservation0.getReservationId();
        java.lang.String str9 = reservation0.getAccountType();
        reservation0.setExtended(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setFinalAmount((double) ' ');
        java.lang.String str9 = reservation0.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext10 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        bookingContext10.request();
        java.lang.String str12 = bookingContext10.getStatus();
        com.conferenceroomscheduler.model.Reservation reservation13 = bookingContext10.getReservation();
        reservation13.setRoomId("staff");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pending" + "'", str12, "Pending");
        org.junit.Assert.assertNotNull(reservation13);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("faculty", "Unverified badge detected for .", "Cancelled", "hi!", (int) (byte) -1, localDateTime5, localDateTime6);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", true, false);
        occupancySensor3.isDetected = false;
        java.lang.String str6 = occupancySensor3.getLastEvent();
        occupancySensor3.occupied = true;
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("partner", false, true);
        occupancySensor3.setRoomId("Unverified badge detected for admin.");
        boolean boolean6 = occupancySensor3.occupied;
        boolean boolean7 = occupancySensor3.occupied;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "", "hi!", "", (int) '4', localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getTitle();
        int int9 = bookingRequest7.getAttendeeCount();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getStartTime();
        int int11 = bookingRequest7.getAttendeeCount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState1 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str2 = pendingBookingState1.getName();
        com.conferenceroomscheduler.model.Reservation reservation3 = new com.conferenceroomscheduler.model.Reservation();
        reservation3.setFinalAmount((double) (byte) 100);
        reservation3.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext8 = new com.conferenceroomscheduler.patterns.BookingContext(reservation3);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState9 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str10 = cancelledBookingState9.getName();
        bookingContext8.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState9);
        pendingBookingState1.handle(bookingContext8);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState13 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation14 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext15 = new com.conferenceroomscheduler.patterns.BookingContext(reservation14);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState16 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext15.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState16);
        com.conferenceroomscheduler.patterns.BookingState bookingState18 = bookingContext15.getState();
        com.conferenceroomscheduler.model.Reservation reservation19 = bookingContext15.getReservation();
        cancelledBookingState13.handle(bookingContext15);
        java.lang.String str21 = cancelledBookingState13.getName();
        bookingContext8.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState13);
        java.lang.String str23 = bookingContext8.getStatus();
        com.conferenceroomscheduler.model.Reservation reservation24 = bookingContext8.getReservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand25 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation24);
        reservation24.setAccountType("Checked in.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Pending" + "'", str2, "Pending");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cancelled" + "'", str10, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertNull(reservation19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Cancelled" + "'", str23, "Cancelled");
        org.junit.Assert.assertNotNull(reservation24);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        com.conferenceroomscheduler.patterns.StaffFactory staffFactory0 = new com.conferenceroomscheduler.patterns.StaffFactory();
        com.conferenceroomscheduler.model.Account account8 = staffFactory0.createAccount("Cancelled", "Checked in.", "", "Cancelled", true, true, "");
        com.conferenceroomscheduler.model.Account account16 = staffFactory0.createAccount("Booking complete", "Unverified badge detected for .", "Unverified badge detected for .", "Cancelled", false, false, "Unverified badge detected for .");
        account16.setAccountId("Unverified badge detected for admin.");
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
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
        boolean boolean13 = reservation3.isCheckedIn();
        double double14 = reservation3.getFinalAmount();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand15 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService1, reservation3);
        reservation3.setHourlyRate((double) (short) 10);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand20 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation3, localDateTime18, localDateTime19);
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("hi!", "", "hi!", true, false, "hi!");
        adminAccount6.setPassword("hi!");
        boolean boolean9 = adminAccount6.isVerified();
        adminAccount6.setAccountNumber("student");
        java.lang.String str12 = adminAccount6.getEmail();
        adminAccount6.setAccountType("Verified badge detected for Checked in..");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
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
        boolean boolean14 = reservation1.isExtended();
        boolean boolean15 = reservation1.isCanceled();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext16 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        java.lang.String str17 = reservation1.getUserId();
        double double18 = reservation1.getFinalAmount();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand19 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setAccountType("hi!");
        java.lang.String str5 = reservation2.getUserId();
        boolean boolean6 = reservation2.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod7 = reservation2.getPaymentMethod();
        reservation2.setDepositLost(true);
        double double10 = reservation2.getHourlyRate();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand11 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.time.LocalDateTime localDateTime12 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand13 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation2, localDateTime12);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(paymentMethod7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Pending", "Pending", true);
        java.lang.String str4 = badge3.getEmail();
        badge3.setEmail("ADMIN-69");
        boolean boolean7 = badge3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pending" + "'", str4, "Pending");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("faculty", "Pending", "Booking confirmed.", true, true, "ADMIN-69");
        adminAccount6.setPassword("Unverified badge detected for Cancelled.");
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getOrganizerId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.lang.String str11 = bookingRequest7.getTitle();
        java.lang.String str12 = bookingRequest7.getTitle();
        java.lang.String str13 = bookingRequest7.getRequestId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Unverified badge detected for Cancelled.", "student", false);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
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
        java.lang.String str39 = reservation34.getTitle();
        java.lang.String str40 = reservation34.getTitle();
        org.junit.Assert.assertTrue("'" + paymentMethod31 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod31.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Pending" + "'", str39, "Pending");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Pending" + "'", str40, "Pending");
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy institutionalBillingPaymentStrategy0 = new com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy();
        boolean boolean3 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", 0.0d);
        boolean boolean6 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", (double) (short) 1);
        boolean boolean9 = institutionalBillingPaymentStrategy0.processPayment("Pending", (double) (short) -1);
        boolean boolean12 = institutionalBillingPaymentStrategy0.processPayment("Booking confirmed.", 0.0d);
        boolean boolean15 = institutionalBillingPaymentStrategy0.processPayment("Pending", (double) (-1.0f));
        boolean boolean18 = institutionalBillingPaymentStrategy0.processPayment("Verified badge detected for Checked in..", (double) 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
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
        occupancySensor3.setRoomId("ADMIN-69");
        occupancySensor3.occupied = false;
        com.conferenceroomscheduler.model.Account account30 = null;
        boolean boolean31 = occupancySensor3.detectOccupancy(account30);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setName("hi!");
        room6.setName("");
        java.lang.String str11 = room6.getName();
        java.lang.String str12 = room6.getRoomNumber();
        room6.setCapacity(0);
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cancelled" + "'", str12, "Cancelled");
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("Booking complete", "student", "Checked in.", true, false, "Unverified badge detected for Cancelled.");
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "", false);
        java.lang.String str4 = badgeScan3.getRoomId();
        badgeScan3.setRoomId("Booking complete");
        badgeScan3.setRoomId("student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
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
        java.lang.String str19 = cancelledBookingState0.getName();
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState20 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str21 = confirmedBookingState20.getName();
        java.lang.String str22 = confirmedBookingState20.getName();
        java.lang.String str23 = confirmedBookingState20.getName();
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState24 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation25 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext26 = new com.conferenceroomscheduler.patterns.BookingContext(reservation25);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState27 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext26.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState27);
        completedBookingState24.handle(bookingContext26);
        confirmedBookingState20.handle(bookingContext26);
        com.conferenceroomscheduler.model.Reservation reservation31 = new com.conferenceroomscheduler.model.Reservation();
        reservation31.setFinalAmount((double) (byte) 100);
        java.lang.String str34 = reservation31.getRoomId();
        reservation31.setFinalAmount((double) 10.0f);
        java.lang.String str37 = reservation31.getUserId();
        reservation31.setFinalAmount((double) ' ');
        java.lang.String str40 = reservation31.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext41 = new com.conferenceroomscheduler.patterns.BookingContext(reservation31);
        confirmedBookingState20.handle(bookingContext41);
        cancelledBookingState0.handle(bookingContext41);
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState44 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str45 = pendingBookingState44.getName();
        com.conferenceroomscheduler.model.Reservation reservation46 = new com.conferenceroomscheduler.model.Reservation();
        reservation46.setFinalAmount((double) (byte) 100);
        reservation46.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext51 = new com.conferenceroomscheduler.patterns.BookingContext(reservation46);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState52 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str53 = cancelledBookingState52.getName();
        bookingContext51.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState52);
        pendingBookingState44.handle(bookingContext51);
        java.lang.String str56 = bookingContext51.getStatus();
        cancelledBookingState0.handle(bookingContext51);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Cancelled" + "'", str19, "Cancelled");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Booking confirmed." + "'", str21, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Booking confirmed." + "'", str22, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking confirmed." + "'", str23, "Booking confirmed.");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Pending" + "'", str45, "Pending");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Cancelled" + "'", str53, "Cancelled");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Cancelled" + "'", str56, "Cancelled");
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("", "Verified badge detected for ADMIN-69.", "", true, false, "Verified badge detected for ADMIN-69.");
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Pending", "Pending", (int) (short) -1, "", "Cancelled");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = room12.getOccupancySensor();
        boolean boolean14 = room12.isClosedForMaintenance();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(occupancySensor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState0 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        java.lang.String str1 = checkedInBookingState0.getName();
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
        com.conferenceroomscheduler.patterns.BookingState bookingState13 = bookingContext5.getState();
        checkedInBookingState0.handle(bookingContext5);
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
        java.lang.String str37 = completedBookingState15.getName();
        java.lang.String str38 = completedBookingState15.getName();
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState39 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str40 = pendingBookingState39.getName();
        com.conferenceroomscheduler.model.Reservation reservation41 = new com.conferenceroomscheduler.model.Reservation();
        reservation41.setFinalAmount((double) (byte) 100);
        reservation41.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext46 = new com.conferenceroomscheduler.patterns.BookingContext(reservation41);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState47 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str48 = cancelledBookingState47.getName();
        bookingContext46.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState47);
        pendingBookingState39.handle(bookingContext46);
        completedBookingState15.handle(bookingContext46);
        checkedInBookingState0.handle(bookingContext46);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Checked in." + "'", str1, "Checked in.");
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertNull(reservation9);
        org.junit.Assert.assertNotNull(bookingState13);
        org.junit.Assert.assertNotNull(bookingState26);
        org.junit.Assert.assertNotNull(bookingState27);
        org.junit.Assert.assertNotNull(bookingState34);
        org.junit.Assert.assertNull(reservation35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Booking complete" + "'", str37, "Booking complete");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Booking complete" + "'", str38, "Booking complete");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Pending" + "'", str40, "Pending");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Cancelled" + "'", str48, "Cancelled");
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("staff", "hi!", "Pending", true, false, "Verified badge detected for ADMIN-69.");
        java.lang.String str7 = adminAccount6.getAccountId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
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
        reservation1.setDepositLost(true);
        java.lang.Class<?> wildcardClass19 = reservation1.getClass();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getAccountType();
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand6 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation2, localDateTime5);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str1 = adminAccount0.getEmail();
        com.conferenceroomscheduler.model.Badge badge2 = adminAccount0.getBadge();
        com.conferenceroomscheduler.model.Badge badge3 = adminAccount0.getBadge();
        java.lang.String str4 = adminAccount0.getAccountId();
        adminAccount0.setEmail("Pending");
        boolean boolean7 = adminAccount0.isUniversityAccount();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(badge2);
        org.junit.Assert.assertNull(badge3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) 10);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("Cancelled", 1.0d);
        boolean boolean9 = creditCardPaymentStrategy0.processPayment("Cancelled", (double) 100);
        boolean boolean12 = creditCardPaymentStrategy0.processPayment("", (double) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        room6.setBuilding("Booking complete");
        room6.setClosedForMaintenance(true);
        java.lang.String str23 = room6.getBuilding();
        room6.setCapacity(100);
        java.lang.String str26 = room6.getBuilding();
        room6.setEnabled(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking complete" + "'", str23, "Booking complete");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Booking complete" + "'", str26, "Booking complete");
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        com.conferenceroomscheduler.model.AdminAccount adminAccount11 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount11.setAccountNumber("hi!");
        java.lang.String str14 = adminAccount11.getAccountId();
        room6.checkIn((com.conferenceroomscheduler.model.Account) adminAccount11);
        room6.setRoomId("");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher18 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor22 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean23 = occupancySensor22.isDetected();
        occupancySensor22.occupied = false;
        checkInPublisher18.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor22);
        occupancySensor22.setOccupied(true);
        occupancySensor22.occupied = false;
        occupancySensor22.setRoomId("Booking confirmed.");
        java.lang.String str33 = occupancySensor22.getLastEvent();
        room6.setOccupancySensor(occupancySensor22);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
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
        java.time.LocalDateTime localDateTime13 = reservation9.getStartTime();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cancelled" + "'", str7, "Cancelled");
        org.junit.Assert.assertNotNull(reservation9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        boolean boolean19 = room6.isEnabled();
        room6.setBuilding("Pending");
        boolean boolean22 = room6.isClosedForMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
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
        java.lang.String str25 = confirmedBookingState0.getName();
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState26 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation27 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext28 = new com.conferenceroomscheduler.patterns.BookingContext(reservation27);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState29 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext28.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState29);
        completedBookingState26.handle(bookingContext28);
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState32 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        java.lang.String str33 = completedBookingState32.getName();
        java.lang.String str34 = completedBookingState32.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState35 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState36 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation37 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext38 = new com.conferenceroomscheduler.patterns.BookingContext(reservation37);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState39 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext38.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState39);
        com.conferenceroomscheduler.patterns.BookingState bookingState41 = bookingContext38.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState42 = bookingContext38.getState();
        cancelledBookingState36.handle(bookingContext38);
        checkedInBookingState35.handle(bookingContext38);
        java.lang.String str45 = checkedInBookingState35.getName();
        com.conferenceroomscheduler.model.Reservation reservation46 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext47 = new com.conferenceroomscheduler.patterns.BookingContext(reservation46);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState48 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext47.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState48);
        com.conferenceroomscheduler.model.Reservation reservation50 = bookingContext47.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation51 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext52 = new com.conferenceroomscheduler.patterns.BookingContext(reservation51);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState53 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext52.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState53);
        com.conferenceroomscheduler.patterns.BookingState bookingState55 = bookingContext52.getState();
        bookingContext47.setState(bookingState55);
        checkedInBookingState35.handle(bookingContext47);
        com.conferenceroomscheduler.model.Reservation reservation58 = bookingContext47.getReservation();
        completedBookingState32.handle(bookingContext47);
        java.lang.String str60 = completedBookingState32.getName();
        bookingContext28.setState((com.conferenceroomscheduler.patterns.BookingState) completedBookingState32);
        com.conferenceroomscheduler.model.Reservation reservation62 = bookingContext28.getReservation();
        confirmedBookingState0.handle(bookingContext28);
        java.lang.String str64 = confirmedBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking confirmed." + "'", str1, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking confirmed." + "'", str2, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking confirmed." + "'", str3, "Booking confirmed.");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking confirmed." + "'", str23, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Booking confirmed." + "'", str24, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Booking confirmed." + "'", str25, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Booking complete" + "'", str33, "Booking complete");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Booking complete" + "'", str34, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState41);
        org.junit.Assert.assertNotNull(bookingState42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Checked in." + "'", str45, "Checked in.");
        org.junit.Assert.assertNull(reservation50);
        org.junit.Assert.assertNotNull(bookingState55);
        org.junit.Assert.assertNull(reservation58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Booking complete" + "'", str60, "Booking complete");
        org.junit.Assert.assertNull(reservation62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Booking confirmed." + "'", str64, "Booking confirmed.");
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        room6.setBuilding("Booking complete");
        room6.setClosedForMaintenance(true);
        room6.setRoomNumber("Booking confirmed.");
        boolean boolean25 = room6.isClosedForMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setName("hi!");
        room6.setName("");
        room6.setRoomId("admin");
        java.lang.String str13 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor17 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean18 = occupancySensor17.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher19 = null;
        occupancySensor17.subject = checkInPublisher19;
        occupancySensor17.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher23 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor27 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher28 = null;
        occupancySensor27.setSubject(checkInPublisher28);
        occupancySensor27.occupied = true;
        occupancySensor27.setDetected(false);
        checkInPublisher23.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor27);
        occupancySensor17.setSubject(checkInPublisher23);
        boolean boolean36 = occupancySensor17.occupied;
        com.conferenceroomscheduler.model.AdminAccount adminAccount37 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str38 = adminAccount37.getEmail();
        boolean boolean39 = occupancySensor17.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount37);
        boolean boolean40 = occupancySensor17.occupied;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher41 = occupancySensor17.subject;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor45 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher46 = null;
        occupancySensor45.setSubject(checkInPublisher46);
        occupancySensor45.occupied = true;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher50 = occupancySensor45.subject;
        boolean boolean51 = occupancySensor45.isDetected;
        checkInPublisher41.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor45);
        com.conferenceroomscheduler.model.Room room59 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str60 = room59.getRoomId();
        room59.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount69 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room59.checkIn((com.conferenceroomscheduler.model.Account) studentAccount69);
        checkInPublisher41.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount69);
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount69);
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(checkInPublisher41);
        org.junit.Assert.assertNull(checkInPublisher50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("Unverified badge detected for .", "Booking confirmed.", "Verified badge detected for Checked in..", true, false, "Unverified badge detected for .");
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("Cancelled", "Cancelled", "Booking confirmed.", "hi!", false, false, "");
        account7.setEmail("faculty");
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("Checked in.", "Verified badge detected for ADMIN-69.", "Checked in.", true, true, "Verified badge detected for ADMIN-69.");
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        occupancySensor3.occupied = true;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher8 = occupancySensor3.subject;
        boolean boolean9 = occupancySensor3.isDetected;
        boolean boolean10 = occupancySensor3.isOccupied();
        org.junit.Assert.assertNull(checkInPublisher8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState0 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        java.lang.String str1 = checkedInBookingState0.getName();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState2 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation3 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext4 = new com.conferenceroomscheduler.patterns.BookingContext(reservation3);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState5 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext4.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState5);
        com.conferenceroomscheduler.patterns.BookingState bookingState7 = bookingContext4.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState8 = bookingContext4.getState();
        cancelledBookingState2.handle(bookingContext4);
        java.lang.String str10 = bookingContext4.getStatus();
        checkedInBookingState0.handle(bookingContext4);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState12 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
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
        cancelledBookingState12.handle(bookingContext28);
        com.conferenceroomscheduler.patterns.BookingState bookingState31 = null;
        bookingContext28.setState(bookingState31);
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState33 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation34 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext35 = new com.conferenceroomscheduler.patterns.BookingContext(reservation34);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState36 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext35.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState36);
        completedBookingState33.handle(bookingContext35);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState39 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation40 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext41 = new com.conferenceroomscheduler.patterns.BookingContext(reservation40);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState42 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext41.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState42);
        com.conferenceroomscheduler.patterns.BookingState bookingState44 = bookingContext41.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState45 = bookingContext41.getState();
        cancelledBookingState39.handle(bookingContext41);
        completedBookingState33.handle(bookingContext41);
        com.conferenceroomscheduler.model.Reservation reservation48 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext49 = new com.conferenceroomscheduler.patterns.BookingContext(reservation48);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState50 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext49.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState50);
        com.conferenceroomscheduler.patterns.BookingState bookingState52 = bookingContext49.getState();
        com.conferenceroomscheduler.model.Reservation reservation53 = bookingContext49.getReservation();
        completedBookingState33.handle(bookingContext49);
        bookingContext28.setState((com.conferenceroomscheduler.patterns.BookingState) completedBookingState33);
        bookingContext28.request();
        checkedInBookingState0.handle(bookingContext28);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Checked in." + "'", str1, "Checked in.");
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cancelled" + "'", str10, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState19);
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertNotNull(bookingState44);
        org.junit.Assert.assertNotNull(bookingState45);
        org.junit.Assert.assertNotNull(bookingState52);
        org.junit.Assert.assertNull(reservation53);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        double double7 = reservation0.getFinalAmount();
        java.time.LocalDateTime localDateTime8 = reservation0.getEndTime();
        java.time.LocalDateTime localDateTime9 = reservation0.getStartTime();
        java.lang.String str10 = reservation0.getUserId();
        double double11 = reservation0.getHourlyRate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("staff", "Cancelled", "staff", "student", true, false, "Verified badge detected for ADMIN-69.");
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
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
        boolean boolean23 = room6.isClosedForMaintenance();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor24 = room6.getOccupancySensor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(occupancySensor24);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Verified badge detected for ADMIN-69.", "Unverified badge detected for Cancelled.", (int) ' ', false, "ADMIN-69", "partner");
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        boolean boolean9 = reservation0.isExtended();
        java.lang.String str10 = reservation0.getUserId();
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
        reservation0.setPaymentMethod(paymentMethod64);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext71 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(paymentMethod15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(paymentMethod38);
        org.junit.Assert.assertTrue("'" + paymentMethod64 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod64.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
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
        com.conferenceroomscheduler.model.AdminAccount adminAccount32 = new com.conferenceroomscheduler.model.AdminAccount();
        boolean boolean33 = adminAccount32.isVerified();
        adminAccount32.setUniversityAccount(false);
        boolean boolean36 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount32);
        adminAccount32.setUniversityAccount(false);
        boolean boolean39 = adminAccount32.isVerified();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(checkInPublisher27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Pending", "Pending", (int) (short) -1, "", "Cancelled");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("Cancelled", "ADMIN-69", (-1), "faculty", "Pending");
        room18.setCapacity(10);
        java.lang.String str21 = room18.getBuilding();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor22 = room18.getOccupancySensor();
        boolean boolean23 = occupancySensor22.isDetected;
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "faculty" + "'", str21, "faculty");
        org.junit.Assert.assertNotNull(occupancySensor22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor3.isDetected = false;
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount12 = new com.conferenceroomscheduler.model.PartnerAccount("hi!", "student", "admin", false, false, "Cancelled");
        java.lang.String str13 = partnerAccount12.getAccountId();
        boolean boolean14 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) partnerAccount12);
        boolean boolean15 = occupancySensor3.occupied;
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("student", "Pending", "", false, true, "admin");
        adminAccount6.setAccountType("Checked in.");
        adminAccount6.setAccountType("Unverified badge detected for .");
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Verified badge detected for Checked in..", "faculty", (int) (short) 10, false, "Unverified badge detected for Cancelled.", "Unverified badge detected for .");
        java.lang.String str7 = room6.getRoomNumber();
        boolean boolean8 = room6.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Unverified badge detected for ." + "'", str7, "Unverified badge detected for .");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Cancelled", "hi!", "hi!", "", (int) (short) 1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getTitle();
        java.lang.String str9 = bookingRequest7.getRoomId();
        int int10 = bookingRequest7.getAttendeeCount();
        int int11 = bookingRequest7.getAttendeeCount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setName("faculty");
        java.lang.String str13 = room6.getBuilding();
        room6.setCapacity((int) (byte) 10);
        room6.setClosedForMaintenance(false);
        room6.setRoomId("admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
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
        reservation1.setRoomId("Unverified badge detected for admin.");
        java.time.LocalDateTime localDateTime17 = reservation1.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("faculty", "Unverified badge detected for Cancelled.", "Booking complete", "Booking complete", (int) (byte) 100, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRoomId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Unverified badge detected for Cancelled." + "'", str8, "Unverified badge detected for Cancelled.");
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
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
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher30 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor34 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean35 = occupancySensor34.isDetected();
        occupancySensor34.occupied = false;
        checkInPublisher30.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor34);
        boolean boolean39 = occupancySensor34.isDetected;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher40 = occupancySensor34.subject;
        occupancySensor34.roomId = "hi!";
        java.lang.String str43 = occupancySensor34.getRoomId();
        occupancySensor34.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor34);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(checkInPublisher40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("admin", "Booking complete", "faculty", false, true, "Checked in.");
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
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
        com.conferenceroomscheduler.model.Reservation reservation27 = new com.conferenceroomscheduler.model.Reservation();
        reservation27.setFinalAmount((double) (byte) 100);
        java.lang.String str30 = reservation27.getRoomId();
        reservation27.setFinalAmount((double) 10.0f);
        java.lang.String str33 = reservation27.getUserId();
        double double34 = reservation27.getFinalAmount();
        reservation27.setReservationId("Pending");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext37 = new com.conferenceroomscheduler.patterns.BookingContext(reservation27);
        pendingBookingState0.handle(bookingContext37);
        java.lang.String str39 = pendingBookingState0.getName();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState40 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
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
        com.conferenceroomscheduler.model.Reservation reservation51 = new com.conferenceroomscheduler.model.Reservation();
        reservation51.setFinalAmount((double) (byte) 100);
        reservation51.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext56 = new com.conferenceroomscheduler.patterns.BookingContext(reservation51);
        checkedInBookingState41.handle(bookingContext56);
        cancelledBookingState40.handle(bookingContext56);
        com.conferenceroomscheduler.patterns.BookingState bookingState59 = null;
        bookingContext56.setState(bookingState59);
        com.conferenceroomscheduler.model.Reservation reservation61 = bookingContext56.getReservation();
        pendingBookingState0.handle(bookingContext56);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pending" + "'", str1, "Pending");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pending" + "'", str12, "Pending");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pending" + "'", str13, "Pending");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Pending" + "'", str39, "Pending");
        org.junit.Assert.assertNotNull(bookingState47);
        org.junit.Assert.assertNotNull(bookingState48);
        org.junit.Assert.assertNotNull(reservation61);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState1 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str2 = pendingBookingState1.getName();
        com.conferenceroomscheduler.model.Reservation reservation3 = new com.conferenceroomscheduler.model.Reservation();
        reservation3.setFinalAmount((double) (byte) 100);
        reservation3.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext8 = new com.conferenceroomscheduler.patterns.BookingContext(reservation3);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState9 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str10 = cancelledBookingState9.getName();
        bookingContext8.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState9);
        pendingBookingState1.handle(bookingContext8);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState13 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation14 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext15 = new com.conferenceroomscheduler.patterns.BookingContext(reservation14);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState16 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext15.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState16);
        com.conferenceroomscheduler.patterns.BookingState bookingState18 = bookingContext15.getState();
        com.conferenceroomscheduler.model.Reservation reservation19 = bookingContext15.getReservation();
        cancelledBookingState13.handle(bookingContext15);
        java.lang.String str21 = cancelledBookingState13.getName();
        bookingContext8.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState13);
        java.lang.String str23 = bookingContext8.getStatus();
        com.conferenceroomscheduler.model.Reservation reservation24 = bookingContext8.getReservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand25 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation24);
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand25.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Pending" + "'", str2, "Pending");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cancelled" + "'", str10, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertNull(reservation19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Cancelled" + "'", str23, "Cancelled");
        org.junit.Assert.assertNotNull(reservation24);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand2 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        // The following exception was thrown during execution in test generation
        try {
            createBookingCommand2.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.addReservation(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("faculty", "ADMIN-69", true);
        java.lang.String str4 = badge3.getAccountId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ADMIN-69" + "'", str4, "ADMIN-69");
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor3.isDetected = false;
        java.lang.String str6 = occupancySensor3.getRoomId();
        java.lang.String str7 = occupancySensor3.getLastEvent();
        occupancySensor3.occupied = true;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pending" + "'", str6, "Pending");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        java.lang.String str4 = reservation1.getAccountType();
        java.time.LocalDateTime localDateTime5 = reservation1.getEndTime();
        java.lang.String str6 = reservation1.getTitle();
        boolean boolean7 = reservation1.isExtended();
        java.lang.String str8 = reservation1.getTitle();
        double double9 = reservation1.getDepositAmount();
        java.time.LocalDateTime localDateTime10 = reservation1.getEndTime();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("student", false, false);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Unverified badge detected for admin.", "", false);
        badgeScan3.setVerified(true);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) '4');
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("Cancelled", 1.0d);
        boolean boolean9 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) (-1.0f));
        boolean boolean12 = debitCardPaymentStrategy0.processPayment("faculty", (double) (-1L));
        boolean boolean15 = debitCardPaymentStrategy0.processPayment("Booking complete", (double) 1L);
        boolean boolean18 = debitCardPaymentStrategy0.processPayment("", (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getOrganizerId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.lang.String str11 = bookingRequest7.getTitle();
        int int12 = bookingRequest7.getAttendeeCount();
        java.time.LocalDateTime localDateTime13 = bookingRequest7.getStartTime();
        java.lang.String str14 = bookingRequest7.getRequestId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
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
        reservation1.setAccountType("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("faculty", "ADMIN-69", "Checked in.", false, true, "Booking complete");
        facultyAccount6.setAccountNumber("Unverified badge detected for Cancelled.");
        java.lang.String str9 = facultyAccount6.getAccountId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getRoomId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.lang.String str11 = bookingRequest7.getTitle();
        java.lang.String str12 = bookingRequest7.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        reservation0.setTitle("Booking confirmed.");
        java.lang.String str8 = reservation0.getUserId();
        double double9 = reservation0.getFinalAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
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
        reservation44.setReservationId("Booking complete");
        org.junit.Assert.assertNull(paymentMethod14);
        org.junit.Assert.assertTrue("'" + paymentMethod40 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod40.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
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
        occupancySensor3.occupied = false;
        java.lang.String str47 = occupancySensor3.roomId;
        com.conferenceroomscheduler.model.Badge badge51 = new com.conferenceroomscheduler.model.Badge("partner", "partner", true);
        badge51.setEmail("admin");
        boolean boolean54 = occupancySensor3.scanIdBadge(badge51);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Pending" + "'", str47, "Pending");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Booking complete", "faculty", "Checked in.", false, false, "Pending");
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
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
        double double22 = reservation12.getFinalAmount();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        room6.setCapacity((int) '4');
        room6.setName("Cancelled");
        room6.setBuilding("admin");
        java.lang.String str17 = room6.getBuilding();
        room6.setRoomNumber("Checked in.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.model.Reservation reservation10 = new com.conferenceroomscheduler.model.Reservation();
        reservation10.setHourlyRate((double) (byte) 100);
        boolean boolean13 = reservation10.isDepositLost();
        java.time.LocalDateTime localDateTime14 = null;
        reservation10.setEndTime(localDateTime14);
        reservation10.setRoomId("");
        reservation10.setReservationId("student");
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod50 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation51 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime44, localDateTime45, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod50);
        com.conferenceroomscheduler.model.Reservation reservation52 = new com.conferenceroomscheduler.model.Reservation("", "Pending", "Pending", "Booking complete", localDateTime34, localDateTime35, "Booking confirmed.", (double) 0.0f, (double) 1, (double) (byte) 100, paymentMethod50);
        com.conferenceroomscheduler.model.Reservation reservation53 = new com.conferenceroomscheduler.model.Reservation("Pending", "Booking complete", "Cancelled", "hi!", localDateTime24, localDateTime25, "", (double) '4', (double) 100.0f, (double) ' ', paymentMethod50);
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime59 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod64 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation65 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "hi!", "Booking complete", "Checked in.", localDateTime58, localDateTime59, "hi!", (double) 97, (double) 100L, (double) (byte) 100, paymentMethod64);
        reservation53.setPaymentMethod(paymentMethod64);
        reservation10.setPaymentMethod(paymentMethod64);
        com.conferenceroomscheduler.model.Reservation reservation68 = new com.conferenceroomscheduler.model.Reservation("admin", "Cancelled", "Checked in.", "ADMIN-69", localDateTime4, localDateTime5, "Cancelled", (double) 100.0f, (double) 100L, (double) 35, paymentMethod64);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + paymentMethod50 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod50.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertTrue("'" + paymentMethod64 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod64.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setAccountType("hi!");
        java.lang.String str5 = reservation2.getUserId();
        boolean boolean6 = reservation2.isDepositLost();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand7 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService1, reservation2);
        reservation2.setDepositLost(false);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand12 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation2, localDateTime10, localDateTime11);
        reservation2.setFinalAmount((double) 'a');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        java.lang.String str8 = room6.getBuilding();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor12 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher13 = null;
        occupancySensor12.setSubject(checkInPublisher13);
        boolean boolean15 = occupancySensor12.isDetected;
        occupancySensor12.roomId = "Booking confirmed.";
        room6.setOccupancySensor(occupancySensor12);
        java.lang.String str19 = room6.getName();
        boolean boolean20 = room6.isEnabled();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor21 = room6.getOccupancySensor();
        boolean boolean22 = room6.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Cancelled" + "'", str19, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(occupancySensor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
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
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState13 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str14 = cancelledBookingState13.getName();
        com.conferenceroomscheduler.model.Reservation reservation15 = new com.conferenceroomscheduler.model.Reservation();
        reservation15.setFinalAmount((double) (byte) 100);
        reservation15.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext20 = new com.conferenceroomscheduler.patterns.BookingContext(reservation15);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState21 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str22 = cancelledBookingState21.getName();
        bookingContext20.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState21);
        bookingContext20.request();
        cancelledBookingState13.handle(bookingContext20);
        com.conferenceroomscheduler.model.Reservation reservation26 = bookingContext20.getReservation();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState27 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState28 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation29 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext30 = new com.conferenceroomscheduler.patterns.BookingContext(reservation29);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState31 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext30.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState31);
        com.conferenceroomscheduler.patterns.BookingState bookingState33 = bookingContext30.getState();
        com.conferenceroomscheduler.model.Reservation reservation34 = bookingContext30.getReservation();
        cancelledBookingState28.handle(bookingContext30);
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState36 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str37 = confirmedBookingState36.getName();
        java.lang.String str38 = confirmedBookingState36.getName();
        com.conferenceroomscheduler.model.Reservation reservation39 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext40 = new com.conferenceroomscheduler.patterns.BookingContext(reservation39);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState41 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext40.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState41);
        com.conferenceroomscheduler.model.Reservation reservation43 = bookingContext40.getReservation();
        confirmedBookingState36.handle(bookingContext40);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState45 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState46 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation47 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext48 = new com.conferenceroomscheduler.patterns.BookingContext(reservation47);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState49 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext48.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState49);
        com.conferenceroomscheduler.patterns.BookingState bookingState51 = bookingContext48.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState52 = bookingContext48.getState();
        cancelledBookingState46.handle(bookingContext48);
        checkedInBookingState45.handle(bookingContext48);
        java.lang.String str55 = checkedInBookingState45.getName();
        com.conferenceroomscheduler.model.Reservation reservation56 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext57 = new com.conferenceroomscheduler.patterns.BookingContext(reservation56);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState58 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext57.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState58);
        com.conferenceroomscheduler.model.Reservation reservation60 = bookingContext57.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation61 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext62 = new com.conferenceroomscheduler.patterns.BookingContext(reservation61);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState63 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext62.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState63);
        com.conferenceroomscheduler.patterns.BookingState bookingState65 = bookingContext62.getState();
        bookingContext57.setState(bookingState65);
        checkedInBookingState45.handle(bookingContext57);
        com.conferenceroomscheduler.model.Reservation reservation68 = bookingContext57.getReservation();
        java.lang.String str69 = bookingContext57.getStatus();
        java.lang.String str70 = bookingContext57.getStatus();
        confirmedBookingState36.handle(bookingContext57);
        cancelledBookingState28.handle(bookingContext57);
        checkedInBookingState27.handle(bookingContext57);
        bookingContext20.setState((com.conferenceroomscheduler.patterns.BookingState) checkedInBookingState27);
        pendingBookingState0.handle(bookingContext20);
        java.lang.String str76 = pendingBookingState0.getName();
        java.lang.String str77 = pendingBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pending" + "'", str11, "Pending");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pending" + "'", str12, "Pending");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cancelled" + "'", str14, "Cancelled");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cancelled" + "'", str22, "Cancelled");
        org.junit.Assert.assertNotNull(reservation26);
        org.junit.Assert.assertNotNull(bookingState33);
        org.junit.Assert.assertNull(reservation34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Booking confirmed." + "'", str37, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Booking confirmed." + "'", str38, "Booking confirmed.");
        org.junit.Assert.assertNull(reservation43);
        org.junit.Assert.assertNotNull(bookingState51);
        org.junit.Assert.assertNotNull(bookingState52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Checked in." + "'", str55, "Checked in.");
        org.junit.Assert.assertNull(reservation60);
        org.junit.Assert.assertNotNull(bookingState65);
        org.junit.Assert.assertNull(reservation68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Booking complete" + "'", str69, "Booking complete");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Booking complete" + "'", str70, "Booking complete");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Pending" + "'", str76, "Pending");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Pending" + "'", str77, "Pending");
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand7 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str8 = reservation1.getReservationId();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Unverified badge detected for .", "admin", (int) ' ', false, "ADMIN-69", "admin");
        java.lang.String str7 = room6.getBuilding();
        java.lang.String str8 = room6.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ADMIN-69" + "'", str7, "ADMIN-69");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Booking confirmed.", "student", "Cancelled", "partner", (int) (byte) -1, localDateTime5, localDateTime6);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
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
        badge20.setAccountId("Pending");
        badge20.setAccountId("ADMIN-69");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking confirmed." + "'", str23, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Cancelled" + "'", str26, "Cancelled");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Cancelled" + "'", str27, "Cancelled");
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Pending", "Checked in.", "", true, false, "Booking complete");
        studentAccount6.setVerified(false);
        boolean boolean9 = studentAccount6.isVerified();
        boolean boolean10 = studentAccount6.isUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "", "Booking complete", "Checked in.", (int) (byte) 1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getTitle();
        int int9 = bookingRequest7.getAttendeeCount();
        java.lang.String str10 = bookingRequest7.getRequestId();
        java.time.LocalDateTime localDateTime11 = bookingRequest7.getStartTime();
        java.time.LocalDateTime localDateTime12 = bookingRequest7.getEndTime();
        java.lang.String str13 = bookingRequest7.getTitle();
        java.lang.String str14 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Checked in." + "'", str8, "Checked in.");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Checked in." + "'", str13, "Checked in.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking complete" + "'", str14, "Booking complete");
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "", "Booking complete", "Checked in.", (int) (byte) 1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getTitle();
        java.lang.String str9 = bookingRequest7.getRequestId();
        java.lang.String str10 = bookingRequest7.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Checked in." + "'", str8, "Checked in.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Checked in." + "'", str10, "Checked in.");
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        com.conferenceroomscheduler.patterns.StudentFactory studentFactory0 = new com.conferenceroomscheduler.patterns.StudentFactory();
        com.conferenceroomscheduler.model.Account account8 = studentFactory0.createAccount("", "hi!", "", "", true, true, "hi!");
        com.conferenceroomscheduler.model.Account account16 = studentFactory0.createAccount("partner", "Booking confirmed.", "student", "Cancelled", false, true, "Cancelled");
        boolean boolean17 = account16.isVerified();
        account16.setIdentifier("hi!");
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.isDetected;
        java.lang.String str7 = occupancySensor3.getLastEvent();
        com.conferenceroomscheduler.model.StudentAccount studentAccount14 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        com.conferenceroomscheduler.model.Badge badge15 = studentAccount14.getBadge();
        badge15.setEmail("Checked in.");
        boolean boolean18 = occupancySensor3.scanIdBadge(badge15);
        boolean boolean19 = badge15.isVerified();
        badge15.setEmail("Verified badge detected for ADMIN-69.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(badge15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setRoomId("hi!");
        java.time.LocalDateTime localDateTime5 = null;
        reservation0.setStartTime(localDateTime5);
        reservation0.setTitle("Unverified badge detected for .");
        reservation0.setHourlyRate((double) 100);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Cancelled", "hi!", "hi!", "", (int) (short) 1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRoomId();
        java.lang.String str9 = bookingRequest7.getRequestId();
        java.lang.String str10 = bookingRequest7.getRoomId();
        java.lang.String str11 = bookingRequest7.getRoomId();
        java.lang.String str12 = bookingRequest7.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.isDetected;
        occupancySensor3.setRoomId("");
        occupancySensor3.setRoomId("Pending");
        java.lang.String str11 = occupancySensor3.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pending" + "'", str11, "Pending");
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = occupancySensor3.getSubject();
        com.conferenceroomscheduler.model.AdminAccount adminAccount19 = new com.conferenceroomscheduler.model.AdminAccount("", "Booking confirmed.", "", false, false, "");
        adminAccount19.setAccountId("");
        boolean boolean22 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount19);
        boolean boolean23 = adminAccount19.isVerified();
        adminAccount19.setEmail("Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(checkInPublisher12);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
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
        com.conferenceroomscheduler.model.AdminAccount adminAccount38 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str39 = adminAccount38.getEmail();
        com.conferenceroomscheduler.model.Badge badge40 = adminAccount38.getBadge();
        checkInPublisher16.notifyObservers((com.conferenceroomscheduler.model.Account) adminAccount38);
        boolean boolean42 = adminAccount38.isUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(badge40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
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
        java.lang.String str41 = reservation36.getTitle();
        reservation36.setTitle("student");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod33 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod33.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Booking complete" + "'", str41, "Booking complete");
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount0 = new com.conferenceroomscheduler.model.PartnerAccount();
        partnerAccount0.setVerified(false);
        com.conferenceroomscheduler.model.Badge badge3 = partnerAccount0.getBadge();
        partnerAccount0.setEmail("");
        java.lang.String str6 = partnerAccount0.getEmail();
        org.junit.Assert.assertNull(badge3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
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
        java.time.LocalDateTime localDateTime13 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand14 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation11, localDateTime13);
        boolean boolean15 = extendBookingCommand14.wasSuccessful();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertNotNull(reservation11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        room6.setClosedForMaintenance(false);
        boolean boolean14 = room6.isEnabled();
        room6.setEnabled(false);
        room6.setCapacity(100);
        room6.setBuilding("faculty");
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
        boolean boolean47 = occupancySensor28.occupied;
        com.conferenceroomscheduler.model.AdminAccount adminAccount48 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str49 = adminAccount48.getEmail();
        boolean boolean50 = occupancySensor28.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount48);
        boolean boolean51 = occupancySensor24.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount48);
        adminAccount48.setPassword("ADMIN-69");
        adminAccount48.setAccountType("Checked in.");
        java.lang.String str56 = adminAccount48.getAccountNumber();
        boolean boolean57 = adminAccount48.isVerified();
        // The following exception was thrown during execution in test generation
        try {
            room6.checkIn((com.conferenceroomscheduler.model.Account) adminAccount48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.model.OccupancySensor.setOccupied(boolean)\" because \"this.occupancySensor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setDepositAmount(0.0d);
        java.lang.String str6 = reservation0.getReservationId();
        java.time.LocalDateTime localDateTime7 = reservation0.getStartTime();
        double double8 = reservation0.getDepositAmount();
        java.lang.String str9 = reservation0.getReservationId();
        java.lang.String str10 = reservation0.getTitle();
        reservation0.setCheckedIn(true);
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        java.lang.String str6 = badgeScan3.getBadgeId();
        java.lang.String str7 = badgeScan3.getRoomId();
        boolean boolean8 = badgeScan3.isVerified();
        badgeScan3.setBadgeId("student");
        badgeScan3.setRoomId("");
        java.lang.String str13 = badgeScan3.getRoomId();
        boolean boolean14 = badgeScan3.isVerified();
        java.lang.String str15 = badgeScan3.getBadgeId();
        badgeScan3.setRoomId("Unverified badge detected for Cancelled.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Pending", "Cancelled", (int) (byte) 10, "Checked in.", "Cancelled");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("", "student", (int) '4', "student", "Cancelled");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("hi!", "faculty", (int) (short) 1, "student", "student");
        room24.setEnabled(true);
        room24.setEnabled(true);
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
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
        com.conferenceroomscheduler.model.Reservation reservation50 = bookingContext46.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation51 = bookingContext46.getReservation();
        bookingContext46.request();
        confirmedBookingState11.handle(bookingContext46);
        java.lang.String str54 = confirmedBookingState11.getName();
        java.lang.String str55 = confirmedBookingState11.getName();
        java.lang.String str56 = confirmedBookingState11.getName();
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
        org.junit.Assert.assertNotNull(reservation50);
        org.junit.Assert.assertNotNull(reservation51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Booking confirmed." + "'", str54, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Booking confirmed." + "'", str55, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Booking confirmed." + "'", str56, "Booking confirmed.");
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("admin", "staff", "", false, true, "Verified badge detected for ADMIN-69.");
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        com.conferenceroomscheduler.patterns.PartnerFactory partnerFactory0 = new com.conferenceroomscheduler.patterns.PartnerFactory();
        com.conferenceroomscheduler.model.Account account8 = partnerFactory0.createAccount("Checked in.", "hi!", "admin", "", true, false, "Pending");
        com.conferenceroomscheduler.model.Account account16 = partnerFactory0.createAccount("Booking complete", "hi!", "hi!", "", true, false, "Checked in.");
        com.conferenceroomscheduler.model.Account account24 = partnerFactory0.createAccount("Booking complete", "ADMIN-69", "Pending", "Checked in.", true, true, "");
        com.conferenceroomscheduler.model.Account account32 = partnerFactory0.createAccount("partner", "faculty", "student", "ADMIN-69", false, false, "Booking complete");
        account32.setAccountType("Booking confirmed.");
        account32.setVerified(false);
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
        org.junit.Assert.assertNotNull(account32);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("", "Cancelled", false);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        java.lang.String str4 = reservation1.getAccountType();
        boolean boolean5 = reservation1.isCheckedIn();
        java.time.LocalDateTime localDateTime6 = reservation1.getStartTime();
        java.lang.String str7 = reservation1.getAccountType();
        reservation1.setCanceled(true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
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
        occupancySensor3.occupied = true;
        com.conferenceroomscheduler.model.Badge badge94 = new com.conferenceroomscheduler.model.Badge("Pending", "Pending", true);
        java.lang.String str95 = badge94.getEmail();
        boolean boolean96 = occupancySensor3.scanIdBadge(badge94);
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
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "Pending" + "'", str95, "Pending");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Booking confirmed.", "", (int) (short) 100, true, "Checked in.", "Verified badge detected for Checked in..");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor7 = room6.getOccupancySensor();
        org.junit.Assert.assertNotNull(occupancySensor7);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        boolean boolean4 = reservation1.isCheckedIn();
        reservation1.setDepositLost(true);
        reservation1.setTitle("Booking confirmed.");
        boolean boolean9 = reservation1.isCheckedIn();
        double double10 = reservation1.getDepositAmount();
        double double11 = reservation1.getDepositAmount();
        java.lang.String str12 = reservation1.getReservationId();
        reservation1.setUserId("staff");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("Unverified badge detected for admin.", "hi!", "faculty", true, true, "Verified badge detected for Checked in..");
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
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
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand33 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime31, localDateTime32);
        boolean boolean34 = editBookingCommand33.wasSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            editBookingCommand33.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.editBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod24 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod24.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        reservation0.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext12 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        reservation0.setAccountType("Pending");
        reservation0.setRoomId("ADMIN-69");
        reservation0.setTitle("Unverified badge detected for .");
        reservation0.setHourlyRate(100.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
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
        com.conferenceroomscheduler.patterns.BookingState bookingState56 = bookingContext12.getState();
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
        org.junit.Assert.assertNotNull(bookingState56);
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        reservation0.setCanceled(false);
        java.time.LocalDateTime localDateTime8 = null;
        reservation0.setStartTime(localDateTime8);
        reservation0.setReservationId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext12 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        reservation0.setUserId("Booking complete");
        java.time.LocalDateTime localDateTime15 = null;
        reservation0.setEndTime(localDateTime15);
        java.time.LocalDateTime localDateTime17 = reservation0.getStartTime();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Booking complete", "Booking confirmed.", (int) '4', true, "Booking confirmed.", "Pending");
        room6.setRoomNumber("admin");
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setName("hi!");
        room6.setName("");
        java.lang.String str11 = room6.getName();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor12 = room6.getOccupancySensor();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(occupancySensor12);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand8 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setHourlyRate((double) 0L);
        boolean boolean11 = reservation1.isExtended();
        java.time.LocalDateTime localDateTime12 = reservation1.getEndTime();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService23 = null;
        com.conferenceroomscheduler.model.Reservation reservation24 = new com.conferenceroomscheduler.model.Reservation();
        reservation24.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod27 = reservation24.getPaymentMethod();
        reservation24.setFinalAmount((double) (byte) 1);
        java.lang.String str30 = reservation24.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand31 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService23, reservation24);
        reservation24.setHourlyRate((double) 0L);
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod54 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation55 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime48, localDateTime49, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod54);
        com.conferenceroomscheduler.model.Reservation reservation56 = new com.conferenceroomscheduler.model.Reservation("admin", "", "Booking complete", "Pending", localDateTime38, localDateTime39, "", (double) 'a', (double) 10L, 0.0d, paymentMethod54);
        reservation24.setPaymentMethod(paymentMethod54);
        com.conferenceroomscheduler.model.Reservation reservation58 = new com.conferenceroomscheduler.model.Reservation("Cancelled", "", "Checked in.", "faculty", localDateTime17, localDateTime18, "Pending", (double) (byte) -1, (double) 1L, (-1.0d), paymentMethod54);
        reservation1.setPaymentMethod(paymentMethod54);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext60 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(paymentMethod27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + paymentMethod54 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod54.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        reservation0.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext12 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.BookingState bookingState13 = bookingContext12.getState();
        com.conferenceroomscheduler.model.Reservation reservation14 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext15 = new com.conferenceroomscheduler.patterns.BookingContext(reservation14);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState16 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext15.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState16);
        com.conferenceroomscheduler.model.Reservation reservation18 = new com.conferenceroomscheduler.model.Reservation();
        reservation18.setFinalAmount((double) (byte) 100);
        reservation18.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext23 = new com.conferenceroomscheduler.patterns.BookingContext(reservation18);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState24 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str25 = cancelledBookingState24.getName();
        bookingContext23.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState24);
        com.conferenceroomscheduler.model.Reservation reservation27 = bookingContext23.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation28 = bookingContext23.getReservation();
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState29 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str30 = confirmedBookingState29.getName();
        bookingContext23.setState((com.conferenceroomscheduler.patterns.BookingState) confirmedBookingState29);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState32 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation33 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext34 = new com.conferenceroomscheduler.patterns.BookingContext(reservation33);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState35 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext34.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState35);
        com.conferenceroomscheduler.patterns.BookingState bookingState37 = bookingContext34.getState();
        com.conferenceroomscheduler.model.Reservation reservation38 = bookingContext34.getReservation();
        cancelledBookingState32.handle(bookingContext34);
        java.lang.String str40 = cancelledBookingState32.getName();
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
        com.conferenceroomscheduler.model.Reservation reservation51 = new com.conferenceroomscheduler.model.Reservation();
        reservation51.setFinalAmount((double) (byte) 100);
        reservation51.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext56 = new com.conferenceroomscheduler.patterns.BookingContext(reservation51);
        checkedInBookingState41.handle(bookingContext56);
        com.conferenceroomscheduler.model.Reservation reservation58 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext59 = new com.conferenceroomscheduler.patterns.BookingContext(reservation58);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState60 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext59.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState60);
        checkedInBookingState41.handle(bookingContext59);
        com.conferenceroomscheduler.model.Reservation reservation63 = new com.conferenceroomscheduler.model.Reservation();
        reservation63.setFinalAmount((double) (byte) 100);
        java.lang.String str66 = reservation63.getRoomId();
        reservation63.setFinalAmount((double) 10.0f);
        java.lang.String str69 = reservation63.getUserId();
        reservation63.setFinalAmount((double) ' ');
        java.lang.String str72 = reservation63.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext73 = new com.conferenceroomscheduler.patterns.BookingContext(reservation63);
        bookingContext73.request();
        java.lang.String str75 = bookingContext73.getStatus();
        checkedInBookingState41.handle(bookingContext73);
        cancelledBookingState32.handle(bookingContext73);
        com.conferenceroomscheduler.patterns.BookingState bookingState78 = bookingContext73.getState();
        confirmedBookingState29.handle(bookingContext73);
        cancelledBookingState16.handle(bookingContext73);
        bookingState13.handle(bookingContext73);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState13);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cancelled" + "'", str25, "Cancelled");
        org.junit.Assert.assertNotNull(reservation27);
        org.junit.Assert.assertNotNull(reservation28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Booking confirmed." + "'", str30, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState37);
        org.junit.Assert.assertNull(reservation38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Cancelled" + "'", str40, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState47);
        org.junit.Assert.assertNotNull(bookingState48);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Pending" + "'", str75, "Pending");
        org.junit.Assert.assertNotNull(bookingState78);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        room6.setBuilding("Booking complete");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor21 = room6.getOccupancySensor();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher22 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor26 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher27 = null;
        occupancySensor26.setSubject(checkInPublisher27);
        occupancySensor26.occupied = true;
        occupancySensor26.setDetected(false);
        checkInPublisher22.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor26);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor37 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor37.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount46 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount46.setEmail("");
        boolean boolean49 = occupancySensor37.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount46);
        checkInPublisher22.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor37);
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory51 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account59 = facultyFactory51.createAccount("", "Cancelled", "", "hi!", false, false, "");
        account59.setAccountNumber("hi!");
        account59.setUniversityAccount(true);
        account59.setAccountType("Cancelled");
        checkInPublisher22.notifyObservers(account59);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor70 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, true);
        boolean boolean71 = occupancySensor70.isOccupied();
        checkInPublisher22.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor70);
        occupancySensor21.setSubject(checkInPublisher22);
        boolean boolean74 = occupancySensor21.isOccupied();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(occupancySensor21);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(account59);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor26 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount33 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean34 = occupancySensor26.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount33);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher35 = null;
        occupancySensor26.setSubject(checkInPublisher35);
        occupancySensor26.isDetected = false;
        boolean boolean39 = occupancySensor26.isOccupied();
        com.conferenceroomscheduler.model.Badge badge43 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str44 = badge43.getEmail();
        boolean boolean45 = occupancySensor26.scanIdBadge(badge43);
        java.lang.String str46 = badge43.getAccountId();
        badge43.setAccountId("Cancelled");
        java.lang.String str49 = badge43.getEmail();
        boolean boolean50 = occupancySensor3.scanIdBadge(badge43);
        occupancySensor3.setOccupied(false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Cancelled" + "'", str44, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Booking confirmed." + "'", str46, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Cancelled" + "'", str49, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("faculty", "partner", "Booking complete", "faculty", false, false, "Unverified badge detected for admin.");
        account7.setAccountType("hi!");
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        java.lang.String str4 = reservation1.getAccountType();
        java.time.LocalDateTime localDateTime5 = reservation1.getEndTime();
        java.time.LocalDateTime localDateTime6 = reservation1.getEndTime();
        java.lang.String str7 = reservation1.getAccountType();
        reservation1.setReservationId("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("Booking complete", "Pending", "student", false, false, "");
        boolean boolean7 = adminAccount6.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
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
        java.lang.String str12 = completedBookingState0.getName();
        java.lang.String str13 = completedBookingState0.getName();
        java.lang.String str14 = completedBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking complete" + "'", str11, "Booking complete");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking complete" + "'", str12, "Booking complete");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking complete" + "'", str13, "Booking complete");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking complete" + "'", str14, "Booking complete");
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy institutionalBillingPaymentStrategy0 = new com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy();
        boolean boolean3 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", 0.0d);
        boolean boolean6 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", (double) (short) 1);
        boolean boolean9 = institutionalBillingPaymentStrategy0.processPayment("Cancelled", 32.0d);
        boolean boolean12 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", (double) (byte) -1);
        boolean boolean15 = institutionalBillingPaymentStrategy0.processPayment("student", (double) 10L);
        boolean boolean18 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", (double) (short) 10);
        boolean boolean21 = institutionalBillingPaymentStrategy0.processPayment("", 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("Unverified badge detected for admin.", "Unverified badge detected for .", "Verified badge detected for ADMIN-69.", "Unverified badge detected for Cancelled.", false, false, "Unverified badge detected for admin.");
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
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
        java.lang.String str29 = room6.getName();
        room6.setEnabled(true);
        room6.setRoomNumber("Unverified badge detected for Cancelled.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Cancelled" + "'", str29, "Cancelled");
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        badgeScan3.setBadgeId("admin");
        java.lang.String str8 = badgeScan3.getRoomId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
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
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount39 = new com.conferenceroomscheduler.model.PartnerAccount("hi!", "student", "admin", false, false, "Cancelled");
        boolean boolean40 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) partnerAccount39);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher41 = occupancySensor3.getSubject();
        boolean boolean42 = occupancySensor3.isDetected;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Booking confirmed." + "'", str31, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(checkInPublisher41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        room6.setBuilding("Booking complete");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor21 = room6.getOccupancySensor();
        room6.setRoomNumber("ADMIN-69");
        boolean boolean24 = room6.isClosedForMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(occupancySensor21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) 10);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("Cancelled", 1.0d);
        boolean boolean9 = creditCardPaymentStrategy0.processPayment("Cancelled", (double) 100);
        boolean boolean12 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) (short) -1);
        boolean boolean15 = creditCardPaymentStrategy0.processPayment("admin", (double) 100.0f);
        boolean boolean18 = creditCardPaymentStrategy0.processPayment("faculty", (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Unverified badge detected for .", false, false);
        occupancySensor3.setRoomId("hi!");
        com.conferenceroomscheduler.model.Room room12 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str13 = room12.getRoomId();
        room12.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount22 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room12.checkIn((com.conferenceroomscheduler.model.Account) studentAccount22);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher24 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor28 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean29 = occupancySensor28.isDetected();
        occupancySensor28.occupied = false;
        checkInPublisher24.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor28);
        room12.setOccupancySensor(occupancySensor28);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher34 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor38 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean39 = occupancySensor38.isDetected();
        occupancySensor38.occupied = false;
        checkInPublisher34.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor38);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher43 = occupancySensor38.subject;
        occupancySensor28.subject = checkInPublisher43;
        com.conferenceroomscheduler.model.AdminAccount adminAccount45 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str46 = adminAccount45.getEmail();
        com.conferenceroomscheduler.model.Badge badge47 = adminAccount45.getBadge();
        boolean boolean48 = adminAccount45.isUniversityAccount();
        boolean boolean49 = adminAccount45.isUniversityAccount();
        checkInPublisher43.notifyObservers((com.conferenceroomscheduler.model.Account) adminAccount45);
        occupancySensor3.subject = checkInPublisher43;
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(checkInPublisher43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(badge47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("faculty", "ADMIN-69", true);
        boolean boolean4 = badge3.isVerified();
        boolean boolean5 = badge3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        java.lang.String str6 = badgeScan3.getBadgeId();
        boolean boolean7 = badgeScan3.isVerified();
        java.lang.String str8 = badgeScan3.getBadgeId();
        badgeScan3.setBadgeId("partner");
        java.lang.String str11 = badgeScan3.getRoomId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy institutionalBillingPaymentStrategy0 = new com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy();
        boolean boolean3 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", 0.0d);
        boolean boolean6 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", (double) (short) 1);
        boolean boolean9 = institutionalBillingPaymentStrategy0.processPayment("Cancelled", 32.0d);
        boolean boolean12 = institutionalBillingPaymentStrategy0.processPayment("faculty", (double) 1);
        boolean boolean15 = institutionalBillingPaymentStrategy0.processPayment("Booking confirmed.", (double) 1);
        boolean boolean18 = institutionalBillingPaymentStrategy0.processPayment("Unverified badge detected for .", 1.0d);
        boolean boolean21 = institutionalBillingPaymentStrategy0.processPayment("Unverified badge detected for admin.", (double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setHourlyRate((double) (byte) 100);
        boolean boolean3 = reservation0.isDepositLost();
        java.lang.String str4 = reservation0.getUserId();
        reservation0.setAccountType("Pending");
        double double7 = reservation0.getDepositAmount();
        java.lang.String str8 = reservation0.getRoomId();
        reservation0.setDepositAmount((double) (byte) 10);
        reservation0.setFinalAmount((double) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        boolean boolean9 = occupancySensor4.isDetected;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher10 = occupancySensor4.subject;
        occupancySensor4.roomId = "hi!";
        java.lang.String str13 = occupancySensor4.getRoomId();
        occupancySensor4.occupied = false;
        com.conferenceroomscheduler.model.StudentAccount studentAccount22 = new com.conferenceroomscheduler.model.StudentAccount("Unverified badge detected for .", "Booking complete", "hi!", true, false, "Verified badge detected for ADMIN-69.");
        boolean boolean23 = occupancySensor4.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount22);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(checkInPublisher10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setFinalAmount((double) (byte) 100);
        java.lang.String str5 = reservation2.getRoomId();
        reservation2.setFinalAmount((double) 10.0f);
        java.lang.String str8 = reservation2.getUserId();
        reservation2.setDepositAmount((double) (byte) 0);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand11 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str12 = reservation2.getTitle();
        reservation2.setAccountType("Cancelled");
        reservation2.setCanceled(false);
        boolean boolean17 = reservation2.isDepositLost();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand20 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation2, localDateTime18, localDateTime19);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setDepositAmount(0.0d);
        reservation0.setAccountType("");
        java.lang.String str8 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (short) 100);
        double double11 = reservation0.getHourlyRate();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod12 = reservation0.getPaymentMethod();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(paymentMethod12);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("Pending", "staff", "Cancelled", "ADMIN-69", false, false, "");
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        boolean boolean9 = occupancySensor4.isDetected;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher10 = occupancySensor4.subject;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher11 = occupancySensor4.subject;
        boolean boolean12 = occupancySensor4.occupied;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(checkInPublisher10);
        org.junit.Assert.assertNotNull(checkInPublisher11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setDepositLost(true);
        boolean boolean6 = reservation1.isCanceled();
        reservation1.setRoomId("");
        java.lang.String str9 = reservation1.getTitle();
        java.time.LocalDateTime localDateTime10 = null;
        reservation1.setEndTime(localDateTime10);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand14 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime12, localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand8 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setHourlyRate((double) 0L);
        double double11 = reservation1.getHourlyRate();
        reservation1.setCanceled(false);
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("student", "Cancelled", true);
        java.lang.String str4 = badgeScan3.getRoomId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cancelled" + "'", str4, "Cancelled");
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Booking complete", "Booking confirmed.", (int) '4', true, "Booking confirmed.", "Pending");
        room6.setClosedForMaintenance(false);
        room6.setClosedForMaintenance(true);
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory11 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account19 = facultyFactory11.createAccount("", "Cancelled", "", "hi!", false, false, "");
        account19.setAccountNumber("hi!");
        java.lang.String str22 = account19.getAccountId();
        room6.checkIn(account19);
        room6.setClosedForMaintenance(false);
        room6.setName("Checked in.");
        org.junit.Assert.assertNotNull(account19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState0 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str1 = confirmedBookingState0.getName();
        java.lang.String str2 = confirmedBookingState0.getName();
        java.lang.String str3 = confirmedBookingState0.getName();
        java.lang.String str4 = confirmedBookingState0.getName();
        java.lang.String str5 = confirmedBookingState0.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState6 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState7 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation8 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext9 = new com.conferenceroomscheduler.patterns.BookingContext(reservation8);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState10 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext9.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState10);
        com.conferenceroomscheduler.patterns.BookingState bookingState12 = bookingContext9.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState13 = bookingContext9.getState();
        cancelledBookingState7.handle(bookingContext9);
        checkedInBookingState6.handle(bookingContext9);
        com.conferenceroomscheduler.model.Reservation reservation16 = new com.conferenceroomscheduler.model.Reservation();
        reservation16.setFinalAmount((double) (byte) 100);
        reservation16.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext21 = new com.conferenceroomscheduler.patterns.BookingContext(reservation16);
        checkedInBookingState6.handle(bookingContext21);
        com.conferenceroomscheduler.model.Reservation reservation23 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext24 = new com.conferenceroomscheduler.patterns.BookingContext(reservation23);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState25 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext24.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState25);
        checkedInBookingState6.handle(bookingContext24);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState28 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str29 = cancelledBookingState28.getName();
        bookingContext24.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState28);
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
        com.conferenceroomscheduler.model.Reservation reservation42 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext43 = new com.conferenceroomscheduler.patterns.BookingContext(reservation42);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState44 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext43.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState44);
        com.conferenceroomscheduler.model.Reservation reservation46 = bookingContext43.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation47 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext48 = new com.conferenceroomscheduler.patterns.BookingContext(reservation47);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState49 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext48.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState49);
        com.conferenceroomscheduler.patterns.BookingState bookingState51 = bookingContext48.getState();
        bookingContext43.setState(bookingState51);
        checkedInBookingState31.handle(bookingContext43);
        com.conferenceroomscheduler.model.Reservation reservation54 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext55 = new com.conferenceroomscheduler.patterns.BookingContext(reservation54);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState56 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext55.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState56);
        com.conferenceroomscheduler.patterns.BookingState bookingState58 = bookingContext55.getState();
        com.conferenceroomscheduler.model.Reservation reservation59 = bookingContext55.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation60 = bookingContext55.getReservation();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState61 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState62 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation63 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext64 = new com.conferenceroomscheduler.patterns.BookingContext(reservation63);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState65 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext64.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState65);
        com.conferenceroomscheduler.patterns.BookingState bookingState67 = bookingContext64.getState();
        com.conferenceroomscheduler.model.Reservation reservation68 = bookingContext64.getReservation();
        cancelledBookingState62.handle(bookingContext64);
        checkedInBookingState61.handle(bookingContext64);
        bookingContext64.request();
        com.conferenceroomscheduler.patterns.BookingState bookingState72 = bookingContext64.getState();
        bookingContext55.setState(bookingState72);
        checkedInBookingState31.handle(bookingContext55);
        cancelledBookingState28.handle(bookingContext55);
        confirmedBookingState0.handle(bookingContext55);
        java.lang.String str77 = confirmedBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking confirmed." + "'", str1, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking confirmed." + "'", str2, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking confirmed." + "'", str3, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Booking confirmed." + "'", str4, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking confirmed." + "'", str5, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState12);
        org.junit.Assert.assertNotNull(bookingState13);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Cancelled" + "'", str29, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState37);
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Checked in." + "'", str41, "Checked in.");
        org.junit.Assert.assertNull(reservation46);
        org.junit.Assert.assertNotNull(bookingState51);
        org.junit.Assert.assertNotNull(bookingState58);
        org.junit.Assert.assertNull(reservation59);
        org.junit.Assert.assertNull(reservation60);
        org.junit.Assert.assertNotNull(bookingState67);
        org.junit.Assert.assertNull(reservation68);
        org.junit.Assert.assertNotNull(bookingState72);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Booking confirmed." + "'", str77, "Booking confirmed.");
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setCheckedIn(true);
        reservation0.setCheckedIn(false);
        java.lang.String str11 = reservation0.getUserId();
        double double12 = reservation0.getDepositAmount();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod13 = reservation0.getPaymentMethod();
        reservation0.setCanceled(false);
        boolean boolean16 = reservation0.isCheckedIn();
        reservation0.setCheckedIn(true);
        double double19 = reservation0.getFinalAmount();
        reservation0.setReservationId("Unverified badge detected for .");
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(paymentMethod13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("admin", "", "admin", "", 10, localDateTime5, localDateTime6);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod10 = null;
        com.conferenceroomscheduler.model.Reservation reservation11 = new com.conferenceroomscheduler.model.Reservation("student", "Booking confirmed.", "", "Checked in.", localDateTime4, localDateTime5, "Booking confirmed.", (-1.0d), (double) (short) 1, (double) 1, paymentMethod10);
        boolean boolean12 = reservation11.isCanceled();
        reservation11.setCheckedIn(false);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext15 = new com.conferenceroomscheduler.patterns.BookingContext(reservation11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("student", "Booking confirmed.", true);
        badgeScan3.setBadgeId("Unverified badge detected for Cancelled.");
        badgeScan3.setVerified(true);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Booking complete", true, true, "Checked in.");
        studentAccount6.setUniversityAccount(false);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.model.Badge badge12 = studentAccount10.getBadge();
        com.conferenceroomscheduler.model.Badge badge13 = studentAccount10.getBadge();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(badge12);
        org.junit.Assert.assertNotNull(badge13);
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        boolean boolean11 = room6.isClosedForMaintenance();
        room6.setRoomId("Pending");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor14 = room6.getOccupancySensor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(occupancySensor14);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
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
        boolean boolean22 = editBookingCommand21.wasSuccessful();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNotNull(reservation10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
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
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService28 = null;
        com.conferenceroomscheduler.model.Reservation reservation29 = new com.conferenceroomscheduler.model.Reservation();
        reservation29.setFinalAmount((double) (byte) 100);
        java.lang.String str32 = reservation29.getRoomId();
        reservation29.setFinalAmount((double) 10.0f);
        java.lang.String str35 = reservation29.getUserId();
        reservation29.setDepositAmount((double) (byte) 0);
        double double38 = reservation29.getHourlyRate();
        reservation29.setDepositLost(true);
        java.lang.String str41 = reservation29.getReservationId();
        reservation29.setRoomId("Unverified badge detected for Cancelled.");
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand46 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService28, reservation29, localDateTime44, localDateTime45);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext47 = new com.conferenceroomscheduler.patterns.BookingContext(reservation29);
        pendingBookingState0.handle(bookingContext47);
        java.lang.String str49 = pendingBookingState0.getName();
        java.lang.String str50 = pendingBookingState0.getName();
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService51 = null;
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod62 = null;
        com.conferenceroomscheduler.model.Reservation reservation63 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime56, localDateTime57, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod62);
        reservation63.setDepositLost(true);
        java.time.LocalDateTime localDateTime66 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand67 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService51, reservation63, localDateTime66);
        reservation63.setAccountType("Pending");
        reservation63.setCanceled(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext72 = new com.conferenceroomscheduler.patterns.BookingContext(reservation63);
        pendingBookingState0.handle(bookingContext72);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pending" + "'", str1, "Pending");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pending" + "'", str12, "Pending");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pending" + "'", str13, "Pending");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Pending" + "'", str27, "Pending");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Pending" + "'", str49, "Pending");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Pending" + "'", str50, "Pending");
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("admin", "student", "", false, false, "student");
        com.conferenceroomscheduler.model.Badge badge7 = facultyAccount6.getBadge();
        badge7.setVerified(true);
        org.junit.Assert.assertNotNull(badge7);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getTitle();
        double double4 = reservation1.getDepositAmount();
        reservation1.setDepositAmount((double) 1L);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod37 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation38 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime31, localDateTime32, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod37);
        com.conferenceroomscheduler.model.Reservation reservation39 = new com.conferenceroomscheduler.model.Reservation("admin", "", "Booking complete", "Pending", localDateTime21, localDateTime22, "", (double) 'a', (double) 10L, 0.0d, paymentMethod37);
        com.conferenceroomscheduler.model.Reservation reservation40 = new com.conferenceroomscheduler.model.Reservation("hi!", "faculty", "", "Pending", localDateTime11, localDateTime12, "Unverified badge detected for Cancelled.", (double) 1.0f, (double) 0L, (-1.0d), paymentMethod37);
        reservation1.setPaymentMethod(paymentMethod37);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod37 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod37.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Cancelled", "hi!", "hi!", "", (int) (short) 1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRoomId();
        java.lang.String str9 = bookingRequest7.getRequestId();
        java.lang.String str10 = bookingRequest7.getRoomId();
        java.time.LocalDateTime localDateTime11 = bookingRequest7.getStartTime();
        int int12 = bookingRequest7.getAttendeeCount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Pending", (int) (byte) 1, true, "hi!", "Pending");
        room6.setRoomNumber("Booking complete");
        room6.setEnabled(true);
        room6.setName("faculty");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = room6.getOccupancySensor();
        room6.setRoomNumber("Pending");
        room6.setRoomNumber("Verified badge detected for Checked in..");
        org.junit.Assert.assertNotNull(occupancySensor13);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
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
        com.conferenceroomscheduler.patterns.BookingContext bookingContext23 = new com.conferenceroomscheduler.patterns.BookingContext(reservation12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Booking confirmed.", "Unverified badge detected for Cancelled.", true);
        java.lang.String str4 = badgeScan3.getRoomId();
        badgeScan3.setRoomId("Checked in.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Unverified badge detected for Cancelled." + "'", str4, "Unverified badge detected for Cancelled.");
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setRoomId("hi!");
        java.lang.String str6 = reservation0.getReservationId();
        java.lang.String str7 = reservation0.getAccountType();
        reservation0.setFinalAmount((double) (byte) 10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
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
        badge20.setVerified(false);
        badge20.setVerified(false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking confirmed." + "'", str23, "Booking confirmed.");
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
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
        occupancySensor21.setRoomId("Checked in.");
        boolean boolean34 = occupancySensor21.isDetected();
        boolean boolean35 = occupancySensor21.isDetected();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        boolean boolean4 = reservation1.isCheckedIn();
        java.time.LocalDateTime localDateTime5 = reservation1.getStartTime();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(localDateTime5);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("ADMIN-69", "admin", true);
        badge3.setEmail("Unverified badge detected for .");
        java.lang.String str6 = badge3.getEmail();
        boolean boolean7 = badge3.isVerified();
        java.lang.String str8 = badge3.getAccountId();
        badge3.setEmail("Unverified badge detected for Cancelled.");
        java.lang.String str11 = badge3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Unverified badge detected for ." + "'", str6, "Unverified badge detected for .");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Unverified badge detected for Cancelled." + "'", str11, "Unverified badge detected for Cancelled.");
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) 10);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("Cancelled", 1.0d);
        boolean boolean9 = creditCardPaymentStrategy0.processPayment("Cancelled", (double) 100);
        boolean boolean12 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) (short) -1);
        boolean boolean15 = creditCardPaymentStrategy0.processPayment("staff", (double) (byte) 1);
        boolean boolean18 = creditCardPaymentStrategy0.processPayment("partner", (double) 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        com.conferenceroomscheduler.patterns.StudentFactory studentFactory0 = new com.conferenceroomscheduler.patterns.StudentFactory();
        com.conferenceroomscheduler.model.Account account8 = studentFactory0.createAccount("", "hi!", "", "", true, true, "hi!");
        com.conferenceroomscheduler.model.Account account16 = studentFactory0.createAccount("Unverified badge detected for .", "partner", "ADMIN-69", "hi!", false, false, "staff");
        com.conferenceroomscheduler.model.Account account24 = studentFactory0.createAccount("Booking confirmed.", "Booking complete", "Checked in.", "Cancelled", true, false, "Cancelled");
        com.conferenceroomscheduler.model.Account account32 = studentFactory0.createAccount("staff", "", "Unverified badge detected for Cancelled.", "", true, false, "staff");
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
        org.junit.Assert.assertNotNull(account32);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Unverified badge detected for .", "Unverified badge detected for .", false);
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("admin", "faculty", false);
        java.lang.String str4 = badgeScan3.getRoomId();
        badgeScan3.setRoomId("partner");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setHourlyRate((double) (byte) 100);
        boolean boolean5 = reservation2.isDepositLost();
        java.lang.String str6 = reservation2.getUserId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand7 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService1, reservation2);
        java.time.LocalDateTime localDateTime8 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand9 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation2, localDateTime8);
        java.lang.String str10 = reservation2.getRoomId();
        reservation2.setFinalAmount((double) 100);
        java.time.LocalDateTime localDateTime13 = reservation2.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor0 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor0.update("Checked in.");
        roomSensor0.update("Booking confirmed.");
        roomSensor0.update("Booking complete");
        roomSensor0.update("");
        roomSensor0.update("student");
        roomSensor0.update("");
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        badgeScan3.setBadgeId("admin");
        badgeScan3.setRoomId("admin");
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        room6.setRoomId("Booking complete");
        room6.setEnabled(true);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor23 = room6.getOccupancySensor();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher24 = occupancySensor23.subject;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(occupancySensor23);
        org.junit.Assert.assertNull(checkInPublisher24);
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState0 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext6 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState7 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str8 = cancelledBookingState7.getName();
        bookingContext6.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState7);
        completedBookingState0.handle(bookingContext6);
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
        java.lang.String str28 = checkedInBookingState11.getName();
        com.conferenceroomscheduler.model.Reservation reservation29 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext30 = new com.conferenceroomscheduler.patterns.BookingContext(reservation29);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState31 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext30.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState31);
        com.conferenceroomscheduler.model.Reservation reservation33 = bookingContext30.getReservation();
        checkedInBookingState11.handle(bookingContext30);
        completedBookingState0.handle(bookingContext30);
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
        com.conferenceroomscheduler.model.Reservation reservation53 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext54 = new com.conferenceroomscheduler.patterns.BookingContext(reservation53);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState55 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext54.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState55);
        com.conferenceroomscheduler.patterns.BookingState bookingState57 = bookingContext54.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState58 = bookingContext54.getState();
        bookingContext54.request();
        bookingContext54.request();
        com.conferenceroomscheduler.model.Reservation reservation61 = bookingContext54.getReservation();
        checkedInBookingState36.handle(bookingContext54);
        completedBookingState0.handle(bookingContext54);
        java.lang.String str64 = completedBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState17);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Checked in." + "'", str28, "Checked in.");
        org.junit.Assert.assertNull(reservation33);
        org.junit.Assert.assertNotNull(bookingState42);
        org.junit.Assert.assertNotNull(bookingState43);
        org.junit.Assert.assertNotNull(bookingState57);
        org.junit.Assert.assertNotNull(bookingState58);
        org.junit.Assert.assertNull(reservation61);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Booking complete" + "'", str64, "Booking complete");
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        java.lang.String str3 = reservation0.getUserId();
        boolean boolean4 = reservation0.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation0.getPaymentMethod();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext8 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        reservation0.setAccountType("Cancelled");
        java.time.LocalDateTime localDateTime11 = reservation0.getEndTime();
        double double12 = reservation0.getFinalAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
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
        reservation0.setReservationId("student");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
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
        room6.setName("Verified badge detected for ADMIN-69.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cancelled" + "'", str20, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setFinalAmount((double) (byte) 100);
        java.lang.String str5 = reservation2.getRoomId();
        reservation2.setFinalAmount((double) 10.0f);
        java.lang.String str8 = reservation2.getUserId();
        reservation2.setDepositAmount((double) (byte) 0);
        boolean boolean11 = reservation2.isExtended();
        java.lang.String str12 = reservation2.getUserId();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand15 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService1, reservation2, localDateTime13, localDateTime14);
        java.lang.String str16 = reservation2.getRoomId();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand17 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        java.lang.String str3 = reservation0.getUserId();
        boolean boolean4 = reservation0.isDepositLost();
        reservation0.setCheckedIn(false);
        reservation0.setHourlyRate(0.0d);
        boolean boolean9 = reservation0.isCanceled();
        reservation0.setFinalAmount((double) 100L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getRoomId();
        java.lang.String str10 = bookingRequest7.getRequestId();
        java.time.LocalDateTime localDateTime11 = bookingRequest7.getStartTime();
        java.time.LocalDateTime localDateTime12 = bookingRequest7.getStartTime();
        int int13 = bookingRequest7.getAttendeeCount();
        java.lang.String str14 = bookingRequest7.getRequestId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("Pending", (double) (short) 0);
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("", (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str1 = adminAccount0.getAccountNumber();
        java.lang.String str2 = adminAccount0.getAccountId();
        adminAccount0.setEmail("Booking complete");
        java.lang.String str5 = adminAccount0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Booking complete", "student", "", true, false, "Booking complete");
        studentAccount6.setAccountType("faculty");
        java.lang.String str9 = studentAccount6.getPassword();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setDepositAmount(0.0d);
        reservation0.setAccountType("");
        java.lang.String str8 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (short) 100);
        java.lang.String str11 = reservation0.getRoomId();
        reservation0.setDepositAmount(100.0d);
        reservation0.setUserId("Verified badge detected for ADMIN-69.");
        java.lang.String str16 = reservation0.getReservationId();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
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
        double double14 = reservation0.getHourlyRate();
        com.conferenceroomscheduler.model.Reservation reservation15 = new com.conferenceroomscheduler.model.Reservation();
        reservation15.setAccountType("hi!");
        java.lang.String str18 = reservation15.getUserId();
        boolean boolean19 = reservation15.isDepositLost();
        reservation15.setHourlyRate(1.0d);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod32 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation33 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime26, localDateTime27, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod32);
        reservation15.setPaymentMethod(paymentMethod32);
        reservation0.setPaymentMethod(paymentMethod32);
        reservation0.setTitle("Unverified badge detected for admin.");
        reservation0.setAccountType("faculty");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + paymentMethod32 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod32.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("student", "partner", "Booking confirmed.", "Booking confirmed.", false, false, "Verified badge detected for ADMIN-69.");
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("Checked in.", "faculty", "staff", true, true, "admin");
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        com.conferenceroomscheduler.model.Reservation reservation0 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext1 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState2 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext1.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState2);
        java.lang.String str4 = cancelledBookingState2.getName();
        java.lang.String str5 = cancelledBookingState2.getName();
        java.lang.String str6 = cancelledBookingState2.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState7 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState8 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation9 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext10 = new com.conferenceroomscheduler.patterns.BookingContext(reservation9);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState11 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext10.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState11);
        com.conferenceroomscheduler.patterns.BookingState bookingState13 = bookingContext10.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState14 = bookingContext10.getState();
        cancelledBookingState8.handle(bookingContext10);
        checkedInBookingState7.handle(bookingContext10);
        java.lang.String str17 = checkedInBookingState7.getName();
        com.conferenceroomscheduler.model.Reservation reservation18 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext19 = new com.conferenceroomscheduler.patterns.BookingContext(reservation18);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState20 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext19.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState20);
        com.conferenceroomscheduler.model.Reservation reservation22 = bookingContext19.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation23 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext24 = new com.conferenceroomscheduler.patterns.BookingContext(reservation23);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState25 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext24.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState25);
        com.conferenceroomscheduler.patterns.BookingState bookingState27 = bookingContext24.getState();
        bookingContext19.setState(bookingState27);
        checkedInBookingState7.handle(bookingContext19);
        com.conferenceroomscheduler.model.Reservation reservation30 = bookingContext19.getReservation();
        com.conferenceroomscheduler.patterns.BookingState bookingState31 = bookingContext19.getState();
        com.conferenceroomscheduler.model.Reservation reservation32 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext33 = new com.conferenceroomscheduler.patterns.BookingContext(reservation32);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState34 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext33.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState34);
        java.lang.String str36 = cancelledBookingState34.getName();
        java.lang.String str37 = cancelledBookingState34.getName();
        bookingContext19.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState34);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState39 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState40 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation41 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext42 = new com.conferenceroomscheduler.patterns.BookingContext(reservation41);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState43 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext42.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState43);
        com.conferenceroomscheduler.patterns.BookingState bookingState45 = bookingContext42.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState46 = bookingContext42.getState();
        cancelledBookingState40.handle(bookingContext42);
        checkedInBookingState39.handle(bookingContext42);
        com.conferenceroomscheduler.model.Reservation reservation49 = new com.conferenceroomscheduler.model.Reservation();
        reservation49.setFinalAmount((double) (byte) 100);
        reservation49.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext54 = new com.conferenceroomscheduler.patterns.BookingContext(reservation49);
        checkedInBookingState39.handle(bookingContext54);
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState56 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation57 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext58 = new com.conferenceroomscheduler.patterns.BookingContext(reservation57);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState59 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext58.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState59);
        completedBookingState56.handle(bookingContext58);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState62 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation63 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext64 = new com.conferenceroomscheduler.patterns.BookingContext(reservation63);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState65 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext64.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState65);
        com.conferenceroomscheduler.patterns.BookingState bookingState67 = bookingContext64.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState68 = bookingContext64.getState();
        cancelledBookingState62.handle(bookingContext64);
        completedBookingState56.handle(bookingContext64);
        com.conferenceroomscheduler.model.Reservation reservation71 = bookingContext64.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation72 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext73 = new com.conferenceroomscheduler.patterns.BookingContext(reservation72);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState74 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext73.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState74);
        com.conferenceroomscheduler.model.Reservation reservation76 = bookingContext73.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation77 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext78 = new com.conferenceroomscheduler.patterns.BookingContext(reservation77);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState79 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext78.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState79);
        com.conferenceroomscheduler.patterns.BookingState bookingState81 = bookingContext78.getState();
        bookingContext73.setState(bookingState81);
        bookingContext64.setState(bookingState81);
        checkedInBookingState39.handle(bookingContext64);
        cancelledBookingState34.handle(bookingContext64);
        cancelledBookingState2.handle(bookingContext64);
        com.conferenceroomscheduler.model.Reservation reservation87 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext88 = new com.conferenceroomscheduler.patterns.BookingContext(reservation87);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState89 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext88.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState89);
        com.conferenceroomscheduler.patterns.BookingState bookingState91 = bookingContext88.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState92 = bookingContext88.getState();
        bookingContext88.request();
        com.conferenceroomscheduler.model.Reservation reservation94 = bookingContext88.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation95 = bookingContext88.getReservation();
        cancelledBookingState2.handle(bookingContext88);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cancelled" + "'", str4, "Cancelled");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cancelled" + "'", str5, "Cancelled");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cancelled" + "'", str6, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState13);
        org.junit.Assert.assertNotNull(bookingState14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Checked in." + "'", str17, "Checked in.");
        org.junit.Assert.assertNull(reservation22);
        org.junit.Assert.assertNotNull(bookingState27);
        org.junit.Assert.assertNull(reservation30);
        org.junit.Assert.assertNotNull(bookingState31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Cancelled" + "'", str36, "Cancelled");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Cancelled" + "'", str37, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState45);
        org.junit.Assert.assertNotNull(bookingState46);
        org.junit.Assert.assertNotNull(bookingState67);
        org.junit.Assert.assertNotNull(bookingState68);
        org.junit.Assert.assertNull(reservation71);
        org.junit.Assert.assertNull(reservation76);
        org.junit.Assert.assertNotNull(bookingState81);
        org.junit.Assert.assertNotNull(bookingState91);
        org.junit.Assert.assertNotNull(bookingState92);
        org.junit.Assert.assertNull(reservation94);
        org.junit.Assert.assertNull(reservation95);
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setFinalAmount((double) ' ');
        reservation0.setDepositAmount((-1.0d));
        reservation0.setDepositAmount((double) ' ');
        com.conferenceroomscheduler.model.Reservation reservation13 = new com.conferenceroomscheduler.model.Reservation();
        reservation13.setFinalAmount((double) (byte) 100);
        java.lang.String str16 = reservation13.getRoomId();
        reservation13.setFinalAmount((double) 10.0f);
        java.lang.String str19 = reservation13.getUserId();
        reservation13.setFinalAmount((double) ' ');
        java.lang.String str22 = reservation13.getTitle();
        reservation13.setDepositAmount((double) (-1.0f));
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod55 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation56 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime49, localDateTime50, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod55);
        com.conferenceroomscheduler.model.Reservation reservation57 = new com.conferenceroomscheduler.model.Reservation("admin", "", "Booking complete", "Pending", localDateTime39, localDateTime40, "", (double) 'a', (double) 10L, 0.0d, paymentMethod55);
        com.conferenceroomscheduler.model.Reservation reservation58 = new com.conferenceroomscheduler.model.Reservation("hi!", "faculty", "", "Pending", localDateTime29, localDateTime30, "Unverified badge detected for Cancelled.", (double) 1.0f, (double) 0L, (-1.0d), paymentMethod55);
        reservation13.setPaymentMethod(paymentMethod55);
        reservation0.setPaymentMethod(paymentMethod55);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + paymentMethod55 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod55.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Booking complete", "Cancelled", (int) (short) 1, "Booking complete", "");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("ADMIN-69", "Pending", 10, "hi!", "");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("", "Booking confirmed.", (-1), "student", "admin");
        java.lang.String str25 = room24.getRoomId();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        boolean boolean4 = badgeScan3.isVerified();
        boolean boolean5 = badgeScan3.isVerified();
        java.lang.String str6 = badgeScan3.getBadgeId();
        badgeScan3.setVerified(true);
        java.lang.String str9 = badgeScan3.getRoomId();
        badgeScan3.setVerified(true);
        badgeScan3.setRoomId("Unverified badge detected for Cancelled.");
        java.lang.String str14 = badgeScan3.getRoomId();
        java.lang.String str15 = badgeScan3.getBadgeId();
        badgeScan3.setBadgeId("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Unverified badge detected for Cancelled." + "'", str14, "Unverified badge detected for Cancelled.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = null;
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime5, localDateTime6, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod11);
        reservation12.setDepositLost(true);
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand16 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation12, localDateTime15);
        reservation12.setAccountType("Pending");
        java.time.LocalDateTime localDateTime19 = reservation12.getStartTime();
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Booking complete", "Cancelled", (int) (short) 1, "Booking complete", "");
        boolean boolean13 = room12.isEnabled();
        room12.setRoomId("Verified badge detected for ADMIN-69.");
        java.lang.String str16 = room12.getRoomId();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Verified badge detected for ADMIN-69." + "'", str16, "Verified badge detected for ADMIN-69.");
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) 10);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("Cancelled", 1.0d);
        boolean boolean9 = creditCardPaymentStrategy0.processPayment("Cancelled", (double) 100);
        boolean boolean12 = creditCardPaymentStrategy0.processPayment("hi!", (double) 0L);
        boolean boolean15 = creditCardPaymentStrategy0.processPayment("Booking confirmed.", (double) (short) 100);
        boolean boolean18 = creditCardPaymentStrategy0.processPayment("Cancelled", (double) (short) 1);
        boolean boolean21 = creditCardPaymentStrategy0.processPayment("Booking complete", 0.0d);
        boolean boolean24 = creditCardPaymentStrategy0.processPayment("student", (double) (short) 10);
        boolean boolean27 = creditCardPaymentStrategy0.processPayment("Verified badge detected for Checked in..", (double) (short) 100);
        boolean boolean30 = creditCardPaymentStrategy0.processPayment("faculty", (double) 100L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
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
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState32 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str33 = confirmedBookingState32.getName();
        java.lang.String str34 = confirmedBookingState32.getName();
        java.lang.String str35 = confirmedBookingState32.getName();
        java.lang.String str36 = confirmedBookingState32.getName();
        com.conferenceroomscheduler.model.Reservation reservation37 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext38 = new com.conferenceroomscheduler.patterns.BookingContext(reservation37);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState39 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext38.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState39);
        com.conferenceroomscheduler.patterns.BookingState bookingState41 = bookingContext38.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState42 = bookingContext38.getState();
        bookingContext38.request();
        confirmedBookingState32.handle(bookingContext38);
        bookingContext38.request();
        com.conferenceroomscheduler.model.Reservation reservation46 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext47 = new com.conferenceroomscheduler.patterns.BookingContext(reservation46);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState48 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext47.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState48);
        com.conferenceroomscheduler.patterns.BookingState bookingState50 = bookingContext47.getState();
        com.conferenceroomscheduler.model.Reservation reservation51 = bookingContext47.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation52 = bookingContext47.getReservation();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState53 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState54 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation55 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext56 = new com.conferenceroomscheduler.patterns.BookingContext(reservation55);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState57 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext56.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState57);
        com.conferenceroomscheduler.patterns.BookingState bookingState59 = bookingContext56.getState();
        com.conferenceroomscheduler.model.Reservation reservation60 = bookingContext56.getReservation();
        cancelledBookingState54.handle(bookingContext56);
        checkedInBookingState53.handle(bookingContext56);
        bookingContext56.request();
        com.conferenceroomscheduler.patterns.BookingState bookingState64 = bookingContext56.getState();
        bookingContext47.setState(bookingState64);
        bookingContext38.setState(bookingState64);
        bookingContext28.setState(bookingState64);
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Booking confirmed." + "'", str33, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Booking confirmed." + "'", str34, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Booking confirmed." + "'", str35, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Booking confirmed." + "'", str36, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState41);
        org.junit.Assert.assertNotNull(bookingState42);
        org.junit.Assert.assertNotNull(bookingState50);
        org.junit.Assert.assertNull(reservation51);
        org.junit.Assert.assertNull(reservation52);
        org.junit.Assert.assertNotNull(bookingState59);
        org.junit.Assert.assertNull(reservation60);
        org.junit.Assert.assertNotNull(bookingState64);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor0 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor0.update("Checked in.");
        roomSensor0.update("Booking confirmed.");
        roomSensor0.update("ADMIN-69");
        roomSensor0.update("Booking complete");
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
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
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState23 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation24 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext25 = new com.conferenceroomscheduler.patterns.BookingContext(reservation24);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState26 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext25.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState26);
        com.conferenceroomscheduler.patterns.BookingState bookingState28 = bookingContext25.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState29 = bookingContext25.getState();
        cancelledBookingState23.handle(bookingContext25);
        com.conferenceroomscheduler.model.Reservation reservation31 = bookingContext25.getReservation();
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
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState54 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str55 = cancelledBookingState54.getName();
        bookingContext50.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState54);
        bookingContext25.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState54);
        checkedInBookingState0.handle(bookingContext25);
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState59 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str60 = confirmedBookingState59.getName();
        java.lang.String str61 = confirmedBookingState59.getName();
        java.lang.String str62 = confirmedBookingState59.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState63 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState64 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation65 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext66 = new com.conferenceroomscheduler.patterns.BookingContext(reservation65);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState67 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext66.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState67);
        com.conferenceroomscheduler.patterns.BookingState bookingState69 = bookingContext66.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState70 = bookingContext66.getState();
        cancelledBookingState64.handle(bookingContext66);
        checkedInBookingState63.handle(bookingContext66);
        java.lang.String str73 = checkedInBookingState63.getName();
        com.conferenceroomscheduler.model.Reservation reservation74 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext75 = new com.conferenceroomscheduler.patterns.BookingContext(reservation74);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState76 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext75.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState76);
        com.conferenceroomscheduler.model.Reservation reservation78 = bookingContext75.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation79 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext80 = new com.conferenceroomscheduler.patterns.BookingContext(reservation79);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState81 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext80.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState81);
        com.conferenceroomscheduler.patterns.BookingState bookingState83 = bookingContext80.getState();
        bookingContext75.setState(bookingState83);
        checkedInBookingState63.handle(bookingContext75);
        com.conferenceroomscheduler.model.Reservation reservation86 = bookingContext75.getReservation();
        confirmedBookingState59.handle(bookingContext75);
        checkedInBookingState0.handle(bookingContext75);
        com.conferenceroomscheduler.model.Reservation reservation89 = bookingContext75.getReservation();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Checked in." + "'", str10, "Checked in.");
        org.junit.Assert.assertNull(reservation15);
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertNotNull(bookingState28);
        org.junit.Assert.assertNotNull(bookingState29);
        org.junit.Assert.assertNull(reservation31);
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertNotNull(bookingState39);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Cancelled" + "'", str55, "Cancelled");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Booking confirmed." + "'", str60, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Booking confirmed." + "'", str61, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Booking confirmed." + "'", str62, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState69);
        org.junit.Assert.assertNotNull(bookingState70);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Checked in." + "'", str73, "Checked in.");
        org.junit.Assert.assertNull(reservation78);
        org.junit.Assert.assertNotNull(bookingState83);
        org.junit.Assert.assertNull(reservation86);
        org.junit.Assert.assertNull(reservation89);
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
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
        // The following exception was thrown during execution in test generation
        try {
            editBookingCommand20.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.editBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("partner", "partner", "Booking complete", "Unverified badge detected for .", true, false, "Cancelled");
        account7.setAccountType("Booking complete");
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("student", "student", (-1), false, "Cancelled", "Verified badge detected for ADMIN-69.");
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
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
        occupancySensor3.setOccupied(false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher43 = occupancySensor3.subject;
        java.lang.String str44 = occupancySensor3.getRoomId();
        occupancySensor3.occupied = true;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Cancelled" + "'", str33, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Booking confirmed." + "'", str35, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Cancelled" + "'", str38, "Cancelled");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Cancelled" + "'", str39, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(checkInPublisher43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Pending" + "'", str44, "Pending");
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "Checked in.", true);
        java.lang.String str4 = badgeScan3.getBadgeId();
        boolean boolean5 = badgeScan3.isVerified();
        boolean boolean6 = badgeScan3.isVerified();
        badgeScan3.setRoomId("ADMIN-69");
        java.lang.String str9 = badgeScan3.getBadgeId();
        boolean boolean10 = badgeScan3.isVerified();
        badgeScan3.setBadgeId("Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        reservation1.setCheckedIn(true);
        reservation1.setCheckedIn(false);
        java.lang.String str12 = reservation1.getUserId();
        java.time.LocalDateTime localDateTime13 = null;
        reservation1.setStartTime(localDateTime13);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand15 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setCanceled(true);
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
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
        java.lang.String str29 = room6.getName();
        room6.setRoomId("ADMIN-69");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Cancelled" + "'", str29, "Cancelled");
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setEnabled(true);
        int int10 = room6.getCapacity();
        room6.setCapacity((int) '#');
        room6.setRoomNumber("partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
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
        boolean boolean25 = room6.isClosedForMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor90 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor90.isDetected = false;
        java.lang.String str93 = occupancySensor90.getRoomId();
        boolean boolean94 = occupancySensor90.isDetected();
        checkInPublisher62.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor90);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Pending" + "'", str29, "Pending");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(checkInPublisher84);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Pending" + "'", str93, "Pending");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        java.time.LocalDateTime localDateTime1 = null;
        reservation0.setEndTime(localDateTime1);
        double double3 = reservation0.getDepositAmount();
        java.lang.String str4 = reservation0.getTitle();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
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
        java.lang.String str33 = confirmedBookingState0.getName();
        java.lang.String str34 = confirmedBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking confirmed." + "'", str1, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking confirmed." + "'", str2, "Booking confirmed.");
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Booking confirmed." + "'", str32, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Booking confirmed." + "'", str33, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Booking confirmed." + "'", str34, "Booking confirmed.");
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService11 = null;
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation();
        reservation12.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod15 = reservation12.getPaymentMethod();
        reservation12.setFinalAmount((double) (byte) 1);
        java.lang.String str18 = reservation12.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand19 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService11, reservation12);
        reservation12.setHourlyRate((double) 0L);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod42 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation43 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime36, localDateTime37, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod42);
        com.conferenceroomscheduler.model.Reservation reservation44 = new com.conferenceroomscheduler.model.Reservation("admin", "", "Booking complete", "Pending", localDateTime26, localDateTime27, "", (double) 'a', (double) 10L, 0.0d, paymentMethod42);
        reservation12.setPaymentMethod(paymentMethod42);
        com.conferenceroomscheduler.model.Reservation reservation46 = new com.conferenceroomscheduler.model.Reservation("partner", "student", "", "student", localDateTime5, localDateTime6, "Unverified badge detected for Cancelled.", (double) (short) -1, 10.0d, 97.0d, paymentMethod42);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand47 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation46);
        reservation46.setCanceled(false);
        reservation46.setExtended(true);
        org.junit.Assert.assertNull(paymentMethod15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + paymentMethod42 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod42.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setEnabled(true);
        java.lang.String str13 = room6.getName();
        boolean boolean14 = room6.isEnabled();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor15 = room6.getOccupancySensor();
        int int16 = room6.getCapacity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(occupancySensor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
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
        com.conferenceroomscheduler.model.Reservation reservation36 = bookingContext21.getReservation();
        com.conferenceroomscheduler.patterns.BookingState bookingState37 = bookingContext21.getState();
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
        org.junit.Assert.assertNull(reservation36);
        org.junit.Assert.assertNotNull(bookingState37);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        reservation1.setCanceled(false);
        java.time.LocalDateTime localDateTime9 = null;
        reservation1.setStartTime(localDateTime9);
        reservation1.setReservationId("hi!");
        java.time.LocalDateTime localDateTime13 = null;
        reservation1.setEndTime(localDateTime13);
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand16 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime15);
        boolean boolean17 = extendBookingCommand16.wasSuccessful();
        boolean boolean18 = extendBookingCommand16.wasSuccessful();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Verified badge detected for Checked in..", "Verified badge detected for Checked in..", "ADMIN-69", "", 100, localDateTime5, localDateTime6);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
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
        reservation1.setRoomId("Booking complete");
        double double30 = reservation1.getFinalAmount();
        reservation1.setReservationId("partner");
        reservation1.setCheckedIn(true);
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand35 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod24 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod24.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setCheckedIn(true);
        java.lang.String str9 = reservation0.getAccountType();
        reservation0.setReservationId("student");
        boolean boolean12 = reservation0.isCheckedIn();
        reservation0.setRoomId("Unverified badge detected for Cancelled.");
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Unverified badge detected for .", "admin", "Booking complete", false, false, "Booking confirmed.");
        java.lang.String str7 = partnerAccount6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
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
        java.lang.String str30 = room6.getBuilding();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        reservation0.setDepositLost(true);
        reservation0.setHourlyRate(100.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
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
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher32 = occupancySensor15.subject;
        occupancySensor15.occupied = false;
        boolean boolean35 = occupancySensor15.isDetected;
        boolean boolean36 = occupancySensor15.isDetected();
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Pending" + "'", str29, "Pending");
        org.junit.Assert.assertNull(checkInPublisher32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor0 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor0.update("Checked in.");
        roomSensor0.update("hi!");
        roomSensor0.update("student");
        roomSensor0.update("Verified badge detected for ADMIN-69.");
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = null;
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime5, localDateTime6, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod11);
        reservation12.setDepositLost(true);
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand16 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation12, localDateTime15);
        double double17 = reservation12.getHourlyRate();
        boolean boolean18 = reservation12.isExtended();
        reservation12.setTitle("Cancelled");
        java.time.LocalDateTime localDateTime21 = null;
        reservation12.setEndTime(localDateTime21);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory0 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account8 = facultyFactory0.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account16 = facultyFactory0.createAccount("", "hi!", "", "", false, true, "");
        account16.setAccountNumber("Checked in.");
        account16.setIdentifier("hi!");
        java.lang.String str21 = account16.getPassword();
        account16.setAccountType("");
        com.conferenceroomscheduler.model.Badge badge24 = account16.getBadge();
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(badge24);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod10 = null;
        com.conferenceroomscheduler.model.Reservation reservation11 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime4, localDateTime5, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod10);
        reservation11.setUserId("");
        double double14 = reservation11.getFinalAmount();
        boolean boolean15 = reservation11.isExtended();
        java.lang.String str16 = reservation11.getUserId();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod10 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation11 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime4, localDateTime5, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod10);
        reservation11.setDepositLost(false);
        reservation11.setHourlyRate((double) (short) 1);
        reservation11.setUserId("faculty");
        reservation11.setCanceled(true);
        org.junit.Assert.assertTrue("'" + paymentMethod10 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod10.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Checked in.", "Booking complete", (int) (byte) -1, true, "Pending", "Pending");
        room6.setName("Checked in.");
        com.conferenceroomscheduler.model.Room room15 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str16 = room15.getRoomId();
        room15.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount25 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room15.checkIn((com.conferenceroomscheduler.model.Account) studentAccount25);
        boolean boolean27 = room15.isEnabled();
        boolean boolean28 = room15.isEnabled();
        room15.setBuilding("Pending");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher31 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor35 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean36 = occupancySensor35.isDetected();
        occupancySensor35.occupied = false;
        checkInPublisher31.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor35);
        occupancySensor35.setOccupied(true);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher42 = occupancySensor35.getSubject();
        room15.setOccupancySensor(occupancySensor35);
        java.lang.String str44 = occupancySensor35.getRoomId();
        room6.setOccupancySensor(occupancySensor35);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(checkInPublisher42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Pending" + "'", str44, "Pending");
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
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
        badge20.setAccountId("Checked in.");
        badge20.setVerified(false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking confirmed." + "'", str23, "Booking confirmed.");
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
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
        boolean boolean15 = reservation0.isExtended();
        reservation0.setRoomId("faculty");
        double double18 = reservation0.getDepositAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        boolean boolean9 = occupancySensor4.isDetected;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher10 = occupancySensor4.subject;
        occupancySensor4.roomId = "hi!";
        java.lang.String str13 = occupancySensor4.getRoomId();
        boolean boolean14 = occupancySensor4.isDetected;
        java.lang.String str15 = occupancySensor4.roomId;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(checkInPublisher10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
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
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher86 = occupancySensor3.subject;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher87 = occupancySensor3.subject;
        org.junit.Assert.assertNotNull(account12);
        org.junit.Assert.assertNotNull(account20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(account62);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(checkInPublisher86);
        org.junit.Assert.assertNotNull(checkInPublisher87);
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Cancelled", "Booking confirmed.", false);
        badgeScan3.setVerified(true);
        boolean boolean6 = badgeScan3.isVerified();
        badgeScan3.setVerified(false);
        java.lang.String str9 = badgeScan3.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking confirmed." + "'", str9, "Booking confirmed.");
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "Booking complete", true);
        boolean boolean4 = badgeScan3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor3.setDetected(false);
        occupancySensor3.setRoomId("Checked in.");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher8 = occupancySensor3.subject;
        boolean boolean9 = occupancySensor3.isOccupied();
        org.junit.Assert.assertNull(checkInPublisher8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        java.lang.String str3 = reservation0.getUserId();
        boolean boolean4 = reservation0.isDepositLost();
        double double5 = reservation0.getHourlyRate();
        double double6 = reservation0.getDepositAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
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
        com.conferenceroomscheduler.model.Reservation reservation19 = bookingContext16.getReservation();
        reservation19.setCheckedIn(true);
        java.time.LocalDateTime localDateTime22 = reservation19.getStartTime();
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertNotNull(reservation19);
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setEnabled(true);
        java.lang.String str13 = room6.getName();
        room6.setName("Cancelled");
        room6.setCapacity((int) (short) 10);
        java.lang.String str18 = room6.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService2 = null;
        com.conferenceroomscheduler.model.Reservation reservation3 = new com.conferenceroomscheduler.model.Reservation();
        reservation3.setFinalAmount((double) (byte) 100);
        java.lang.String str6 = reservation3.getRoomId();
        reservation3.setFinalAmount((double) 10.0f);
        java.lang.String str9 = reservation3.getUserId();
        reservation3.setDepositAmount((double) (byte) 0);
        boolean boolean12 = reservation3.isExtended();
        reservation3.setRoomId("Checked in.");
        reservation3.setReservationId("Booking complete");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand17 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService2, reservation3);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand18 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation3);
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand19 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setDepositAmount(0.0d);
        reservation1.setAccountType("");
        java.lang.String str9 = reservation1.getUserId();
        reservation1.setDepositAmount((double) (short) 100);
        boolean boolean12 = reservation1.isCanceled();
        java.time.LocalDateTime localDateTime13 = reservation1.getStartTime();
        java.time.LocalDateTime localDateTime14 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand15 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime14);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand15.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.extendBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        reservation0.setAccountType("");
        double double12 = reservation0.getHourlyRate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        java.time.LocalDateTime localDateTime1 = null;
        reservation0.setEndTime(localDateTime1);
        reservation0.setHourlyRate((double) 'a');
        boolean boolean5 = reservation0.isCheckedIn();
        reservation0.setHourlyRate(10.0d);
        java.lang.String str8 = reservation0.getReservationId();
        reservation0.setRoomId("Pending");
        reservation0.setUserId("partner");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setFinalAmount((double) ' ');
        reservation0.setDepositAmount((-1.0d));
        reservation0.setDepositAmount((double) ' ');
        com.conferenceroomscheduler.patterns.BookingContext bookingContext13 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState6 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str7 = cancelledBookingState6.getName();
        bookingContext5.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState6);
        com.conferenceroomscheduler.model.Reservation reservation9 = bookingContext5.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation10 = bookingContext5.getReservation();
        double double11 = reservation10.getHourlyRate();
        java.lang.String str12 = reservation10.getUserId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cancelled" + "'", str7, "Cancelled");
        org.junit.Assert.assertNotNull(reservation9);
        org.junit.Assert.assertNotNull(reservation10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.isDetected;
        occupancySensor3.roomId = "Booking confirmed.";
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher9 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean14 = occupancySensor13.isDetected();
        occupancySensor13.occupied = false;
        checkInPublisher9.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor13);
        boolean boolean18 = occupancySensor13.isDetected;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher19 = occupancySensor13.subject;
        occupancySensor13.roomId = "hi!";
        java.lang.String str22 = occupancySensor13.getRoomId();
        occupancySensor13.occupied = false;
        com.conferenceroomscheduler.model.Account account25 = null;
        boolean boolean26 = occupancySensor13.detectOccupancy(account25);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher27 = occupancySensor13.getSubject();
        occupancySensor3.setSubject(checkInPublisher27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(checkInPublisher19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(checkInPublisher27);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext4 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        bookingContext4.request();
        com.conferenceroomscheduler.model.Reservation reservation6 = bookingContext4.getReservation();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNotNull(reservation6);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Unverified badge detected for Cancelled.", "", false);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState0 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext2 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState3 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext2.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState3);
        com.conferenceroomscheduler.patterns.BookingState bookingState5 = bookingContext2.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState6 = bookingContext2.getState();
        cancelledBookingState0.handle(bookingContext2);
        com.conferenceroomscheduler.patterns.BookingState bookingState8 = bookingContext2.getState();
        java.lang.String str9 = bookingState8.getName();
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("student", "Checked in.", false);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount6.setAccountId("Booking complete");
        adminAccount6.setIdentifier("");
        adminAccount6.setVerified(false);
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str1 = adminAccount0.getEmail();
        adminAccount0.setVerified(false);
        boolean boolean4 = adminAccount0.isUniversityAccount();
        adminAccount0.setVerified(true);
        adminAccount0.setUniversityAccount(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
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
        com.conferenceroomscheduler.model.AdminAccount adminAccount53 = new com.conferenceroomscheduler.model.AdminAccount("", "Booking confirmed.", "", false, false, "");
        adminAccount53.setAccountId("");
        java.lang.String str56 = adminAccount53.getAccountId();
        java.lang.String str57 = adminAccount53.getAccountId();
        boolean boolean58 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount53);
        java.lang.String str59 = adminAccount53.getAccountId();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(checkInPublisher38);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("Verified badge detected for ADMIN-69.", "Verified badge detected for Checked in..", "faculty", false, false, "partner");
        boolean boolean7 = adminAccount6.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        reservation0.setExtended(true);
        reservation0.setAccountType("hi!");
        reservation0.setCanceled(false);
        reservation0.setExtended(true);
        double double18 = reservation0.getFinalAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        boolean boolean1 = adminAccount0.isVerified();
        adminAccount0.setPassword("");
        java.lang.String str4 = adminAccount0.getPassword();
        adminAccount0.setAccountNumber("Cancelled");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        java.time.LocalDateTime localDateTime10 = reservation0.getStartTime();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = reservation0.getPaymentMethod();
        java.lang.String str12 = reservation0.getRoomId();
        java.lang.String str13 = reservation0.getReservationId();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext14 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(paymentMethod11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }
}

