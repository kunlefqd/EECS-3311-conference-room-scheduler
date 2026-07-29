package testRandoop.java;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("admin", "Pending", false);
        boolean boolean4 = badge3.isVerified();
        java.lang.String str5 = badge3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        reservation0.setCanceled(false);
        java.time.LocalDateTime localDateTime8 = null;
        reservation0.setStartTime(localDateTime8);
        reservation0.setReservationId("hi!");
        double double12 = reservation0.getDepositAmount();
        reservation0.setTitle("Booking confirmed.");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        room6.setClosedForMaintenance(false);
        boolean boolean14 = room6.isEnabled();
        room6.setEnabled(false);
        room6.setCapacity(100);
        room6.setRoomId("student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        java.lang.String str31 = badge20.getAccountId();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking confirmed." + "'", str23, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getOrganizerId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.lang.String str11 = bookingRequest7.getTitle();
        int int12 = bookingRequest7.getAttendeeCount();
        java.time.LocalDateTime localDateTime13 = bookingRequest7.getStartTime();
        int int14 = bookingRequest7.getAttendeeCount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        boolean boolean11 = room6.isEnabled();
        room6.setClosedForMaintenance(false);
        boolean boolean14 = room6.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        badge20.setEmail("Cancelled");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking confirmed." + "'", str23, "Booking confirmed.");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState19 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState20 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation21 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext22 = new com.conferenceroomscheduler.patterns.BookingContext(reservation21);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState23 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext22.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState23);
        com.conferenceroomscheduler.patterns.BookingState bookingState25 = bookingContext22.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState26 = bookingContext22.getState();
        cancelledBookingState20.handle(bookingContext22);
        checkedInBookingState19.handle(bookingContext22);
        java.lang.String str29 = checkedInBookingState19.getName();
        com.conferenceroomscheduler.model.Reservation reservation30 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext31 = new com.conferenceroomscheduler.patterns.BookingContext(reservation30);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState32 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext31.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState32);
        com.conferenceroomscheduler.model.Reservation reservation34 = bookingContext31.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation35 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext36 = new com.conferenceroomscheduler.patterns.BookingContext(reservation35);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState37 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext36.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState37);
        com.conferenceroomscheduler.patterns.BookingState bookingState39 = bookingContext36.getState();
        bookingContext31.setState(bookingState39);
        checkedInBookingState19.handle(bookingContext31);
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
        java.lang.String str52 = checkedInBookingState42.getName();
        com.conferenceroomscheduler.model.Reservation reservation53 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext54 = new com.conferenceroomscheduler.patterns.BookingContext(reservation53);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState55 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext54.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState55);
        com.conferenceroomscheduler.model.Reservation reservation57 = bookingContext54.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation58 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext59 = new com.conferenceroomscheduler.patterns.BookingContext(reservation58);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState60 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext59.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState60);
        com.conferenceroomscheduler.patterns.BookingState bookingState62 = bookingContext59.getState();
        bookingContext54.setState(bookingState62);
        checkedInBookingState42.handle(bookingContext54);
        bookingContext31.setState((com.conferenceroomscheduler.patterns.BookingState) checkedInBookingState42);
        cancelledBookingState0.handle(bookingContext31);
        java.lang.String str67 = cancelledBookingState0.getName();
        java.lang.String str68 = cancelledBookingState0.getName();
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertNotNull(bookingState26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Checked in." + "'", str29, "Checked in.");
        org.junit.Assert.assertNull(reservation34);
        org.junit.Assert.assertNotNull(bookingState39);
        org.junit.Assert.assertNotNull(bookingState48);
        org.junit.Assert.assertNotNull(bookingState49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Checked in." + "'", str52, "Checked in.");
        org.junit.Assert.assertNull(reservation57);
        org.junit.Assert.assertNotNull(bookingState62);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Cancelled" + "'", str67, "Cancelled");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Cancelled" + "'", str68, "Cancelled");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        boolean boolean53 = occupancySensor3.occupied;
        com.conferenceroomscheduler.model.AdminAccount adminAccount60 = new com.conferenceroomscheduler.model.AdminAccount("", "ADMIN-69", "hi!", false, false, "Booking confirmed.");
        boolean boolean61 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount60);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(checkInPublisher7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(checkInPublisher15);
        org.junit.Assert.assertNull(checkInPublisher16);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation2.getPaymentMethod();
        reservation2.setFinalAmount((double) (byte) 1);
        java.lang.String str8 = reservation2.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand9 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService1, reservation2);
        reservation2.setHourlyRate((double) 0L);
        boolean boolean12 = reservation2.isCheckedIn();
        double double13 = reservation2.getFinalAmount();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand14 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation2);
        // The following exception was thrown during execution in test generation
        try {
            createBookingCommand14.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.addReservation(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        com.conferenceroomscheduler.patterns.BookingState bookingState24 = bookingContext12.getState();
        com.conferenceroomscheduler.model.Reservation reservation25 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext26 = new com.conferenceroomscheduler.patterns.BookingContext(reservation25);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState27 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext26.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState27);
        java.lang.String str29 = cancelledBookingState27.getName();
        java.lang.String str30 = cancelledBookingState27.getName();
        bookingContext12.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState27);
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
        bookingContext40.request();
        java.lang.String str48 = bookingContext40.getStatus();
        cancelledBookingState27.handle(bookingContext40);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Checked in." + "'", str10, "Checked in.");
        org.junit.Assert.assertNull(reservation15);
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertNull(reservation23);
        org.junit.Assert.assertNotNull(bookingState24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Cancelled" + "'", str29, "Cancelled");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Cancelled" + "'", str30, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState43);
        org.junit.Assert.assertNotNull(bookingState44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Cancelled" + "'", str48, "Cancelled");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.time.LocalDateTime localDateTime9 = bookingRequest7.getEndTime();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getStartTime();
        int int11 = bookingRequest7.getAttendeeCount();
        java.lang.String str12 = bookingRequest7.getRoomId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cancelled" + "'", str12, "Cancelled");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("admin", false, true);
        boolean boolean4 = occupancySensor3.isDetected();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        // The following exception was thrown during execution in test generation
        try {
            editBookingCommand16.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.editBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        com.conferenceroomscheduler.model.AdminAccount adminAccount34 = new com.conferenceroomscheduler.model.AdminAccount("", "Booking confirmed.", "", false, false, "");
        adminAccount34.setAccountId("");
        boolean boolean37 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount34);
        boolean boolean38 = occupancySensor3.occupied;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        occupancySensor3.occupied = true;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher8 = occupancySensor3.subject;
        occupancySensor3.setDetected(true);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor14 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount21 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean22 = occupancySensor14.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount21);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher23 = null;
        occupancySensor14.setSubject(checkInPublisher23);
        occupancySensor14.isDetected = false;
        boolean boolean27 = occupancySensor14.isOccupied();
        com.conferenceroomscheduler.model.Badge badge31 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str32 = badge31.getEmail();
        boolean boolean33 = occupancySensor14.scanIdBadge(badge31);
        java.lang.String str34 = badge31.getAccountId();
        badge31.setAccountId("Cancelled");
        badge31.setAccountId("");
        java.lang.String str39 = badge31.getAccountId();
        java.lang.String str40 = badge31.getEmail();
        boolean boolean41 = occupancySensor3.scanIdBadge(badge31);
        java.lang.String str42 = badge31.getAccountId();
        java.lang.String str43 = badge31.getEmail();
        org.junit.Assert.assertNull(checkInPublisher8);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Cancelled" + "'", str32, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Booking confirmed." + "'", str34, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Cancelled" + "'", str40, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Cancelled" + "'", str43, "Cancelled");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        room6.setCapacity((int) (short) 0);
        room6.setClosedForMaintenance(true);
        java.lang.String str15 = room6.getBuilding();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        boolean boolean24 = occupancySensor3.occupied;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor28 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor28.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount37 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount37.setEmail("");
        boolean boolean40 = occupancySensor28.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount37);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor44 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean45 = occupancySensor44.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher46 = null;
        occupancySensor44.subject = checkInPublisher46;
        occupancySensor44.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher50 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor54 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher55 = null;
        occupancySensor54.setSubject(checkInPublisher55);
        occupancySensor54.occupied = true;
        occupancySensor54.setDetected(false);
        checkInPublisher50.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor54);
        occupancySensor44.setSubject(checkInPublisher50);
        com.conferenceroomscheduler.model.StudentAccount studentAccount69 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        checkInPublisher50.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount69);
        occupancySensor28.subject = checkInPublisher50;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor75 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount82 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean83 = occupancySensor75.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount82);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher84 = null;
        occupancySensor75.setSubject(checkInPublisher84);
        occupancySensor75.isDetected = false;
        boolean boolean88 = occupancySensor75.isOccupied();
        com.conferenceroomscheduler.model.Badge badge92 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str93 = badge92.getEmail();
        boolean boolean94 = occupancySensor75.scanIdBadge(badge92);
        java.lang.String str95 = occupancySensor75.getRoomId();
        checkInPublisher50.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor75);
        occupancySensor3.subject = checkInPublisher50;
        boolean boolean98 = occupancySensor3.isDetected();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pending" + "'", str23, "Pending");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Cancelled" + "'", str93, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "Pending" + "'", str95, "Pending");
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        java.lang.String str4 = reservation1.getUserId();
        boolean boolean5 = reservation1.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod6 = reservation1.getPaymentMethod();
        reservation1.setCanceled(false);
        reservation1.setRoomId("");
        boolean boolean11 = reservation1.isExtended();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand12 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Pending", "faculty", "hi!", "Checked in.", 1, localDateTime5, localDateTime6);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("student", "Pending", "Unverified badge detected for .", true, false, "partner");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand6 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str7 = reservation1.getTitle();
        boolean boolean8 = reservation1.isDepositLost();
        reservation1.setFinalAmount((double) 100.0f);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        com.conferenceroomscheduler.model.Account account46 = new com.conferenceroomscheduler.model.Account("Pending", "ADMIN-69", "Booking confirmed.", "faculty", false, true, "Pending");
        checkInPublisher37.notifyObservers(account46);
        boolean boolean48 = account46.isUniversityAccount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(checkInPublisher37);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        adminAccount24.setUniversityAccount(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(occupancySensor21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(badge28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("student", "Booking complete", "Pending", false, false, "");
        java.lang.String str7 = facultyAccount6.getAccountType();
        facultyAccount6.setUniversityAccount(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        java.lang.String str21 = room6.getBuilding();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setHourlyRate((double) (byte) 100);
        boolean boolean5 = reservation2.isDepositLost();
        java.lang.String str6 = reservation2.getUserId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand7 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService1, reservation2);
        java.time.LocalDateTime localDateTime8 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand9 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation2, localDateTime8);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand9.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.extendBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        double double10 = reservation0.getHourlyRate();
        reservation0.setRoomId("Pending");
        boolean boolean13 = reservation0.isExtended();
        java.lang.String str14 = reservation0.getUserId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setRoomNumber("Pending");
        room6.setRoomId("faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        room6.setClosedForMaintenance(true);
        boolean boolean15 = room6.isClosedForMaintenance();
        boolean boolean16 = room6.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod10 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation11 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime4, localDateTime5, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod10);
        java.time.LocalDateTime localDateTime12 = null;
        reservation11.setEndTime(localDateTime12);
        double double14 = reservation11.getDepositAmount();
        org.junit.Assert.assertTrue("'" + paymentMethod10 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod10.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Booking complete", "", "Booking complete", (int) (byte) -1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("", "ADMIN-69", "", false, true, "Unverified badge detected for Cancelled.");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        com.conferenceroomscheduler.model.Reservation reservation47 = new com.conferenceroomscheduler.model.Reservation("student", "", "Booking complete", "Pending", localDateTime4, localDateTime5, "Checked in.", 0.0d, (double) 'a', (double) (-1.0f), paymentMethod43);
        java.lang.String str48 = reservation47.getReservationId();
        double double49 = reservation47.getFinalAmount();
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod43 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod43.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "student" + "'", str48, "student");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1.0d) + "'", double49 == (-1.0d));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("Unverified badge detected for Cancelled.", "partner", "Cancelled", false, false, "partner");
        adminAccount6.setAccountType("faculty");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        com.conferenceroomscheduler.model.Reservation reservation55 = bookingContext51.getReservation();
        double double56 = reservation55.getDepositAmount();
        boolean boolean57 = reservation55.isExtended();
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
        org.junit.Assert.assertNotNull(reservation55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setHourlyRate((double) (byte) 100);
        boolean boolean4 = reservation1.isDepositLost();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand5 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        boolean boolean6 = cancelBookingCommand5.wasSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand5.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Checked in.", "Unverified badge detected for Cancelled.", 52, true, "hi!", "Booking complete");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        reservation12.setDepositAmount((double) (short) 10);
        java.time.LocalDateTime localDateTime22 = null;
        reservation12.setEndTime(localDateTime22);
        double double24 = reservation12.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("Checked in.", "admin", "Booking complete", true, false, "hi!");
        adminAccount6.setPassword("admin");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Unverified badge detected for Cancelled.", (int) (byte) 10, true, "student", "Booking confirmed.");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState32 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState33 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation34 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext35 = new com.conferenceroomscheduler.patterns.BookingContext(reservation34);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState36 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext35.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState36);
        com.conferenceroomscheduler.patterns.BookingState bookingState38 = bookingContext35.getState();
        com.conferenceroomscheduler.model.Reservation reservation39 = bookingContext35.getReservation();
        cancelledBookingState33.handle(bookingContext35);
        checkedInBookingState32.handle(bookingContext35);
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
        checkedInBookingState32.handle(bookingContext45);
        com.conferenceroomscheduler.model.Reservation reservation53 = bookingContext45.getReservation();
        confirmedBookingState0.handle(bookingContext45);
        com.conferenceroomscheduler.model.Reservation reservation55 = bookingContext45.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation56 = bookingContext45.getReservation();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking confirmed." + "'", str1, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking confirmed." + "'", str2, "Booking confirmed.");
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertNull(reservation39);
        org.junit.Assert.assertNotNull(bookingState48);
        org.junit.Assert.assertNotNull(bookingState49);
        org.junit.Assert.assertNull(reservation53);
        org.junit.Assert.assertNull(reservation55);
        org.junit.Assert.assertNull(reservation56);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand6 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str7 = reservation1.getTitle();
        boolean boolean8 = reservation1.isDepositLost();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext9 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        room6.setClosedForMaintenance(false);
        room6.setEnabled(true);
        int int17 = room6.getCapacity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        boolean boolean9 = reservation0.isExtended();
        java.lang.String str10 = reservation0.getRoomId();
        boolean boolean11 = reservation0.isDepositLost();
        java.time.LocalDateTime localDateTime12 = null;
        reservation0.setEndTime(localDateTime12);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setEnabled(false);
        java.lang.String str9 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = room6.getOccupancySensor();
        occupancySensor10.occupied = true;
        com.conferenceroomscheduler.model.StudentAccount studentAccount19 = new com.conferenceroomscheduler.model.StudentAccount("hi!", "Checked in.", "Checked in.", true, true, "hi!");
        boolean boolean20 = occupancySensor10.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount19);
        boolean boolean21 = occupancySensor10.occupied;
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(occupancySensor10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        com.conferenceroomscheduler.model.Reservation reservation47 = new com.conferenceroomscheduler.model.Reservation("student", "", "Booking complete", "Pending", localDateTime4, localDateTime5, "Checked in.", 0.0d, (double) 'a', (double) (-1.0f), paymentMethod43);
        java.lang.String str48 = reservation47.getReservationId();
        boolean boolean49 = reservation47.isCanceled();
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod43 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod43.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "student" + "'", str48, "student");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        com.conferenceroomscheduler.model.Reservation reservation58 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext59 = new com.conferenceroomscheduler.patterns.BookingContext(reservation58);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState60 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext59.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState60);
        bookingContext59.request();
        completedBookingState0.handle(bookingContext59);
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
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("", "Checked in.", "student", false, true, "Pending");
        boolean boolean7 = adminAccount6.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        occupancySensor3.setOccupied(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pending" + "'", str6, "Pending");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(checkInPublisher39);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.isDetected;
        java.lang.String str7 = occupancySensor3.getLastEvent();
        com.conferenceroomscheduler.model.StudentAccount studentAccount14 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        com.conferenceroomscheduler.model.Badge badge15 = studentAccount14.getBadge();
        badge15.setEmail("Checked in.");
        boolean boolean18 = occupancySensor3.scanIdBadge(badge15);
        occupancySensor3.isDetected = true;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(badge15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setDepositAmount(0.0d);
        reservation0.setAccountType("");
        reservation0.setDepositLost(true);
        org.junit.Assert.assertNull(paymentMethod3);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        boolean boolean13 = room6.isEnabled();
        java.lang.String str14 = room6.getRoomNumber();
        int int15 = room6.getCapacity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("Unverified badge detected for .", "faculty", "faculty", "partner", true, false, "");
        java.lang.String str8 = account7.getAccountNumber();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        boolean boolean9 = reservation0.isExtended();
        reservation0.setAccountType("faculty");
        double double12 = reservation0.getHourlyRate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setCheckedIn(true);
        reservation0.setCheckedIn(false);
        reservation0.setExtended(true);
        reservation0.setAccountType("student");
        reservation0.setDepositLost(true);
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy institutionalBillingPaymentStrategy0 = new com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy();
        boolean boolean3 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", 0.0d);
        boolean boolean6 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", (double) (short) 1);
        boolean boolean9 = institutionalBillingPaymentStrategy0.processPayment("Cancelled", 32.0d);
        boolean boolean12 = institutionalBillingPaymentStrategy0.processPayment("faculty", (double) 1);
        boolean boolean15 = institutionalBillingPaymentStrategy0.processPayment("", (double) 0);
        boolean boolean18 = institutionalBillingPaymentStrategy0.processPayment("Unverified badge detected for Cancelled.", (-1.0d));
        boolean boolean21 = institutionalBillingPaymentStrategy0.processPayment("partner", (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        occupancySensor3.setDetected(true);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher8 = occupancySensor3.subject;
        occupancySensor3.isDetected = false;
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory11 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account19 = facultyFactory11.createAccount("Booking confirmed.", "hi!", "Cancelled", "student", true, false, "Booking complete");
        com.conferenceroomscheduler.model.Badge badge20 = account19.getBadge();
        account19.setUniversityAccount(true);
        boolean boolean23 = occupancySensor3.detectOccupancy(account19);
        occupancySensor3.roomId = "";
        org.junit.Assert.assertNull(checkInPublisher8);
        org.junit.Assert.assertNotNull(account19);
        org.junit.Assert.assertNotNull(badge20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getName();
        int int13 = room6.getCapacity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cancelled" + "'", str12, "Cancelled");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState6 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str7 = cancelledBookingState6.getName();
        bookingContext5.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState6);
        com.conferenceroomscheduler.model.Reservation reservation9 = bookingContext5.getReservation();
        reservation9.setDepositLost(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cancelled" + "'", str7, "Cancelled");
        org.junit.Assert.assertNotNull(reservation9);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("Pending", "admin", "Booking complete", false, true, "");
        staffAccount6.setIdentifier("Cancelled");
        java.lang.String str9 = staffAccount6.getPassword();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking complete" + "'", str9, "Booking complete");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setDepositAmount(0.0d);
        reservation0.setDepositLost(true);
        org.junit.Assert.assertNull(paymentMethod3);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        room6.setName("Unverified badge detected for .");
        boolean boolean13 = room6.isEnabled();
        room6.setName("Unverified badge detected for .");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setDepositAmount(0.0d);
        java.lang.String str6 = reservation0.getUserId();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setHourlyRate((double) (byte) 100);
        boolean boolean3 = reservation0.isDepositLost();
        java.lang.String str4 = reservation0.getUserId();
        java.lang.String str5 = reservation0.getUserId();
        boolean boolean6 = reservation0.isCanceled();
        reservation0.setDepositLost(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        occupancySensor3.setDetected(true);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher8 = occupancySensor3.subject;
        occupancySensor3.isDetected = false;
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory11 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account19 = facultyFactory11.createAccount("Booking confirmed.", "hi!", "Cancelled", "student", true, false, "Booking complete");
        com.conferenceroomscheduler.model.Badge badge20 = account19.getBadge();
        account19.setUniversityAccount(true);
        boolean boolean23 = occupancySensor3.detectOccupancy(account19);
        account19.setAccountNumber("Pending");
        org.junit.Assert.assertNull(checkInPublisher8);
        org.junit.Assert.assertNotNull(account19);
        org.junit.Assert.assertNotNull(badge20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount0.setAccountNumber("hi!");
        java.lang.String str3 = adminAccount0.getAccountId();
        java.lang.String str4 = adminAccount0.getEmail();
        java.lang.String str5 = adminAccount0.getAccountType();
        boolean boolean6 = adminAccount0.isUniversityAccount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        occupancySensor3.roomId = "hi!";
        occupancySensor3.setRoomId("Cancelled");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        com.conferenceroomscheduler.model.Reservation reservation55 = bookingContext51.getReservation();
        boolean boolean56 = reservation55.isDepositLost();
        java.time.LocalDateTime localDateTime57 = reservation55.getStartTime();
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
        org.junit.Assert.assertNotNull(reservation55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(localDateTime57);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.time.LocalDateTime localDateTime3 = reservation1.getEndTime();
        java.time.LocalDateTime localDateTime4 = reservation1.getStartTime();
        org.junit.Assert.assertNull(localDateTime3);
        org.junit.Assert.assertNull(localDateTime4);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getReservationId();
        java.lang.String str4 = reservation1.getTitle();
        java.time.LocalDateTime localDateTime5 = null;
        reservation1.setStartTime(localDateTime5);
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + paymentMethod37 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod37.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("admin", "Booking complete", "Pending", "Checked in.", (int) (short) -1, localDateTime5, localDateTime6);
        int int8 = bookingRequest7.getAttendeeCount();
        java.lang.String str9 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Pending" + "'", str9, "Pending");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Pending", "Pending", (int) (short) -1, "", "Cancelled");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("faculty", "Cancelled", (int) '#', "Cancelled", "ADMIN-69");
        boolean boolean19 = room18.isClosedForMaintenance();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher55 = occupancySensor48.getSubject();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor59 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher60 = null;
        occupancySensor59.setSubject(checkInPublisher60);
        occupancySensor59.setDetected(true);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher64 = occupancySensor59.subject;
        checkInPublisher55.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor59);
        boolean boolean66 = occupancySensor59.isDetected;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(checkInPublisher52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(checkInPublisher55);
        org.junit.Assert.assertNull(checkInPublisher64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getAccountType();
        java.lang.String str5 = reservation2.getAccountType();
        boolean boolean6 = reservation2.isCheckedIn();
        java.time.LocalDateTime localDateTime7 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand8 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation2, localDateTime7);
        boolean boolean9 = extendBookingCommand8.wasSuccessful();
        boolean boolean10 = extendBookingCommand8.wasSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand8.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.extendBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getRequestId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        java.lang.String str13 = reservation1.getTitle();
        double double14 = reservation1.getFinalAmount();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        room6.setCapacity(0);
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor36 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount43 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean44 = occupancySensor36.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount43);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor48 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor48.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount57 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount57.setEmail("");
        boolean boolean60 = occupancySensor48.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount57);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor64 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean65 = occupancySensor64.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher66 = null;
        occupancySensor64.subject = checkInPublisher66;
        occupancySensor64.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher70 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor74 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher75 = null;
        occupancySensor74.setSubject(checkInPublisher75);
        occupancySensor74.occupied = true;
        occupancySensor74.setDetected(false);
        checkInPublisher70.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor74);
        occupancySensor64.setSubject(checkInPublisher70);
        com.conferenceroomscheduler.model.StudentAccount studentAccount89 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        checkInPublisher70.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount89);
        occupancySensor48.subject = checkInPublisher70;
        occupancySensor36.subject = checkInPublisher70;
        occupancySensor3.setSubject(checkInPublisher70);
        java.lang.String str94 = occupancySensor3.roomId;
        boolean boolean95 = occupancySensor3.isDetected;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Booking confirmed." + "'", str31, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        com.conferenceroomscheduler.model.AdminAccount adminAccount30 = new com.conferenceroomscheduler.model.AdminAccount();
        checkInPublisher0.notifyObservers((com.conferenceroomscheduler.model.Account) adminAccount30);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor35 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount42 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean43 = occupancySensor35.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount42);
        java.lang.String str44 = occupancySensor35.roomId;
        boolean boolean45 = occupancySensor35.isOccupied();
        com.conferenceroomscheduler.model.StudentAccount studentAccount52 = new com.conferenceroomscheduler.model.StudentAccount("Cancelled", "Cancelled", "Pending", false, true, "Checked in.");
        boolean boolean53 = occupancySensor35.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount52);
        checkInPublisher0.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor35);
        com.conferenceroomscheduler.model.Room room61 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str62 = room61.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor63 = null;
        room61.setOccupancySensor(occupancySensor63);
        room61.setBuilding("");
        room61.setClosedForMaintenance(false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor72 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher73 = null;
        occupancySensor72.setSubject(checkInPublisher73);
        java.lang.String str75 = occupancySensor72.getRoomId();
        room61.setOccupancySensor(occupancySensor72);
        checkInPublisher0.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor72);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher78 = occupancySensor72.subject;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Pending" + "'", str44, "Pending");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNull(checkInPublisher78);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        com.conferenceroomscheduler.model.Badge badge18 = studentAccount16.getBadge();
        studentAccount16.setAccountNumber("");
        studentAccount16.setAccountId("partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(badge18);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str1 = adminAccount0.getEmail();
        adminAccount0.setVerified(false);
        java.lang.String str4 = adminAccount0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        boolean boolean28 = occupancySensor22.isOccupied();
        java.lang.String str29 = occupancySensor22.roomId;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Pending" + "'", str29, "Pending");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setHourlyRate((double) (byte) 100);
        boolean boolean4 = reservation1.isDepositLost();
        java.time.LocalDateTime localDateTime5 = null;
        reservation1.setEndTime(localDateTime5);
        reservation1.setRoomId("");
        java.lang.String str9 = reservation1.getUserId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand10 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        // The following exception was thrown during execution in test generation
        try {
            createBookingCommand10.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.addReservation(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        occupancySensor3.roomId = "Booking confirmed.";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(checkInPublisher27);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.conferenceroomscheduler.patterns.PartnerFactory partnerFactory0 = new com.conferenceroomscheduler.patterns.PartnerFactory();
        com.conferenceroomscheduler.model.Account account8 = partnerFactory0.createAccount("Checked in.", "hi!", "admin", "", true, false, "Pending");
        com.conferenceroomscheduler.model.Account account16 = partnerFactory0.createAccount("Booking complete", "hi!", "hi!", "", true, false, "Checked in.");
        com.conferenceroomscheduler.model.Account account24 = partnerFactory0.createAccount("Booking complete", "ADMIN-69", "Pending", "Checked in.", true, true, "");
        account24.setAccountId("Booking confirmed.");
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setRoomNumber("Pending");
        java.lang.String str13 = room6.getName();
        java.lang.String str14 = room6.getName();
        java.lang.String str15 = room6.getRoomId();
        java.lang.String str16 = room6.getName();
        java.lang.String str17 = room6.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cancelled" + "'", str14, "Cancelled");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cancelled" + "'", str16, "Cancelled");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cancelled" + "'", str17, "Cancelled");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState32 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState33 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation34 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext35 = new com.conferenceroomscheduler.patterns.BookingContext(reservation34);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState36 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext35.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState36);
        com.conferenceroomscheduler.patterns.BookingState bookingState38 = bookingContext35.getState();
        com.conferenceroomscheduler.model.Reservation reservation39 = bookingContext35.getReservation();
        cancelledBookingState33.handle(bookingContext35);
        checkedInBookingState32.handle(bookingContext35);
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
        checkedInBookingState32.handle(bookingContext45);
        com.conferenceroomscheduler.model.Reservation reservation53 = bookingContext45.getReservation();
        confirmedBookingState0.handle(bookingContext45);
        com.conferenceroomscheduler.model.Reservation reservation55 = bookingContext45.getReservation();
        com.conferenceroomscheduler.patterns.BookingState bookingState56 = bookingContext45.getState();
        com.conferenceroomscheduler.model.Reservation reservation57 = bookingContext45.getReservation();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking confirmed." + "'", str1, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking confirmed." + "'", str2, "Booking confirmed.");
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertNull(reservation39);
        org.junit.Assert.assertNotNull(bookingState48);
        org.junit.Assert.assertNotNull(bookingState49);
        org.junit.Assert.assertNull(reservation53);
        org.junit.Assert.assertNull(reservation55);
        org.junit.Assert.assertNotNull(bookingState56);
        org.junit.Assert.assertNull(reservation57);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        java.time.LocalDateTime localDateTime16 = reservation0.getEndTime();
        reservation0.setTitle("student");
        boolean boolean19 = reservation0.isCanceled();
        reservation0.setHourlyRate((double) '#');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("admin", "student", "", false, false, "student");
        facultyAccount6.setVerified(true);
        java.lang.String str9 = facultyAccount6.getPassword();
        java.lang.String str10 = facultyAccount6.getEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        java.lang.String str39 = completedBookingState31.getName();
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNull(reservation13);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Booking complete" + "'", str37, "Booking complete");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Booking complete" + "'", str39, "Booking complete");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        java.lang.String str57 = occupancySensor48.roomId;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(checkInPublisher52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Unverified badge detected for Cancelled." + "'", str57, "Unverified badge detected for Cancelled.");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("Booking complete", "Cancelled", "student", true, true, "");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("admin", "admin", "Unverified badge detected for Cancelled.", false, true, "faculty");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.conferenceroomscheduler.model.StaffAccount staffAccount0 = new com.conferenceroomscheduler.model.StaffAccount();
        staffAccount0.setEmail("Pending");
        boolean boolean3 = staffAccount0.isUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.model.Badge badge12 = studentAccount10.getBadge();
        badge12.setEmail("");
        badge12.setVerified(true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(badge12);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.time.LocalDateTime localDateTime9 = bookingRequest7.getEndTime();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getStartTime();
        java.lang.String str11 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor0 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor0.update("Checked in.");
        roomSensor0.update("Checked in.");
        roomSensor0.update("Cancelled");
        roomSensor0.update("admin");
        roomSensor0.update("Booking confirmed.");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Unverified badge detected for .", "hi!", "hi!", false, true, "Booking confirmed.");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Unverified badge detected for .", "student", (int) ' ', false, "student", "ADMIN-69");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
        java.lang.String str15 = reservation0.getReservationId();
        java.time.LocalDateTime localDateTime16 = reservation0.getEndTime();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setRoomNumber("Pending");
        java.lang.String str13 = room6.getName();
        boolean boolean14 = room6.isClosedForMaintenance();
        room6.setClosedForMaintenance(true);
        int int17 = room6.getCapacity();
        java.lang.String str18 = room6.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Cancelled" + "'", str18, "Cancelled");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getTitle();
        double double5 = reservation2.getDepositAmount();
        reservation2.setTitle("");
        double double8 = reservation2.getFinalAmount();
        boolean boolean9 = reservation2.isExtended();
        double double10 = reservation2.getHourlyRate();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand11 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation2);
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand11.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor0 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor0.update("Checked in.");
        roomSensor0.update("Checked in.");
        roomSensor0.update("Cancelled");
        roomSensor0.update("admin");
        roomSensor0.update("Booking confirmed.");
        roomSensor0.update("Unverified badge detected for Cancelled.");
        roomSensor0.update("Booking complete");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        java.lang.String str1 = reservation0.getTitle();
        java.time.LocalDateTime localDateTime2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.getTitle();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(localDateTime2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("faculty", "Pending", (int) '#', "Cancelled", "Pending");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("Unverified badge detected for .", "ADMIN-69", 0, "Pending", "Pending");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("Cancelled", "Cancelled", 100, "hi!", "Booking complete");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        com.conferenceroomscheduler.patterns.BookingContext bookingContext45 = null;
        cancelledBookingState0.handle(bookingContext45);
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
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        room6.setRoomId("Pending");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", true, false);
        boolean boolean4 = occupancySensor3.isDetected();
        occupancySensor3.occupied = false;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setBuilding("hi!");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = room6.getOccupancySensor();
        com.conferenceroomscheduler.model.AdminAccount adminAccount17 = new com.conferenceroomscheduler.model.AdminAccount("hi!", "", "hi!", true, false, "hi!");
        adminAccount17.setAccountNumber("Cancelled");
        adminAccount17.setIdentifier("");
        boolean boolean22 = occupancySensor10.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount17);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher23 = occupancySensor10.subject;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(occupancySensor10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(checkInPublisher23);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        com.conferenceroomscheduler.model.Reservation reservation42 = new com.conferenceroomscheduler.model.Reservation();
        reservation42.setFinalAmount((double) (byte) 100);
        java.lang.String str45 = reservation42.getRoomId();
        reservation42.setFinalAmount((double) 10.0f);
        java.lang.String str48 = reservation42.getUserId();
        reservation42.setDepositAmount((double) (byte) 0);
        double double51 = reservation42.getHourlyRate();
        reservation42.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext54 = new com.conferenceroomscheduler.patterns.BookingContext(reservation42);
        java.time.LocalDateTime localDateTime59 = null;
        java.time.LocalDateTime localDateTime60 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod65 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation66 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime59, localDateTime60, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod65);
        reservation42.setPaymentMethod(paymentMethod65);
        com.conferenceroomscheduler.model.Reservation reservation68 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "Booking complete", "admin", "Booking complete", localDateTime36, localDateTime37, "Booking confirmed.", (double) (short) -1, (double) 0.0f, (double) 0, paymentMethod65);
        com.conferenceroomscheduler.model.Reservation reservation69 = new com.conferenceroomscheduler.model.Reservation("student", "", "Booking complete", "Pending", localDateTime26, localDateTime27, "Checked in.", 0.0d, (double) 'a', (double) (-1.0f), paymentMethod65);
        reservation12.setPaymentMethod(paymentMethod65);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod71 = reservation12.getPaymentMethod();
        reservation12.setCheckedIn(true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod65 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod65.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertTrue("'" + paymentMethod71 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod71.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState0 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        java.lang.String str1 = completedBookingState0.getName();
        java.lang.String str2 = completedBookingState0.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState3 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState4 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation5 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext6 = new com.conferenceroomscheduler.patterns.BookingContext(reservation5);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState7 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext6.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState7);
        com.conferenceroomscheduler.patterns.BookingState bookingState9 = bookingContext6.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState10 = bookingContext6.getState();
        cancelledBookingState4.handle(bookingContext6);
        checkedInBookingState3.handle(bookingContext6);
        java.lang.String str13 = checkedInBookingState3.getName();
        com.conferenceroomscheduler.model.Reservation reservation14 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext15 = new com.conferenceroomscheduler.patterns.BookingContext(reservation14);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState16 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext15.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState16);
        com.conferenceroomscheduler.model.Reservation reservation18 = bookingContext15.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation19 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext20 = new com.conferenceroomscheduler.patterns.BookingContext(reservation19);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState21 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext20.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState21);
        com.conferenceroomscheduler.patterns.BookingState bookingState23 = bookingContext20.getState();
        bookingContext15.setState(bookingState23);
        checkedInBookingState3.handle(bookingContext15);
        com.conferenceroomscheduler.model.Reservation reservation26 = bookingContext15.getReservation();
        completedBookingState0.handle(bookingContext15);
        java.lang.String str28 = completedBookingState0.getName();
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
        java.lang.String str39 = bookingContext32.getStatus();
        completedBookingState0.handle(bookingContext32);
        java.lang.String str41 = completedBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking complete" + "'", str1, "Booking complete");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking complete" + "'", str2, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Checked in." + "'", str13, "Checked in.");
        org.junit.Assert.assertNull(reservation18);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertNull(reservation26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Booking complete" + "'", str28, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState35);
        org.junit.Assert.assertNotNull(bookingState36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Booking complete" + "'", str39, "Booking complete");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Booking complete" + "'", str41, "Booking complete");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("student", "Cancelled", true);
        boolean boolean4 = badgeScan3.isVerified();
        badgeScan3.setVerified(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        boolean boolean9 = reservation0.isExtended();
        reservation0.setReservationId("admin");
        java.time.LocalDateTime localDateTime12 = reservation0.getStartTime();
        reservation0.setExtended(false);
        reservation0.setDepositLost(true);
        reservation0.setHourlyRate(1.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        boolean boolean53 = occupancySensor3.occupied;
        boolean boolean54 = occupancySensor3.occupied;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(checkInPublisher7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(checkInPublisher15);
        org.junit.Assert.assertNull(checkInPublisher16);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setHourlyRate((double) (byte) 100);
        boolean boolean4 = reservation1.isDepositLost();
        java.lang.String str5 = reservation1.getUserId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand6 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        boolean boolean7 = reservation1.isExtended();
        double double8 = reservation1.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("student", true, true);
        com.conferenceroomscheduler.model.AdminAccount adminAccount4 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str5 = adminAccount4.getAccountId();
        adminAccount4.setIdentifier("hi!");
        java.lang.String str8 = adminAccount4.getAccountNumber();
        java.lang.String str9 = adminAccount4.getPassword();
        boolean boolean10 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount4);
        com.conferenceroomscheduler.model.Badge badge14 = new com.conferenceroomscheduler.model.Badge("Checked in.", "Checked in.", false);
        badge14.setAccountId("Booking complete");
        java.lang.String str17 = badge14.getAccountId();
        boolean boolean18 = occupancySensor3.scanIdBadge(badge14);
        java.lang.String str19 = badge14.getEmail();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking complete" + "'", str17, "Booking complete");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Checked in." + "'", str19, "Checked in.");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("admin", (double) (short) -1);
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("Pending", (double) (short) 10);
        boolean boolean9 = debitCardPaymentStrategy0.processPayment("partner", (double) 100);
        boolean boolean12 = debitCardPaymentStrategy0.processPayment("", (double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "", "hi!", "", (int) '4', localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getTitle();
        java.lang.String str9 = bookingRequest7.getTitle();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.lang.String str11 = bookingRequest7.getRoomId();
        java.lang.String str12 = bookingRequest7.getRequestId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = null;
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime5, localDateTime6, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod11);
        reservation12.setDepositLost(true);
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand16 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation12, localDateTime15);
        reservation12.setHourlyRate((double) (-1.0f));
        boolean boolean19 = reservation12.isCanceled();
        java.time.LocalDateTime localDateTime20 = null;
        reservation12.setStartTime(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        boolean boolean4 = badgeScan3.isVerified();
        badgeScan3.setBadgeId("ADMIN-69");
        badgeScan3.setVerified(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        staffAccount68.setAccountType("faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        occupancySensor3.setDetected(true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Booking confirmed." + "'", str31, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        java.lang.String str4 = reservation1.getUserId();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand7 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime5, localDateTime6);
        // The following exception was thrown during execution in test generation
        try {
            editBookingCommand7.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.editBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) '4');
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) (byte) 0);
        boolean boolean9 = debitCardPaymentStrategy0.processPayment("Checked in.", 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Booking confirmed.", "faculty", "Checked in.", false, false, "faculty");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "", "hi!", "", (int) '4', localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getTitle();
        java.time.LocalDateTime localDateTime9 = bookingRequest7.getStartTime();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        reservation0.setExtended(true);
        reservation0.setAccountType("hi!");
        double double14 = reservation0.getHourlyRate();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        com.conferenceroomscheduler.model.Reservation reservation25 = new com.conferenceroomscheduler.model.Reservation();
        reservation25.setFinalAmount((double) (byte) 100);
        java.lang.String str28 = reservation25.getRoomId();
        reservation25.setFinalAmount((double) 10.0f);
        java.lang.String str31 = reservation25.getUserId();
        reservation25.setDepositAmount((double) (byte) 0);
        double double34 = reservation25.getHourlyRate();
        reservation25.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext37 = new com.conferenceroomscheduler.patterns.BookingContext(reservation25);
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod48 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation49 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime42, localDateTime43, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod48);
        reservation25.setPaymentMethod(paymentMethod48);
        com.conferenceroomscheduler.model.Reservation reservation51 = new com.conferenceroomscheduler.model.Reservation("Booking complete", "Booking complete", "", "Booking complete", localDateTime19, localDateTime20, "Cancelled", (double) 0L, (double) (-1), (double) 0, paymentMethod48);
        reservation0.setPaymentMethod(paymentMethod48);
        double double53 = reservation0.getFinalAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod48 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod48.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("hi!", "Checked in.", "Checked in.", true, true, "hi!");
        studentAccount6.setUniversityAccount(false);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setRoomNumber("Pending");
        int int13 = room6.getCapacity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("", "Booking complete", "Cancelled", true, false, "hi!");
        staffAccount6.setIdentifier("Unverified badge detected for .");
        java.lang.String str9 = staffAccount6.getEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking complete" + "'", str9, "Booking complete");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
        room6.setBuilding("Unverified badge detected for Cancelled.");
        int int99 = room6.getCapacity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 97 + "'", int99 == 97);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Booking confirmed.", "hi!", "Booking complete", false, true, "admin");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
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
        com.conferenceroomscheduler.model.Room room55 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str56 = room55.getRoomId();
        room55.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount65 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room55.checkIn((com.conferenceroomscheduler.model.Account) studentAccount65);
        com.conferenceroomscheduler.model.Badge badge67 = studentAccount65.getBadge();
        boolean boolean68 = occupancySensor3.scanIdBadge(badge67);
        java.lang.String str69 = badge67.getEmail();
        java.lang.String str70 = badge67.getAccountId();
        java.lang.String str71 = badge67.getAccountId();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(badge67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        boolean boolean1 = adminAccount0.isVerified();
        adminAccount0.setUniversityAccount(false);
        java.lang.String str4 = adminAccount0.getPassword();
        adminAccount0.setPassword("Pending");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("", 0.0d);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("admin", (double) 100L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getOrganizerId();
        java.lang.String str10 = bookingRequest7.getOrganizerId();
        java.lang.String str11 = bookingRequest7.getOrganizerId();
        int int12 = bookingRequest7.getAttendeeCount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod21 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation22 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime15, localDateTime16, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod21);
        com.conferenceroomscheduler.model.Reservation reservation23 = new com.conferenceroomscheduler.model.Reservation("Booking confirmed.", "Booking confirmed.", "", "", localDateTime5, localDateTime6, "Booking complete", 0.0d, (double) 0, (double) 100.0f, paymentMethod21);
        reservation23.setReservationId("Booking complete");
        double double26 = reservation23.getFinalAmount();
        java.time.LocalDateTime localDateTime27 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand28 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation23, localDateTime27);
        boolean boolean29 = extendBookingCommand28.wasSuccessful();
        org.junit.Assert.assertTrue("'" + paymentMethod21 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod21.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Cancelled", "Booking confirmed.", false);
        badgeScan3.setVerified(true);
        java.lang.String str6 = badgeScan3.getRoomId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking confirmed." + "'", str6, "Booking confirmed.");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount0 = new com.conferenceroomscheduler.model.FacultyAccount();
        boolean boolean1 = facultyAccount0.isUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        java.lang.String str46 = bookingContext39.getStatus();
        completedBookingState6.handle(bookingContext39);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState48 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState49 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState50 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation51 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext52 = new com.conferenceroomscheduler.patterns.BookingContext(reservation51);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState53 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext52.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState53);
        com.conferenceroomscheduler.patterns.BookingState bookingState55 = bookingContext52.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState56 = bookingContext52.getState();
        cancelledBookingState50.handle(bookingContext52);
        checkedInBookingState49.handle(bookingContext52);
        com.conferenceroomscheduler.model.Reservation reservation59 = new com.conferenceroomscheduler.model.Reservation();
        reservation59.setFinalAmount((double) (byte) 100);
        reservation59.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext64 = new com.conferenceroomscheduler.patterns.BookingContext(reservation59);
        checkedInBookingState49.handle(bookingContext64);
        cancelledBookingState48.handle(bookingContext64);
        com.conferenceroomscheduler.patterns.BookingState bookingState67 = null;
        bookingContext64.setState(bookingState67);
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
        com.conferenceroomscheduler.model.Reservation reservation84 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext85 = new com.conferenceroomscheduler.patterns.BookingContext(reservation84);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState86 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext85.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState86);
        com.conferenceroomscheduler.patterns.BookingState bookingState88 = bookingContext85.getState();
        com.conferenceroomscheduler.model.Reservation reservation89 = bookingContext85.getReservation();
        completedBookingState69.handle(bookingContext85);
        bookingContext64.setState((com.conferenceroomscheduler.patterns.BookingState) completedBookingState69);
        completedBookingState6.handle(bookingContext64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking complete" + "'", str7, "Booking complete");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking complete" + "'", str8, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Checked in." + "'", str19, "Checked in.");
        org.junit.Assert.assertNull(reservation24);
        org.junit.Assert.assertNotNull(bookingState29);
        org.junit.Assert.assertNull(reservation32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Booking complete" + "'", str34, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState42);
        org.junit.Assert.assertNotNull(bookingState43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Booking complete" + "'", str46, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState55);
        org.junit.Assert.assertNotNull(bookingState56);
        org.junit.Assert.assertNotNull(bookingState80);
        org.junit.Assert.assertNotNull(bookingState81);
        org.junit.Assert.assertNotNull(bookingState88);
        org.junit.Assert.assertNull(reservation89);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str1 = adminAccount0.getEmail();
        boolean boolean2 = adminAccount0.isUniversityAccount();
        adminAccount0.setAccountNumber("Booking confirmed.");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Booking complete", "Cancelled", (int) (short) 1, "Booking complete", "");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = room12.getOccupancySensor();
        room12.setCapacity((int) (short) 10);
        boolean boolean16 = room12.isEnabled();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(occupancySensor13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand6 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setCheckedIn(false);
        java.time.LocalDateTime localDateTime9 = null;
        reservation1.setEndTime(localDateTime9);
        boolean boolean11 = reservation1.isDepositLost();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setFinalAmount((double) ' ');
        java.lang.String str9 = reservation0.getTitle();
        reservation0.setDepositAmount((double) (-1.0f));
        reservation0.setCheckedIn(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        java.lang.String str25 = studentAccount20.getAccountType();
        org.junit.Assert.assertNotNull(badge21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "student" + "'", str25, "student");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Booking complete", "", true);
        badge3.setAccountId("Checked in.");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("Pending", "partner", "Unverified badge detected for Cancelled.", true, true, "partner");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Pending", "Unverified badge detected for .", "faculty", false, true, "Booking complete");
        partnerAccount6.setIdentifier("Booking confirmed.");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        com.conferenceroomscheduler.patterns.BookingState bookingState14 = bookingContext10.getState();
        cancelledBookingState8.handle(bookingContext10);
        checkedInBookingState7.handle(bookingContext10);
        com.conferenceroomscheduler.model.Reservation reservation17 = new com.conferenceroomscheduler.model.Reservation();
        reservation17.setFinalAmount((double) (byte) 100);
        reservation17.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext22 = new com.conferenceroomscheduler.patterns.BookingContext(reservation17);
        checkedInBookingState7.handle(bookingContext22);
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState24 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation25 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext26 = new com.conferenceroomscheduler.patterns.BookingContext(reservation25);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState27 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext26.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState27);
        completedBookingState24.handle(bookingContext26);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState30 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation31 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext32 = new com.conferenceroomscheduler.patterns.BookingContext(reservation31);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState33 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext32.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState33);
        com.conferenceroomscheduler.patterns.BookingState bookingState35 = bookingContext32.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState36 = bookingContext32.getState();
        cancelledBookingState30.handle(bookingContext32);
        completedBookingState24.handle(bookingContext32);
        com.conferenceroomscheduler.model.Reservation reservation39 = bookingContext32.getReservation();
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
        bookingContext32.setState(bookingState49);
        checkedInBookingState7.handle(bookingContext32);
        java.lang.String str53 = checkedInBookingState7.getName();
        bookingContext1.setState((com.conferenceroomscheduler.patterns.BookingState) checkedInBookingState7);
        com.conferenceroomscheduler.model.Reservation reservation55 = new com.conferenceroomscheduler.model.Reservation();
        reservation55.setFinalAmount((double) (byte) 100);
        java.lang.String str58 = reservation55.getRoomId();
        reservation55.setFinalAmount((double) 10.0f);
        reservation55.setCanceled(false);
        java.time.LocalDateTime localDateTime63 = null;
        reservation55.setStartTime(localDateTime63);
        reservation55.setReservationId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext67 = new com.conferenceroomscheduler.patterns.BookingContext(reservation55);
        checkedInBookingState7.handle(bookingContext67);
        bookingContext67.request();
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState70 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str71 = confirmedBookingState70.getName();
        java.lang.String str72 = confirmedBookingState70.getName();
        java.lang.String str73 = confirmedBookingState70.getName();
        java.lang.String str74 = confirmedBookingState70.getName();
        com.conferenceroomscheduler.model.Reservation reservation75 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext76 = new com.conferenceroomscheduler.patterns.BookingContext(reservation75);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState77 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext76.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState77);
        com.conferenceroomscheduler.patterns.BookingState bookingState79 = bookingContext76.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState80 = bookingContext76.getState();
        bookingContext76.request();
        confirmedBookingState70.handle(bookingContext76);
        bookingContext67.setState((com.conferenceroomscheduler.patterns.BookingState) confirmedBookingState70);
        org.junit.Assert.assertNotNull(bookingState4);
        org.junit.Assert.assertNull(reservation5);
        org.junit.Assert.assertNull(reservation6);
        org.junit.Assert.assertNotNull(bookingState13);
        org.junit.Assert.assertNotNull(bookingState14);
        org.junit.Assert.assertNotNull(bookingState35);
        org.junit.Assert.assertNotNull(bookingState36);
        org.junit.Assert.assertNull(reservation39);
        org.junit.Assert.assertNull(reservation44);
        org.junit.Assert.assertNotNull(bookingState49);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Checked in." + "'", str53, "Checked in.");
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Booking confirmed." + "'", str71, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Booking confirmed." + "'", str72, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Booking confirmed." + "'", str73, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Booking confirmed." + "'", str74, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState79);
        org.junit.Assert.assertNotNull(bookingState80);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("", "", "hi!", true, true, "Cancelled");
        com.conferenceroomscheduler.model.Badge badge7 = partnerAccount6.getBadge();
        partnerAccount6.setAccountId("faculty");
        java.lang.String str10 = partnerAccount6.getAccountNumber();
        org.junit.Assert.assertNotNull(badge7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cancelled" + "'", str10, "Cancelled");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        java.lang.String str34 = occupancySensor3.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Booking confirmed." + "'", str31, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("student", "Booking confirmed.", "Unverified badge detected for Cancelled.", false, false, "Unverified badge detected for Cancelled.");
        studentAccount6.setIdentifier("Cancelled");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "", "hi!", "", (int) '4', localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getTitle();
        java.lang.String str9 = bookingRequest7.getTitle();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.lang.String str11 = bookingRequest7.getRoomId();
        java.lang.String str12 = bookingRequest7.getRoomId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Checked in.", "Cancelled", "admin", false, false, "ADMIN-69");
        java.lang.String str7 = studentAccount6.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        java.lang.String str14 = reservation0.getUserId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        java.time.LocalDateTime localDateTime16 = reservation0.getEndTime();
        reservation0.setTitle("student");
        double double19 = reservation0.getHourlyRate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Booking complete", "Pending", "Checked in.", "faculty", (int) (byte) 1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRoomId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Pending" + "'", str8, "Pending");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("", "Booking confirmed.", "hi!", false, true, "Checked in.");
        studentAccount6.setUniversityAccount(false);
        studentAccount6.setUniversityAccount(false);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        boolean boolean4 = badgeScan3.isVerified();
        boolean boolean5 = badgeScan3.isVerified();
        java.lang.String str6 = badgeScan3.getRoomId();
        badgeScan3.setBadgeId("");
        badgeScan3.setRoomId("faculty");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("", "", "Booking confirmed.", false, false, "Checked in.");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher23 = occupancySensor3.subject;
        occupancySensor3.setRoomId("Booking complete");
        java.lang.String str26 = occupancySensor3.getLastEvent();
        java.lang.String str27 = occupancySensor3.getLastEvent();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(checkInPublisher23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Unverified badge detected for Cancelled." + "'", str26, "Unverified badge detected for Cancelled.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Unverified badge detected for Cancelled." + "'", str27, "Unverified badge detected for Cancelled.");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", true, true);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("partner", "Booking confirmed.", true);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        java.lang.String str4 = reservation1.getAccountType();
        double double5 = reservation1.getDepositAmount();
        reservation1.setAccountType("");
        java.time.LocalDateTime localDateTime8 = null;
        reservation1.setEndTime(localDateTime8);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("hi!", "Cancelled", false);
        badgeScan3.setVerified(true);
        badgeScan3.setRoomId("Booking confirmed.");
        java.lang.String str8 = badgeScan3.getRoomId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking confirmed." + "'", str8, "Booking confirmed.");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        reservation0.setReservationId("");
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        com.conferenceroomscheduler.model.StaffAccount staffAccount91 = new com.conferenceroomscheduler.model.StaffAccount("Pending", "admin", "Booking complete", false, true, "");
        staffAccount91.setIdentifier("Cancelled");
        boolean boolean94 = occupancySensor77.detectOccupancy((com.conferenceroomscheduler.model.Account) staffAccount91);
        staffAccount91.setPassword("Checked in.");
        java.lang.String str97 = staffAccount91.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "staff" + "'", str97, "staff");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("admin", "student", "", false, false, "student");
        com.conferenceroomscheduler.model.Badge badge7 = facultyAccount6.getBadge();
        facultyAccount6.setUniversityAccount(true);
        org.junit.Assert.assertNotNull(badge7);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        java.lang.String str18 = room6.getRoomId();
        java.lang.String str19 = room6.getName();
        java.lang.String str20 = room6.getRoomNumber();
        room6.setName("Checked in.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Cancelled" + "'", str19, "Cancelled");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("hi!", "Cancelled", "Unverified badge detected for Cancelled.", false, false, "admin");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        boolean boolean13 = reservation9.isDepositLost();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cancelled" + "'", str7, "Cancelled");
        org.junit.Assert.assertNotNull(reservation9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str1 = adminAccount0.getEmail();
        boolean boolean2 = adminAccount0.isUniversityAccount();
        adminAccount0.setVerified(true);
        adminAccount0.setAccountNumber("Booking complete");
        java.lang.String str7 = adminAccount0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor31 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount38 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean39 = occupancySensor31.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount38);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher40 = null;
        occupancySensor31.setSubject(checkInPublisher40);
        checkInPublisher27.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor31);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor46 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount53 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean54 = occupancySensor46.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount53);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher55 = null;
        occupancySensor46.setSubject(checkInPublisher55);
        occupancySensor46.isDetected = false;
        boolean boolean59 = occupancySensor46.isOccupied();
        com.conferenceroomscheduler.model.Badge badge63 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str64 = badge63.getEmail();
        boolean boolean65 = occupancySensor46.scanIdBadge(badge63);
        java.lang.String str66 = occupancySensor46.getRoomId();
        com.conferenceroomscheduler.model.AdminAccount adminAccount73 = new com.conferenceroomscheduler.model.AdminAccount("Booking complete", "Pending", "student", false, false, "");
        boolean boolean74 = occupancySensor46.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount73);
        boolean boolean75 = occupancySensor46.isDetected;
        com.conferenceroomscheduler.model.StaffAccount staffAccount82 = new com.conferenceroomscheduler.model.StaffAccount("Booking complete", "Cancelled", "admin", false, true, "Cancelled");
        boolean boolean83 = occupancySensor46.detectOccupancy((com.conferenceroomscheduler.model.Account) staffAccount82);
        checkInPublisher27.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor46);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(checkInPublisher27);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Cancelled" + "'", str64, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Pending" + "'", str66, "Pending");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        occupancySensor3.isDetected = false;
        occupancySensor3.roomId = "";
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
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("", "Booking complete", false);
        java.lang.String str4 = badge3.getEmail();
        boolean boolean5 = badge3.isVerified();
        boolean boolean6 = badge3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        com.conferenceroomscheduler.patterns.CheckInObserver checkInObserver74 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkInPublisher22.registerObserver(checkInObserver74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.patterns.CheckInObserver.setSubject(com.conferenceroomscheduler.patterns.CheckInPublisher)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(occupancySensor21);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(account59);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
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
        java.lang.String str45 = account37.getPassword();
        java.lang.String str46 = account37.getAccountType();
        account37.setPassword("");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(account37);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Cancelled" + "'", str46, "Cancelled");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("hi!", "", "", true, true, "");
        java.lang.String str7 = partnerAccount6.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod10 = null;
        com.conferenceroomscheduler.model.Reservation reservation11 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime4, localDateTime5, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod10);
        boolean boolean12 = reservation11.isDepositLost();
        reservation11.setUserId("admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getReservationId();
        java.lang.String str4 = reservation1.getTitle();
        boolean boolean5 = reservation1.isExtended();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod6 = reservation1.getPaymentMethod();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentMethod6);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        java.lang.String str4 = reservation1.getUserId();
        boolean boolean5 = reservation1.isDepositLost();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand6 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext7 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        reservation1.setCheckedIn(false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        com.conferenceroomscheduler.model.Badge badge18 = studentAccount16.getBadge();
        badge18.setEmail("Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(badge18);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        com.conferenceroomscheduler.model.Reservation reservation49 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext50 = new com.conferenceroomscheduler.patterns.BookingContext(reservation49);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState51 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext50.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState51);
        com.conferenceroomscheduler.patterns.BookingState bookingState53 = bookingContext50.getState();
        com.conferenceroomscheduler.model.Reservation reservation54 = bookingContext50.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation55 = bookingContext50.getReservation();
        // The following exception was thrown during execution in test generation
        try {
            pendingBookingState0.handle(bookingContext50);
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
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(bookingState53);
        org.junit.Assert.assertNull(reservation54);
        org.junit.Assert.assertNull(reservation55);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "Checked in.", false);
        badgeScan3.setBadgeId("Booking confirmed.");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("student", true, true);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor7 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor11 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean12 = occupancySensor11.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher13 = null;
        occupancySensor11.subject = checkInPublisher13;
        occupancySensor11.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher17 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor21 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher22 = null;
        occupancySensor21.setSubject(checkInPublisher22);
        occupancySensor21.occupied = true;
        occupancySensor21.setDetected(false);
        checkInPublisher17.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor21);
        occupancySensor11.setSubject(checkInPublisher17);
        occupancySensor7.setSubject(checkInPublisher17);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher31 = occupancySensor7.getSubject();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor35 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher36 = null;
        occupancySensor35.setSubject(checkInPublisher36);
        checkInPublisher31.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor35);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor42 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher43 = null;
        occupancySensor42.setSubject(checkInPublisher43);
        occupancySensor42.occupied = true;
        occupancySensor42.setDetected(false);
        java.lang.String str49 = occupancySensor42.getLastEvent();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor53 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor57 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean58 = occupancySensor57.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher59 = null;
        occupancySensor57.subject = checkInPublisher59;
        occupancySensor57.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher63 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor67 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher68 = null;
        occupancySensor67.setSubject(checkInPublisher68);
        occupancySensor67.occupied = true;
        occupancySensor67.setDetected(false);
        checkInPublisher63.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor67);
        occupancySensor57.setSubject(checkInPublisher63);
        occupancySensor53.setSubject(checkInPublisher63);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher77 = occupancySensor53.getSubject();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor81 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher82 = null;
        occupancySensor81.setSubject(checkInPublisher82);
        checkInPublisher77.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor81);
        occupancySensor42.subject = checkInPublisher77;
        occupancySensor42.setOccupied(false);
        checkInPublisher31.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor42);
        occupancySensor3.subject = checkInPublisher31;
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(checkInPublisher31);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(checkInPublisher77);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher82 = occupancySensor20.getSubject();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor86 = new com.conferenceroomscheduler.model.OccupancySensor("Checked in.", true, true);
        checkInPublisher82.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor86);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(checkInPublisher79);
        org.junit.Assert.assertNotNull(checkInPublisher82);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        java.lang.String str47 = badge45.getEmail();
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Cancelled" + "'", str47, "Cancelled");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        occupancySensor4.isDetected = true;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("Booking complete", "hi!", "admin", "admin", false, true, "hi!");
        java.lang.String str8 = account7.getAccountNumber();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod20 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation21 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "hi!", "Booking complete", "Checked in.", localDateTime14, localDateTime15, "hi!", (double) 97, (double) 100L, (double) (byte) 100, paymentMethod20);
        com.conferenceroomscheduler.model.Reservation reservation22 = new com.conferenceroomscheduler.model.Reservation("Unverified badge detected for .", "faculty", "", "Unverified badge detected for .", localDateTime4, localDateTime5, "faculty", (double) (short) 100, (double) 97, (double) 1L, paymentMethod20);
        java.lang.String str23 = reservation22.getUserId();
        org.junit.Assert.assertTrue("'" + paymentMethod20 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod20.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("admin", "", "", "faculty", false, true, "Booking complete");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor3.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount12 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount12.setEmail("");
        boolean boolean15 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount12);
        occupancySensor3.setRoomId("Booking complete");
        occupancySensor3.setDetected(false);
        java.lang.String str20 = occupancySensor3.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Booking complete" + "'", str20, "Booking complete");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setHourlyRate((double) (byte) 100);
        boolean boolean4 = reservation1.isDepositLost();
        java.lang.String str5 = reservation1.getUserId();
        reservation1.setAccountType("Pending");
        double double8 = reservation1.getDepositAmount();
        java.lang.String str9 = reservation1.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand10 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        // The following exception was thrown during execution in test generation
        try {
            createBookingCommand10.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.addReservation(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        occupancySensor4.setRoomId("Unverified badge detected for Cancelled.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(account18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Cancelled", "hi!", "hi!", "", (int) (short) 1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRoomId();
        java.lang.String str9 = bookingRequest7.getRequestId();
        java.lang.String str10 = bookingRequest7.getRoomId();
        int int11 = bookingRequest7.getAttendeeCount();
        java.lang.String str12 = bookingRequest7.getRequestId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cancelled" + "'", str12, "Cancelled");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Booking complete", "Booking confirmed.", "Pending", false, false, "Booking confirmed.");
        java.lang.String str7 = partnerAccount6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking confirmed." + "'", str7, "Booking confirmed.");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext2 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState3 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext2.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState3);
        java.lang.String str5 = cancelledBookingState3.getName();
        java.lang.String str6 = cancelledBookingState3.getName();
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
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState37 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState38 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation39 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext40 = new com.conferenceroomscheduler.patterns.BookingContext(reservation39);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState41 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext40.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState41);
        com.conferenceroomscheduler.patterns.BookingState bookingState43 = bookingContext40.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState44 = bookingContext40.getState();
        cancelledBookingState38.handle(bookingContext40);
        checkedInBookingState37.handle(bookingContext40);
        com.conferenceroomscheduler.model.Reservation reservation47 = new com.conferenceroomscheduler.model.Reservation();
        reservation47.setFinalAmount((double) (byte) 100);
        reservation47.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext52 = new com.conferenceroomscheduler.patterns.BookingContext(reservation47);
        checkedInBookingState37.handle(bookingContext52);
        confirmedBookingState7.handle(bookingContext52);
        cancelledBookingState3.handle(bookingContext52);
        com.conferenceroomscheduler.model.Reservation reservation56 = bookingContext52.getReservation();
        boolean boolean57 = reservation56.isDepositLost();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand58 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation56);
        // The following exception was thrown during execution in test generation
        try {
            createBookingCommand58.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.addReservation(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cancelled" + "'", str5, "Cancelled");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cancelled" + "'", str6, "Cancelled");
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
        org.junit.Assert.assertNotNull(bookingState43);
        org.junit.Assert.assertNotNull(bookingState44);
        org.junit.Assert.assertNotNull(reservation56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = null;
        occupancySensor3.setSubject(checkInPublisher12);
        occupancySensor3.isDetected = false;
        boolean boolean16 = occupancySensor3.isOccupied();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher17 = occupancySensor3.subject;
        boolean boolean18 = occupancySensor3.isDetected();
        boolean boolean19 = occupancySensor3.isDetected;
        com.conferenceroomscheduler.model.StudentAccount studentAccount26 = new com.conferenceroomscheduler.model.StudentAccount("Cancelled", "Cancelled", "Pending", false, true, "Checked in.");
        java.lang.String str27 = studentAccount26.getPassword();
        boolean boolean28 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount26);
        boolean boolean29 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.model.AdminAccount adminAccount36 = new com.conferenceroomscheduler.model.AdminAccount("faculty", "faculty", "Cancelled", true, false, "Unverified badge detected for Cancelled.");
        boolean boolean37 = adminAccount36.isUniversityAccount();
        boolean boolean38 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount36);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(checkInPublisher17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Pending" + "'", str27, "Pending");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy institutionalBillingPaymentStrategy0 = new com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy();
        boolean boolean3 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", 0.0d);
        boolean boolean6 = institutionalBillingPaymentStrategy0.processPayment("Booking confirmed.", (double) '#');
        boolean boolean9 = institutionalBillingPaymentStrategy0.processPayment("admin", (double) (short) -1);
        boolean boolean12 = institutionalBillingPaymentStrategy0.processPayment("", (double) 0.0f);
        boolean boolean15 = institutionalBillingPaymentStrategy0.processPayment("ADMIN-69", (double) (byte) -1);
        boolean boolean18 = institutionalBillingPaymentStrategy0.processPayment("ADMIN-69", 10.0d);
        boolean boolean21 = institutionalBillingPaymentStrategy0.processPayment("ADMIN-69", (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod12 = null;
        com.conferenceroomscheduler.model.Reservation reservation13 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime6, localDateTime7, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod12);
        reservation13.setDepositLost(true);
        java.time.LocalDateTime localDateTime16 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand17 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService1, reservation13, localDateTime16);
        double double18 = reservation13.getHourlyRate();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand21 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation13, localDateTime19, localDateTime20);
        boolean boolean22 = reservation13.isCanceled();
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        boolean boolean16 = reservation0.isCanceled();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        double double7 = reservation0.getDepositAmount();
        reservation0.setUserId("admin");
        reservation0.setExtended(true);
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState25 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation26 = new com.conferenceroomscheduler.model.Reservation();
        reservation26.setFinalAmount((double) (byte) 100);
        reservation26.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext31 = new com.conferenceroomscheduler.patterns.BookingContext(reservation26);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState32 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str33 = cancelledBookingState32.getName();
        bookingContext31.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState32);
        completedBookingState25.handle(bookingContext31);
        bookingContext18.setState((com.conferenceroomscheduler.patterns.BookingState) completedBookingState25);
        com.conferenceroomscheduler.model.Reservation reservation37 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext38 = new com.conferenceroomscheduler.patterns.BookingContext(reservation37);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState39 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext38.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState39);
        completedBookingState25.handle(bookingContext38);
        com.conferenceroomscheduler.patterns.BookingState bookingState42 = bookingContext38.getState();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Cancelled" + "'", str23, "Cancelled");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Cancelled" + "'", str33, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState42);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
        checkedInBookingState0.handle(bookingContext13);
        com.conferenceroomscheduler.model.Reservation reservation21 = bookingContext13.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation22 = bookingContext13.getReservation();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertNotNull(bookingState17);
        org.junit.Assert.assertNull(reservation21);
        org.junit.Assert.assertNull(reservation22);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        room6.setName("ADMIN-69");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        badge20.setVerified(true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Cancelled" + "'", str23, "Cancelled");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        java.time.LocalDateTime localDateTime34 = null;
        reservation33.setEndTime(localDateTime34);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext36 = new com.conferenceroomscheduler.patterns.BookingContext(reservation33);
        reservation33.setCheckedIn(false);
        java.time.LocalDateTime localDateTime39 = null;
        reservation33.setStartTime(localDateTime39);
        org.junit.Assert.assertTrue("'" + paymentMethod30 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod30.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getReservationId();
        reservation1.setExtended(true);
        reservation1.setAccountType("student");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("ADMIN-69", "", "faculty", false, true, "ADMIN-69");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand18 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation2, localDateTime16, localDateTime17);
        // The following exception was thrown during execution in test generation
        try {
            editBookingCommand18.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.editBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory0 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account8 = facultyFactory0.createAccount("", "Cancelled", "", "hi!", false, false, "");
        account8.setAccountNumber("hi!");
        account8.setUniversityAccount(true);
        account8.setAccountType("Cancelled");
        account8.setEmail("");
        org.junit.Assert.assertNotNull(account8);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("admin", 0.0d);
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("", (double) (short) 100);
        boolean boolean9 = debitCardPaymentStrategy0.processPayment("Booking confirmed.", (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Booking complete", "Cancelled", (int) (short) 1, "Booking complete", "");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = room12.getOccupancySensor();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher14 = occupancySensor13.getSubject();
        boolean boolean15 = occupancySensor13.isOccupied();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(occupancySensor13);
        org.junit.Assert.assertNull(checkInPublisher14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) 10);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("Cancelled", 1.0d);
        boolean boolean9 = creditCardPaymentStrategy0.processPayment("Cancelled", (double) 100);
        boolean boolean12 = creditCardPaymentStrategy0.processPayment("hi!", (double) 0L);
        boolean boolean15 = creditCardPaymentStrategy0.processPayment("partner", (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        reservation1.setCanceled(false);
        double double16 = reservation1.getFinalAmount();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("", "Cancelled", "ADMIN-69", true, false, "");
        staffAccount6.setAccountNumber("hi!");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        com.conferenceroomscheduler.model.AdminAccount adminAccount47 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str48 = adminAccount47.getAccountId();
        adminAccount47.setVerified(false);
        checkInPublisher25.notifyObservers((com.conferenceroomscheduler.model.Account) adminAccount47);
        com.conferenceroomscheduler.model.AdminAccount adminAccount58 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount58.setPassword("Cancelled");
        checkInPublisher25.notifyObservers((com.conferenceroomscheduler.model.Account) adminAccount58);
        com.conferenceroomscheduler.model.Room room68 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str69 = room68.getRoomId();
        room68.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount78 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room68.checkIn((com.conferenceroomscheduler.model.Account) studentAccount78);
        room68.setCapacity((int) 'a');
        com.conferenceroomscheduler.model.AdminAccount adminAccount88 = new com.conferenceroomscheduler.model.AdminAccount("hi!", "", "hi!", true, false, "hi!");
        adminAccount88.setEmail("");
        java.lang.String str91 = adminAccount88.getAccountId();
        room68.checkIn((com.conferenceroomscheduler.model.Account) adminAccount88);
        adminAccount88.setPassword("Pending");
        java.lang.String str95 = adminAccount88.getAccountNumber();
        checkInPublisher25.notifyObservers((com.conferenceroomscheduler.model.Account) adminAccount88);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "hi!" + "'", str91, "hi!");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "hi!" + "'", str95, "hi!");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.isDetected;
        boolean boolean7 = occupancySensor3.isDetected;
        occupancySensor3.occupied = false;
        occupancySensor3.setOccupied(false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor15 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean16 = occupancySensor15.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher17 = null;
        occupancySensor15.subject = checkInPublisher17;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher19 = occupancySensor15.getSubject();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher20 = occupancySensor15.getSubject();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor24 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher25 = null;
        occupancySensor24.setSubject(checkInPublisher25);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor30 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor34 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean35 = occupancySensor34.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher36 = null;
        occupancySensor34.subject = checkInPublisher36;
        occupancySensor34.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher40 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor44 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher45 = null;
        occupancySensor44.setSubject(checkInPublisher45);
        occupancySensor44.occupied = true;
        occupancySensor44.setDetected(false);
        checkInPublisher40.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor44);
        occupancySensor34.setSubject(checkInPublisher40);
        occupancySensor30.setSubject(checkInPublisher40);
        occupancySensor24.setSubject(checkInPublisher40);
        occupancySensor15.setSubject(checkInPublisher40);
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
        occupancySensor15.subject = checkInPublisher69;
        occupancySensor3.setSubject(checkInPublisher69);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher85 = occupancySensor3.subject;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(checkInPublisher19);
        org.junit.Assert.assertNull(checkInPublisher20);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(checkInPublisher85);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        java.lang.String str7 = room6.getRoomId();
        room6.setClosedForMaintenance(false);
        room6.setRoomNumber("Unverified badge detected for Cancelled.");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("student", "Unverified badge detected for .", "staff", false, true, "hi!");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("staff", "Booking confirmed.", false);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation2.getPaymentMethod();
        reservation2.setFinalAmount((double) (byte) 1);
        java.lang.String str8 = reservation2.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand9 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService1, reservation2);
        reservation2.setHourlyRate((double) 0L);
        reservation2.setReservationId("Booking confirmed.");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand14 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation2);
        reservation2.setCheckedIn(false);
        reservation2.setCanceled(false);
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setFinalAmount((double) ' ');
        java.lang.String str9 = reservation0.getTitle();
        reservation0.setDepositAmount((double) (-1.0f));
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod42 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation43 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime36, localDateTime37, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod42);
        com.conferenceroomscheduler.model.Reservation reservation44 = new com.conferenceroomscheduler.model.Reservation("admin", "", "Booking complete", "Pending", localDateTime26, localDateTime27, "", (double) 'a', (double) 10L, 0.0d, paymentMethod42);
        com.conferenceroomscheduler.model.Reservation reservation45 = new com.conferenceroomscheduler.model.Reservation("hi!", "faculty", "", "Pending", localDateTime16, localDateTime17, "Unverified badge detected for Cancelled.", (double) 1.0f, (double) 0L, (-1.0d), paymentMethod42);
        reservation0.setPaymentMethod(paymentMethod42);
        reservation0.setAccountType("faculty");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + paymentMethod42 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod42.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("Booking confirmed.", "ADMIN-69", "Booking complete", true, true, "");
        java.lang.String str7 = adminAccount6.getAccountType();
        adminAccount6.setUniversityAccount(false);
        boolean boolean10 = adminAccount6.isVerified();
        java.lang.String str11 = adminAccount6.getAccountId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking confirmed." + "'", str11, "Booking confirmed.");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand6 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setAccountType("Cancelled");
        reservation1.setHourlyRate(1.0d);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        java.lang.String str26 = room6.getRoomId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cancelled" + "'", str25, "Cancelled");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        com.conferenceroomscheduler.patterns.BookingState bookingState15 = bookingContext8.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState16 = bookingContext8.getState();
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNotNull(bookingState12);
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertNotNull(bookingState16);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        java.lang.String str55 = adminAccount51.getAccountId();
        adminAccount51.setAccountNumber("Unverified badge detected for .");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("faculty", "student", (int) (byte) 10, false, "Unverified badge detected for Cancelled.", "Unverified badge detected for .");
        java.lang.String str7 = room6.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Unverified badge detected for ." + "'", str7, "Unverified badge detected for .");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        java.time.LocalDateTime localDateTime1 = null;
        reservation0.setEndTime(localDateTime1);
        reservation0.setHourlyRate((double) 'a');
        boolean boolean5 = reservation0.isCheckedIn();
        reservation0.setExtended(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        badge20.setEmail("admin");
        badge20.setVerified(false);
        badge20.setAccountId("");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        java.lang.String str7 = room6.getRoomId();
        room6.setClosedForMaintenance(false);
        int int10 = room6.getCapacity();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        reservation1.setTitle("ADMIN-69");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand15 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation2, localDateTime13, localDateTime14);
        // The following exception was thrown during execution in test generation
        try {
            editBookingCommand15.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.editBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        double double7 = reservation0.getFinalAmount();
        reservation0.setHourlyRate(0.0d);
        boolean boolean10 = reservation0.isCheckedIn();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
        com.conferenceroomscheduler.model.Room room55 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str56 = room55.getRoomId();
        room55.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount65 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room55.checkIn((com.conferenceroomscheduler.model.Account) studentAccount65);
        com.conferenceroomscheduler.model.Badge badge67 = studentAccount65.getBadge();
        boolean boolean68 = occupancySensor3.scanIdBadge(badge67);
        java.lang.String str69 = badge67.getEmail();
        java.lang.String str70 = badge67.getAccountId();
        badge67.setEmail("faculty");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(badge67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        occupancySensor17.occupied = false;
        occupancySensor17.isDetected = true;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        java.lang.String str29 = completedBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking complete" + "'", str11, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertNotNull(bookingState24);
        org.junit.Assert.assertNull(reservation27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Booking complete" + "'", str29, "Booking complete");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        int int21 = room6.getCapacity();
        com.conferenceroomscheduler.patterns.PartnerFactory partnerFactory22 = new com.conferenceroomscheduler.patterns.PartnerFactory();
        com.conferenceroomscheduler.model.Account account30 = partnerFactory22.createAccount("Checked in.", "hi!", "admin", "", true, false, "Pending");
        com.conferenceroomscheduler.model.Account account38 = partnerFactory22.createAccount("Booking complete", "hi!", "hi!", "", true, false, "Checked in.");
        com.conferenceroomscheduler.model.Account account46 = partnerFactory22.createAccount("Booking complete", "ADMIN-69", "Pending", "Checked in.", true, true, "");
        com.conferenceroomscheduler.model.Account account54 = partnerFactory22.createAccount("Checked in.", "hi!", "", "Checked in.", false, true, "Cancelled");
        // The following exception was thrown during execution in test generation
        try {
            room6.checkIn(account54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.model.OccupancySensor.setOccupied(boolean)\" because \"this.occupancySensor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cancelled" + "'", str17, "Cancelled");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(account30);
        org.junit.Assert.assertNotNull(account38);
        org.junit.Assert.assertNotNull(account46);
        org.junit.Assert.assertNotNull(account54);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        room6.setCapacity((int) '4');
        room6.setName("Cancelled");
        room6.setRoomNumber("student");
        java.lang.String str17 = room6.getBuilding();
        int int18 = room6.getCapacity();
        room6.setEnabled(false);
        java.lang.String str21 = room6.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "student" + "'", str21, "student");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Pending", "hi!", "Booking confirmed.", "", 97, localDateTime5, localDateTime6);
        int int8 = bookingRequest7.getAttendeeCount();
        java.lang.String str9 = bookingRequest7.getRoomId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Checked in.", "Unverified badge detected for .", "Booking complete", false, false, "Pending");
        java.lang.String str7 = partnerAccount6.getAccountNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pending" + "'", str7, "Pending");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) '4');
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("admin", (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("admin", "student", "Booking complete", false, true, "Booking complete");
        boolean boolean7 = staffAccount6.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setHourlyRate((double) (byte) 100);
        boolean boolean4 = reservation1.isDepositLost();
        java.time.LocalDateTime localDateTime5 = null;
        reservation1.setEndTime(localDateTime5);
        reservation1.setRoomId("");
        java.lang.String str9 = reservation1.getUserId();
        reservation1.setFinalAmount(0.0d);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand12 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        reservation0.setCanceled(false);
        reservation0.setRoomId("partner");
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod32 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod32.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("faculty", "Pending", (int) '#', "Cancelled", "Pending");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("admin", "Booking complete", (int) (byte) 1, "hi!", "Checked in.");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("faculty", "admin", (int) (byte) 100, "hi!", "Checked in.");
        com.conferenceroomscheduler.model.Room room30 = roomFactory0.createRoom("Checked in.", "admin", (int) (short) 1, "Cancelled", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room36 = roomFactory0.createRoom("Unverified badge detected for .", "Unverified badge detected for .", 100, "admin", "Pending");
        com.conferenceroomscheduler.model.Room room42 = roomFactory0.createRoom("Cancelled", "", (int) (short) 0, "student", "Checked in.");
        com.conferenceroomscheduler.model.Room room48 = roomFactory0.createRoom("Checked in.", "faculty", (int) (byte) 0, "Booking confirmed.", "admin");
        room48.setCapacity((int) (short) 1);
        java.lang.String str51 = room48.getRoomNumber();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
        org.junit.Assert.assertNotNull(room30);
        org.junit.Assert.assertNotNull(room36);
        org.junit.Assert.assertNotNull(room42);
        org.junit.Assert.assertNotNull(room48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "admin" + "'", str51, "admin");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        java.lang.String str31 = badge20.getEmail();
        java.lang.String str32 = badge20.getAccountId();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking confirmed." + "'", str23, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Cancelled" + "'", str31, "Cancelled");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        reservation0.setCanceled(false);
        java.time.LocalDateTime localDateTime8 = null;
        reservation0.setStartTime(localDateTime8);
        reservation0.setReservationId("hi!");
        boolean boolean12 = reservation0.isDepositLost();
        java.lang.Class<?> wildcardClass13 = reservation0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        java.lang.String str7 = reservation0.getAccountType();
        double double8 = reservation0.getFinalAmount();
        java.lang.String str9 = reservation0.getUserId();
        boolean boolean10 = reservation0.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = reservation0.getPaymentMethod();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(paymentMethod11);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
        java.lang.String str56 = adminAccount51.getPassword();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(badge55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand2 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("student", "hi!", "Booking complete", false, true, "Unverified badge detected for Cancelled.");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Cancelled", "hi!", "hi!", "", (int) (short) 1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getTitle();
        java.lang.String str9 = bookingRequest7.getRoomId();
        java.lang.String str10 = bookingRequest7.getRoomId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getAccountType();
        java.lang.String str5 = reservation2.getAccountType();
        boolean boolean6 = reservation2.isCheckedIn();
        java.time.LocalDateTime localDateTime7 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand8 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation2, localDateTime7);
        boolean boolean9 = extendBookingCommand8.wasSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand8.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.extendBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = null;
        occupancySensor3.setSubject(checkInPublisher12);
        occupancySensor3.isDetected = false;
        java.lang.String str16 = occupancySensor3.roomId;
        occupancySensor3.setOccupied(false);
        occupancySensor3.isDetected = false;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pending" + "'", str16, "Pending");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getRoomId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.lang.String str11 = bookingRequest7.getTitle();
        int int12 = bookingRequest7.getAttendeeCount();
        java.time.LocalDateTime localDateTime13 = bookingRequest7.getStartTime();
        java.lang.String str14 = bookingRequest7.getRequestId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        room6.setBuilding("Booking complete");
        room6.setClosedForMaintenance(true);
        java.lang.String str23 = room6.getBuilding();
        java.lang.String str24 = room6.getRoomId();
        boolean boolean25 = room6.isClosedForMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking complete" + "'", str23, "Booking complete");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        boolean boolean33 = adminAccount27.isUniversityAccount();
        adminAccount27.setAccountNumber("Pending");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        java.lang.String str4 = reservation1.getUserId();
        boolean boolean5 = reservation1.isDepositLost();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand6 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setHourlyRate((double) (-1L));
        reservation1.setRoomId("Booking complete");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        java.time.LocalDateTime localDateTime9 = null;
        reservation0.setStartTime(localDateTime9);
        java.lang.String str11 = reservation0.getAccountType();
        double double12 = reservation0.getDepositAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        com.conferenceroomscheduler.patterns.BookingState bookingState46 = bookingContext41.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState47 = bookingContext41.getState();
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNull(reservation6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Pending" + "'", str43, "Pending");
        org.junit.Assert.assertNotNull(bookingState46);
        org.junit.Assert.assertNotNull(bookingState47);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand6 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setCheckedIn(false);
        double double9 = reservation1.getHourlyRate();
        reservation1.setDepositLost(false);
        boolean boolean12 = reservation1.isDepositLost();
        reservation1.setUserId("partner");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Booking confirmed.", "hi!", "Pending", false, true, "Checked in.");
        partnerAccount6.setVerified(false);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("admin", "Booking complete", "Pending", true, false, "Checked in.");
        java.lang.String str7 = partnerAccount6.getPassword();
        partnerAccount6.setVerified(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pending" + "'", str7, "Pending");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "", "hi!", "", (int) '4', localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getTitle();
        java.lang.String str9 = bookingRequest7.getTitle();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getStartTime();
        java.lang.String str11 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setDepositAmount(0.0d);
        reservation0.setAccountType("");
        boolean boolean8 = reservation0.isCheckedIn();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        java.time.LocalDateTime localDateTime1 = null;
        reservation0.setEndTime(localDateTime1);
        reservation0.setHourlyRate((double) 'a');
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        java.lang.String str6 = bookingContext5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pending" + "'", str6, "Pending");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
        com.conferenceroomscheduler.model.Room room60 = roomFactory0.createRoom("hi!", "Booking complete", 1, "faculty", "hi!");
        com.conferenceroomscheduler.model.Room room66 = roomFactory0.createRoom("Pending", "Booking confirmed.", 10, "ADMIN-69", "");
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
        org.junit.Assert.assertNotNull(room66);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState12 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str13 = pendingBookingState12.getName();
        com.conferenceroomscheduler.model.Reservation reservation14 = new com.conferenceroomscheduler.model.Reservation();
        reservation14.setFinalAmount((double) (byte) 100);
        reservation14.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext19 = new com.conferenceroomscheduler.patterns.BookingContext(reservation14);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState20 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str21 = cancelledBookingState20.getName();
        bookingContext19.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState20);
        pendingBookingState12.handle(bookingContext19);
        pendingBookingState0.handle(bookingContext19);
        java.lang.String str25 = pendingBookingState0.getName();
        java.lang.String str26 = pendingBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pending" + "'", str11, "Pending");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pending" + "'", str13, "Pending");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Pending" + "'", str25, "Pending");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Pending" + "'", str26, "Pending");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Cancelled", "Booking confirmed.", false);
        java.lang.String str4 = badgeScan3.getBadgeId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cancelled" + "'", str4, "Cancelled");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Checked in.", "", 0, false, "admin", "Checked in.");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        bookingContext21.request();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking confirmed." + "'", str1, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking confirmed." + "'", str2, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking confirmed." + "'", str3, "Booking confirmed.");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        java.lang.String str3 = reservation0.getUserId();
        boolean boolean4 = reservation0.isDepositLost();
        reservation0.setReservationId("");
        java.time.LocalDateTime localDateTime7 = null;
        reservation0.setEndTime(localDateTime7);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        studentAccount10.setEmail("Checked in.");
        java.lang.String str14 = studentAccount10.getAccountNumber();
        boolean boolean15 = studentAccount10.isVerified();
        studentAccount10.setIdentifier("Booking confirmed.");
        studentAccount10.setIdentifier("");
        studentAccount10.setAccountType("admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setName("hi!");
        room6.setName("");
        boolean boolean11 = room6.isClosedForMaintenance();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor12 = room6.getOccupancySensor();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = room6.getOccupancySensor();
        boolean boolean14 = room6.isEnabled();
        java.lang.String str15 = room6.getBuilding();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(occupancySensor12);
        org.junit.Assert.assertNotNull(occupancySensor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getReservationId();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand7 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation2, localDateTime5, localDateTime6);
        // The following exception was thrown during execution in test generation
        try {
            editBookingCommand7.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.editBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount0 = new com.conferenceroomscheduler.model.FacultyAccount();
        facultyAccount0.setPassword("Booking confirmed.");
        facultyAccount0.setIdentifier("Booking confirmed.");
        boolean boolean5 = facultyAccount0.isVerified();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("", "Booking confirmed.", "hi!", false, true, "Checked in.");
        studentAccount6.setUniversityAccount(true);
        boolean boolean9 = studentAccount6.isUniversityAccount();
        studentAccount6.setUniversityAccount(false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "", "hi!", "", (int) '4', localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getTitle();
        int int9 = bookingRequest7.getAttendeeCount();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.lang.Class<?> wildcardClass11 = bookingRequest7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        int int8 = bookingRequest7.getAttendeeCount();
        java.lang.String str9 = bookingRequest7.getTitle();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getStartTime();
        int int11 = bookingRequest7.getAttendeeCount();
        java.lang.String str12 = bookingRequest7.getTitle();
        java.time.LocalDateTime localDateTime13 = bookingRequest7.getStartTime();
        int int14 = bookingRequest7.getAttendeeCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Booking complete", "Cancelled", (int) (short) 1, "Booking complete", "");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("ADMIN-69", "Pending", 10, "hi!", "");
        boolean boolean19 = room18.isClosedForMaintenance();
        java.lang.String str20 = room18.getRoomNumber();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState6 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str7 = cancelledBookingState6.getName();
        bookingContext5.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState6);
        com.conferenceroomscheduler.model.Reservation reservation9 = bookingContext5.getReservation();
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState10 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str11 = confirmedBookingState10.getName();
        java.lang.String str12 = confirmedBookingState10.getName();
        java.lang.String str13 = confirmedBookingState10.getName();
        bookingContext5.setState((com.conferenceroomscheduler.patterns.BookingState) confirmedBookingState10);
        com.conferenceroomscheduler.model.Reservation reservation15 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext16 = new com.conferenceroomscheduler.patterns.BookingContext(reservation15);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState17 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext16.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState17);
        com.conferenceroomscheduler.patterns.BookingState bookingState19 = bookingContext16.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState20 = bookingContext16.getState();
        com.conferenceroomscheduler.model.Reservation reservation21 = bookingContext16.getReservation();
        confirmedBookingState10.handle(bookingContext16);
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
        com.conferenceroomscheduler.model.Reservation reservation45 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext46 = new com.conferenceroomscheduler.patterns.BookingContext(reservation45);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState47 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext46.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState47);
        com.conferenceroomscheduler.patterns.BookingState bookingState49 = bookingContext46.getState();
        com.conferenceroomscheduler.model.Reservation reservation50 = bookingContext46.getReservation();
        checkedInBookingState23.handle(bookingContext46);
        com.conferenceroomscheduler.model.Reservation reservation52 = bookingContext46.getReservation();
        confirmedBookingState10.handle(bookingContext46);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cancelled" + "'", str7, "Cancelled");
        org.junit.Assert.assertNotNull(reservation9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking confirmed." + "'", str11, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking confirmed." + "'", str12, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking confirmed." + "'", str13, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState19);
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertNull(reservation21);
        org.junit.Assert.assertNotNull(bookingState29);
        org.junit.Assert.assertNotNull(bookingState30);
        org.junit.Assert.assertNotNull(bookingState49);
        org.junit.Assert.assertNull(reservation50);
        org.junit.Assert.assertNull(reservation52);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        room6.setClosedForMaintenance(false);
        boolean boolean15 = room6.isClosedForMaintenance();
        room6.setCapacity((int) (short) 100);
        room6.setRoomNumber("partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("staff", "Pending", "Unverified badge detected for Cancelled.", false, false, "hi!");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        reservation9.setDepositLost(true);
        reservation9.setRoomId("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cancelled" + "'", str7, "Cancelled");
        org.junit.Assert.assertNotNull(reservation9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        occupancySensor3.setOccupied(false);
        com.conferenceroomscheduler.model.AdminAccount adminAccount55 = new com.conferenceroomscheduler.model.AdminAccount("Pending", "Booking complete", "", true, true, "Booking confirmed.");
        adminAccount55.setVerified(true);
        boolean boolean58 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount55);
        boolean boolean59 = adminAccount55.isUniversityAccount();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(checkInPublisher38);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
        checkedInBookingState46.handle(bookingContext64);
        checkedInBookingState35.handle(bookingContext64);
        checkedInBookingState0.handle(bookingContext64);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState70 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        java.lang.String str71 = checkedInBookingState70.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState72 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState73 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation74 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext75 = new com.conferenceroomscheduler.patterns.BookingContext(reservation74);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState76 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext75.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState76);
        com.conferenceroomscheduler.patterns.BookingState bookingState78 = bookingContext75.getState();
        com.conferenceroomscheduler.model.Reservation reservation79 = bookingContext75.getReservation();
        cancelledBookingState73.handle(bookingContext75);
        checkedInBookingState72.handle(bookingContext75);
        bookingContext75.request();
        com.conferenceroomscheduler.patterns.BookingState bookingState83 = bookingContext75.getState();
        checkedInBookingState70.handle(bookingContext75);
        bookingContext64.setState((com.conferenceroomscheduler.patterns.BookingState) checkedInBookingState70);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Checked in." + "'", str10, "Checked in.");
        org.junit.Assert.assertNotNull(bookingState17);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Checked in." + "'", str34, "Checked in.");
        org.junit.Assert.assertNotNull(bookingState41);
        org.junit.Assert.assertNotNull(bookingState42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Checked in." + "'", str45, "Checked in.");
        org.junit.Assert.assertNotNull(bookingState52);
        org.junit.Assert.assertNotNull(bookingState53);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Checked in." + "'", str71, "Checked in.");
        org.junit.Assert.assertNotNull(bookingState78);
        org.junit.Assert.assertNull(reservation79);
        org.junit.Assert.assertNotNull(bookingState83);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("", "partner", "ADMIN-69", false, false, "Checked in.");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        com.conferenceroomscheduler.model.Reservation reservation55 = bookingContext51.getReservation();
        double double56 = reservation55.getDepositAmount();
        reservation55.setExtended(false);
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
        org.junit.Assert.assertNotNull(reservation55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("Booking complete", "hi!", "admin", true, true, "Booking confirmed.");
        boolean boolean7 = facultyAccount6.isUniversityAccount();
        boolean boolean8 = facultyAccount6.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str1 = adminAccount0.getEmail();
        com.conferenceroomscheduler.model.Badge badge2 = adminAccount0.getBadge();
        com.conferenceroomscheduler.model.Badge badge3 = adminAccount0.getBadge();
        java.lang.String str4 = adminAccount0.getAccountId();
        java.lang.String str5 = adminAccount0.getAccountNumber();
        adminAccount0.setIdentifier("Pending");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(badge2);
        org.junit.Assert.assertNull(badge3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        room6.setClosedForMaintenance(false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor15 = room6.getOccupancySensor();
        room6.setRoomId("");
        room6.setClosedForMaintenance(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(occupancySensor15);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setName("hi!");
        room6.setName("");
        room6.setRoomNumber("");
        java.lang.String str13 = room6.getBuilding();
        room6.setClosedForMaintenance(false);
        room6.setName("admin");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor18 = room6.getOccupancySensor();
        java.lang.String str19 = occupancySensor18.getLastEvent();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(occupancySensor18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
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
        java.lang.String str34 = reservation1.getUserId();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + paymentMethod28 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod28.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertTrue("'" + paymentMethod32 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod32.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        com.conferenceroomscheduler.model.Reservation reservation55 = bookingContext51.getReservation();
        boolean boolean56 = reservation55.isExtended();
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
        org.junit.Assert.assertNotNull(reservation55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState0 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState1 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation2 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext3 = new com.conferenceroomscheduler.patterns.BookingContext(reservation2);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState4 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext3.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState4);
        com.conferenceroomscheduler.patterns.BookingState bookingState6 = bookingContext3.getState();
        com.conferenceroomscheduler.model.Reservation reservation7 = bookingContext3.getReservation();
        cancelledBookingState1.handle(bookingContext3);
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState9 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str10 = confirmedBookingState9.getName();
        java.lang.String str11 = confirmedBookingState9.getName();
        com.conferenceroomscheduler.model.Reservation reservation12 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext13 = new com.conferenceroomscheduler.patterns.BookingContext(reservation12);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState14 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext13.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState14);
        com.conferenceroomscheduler.model.Reservation reservation16 = bookingContext13.getReservation();
        confirmedBookingState9.handle(bookingContext13);
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
        com.conferenceroomscheduler.model.Reservation reservation41 = bookingContext30.getReservation();
        java.lang.String str42 = bookingContext30.getStatus();
        java.lang.String str43 = bookingContext30.getStatus();
        confirmedBookingState9.handle(bookingContext30);
        cancelledBookingState1.handle(bookingContext30);
        checkedInBookingState0.handle(bookingContext30);
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState47 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str48 = pendingBookingState47.getName();
        com.conferenceroomscheduler.model.Reservation reservation49 = new com.conferenceroomscheduler.model.Reservation();
        reservation49.setFinalAmount((double) (byte) 100);
        reservation49.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext54 = new com.conferenceroomscheduler.patterns.BookingContext(reservation49);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState55 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str56 = cancelledBookingState55.getName();
        bookingContext54.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState55);
        pendingBookingState47.handle(bookingContext54);
        java.lang.String str59 = pendingBookingState47.getName();
        java.lang.String str60 = pendingBookingState47.getName();
        com.conferenceroomscheduler.model.Reservation reservation61 = new com.conferenceroomscheduler.model.Reservation();
        reservation61.setFinalAmount((double) (byte) 100);
        java.lang.String str64 = reservation61.getRoomId();
        reservation61.setFinalAmount((double) 10.0f);
        java.lang.String str67 = reservation61.getUserId();
        reservation61.setFinalAmount((double) ' ');
        java.lang.String str70 = reservation61.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext71 = new com.conferenceroomscheduler.patterns.BookingContext(reservation61);
        bookingContext71.request();
        pendingBookingState47.handle(bookingContext71);
        checkedInBookingState0.handle(bookingContext71);
        java.lang.String str75 = checkedInBookingState0.getName();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking confirmed." + "'", str10, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking confirmed." + "'", str11, "Booking confirmed.");
        org.junit.Assert.assertNull(reservation16);
        org.junit.Assert.assertNotNull(bookingState24);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Checked in." + "'", str28, "Checked in.");
        org.junit.Assert.assertNull(reservation33);
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertNull(reservation41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Booking complete" + "'", str42, "Booking complete");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Booking complete" + "'", str43, "Booking complete");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Pending" + "'", str48, "Pending");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Cancelled" + "'", str56, "Cancelled");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Pending" + "'", str59, "Pending");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Pending" + "'", str60, "Pending");
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Checked in." + "'", str75, "Checked in.");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Pending", "hi!", "Booking confirmed.", "", 97, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = bookingRequest7.getEndTime();
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        java.lang.String str56 = pendingBookingState44.getName();
        java.lang.String str57 = pendingBookingState44.getName();
        com.conferenceroomscheduler.model.Reservation reservation58 = new com.conferenceroomscheduler.model.Reservation();
        reservation58.setFinalAmount((double) (byte) 100);
        java.lang.String str61 = reservation58.getRoomId();
        reservation58.setFinalAmount((double) 10.0f);
        java.lang.String str64 = reservation58.getUserId();
        reservation58.setFinalAmount((double) ' ');
        java.lang.String str67 = reservation58.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext68 = new com.conferenceroomscheduler.patterns.BookingContext(reservation58);
        bookingContext68.request();
        pendingBookingState44.handle(bookingContext68);
        java.lang.String str71 = pendingBookingState44.getName();
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService72 = null;
        com.conferenceroomscheduler.model.Reservation reservation73 = new com.conferenceroomscheduler.model.Reservation();
        reservation73.setFinalAmount((double) (byte) 100);
        java.lang.String str76 = reservation73.getRoomId();
        reservation73.setFinalAmount((double) 10.0f);
        java.lang.String str79 = reservation73.getUserId();
        reservation73.setDepositAmount((double) (byte) 0);
        double double82 = reservation73.getHourlyRate();
        reservation73.setDepositLost(true);
        java.lang.String str85 = reservation73.getReservationId();
        reservation73.setRoomId("Unverified badge detected for Cancelled.");
        java.time.LocalDateTime localDateTime88 = null;
        java.time.LocalDateTime localDateTime89 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand90 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService72, reservation73, localDateTime88, localDateTime89);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext91 = new com.conferenceroomscheduler.patterns.BookingContext(reservation73);
        pendingBookingState44.handle(bookingContext91);
        com.conferenceroomscheduler.model.Reservation reservation93 = bookingContext91.getReservation();
        completedBookingState21.handle(bookingContext91);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertNotNull(bookingState32);
        org.junit.Assert.assertNotNull(bookingState33);
        org.junit.Assert.assertNotNull(bookingState40);
        org.junit.Assert.assertNull(reservation41);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Pending" + "'", str45, "Pending");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Cancelled" + "'", str53, "Cancelled");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Pending" + "'", str56, "Pending");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Pending" + "'", str57, "Pending");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Pending" + "'", str71, "Pending");
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNotNull(reservation93);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) 10);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("Cancelled", 1.0d);
        boolean boolean9 = creditCardPaymentStrategy0.processPayment("Cancelled", (double) 100);
        boolean boolean12 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) (short) -1);
        boolean boolean15 = creditCardPaymentStrategy0.processPayment("admin", (double) 100.0f);
        boolean boolean18 = creditCardPaymentStrategy0.processPayment("Booking confirmed.", (double) 1.0f);
        boolean boolean21 = creditCardPaymentStrategy0.processPayment("student", (double) (short) 10);
        boolean boolean24 = creditCardPaymentStrategy0.processPayment("Pending", 10.0d);
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
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", true, false);
        occupancySensor3.setDetected(true);
        occupancySensor3.setRoomId("student");
        java.lang.String str8 = occupancySensor3.roomId;
        occupancySensor3.setRoomId("Pending");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor3.isDetected = false;
        java.lang.String str6 = occupancySensor3.getRoomId();
        boolean boolean7 = occupancySensor3.isDetected();
        boolean boolean8 = occupancySensor3.occupied;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher9 = occupancySensor3.getSubject();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pending" + "'", str6, "Pending");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(checkInPublisher9);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getTitle();
        double double5 = reservation2.getDepositAmount();
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand7 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation2, localDateTime6);
        java.time.LocalDateTime localDateTime8 = reservation2.getEndTime();
        reservation2.setHourlyRate(1.0d);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setReservationId("Checked in.");
        double double9 = reservation0.getDepositAmount();
        reservation0.setCheckedIn(true);
        boolean boolean12 = reservation0.isCheckedIn();
        reservation0.setCanceled(false);
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        com.conferenceroomscheduler.model.StaffAccount staffAccount53 = new com.conferenceroomscheduler.model.StaffAccount("Pending", "admin", "Booking complete", false, true, "");
        boolean boolean54 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) staffAccount53);
        com.conferenceroomscheduler.model.Badge badge55 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = occupancySensor3.scanIdBadge(badge55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.model.Badge.getEmail()\" because \"badge\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str1 = adminAccount0.getAccountId();
        adminAccount0.setIdentifier("hi!");
        java.lang.String str4 = adminAccount0.getAccountNumber();
        java.lang.String str5 = adminAccount0.getPassword();
        java.lang.String str6 = adminAccount0.getAccountId();
        java.lang.String str7 = adminAccount0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("Unverified badge detected for Cancelled.", "faculty", "Pending", false, false, "Booking confirmed.");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        bookingContext41.request();
        com.conferenceroomscheduler.patterns.BookingState bookingState47 = bookingContext41.getState();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext48 = null;
        bookingState47.handle(bookingContext48);
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNull(reservation6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Pending" + "'", str43, "Pending");
        org.junit.Assert.assertNotNull(bookingState47);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        java.lang.String str12 = reservation2.getUserId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy institutionalBillingPaymentStrategy0 = new com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy();
        boolean boolean3 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", 0.0d);
        boolean boolean6 = institutionalBillingPaymentStrategy0.processPayment("Booking confirmed.", (double) '#');
        boolean boolean9 = institutionalBillingPaymentStrategy0.processPayment("admin", (double) (short) -1);
        boolean boolean12 = institutionalBillingPaymentStrategy0.processPayment("Cancelled", (double) (short) 0);
        boolean boolean15 = institutionalBillingPaymentStrategy0.processPayment("Booking confirmed.", (double) 100);
        boolean boolean18 = institutionalBillingPaymentStrategy0.processPayment("hi!", (double) 52);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
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
        boolean boolean37 = badge28.isVerified();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Cancelled" + "'", str29, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        room6.setCapacity((int) '4');
        room6.setName("hi!");
        room6.setName("");
        boolean boolean17 = room6.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor61 = new com.conferenceroomscheduler.model.OccupancySensor("ADMIN-69", false, false);
        com.conferenceroomscheduler.model.Account account62 = null;
        boolean boolean63 = occupancySensor61.detectOccupancy(account62);
        checkInPublisher42.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor61);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        java.lang.String str4 = reservation1.getUserId();
        boolean boolean5 = reservation1.isDepositLost();
        reservation1.setCheckedIn(false);
        reservation1.setAccountType("Pending");
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand10 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        // The following exception was thrown during execution in test generation
        try {
            createBookingCommand10.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.addReservation(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) '4');
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("", (double) (-1));
        boolean boolean9 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) 10L);
        boolean boolean12 = debitCardPaymentStrategy0.processPayment("hi!", (-1.0d));
        boolean boolean15 = debitCardPaymentStrategy0.processPayment("Cancelled", 32.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        java.time.LocalDateTime localDateTime1 = null;
        reservation0.setEndTime(localDateTime1);
        reservation0.setHourlyRate((double) 'a');
        boolean boolean5 = reservation0.isCheckedIn();
        boolean boolean6 = reservation0.isCanceled();
        reservation0.setDepositLost(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
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
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand15 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation2, localDateTime13, localDateTime14);
        // The following exception was thrown during execution in test generation
        try {
            editBookingCommand15.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.editBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod7 = reservation0.getPaymentMethod();
        reservation0.setCheckedIn(false);
        double double10 = reservation0.getDepositAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(paymentMethod7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime5, localDateTime6, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod11);
        boolean boolean13 = reservation12.isCheckedIn();
        java.time.LocalDateTime localDateTime14 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand15 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation12, localDateTime14);
        boolean boolean16 = reservation12.isDepositLost();
        org.junit.Assert.assertTrue("'" + paymentMethod11 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod11.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.isDetected;
        boolean boolean7 = occupancySensor3.isDetected;
        occupancySensor3.occupied = false;
        java.lang.String str10 = occupancySensor3.getRoomId();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher11 = occupancySensor3.subject;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(checkInPublisher11);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState6 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str7 = cancelledBookingState6.getName();
        bookingContext5.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState6);
        com.conferenceroomscheduler.model.Reservation reservation9 = bookingContext5.getReservation();
        boolean boolean10 = reservation9.isCheckedIn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cancelled" + "'", str7, "Cancelled");
        org.junit.Assert.assertNotNull(reservation9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("hi!", "admin", "admin", false, false, "hi!");
        facultyAccount6.setAccountNumber("hi!");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState1 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState2 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState3 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation4 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = new com.conferenceroomscheduler.patterns.BookingContext(reservation4);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState6 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext5.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState6);
        com.conferenceroomscheduler.patterns.BookingState bookingState8 = bookingContext5.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState9 = bookingContext5.getState();
        cancelledBookingState3.handle(bookingContext5);
        checkedInBookingState2.handle(bookingContext5);
        com.conferenceroomscheduler.model.Reservation reservation12 = new com.conferenceroomscheduler.model.Reservation();
        reservation12.setFinalAmount((double) (byte) 100);
        reservation12.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext17 = new com.conferenceroomscheduler.patterns.BookingContext(reservation12);
        checkedInBookingState2.handle(bookingContext17);
        cancelledBookingState1.handle(bookingContext17);
        com.conferenceroomscheduler.patterns.BookingState bookingState20 = null;
        bookingContext17.setState(bookingState20);
        com.conferenceroomscheduler.model.Reservation reservation22 = bookingContext17.getReservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand23 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation22);
        reservation22.setDepositLost(true);
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(reservation22);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        boolean boolean17 = editBookingCommand16.wasSuccessful();
        boolean boolean18 = editBookingCommand16.wasSuccessful();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setDepositAmount(0.0d);
        reservation1.setAccountType("");
        java.lang.String str9 = reservation1.getUserId();
        reservation1.setDepositAmount((double) (short) 100);
        double double12 = reservation1.getHourlyRate();
        java.time.LocalDateTime localDateTime13 = reservation1.getEndTime();
        java.time.LocalDateTime localDateTime14 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand15 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime14);
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getOrganizerId();
        java.lang.String str10 = bookingRequest7.getOrganizerId();
        java.lang.String str11 = bookingRequest7.getOrganizerId();
        java.lang.String str12 = bookingRequest7.getRequestId();
        java.lang.String str13 = bookingRequest7.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setEnabled(true);
        java.lang.String str13 = room6.getName();
        java.lang.Class<?> wildcardClass14 = room6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        room6.setCapacity((int) '4');
        room6.setName("hi!");
        room6.setName("");
        room6.setClosedForMaintenance(true);
        java.lang.String str19 = room6.getName();
        room6.setEnabled(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory38 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room44 = roomFactory38.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room50 = roomFactory38.createRoom("Pending", "Cancelled", (int) (byte) 10, "Checked in.", "Cancelled");
        com.conferenceroomscheduler.model.Room room56 = roomFactory38.createRoom("Booking complete", "student", (int) (byte) 100, "Booking complete", "faculty");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor57 = room56.getOccupancySensor();
        com.conferenceroomscheduler.model.AdminAccount adminAccount64 = new com.conferenceroomscheduler.model.AdminAccount("hi!", "", "hi!", true, false, "hi!");
        adminAccount64.setEmail("");
        java.lang.String str67 = adminAccount64.getAccountId();
        boolean boolean68 = occupancySensor57.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount64);
        checkInPublisher16.notifyObservers((com.conferenceroomscheduler.model.Account) adminAccount64);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(room44);
        org.junit.Assert.assertNotNull(room50);
        org.junit.Assert.assertNotNull(room56);
        org.junit.Assert.assertNotNull(occupancySensor57);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        double double7 = reservation0.getDepositAmount();
        reservation0.setUserId("admin");
        java.lang.String str10 = reservation0.getAccountType();
        java.time.LocalDateTime localDateTime11 = reservation0.getEndTime();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
        java.lang.String str27 = occupancySensor3.getLastEvent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor12 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount19 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean20 = occupancySensor12.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount19);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher21 = null;
        occupancySensor12.setSubject(checkInPublisher21);
        occupancySensor12.isDetected = false;
        boolean boolean25 = occupancySensor12.isOccupied();
        com.conferenceroomscheduler.model.Badge badge29 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str30 = badge29.getEmail();
        boolean boolean31 = occupancySensor12.scanIdBadge(badge29);
        java.lang.String str32 = badge29.getAccountId();
        badge29.setAccountId("Cancelled");
        badge29.setAccountId("");
        java.lang.String str37 = badge29.getAccountId();
        java.lang.String str38 = badge29.getEmail();
        boolean boolean39 = occupancySensor4.scanIdBadge(badge29);
        badge29.setVerified(false);
        badge29.setVerified(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Cancelled" + "'", str30, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Booking confirmed." + "'", str32, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Cancelled" + "'", str38, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        boolean boolean13 = room6.isEnabled();
        room6.setName("");
        com.conferenceroomscheduler.model.Account account23 = new com.conferenceroomscheduler.model.Account("ADMIN-69", "Booking complete", "Checked in.", "Unverified badge detected for .", false, false, "Cancelled");
        java.lang.String str24 = account23.getAccountId();
        // The following exception was thrown during execution in test generation
        try {
            room6.checkIn(account23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.model.OccupancySensor.setOccupied(boolean)\" because \"this.occupancySensor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ADMIN-69" + "'", str24, "ADMIN-69");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
        occupancySensor3.setRoomId("Pending");
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory49 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account57 = facultyFactory49.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account65 = facultyFactory49.createAccount("", "hi!", "", "", false, true, "");
        com.conferenceroomscheduler.model.Account account73 = facultyFactory49.createAccount("Cancelled", "Pending", "Cancelled", "hi!", false, false, "");
        boolean boolean74 = occupancySensor3.detectOccupancy(account73);
        account73.setIdentifier("student");
        account73.setAccountId("Checked in.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(account57);
        org.junit.Assert.assertNotNull(account65);
        org.junit.Assert.assertNotNull(account73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("admin", "hi!", "", false, true, "Booking complete");
        adminAccount6.setEmail("ADMIN-69");
        adminAccount6.setUniversityAccount(false);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Checked in.", "Pending", "Cancelled", true, false, "Booking confirmed.");
        com.conferenceroomscheduler.model.Badge badge7 = studentAccount6.getBadge();
        studentAccount6.setIdentifier("Pending");
        java.lang.String str10 = studentAccount6.getPassword();
        org.junit.Assert.assertNotNull(badge7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cancelled" + "'", str10, "Cancelled");
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "Unverified badge detected for .", "Booking complete", 0, localDateTime5, localDateTime6);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setName("student");
        room6.setBuilding("faculty");
        org.junit.Assert.assertNotNull(room6);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Cancelled", "hi!", "hi!", "", (int) (short) 1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRoomId();
        java.lang.String str9 = bookingRequest7.getRequestId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getStartTime();
        java.lang.String str11 = bookingRequest7.getTitle();
        java.lang.String str12 = bookingRequest7.getRequestId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cancelled" + "'", str12, "Cancelled");
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        com.conferenceroomscheduler.model.AdminAccount adminAccount30 = new com.conferenceroomscheduler.model.AdminAccount();
        checkInPublisher0.notifyObservers((com.conferenceroomscheduler.model.Account) adminAccount30);
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory32 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room38 = roomFactory32.createRoom("", "", (-1), "", "Cancelled");
        room38.setEnabled(false);
        java.lang.String str41 = room38.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor42 = room38.getOccupancySensor();
        occupancySensor42.occupied = true;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor42);
        occupancySensor42.occupied = true;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(room38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(occupancySensor42);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        com.conferenceroomscheduler.model.BookingRequest bookingRequest0 = new com.conferenceroomscheduler.model.BookingRequest();
        java.time.LocalDateTime localDateTime1 = bookingRequest0.getEndTime();
        java.lang.String str2 = bookingRequest0.getRoomId();
        java.lang.String str3 = bookingRequest0.getTitle();
        org.junit.Assert.assertNull(localDateTime1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Booking complete", "ADMIN-69", (int) '#', true, "admin", "Checked in.");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        boolean boolean10 = room6.isClosedForMaintenance();
        room6.setEnabled(false);
        room6.setEnabled(true);
        java.lang.String str15 = room6.getBuilding();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        java.lang.String str8 = room6.getBuilding();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor12 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher13 = null;
        occupancySensor12.setSubject(checkInPublisher13);
        boolean boolean15 = occupancySensor12.isDetected;
        occupancySensor12.roomId = "Booking confirmed.";
        room6.setOccupancySensor(occupancySensor12);
        boolean boolean19 = occupancySensor12.occupied;
        boolean boolean20 = occupancySensor12.occupied;
        java.lang.String str21 = occupancySensor12.getLastEvent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        java.lang.String str7 = room6.getRoomId();
        room6.setClosedForMaintenance(false);
        room6.setBuilding("hi!");
        com.conferenceroomscheduler.model.Account account12 = null;
        room6.checkIn(account12);
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        java.lang.String str4 = reservation1.getAccountType();
        java.time.LocalDateTime localDateTime5 = reservation1.getEndTime();
        reservation1.setDepositAmount((double) 0);
        reservation1.setExtended(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(localDateTime5);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str1 = adminAccount0.getEmail();
        adminAccount0.setVerified(false);
        java.lang.String str4 = adminAccount0.getAccountNumber();
        java.lang.String str5 = adminAccount0.getEmail();
        adminAccount0.setIdentifier("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        reservation10.setCheckedIn(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cancelled" + "'", str7, "Cancelled");
        org.junit.Assert.assertNotNull(reservation9);
        org.junit.Assert.assertNotNull(reservation10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        room6.setRoomId("ADMIN-69");
        room6.setRoomNumber("Checked in.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
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
        room6.setRoomId("Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getName();
        room6.setCapacity((int) '4');
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor18 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher19 = null;
        occupancySensor18.setSubject(checkInPublisher19);
        occupancySensor18.occupied = true;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher23 = occupancySensor18.subject;
        boolean boolean24 = occupancySensor18.isDetected;
        room6.setOccupancySensor(occupancySensor18);
        room6.setClosedForMaintenance(true);
        boolean boolean28 = room6.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cancelled" + "'", str12, "Cancelled");
        org.junit.Assert.assertNull(checkInPublisher23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod20 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation21 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime14, localDateTime15, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod20);
        com.conferenceroomscheduler.model.Reservation reservation22 = new com.conferenceroomscheduler.model.Reservation("admin", "", "Booking complete", "Pending", localDateTime4, localDateTime5, "", (double) 'a', (double) 10L, 0.0d, paymentMethod20);
        reservation22.setExtended(true);
        org.junit.Assert.assertTrue("'" + paymentMethod20 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod20.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        bookingContext41.request();
        com.conferenceroomscheduler.model.Reservation reservation47 = bookingContext41.getReservation();
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNull(reservation6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Pending" + "'", str43, "Pending");
        org.junit.Assert.assertNotNull(reservation47);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.model.Reservation reservation10 = new com.conferenceroomscheduler.model.Reservation();
        reservation10.setAccountType("hi!");
        java.lang.String str13 = reservation10.getUserId();
        boolean boolean14 = reservation10.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod15 = reservation10.getPaymentMethod();
        reservation10.setUserId("");
        reservation10.setDepositLost(false);
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService20 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod31 = null;
        com.conferenceroomscheduler.model.Reservation reservation32 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime25, localDateTime26, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod31);
        reservation32.setDepositLost(true);
        java.time.LocalDateTime localDateTime35 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand36 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService20, reservation32, localDateTime35);
        reservation32.setHourlyRate((double) (-1.0f));
        boolean boolean39 = reservation32.isDepositLost();
        java.lang.String str40 = reservation32.getReservationId();
        java.time.LocalDateTime localDateTime41 = reservation32.getEndTime();
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        com.conferenceroomscheduler.model.Reservation reservation62 = new com.conferenceroomscheduler.model.Reservation();
        reservation62.setFinalAmount((double) (byte) 100);
        java.lang.String str65 = reservation62.getRoomId();
        reservation62.setFinalAmount((double) 10.0f);
        java.lang.String str68 = reservation62.getUserId();
        reservation62.setDepositAmount((double) (byte) 0);
        double double71 = reservation62.getHourlyRate();
        reservation62.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext74 = new com.conferenceroomscheduler.patterns.BookingContext(reservation62);
        java.time.LocalDateTime localDateTime79 = null;
        java.time.LocalDateTime localDateTime80 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod85 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation86 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime79, localDateTime80, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod85);
        reservation62.setPaymentMethod(paymentMethod85);
        com.conferenceroomscheduler.model.Reservation reservation88 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "Booking complete", "admin", "Booking complete", localDateTime56, localDateTime57, "Booking confirmed.", (double) (short) -1, (double) 0.0f, (double) 0, paymentMethod85);
        com.conferenceroomscheduler.model.Reservation reservation89 = new com.conferenceroomscheduler.model.Reservation("student", "", "Booking complete", "Pending", localDateTime46, localDateTime47, "Checked in.", 0.0d, (double) 'a', (double) (-1.0f), paymentMethod85);
        reservation32.setPaymentMethod(paymentMethod85);
        reservation10.setPaymentMethod(paymentMethod85);
        com.conferenceroomscheduler.model.Reservation reservation92 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "faculty", "", "Checked in.", localDateTime4, localDateTime5, "", (double) (short) 100, 0.0d, (double) (short) 10, paymentMethod85);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(paymentMethod15);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(localDateTime41);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod85 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod85.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean4 = occupancySensor3.isDetected();
        java.lang.String str5 = occupancySensor3.getLastEvent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setFinalAmount((double) ' ');
        double double9 = reservation0.getHourlyRate();
        reservation0.setCanceled(true);
        java.lang.String str12 = reservation0.getReservationId();
        reservation0.setDepositAmount((double) 100);
        reservation0.setCheckedIn(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy institutionalBillingPaymentStrategy0 = new com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy();
        boolean boolean3 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", 0.0d);
        boolean boolean6 = institutionalBillingPaymentStrategy0.processPayment("Booking confirmed.", (double) '#');
        boolean boolean9 = institutionalBillingPaymentStrategy0.processPayment("admin", (double) (short) -1);
        boolean boolean12 = institutionalBillingPaymentStrategy0.processPayment("", (double) 0.0f);
        boolean boolean15 = institutionalBillingPaymentStrategy0.processPayment("faculty", (double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        boolean boolean9 = reservation0.isCheckedIn();
        boolean boolean10 = reservation0.isDepositLost();
        double double11 = reservation0.getDepositAmount();
        reservation0.setReservationId("Checked in.");
        reservation0.setCheckedIn(false);
        reservation0.setTitle("Pending");
        boolean boolean18 = reservation0.isExtended();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory43 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account51 = facultyFactory43.createAccount("Booking confirmed.", "hi!", "Cancelled", "student", true, false, "Booking complete");
        com.conferenceroomscheduler.model.Badge badge52 = account51.getBadge();
        boolean boolean53 = occupancySensor3.scanIdBadge(badge52);
        badge52.setAccountId("");
        java.lang.String str56 = badge52.getAccountId();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Cancelled" + "'", str33, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Booking confirmed." + "'", str35, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Cancelled" + "'", str38, "Cancelled");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Cancelled" + "'", str39, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(account51);
        org.junit.Assert.assertNotNull(badge52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        reservation0.setTitle("Booking confirmed.");
        java.lang.String str8 = reservation0.getUserId();
        reservation0.setFinalAmount((double) 97);
        reservation0.setDepositLost(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("", "Unverified badge detected for Cancelled.", "Unverified badge detected for .", "Booking confirmed.", (int) ' ', localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Unverified badge detected for ." + "'", str8, "Unverified badge detected for .");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str1 = adminAccount0.getEmail();
        com.conferenceroomscheduler.model.Badge badge2 = adminAccount0.getBadge();
        com.conferenceroomscheduler.model.Badge badge3 = adminAccount0.getBadge();
        adminAccount0.setIdentifier("Cancelled");
        boolean boolean6 = adminAccount0.isVerified();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(badge2);
        org.junit.Assert.assertNull(badge3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor31 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher32 = null;
        occupancySensor31.setSubject(checkInPublisher32);
        checkInPublisher27.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor31);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor38 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher39 = null;
        occupancySensor38.setSubject(checkInPublisher39);
        occupancySensor38.occupied = true;
        occupancySensor38.setDetected(false);
        java.lang.String str45 = occupancySensor38.getLastEvent();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor49 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor53 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean54 = occupancySensor53.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher55 = null;
        occupancySensor53.subject = checkInPublisher55;
        occupancySensor53.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher59 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor63 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher64 = null;
        occupancySensor63.setSubject(checkInPublisher64);
        occupancySensor63.occupied = true;
        occupancySensor63.setDetected(false);
        checkInPublisher59.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor63);
        occupancySensor53.setSubject(checkInPublisher59);
        occupancySensor49.setSubject(checkInPublisher59);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher73 = occupancySensor49.getSubject();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor77 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher78 = null;
        occupancySensor77.setSubject(checkInPublisher78);
        checkInPublisher73.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor77);
        occupancySensor38.subject = checkInPublisher73;
        occupancySensor38.setOccupied(false);
        checkInPublisher27.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor38);
        com.conferenceroomscheduler.model.Room room91 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str92 = room91.getRoomId();
        room91.setBuilding("hi!");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor95 = room91.getOccupancySensor();
        occupancySensor95.roomId = "Booking complete";
        checkInPublisher27.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor95);
        boolean boolean99 = occupancySensor95.isDetected;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(checkInPublisher27);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(checkInPublisher73);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertNotNull(occupancySensor95);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setName("student");
        java.lang.String str9 = room6.getName();
        room6.setClosedForMaintenance(false);
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        reservation0.setDepositLost(true);
        java.lang.String str12 = reservation0.getReservationId();
        java.time.LocalDateTime localDateTime13 = reservation0.getStartTime();
        reservation0.setDepositLost(true);
        boolean boolean16 = reservation0.isExtended();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        reservation0.setHourlyRate((double) (-1.0f));
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("faculty", "ADMIN-69", "Checked in.", false, true, "Booking complete");
        facultyAccount6.setAccountNumber("Unverified badge detected for Cancelled.");
        com.conferenceroomscheduler.model.Badge badge9 = facultyAccount6.getBadge();
        org.junit.Assert.assertNotNull(badge9);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        java.lang.String str3 = reservation2.getTitle();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand4 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.time.LocalDateTime localDateTime5 = reservation2.getEndTime();
        reservation2.setUserId("hi!");
        java.time.LocalDateTime localDateTime8 = reservation2.getStartTime();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand9 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation2);
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand9.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand6 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str7 = reservation1.getTitle();
        java.lang.String str8 = reservation1.getReservationId();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod29 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation30 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "hi!", "Booking complete", "Checked in.", localDateTime23, localDateTime24, "hi!", (double) 97, (double) 100L, (double) (byte) 100, paymentMethod29);
        com.conferenceroomscheduler.model.Reservation reservation31 = new com.conferenceroomscheduler.model.Reservation("Unverified badge detected for .", "faculty", "", "Unverified badge detected for .", localDateTime13, localDateTime14, "faculty", (double) (short) 100, (double) 97, (double) 1L, paymentMethod29);
        reservation1.setPaymentMethod(paymentMethod29);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + paymentMethod29 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod29.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy institutionalBillingPaymentStrategy0 = new com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy();
        boolean boolean3 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", 0.0d);
        boolean boolean6 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", (double) (short) 1);
        boolean boolean9 = institutionalBillingPaymentStrategy0.processPayment("Cancelled", 32.0d);
        boolean boolean12 = institutionalBillingPaymentStrategy0.processPayment("faculty", (double) 1);
        boolean boolean15 = institutionalBillingPaymentStrategy0.processPayment("Booking confirmed.", (double) 1);
        boolean boolean18 = institutionalBillingPaymentStrategy0.processPayment("faculty", 0.0d);
        boolean boolean21 = institutionalBillingPaymentStrategy0.processPayment("", (double) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod20 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation21 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime14, localDateTime15, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod20);
        com.conferenceroomscheduler.model.Reservation reservation22 = new com.conferenceroomscheduler.model.Reservation("admin", "", "Booking complete", "Pending", localDateTime4, localDateTime5, "", (double) 'a', (double) 10L, 0.0d, paymentMethod20);
        reservation22.setDepositAmount((double) 100.0f);
        java.lang.String str25 = reservation22.getRoomId();
        java.lang.Class<?> wildcardClass26 = reservation22.getClass();
        org.junit.Assert.assertTrue("'" + paymentMethod20 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod20.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        boolean boolean13 = room6.isClosedForMaintenance();
        boolean boolean14 = room6.isClosedForMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setRoomId("hi!");
        reservation1.setCheckedIn(true);
        reservation1.setHourlyRate((double) 'a');
        java.lang.String str11 = reservation1.getAccountType();
        java.lang.String str12 = reservation1.getRoomId();
        reservation1.setDepositAmount(32.0d);
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand16 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime15);
        boolean boolean17 = extendBookingCommand16.wasSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand16.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.extendBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        boolean boolean9 = reservation0.isExtended();
        reservation0.setReservationId("admin");
        java.time.LocalDateTime localDateTime12 = reservation0.getStartTime();
        reservation0.setExtended(false);
        reservation0.setDepositLost(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("", "ADMIN-69", "faculty", false, true, "partner");
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        com.conferenceroomscheduler.patterns.StaffFactory staffFactory0 = new com.conferenceroomscheduler.patterns.StaffFactory();
        com.conferenceroomscheduler.model.Account account8 = staffFactory0.createAccount("", "Booking complete", "Booking confirmed.", "Cancelled", false, true, "Booking complete");
        com.conferenceroomscheduler.model.Account account16 = staffFactory0.createAccount("student", "Booking confirmed.", "admin", "student", false, true, "admin");
        com.conferenceroomscheduler.model.Account account24 = staffFactory0.createAccount("Cancelled", "Booking confirmed.", "Cancelled", "", true, true, "Cancelled");
        com.conferenceroomscheduler.model.Account account32 = staffFactory0.createAccount("ADMIN-69", "Booking confirmed.", "Checked in.", "hi!", true, true, "Checked in.");
        account32.setPassword("Booking confirmed.");
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
        org.junit.Assert.assertNotNull(account32);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        reservation1.setReservationId("Checked in.");
        double double10 = reservation1.getDepositAmount();
        boolean boolean11 = reservation1.isExtended();
        java.time.LocalDateTime localDateTime12 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand13 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime12);
        java.lang.String str14 = reservation1.getRoomId();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Booking confirmed.", "", "Cancelled", "faculty", (int) (short) 1, localDateTime5, localDateTime6);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor45 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher46 = null;
        occupancySensor45.setSubject(checkInPublisher46);
        occupancySensor45.setDetected(true);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher50 = occupancySensor45.subject;
        occupancySensor45.occupied = false;
        checkInPublisher16.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor45);
        occupancySensor45.setOccupied(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(badge40);
        org.junit.Assert.assertNull(checkInPublisher50);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        reservation1.setCheckedIn(true);
        reservation1.setCanceled(false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount0.setAccountNumber("hi!");
        java.lang.String str3 = adminAccount0.getAccountType();
        adminAccount0.setIdentifier("staff");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Cancelled", "", (int) '#', true, "staff", "Booking confirmed.");
        room6.setEnabled(false);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getAccountType();
        java.lang.String str5 = reservation2.getAccountType();
        boolean boolean6 = reservation2.isCheckedIn();
        java.time.LocalDateTime localDateTime7 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand8 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation2, localDateTime7);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod9 = reservation2.getPaymentMethod();
        reservation2.setCheckedIn(false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(paymentMethod9);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("", "Booking complete", false);
        java.lang.String str4 = badge3.getEmail();
        boolean boolean5 = badge3.isVerified();
        badge3.setAccountId("student");
        badge3.setAccountId("ADMIN-69");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor4.setSubject(checkInPublisher5);
        occupancySensor4.occupied = true;
        occupancySensor4.setDetected(false);
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        occupancySensor4.occupied = true;
        java.lang.String str14 = occupancySensor4.getRoomId();
        boolean boolean15 = occupancySensor4.isDetected();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        boolean boolean4 = badgeScan3.isVerified();
        boolean boolean5 = badgeScan3.isVerified();
        java.lang.String str6 = badgeScan3.getBadgeId();
        badgeScan3.setVerified(true);
        java.lang.String str9 = badgeScan3.getRoomId();
        badgeScan3.setVerified(true);
        java.lang.String str12 = badgeScan3.getBadgeId();
        badgeScan3.setBadgeId("");
        java.lang.String str15 = badgeScan3.getRoomId();
        badgeScan3.setBadgeId("Pending");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "", "hi!", "", (int) '4', localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getTitle();
        java.lang.String str9 = bookingRequest7.getTitle();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.time.LocalDateTime localDateTime11 = bookingRequest7.getStartTime();
        java.time.LocalDateTime localDateTime12 = bookingRequest7.getStartTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
        java.lang.String str77 = occupancySensor3.roomId;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher78 = occupancySensor3.getSubject();
        com.conferenceroomscheduler.model.StudentAccount studentAccount85 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        studentAccount85.setUniversityAccount(false);
        boolean boolean88 = studentAccount85.isUniversityAccount();
        boolean boolean89 = studentAccount85.isUniversityAccount();
        studentAccount85.setAccountNumber("Cancelled");
        checkInPublisher78.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount85);
        org.junit.Assert.assertNotNull(account12);
        org.junit.Assert.assertNotNull(account20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(account62);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Pending" + "'", str77, "Pending");
        org.junit.Assert.assertNotNull(checkInPublisher78);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        com.conferenceroomscheduler.model.AdminAccount adminAccount51 = new com.conferenceroomscheduler.model.AdminAccount();
        boolean boolean52 = adminAccount51.isVerified();
        adminAccount51.setUniversityAccount(false);
        java.lang.String str55 = adminAccount51.getAccountType();
        java.lang.String str56 = adminAccount51.getAccountNumber();
        boolean boolean57 = occupancySensor48.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount51);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(account37);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str1 = adminAccount0.getEmail();
        adminAccount0.setEmail("Cancelled");
        boolean boolean4 = adminAccount0.isUniversityAccount();
        java.lang.String str5 = adminAccount0.getAccountId();
        adminAccount0.setVerified(true);
        adminAccount0.setAccountNumber("partner");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        room6.setClosedForMaintenance(false);
        room6.setEnabled(true);
        java.lang.String str17 = room6.getName();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor21 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount28 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean29 = occupancySensor21.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount28);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher30 = null;
        occupancySensor21.setSubject(checkInPublisher30);
        occupancySensor21.isDetected = false;
        boolean boolean34 = occupancySensor21.isOccupied();
        com.conferenceroomscheduler.model.Badge badge38 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str39 = badge38.getEmail();
        boolean boolean40 = occupancySensor21.scanIdBadge(badge38);
        java.lang.String str41 = occupancySensor21.getRoomId();
        com.conferenceroomscheduler.model.AdminAccount adminAccount42 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str43 = adminAccount42.getEmail();
        com.conferenceroomscheduler.model.Badge badge44 = adminAccount42.getBadge();
        com.conferenceroomscheduler.model.Badge badge45 = adminAccount42.getBadge();
        java.lang.String str46 = adminAccount42.getAccountNumber();
        adminAccount42.setAccountType("");
        boolean boolean49 = occupancySensor21.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount42);
        // The following exception was thrown during execution in test generation
        try {
            room6.checkIn((com.conferenceroomscheduler.model.Account) adminAccount42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.model.OccupancySensor.setOccupied(boolean)\" because \"this.occupancySensor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cancelled" + "'", str17, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Cancelled" + "'", str39, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Pending" + "'", str41, "Pending");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(badge44);
        org.junit.Assert.assertNull(badge45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        badge20.setVerified(false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Cancelled" + "'", str23, "Cancelled");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        boolean boolean11 = room6.isEnabled();
        boolean boolean12 = room6.isClosedForMaintenance();
        room6.setCapacity((int) (short) 100);
        room6.setClosedForMaintenance(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        java.lang.String str12 = occupancySensor3.roomId;
        boolean boolean13 = occupancySensor3.isOccupied();
        com.conferenceroomscheduler.model.StudentAccount studentAccount20 = new com.conferenceroomscheduler.model.StudentAccount("Cancelled", "Cancelled", "Pending", false, true, "Checked in.");
        boolean boolean21 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount20);
        java.lang.String str22 = studentAccount20.getEmail();
        java.lang.String str23 = studentAccount20.getEmail();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pending" + "'", str12, "Pending");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cancelled" + "'", str22, "Cancelled");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Cancelled" + "'", str23, "Cancelled");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation2.getPaymentMethod();
        reservation2.setFinalAmount((double) (byte) 1);
        java.lang.String str8 = reservation2.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand9 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService1, reservation2);
        reservation2.setHourlyRate((double) 0L);
        boolean boolean12 = reservation2.isCheckedIn();
        double double13 = reservation2.getFinalAmount();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand14 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation2);
        // The following exception was thrown during execution in test generation
        try {
            createBookingCommand14.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.addReservation(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.conferenceroomscheduler.patterns.PartnerFactory partnerFactory0 = new com.conferenceroomscheduler.patterns.PartnerFactory();
        com.conferenceroomscheduler.model.Account account8 = partnerFactory0.createAccount("Checked in.", "hi!", "admin", "", true, false, "Pending");
        com.conferenceroomscheduler.model.Account account16 = partnerFactory0.createAccount("Booking complete", "hi!", "hi!", "", true, false, "Checked in.");
        com.conferenceroomscheduler.model.Badge badge17 = account16.getBadge();
        java.lang.String str18 = badge17.getEmail();
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(badge17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        com.conferenceroomscheduler.model.AdminAccount adminAccount11 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount11.setAccountNumber("hi!");
        java.lang.String str14 = adminAccount11.getAccountId();
        room6.checkIn((com.conferenceroomscheduler.model.Account) adminAccount11);
        room6.setEnabled(false);
        int int18 = room6.getCapacity();
        java.lang.String str19 = room6.getRoomId();
        room6.setName("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand14 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext15 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("faculty", "Pending", false);
        badgeScan3.setBadgeId("ADMIN-69");
        java.lang.String str6 = badgeScan3.getRoomId();
        java.lang.String str7 = badgeScan3.getBadgeId();
        boolean boolean8 = badgeScan3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pending" + "'", str6, "Pending");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ADMIN-69" + "'", str7, "ADMIN-69");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        reservation0.setRoomId("admin");
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str1 = adminAccount0.getAccountNumber();
        java.lang.String str2 = adminAccount0.getAccountId();
        adminAccount0.setEmail("Booking complete");
        boolean boolean5 = adminAccount0.isVerified();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
        java.time.LocalDateTime localDateTime37 = null;
        reservation36.setStartTime(localDateTime37);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod33 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod33.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        com.conferenceroomscheduler.model.Reservation reservation55 = bookingContext51.getReservation();
        double double56 = reservation55.getDepositAmount();
        reservation55.setDepositAmount((double) 10L);
        reservation55.setCheckedIn(false);
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
        org.junit.Assert.assertNotNull(reservation55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor4.setSubject(checkInPublisher5);
        occupancySensor4.occupied = true;
        occupancySensor4.setDetected(false);
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor16 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher17 = null;
        occupancySensor16.setSubject(checkInPublisher17);
        occupancySensor16.occupied = true;
        occupancySensor16.setDetected(false);
        checkInPublisher12.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor16);
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor16);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor28 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher29 = null;
        occupancySensor28.setSubject(checkInPublisher29);
        occupancySensor28.occupied = true;
        occupancySensor28.setDetected(false);
        java.lang.String str35 = occupancySensor28.getLastEvent();
        occupancySensor28.setDetected(false);
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor28);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor42 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount49 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean50 = occupancySensor42.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount49);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher51 = null;
        occupancySensor42.setSubject(checkInPublisher51);
        occupancySensor42.isDetected = false;
        boolean boolean55 = occupancySensor42.isOccupied();
        com.conferenceroomscheduler.model.Badge badge59 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str60 = badge59.getEmail();
        boolean boolean61 = occupancySensor42.scanIdBadge(badge59);
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory62 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account70 = facultyFactory62.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account78 = facultyFactory62.createAccount("", "hi!", "", "", false, true, "");
        com.conferenceroomscheduler.model.Account account86 = facultyFactory62.createAccount("Cancelled", "Pending", "Cancelled", "hi!", false, false, "");
        account86.setVerified(false);
        boolean boolean89 = occupancySensor42.detectOccupancy(account86);
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor42);
        occupancySensor42.setOccupied(false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Cancelled" + "'", str60, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(account70);
        org.junit.Assert.assertNotNull(account78);
        org.junit.Assert.assertNotNull(account86);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        room6.setClosedForMaintenance(false);
        room6.setEnabled(true);
        java.lang.String str17 = room6.getRoomNumber();
        int int18 = room6.getCapacity();
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor50 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher51 = null;
        occupancySensor50.setSubject(checkInPublisher51);
        checkInPublisher46.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor50);
        room6.setOccupancySensor(occupancySensor50);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(checkInPublisher46);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState32 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState33 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation34 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext35 = new com.conferenceroomscheduler.patterns.BookingContext(reservation34);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState36 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext35.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState36);
        com.conferenceroomscheduler.patterns.BookingState bookingState38 = bookingContext35.getState();
        com.conferenceroomscheduler.model.Reservation reservation39 = bookingContext35.getReservation();
        cancelledBookingState33.handle(bookingContext35);
        checkedInBookingState32.handle(bookingContext35);
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
        checkedInBookingState32.handle(bookingContext45);
        com.conferenceroomscheduler.model.Reservation reservation53 = bookingContext45.getReservation();
        confirmedBookingState0.handle(bookingContext45);
        com.conferenceroomscheduler.model.Reservation reservation55 = bookingContext45.getReservation();
        com.conferenceroomscheduler.patterns.BookingState bookingState56 = bookingContext45.getState();
        bookingContext45.request();
        com.conferenceroomscheduler.patterns.BookingState bookingState58 = bookingContext45.getState();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking confirmed." + "'", str1, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking confirmed." + "'", str2, "Booking confirmed.");
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertNull(reservation39);
        org.junit.Assert.assertNotNull(bookingState48);
        org.junit.Assert.assertNotNull(bookingState49);
        org.junit.Assert.assertNull(reservation53);
        org.junit.Assert.assertNull(reservation55);
        org.junit.Assert.assertNotNull(bookingState56);
        org.junit.Assert.assertNotNull(bookingState58);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        adminAccount11.setAccountId("Pending");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(checkInPublisher7);
        org.junit.Assert.assertNull(checkInPublisher8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod12 = null;
        com.conferenceroomscheduler.model.Reservation reservation13 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime6, localDateTime7, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod12);
        reservation13.setDepositLost(true);
        java.time.LocalDateTime localDateTime16 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand17 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService1, reservation13, localDateTime16);
        reservation13.setAccountType("Pending");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand20 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation13);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("hi!", true, false);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        java.lang.String str20 = reservation12.getAccountType();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cancelled" + "'", str17, "Cancelled");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cancelled" + "'", str20, "Cancelled");
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setRoomId("hi!");
        reservation1.setCheckedIn(true);
        reservation1.setHourlyRate((double) 'a');
        java.lang.String str11 = reservation1.getAccountType();
        java.lang.String str12 = reservation1.getRoomId();
        reservation1.setDepositAmount(32.0d);
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand16 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime15);
        boolean boolean17 = extendBookingCommand16.wasSuccessful();
        boolean boolean18 = extendBookingCommand16.wasSuccessful();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        boolean boolean11 = room6.isClosedForMaintenance();
        room6.setRoomId("Pending");
        room6.setBuilding("ADMIN-69");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        java.lang.String str35 = adminAccount27.getAccountNumber();
        adminAccount27.setVerified(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand6 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime5);
        reservation1.setCanceled(true);
        boolean boolean9 = reservation1.isDepositLost();
        boolean boolean10 = reservation1.isCheckedIn();
        reservation1.setCheckedIn(false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
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
        java.lang.String str58 = bookingContext53.getStatus();
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
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Checked in." + "'", str58, "Checked in.");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState32 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState33 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation34 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext35 = new com.conferenceroomscheduler.patterns.BookingContext(reservation34);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState36 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext35.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState36);
        com.conferenceroomscheduler.patterns.BookingState bookingState38 = bookingContext35.getState();
        com.conferenceroomscheduler.model.Reservation reservation39 = bookingContext35.getReservation();
        cancelledBookingState33.handle(bookingContext35);
        checkedInBookingState32.handle(bookingContext35);
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
        checkedInBookingState32.handle(bookingContext45);
        com.conferenceroomscheduler.model.Reservation reservation53 = bookingContext45.getReservation();
        confirmedBookingState0.handle(bookingContext45);
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState55 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation56 = new com.conferenceroomscheduler.model.Reservation();
        reservation56.setFinalAmount((double) (byte) 100);
        reservation56.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext61 = new com.conferenceroomscheduler.patterns.BookingContext(reservation56);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState62 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str63 = cancelledBookingState62.getName();
        bookingContext61.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState62);
        completedBookingState55.handle(bookingContext61);
        bookingContext61.request();
        confirmedBookingState0.handle(bookingContext61);
        com.conferenceroomscheduler.model.Reservation reservation68 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext69 = new com.conferenceroomscheduler.patterns.BookingContext(reservation68);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState70 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext69.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState70);
        com.conferenceroomscheduler.patterns.BookingState bookingState72 = bookingContext69.getState();
        com.conferenceroomscheduler.model.Reservation reservation73 = bookingContext69.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation74 = bookingContext69.getReservation();
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
        com.conferenceroomscheduler.patterns.BookingState bookingState86 = bookingContext78.getState();
        bookingContext69.setState(bookingState86);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState88 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str89 = cancelledBookingState88.getName();
        bookingContext69.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState88);
        confirmedBookingState0.handle(bookingContext69);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking confirmed." + "'", str1, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking confirmed." + "'", str2, "Booking confirmed.");
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertNull(reservation39);
        org.junit.Assert.assertNotNull(bookingState48);
        org.junit.Assert.assertNotNull(bookingState49);
        org.junit.Assert.assertNull(reservation53);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Cancelled" + "'", str63, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState72);
        org.junit.Assert.assertNull(reservation73);
        org.junit.Assert.assertNull(reservation74);
        org.junit.Assert.assertNotNull(bookingState81);
        org.junit.Assert.assertNull(reservation82);
        org.junit.Assert.assertNotNull(bookingState86);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Cancelled" + "'", str89, "Cancelled");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        adminAccount26.setPassword("hi!");
        adminAccount26.setAccountNumber("Booking complete");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand8 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setHourlyRate((double) 0L);
        reservation1.setReservationId("Booking confirmed.");
        java.lang.String str13 = reservation1.getAccountType();
        boolean boolean14 = reservation1.isCheckedIn();
        reservation1.setDepositAmount((double) (short) 0);
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("faculty", "ADMIN-69", "admin", "Pending", (int) (byte) 1, localDateTime5, localDateTime6);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState0 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str1 = cancelledBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setFinalAmount((double) (byte) 100);
        java.lang.String str5 = reservation2.getRoomId();
        reservation2.setFinalAmount((double) 10.0f);
        java.lang.String str8 = reservation2.getUserId();
        reservation2.setFinalAmount((double) ' ');
        java.lang.String str11 = reservation2.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext12 = new com.conferenceroomscheduler.patterns.BookingContext(reservation2);
        bookingContext12.request();
        java.lang.String str14 = bookingContext12.getStatus();
        com.conferenceroomscheduler.model.Reservation reservation15 = bookingContext12.getReservation();
        cancelledBookingState0.handle(bookingContext12);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cancelled" + "'", str1, "Cancelled");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Pending" + "'", str14, "Pending");
        org.junit.Assert.assertNotNull(reservation15);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        java.lang.String str3 = reservation0.getUserId();
        boolean boolean4 = reservation0.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation0.getPaymentMethod();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod6 = reservation0.getPaymentMethod();
        boolean boolean7 = reservation0.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod8 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        reservation0.setPaymentMethod(paymentMethod8);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + paymentMethod8 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod8.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) 10);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("Cancelled", 1.0d);
        boolean boolean9 = creditCardPaymentStrategy0.processPayment("Cancelled", (double) 100);
        boolean boolean12 = creditCardPaymentStrategy0.processPayment("hi!", (double) 0L);
        boolean boolean15 = creditCardPaymentStrategy0.processPayment("Booking confirmed.", (double) (short) 100);
        boolean boolean18 = creditCardPaymentStrategy0.processPayment("Cancelled", (double) (short) 1);
        boolean boolean21 = creditCardPaymentStrategy0.processPayment("Booking complete", 0.0d);
        boolean boolean24 = creditCardPaymentStrategy0.processPayment("faculty", (double) (byte) -1);
        boolean boolean27 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        java.lang.String str12 = studentAccount10.getAccountType();
        studentAccount10.setAccountNumber("");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher45 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor49 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher50 = null;
        occupancySensor49.setSubject(checkInPublisher50);
        occupancySensor49.occupied = true;
        occupancySensor49.setDetected(false);
        checkInPublisher45.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor49);
        checkInPublisher30.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor49);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor61 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor65 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean66 = occupancySensor65.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher67 = null;
        occupancySensor65.subject = checkInPublisher67;
        occupancySensor65.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher71 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor75 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher76 = null;
        occupancySensor75.setSubject(checkInPublisher76);
        occupancySensor75.occupied = true;
        occupancySensor75.setDetected(false);
        checkInPublisher71.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor75);
        occupancySensor65.setSubject(checkInPublisher71);
        occupancySensor61.setSubject(checkInPublisher71);
        boolean boolean85 = occupancySensor61.isDetected;
        occupancySensor61.setDetected(false);
        checkInPublisher30.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor61);
        com.conferenceroomscheduler.model.AdminAccount adminAccount89 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str90 = adminAccount89.getEmail();
        adminAccount89.setEmail("Cancelled");
        boolean boolean93 = adminAccount89.isUniversityAccount();
        java.lang.String str94 = adminAccount89.getAccountId();
        java.lang.String str95 = adminAccount89.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            checkInPublisher30.notifyObservers((com.conferenceroomscheduler.model.Account) adminAccount89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.model.Badge.getEmail()\" because \"badge\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNull(str94);
        org.junit.Assert.assertNull(str95);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor3.setDetected(false);
        occupancySensor3.setRoomId("Checked in.");
        occupancySensor3.setRoomId("Checked in.");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("faculty", "Pending", false);
        badgeScan3.setRoomId("");
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        reservation2.setAccountType("admin");
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor38 = room6.getOccupancySensor();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher39 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor43 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher44 = null;
        occupancySensor43.setSubject(checkInPublisher44);
        occupancySensor43.occupied = true;
        occupancySensor43.setDetected(false);
        checkInPublisher39.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor43);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor54 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor54.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount63 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount63.setEmail("");
        boolean boolean66 = occupancySensor54.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount63);
        checkInPublisher39.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor54);
        com.conferenceroomscheduler.patterns.StudentFactory studentFactory68 = new com.conferenceroomscheduler.patterns.StudentFactory();
        com.conferenceroomscheduler.model.Account account76 = studentFactory68.createAccount("", "hi!", "", "", true, true, "hi!");
        checkInPublisher39.notifyObservers(account76);
        occupancySensor38.setSubject(checkInPublisher39);
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount79 = new com.conferenceroomscheduler.model.FacultyAccount();
        facultyAccount79.setIdentifier("ADMIN-69");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean82 = occupancySensor38.detectOccupancy((com.conferenceroomscheduler.model.Account) facultyAccount79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.model.Badge.getEmail()\" because \"badge\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(occupancySensor21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(badge28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(occupancySensor38);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(account76);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Booking confirmed.", "Booking complete", 100, true, "Pending", "ADMIN-69");
        room6.setName("hi!");
        boolean boolean9 = room6.isClosedForMaintenance();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setReservationId("Checked in.");
        double double9 = reservation0.getDepositAmount();
        reservation0.setCheckedIn(true);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod12 = reservation0.getPaymentMethod();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(paymentMethod12);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        java.lang.String str28 = occupancySensor22.getLastEvent();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Booking complete", "", "Booking complete", (int) (byte) -1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRoomId();
        java.lang.String str9 = bookingRequest7.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking complete" + "'", str8, "Booking complete");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking complete" + "'", str9, "Booking complete");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getReservationId();
        java.lang.String str5 = reservation2.getTitle();
        boolean boolean6 = reservation2.isExtended();
        reservation2.setFinalAmount(1.0d);
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand9 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        com.conferenceroomscheduler.model.AdminAccount adminAccount11 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount11.setAccountNumber("hi!");
        java.lang.String str14 = adminAccount11.getAccountId();
        room6.checkIn((com.conferenceroomscheduler.model.Account) adminAccount11);
        adminAccount11.setVerified(false);
        adminAccount11.setIdentifier("Cancelled");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("Cancelled", "Cancelled", "Booking confirmed.", "hi!", false, false, "");
        boolean boolean8 = account7.isUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        com.conferenceroomscheduler.patterns.BookingContext bookingContext16 = null;
        completedBookingState0.handle(bookingContext16);
        java.lang.String str18 = completedBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation19 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext20 = new com.conferenceroomscheduler.patterns.BookingContext(reservation19);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState21 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext20.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState21);
        com.conferenceroomscheduler.patterns.BookingState bookingState23 = bookingContext20.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState24 = bookingContext20.getState();
        bookingContext20.request();
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
        java.lang.String str55 = confirmedBookingState26.getName();
        java.lang.String str56 = confirmedBookingState26.getName();
        java.lang.String str57 = confirmedBookingState26.getName();
        bookingContext20.setState((com.conferenceroomscheduler.patterns.BookingState) confirmedBookingState26);
        completedBookingState0.handle(bookingContext20);
        bookingContext20.request();
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNotNull(bookingState12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking complete" + "'", str15, "Booking complete");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking complete" + "'", str18, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertNotNull(bookingState24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Booking confirmed." + "'", str27, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Booking confirmed." + "'", str28, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Booking confirmed." + "'", str29, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState36);
        org.junit.Assert.assertNotNull(bookingState37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Checked in." + "'", str40, "Checked in.");
        org.junit.Assert.assertNull(reservation45);
        org.junit.Assert.assertNotNull(bookingState50);
        org.junit.Assert.assertNull(reservation53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Booking confirmed." + "'", str55, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Booking confirmed." + "'", str56, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Booking confirmed." + "'", str57, "Booking confirmed.");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        occupancySensor3.occupied = true;
        occupancySensor3.setDetected(false);
        java.lang.String str10 = occupancySensor3.getLastEvent();
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount17 = new com.conferenceroomscheduler.model.PartnerAccount("Booking complete", "Checked in.", "Unverified badge detected for .", false, true, "Pending");
        boolean boolean18 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) partnerAccount17);
        occupancySensor3.isDetected = false;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        reservation1.setDepositAmount((double) (byte) 0);
        double double10 = reservation1.getHourlyRate();
        java.time.LocalDateTime localDateTime11 = reservation1.getStartTime();
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
        double double16 = reservation0.getFinalAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setFinalAmount((double) (byte) 100);
        java.lang.String str5 = reservation2.getRoomId();
        reservation2.setFinalAmount((double) 10.0f);
        java.lang.String str8 = reservation2.getUserId();
        reservation2.setDepositAmount((double) (byte) 0);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand11 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        reservation2.setReservationId("Booking complete");
        reservation2.setRoomId("student");
        reservation2.setCanceled(false);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand20 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation2, localDateTime18, localDateTime19);
        java.lang.String str21 = reservation2.getTitle();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        com.conferenceroomscheduler.model.Room room55 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str56 = room55.getRoomId();
        room55.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount65 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room55.checkIn((com.conferenceroomscheduler.model.Account) studentAccount65);
        com.conferenceroomscheduler.model.Badge badge67 = studentAccount65.getBadge();
        boolean boolean68 = occupancySensor3.scanIdBadge(badge67);
        java.lang.String str69 = badge67.getEmail();
        java.lang.String str70 = badge67.getAccountId();
        badge67.setVerified(false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(badge67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor0 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor0.update("Checked in.");
        roomSensor0.update("Checked in.");
        roomSensor0.update("Cancelled");
        roomSensor0.update("admin");
        roomSensor0.update("Booking confirmed.");
        roomSensor0.update("Unverified badge detected for Cancelled.");
        roomSensor0.update("");
        roomSensor0.update("hi!");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        java.lang.String str68 = bookingContext60.getStatus();
        java.lang.String str69 = bookingContext60.getStatus();
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
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Booking complete" + "'", str68, "Booking complete");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Booking complete" + "'", str69, "Booking complete");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        java.lang.String str24 = bookingContext12.getStatus();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Checked in." + "'", str10, "Checked in.");
        org.junit.Assert.assertNull(reservation15);
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Booking complete" + "'", str24, "Booking complete");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
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
        reservation12.setDepositLost(false);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod21 = reservation12.getPaymentMethod();
        double double22 = reservation12.getDepositAmount();
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNull(paymentMethod21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Pending", "Pending", (int) (short) -1, "", "Cancelled");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("admin", "student", 97, "Pending", "student");
        java.lang.String str19 = room18.getName();
        boolean boolean20 = room18.isClosedForMaintenance();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        boolean boolean11 = reservation1.isExtended();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        boolean boolean25 = occupancySensor15.isDetected();
        boolean boolean26 = occupancySensor15.occupied;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(checkInPublisher19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState19 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState20 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation21 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext22 = new com.conferenceroomscheduler.patterns.BookingContext(reservation21);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState23 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext22.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState23);
        com.conferenceroomscheduler.patterns.BookingState bookingState25 = bookingContext22.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState26 = bookingContext22.getState();
        cancelledBookingState20.handle(bookingContext22);
        checkedInBookingState19.handle(bookingContext22);
        java.lang.String str29 = checkedInBookingState19.getName();
        com.conferenceroomscheduler.model.Reservation reservation30 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext31 = new com.conferenceroomscheduler.patterns.BookingContext(reservation30);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState32 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext31.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState32);
        com.conferenceroomscheduler.model.Reservation reservation34 = bookingContext31.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation35 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext36 = new com.conferenceroomscheduler.patterns.BookingContext(reservation35);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState37 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext36.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState37);
        com.conferenceroomscheduler.patterns.BookingState bookingState39 = bookingContext36.getState();
        bookingContext31.setState(bookingState39);
        checkedInBookingState19.handle(bookingContext31);
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
        java.lang.String str52 = checkedInBookingState42.getName();
        com.conferenceroomscheduler.model.Reservation reservation53 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext54 = new com.conferenceroomscheduler.patterns.BookingContext(reservation53);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState55 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext54.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState55);
        com.conferenceroomscheduler.model.Reservation reservation57 = bookingContext54.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation58 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext59 = new com.conferenceroomscheduler.patterns.BookingContext(reservation58);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState60 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext59.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState60);
        com.conferenceroomscheduler.patterns.BookingState bookingState62 = bookingContext59.getState();
        bookingContext54.setState(bookingState62);
        checkedInBookingState42.handle(bookingContext54);
        bookingContext31.setState((com.conferenceroomscheduler.patterns.BookingState) checkedInBookingState42);
        cancelledBookingState0.handle(bookingContext31);
        java.lang.String str67 = cancelledBookingState0.getName();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState68 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str69 = cancelledBookingState68.getName();
        com.conferenceroomscheduler.model.Reservation reservation70 = new com.conferenceroomscheduler.model.Reservation();
        reservation70.setFinalAmount((double) (byte) 100);
        reservation70.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext75 = new com.conferenceroomscheduler.patterns.BookingContext(reservation70);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState76 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str77 = cancelledBookingState76.getName();
        bookingContext75.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState76);
        bookingContext75.request();
        cancelledBookingState68.handle(bookingContext75);
        cancelledBookingState0.handle(bookingContext75);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertNotNull(bookingState25);
        org.junit.Assert.assertNotNull(bookingState26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Checked in." + "'", str29, "Checked in.");
        org.junit.Assert.assertNull(reservation34);
        org.junit.Assert.assertNotNull(bookingState39);
        org.junit.Assert.assertNotNull(bookingState48);
        org.junit.Assert.assertNotNull(bookingState49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Checked in." + "'", str52, "Checked in.");
        org.junit.Assert.assertNull(reservation57);
        org.junit.Assert.assertNotNull(bookingState62);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Cancelled" + "'", str67, "Cancelled");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Cancelled" + "'", str69, "Cancelled");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Cancelled" + "'", str77, "Cancelled");
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Pending", "", false);
        boolean boolean4 = badgeScan3.isVerified();
        badgeScan3.setVerified(true);
        badgeScan3.setRoomId("admin");
        boolean boolean9 = badgeScan3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setCheckedIn(true);
        reservation0.setCheckedIn(false);
        java.time.LocalDateTime localDateTime11 = reservation0.getEndTime();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        java.lang.String str56 = occupancySensor47.roomId;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Pending", "Unverified badge detected for Cancelled.", false);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        double double7 = reservation0.getFinalAmount();
        reservation0.setReservationId("Pending");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext10 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        boolean boolean11 = reservation0.isExtended();
        java.time.LocalDateTime localDateTime12 = null;
        reservation0.setEndTime(localDateTime12);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "", "hi!", "", (int) '4', localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = bookingRequest7.getStartTime();
        java.lang.String str9 = bookingRequest7.getRoomId();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher45 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor49 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher50 = null;
        occupancySensor49.setSubject(checkInPublisher50);
        occupancySensor49.occupied = true;
        occupancySensor49.setDetected(false);
        checkInPublisher45.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor49);
        checkInPublisher30.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor49);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor61 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor61.isDetected = false;
        occupancySensor61.roomId = "hi!";
        checkInPublisher30.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor61);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
        java.lang.String str23 = reservation1.getTitle();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Unverified badge detected for Cancelled.", "", "faculty", true, false, "ADMIN-69");
        java.lang.String str7 = partnerAccount6.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("student", "Unverified badge detected for Cancelled.", false);
        badgeScan3.setVerified(false);
        java.lang.String str6 = badgeScan3.getBadgeId();
        java.lang.String str7 = badgeScan3.getRoomId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Unverified badge detected for Cancelled." + "'", str7, "Unverified badge detected for Cancelled.");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("admin", "hi!", "", false, true, "Booking complete");
        adminAccount6.setEmail("ADMIN-69");
        adminAccount6.setEmail("Cancelled");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand13.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.extendBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("student", "Booking confirmed.", "Checked in.", true, false, "partner");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
        java.time.LocalDateTime localDateTime17 = bookingRequest7.getEndTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory0 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account8 = facultyFactory0.createAccount("", "Cancelled", "", "hi!", false, false, "");
        account8.setAccountNumber("hi!");
        account8.setUniversityAccount(true);
        account8.setAccountNumber("Unverified badge detected for Cancelled.");
        org.junit.Assert.assertNotNull(account8);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) '4');
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("Cancelled", 1.0d);
        boolean boolean9 = debitCardPaymentStrategy0.processPayment("partner", (double) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        boolean boolean13 = extendBookingCommand12.wasSuccessful();
        boolean boolean14 = extendBookingCommand12.wasSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand12.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.extendBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(paymentMethod8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor3.isDetected = false;
        java.lang.String str6 = occupancySensor3.getRoomId();
        boolean boolean7 = occupancySensor3.occupied;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pending" + "'", str6, "Pending");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("Checked in.", "staff", "faculty", "Unverified badge detected for .", false, true, "Pending");
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setDepositAmount(0.0d);
        reservation0.setAccountType("");
        java.lang.String str8 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (short) 100);
        java.lang.String str11 = reservation0.getRoomId();
        java.time.LocalDateTime localDateTime12 = reservation0.getEndTime();
        reservation0.setRoomId("Booking complete");
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
        java.lang.String str39 = occupancySensor3.getLastEvent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pending" + "'", str6, "Pending");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        java.lang.String str48 = confirmedBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation49 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext50 = new com.conferenceroomscheduler.patterns.BookingContext(reservation49);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState51 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext50.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState51);
        com.conferenceroomscheduler.patterns.BookingState bookingState53 = bookingContext50.getState();
        java.lang.String str54 = bookingContext50.getStatus();
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState55 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation56 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext57 = new com.conferenceroomscheduler.patterns.BookingContext(reservation56);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState58 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext57.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState58);
        completedBookingState55.handle(bookingContext57);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState61 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation62 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext63 = new com.conferenceroomscheduler.patterns.BookingContext(reservation62);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState64 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext63.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState64);
        com.conferenceroomscheduler.patterns.BookingState bookingState66 = bookingContext63.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState67 = bookingContext63.getState();
        cancelledBookingState61.handle(bookingContext63);
        completedBookingState55.handle(bookingContext63);
        java.lang.String str70 = completedBookingState55.getName();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext71 = null;
        completedBookingState55.handle(bookingContext71);
        java.lang.String str73 = completedBookingState55.getName();
        bookingContext50.setState((com.conferenceroomscheduler.patterns.BookingState) completedBookingState55);
        confirmedBookingState0.handle(bookingContext50);
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
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Booking confirmed." + "'", str48, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Cancelled" + "'", str54, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState66);
        org.junit.Assert.assertNotNull(bookingState67);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Booking complete" + "'", str70, "Booking complete");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Booking complete" + "'", str73, "Booking complete");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        boolean boolean13 = editBookingCommand12.wasSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            editBookingCommand12.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.editBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        java.time.LocalDateTime localDateTime4 = reservation1.getStartTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = localDateTime4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(localDateTime4);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        java.lang.String str4 = reservation1.getAccountType();
        java.time.LocalDateTime localDateTime5 = null;
        reservation1.setStartTime(localDateTime5);
        java.lang.String str7 = reservation1.getAccountType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        com.conferenceroomscheduler.patterns.BookingContext bookingContext83 = null;
        // The following exception was thrown during execution in test generation
        try {
            confirmedBookingState0.handle(bookingContext83);
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
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        java.lang.String str4 = reservation1.getAccountType();
        java.time.LocalDateTime localDateTime5 = reservation1.getEndTime();
        java.lang.String str6 = reservation1.getTitle();
        boolean boolean7 = reservation1.isExtended();
        reservation1.setFinalAmount((double) (short) -1);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext10 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        java.lang.String str11 = bookingContext10.getStatus();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pending" + "'", str11, "Pending");
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomNumber();
        room6.setEnabled(true);
        room6.setEnabled(true);
        room6.setEnabled(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        java.time.LocalDateTime localDateTime4 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand5 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime4);
        reservation1.setDepositLost(false);
        java.lang.String str8 = reservation1.getReservationId();
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setName("hi!");
        room6.setName("");
        room6.setRoomId("admin");
        java.lang.String str13 = room6.getRoomId();
        java.lang.String str14 = room6.getRoomId();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        boolean boolean19 = room6.isEnabled();
        room6.setRoomNumber("ADMIN-69");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setFinalAmount((double) ' ');
        double double9 = reservation0.getHourlyRate();
        reservation0.setCanceled(true);
        boolean boolean12 = reservation0.isExtended();
        double double13 = reservation0.getHourlyRate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
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
        com.conferenceroomscheduler.model.Reservation reservation18 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext19 = new com.conferenceroomscheduler.patterns.BookingContext(reservation18);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState20 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext19.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState20);
        com.conferenceroomscheduler.model.Reservation reservation22 = bookingContext19.getReservation();
        checkedInBookingState0.handle(bookingContext19);
        java.lang.String str24 = checkedInBookingState0.getName();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState25 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation26 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext27 = new com.conferenceroomscheduler.patterns.BookingContext(reservation26);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState28 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext27.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState28);
        com.conferenceroomscheduler.patterns.BookingState bookingState30 = bookingContext27.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState31 = bookingContext27.getState();
        cancelledBookingState25.handle(bookingContext27);
        java.lang.String str33 = cancelledBookingState25.getName();
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
        cancelledBookingState25.handle(bookingContext35);
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService46 = null;
        com.conferenceroomscheduler.model.Reservation reservation47 = new com.conferenceroomscheduler.model.Reservation();
        reservation47.setFinalAmount((double) (byte) 100);
        java.lang.String str50 = reservation47.getRoomId();
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand53 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService46, reservation47, localDateTime51, localDateTime52);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext54 = new com.conferenceroomscheduler.patterns.BookingContext(reservation47);
        cancelledBookingState25.handle(bookingContext54);
        checkedInBookingState0.handle(bookingContext54);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Checked in." + "'", str17, "Checked in.");
        org.junit.Assert.assertNull(reservation22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Checked in." + "'", str24, "Checked in.");
        org.junit.Assert.assertNotNull(bookingState30);
        org.junit.Assert.assertNotNull(bookingState31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Cancelled" + "'", str33, "Cancelled");
        org.junit.Assert.assertNull(reservation38);
        org.junit.Assert.assertNotNull(bookingState43);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        java.lang.String str3 = reservation0.getUserId();
        boolean boolean4 = reservation0.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation0.getPaymentMethod();
        reservation0.setAccountType("hi!");
        java.lang.String str8 = reservation0.getAccountType();
        java.lang.String str9 = reservation0.getReservationId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.isDetected;
        java.lang.String str7 = occupancySensor3.getLastEvent();
        java.lang.String str8 = occupancySensor3.getRoomId();
        occupancySensor3.occupied = false;
        occupancySensor3.setOccupied(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setEnabled(false);
        java.lang.String str9 = room6.getRoomId();
        java.lang.String str10 = room6.getName();
        com.conferenceroomscheduler.model.StaffAccount staffAccount17 = new com.conferenceroomscheduler.model.StaffAccount("admin", "student", "Booking complete", false, true, "Booking complete");
        room6.checkIn((com.conferenceroomscheduler.model.Account) staffAccount17);
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
        occupancySensor3.setDetected(false);
        occupancySensor3.setDetected(false);
        occupancySensor3.occupied = true;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor3.setDetected(false);
        com.conferenceroomscheduler.model.Badge badge9 = new com.conferenceroomscheduler.model.Badge("Checked in.", "Pending", true);
        java.lang.String str10 = badge9.getAccountId();
        boolean boolean11 = occupancySensor3.scanIdBadge(badge9);
        java.lang.String str12 = occupancySensor3.getLastEvent();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Pending" + "'", str10, "Pending");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Verified badge detected for Checked in.." + "'", str12, "Verified badge detected for Checked in..");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        com.conferenceroomscheduler.patterns.StaffFactory staffFactory0 = new com.conferenceroomscheduler.patterns.StaffFactory();
        com.conferenceroomscheduler.model.Account account8 = staffFactory0.createAccount("Cancelled", "Checked in.", "", "Cancelled", true, true, "");
        java.lang.Class<?> wildcardClass9 = staffFactory0.getClass();
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Unverified badge detected for Cancelled.", "", "", true, true, "ADMIN-69");
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("", "Booking complete", false);
        java.lang.String str4 = badge3.getEmail();
        boolean boolean5 = badge3.isVerified();
        java.lang.String str6 = badge3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
        java.time.LocalDateTime localDateTime36 = reservation33.getEndTime();
        org.junit.Assert.assertTrue("'" + paymentMethod30 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod30.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertNull(localDateTime36);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor70 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher71 = null;
        occupancySensor70.setSubject(checkInPublisher71);
        occupancySensor70.occupied = true;
        occupancySensor70.setDetected(false);
        java.lang.String str77 = occupancySensor70.getLastEvent();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor81 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher82 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        occupancySensor81.setSubject(checkInPublisher82);
        occupancySensor70.subject = checkInPublisher82;
        checkInPublisher16.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor70);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(checkInPublisher65);
        org.junit.Assert.assertNull(str77);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        com.conferenceroomscheduler.patterns.AdminFactory adminFactory0 = new com.conferenceroomscheduler.patterns.AdminFactory();
        com.conferenceroomscheduler.model.Account account8 = adminFactory0.createAccount("hi!", "Cancelled", "Pending", "admin", true, false, "Booking complete");
        org.junit.Assert.assertNotNull(account8);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        boolean boolean8 = room6.isEnabled();
        room6.setCapacity(0);
        com.conferenceroomscheduler.patterns.StaffFactory staffFactory11 = new com.conferenceroomscheduler.patterns.StaffFactory();
        com.conferenceroomscheduler.model.Account account19 = staffFactory11.createAccount("Cancelled", "Checked in.", "", "Cancelled", true, true, "");
        com.conferenceroomscheduler.model.Account account27 = staffFactory11.createAccount("Booking complete", "hi!", "Unverified badge detected for Cancelled.", "Unverified badge detected for Cancelled.", true, true, "hi!");
        com.conferenceroomscheduler.model.Account account35 = staffFactory11.createAccount("Unverified badge detected for .", "hi!", "admin", "Unverified badge detected for Cancelled.", true, true, "ADMIN-69");
        room6.checkIn(account35);
        java.lang.String str37 = room6.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(account19);
        org.junit.Assert.assertNotNull(account27);
        org.junit.Assert.assertNotNull(account35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Cancelled" + "'", str37, "Cancelled");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState76 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation77 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext78 = new com.conferenceroomscheduler.patterns.BookingContext(reservation77);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState79 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext78.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState79);
        completedBookingState76.handle(bookingContext78);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState82 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation83 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext84 = new com.conferenceroomscheduler.patterns.BookingContext(reservation83);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState85 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext84.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState85);
        com.conferenceroomscheduler.patterns.BookingState bookingState87 = bookingContext84.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState88 = bookingContext84.getState();
        cancelledBookingState82.handle(bookingContext84);
        completedBookingState76.handle(bookingContext84);
        bookingContext84.request();
        // The following exception was thrown during execution in test generation
        try {
            pendingBookingState0.handle(bookingContext84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.model.Reservation.getDepositAmount()\" because the return value of \"com.conferenceroomscheduler.patterns.BookingContext.getReservation()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(bookingState87);
        org.junit.Assert.assertNotNull(bookingState88);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.isDetected;
        occupancySensor3.setRoomId("");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor12 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean13 = occupancySensor12.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher14 = null;
        occupancySensor12.subject = checkInPublisher14;
        occupancySensor12.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher18 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor22 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher23 = null;
        occupancySensor22.setSubject(checkInPublisher23);
        occupancySensor22.occupied = true;
        occupancySensor22.setDetected(false);
        checkInPublisher18.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor22);
        occupancySensor12.setSubject(checkInPublisher18);
        boolean boolean31 = occupancySensor12.occupied;
        com.conferenceroomscheduler.model.AdminAccount adminAccount32 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str33 = adminAccount32.getEmail();
        boolean boolean34 = occupancySensor12.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount32);
        boolean boolean35 = occupancySensor12.occupied;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher36 = occupancySensor12.subject;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor40 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher41 = null;
        occupancySensor40.setSubject(checkInPublisher41);
        occupancySensor40.occupied = true;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher45 = occupancySensor40.subject;
        boolean boolean46 = occupancySensor40.isDetected;
        checkInPublisher36.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor40);
        com.conferenceroomscheduler.model.Room room54 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str55 = room54.getRoomId();
        room54.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount64 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room54.checkIn((com.conferenceroomscheduler.model.Account) studentAccount64);
        checkInPublisher36.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount64);
        occupancySensor3.subject = checkInPublisher36;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(checkInPublisher36);
        org.junit.Assert.assertNull(checkInPublisher45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        java.lang.String str15 = bookingRequest7.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }
}

