package testRandoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("faculty", true, false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState58 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState59 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation60 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext61 = new com.conferenceroomscheduler.patterns.BookingContext(reservation60);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState62 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext61.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState62);
        com.conferenceroomscheduler.patterns.BookingState bookingState64 = bookingContext61.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState65 = bookingContext61.getState();
        cancelledBookingState59.handle(bookingContext61);
        checkedInBookingState58.handle(bookingContext61);
        checkedInBookingState48.handle(bookingContext61);
        bookingContext39.setState((com.conferenceroomscheduler.patterns.BookingState) checkedInBookingState48);
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
        org.junit.Assert.assertNotNull(bookingState54);
        org.junit.Assert.assertNull(reservation55);
        org.junit.Assert.assertNotNull(bookingState64);
        org.junit.Assert.assertNotNull(bookingState65);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setName("hi!");
        room6.setName("");
        java.lang.String str11 = room6.getName();
        room6.setName("Unverified badge detected for .");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        java.lang.String str6 = badgeScan3.getBadgeId();
        java.lang.String str7 = badgeScan3.getRoomId();
        boolean boolean8 = badgeScan3.isVerified();
        badgeScan3.setVerified(false);
        java.lang.String str11 = badgeScan3.getBadgeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        badge20.setVerified(false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking confirmed." + "'", str23, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Cancelled" + "'", str26, "Cancelled");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Cancelled" + "'", str27, "Cancelled");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("Checked in.", "staff", "Verified badge detected for Checked in..", true, true, "Unverified badge detected for .");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        reservation0.setExtended(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("partner", "Checked in.", "staff", false, false, "ADMIN-69");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
        boolean boolean34 = studentAccount32.isUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(account18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        boolean boolean90 = room6.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cancelled" + "'", str20, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        boolean boolean78 = partnerAccount73.isUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = room6.getOccupancySensor();
        boolean boolean11 = occupancySensor10.isOccupied();
        boolean boolean12 = occupancySensor10.isDetected;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(occupancySensor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        boolean boolean10 = room6.isClosedForMaintenance();
        room6.setEnabled(false);
        room6.setEnabled(true);
        room6.setRoomId("");
        room6.setRoomId("admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor3.isDetected = false;
        java.lang.String str6 = occupancySensor3.getRoomId();
        boolean boolean7 = occupancySensor3.isDetected();
        occupancySensor3.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher10 = occupancySensor3.getSubject();
        com.conferenceroomscheduler.model.Room room17 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str18 = room17.getRoomId();
        room17.setRoomId("hi!");
        java.lang.String str21 = room17.getRoomId();
        room17.setCapacity((int) '4');
        room17.setName("hi!");
        com.conferenceroomscheduler.model.AdminAccount adminAccount26 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str27 = adminAccount26.getEmail();
        adminAccount26.setEmail("Cancelled");
        boolean boolean30 = adminAccount26.isUniversityAccount();
        java.lang.String str31 = adminAccount26.getAccountId();
        room17.checkIn((com.conferenceroomscheduler.model.Account) adminAccount26);
        boolean boolean33 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount26);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pending" + "'", str6, "Pending");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(checkInPublisher10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher56 = occupancySensor48.subject;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(checkInPublisher52);
        org.junit.Assert.assertNotNull(checkInPublisher56);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        boolean boolean3 = reservation1.isCanceled();
        reservation1.setCanceled(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        double double7 = reservation0.getFinalAmount();
        reservation0.setReservationId("Pending");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext10 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        java.time.LocalDateTime localDateTime11 = reservation0.getStartTime();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
        reservation0.setRoomId("Booking complete");
        boolean boolean29 = reservation0.isExtended();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod23 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod23.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        badgeScan3.setVerified(false);
        java.lang.String str8 = badgeScan3.getBadgeId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("hi!", "student", "admin", false, false, "Cancelled");
        java.lang.String str7 = partnerAccount6.getAccountId();
        partnerAccount6.setPassword("student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setRoomNumber("Pending");
        room6.setRoomNumber("Pending");
        java.lang.String str15 = room6.getBuilding();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setFinalAmount((double) (byte) 100);
        java.lang.String str5 = reservation2.getRoomId();
        reservation2.setFinalAmount((double) 10.0f);
        java.lang.String str8 = reservation2.getUserId();
        reservation2.setDepositAmount((double) (byte) 0);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand11 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.time.LocalDateTime localDateTime12 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand13 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation2, localDateTime12);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand13.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.extendBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod30 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation31 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime24, localDateTime25, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod30);
        com.conferenceroomscheduler.model.Reservation reservation32 = new com.conferenceroomscheduler.model.Reservation("Booking confirmed.", "Booking confirmed.", "", "", localDateTime14, localDateTime15, "Booking complete", 0.0d, (double) 0, (double) 100.0f, paymentMethod30);
        com.conferenceroomscheduler.model.Reservation reservation33 = new com.conferenceroomscheduler.model.Reservation("partner", "Checked in.", "", "Booking confirmed.", localDateTime4, localDateTime5, "faculty", (double) 1, (double) (-1L), (double) (byte) 100, paymentMethod30);
        org.junit.Assert.assertTrue("'" + paymentMethod30 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod30.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("", "", "hi!", true, true, "Cancelled");
        com.conferenceroomscheduler.model.Badge badge7 = partnerAccount6.getBadge();
        java.lang.String str8 = partnerAccount6.getEmail();
        org.junit.Assert.assertNotNull(badge7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        reservation0.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext12 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod13 = reservation0.getPaymentMethod();
        java.time.LocalDateTime localDateTime14 = reservation0.getStartTime();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(paymentMethod13);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        java.lang.String str8 = room6.getRoomNumber();
        room6.setBuilding("ADMIN-69");
        room6.setRoomId("");
        boolean boolean13 = room6.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        java.lang.String str7 = reservation0.getAccountType();
        reservation0.setExtended(false);
        reservation0.setDepositAmount((double) '4');
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setHourlyRate((double) (byte) 100);
        boolean boolean4 = reservation1.isDepositLost();
        java.lang.String str5 = reservation1.getUserId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand6 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        // The following exception was thrown during execution in test generation
        try {
            createBookingCommand6.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.addReservation(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        reservation0.setRoomId("Booking complete");
        double double29 = reservation0.getFinalAmount();
        reservation0.setDepositLost(false);
        reservation0.setUserId("Unverified badge detected for .");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod23 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod23.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        boolean boolean9 = occupancySensor4.isDetected;
        boolean boolean10 = occupancySensor4.occupied;
        occupancySensor4.setDetected(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        occupancySensor4.setOccupied(true);
        occupancySensor4.occupied = false;
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount19 = new com.conferenceroomscheduler.model.PartnerAccount("Booking complete", "hi!", "", true, true, "Unverified badge detected for Cancelled.");
        boolean boolean20 = occupancySensor4.detectOccupancy((com.conferenceroomscheduler.model.Account) partnerAccount19);
        partnerAccount19.setAccountNumber("Booking complete");
        partnerAccount19.setAccountNumber("Pending");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        com.conferenceroomscheduler.patterns.BookingContext bookingContext24 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkedInBookingState0.handle(bookingContext24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.patterns.BookingContext.setState(com.conferenceroomscheduler.patterns.BookingState)\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Checked in." + "'", str10, "Checked in.");
        org.junit.Assert.assertNull(reservation15);
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Checked in." + "'", str23, "Checked in.");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand6 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        boolean boolean7 = cancelBookingCommand6.wasSuccessful();
        boolean boolean8 = cancelBookingCommand6.wasSuccessful();
        boolean boolean9 = cancelBookingCommand6.wasSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand6.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.conferenceroomscheduler.model.Reservation reservation0 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext1 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState2 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext1.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState2);
        java.lang.String str4 = cancelledBookingState2.getName();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = null;
        cancelledBookingState2.handle(bookingContext5);
        com.conferenceroomscheduler.model.Reservation reservation7 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext8 = new com.conferenceroomscheduler.patterns.BookingContext(reservation7);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState9 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext8.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState9);
        com.conferenceroomscheduler.patterns.BookingState bookingState11 = bookingContext8.getState();
        com.conferenceroomscheduler.model.Reservation reservation12 = bookingContext8.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation13 = bookingContext8.getReservation();
        cancelledBookingState2.handle(bookingContext8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cancelled" + "'", str4, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNull(reservation12);
        org.junit.Assert.assertNull(reservation13);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        double double20 = reservation12.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState13 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation14 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext15 = new com.conferenceroomscheduler.patterns.BookingContext(reservation14);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState16 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext15.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState16);
        completedBookingState13.handle(bookingContext15);
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState19 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        java.lang.String str20 = completedBookingState19.getName();
        java.lang.String str21 = completedBookingState19.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState22 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState23 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation24 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext25 = new com.conferenceroomscheduler.patterns.BookingContext(reservation24);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState26 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext25.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState26);
        com.conferenceroomscheduler.patterns.BookingState bookingState28 = bookingContext25.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState29 = bookingContext25.getState();
        cancelledBookingState23.handle(bookingContext25);
        checkedInBookingState22.handle(bookingContext25);
        java.lang.String str32 = checkedInBookingState22.getName();
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
        checkedInBookingState22.handle(bookingContext34);
        com.conferenceroomscheduler.model.Reservation reservation45 = bookingContext34.getReservation();
        completedBookingState19.handle(bookingContext34);
        java.lang.String str47 = completedBookingState19.getName();
        bookingContext15.setState((com.conferenceroomscheduler.patterns.BookingState) completedBookingState19);
        com.conferenceroomscheduler.model.Reservation reservation49 = bookingContext15.getReservation();
        // The following exception was thrown during execution in test generation
        try {
            pendingBookingState0.handle(bookingContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.model.Reservation.getDepositAmount()\" because the return value of \"com.conferenceroomscheduler.patterns.BookingContext.getReservation()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pending" + "'", str11, "Pending");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pending" + "'", str12, "Pending");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Booking complete" + "'", str20, "Booking complete");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Booking complete" + "'", str21, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState28);
        org.junit.Assert.assertNotNull(bookingState29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Checked in." + "'", str32, "Checked in.");
        org.junit.Assert.assertNull(reservation37);
        org.junit.Assert.assertNotNull(bookingState42);
        org.junit.Assert.assertNull(reservation45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Booking complete" + "'", str47, "Booking complete");
        org.junit.Assert.assertNull(reservation49);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        boolean boolean89 = badge80.isVerified();
        badge80.setVerified(true);
        badge80.setVerified(false);
        java.lang.String str94 = badge80.getAccountId();
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
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "Cancelled" + "'", str94, "Cancelled");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation2.getPaymentMethod();
        reservation2.setFinalAmount((double) (byte) 1);
        java.lang.String str8 = reservation2.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand9 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService1, reservation2);
        reservation2.setHourlyRate((double) 0L);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod32 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation33 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime26, localDateTime27, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod32);
        com.conferenceroomscheduler.model.Reservation reservation34 = new com.conferenceroomscheduler.model.Reservation("admin", "", "Booking complete", "Pending", localDateTime16, localDateTime17, "", (double) 'a', (double) 10L, 0.0d, paymentMethod32);
        reservation2.setPaymentMethod(paymentMethod32);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand36 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation2);
        java.lang.String str37 = reservation2.getUserId();
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + paymentMethod32 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod32.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("Booking confirmed.", "Unverified badge detected for Cancelled.", "Checked in.", false, false, "Pending");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        boolean boolean54 = occupancySensor3.isDetected;
        occupancySensor3.occupied = false;
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("hi!", "ADMIN-69", "Cancelled", true, true, "admin");
        studentAccount6.setPassword("");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        java.time.LocalDateTime localDateTime10 = reservation0.getStartTime();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = reservation0.getPaymentMethod();
        reservation0.setRoomId("ADMIN-69");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(paymentMethod11);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        double double8 = reservation1.getDepositAmount();
        reservation1.setDepositLost(false);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand11 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        boolean boolean12 = cancelBookingCommand11.wasSuccessful();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        reservation0.setDepositLost(false);
        boolean boolean17 = reservation0.isCanceled();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setRoomNumber("ADMIN-69");
        java.lang.String str9 = room6.getRoomId();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Pending", "Cancelled", (int) (byte) 10, "Checked in.", "Cancelled");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("Booking complete", "student", (int) (byte) 100, "Booking complete", "faculty");
        boolean boolean19 = room18.isClosedForMaintenance();
        room18.setCapacity((int) 'a');
        room18.setCapacity((int) (byte) 100);
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("staff", "ADMIN-69", "hi!", "Cancelled", (int) (byte) -1, localDateTime5, localDateTime6);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState31 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation32 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext33 = new com.conferenceroomscheduler.patterns.BookingContext(reservation32);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState34 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext33.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState34);
        com.conferenceroomscheduler.patterns.BookingState bookingState36 = bookingContext33.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState37 = bookingContext33.getState();
        cancelledBookingState31.handle(bookingContext33);
        com.conferenceroomscheduler.patterns.BookingState bookingState39 = bookingContext33.getState();
        confirmedBookingState0.handle(bookingContext33);
        bookingContext33.request();
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
        org.junit.Assert.assertNotNull(bookingState36);
        org.junit.Assert.assertNotNull(bookingState37);
        org.junit.Assert.assertNotNull(bookingState39);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setRoomId("Booking confirmed.");
        java.lang.String str6 = badgeScan3.getBadgeId();
        badgeScan3.setVerified(true);
        java.lang.String str9 = badgeScan3.getRoomId();
        badgeScan3.setBadgeId("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking confirmed." + "'", str9, "Booking confirmed.");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        com.conferenceroomscheduler.model.Reservation reservation22 = new com.conferenceroomscheduler.model.Reservation();
        reservation22.setFinalAmount((double) (byte) 100);
        java.lang.String str25 = reservation22.getRoomId();
        reservation22.setFinalAmount((double) 10.0f);
        java.lang.String str28 = reservation22.getUserId();
        reservation22.setFinalAmount((double) ' ');
        java.lang.String str31 = reservation22.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext32 = new com.conferenceroomscheduler.patterns.BookingContext(reservation22);
        bookingContext32.request();
        java.lang.String str34 = bookingContext32.getStatus();
        checkedInBookingState0.handle(bookingContext32);
        com.conferenceroomscheduler.patterns.BookingState bookingState36 = bookingContext32.getState();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Pending" + "'", str34, "Pending");
        org.junit.Assert.assertNotNull(bookingState36);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "Checked in.", true);
        badgeScan3.setVerified(false);
        boolean boolean6 = badgeScan3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor23 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor23.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount32 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount32.setEmail("");
        boolean boolean35 = occupancySensor23.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount32);
        boolean boolean36 = occupancySensor12.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount32);
        java.lang.String str37 = occupancySensor12.getRoomId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Booking confirmed." + "'", str37, "Booking confirmed.");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand6 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setCheckedIn(false);
        double double9 = reservation1.getHourlyRate();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod20 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation21 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime14, localDateTime15, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod20);
        reservation1.setPaymentMethod(paymentMethod20);
        reservation1.setReservationId("Booking confirmed.");
        reservation1.setHourlyRate((double) 1L);
        reservation1.setUserId("Unverified badge detected for .");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod20 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod20.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
        // The following exception was thrown during execution in test generation
        try {
            editBookingCommand12.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.editBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("ADMIN-69", "Booking complete", "Checked in.", "Unverified badge detected for .", false, false, "Cancelled");
        account7.setUniversityAccount(true);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Cancelled", "ADMIN-69", "hi!", "Booking confirmed.", (int) '#', localDateTime5, localDateTime6);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount0 = new com.conferenceroomscheduler.model.PartnerAccount();
        java.lang.String str1 = partnerAccount0.getAccountNumber();
        partnerAccount0.setVerified(true);
        java.lang.String str4 = partnerAccount0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        boolean boolean10 = room6.isClosedForMaintenance();
        java.lang.String str11 = room6.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cancelled" + "'", str11, "Cancelled");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
        boolean boolean32 = occupancySensor3.isDetected;
        com.conferenceroomscheduler.model.StaffAccount staffAccount39 = new com.conferenceroomscheduler.model.StaffAccount("Booking complete", "Cancelled", "admin", false, true, "Cancelled");
        boolean boolean40 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) staffAccount39);
        boolean boolean41 = occupancySensor3.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pending" + "'", str23, "Pending");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        java.lang.String str3 = reservation0.getUserId();
        boolean boolean4 = reservation0.isDepositLost();
        reservation0.setCheckedIn(false);
        double double7 = reservation0.getFinalAmount();
        boolean boolean8 = reservation0.isExtended();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount66 = new com.conferenceroomscheduler.model.PartnerAccount("hi!", "", "", true, true, "");
        checkInPublisher37.notifyObservers((com.conferenceroomscheduler.model.Account) partnerAccount66);
        partnerAccount66.setAccountType("Pending");
        partnerAccount66.setIdentifier("Unverified badge detected for Cancelled.");
        java.lang.String str72 = partnerAccount66.getAccountNumber();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount0.setAccountNumber("hi!");
        java.lang.String str3 = adminAccount0.getAccountId();
        adminAccount0.setAccountType("Booking complete");
        adminAccount0.setAccountNumber("Booking complete");
        java.lang.String str8 = adminAccount0.getEmail();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        boolean boolean13 = room6.isEnabled();
        room6.setName("");
        java.lang.String str16 = room6.getBuilding();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        bookingContext19.request();
        java.lang.String str26 = bookingContext19.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pending" + "'", str11, "Pending");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pending" + "'", str13, "Pending");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Cancelled" + "'", str26, "Cancelled");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy institutionalBillingPaymentStrategy0 = new com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy();
        boolean boolean3 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", 0.0d);
        boolean boolean6 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", (double) (short) 1);
        boolean boolean9 = institutionalBillingPaymentStrategy0.processPayment("Cancelled", 32.0d);
        boolean boolean12 = institutionalBillingPaymentStrategy0.processPayment("faculty", (double) 1);
        boolean boolean15 = institutionalBillingPaymentStrategy0.processPayment("Cancelled", 100.0d);
        boolean boolean18 = institutionalBillingPaymentStrategy0.processPayment("admin", 0.0d);
        boolean boolean21 = institutionalBillingPaymentStrategy0.processPayment("", (double) 97);
        boolean boolean24 = institutionalBillingPaymentStrategy0.processPayment("partner", (double) 'a');
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
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("", "Booking confirmed.", "", false, false, "");
        adminAccount6.setAccountId("");
        boolean boolean9 = adminAccount6.isVerified();
        adminAccount6.setAccountNumber("Cancelled");
        adminAccount6.setAccountType("Booking complete");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory0 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account8 = facultyFactory0.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account16 = facultyFactory0.createAccount("", "hi!", "", "", false, true, "");
        account16.setAccountNumber("Checked in.");
        boolean boolean19 = account16.isVerified();
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
        com.conferenceroomscheduler.model.Account account67 = new com.conferenceroomscheduler.model.Account("partner", "Booking complete", "staff", "Unverified badge detected for .", true, true, "Booking complete");
        checkInPublisher37.notifyObservers(account67);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setRoomId("Booking confirmed.");
        java.lang.String str6 = badgeScan3.getBadgeId();
        java.lang.String str7 = badgeScan3.getBadgeId();
        badgeScan3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState28 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation29 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext30 = new com.conferenceroomscheduler.patterns.BookingContext(reservation29);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState31 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext30.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState31);
        com.conferenceroomscheduler.patterns.BookingState bookingState33 = bookingContext30.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState34 = bookingContext30.getState();
        cancelledBookingState28.handle(bookingContext30);
        com.conferenceroomscheduler.patterns.BookingState bookingState36 = bookingContext30.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState37 = bookingContext30.getState();
        // The following exception was thrown during execution in test generation
        try {
            pendingBookingState0.handle(bookingContext30);
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
        org.junit.Assert.assertNotNull(bookingState33);
        org.junit.Assert.assertNotNull(bookingState34);
        org.junit.Assert.assertNotNull(bookingState36);
        org.junit.Assert.assertNotNull(bookingState37);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        java.lang.String str3 = reservation0.getUserId();
        boolean boolean4 = reservation0.isDepositLost();
        reservation0.setDepositLost(false);
        double double7 = reservation0.getHourlyRate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setCheckedIn(true);
        java.lang.String str9 = reservation0.getAccountType();
        java.lang.String str10 = reservation0.getRoomId();
        java.time.LocalDateTime localDateTime11 = reservation0.getEndTime();
        java.lang.String str12 = reservation0.getUserId();
        java.time.LocalDateTime localDateTime13 = null;
        reservation0.setStartTime(localDateTime13);
        reservation0.setDepositAmount((double) ' ');
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        boolean boolean9 = occupancySensor4.isDetected;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher10 = occupancySensor4.subject;
        occupancySensor4.roomId = "hi!";
        occupancySensor4.setRoomId("Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(checkInPublisher10);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        boolean boolean1 = adminAccount0.isVerified();
        adminAccount0.setUniversityAccount(false);
        java.lang.String str4 = adminAccount0.getPassword();
        java.lang.String str5 = adminAccount0.getEmail();
        java.lang.String str6 = adminAccount0.getEmail();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.conferenceroomscheduler.patterns.StaffFactory staffFactory0 = new com.conferenceroomscheduler.patterns.StaffFactory();
        com.conferenceroomscheduler.model.Account account8 = staffFactory0.createAccount("Cancelled", "Checked in.", "", "Cancelled", true, true, "");
        com.conferenceroomscheduler.model.Account account16 = staffFactory0.createAccount("Booking complete", "Unverified badge detected for .", "Unverified badge detected for .", "Cancelled", false, false, "Unverified badge detected for .");
        com.conferenceroomscheduler.model.Account account24 = staffFactory0.createAccount("hi!", "partner", "Unverified badge detected for Cancelled.", "Unverified badge detected for Cancelled.", true, false, "ADMIN-69");
        com.conferenceroomscheduler.model.Account account32 = staffFactory0.createAccount("admin", "", "faculty", "Booking confirmed.", true, false, "partner");
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
        org.junit.Assert.assertNotNull(account32);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("", "Booking confirmed.", "", false, false, "");
        adminAccount6.setAccountId("");
        java.lang.String str9 = adminAccount6.getAccountId();
        java.lang.String str10 = adminAccount6.getAccountId();
        boolean boolean11 = adminAccount6.isVerified();
        boolean boolean12 = adminAccount6.isVerified();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("hi!", "hi!", "hi!", true, true, "Pending");
        boolean boolean7 = facultyAccount6.isUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        occupancySensor3.setDetected(false);
        java.lang.String str29 = occupancySensor3.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Pending" + "'", str29, "Pending");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("faculty", "", "Booking confirmed.", false, false, "admin");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = occupancySensor3.getSubject();
        com.conferenceroomscheduler.model.AdminAccount adminAccount19 = new com.conferenceroomscheduler.model.AdminAccount("", "Booking confirmed.", "", false, false, "");
        adminAccount19.setAccountId("");
        boolean boolean22 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount19);
        com.conferenceroomscheduler.model.Badge badge23 = adminAccount19.getBadge();
        badge23.setAccountId("Booking complete");
        badge23.setVerified(false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(checkInPublisher12);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(badge23);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        occupancySensor3.roomId = "Booking confirmed.";
        occupancySensor3.setOccupied(false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "", "hi!", "", (int) '4', localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = bookingRequest7.getStartTime();
        java.lang.String str9 = bookingRequest7.getRequestId();
        java.lang.String str10 = bookingRequest7.getRoomId();
        java.time.LocalDateTime localDateTime11 = bookingRequest7.getStartTime();
        int int12 = bookingRequest7.getAttendeeCount();
        int int13 = bookingRequest7.getAttendeeCount();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor59 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean60 = occupancySensor59.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher61 = null;
        occupancySensor59.subject = checkInPublisher61;
        occupancySensor59.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher65 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor69 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher70 = null;
        occupancySensor69.setSubject(checkInPublisher70);
        occupancySensor69.occupied = true;
        occupancySensor69.setDetected(false);
        checkInPublisher65.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor69);
        occupancySensor59.setSubject(checkInPublisher65);
        boolean boolean78 = occupancySensor59.occupied;
        boolean boolean79 = occupancySensor59.occupied;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher80 = occupancySensor59.getSubject();
        occupancySensor59.occupied = false;
        checkInPublisher55.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor59);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor87 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher88 = null;
        occupancySensor87.setSubject(checkInPublisher88);
        boolean boolean90 = occupancySensor87.isDetected;
        occupancySensor87.setRoomId("");
        checkInPublisher55.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor87);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(checkInPublisher52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(checkInPublisher55);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(checkInPublisher80);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        java.lang.String str9 = reservation0.getAccountType();
        reservation0.setRoomId("Unverified badge detected for .");
        reservation0.setAccountType("partner");
        double double14 = reservation0.getFinalAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("", "Verified badge detected for Checked in..", "", false, true, "Unverified badge detected for .");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("", "Verified badge detected for Checked in..", true);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy institutionalBillingPaymentStrategy0 = new com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy();
        boolean boolean3 = institutionalBillingPaymentStrategy0.processPayment("", (double) (short) -1);
        boolean boolean6 = institutionalBillingPaymentStrategy0.processPayment("Pending", 97.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        java.lang.String str74 = occupancySensor59.roomId;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Pending" + "'", str74, "Pending");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        java.lang.String str43 = occupancySensor3.getLastEvent();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Cancelled" + "'", str33, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Booking confirmed." + "'", str35, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Cancelled" + "'", str38, "Cancelled");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Cancelled" + "'", str39, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unverified badge detected for Cancelled." + "'", str43, "Unverified badge detected for Cancelled.");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "", "hi!", "", (int) '4', localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getTitle();
        java.lang.String str9 = bookingRequest7.getOrganizerId();
        java.lang.String str10 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.isDetected;
        com.conferenceroomscheduler.model.Badge badge10 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        boolean boolean11 = occupancySensor3.scanIdBadge(badge10);
        occupancySensor3.roomId = "";
        occupancySensor3.setOccupied(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        occupancySensor4.setOccupied(true);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher11 = occupancySensor4.getSubject();
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
        checkInPublisher11.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor15);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher35 = occupancySensor15.subject;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(checkInPublisher11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(checkInPublisher35);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor66 = new com.conferenceroomscheduler.model.OccupancySensor("Booking complete", false, false);
        java.lang.String str67 = occupancySensor66.roomId;
        checkInPublisher11.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor66);
        org.junit.Assert.assertNull(checkInPublisher8);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(account48);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Booking complete" + "'", str67, "Booking complete");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        java.lang.String str6 = badgeScan3.getBadgeId();
        badgeScan3.setRoomId("Cancelled");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        reservation12.setAccountType("Cancelled");
        double double24 = reservation12.getHourlyRate();
        reservation12.setFinalAmount((double) '#');
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setDepositAmount(0.0d);
        java.lang.String str7 = reservation1.getReservationId();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand10 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime8, localDateTime9);
        boolean boolean11 = editBookingCommand10.wasSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            editBookingCommand10.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.editBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        badge20.setAccountId("partner");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        occupancySensor3.isDetected = true;
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("admin", "Cancelled", (int) '#', true, "", "");
        room6.setRoomNumber("student");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor12 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor12.isDetected = false;
        java.lang.String str15 = occupancySensor12.getRoomId();
        occupancySensor12.isDetected = false;
        occupancySensor12.setDetected(false);
        room6.setOccupancySensor(occupancySensor12);
        int int21 = room6.getCapacity();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Pending" + "'", str15, "Pending");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getReservationId();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand7 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation2, localDateTime5, localDateTime6);
        boolean boolean8 = editBookingCommand7.wasSuccessful();
        boolean boolean9 = editBookingCommand7.wasSuccessful();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        com.conferenceroomscheduler.model.Reservation reservation23 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext24 = new com.conferenceroomscheduler.patterns.BookingContext(reservation23);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState25 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext24.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState25);
        com.conferenceroomscheduler.patterns.BookingState bookingState27 = bookingContext24.getState();
        com.conferenceroomscheduler.model.Reservation reservation28 = bookingContext24.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation29 = bookingContext24.getReservation();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState30 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState31 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation32 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext33 = new com.conferenceroomscheduler.patterns.BookingContext(reservation32);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState34 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext33.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState34);
        com.conferenceroomscheduler.patterns.BookingState bookingState36 = bookingContext33.getState();
        com.conferenceroomscheduler.model.Reservation reservation37 = bookingContext33.getReservation();
        cancelledBookingState31.handle(bookingContext33);
        checkedInBookingState30.handle(bookingContext33);
        bookingContext33.request();
        com.conferenceroomscheduler.patterns.BookingState bookingState41 = bookingContext33.getState();
        bookingContext24.setState(bookingState41);
        checkedInBookingState0.handle(bookingContext24);
        com.conferenceroomscheduler.patterns.BookingState bookingState44 = null;
        bookingContext24.setState(bookingState44);
        // The following exception was thrown during execution in test generation
        try {
            bookingContext24.request();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.patterns.BookingState.handle(com.conferenceroomscheduler.patterns.BookingContext)\" because \"this.state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Checked in." + "'", str10, "Checked in.");
        org.junit.Assert.assertNull(reservation15);
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertNotNull(bookingState27);
        org.junit.Assert.assertNull(reservation28);
        org.junit.Assert.assertNull(reservation29);
        org.junit.Assert.assertNotNull(bookingState36);
        org.junit.Assert.assertNull(reservation37);
        org.junit.Assert.assertNotNull(bookingState41);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        com.conferenceroomscheduler.model.Reservation reservation21 = bookingContext16.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation22 = bookingContext16.getReservation();
        java.time.LocalDateTime localDateTime23 = reservation22.getEndTime();
        java.time.LocalDateTime localDateTime24 = reservation22.getStartTime();
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertNotNull(reservation21);
        org.junit.Assert.assertNotNull(reservation22);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNull(localDateTime24);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
        bookingContext2.request();
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState21 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str22 = confirmedBookingState21.getName();
        java.lang.String str23 = confirmedBookingState21.getName();
        java.lang.String str24 = confirmedBookingState21.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState25 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState26 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation27 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext28 = new com.conferenceroomscheduler.patterns.BookingContext(reservation27);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState29 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext28.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState29);
        com.conferenceroomscheduler.patterns.BookingState bookingState31 = bookingContext28.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState32 = bookingContext28.getState();
        cancelledBookingState26.handle(bookingContext28);
        checkedInBookingState25.handle(bookingContext28);
        java.lang.String str35 = checkedInBookingState25.getName();
        com.conferenceroomscheduler.model.Reservation reservation36 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext37 = new com.conferenceroomscheduler.patterns.BookingContext(reservation36);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState38 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext37.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState38);
        com.conferenceroomscheduler.model.Reservation reservation40 = bookingContext37.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation41 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext42 = new com.conferenceroomscheduler.patterns.BookingContext(reservation41);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState43 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext42.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState43);
        com.conferenceroomscheduler.patterns.BookingState bookingState45 = bookingContext42.getState();
        bookingContext37.setState(bookingState45);
        checkedInBookingState25.handle(bookingContext37);
        com.conferenceroomscheduler.model.Reservation reservation48 = bookingContext37.getReservation();
        confirmedBookingState21.handle(bookingContext37);
        java.lang.String str50 = confirmedBookingState21.getName();
        java.lang.String str51 = confirmedBookingState21.getName();
        java.lang.String str52 = confirmedBookingState21.getName();
        java.lang.String str53 = confirmedBookingState21.getName();
        java.lang.String str54 = confirmedBookingState21.getName();
        bookingContext2.setState((com.conferenceroomscheduler.patterns.BookingState) confirmedBookingState21);
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNull(reservation6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Booking confirmed." + "'", str22, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking confirmed." + "'", str23, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Booking confirmed." + "'", str24, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState31);
        org.junit.Assert.assertNotNull(bookingState32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Checked in." + "'", str35, "Checked in.");
        org.junit.Assert.assertNull(reservation40);
        org.junit.Assert.assertNotNull(bookingState45);
        org.junit.Assert.assertNull(reservation48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Booking confirmed." + "'", str50, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Booking confirmed." + "'", str51, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Booking confirmed." + "'", str52, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Booking confirmed." + "'", str53, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Booking confirmed." + "'", str54, "Booking confirmed.");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = null;
        occupancySensor3.setSubject(checkInPublisher12);
        occupancySensor3.isDetected = false;
        boolean boolean16 = occupancySensor3.isOccupied();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher17 = occupancySensor3.subject;
        boolean boolean18 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor22 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher23 = null;
        occupancySensor22.setSubject(checkInPublisher23);
        occupancySensor22.occupied = true;
        occupancySensor22.setDetected(false);
        java.lang.String str29 = occupancySensor22.getLastEvent();
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
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher57 = occupancySensor33.getSubject();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor61 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher62 = null;
        occupancySensor61.setSubject(checkInPublisher62);
        checkInPublisher57.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor61);
        occupancySensor22.subject = checkInPublisher57;
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory66 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account74 = facultyFactory66.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account82 = facultyFactory66.createAccount("", "hi!", "", "", false, true, "");
        com.conferenceroomscheduler.model.Account account90 = facultyFactory66.createAccount("Cancelled", "Pending", "Cancelled", "hi!", false, false, "");
        account90.setVerified(false);
        checkInPublisher57.notifyObservers(account90);
        occupancySensor3.setSubject(checkInPublisher57);
        boolean boolean95 = occupancySensor3.occupied;
        occupancySensor3.setDetected(false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(checkInPublisher17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(checkInPublisher57);
        org.junit.Assert.assertNotNull(account74);
        org.junit.Assert.assertNotNull(account82);
        org.junit.Assert.assertNotNull(account90);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
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
        com.conferenceroomscheduler.model.Reservation reservation67 = new com.conferenceroomscheduler.model.Reservation("", "", "hi!", "Booking confirmed.", localDateTime14, localDateTime15, "student", (double) (byte) 1, 0.0d, (double) 0L, paymentMethod64);
        com.conferenceroomscheduler.model.Reservation reservation68 = new com.conferenceroomscheduler.model.Reservation("faculty", "Booking complete", "admin", "hi!", localDateTime4, localDateTime5, "ADMIN-69", (double) ' ', (double) 52, (double) (-1L), paymentMethod64);
        java.lang.Class<?> wildcardClass69 = reservation68.getClass();
        org.junit.Assert.assertTrue("'" + paymentMethod50 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod50.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertTrue("'" + paymentMethod64 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod64.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getAccountType();
        java.lang.String str5 = reservation2.getAccountType();
        boolean boolean6 = reservation2.isCheckedIn();
        java.time.LocalDateTime localDateTime7 = reservation2.getStartTime();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand8 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation2);
        boolean boolean9 = cancelBookingCommand8.wasSuccessful();
        boolean boolean10 = cancelBookingCommand8.wasSuccessful();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) '4');
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("", (double) (-1));
        boolean boolean9 = debitCardPaymentStrategy0.processPayment("", (double) (byte) -1);
        boolean boolean12 = debitCardPaymentStrategy0.processPayment("", 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        reservation36.setCanceled(false);
        reservation36.setFinalAmount((double) (-1.0f));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod33 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod33.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("Pending", "Booking complete", "Booking confirmed.", false, false, "hi!");
        java.lang.String str7 = staffAccount6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking complete" + "'", str7, "Booking complete");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Checked in.", "", "", false, true, "partner");
        studentAccount6.setPassword("faculty");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount0 = new com.conferenceroomscheduler.model.FacultyAccount();
        facultyAccount0.setPassword("Booking confirmed.");
        facultyAccount0.setIdentifier("Booking confirmed.");
        boolean boolean5 = facultyAccount0.isUniversityAccount();
        facultyAccount0.setIdentifier("staff");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        reservation0.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext12 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        bookingContext12.request();
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState14 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation15 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext16 = new com.conferenceroomscheduler.patterns.BookingContext(reservation15);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState17 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext16.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState17);
        completedBookingState14.handle(bookingContext16);
        java.lang.String str20 = completedBookingState14.getName();
        java.lang.String str21 = completedBookingState14.getName();
        bookingContext12.setState((com.conferenceroomscheduler.patterns.BookingState) completedBookingState14);
        java.lang.String str23 = completedBookingState14.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Booking complete" + "'", str20, "Booking complete");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Booking complete" + "'", str21, "Booking complete");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking complete" + "'", str23, "Booking complete");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setDepositLost(true);
        boolean boolean5 = reservation0.isCanceled();
        reservation0.setRoomId("");
        java.lang.String str8 = reservation0.getTitle();
        java.time.LocalDateTime localDateTime9 = null;
        reservation0.setEndTime(localDateTime9);
        double double11 = reservation0.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor3.isDetected = false;
        occupancySensor3.roomId = "hi!";
        occupancySensor3.isDetected = false;
        boolean boolean10 = occupancySensor3.isDetected;
        occupancySensor3.setRoomId("partner");
        java.lang.String str13 = occupancySensor3.getLastEvent();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        reservation2.setRoomId("Unverified badge detected for .");
        reservation2.setRoomId("faculty");
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState0 = new com.conferenceroomscheduler.patterns.PendingBookingState();
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
        com.conferenceroomscheduler.patterns.BookingContext bookingContext27 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        java.lang.String str28 = bookingContext27.getStatus();
        pendingBookingState0.handle(bookingContext27);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod24 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod24.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Pending" + "'", str28, "Pending");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        java.lang.String str9 = reservation0.getAccountType();
        double double10 = reservation0.getDepositAmount();
        reservation0.setDepositLost(true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        java.lang.String str36 = bookingContext21.getStatus();
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Checked in." + "'", str36, "Checked in.");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("faculty", "Pending", (int) '#', "Cancelled", "Pending");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("admin", "Booking complete", (int) (byte) 1, "hi!", "Checked in.");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("faculty", "admin", (int) (byte) 100, "hi!", "Checked in.");
        com.conferenceroomscheduler.model.Room room30 = roomFactory0.createRoom("ADMIN-69", "hi!", (int) (byte) 0, "faculty", "Pending");
        room30.setName("");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
        org.junit.Assert.assertNotNull(room30);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setHourlyRate((double) (byte) 100);
        boolean boolean4 = reservation1.isDepositLost();
        java.lang.String str5 = reservation1.getUserId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand6 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        java.time.LocalDateTime localDateTime7 = reservation1.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setReservationId("Checked in.");
        double double9 = reservation0.getDepositAmount();
        reservation0.setCheckedIn(true);
        boolean boolean12 = reservation0.isDepositLost();
        reservation0.setAccountType("Pending");
        reservation0.setUserId("Checked in.");
        reservation0.setExtended(false);
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState43 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str44 = confirmedBookingState43.getName();
        java.lang.String str45 = confirmedBookingState43.getName();
        java.lang.String str46 = confirmedBookingState43.getName();
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
        java.lang.String str57 = checkedInBookingState47.getName();
        com.conferenceroomscheduler.model.Reservation reservation58 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext59 = new com.conferenceroomscheduler.patterns.BookingContext(reservation58);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState60 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext59.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState60);
        com.conferenceroomscheduler.model.Reservation reservation62 = bookingContext59.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation63 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext64 = new com.conferenceroomscheduler.patterns.BookingContext(reservation63);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState65 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext64.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState65);
        com.conferenceroomscheduler.patterns.BookingState bookingState67 = bookingContext64.getState();
        bookingContext59.setState(bookingState67);
        checkedInBookingState47.handle(bookingContext59);
        com.conferenceroomscheduler.model.Reservation reservation70 = bookingContext59.getReservation();
        confirmedBookingState43.handle(bookingContext59);
        java.lang.String str72 = confirmedBookingState43.getName();
        java.lang.String str73 = confirmedBookingState43.getName();
        java.lang.String str74 = confirmedBookingState43.getName();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState75 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation76 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext77 = new com.conferenceroomscheduler.patterns.BookingContext(reservation76);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState78 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext77.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState78);
        com.conferenceroomscheduler.patterns.BookingState bookingState80 = bookingContext77.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState81 = bookingContext77.getState();
        cancelledBookingState75.handle(bookingContext77);
        com.conferenceroomscheduler.patterns.BookingState bookingState83 = bookingContext77.getState();
        bookingContext77.request();
        confirmedBookingState43.handle(bookingContext77);
        confirmedBookingState0.handle(bookingContext77);
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Booking confirmed." + "'", str44, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Booking confirmed." + "'", str45, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Booking confirmed." + "'", str46, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState53);
        org.junit.Assert.assertNotNull(bookingState54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Checked in." + "'", str57, "Checked in.");
        org.junit.Assert.assertNull(reservation62);
        org.junit.Assert.assertNotNull(bookingState67);
        org.junit.Assert.assertNull(reservation70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Booking confirmed." + "'", str72, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Booking confirmed." + "'", str73, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Booking confirmed." + "'", str74, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState80);
        org.junit.Assert.assertNotNull(bookingState81);
        org.junit.Assert.assertNotNull(bookingState83);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("hi!", "", "hi!", true, false, "hi!");
        adminAccount6.setEmail("");
        java.lang.String str9 = adminAccount6.getAccountId();
        java.lang.String str10 = adminAccount6.getAccountNumber();
        adminAccount6.setVerified(false);
        java.lang.String str13 = adminAccount6.getPassword();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        com.conferenceroomscheduler.model.Badge badge29 = studentAccount26.getBadge();
        java.lang.String str30 = badge29.getEmail();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(checkInPublisher17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Pending" + "'", str27, "Pending");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(badge29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Cancelled" + "'", str30, "Cancelled");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        boolean boolean4 = badgeScan3.isVerified();
        boolean boolean5 = badgeScan3.isVerified();
        java.lang.String str6 = badgeScan3.getBadgeId();
        badgeScan3.setVerified(true);
        java.lang.String str9 = badgeScan3.getRoomId();
        java.lang.String str10 = badgeScan3.getBadgeId();
        boolean boolean11 = badgeScan3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
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
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState13 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str14 = confirmedBookingState13.getName();
        java.lang.String str15 = confirmedBookingState13.getName();
        java.lang.String str16 = confirmedBookingState13.getName();
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
        confirmedBookingState13.handle(bookingContext29);
        java.lang.String str42 = confirmedBookingState13.getName();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState43 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState44 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation45 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext46 = new com.conferenceroomscheduler.patterns.BookingContext(reservation45);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState47 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext46.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState47);
        com.conferenceroomscheduler.patterns.BookingState bookingState49 = bookingContext46.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState50 = bookingContext46.getState();
        cancelledBookingState44.handle(bookingContext46);
        checkedInBookingState43.handle(bookingContext46);
        com.conferenceroomscheduler.model.Reservation reservation53 = new com.conferenceroomscheduler.model.Reservation();
        reservation53.setFinalAmount((double) (byte) 100);
        reservation53.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext58 = new com.conferenceroomscheduler.patterns.BookingContext(reservation53);
        checkedInBookingState43.handle(bookingContext58);
        confirmedBookingState13.handle(bookingContext58);
        com.conferenceroomscheduler.model.Reservation reservation61 = bookingContext58.getReservation();
        cancelledBookingState0.handle(bookingContext58);
        java.lang.String str63 = cancelledBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cancelled" + "'", str1, "Cancelled");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking confirmed." + "'", str14, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking confirmed." + "'", str15, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking confirmed." + "'", str16, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState23);
        org.junit.Assert.assertNotNull(bookingState24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Checked in." + "'", str27, "Checked in.");
        org.junit.Assert.assertNull(reservation32);
        org.junit.Assert.assertNotNull(bookingState37);
        org.junit.Assert.assertNull(reservation40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Booking confirmed." + "'", str42, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState49);
        org.junit.Assert.assertNotNull(bookingState50);
        org.junit.Assert.assertNotNull(reservation61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Cancelled" + "'", str63, "Cancelled");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Booking complete", "Cancelled", (int) (short) 1, "Booking complete", "");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("ADMIN-69", "Pending", 10, "hi!", "");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("student", "", (int) (byte) 10, "Unverified badge detected for Cancelled.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room30 = roomFactory0.createRoom("Verified badge detected for ADMIN-69.", "Verified badge detected for ADMIN-69.", 1, "Checked in.", "admin");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
        org.junit.Assert.assertNotNull(room30);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        occupancySensor3.occupied = true;
        org.junit.Assert.assertNull(checkInPublisher4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(badge72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        java.lang.String str4 = reservation1.getAccountType();
        boolean boolean5 = reservation1.isCheckedIn();
        double double6 = reservation1.getFinalAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState0 = new com.conferenceroomscheduler.patterns.PendingBookingState();
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
        com.conferenceroomscheduler.model.Reservation reservation18 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext19 = new com.conferenceroomscheduler.patterns.BookingContext(reservation18);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState20 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext19.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState20);
        checkedInBookingState1.handle(bookingContext19);
        com.conferenceroomscheduler.model.Reservation reservation23 = new com.conferenceroomscheduler.model.Reservation();
        reservation23.setFinalAmount((double) (byte) 100);
        java.lang.String str26 = reservation23.getRoomId();
        reservation23.setFinalAmount((double) 10.0f);
        java.lang.String str29 = reservation23.getUserId();
        reservation23.setFinalAmount((double) ' ');
        java.lang.String str32 = reservation23.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext33 = new com.conferenceroomscheduler.patterns.BookingContext(reservation23);
        bookingContext33.request();
        java.lang.String str35 = bookingContext33.getStatus();
        checkedInBookingState1.handle(bookingContext33);
        bookingContext33.request();
        com.conferenceroomscheduler.patterns.BookingState bookingState38 = bookingContext33.getState();
        bookingContext33.request();
        pendingBookingState0.handle(bookingContext33);
        com.conferenceroomscheduler.model.Reservation reservation41 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext42 = new com.conferenceroomscheduler.patterns.BookingContext(reservation41);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState43 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext42.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState43);
        com.conferenceroomscheduler.patterns.BookingState bookingState45 = bookingContext42.getState();
        com.conferenceroomscheduler.model.Reservation reservation46 = bookingContext42.getReservation();
        com.conferenceroomscheduler.patterns.BookingState bookingState47 = bookingContext42.getState();
        // The following exception was thrown during execution in test generation
        try {
            pendingBookingState0.handle(bookingContext42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.model.Reservation.getDepositAmount()\" because the return value of \"com.conferenceroomscheduler.patterns.BookingContext.getReservation()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Pending" + "'", str35, "Pending");
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertNotNull(bookingState45);
        org.junit.Assert.assertNull(reservation46);
        org.junit.Assert.assertNotNull(bookingState47);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService10 = null;
        com.conferenceroomscheduler.model.Reservation reservation11 = new com.conferenceroomscheduler.model.Reservation();
        reservation11.setFinalAmount((double) (byte) 100);
        java.lang.String str14 = reservation11.getRoomId();
        reservation11.setFinalAmount((double) 10.0f);
        java.lang.String str17 = reservation11.getUserId();
        reservation11.setDepositAmount((double) (byte) 0);
        double double20 = reservation11.getHourlyRate();
        reservation11.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext23 = new com.conferenceroomscheduler.patterns.BookingContext(reservation11);
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod34 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation35 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime28, localDateTime29, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod34);
        reservation11.setPaymentMethod(paymentMethod34);
        java.time.LocalDateTime localDateTime37 = reservation11.getStartTime();
        java.time.LocalDateTime localDateTime38 = reservation11.getStartTime();
        reservation11.setTitle("");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand41 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService10, reservation11);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod42 = reservation11.getPaymentMethod();
        com.conferenceroomscheduler.model.Reservation reservation43 = new com.conferenceroomscheduler.model.Reservation("Unverified badge detected for .", "Booking confirmed.", "partner", "Booking confirmed.", localDateTime4, localDateTime5, "Verified badge detected for Checked in..", (double) (-1L), (double) 1.0f, (double) (byte) 100, paymentMethod42);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod34 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod34.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + paymentMethod42 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod42.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Unverified badge detected for .", "Booking complete", 1, false, "hi!", "hi!");
        room6.setRoomNumber("Booking confirmed.");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory0 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account8 = facultyFactory0.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account16 = facultyFactory0.createAccount("", "hi!", "", "", false, true, "");
        account16.setAccountNumber("Checked in.");
        account16.setIdentifier("hi!");
        account16.setEmail("Unverified badge detected for .");
        account16.setAccountType("Cancelled");
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        java.time.LocalDateTime localDateTime9 = null;
        reservation0.setStartTime(localDateTime9);
        java.lang.String str11 = reservation0.getAccountType();
        reservation0.setExtended(true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("ADMIN-69", "Booking confirmed.", true);
        badge3.setEmail("Cancelled");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str1 = adminAccount0.getEmail();
        adminAccount0.setEmail("Cancelled");
        boolean boolean4 = adminAccount0.isUniversityAccount();
        java.lang.String str5 = adminAccount0.getAccountId();
        adminAccount0.setVerified(true);
        java.lang.String str8 = adminAccount0.getEmail();
        adminAccount0.setAccountType("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        staffAccount80.setVerified(true);
        java.lang.String str84 = staffAccount80.getAccountNumber();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState75 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation76 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext77 = new com.conferenceroomscheduler.patterns.BookingContext(reservation76);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState78 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext77.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState78);
        com.conferenceroomscheduler.patterns.BookingState bookingState80 = bookingContext77.getState();
        com.conferenceroomscheduler.model.Reservation reservation81 = bookingContext77.getReservation();
        cancelledBookingState75.handle(bookingContext77);
        java.lang.String str83 = cancelledBookingState75.getName();
        java.lang.String str84 = cancelledBookingState75.getName();
        java.lang.String str85 = cancelledBookingState75.getName();
        bookingContext68.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState75);
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
        org.junit.Assert.assertNotNull(bookingState80);
        org.junit.Assert.assertNull(reservation81);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Cancelled" + "'", str83, "Cancelled");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Cancelled" + "'", str84, "Cancelled");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Cancelled" + "'", str85, "Cancelled");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 1L);
        java.time.LocalDateTime localDateTime6 = reservation0.getEndTime();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(localDateTime6);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Cancelled", "hi!", "hi!", true, true, "Checked in.");
        boolean boolean7 = partnerAccount6.isUniversityAccount();
        partnerAccount6.setUniversityAccount(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.isDetected;
        occupancySensor3.setDetected(true);
        occupancySensor3.roomId = "ADMIN-69";
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        java.lang.String str8 = room6.getBuilding();
        com.conferenceroomscheduler.model.StudentAccount studentAccount15 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        studentAccount15.setUniversityAccount(false);
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount15);
        int int19 = room6.getCapacity();
        room6.setRoomId("");
        room6.setRoomId("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
        double double16 = reservation1.getFinalAmount();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("Booking complete", "admin", "", "hi!", false, false, "Booking complete");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Booking confirmed.", "hi!", 10, false, "hi!", "Pending");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Booking complete", "Booking confirmed.", (int) '4', true, "Booking confirmed.", "Pending");
        room6.setClosedForMaintenance(false);
        java.lang.String str9 = room6.getName();
        room6.setRoomNumber("Pending");
        room6.setEnabled(false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking confirmed." + "'", str9, "Booking confirmed.");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
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
        com.conferenceroomscheduler.patterns.PartnerFactory partnerFactory39 = new com.conferenceroomscheduler.patterns.PartnerFactory();
        com.conferenceroomscheduler.model.Account account47 = partnerFactory39.createAccount("Checked in.", "hi!", "admin", "", true, false, "Pending");
        com.conferenceroomscheduler.model.Account account55 = partnerFactory39.createAccount("Booking complete", "hi!", "hi!", "", true, false, "Checked in.");
        com.conferenceroomscheduler.model.Badge badge56 = account55.getBadge();
        checkInPublisher0.notifyObservers(account55);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(account47);
        org.junit.Assert.assertNotNull(account55);
        org.junit.Assert.assertNotNull(badge56);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Booking confirmed.", "Unverified badge detected for .", "Booking confirmed.", "", 97, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking confirmed." + "'", str8, "Booking confirmed.");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        boolean boolean1 = adminAccount0.isVerified();
        adminAccount0.setUniversityAccount(false);
        java.lang.String str4 = adminAccount0.getAccountType();
        boolean boolean5 = adminAccount0.isVerified();
        java.lang.String str6 = adminAccount0.getPassword();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation2.getPaymentMethod();
        reservation2.setFinalAmount((double) (byte) 1);
        java.lang.String str8 = reservation2.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand9 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService1, reservation2);
        reservation2.setDepositLost(false);
        reservation2.setCanceled(false);
        double double14 = reservation2.getHourlyRate();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand15 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation2);
        java.time.LocalDateTime localDateTime16 = reservation2.getStartTime();
        double double17 = reservation2.getHourlyRate();
        reservation2.setReservationId("");
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("hi!", "hi!", true);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Booking confirmed.", "Cancelled", "Booking confirmed.", 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getTitle();
        java.time.LocalDateTime localDateTime9 = bookingRequest7.getEndTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking confirmed." + "'", str8, "Booking confirmed.");
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Pending", "Cancelled", (int) (byte) 10, "Checked in.", "Cancelled");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("Booking complete", "student", (int) (byte) 100, "Booking complete", "faculty");
        boolean boolean19 = room18.isClosedForMaintenance();
        int int20 = room18.getCapacity();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.occupied;
        java.lang.String str7 = occupancySensor3.getRoomId();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher8 = occupancySensor3.getSubject();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(checkInPublisher8);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand4 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime2, localDateTime3);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.occupied;
        java.lang.String str7 = occupancySensor3.getRoomId();
        java.lang.String str8 = occupancySensor3.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        boolean boolean4 = occupancySensor3.occupied;
        java.lang.String str5 = occupancySensor3.getLastEvent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Unverified badge detected for .", "faculty", "Cancelled", true, false, "hi!");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        room6.setCapacity((int) 'a');
        java.lang.String str20 = room6.getName();
        room6.setBuilding("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cancelled" + "'", str20, "Cancelled");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand6 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str7 = reservation1.getTitle();
        double double8 = reservation1.getFinalAmount();
        boolean boolean9 = reservation1.isCheckedIn();
        reservation1.setHourlyRate((double) 97);
        reservation1.setDepositAmount((double) 10.0f);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod15 = reservation0.getPaymentMethod();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(paymentMethod15);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setEnabled(true);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = room6.getOccupancySensor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(occupancySensor10);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
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
        java.lang.String str47 = checkedInBookingState0.getName();
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Checked in." + "'", str47, "Checked in.");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setReservationId("Checked in.");
        double double9 = reservation0.getDepositAmount();
        boolean boolean10 = reservation0.isExtended();
        reservation0.setRoomId("faculty");
        reservation0.setFinalAmount(100.0d);
        java.lang.String str15 = reservation0.getTitle();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
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
        boolean boolean40 = editBookingCommand39.wasSuccessful();
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("Pending", "Verified badge detected for Checked in..", "Unverified badge detected for .", false, false, "Verified badge detected for ADMIN-69.");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("ADMIN-69", "Booking confirmed.", "Verified badge detected for ADMIN-69.", false, true, "Verified badge detected for Checked in..");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
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
        com.conferenceroomscheduler.patterns.BookingContext bookingContext43 = null;
        // The following exception was thrown during execution in test generation
        try {
            confirmedBookingState0.handle(bookingContext43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.patterns.BookingContext.setState(com.conferenceroomscheduler.patterns.BookingState)\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        java.lang.String str18 = room6.getRoomId();
        java.lang.String str19 = room6.getName();
        java.lang.String str20 = room6.getRoomId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Cancelled" + "'", str19, "Cancelled");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("admin", "", true);
        java.lang.String str4 = badgeScan3.getRoomId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        double double7 = reservation0.getFinalAmount();
        java.time.LocalDateTime localDateTime8 = reservation0.getEndTime();
        reservation0.setCanceled(true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Verified badge detected for Checked in..", "Pending", false);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("", "Pending", "", true, false, "Pending");
        studentAccount6.setAccountNumber("hi!");
        studentAccount6.setIdentifier("partner");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str1 = adminAccount0.getAccountNumber();
        adminAccount0.setAccountId("partner");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        boolean boolean10 = room6.isClosedForMaintenance();
        room6.setEnabled(false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = room6.getOccupancySensor();
        occupancySensor13.isDetected = false;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(occupancySensor13);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory0 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account8 = facultyFactory0.createAccount("", "Cancelled", "", "hi!", false, false, "");
        account8.setAccountNumber("hi!");
        java.lang.String str11 = account8.getAccountId();
        java.lang.String str12 = account8.getAccountId();
        java.lang.String str13 = account8.getAccountId();
        account8.setVerified(false);
        account8.setAccountType("hi!");
        account8.setAccountType("Checked in.");
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        int int8 = bookingRequest7.getAttendeeCount();
        java.lang.String str9 = bookingRequest7.getTitle();
        java.lang.String str10 = bookingRequest7.getTitle();
        java.lang.String str11 = bookingRequest7.getRequestId();
        java.lang.String str12 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) 10);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("Cancelled", 1.0d);
        boolean boolean9 = creditCardPaymentStrategy0.processPayment("Cancelled", (double) 100);
        boolean boolean12 = creditCardPaymentStrategy0.processPayment("partner", (double) (-1L));
        boolean boolean15 = creditCardPaymentStrategy0.processPayment("", (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("Pending", "student", "Booking complete", false, false, "Verified badge detected for ADMIN-69.");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setEnabled(true);
        java.lang.String str13 = room6.getName();
        room6.setBuilding("Unverified badge detected for Cancelled.");
        room6.setCapacity((int) (byte) 100);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor18 = room6.getOccupancySensor();
        room6.setRoomId("Booking confirmed.");
        room6.setRoomNumber("faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertNull(occupancySensor18);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("faculty", "admin", "", false, false, "Unverified badge detected for .");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Booking complete", "Booking confirmed.", (int) '4', true, "Booking confirmed.", "Pending");
        room6.setClosedForMaintenance(false);
        java.lang.String str9 = room6.getName();
        room6.setCapacity((int) '4');
        boolean boolean12 = room6.isClosedForMaintenance();
        int int13 = room6.getCapacity();
        room6.setClosedForMaintenance(true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking confirmed." + "'", str9, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        com.conferenceroomscheduler.model.Reservation reservation16 = bookingContext8.getReservation();
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNotNull(bookingState12);
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertNull(reservation16);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        reservation1.setDepositAmount((double) (byte) 0);
        boolean boolean10 = reservation1.isExtended();
        reservation1.setAccountType("faculty");
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand13 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        // The following exception was thrown during execution in test generation
        try {
            createBookingCommand13.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.addReservation(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Cancelled", "hi!", "hi!", "", (int) (short) 1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRoomId();
        java.lang.String str9 = bookingRequest7.getRequestId();
        java.lang.String str10 = bookingRequest7.getRoomId();
        java.lang.String str11 = bookingRequest7.getRoomId();
        java.lang.String str12 = bookingRequest7.getRequestId();
        java.time.LocalDateTime localDateTime13 = bookingRequest7.getEndTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cancelled" + "'", str12, "Cancelled");
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "Checked in.", false);
        badgeScan3.setBadgeId("partner");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Pending", "Pending", (int) (short) -1, "", "Cancelled");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("Cancelled", "ADMIN-69", (-1), "faculty", "Pending");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("partner", "Cancelled", (int) '4', "Pending", "Booking complete");
        com.conferenceroomscheduler.model.Room room30 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) 100, "Unverified badge detected for Cancelled.", "Verified badge detected for ADMIN-69.");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
        org.junit.Assert.assertNotNull(room30);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
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
        com.conferenceroomscheduler.model.Account account69 = null;
        boolean boolean70 = occupancySensor3.detectOccupancy(account69);
        java.lang.String str71 = occupancySensor3.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(badge67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Checked in." + "'", str71, "Checked in.");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("Checked in.", "Unverified badge detected for Cancelled.", "Booking confirmed.", false, false, "faculty");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
        badge72.setEmail("ADMIN-69");
        org.junit.Assert.assertNull(checkInPublisher4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(badge72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("faculty", "Pending", (int) '#', "Cancelled", "Pending");
        room12.setBuilding("Unverified badge detected for .");
        java.lang.String str15 = room12.getRoomNumber();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Pending" + "'", str15, "Pending");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("", "Booking confirmed.", "", false, false, "");
        adminAccount6.setAccountId("");
        java.lang.String str9 = adminAccount6.getAccountType();
        java.lang.String str10 = adminAccount6.getAccountId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher64 = occupancySensor3.subject;
        occupancySensor3.setRoomId("faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(checkInPublisher27);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Cancelled" + "'", str53, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Booking confirmed." + "'", str55, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(checkInPublisher64);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("hi!", "", "hi!", true, false, "hi!");
        adminAccount6.setEmail("");
        java.lang.String str9 = adminAccount6.getAccountId();
        adminAccount6.setAccountType("Unverified badge detected for .");
        boolean boolean12 = adminAccount6.isUniversityAccount();
        java.lang.String str13 = adminAccount6.getAccountType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Unverified badge detected for ." + "'", str13, "Unverified badge detected for .");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        com.conferenceroomscheduler.patterns.BookingContext bookingContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            pendingBookingState0.handle(bookingContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.patterns.BookingContext.getReservation()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pending" + "'", str1, "Pending");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pending" + "'", str12, "Pending");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setHourlyRate((double) (byte) 100);
        boolean boolean4 = reservation1.isDepositLost();
        java.lang.String str5 = reservation1.getUserId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand6 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setCheckedIn(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand2.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        java.time.LocalDateTime localDateTime1 = null;
        reservation0.setEndTime(localDateTime1);
        reservation0.setHourlyRate((double) 'a');
        boolean boolean5 = reservation0.isCheckedIn();
        java.lang.String str6 = reservation0.getUserId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
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
        java.lang.String str45 = account37.getAccountId();
        java.lang.String str46 = account37.getAccountId();
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(account37);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState0 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext2 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState3 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext2.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState3);
        com.conferenceroomscheduler.patterns.BookingState bookingState5 = bookingContext2.getState();
        com.conferenceroomscheduler.model.Reservation reservation6 = bookingContext2.getReservation();
        cancelledBookingState0.handle(bookingContext2);
        java.lang.String str8 = cancelledBookingState0.getName();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState9 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation10 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext11 = new com.conferenceroomscheduler.patterns.BookingContext(reservation10);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState12 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext11.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState12);
        com.conferenceroomscheduler.patterns.BookingState bookingState14 = bookingContext11.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState15 = bookingContext11.getState();
        cancelledBookingState9.handle(bookingContext11);
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState17 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str18 = pendingBookingState17.getName();
        com.conferenceroomscheduler.model.Reservation reservation19 = new com.conferenceroomscheduler.model.Reservation();
        reservation19.setFinalAmount((double) (byte) 100);
        reservation19.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext24 = new com.conferenceroomscheduler.patterns.BookingContext(reservation19);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState25 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str26 = cancelledBookingState25.getName();
        bookingContext24.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState25);
        pendingBookingState17.handle(bookingContext24);
        cancelledBookingState9.handle(bookingContext24);
        cancelledBookingState0.handle(bookingContext24);
        java.lang.String str31 = cancelledBookingState0.getName();
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNull(reservation6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState14);
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Pending" + "'", str18, "Pending");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Cancelled" + "'", str26, "Cancelled");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Cancelled" + "'", str31, "Cancelled");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setCheckedIn(true);
        reservation0.setDepositAmount((double) 10.0f);
        reservation0.setUserId("");
        reservation0.setTitle("Checked in.");
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        java.lang.String str19 = reservation0.getAccountType();
        reservation0.setDepositLost(false);
        double double22 = reservation0.getFinalAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.conferenceroomscheduler.model.BadgeScan badgeScan0 = new com.conferenceroomscheduler.model.BadgeScan();
        badgeScan0.setBadgeId("");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
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
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher75 = null;
        occupancySensor3.setSubject(checkInPublisher75);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher77 = null;
        occupancySensor3.subject = checkInPublisher77;
        boolean boolean79 = occupancySensor3.isDetected;
        boolean boolean80 = occupancySensor3.occupied;
        org.junit.Assert.assertNull(checkInPublisher4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(badge72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.conferenceroomscheduler.patterns.StaffFactory staffFactory0 = new com.conferenceroomscheduler.patterns.StaffFactory();
        com.conferenceroomscheduler.model.Account account8 = staffFactory0.createAccount("Cancelled", "Checked in.", "", "Cancelled", true, true, "");
        com.conferenceroomscheduler.model.Account account16 = staffFactory0.createAccount("Booking complete", "Unverified badge detected for .", "Unverified badge detected for .", "Cancelled", false, false, "Unverified badge detected for .");
        com.conferenceroomscheduler.model.Account account24 = staffFactory0.createAccount("hi!", "partner", "Unverified badge detected for Cancelled.", "Unverified badge detected for Cancelled.", true, false, "ADMIN-69");
        com.conferenceroomscheduler.model.Account account32 = staffFactory0.createAccount("ADMIN-69", "Verified badge detected for ADMIN-69.", "Booking complete", "faculty", true, false, "ADMIN-69");
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
        org.junit.Assert.assertNotNull(account32);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Cancelled", "hi!", true);
        badge3.setEmail("Booking complete");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        boolean boolean1 = adminAccount0.isVerified();
        adminAccount0.setUniversityAccount(false);
        com.conferenceroomscheduler.model.Badge badge4 = adminAccount0.getBadge();
        adminAccount0.setPassword("Booking confirmed.");
        adminAccount0.setVerified(true);
        adminAccount0.setAccountId("faculty");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(badge4);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setDepositAmount(0.0d);
        java.lang.String str7 = reservation1.getReservationId();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand10 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime8, localDateTime9);
        boolean boolean11 = editBookingCommand10.wasSuccessful();
        boolean boolean12 = editBookingCommand10.wasSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            editBookingCommand10.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.editBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        reservation1.setUserId("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
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
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand23.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getTitle();
        reservation2.setTitle("admin");
        java.lang.String str7 = reservation2.getReservationId();
        reservation2.setAccountType("student");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand10 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation2);
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand10.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        java.lang.String str12 = occupancySensor3.roomId;
        boolean boolean13 = occupancySensor3.isDetected;
        java.lang.String str14 = occupancySensor3.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor18 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher19 = null;
        occupancySensor18.setSubject(checkInPublisher19);
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
        occupancySensor18.setSubject(checkInPublisher34);
        occupancySensor3.subject = checkInPublisher34;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pending" + "'", str12, "Pending");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Pending" + "'", str14, "Pending");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("student", "Checked in.", (int) (byte) 10, false, "Checked in.", "");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
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
        occupancySensor3.roomId = "faculty";
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
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        boolean boolean3 = cancelBookingCommand2.wasSuccessful();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("", "Cancelled", "ADMIN-69", true, false, "");
        staffAccount6.setAccountId("Checked in.");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
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
        java.lang.String str35 = occupancySensor3.roomId;
        boolean boolean36 = occupancySensor3.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Booking confirmed." + "'", str31, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = room6.getOccupancySensor();
        room6.setClosedForMaintenance(true);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = room6.getOccupancySensor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(occupancySensor10);
        org.junit.Assert.assertNull(occupancySensor13);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("", (double) (byte) 1);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("admin", (double) 'a');
        boolean boolean9 = creditCardPaymentStrategy0.processPayment("Unverified badge detected for .", (double) (short) 0);
        boolean boolean12 = creditCardPaymentStrategy0.processPayment("hi!", (double) 'a');
        boolean boolean15 = creditCardPaymentStrategy0.processPayment("Booking complete", (double) 1L);
        boolean boolean18 = creditCardPaymentStrategy0.processPayment("partner", (double) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("Checked in.", "Cancelled", "Verified badge detected for Checked in..", "staff", false, false, "");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        java.lang.String str2 = reservation1.getTitle();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str4 = reservation1.getTitle();
        boolean boolean5 = reservation1.isExtended();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pending" + "'", str1, "Pending");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pending" + "'", str12, "Pending");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pending" + "'", str13, "Pending");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Pending" + "'", str14, "Pending");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        java.lang.String str6 = badgeScan3.getBadgeId();
        java.lang.String str7 = badgeScan3.getRoomId();
        badgeScan3.setVerified(true);
        java.lang.String str10 = badgeScan3.getBadgeId();
        java.lang.String str11 = badgeScan3.getRoomId();
        java.lang.String str12 = badgeScan3.getBadgeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("staff", "Pending", "Cancelled", "admin", false, false, "");
        java.lang.String str8 = account7.getAccountId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
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
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState38 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str39 = pendingBookingState38.getName();
        com.conferenceroomscheduler.model.Reservation reservation40 = new com.conferenceroomscheduler.model.Reservation();
        reservation40.setFinalAmount((double) (byte) 100);
        reservation40.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext45 = new com.conferenceroomscheduler.patterns.BookingContext(reservation40);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState46 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str47 = cancelledBookingState46.getName();
        bookingContext45.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState46);
        pendingBookingState38.handle(bookingContext45);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState50 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation51 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext52 = new com.conferenceroomscheduler.patterns.BookingContext(reservation51);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState53 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext52.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState53);
        com.conferenceroomscheduler.patterns.BookingState bookingState55 = bookingContext52.getState();
        com.conferenceroomscheduler.model.Reservation reservation56 = bookingContext52.getReservation();
        cancelledBookingState50.handle(bookingContext52);
        java.lang.String str58 = cancelledBookingState50.getName();
        bookingContext45.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState50);
        bookingContext31.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState50);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Checked in." + "'", str10, "Checked in.");
        org.junit.Assert.assertNull(reservation15);
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Checked in." + "'", str23, "Checked in.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Pending" + "'", str25, "Pending");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Cancelled" + "'", str33, "Cancelled");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Cancelled" + "'", str36, "Cancelled");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Pending" + "'", str39, "Pending");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Cancelled" + "'", str47, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState55);
        org.junit.Assert.assertNull(reservation56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Cancelled" + "'", str58, "Cancelled");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory0 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account8 = facultyFactory0.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account16 = facultyFactory0.createAccount("", "hi!", "", "", false, true, "");
        com.conferenceroomscheduler.model.Account account24 = facultyFactory0.createAccount("Cancelled", "Pending", "Cancelled", "hi!", false, false, "");
        account24.setIdentifier("Unverified badge detected for .");
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("staff", "admin", (int) ' ', false, "faculty", "admin");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState0 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str1 = pendingBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation2.getPaymentMethod();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext6 = new com.conferenceroomscheduler.patterns.BookingContext(reservation2);
        pendingBookingState0.handle(bookingContext6);
        java.lang.String str8 = pendingBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pending" + "'", str1, "Pending");
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Pending" + "'", str8, "Pending");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("Verified badge detected for ADMIN-69.", "Cancelled", "ADMIN-69", false, true, "");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        occupancySensor3.occupied = true;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher8 = occupancySensor3.subject;
        boolean boolean9 = occupancySensor3.isDetected;
        com.conferenceroomscheduler.model.Badge badge13 = new com.conferenceroomscheduler.model.Badge("ADMIN-69", "admin", true);
        boolean boolean14 = occupancySensor3.scanIdBadge(badge13);
        occupancySensor3.setRoomId("Unverified badge detected for .");
        org.junit.Assert.assertNull(checkInPublisher8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Booking complete", "Cancelled", (int) (short) 1, "Booking complete", "");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("ADMIN-69", "Pending", 10, "hi!", "");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("", "Booking confirmed.", (-1), "student", "admin");
        com.conferenceroomscheduler.model.Room room30 = roomFactory0.createRoom("partner", "hi!", (int) '4', "student", "Pending");
        com.conferenceroomscheduler.model.Room room36 = roomFactory0.createRoom("Cancelled", "Cancelled", (int) (byte) -1, "", "partner");
        room36.setName("Unverified badge detected for Cancelled.");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
        org.junit.Assert.assertNotNull(room30);
        org.junit.Assert.assertNotNull(room36);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Booking complete", "Unverified badge detected for .", "Pending", true, false, "admin");
        java.lang.String str7 = studentAccount6.getAccountNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
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
        reservation13.setRoomId("Cancelled");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod29 = reservation13.getPaymentMethod();
        reservation13.setDepositAmount((double) 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(paymentMethod29);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor27 = room6.getOccupancySensor();
        com.conferenceroomscheduler.model.Account account28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = occupancySensor27.detectOccupancy(account28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.model.Account.getBadge()\" because \"account\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking complete" + "'", str23, "Booking complete");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Booking complete" + "'", str26, "Booking complete");
        org.junit.Assert.assertNotNull(occupancySensor27);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
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
        java.lang.String str12 = reservation11.getAccountType();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand13 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation11);
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand13.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNotNull(reservation10);
        org.junit.Assert.assertNotNull(reservation11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("Checked in.", 32.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        reservation1.setReservationId("Checked in.");
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
        reservation1.setPaymentMethod(paymentMethod43);
        java.time.LocalDateTime localDateTime48 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand49 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime48);
        boolean boolean50 = extendBookingCommand49.wasSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand49.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.extendBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod43 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod43.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomNumber();
        java.lang.String str8 = room6.getRoomNumber();
        room6.setCapacity(97);
        room6.setCapacity((int) (byte) 0);
        room6.setRoomId("ADMIN-69");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState6 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str7 = cancelledBookingState6.getName();
        bookingContext5.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState6);
        com.conferenceroomscheduler.model.Reservation reservation9 = bookingContext5.getReservation();
        java.lang.String str10 = reservation9.getReservationId();
        java.time.LocalDateTime localDateTime11 = null;
        reservation9.setStartTime(localDateTime11);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cancelled" + "'", str7, "Cancelled");
        org.junit.Assert.assertNotNull(reservation9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Checked in.", "Checked in.", false);
        badge3.setEmail("hi!");
        boolean boolean6 = badge3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("admin", "Cancelled", (int) '#', true, "", "");
        room6.setRoomNumber("student");
        java.lang.String str9 = room6.getBuilding();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("staff", "Unverified badge detected for Cancelled.", "admin", "Unverified badge detected for .", true, true, "Unverified badge detected for Cancelled.");
        java.lang.String str8 = account7.getAccountNumber();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Unverified badge detected for Cancelled." + "'", str8, "Unverified badge detected for Cancelled.");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("partner", "Verified badge detected for Checked in..", "Booking confirmed.", true, true, "Unverified badge detected for Cancelled.");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Booking confirmed.", true, false);
        boolean boolean4 = occupancySensor3.isDetected;
        occupancySensor3.isDetected = false;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        reservation1.setDepositAmount((double) (byte) 0);
        java.lang.String str10 = reservation1.getAccountType();
        double double11 = reservation1.getDepositAmount();
        java.time.LocalDateTime localDateTime12 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand13 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime12);
        reservation1.setTitle("Booking complete");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Booking complete", "Booking confirmed.", (int) '4', true, "Booking confirmed.", "Pending");
        room6.setEnabled(true);
        java.lang.String str9 = room6.getName();
        room6.setCapacity((int) '#');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking confirmed." + "'", str9, "Booking confirmed.");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        boolean boolean74 = occupancySensor3.isDetected;
        occupancySensor3.setOccupied(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
        room54.setBuilding("Checked in.");
        room54.setCapacity(10);
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
        org.junit.Assert.assertNotNull(room30);
        org.junit.Assert.assertNotNull(room36);
        org.junit.Assert.assertNotNull(room42);
        org.junit.Assert.assertNotNull(room48);
        org.junit.Assert.assertNotNull(room54);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str1 = adminAccount0.getEmail();
        adminAccount0.setEmail("Cancelled");
        adminAccount0.setVerified(false);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod20 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation21 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime14, localDateTime15, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod20);
        com.conferenceroomscheduler.model.Reservation reservation22 = new com.conferenceroomscheduler.model.Reservation("Booking confirmed.", "Booking confirmed.", "", "", localDateTime4, localDateTime5, "Booking complete", 0.0d, (double) 0, (double) 100.0f, paymentMethod20);
        reservation22.setReservationId("faculty");
        reservation22.setUserId("Pending");
        double double27 = reservation22.getFinalAmount();
        org.junit.Assert.assertTrue("'" + paymentMethod20 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod20.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Cancelled", "", (int) '#', true, "staff", "Booking confirmed.");
        room6.setName("Checked in.");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setRoomId("hi!");
        java.lang.String str6 = reservation0.getAccountType();
        reservation0.setTitle("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
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
        com.conferenceroomscheduler.patterns.BookingContext bookingContext26 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        java.lang.String str27 = bookingContext26.getStatus();
        java.lang.String str28 = bookingContext26.getStatus();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod23 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod23.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Pending" + "'", str27, "Pending");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Pending" + "'", str28, "Pending");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
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
        reservation10.setAccountType("student");
        java.time.LocalDateTime localDateTime16 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand17 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation10, localDateTime16);
        reservation10.setTitle("admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNotNull(reservation10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
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
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState49 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation50 = new com.conferenceroomscheduler.model.Reservation();
        reservation50.setFinalAmount((double) (byte) 100);
        reservation50.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext55 = new com.conferenceroomscheduler.patterns.BookingContext(reservation50);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState56 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str57 = cancelledBookingState56.getName();
        bookingContext55.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState56);
        completedBookingState49.handle(bookingContext55);
        java.lang.String str60 = completedBookingState49.getName();
        bookingContext45.setState((com.conferenceroomscheduler.patterns.BookingState) completedBookingState49);
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
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Cancelled" + "'", str57, "Cancelled");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Booking complete" + "'", str60, "Booking complete");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setDepositAmount(0.0d);
        reservation0.setAccountType("");
        java.lang.String str8 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (short) 100);
        java.lang.String str11 = reservation0.getRoomId();
        reservation0.setUserId("Booking complete");
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("hi!", "student", true);
        java.lang.String str4 = badgeScan3.getRoomId();
        boolean boolean5 = badgeScan3.isVerified();
        java.lang.String str6 = badgeScan3.getBadgeId();
        java.lang.String str7 = badgeScan3.getRoomId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
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
        reservation3.setCheckedIn(false);
        java.time.LocalDateTime localDateTime18 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand19 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation3, localDateTime18);
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Unverified badge detected for .", "Booking confirmed.", "faculty", false, true, "staff");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "", "hi!", "", (int) '4', localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = bookingRequest7.getStartTime();
        java.lang.String str9 = bookingRequest7.getRequestId();
        java.lang.String str10 = bookingRequest7.getRoomId();
        java.time.LocalDateTime localDateTime11 = bookingRequest7.getStartTime();
        int int12 = bookingRequest7.getAttendeeCount();
        java.lang.String str13 = bookingRequest7.getOrganizerId();
        java.lang.String str14 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand6 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setCheckedIn(false);
        double double9 = reservation1.getHourlyRate();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod20 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation21 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime14, localDateTime15, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod20);
        reservation1.setPaymentMethod(paymentMethod20);
        reservation1.setCanceled(false);
        java.lang.String str25 = reservation1.getUserId();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod20 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod20.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setTitle("hi!");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
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
        java.lang.String str15 = reservation1.getReservationId();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unverified badge detected for Cancelled." + "'", str15, "Unverified badge detected for Cancelled.");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory0 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account8 = facultyFactory0.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account16 = facultyFactory0.createAccount("", "hi!", "", "", false, true, "");
        com.conferenceroomscheduler.model.Account account24 = facultyFactory0.createAccount("Cancelled", "Pending", "Cancelled", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account32 = facultyFactory0.createAccount("", "hi!", "", "Pending", true, false, "Cancelled");
        com.conferenceroomscheduler.model.Account account40 = facultyFactory0.createAccount("faculty", "Pending", "Checked in.", "faculty", true, true, "Booking confirmed.");
        com.conferenceroomscheduler.model.Account account48 = facultyFactory0.createAccount("Checked in.", "hi!", "Booking complete", "Booking confirmed.", true, true, "Checked in.");
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
        org.junit.Assert.assertNotNull(account32);
        org.junit.Assert.assertNotNull(account40);
        org.junit.Assert.assertNotNull(account48);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setCheckedIn(true);
        java.lang.String str9 = reservation0.getAccountType();
        reservation0.setReservationId("student");
        reservation0.setFinalAmount((double) 100L);
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) '4');
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("", (double) (-1));
        boolean boolean9 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) 10L);
        boolean boolean12 = debitCardPaymentStrategy0.processPayment("Unverified badge detected for Cancelled.", (double) (byte) 0);
        boolean boolean15 = debitCardPaymentStrategy0.processPayment("Checked in.", (double) 100L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
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
        room6.setClosedForMaintenance(true);
        room6.setCapacity(0);
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
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
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
        com.conferenceroomscheduler.model.Reservation reservation23 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext24 = new com.conferenceroomscheduler.patterns.BookingContext(reservation23);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState25 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext24.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState25);
        com.conferenceroomscheduler.patterns.BookingState bookingState27 = bookingContext24.getState();
        com.conferenceroomscheduler.model.Reservation reservation28 = bookingContext24.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation29 = bookingContext24.getReservation();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState30 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState31 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation32 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext33 = new com.conferenceroomscheduler.patterns.BookingContext(reservation32);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState34 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext33.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState34);
        com.conferenceroomscheduler.patterns.BookingState bookingState36 = bookingContext33.getState();
        com.conferenceroomscheduler.model.Reservation reservation37 = bookingContext33.getReservation();
        cancelledBookingState31.handle(bookingContext33);
        checkedInBookingState30.handle(bookingContext33);
        bookingContext33.request();
        com.conferenceroomscheduler.patterns.BookingState bookingState41 = bookingContext33.getState();
        bookingContext24.setState(bookingState41);
        checkedInBookingState0.handle(bookingContext24);
        java.lang.String str44 = bookingContext24.getStatus();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Checked in." + "'", str10, "Checked in.");
        org.junit.Assert.assertNull(reservation15);
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertNotNull(bookingState27);
        org.junit.Assert.assertNull(reservation28);
        org.junit.Assert.assertNull(reservation29);
        org.junit.Assert.assertNotNull(bookingState36);
        org.junit.Assert.assertNull(reservation37);
        org.junit.Assert.assertNotNull(bookingState41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Booking complete" + "'", str44, "Booking complete");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setRoomId("Booking confirmed.");
        java.lang.String str6 = badgeScan3.getBadgeId();
        badgeScan3.setVerified(true);
        java.lang.String str9 = badgeScan3.getRoomId();
        badgeScan3.setRoomId("Pending");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking confirmed." + "'", str9, "Booking confirmed.");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Cancelled", "staff", (int) (short) 100, false, "Pending", "");
        room6.setName("Cancelled");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        java.lang.String str6 = badgeScan3.getBadgeId();
        java.lang.String str7 = badgeScan3.getRoomId();
        badgeScan3.setVerified(true);
        java.lang.String str10 = badgeScan3.getBadgeId();
        java.lang.String str11 = badgeScan3.getRoomId();
        badgeScan3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setEnabled(true);
        java.lang.String str13 = room6.getName();
        room6.setName("Cancelled");
        room6.setEnabled(true);
        room6.setName("admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        java.lang.String str4 = reservation1.getUserId();
        boolean boolean5 = reservation1.isDepositLost();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand8 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime6, localDateTime7);
        java.lang.String str9 = reservation1.getUserId();
        boolean boolean10 = reservation1.isDepositLost();
        java.lang.String str11 = reservation1.getRoomId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod10 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation11 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime4, localDateTime5, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod10);
        java.time.LocalDateTime localDateTime12 = null;
        reservation11.setEndTime(localDateTime12);
        java.time.LocalDateTime localDateTime14 = reservation11.getEndTime();
        double double15 = reservation11.getFinalAmount();
        org.junit.Assert.assertTrue("'" + paymentMethod10 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod10.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
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
        java.lang.String str19 = reservation1.getReservationId();
        reservation1.setUserId("Checked in.");
        java.time.LocalDateTime localDateTime22 = null;
        reservation1.setStartTime(localDateTime22);
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
        reservation1.setPaymentMethod(paymentMethod54);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Booking complete" + "'", str19, "Booking complete");
        org.junit.Assert.assertTrue("'" + paymentMethod54 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod54.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("student", "hi!", "Booking confirmed.", "Cancelled", 100, localDateTime5, localDateTime6);
        int int8 = bookingRequest7.getAttendeeCount();
        java.time.LocalDateTime localDateTime9 = bookingRequest7.getStartTime();
        java.lang.String str10 = bookingRequest7.getTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cancelled" + "'", str10, "Cancelled");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.conferenceroomscheduler.model.Account account0 = new com.conferenceroomscheduler.model.Account();
        account0.setPassword("Pending");
        java.lang.String str3 = account0.getAccountNumber();
        account0.setIdentifier("");
        java.lang.String str6 = account0.getEmail();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
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
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher37 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor41 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher42 = null;
        occupancySensor41.setSubject(checkInPublisher42);
        occupancySensor41.occupied = true;
        occupancySensor41.setDetected(false);
        checkInPublisher37.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor41);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor52 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor52.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount61 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount61.setEmail("");
        boolean boolean64 = occupancySensor52.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount61);
        checkInPublisher37.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor52);
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory66 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account74 = facultyFactory66.createAccount("", "Cancelled", "", "hi!", false, false, "");
        account74.setAccountNumber("hi!");
        account74.setUniversityAccount(true);
        account74.setAccountType("Cancelled");
        checkInPublisher37.notifyObservers(account74);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor85 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, true);
        boolean boolean86 = occupancySensor85.isOccupied();
        checkInPublisher37.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor85);
        occupancySensor3.subject = checkInPublisher37;
        java.lang.String str89 = occupancySensor3.getLastEvent();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Booking confirmed." + "'", str31, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(account74);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Unverified badge detected for Cancelled." + "'", str89, "Unverified badge detected for Cancelled.");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        occupancySensor3.occupied = true;
        occupancySensor3.setDetected(false);
        java.lang.String str10 = occupancySensor3.getLastEvent();
        occupancySensor3.setRoomId("hi!");
        boolean boolean13 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher14 = occupancySensor3.getSubject();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(checkInPublisher14);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        reservation0.setTitle("Booking confirmed.");
        java.lang.String str8 = reservation0.getUserId();
        java.lang.String str9 = reservation0.getUserId();
        reservation0.setDepositLost(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
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
        occupancySensor3.setRoomId("Unverified badge detected for .");
        com.conferenceroomscheduler.model.Badge badge36 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = occupancySensor3.scanIdBadge(badge36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.model.Badge.getEmail()\" because \"badge\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Booking confirmed." + "'", str31, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
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
        reservation36.setCheckedIn(false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod33 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod33.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor3.setDetected(false);
        occupancySensor3.setRoomId("Checked in.");
        occupancySensor3.isDetected = true;
        occupancySensor3.setDetected(false);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
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
        boolean boolean85 = occupancySensor77.isDetected();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getRoomId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.lang.String str11 = bookingRequest7.getTitle();
        int int12 = bookingRequest7.getAttendeeCount();
        java.lang.String str13 = bookingRequest7.getRequestId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("student", true, true);
        com.conferenceroomscheduler.model.AdminAccount adminAccount4 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str5 = adminAccount4.getAccountId();
        adminAccount4.setIdentifier("hi!");
        java.lang.String str8 = adminAccount4.getAccountNumber();
        java.lang.String str9 = adminAccount4.getPassword();
        boolean boolean10 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount4);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor14 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor14.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount23 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount23.setEmail("");
        boolean boolean26 = occupancySensor14.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount23);
        com.conferenceroomscheduler.model.Badge badge27 = adminAccount23.getBadge();
        java.lang.String str28 = badge27.getEmail();
        boolean boolean29 = occupancySensor3.scanIdBadge(badge27);
        java.lang.String str30 = badge27.getAccountId();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(badge27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Cancelled" + "'", str28, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Cancelled" + "'", str30, "Cancelled");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
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
        java.time.LocalDateTime localDateTime14 = null;
        reservation0.setStartTime(localDateTime14);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setRoomId("hi!");
        java.lang.String str6 = reservation0.getReservationId();
        double double7 = reservation0.getHourlyRate();
        java.lang.String str8 = reservation0.getReservationId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
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
        occupancySensor3.setOccupied(false);
        boolean boolean27 = occupancySensor3.isOccupied();
        java.lang.String str28 = occupancySensor3.getRoomId();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher29 = occupancySensor3.getSubject();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(checkInPublisher29);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod7 = reservation0.getPaymentMethod();
        reservation0.setCheckedIn(true);
        java.time.LocalDateTime localDateTime10 = null;
        reservation0.setStartTime(localDateTime10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(paymentMethod7);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        double double7 = reservation0.getFinalAmount();
        reservation0.setCanceled(false);
        reservation0.setDepositLost(false);
        java.lang.String str12 = reservation0.getAccountType();
        boolean boolean13 = reservation0.isCanceled();
        reservation0.setExtended(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Pending", "student", "student", true, true, "ADMIN-69");
        boolean boolean7 = studentAccount6.isUniversityAccount();
        java.lang.String str8 = studentAccount6.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
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
        room6.setRoomId("faculty");
        room6.setName("Checked in.");
        java.lang.String str23 = room6.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Checked in." + "'", str23, "Checked in.");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("faculty", "Booking complete", "Booking confirmed.", "admin", (int) ' ', localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = bookingRequest7.getStartTime();
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
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
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setFinalAmount((double) (byte) 100);
        java.lang.String str5 = reservation2.getRoomId();
        reservation2.setFinalAmount((double) 10.0f);
        java.lang.String str8 = reservation2.getUserId();
        reservation2.setDepositAmount((double) (byte) 0);
        double double11 = reservation2.getHourlyRate();
        reservation2.setDepositLost(true);
        java.lang.String str14 = reservation2.getReservationId();
        reservation2.setRoomId("Unverified badge detected for Cancelled.");
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand19 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService1, reservation2, localDateTime17, localDateTime18);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext20 = new com.conferenceroomscheduler.patterns.BookingContext(reservation2);
        java.time.LocalDateTime localDateTime21 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand22 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation2, localDateTime21);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setEnabled(false);
        java.lang.String str9 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = room6.getOccupancySensor();
        room6.setCapacity((int) (short) 0);
        room6.setCapacity((int) (short) -1);
        room6.setRoomId("partner");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(occupancySensor10);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        boolean boolean8 = room6.isEnabled();
        room6.setCapacity(0);
        com.conferenceroomscheduler.patterns.StaffFactory staffFactory11 = new com.conferenceroomscheduler.patterns.StaffFactory();
        com.conferenceroomscheduler.model.Account account19 = staffFactory11.createAccount("Cancelled", "Checked in.", "", "Cancelled", true, true, "");
        com.conferenceroomscheduler.model.Account account27 = staffFactory11.createAccount("Booking complete", "hi!", "Unverified badge detected for Cancelled.", "Unverified badge detected for Cancelled.", true, true, "hi!");
        com.conferenceroomscheduler.model.Account account35 = staffFactory11.createAccount("Unverified badge detected for .", "hi!", "admin", "Unverified badge detected for Cancelled.", true, true, "ADMIN-69");
        room6.checkIn(account35);
        room6.setBuilding("Unverified badge detected for Cancelled.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(account19);
        org.junit.Assert.assertNotNull(account27);
        org.junit.Assert.assertNotNull(account35);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
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
        java.lang.String str14 = reservation2.getAccountType();
        java.time.LocalDateTime localDateTime15 = reservation2.getEndTime();
        reservation2.setUserId("Checked in.");
        java.time.LocalDateTime localDateTime18 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand19 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation2, localDateTime18);
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "Checked in.", true);
        java.lang.String str4 = badgeScan3.getBadgeId();
        boolean boolean5 = badgeScan3.isVerified();
        boolean boolean6 = badgeScan3.isVerified();
        java.lang.String str7 = badgeScan3.getBadgeId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
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
        double double13 = reservation1.getFinalAmount();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = room6.getOccupancySensor();
        boolean boolean11 = occupancySensor10.isOccupied();
        occupancySensor10.setDetected(true);
        java.lang.String str14 = occupancySensor10.roomId;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(occupancySensor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.time.LocalDateTime localDateTime4 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand5 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime4);
        java.lang.String str6 = reservation1.getReservationId();
        boolean boolean7 = reservation1.isCheckedIn();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
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
        com.conferenceroomscheduler.model.Badge badge16 = adminAccount9.getBadge();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(badge11);
        org.junit.Assert.assertNull(badge12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(badge16);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getAccountType();
        java.lang.String str5 = reservation2.getAccountType();
        boolean boolean6 = reservation2.isCheckedIn();
        java.time.LocalDateTime localDateTime7 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand8 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation2, localDateTime7);
        reservation2.setRoomId("faculty");
        java.time.LocalDateTime localDateTime11 = null;
        reservation2.setEndTime(localDateTime11);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
        reservation0.setCanceled(false);
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setDepositAmount(0.0d);
        reservation0.setAccountType("");
        java.lang.String str8 = reservation0.getUserId();
        java.lang.String str9 = reservation0.getAccountType();
        boolean boolean10 = reservation0.isExtended();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
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
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand9.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.extendBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        reservation1.setDepositAmount((double) (byte) 0);
        boolean boolean10 = reservation1.isExtended();
        reservation1.setReservationId("admin");
        java.time.LocalDateTime localDateTime13 = reservation1.getStartTime();
        reservation1.setExtended(false);
        double double16 = reservation1.getDepositAmount();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand17 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        reservation0.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext12 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod13 = reservation0.getPaymentMethod();
        reservation0.setReservationId("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(paymentMethod13);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        studentAccount6.setUniversityAccount(false);
        studentAccount6.setIdentifier("Cancelled");
        studentAccount6.setAccountNumber("student");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        java.lang.String str7 = room6.getBuilding();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Booking confirmed.", "Unverified badge detected for Cancelled.", true);
        badgeScan3.setBadgeId("");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Booking complete", "Unverified badge detected for .", false);
        badgeScan3.setRoomId("student");
        boolean boolean6 = badgeScan3.isVerified();
        java.lang.String str7 = badgeScan3.getBadgeId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking complete" + "'", str7, "Booking complete");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
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
        java.time.LocalDateTime localDateTime52 = null;
        java.time.LocalDateTime localDateTime53 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod58 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation59 = new com.conferenceroomscheduler.model.Reservation("Pending", "admin", "Cancelled", "Booking confirmed.", localDateTime52, localDateTime53, "admin", (double) (short) 1, (double) (short) 100, (double) (-1L), paymentMethod58);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext60 = new com.conferenceroomscheduler.patterns.BookingContext(reservation59);
        checkedInBookingState23.handle(bookingContext60);
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
        org.junit.Assert.assertTrue("'" + paymentMethod58 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod58.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("hi!", "student", true);
        java.lang.String str4 = badgeScan3.getRoomId();
        boolean boolean5 = badgeScan3.isVerified();
        boolean boolean6 = badgeScan3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory0 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account8 = facultyFactory0.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account16 = facultyFactory0.createAccount("", "hi!", "", "", false, true, "");
        com.conferenceroomscheduler.model.Account account24 = facultyFactory0.createAccount("Cancelled", "Pending", "Cancelled", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account32 = facultyFactory0.createAccount("student", "", "Checked in.", "admin", false, true, "Checked in.");
        com.conferenceroomscheduler.model.Account account40 = facultyFactory0.createAccount("admin", "Unverified badge detected for .", "Checked in.", "staff", true, true, "Pending");
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
        org.junit.Assert.assertNotNull(account32);
        org.junit.Assert.assertNotNull(account40);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        studentAccount10.setEmail("Checked in.");
        com.conferenceroomscheduler.model.Badge badge14 = studentAccount10.getBadge();
        badge14.setEmail("Booking complete");
        java.lang.String str17 = badge14.getAccountId();
        java.lang.Class<?> wildcardClass18 = badge14.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(badge14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        java.lang.String str6 = badgeScan3.getBadgeId();
        badgeScan3.setVerified(false);
        badgeScan3.setVerified(false);
        badgeScan3.setRoomId("Booking complete");
        boolean boolean13 = badgeScan3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("Booking complete", "Unverified badge detected for Cancelled.", "Checked in.", true, true, "admin");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("student", "Booking complete", "Pending", false, false, "");
        java.lang.String str7 = facultyAccount6.getEmail();
        java.lang.String str8 = facultyAccount6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking complete" + "'", str7, "Booking complete");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking complete" + "'", str8, "Booking complete");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setRoomId("hi!");
        reservation0.setCheckedIn(true);
        reservation0.setHourlyRate((double) 'a');
        java.lang.String str10 = reservation0.getAccountType();
        java.lang.String str11 = reservation0.getRoomId();
        reservation0.setDepositAmount(32.0d);
        java.time.LocalDateTime localDateTime14 = null;
        reservation0.setStartTime(localDateTime14);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod16 = reservation0.getPaymentMethod();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(paymentMethod16);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory0 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account8 = facultyFactory0.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account16 = facultyFactory0.createAccount("", "hi!", "", "", false, true, "");
        com.conferenceroomscheduler.model.Account account24 = facultyFactory0.createAccount("Cancelled", "Pending", "Cancelled", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account32 = facultyFactory0.createAccount("student", "", "Checked in.", "admin", false, true, "Checked in.");
        com.conferenceroomscheduler.model.Account account40 = facultyFactory0.createAccount("Verified badge detected for ADMIN-69.", "", "Booking confirmed.", "hi!", true, true, "Checked in.");
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
        org.junit.Assert.assertNotNull(account32);
        org.junit.Assert.assertNotNull(account40);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("faculty", "Pending", (int) '#', "Cancelled", "Pending");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("admin", "Booking complete", (int) (byte) 1, "hi!", "Checked in.");
        room18.setBuilding("");
        room18.setRoomId("Cancelled");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
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
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService15 = null;
        com.conferenceroomscheduler.model.Reservation reservation16 = new com.conferenceroomscheduler.model.Reservation();
        reservation16.setFinalAmount((double) (byte) 100);
        java.lang.String str19 = reservation16.getRoomId();
        reservation16.setFinalAmount((double) 10.0f);
        java.lang.String str22 = reservation16.getUserId();
        reservation16.setDepositAmount((double) (byte) 0);
        double double25 = reservation16.getHourlyRate();
        reservation16.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext28 = new com.conferenceroomscheduler.patterns.BookingContext(reservation16);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod39 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation40 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime33, localDateTime34, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod39);
        reservation16.setPaymentMethod(paymentMethod39);
        java.time.LocalDateTime localDateTime42 = reservation16.getStartTime();
        java.time.LocalDateTime localDateTime43 = reservation16.getStartTime();
        reservation16.setTitle("");
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand48 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService15, reservation16, localDateTime46, localDateTime47);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext49 = new com.conferenceroomscheduler.patterns.BookingContext(reservation16);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState50 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation51 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext52 = new com.conferenceroomscheduler.patterns.BookingContext(reservation51);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState53 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext52.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState53);
        com.conferenceroomscheduler.patterns.BookingState bookingState55 = bookingContext52.getState();
        com.conferenceroomscheduler.model.Reservation reservation56 = bookingContext52.getReservation();
        cancelledBookingState50.handle(bookingContext52);
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState58 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str59 = confirmedBookingState58.getName();
        java.lang.String str60 = confirmedBookingState58.getName();
        com.conferenceroomscheduler.model.Reservation reservation61 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext62 = new com.conferenceroomscheduler.patterns.BookingContext(reservation61);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState63 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext62.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState63);
        com.conferenceroomscheduler.model.Reservation reservation65 = bookingContext62.getReservation();
        confirmedBookingState58.handle(bookingContext62);
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
        java.lang.String str91 = bookingContext79.getStatus();
        java.lang.String str92 = bookingContext79.getStatus();
        confirmedBookingState58.handle(bookingContext79);
        cancelledBookingState50.handle(bookingContext79);
        java.lang.String str95 = cancelledBookingState50.getName();
        bookingContext49.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState50);
        cancelledBookingState0.handle(bookingContext49);
        java.lang.String str98 = cancelledBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cancelled" + "'", str1, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertNull(reservation9);
        org.junit.Assert.assertNull(reservation13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod39 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod39.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertNull(localDateTime42);
        org.junit.Assert.assertNull(localDateTime43);
        org.junit.Assert.assertNotNull(bookingState55);
        org.junit.Assert.assertNull(reservation56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Booking confirmed." + "'", str59, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Booking confirmed." + "'", str60, "Booking confirmed.");
        org.junit.Assert.assertNull(reservation65);
        org.junit.Assert.assertNotNull(bookingState73);
        org.junit.Assert.assertNotNull(bookingState74);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Checked in." + "'", str77, "Checked in.");
        org.junit.Assert.assertNull(reservation82);
        org.junit.Assert.assertNotNull(bookingState87);
        org.junit.Assert.assertNull(reservation90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "Booking complete" + "'", str91, "Booking complete");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "Booking complete" + "'", str92, "Booking complete");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "Cancelled" + "'", str95, "Cancelled");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "Cancelled" + "'", str98, "Cancelled");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
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
        reservation13.setCheckedIn(true);
        reservation13.setDepositLost(false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("faculty", "Pending", "Pending", true, true, "partner");
        studentAccount6.setVerified(false);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
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
        com.conferenceroomscheduler.patterns.BookingState bookingState21 = bookingContext18.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState22 = bookingContext18.getState();
        bookingContext18.request();
        bookingContext18.request();
        com.conferenceroomscheduler.model.Reservation reservation25 = bookingContext18.getReservation();
        checkedInBookingState0.handle(bookingContext18);
        java.lang.String str27 = checkedInBookingState0.getName();
        java.lang.String str28 = checkedInBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation29 = new com.conferenceroomscheduler.model.Reservation();
        reservation29.setFinalAmount((double) (byte) 100);
        java.lang.String str32 = reservation29.getRoomId();
        reservation29.setFinalAmount((double) 10.0f);
        java.lang.String str35 = reservation29.getUserId();
        reservation29.setDepositAmount((double) (byte) 0);
        double double38 = reservation29.getHourlyRate();
        reservation29.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext41 = new com.conferenceroomscheduler.patterns.BookingContext(reservation29);
        com.conferenceroomscheduler.patterns.BookingState bookingState42 = bookingContext41.getState();
        checkedInBookingState0.handle(bookingContext41);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertNotNull(bookingState21);
        org.junit.Assert.assertNotNull(bookingState22);
        org.junit.Assert.assertNull(reservation25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Checked in." + "'", str27, "Checked in.");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Checked in." + "'", str28, "Checked in.");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState42);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
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
        reservation1.setCheckedIn(true);
        reservation1.setUserId("Unverified badge detected for .");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
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
        reservation1.setUserId("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand6 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setCheckedIn(false);
        double double9 = reservation1.getHourlyRate();
        reservation1.setTitle("Unverified badge detected for .");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        java.lang.String str4 = reservation1.getUserId();
        boolean boolean5 = reservation1.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod6 = reservation1.getPaymentMethod();
        reservation1.setDepositLost(true);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand9 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        boolean boolean10 = cancelBookingCommand9.wasSuccessful();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setDepositAmount(0.0d);
        reservation1.setAccountType("");
        java.lang.String str9 = reservation1.getUserId();
        reservation1.setReservationId("student");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand12 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        boolean boolean13 = cancelBookingCommand12.wasSuccessful();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setRoomId("hi!");
        reservation0.setTitle("Pending");
        boolean boolean7 = reservation0.isCanceled();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("staff", true, true);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getRoomId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.time.LocalDateTime localDateTime11 = bookingRequest7.getEndTime();
        java.lang.String str12 = bookingRequest7.getTitle();
        java.lang.String str13 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor38 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount45 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean46 = occupancySensor38.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount45);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher47 = null;
        occupancySensor38.setSubject(checkInPublisher47);
        occupancySensor38.isDetected = false;
        boolean boolean51 = occupancySensor38.isOccupied();
        com.conferenceroomscheduler.model.Badge badge55 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str56 = badge55.getEmail();
        boolean boolean57 = occupancySensor38.scanIdBadge(badge55);
        java.lang.String str58 = badge55.getAccountId();
        badge55.setAccountId("Cancelled");
        java.lang.String str61 = badge55.getEmail();
        java.lang.String str62 = badge55.getAccountId();
        boolean boolean63 = badge55.isVerified();
        boolean boolean64 = badge55.isVerified();
        boolean boolean65 = occupancySensor15.scanIdBadge(badge55);
        java.lang.String str66 = badge55.getEmail();
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Pending" + "'", str29, "Pending");
        org.junit.Assert.assertNull(checkInPublisher32);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Cancelled" + "'", str56, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Booking confirmed." + "'", str58, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Cancelled" + "'", str61, "Cancelled");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Cancelled" + "'", str62, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Cancelled" + "'", str66, "Cancelled");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod6 = reservation1.getPaymentMethod();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand9 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime7, localDateTime8);
        double double10 = reservation1.getDepositAmount();
        double double11 = reservation1.getFinalAmount();
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
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
        // The following exception was thrown during execution in test generation
        try {
            editBookingCommand16.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.editBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(paymentMethod11);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
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
        java.lang.String str15 = reservation2.getRoomId();
        reservation2.setDepositLost(false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Pending", "Pending", (int) (short) -1, "", "Cancelled");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("Cancelled", "ADMIN-69", (-1), "faculty", "Pending");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("", "hi!", 0, "Unverified badge detected for .", "");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor25 = room24.getOccupancySensor();
        boolean boolean26 = occupancySensor25.isDetected;
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
        org.junit.Assert.assertNotNull(occupancySensor25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getOrganizerId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.lang.String str11 = bookingRequest7.getTitle();
        int int12 = bookingRequest7.getAttendeeCount();
        java.lang.String str13 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
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
        java.lang.String str50 = reservation47.getReservationId();
        double double51 = reservation47.getHourlyRate();
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod43 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod43.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "student" + "'", str48, "student");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "faculty" + "'", str50, "faculty");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
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
        boolean boolean49 = occupancySensor3.occupied;
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("Unverified badge detected for Cancelled.", "", "Verified badge detected for ADMIN-69.", false, false, "partner");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setDepositAmount(0.0d);
        double double6 = reservation0.getHourlyRate();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
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
        int int51 = room48.getCapacity();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
        org.junit.Assert.assertNotNull(room30);
        org.junit.Assert.assertNotNull(room36);
        org.junit.Assert.assertNotNull(room42);
        org.junit.Assert.assertNotNull(room48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setFinalAmount((double) ' ');
        java.lang.String str9 = reservation0.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext10 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.BookingState bookingState11 = null;
        bookingContext10.setState(bookingState11);
        // The following exception was thrown during execution in test generation
        try {
            bookingContext10.request();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.patterns.BookingState.handle(com.conferenceroomscheduler.patterns.BookingContext)\" because \"this.state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        double double7 = reservation0.getFinalAmount();
        reservation0.setReservationId("Pending");
        boolean boolean10 = reservation0.isCanceled();
        reservation0.setAccountType("Unverified badge detected for .");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        com.conferenceroomscheduler.model.AdminAccount adminAccount11 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount11.setAccountNumber("hi!");
        java.lang.String str14 = adminAccount11.getAccountId();
        room6.checkIn((com.conferenceroomscheduler.model.Account) adminAccount11);
        room6.setEnabled(false);
        boolean boolean18 = room6.isClosedForMaintenance();
        room6.setRoomId("");
        java.lang.String str21 = room6.getRoomNumber();
        java.lang.String str22 = room6.getBuilding();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        room6.setRoomId("Booking complete");
        int int21 = room6.getCapacity();
        java.lang.String str22 = room6.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cancelled" + "'", str22, "Cancelled");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        occupancySensor4.setOccupied(true);
        occupancySensor4.setDetected(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setHourlyRate((double) (byte) 100);
        boolean boolean3 = reservation0.isExtended();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
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
        occupancySensor3.occupied = false;
        occupancySensor3.setDetected(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Booking confirmed." + "'", str31, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        boolean boolean9 = reservation0.isExtended();
        reservation0.setRoomId("Checked in.");
        reservation0.setReservationId("Booking complete");
        reservation0.setRoomId("ADMIN-69");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
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
        room6.setName("Booking confirmed.");
        room6.setRoomNumber("Cancelled");
        room6.setBuilding("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        java.lang.String str2 = reservation1.getTitle();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.time.LocalDateTime localDateTime4 = reservation1.getEndTime();
        reservation1.setUserId("hi!");
        reservation1.setDepositAmount(100.0d);
        reservation1.setReservationId("Verified badge detected for Checked in..");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(localDateTime4);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        reservation1.setDepositAmount((double) (byte) 0);
        java.lang.String str10 = reservation1.getAccountType();
        reservation1.setHourlyRate((double) '#');
        reservation1.setFinalAmount((double) 1.0f);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand17 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime15, localDateTime16);
        // The following exception was thrown during execution in test generation
        try {
            editBookingCommand17.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.editBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
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
        boolean boolean69 = occupancySensor3.isDetected();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pending" + "'", str12, "Pending");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("hi!", "Booking complete", "Booking confirmed.", false, false, "Booking complete");
        java.lang.String str7 = staffAccount6.getAccountId();
        java.lang.String str8 = staffAccount6.getAccountId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod10 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation11 = new com.conferenceroomscheduler.model.Reservation("", "Pending", "Pending", "Unverified badge detected for .", localDateTime4, localDateTime5, "Checked in.", (double) (short) 100, (double) 100, (double) 52, paymentMethod10);
        reservation11.setExtended(true);
        org.junit.Assert.assertTrue("'" + paymentMethod10 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod10.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        badgeScan3.setVerified(false);
        badgeScan3.setBadgeId("Cancelled");
        boolean boolean10 = badgeScan3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setHourlyRate((double) (byte) 100);
        boolean boolean4 = reservation1.isDepositLost();
        java.time.LocalDateTime localDateTime5 = null;
        reservation1.setEndTime(localDateTime5);
        java.lang.String str7 = reservation1.getTitle();
        boolean boolean8 = reservation1.isCheckedIn();
        java.lang.String str9 = reservation1.getUserId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand10 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setDepositLost(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = occupancySensor3.getSubject();
        com.conferenceroomscheduler.model.AdminAccount adminAccount19 = new com.conferenceroomscheduler.model.AdminAccount("", "Booking confirmed.", "", false, false, "");
        adminAccount19.setAccountId("");
        boolean boolean22 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount19);
        boolean boolean23 = occupancySensor3.isDetected();
        boolean boolean24 = occupancySensor3.isDetected;
        boolean boolean25 = occupancySensor3.isDetected();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(checkInPublisher12);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Booking complete", "Booking confirmed.", "Pending", false, false, "Booking confirmed.");
        java.lang.String str7 = partnerAccount6.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pending" + "'", str7, "Pending");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
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
        bookingContext39.request();
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
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
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
        reservation0.setDepositAmount(10.0d);
        reservation0.setHourlyRate((double) 1);
        double double19 = reservation0.getHourlyRate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("faculty", "Pending", (int) '#', "Cancelled", "Pending");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("Unverified badge detected for .", "ADMIN-69", 0, "Pending", "Pending");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("", "ADMIN-69", (int) (short) 100, "faculty", "Booking confirmed.");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        com.conferenceroomscheduler.patterns.PartnerFactory partnerFactory0 = new com.conferenceroomscheduler.patterns.PartnerFactory();
        com.conferenceroomscheduler.model.Account account8 = partnerFactory0.createAccount("Checked in.", "hi!", "admin", "", true, false, "Pending");
        com.conferenceroomscheduler.model.Account account16 = partnerFactory0.createAccount("Booking complete", "hi!", "hi!", "", true, false, "Checked in.");
        com.conferenceroomscheduler.model.Account account24 = partnerFactory0.createAccount("Booking complete", "ADMIN-69", "Pending", "Checked in.", true, true, "");
        com.conferenceroomscheduler.model.Account account32 = partnerFactory0.createAccount("partner", "faculty", "student", "ADMIN-69", false, false, "Booking complete");
        com.conferenceroomscheduler.model.Account account40 = partnerFactory0.createAccount("", "Booking confirmed.", "Booking complete", "Booking complete", false, false, "ADMIN-69");
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
        org.junit.Assert.assertNotNull(account32);
        org.junit.Assert.assertNotNull(account40);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setRoomId("Booking confirmed.");
        java.lang.String str6 = badgeScan3.getBadgeId();
        badgeScan3.setVerified(true);
        java.lang.String str9 = badgeScan3.getRoomId();
        badgeScan3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking confirmed." + "'", str9, "Booking confirmed.");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Booking confirmed.", true, false);
        boolean boolean4 = occupancySensor3.isDetected;
        occupancySensor3.occupied = true;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher7 = occupancySensor3.getSubject();
        com.conferenceroomscheduler.model.Account account15 = new com.conferenceroomscheduler.model.Account("Unverified badge detected for .", "", "faculty", "Unverified badge detected for Cancelled.", false, true, "Cancelled");
        boolean boolean16 = occupancySensor3.detectOccupancy(account15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(checkInPublisher7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setCheckedIn(true);
        reservation0.setCheckedIn(false);
        java.lang.String str11 = reservation0.getUserId();
        double double12 = reservation0.getDepositAmount();
        reservation0.setRoomId("Checked in.");
        reservation0.setExtended(true);
        reservation0.setCanceled(true);
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.time.LocalDateTime localDateTime7 = reservation1.getStartTime();
        double double8 = reservation1.getDepositAmount();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand11 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime9, localDateTime10);
        // The following exception was thrown during execution in test generation
        try {
            editBookingCommand11.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.editBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
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
        reservation10.setAccountType("student");
        java.time.LocalDateTime localDateTime16 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand17 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation10, localDateTime16);
        java.lang.Class<?> wildcardClass18 = extendBookingCommand17.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNotNull(reservation10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod10 = null;
        com.conferenceroomscheduler.model.Reservation reservation11 = new com.conferenceroomscheduler.model.Reservation("faculty", "partner", "Booking complete", "student", localDateTime4, localDateTime5, "", 100.0d, (double) (short) 10, (double) ' ', paymentMethod10);
        java.lang.String str12 = reservation11.getReservationId();
        java.lang.String str13 = reservation11.getTitle();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
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
        boolean boolean32 = occupancySensor3.isDetected;
        com.conferenceroomscheduler.model.StaffAccount staffAccount39 = new com.conferenceroomscheduler.model.StaffAccount("Booking complete", "Cancelled", "admin", false, true, "Cancelled");
        boolean boolean40 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) staffAccount39);
        java.lang.String str41 = occupancySensor3.roomId;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pending" + "'", str23, "Pending");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Pending" + "'", str41, "Pending");
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
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
        badge20.setAccountId("student");
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
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        boolean boolean6 = reservation0.isCanceled();
        reservation0.setAccountType("Verified badge detected for Checked in..");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount0.setAccountNumber("hi!");
        boolean boolean3 = adminAccount0.isUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        boolean boolean4 = badgeScan3.isVerified();
        boolean boolean5 = badgeScan3.isVerified();
        java.lang.String str6 = badgeScan3.getBadgeId();
        badgeScan3.setVerified(true);
        java.lang.String str9 = badgeScan3.getRoomId();
        badgeScan3.setBadgeId("Cancelled");
        badgeScan3.setRoomId("student");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Pending", "Pending", true);
        java.lang.String str4 = badge3.getEmail();
        badge3.setAccountId("Unverified badge detected for Cancelled.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pending" + "'", str4, "Pending");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
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
        boolean boolean48 = reservation47.isCanceled();
        double double49 = reservation47.getHourlyRate();
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod43 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod43.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        boolean boolean9 = reservation0.isExtended();
        reservation0.setRoomId("Checked in.");
        java.time.LocalDateTime localDateTime12 = null;
        reservation0.setEndTime(localDateTime12);
        reservation0.setFinalAmount((double) '4');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setFinalAmount((double) ' ');
        reservation0.setAccountType("Booking confirmed.");
        reservation0.setTitle("admin");
        reservation0.setTitle("");
        java.time.LocalDateTime localDateTime15 = null;
        reservation0.setEndTime(localDateTime15);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setHourlyRate((double) (byte) 100);
        boolean boolean4 = reservation1.isDepositLost();
        java.lang.String str5 = reservation1.getUserId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand6 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setTitle("Checked in.");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext9 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setDepositAmount(0.0d);
        java.lang.String str7 = reservation1.getReservationId();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand10 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime8, localDateTime9);
        boolean boolean11 = editBookingCommand10.wasSuccessful();
        boolean boolean12 = editBookingCommand10.wasSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            editBookingCommand10.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.editBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
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
        occupancySensor3.roomId = "ADMIN-69";
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor52 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount59 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean60 = occupancySensor52.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount59);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher61 = null;
        occupancySensor52.setSubject(checkInPublisher61);
        occupancySensor52.isDetected = false;
        boolean boolean65 = occupancySensor52.isOccupied();
        com.conferenceroomscheduler.model.Badge badge69 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str70 = badge69.getEmail();
        boolean boolean71 = occupancySensor52.scanIdBadge(badge69);
        java.lang.String str72 = badge69.getAccountId();
        badge69.setAccountId("Cancelled");
        badge69.setAccountId("");
        java.lang.String str77 = badge69.getAccountId();
        badge69.setVerified(true);
        java.lang.String str80 = badge69.getAccountId();
        badge69.setVerified(true);
        boolean boolean83 = occupancySensor3.scanIdBadge(badge69);
        java.lang.String str84 = badge69.getEmail();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(checkInPublisher38);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Cancelled" + "'", str70, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Booking confirmed." + "'", str72, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Cancelled" + "'", str84, "Cancelled");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy institutionalBillingPaymentStrategy0 = new com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy();
        boolean boolean3 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", 0.0d);
        boolean boolean6 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", (double) (short) 1);
        boolean boolean9 = institutionalBillingPaymentStrategy0.processPayment("Cancelled", 32.0d);
        boolean boolean12 = institutionalBillingPaymentStrategy0.processPayment("faculty", (double) 1);
        boolean boolean15 = institutionalBillingPaymentStrategy0.processPayment("Booking confirmed.", (double) 1);
        boolean boolean18 = institutionalBillingPaymentStrategy0.processPayment("faculty", 0.0d);
        boolean boolean21 = institutionalBillingPaymentStrategy0.processPayment("Booking confirmed.", 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Cancelled", "hi!", "hi!", "", (int) (short) 1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getTitle();
        java.lang.String str9 = bookingRequest7.getRoomId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.lang.String str11 = bookingRequest7.getOrganizerId();
        java.lang.String str12 = bookingRequest7.getOrganizerId();
        java.time.LocalDateTime localDateTime13 = bookingRequest7.getStartTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Checked in.", "Pending", "Cancelled", true, false, "Booking confirmed.");
        studentAccount6.setAccountId("Cancelled");
        studentAccount6.setAccountType("");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
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
        reservation10.setAccountType("student");
        java.time.LocalDateTime localDateTime16 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand17 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation10, localDateTime16);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand17.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.extendBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNotNull(reservation10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        boolean boolean4 = reservation1.isCheckedIn();
        reservation1.setDepositLost(true);
        reservation1.setTitle("Booking confirmed.");
        reservation1.setReservationId("student");
        reservation1.setCheckedIn(true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
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
        java.lang.String str37 = occupancySensor3.roomId;
        java.lang.String str38 = occupancySensor3.getLastEvent();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Cancelled" + "'", str29, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Unverified badge detected for admin." + "'", str38, "Unverified badge detected for admin.");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState0 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str1 = pendingBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation2.getPaymentMethod();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext6 = new com.conferenceroomscheduler.patterns.BookingContext(reservation2);
        pendingBookingState0.handle(bookingContext6);
        com.conferenceroomscheduler.model.Reservation reservation8 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext9 = new com.conferenceroomscheduler.patterns.BookingContext(reservation8);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState10 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext9.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState10);
        com.conferenceroomscheduler.patterns.BookingState bookingState12 = bookingContext9.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState13 = bookingContext9.getState();
        bookingContext9.request();
        java.lang.String str15 = bookingContext9.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            pendingBookingState0.handle(bookingContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.model.Reservation.getDepositAmount()\" because the return value of \"com.conferenceroomscheduler.patterns.BookingContext.getReservation()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pending" + "'", str1, "Pending");
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertNotNull(bookingState12);
        org.junit.Assert.assertNotNull(bookingState13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cancelled" + "'", str15, "Cancelled");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
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
        reservation0.setDepositLost(true);
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        boolean boolean19 = room6.isEnabled();
        room6.setBuilding("Pending");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher22 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor26 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean27 = occupancySensor26.isDetected();
        occupancySensor26.occupied = false;
        checkInPublisher22.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor26);
        occupancySensor26.setOccupied(true);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher33 = occupancySensor26.getSubject();
        room6.setOccupancySensor(occupancySensor26);
        room6.setBuilding("Verified badge detected for Checked in..");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(checkInPublisher33);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        com.conferenceroomscheduler.patterns.PartnerFactory partnerFactory0 = new com.conferenceroomscheduler.patterns.PartnerFactory();
        com.conferenceroomscheduler.model.Account account8 = partnerFactory0.createAccount("Checked in.", "hi!", "admin", "", true, false, "Pending");
        com.conferenceroomscheduler.model.Account account16 = partnerFactory0.createAccount("Booking complete", "hi!", "hi!", "", true, false, "Checked in.");
        com.conferenceroomscheduler.model.Badge badge17 = account16.getBadge();
        account16.setAccountNumber("Unverified badge detected for admin.");
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(badge17);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("faculty", "Pending", (int) '#', "Cancelled", "Pending");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("admin", "Booking complete", (int) (byte) 1, "hi!", "Checked in.");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("faculty", "admin", (int) (byte) 100, "hi!", "Checked in.");
        com.conferenceroomscheduler.model.Room room30 = roomFactory0.createRoom("Booking confirmed.", "Pending", (int) '#', "ADMIN-69", "Unverified badge detected for .");
        com.conferenceroomscheduler.model.Room room36 = roomFactory0.createRoom("hi!", "Verified badge detected for Checked in..", 35, "Unverified badge detected for admin.", "Unverified badge detected for Cancelled.");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
        org.junit.Assert.assertNotNull(room30);
        org.junit.Assert.assertNotNull(room36);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        java.lang.String str4 = reservation1.getUserId();
        boolean boolean5 = reservation1.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod6 = reservation1.getPaymentMethod();
        reservation1.setUserId("");
        reservation1.setDepositLost(false);
        java.time.LocalDateTime localDateTime11 = null;
        reservation1.setEndTime(localDateTime11);
        java.lang.String str13 = reservation1.getReservationId();
        boolean boolean14 = reservation1.isCanceled();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand15 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        boolean boolean16 = cancelBookingCommand15.wasSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand15.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        reservation1.setReservationId("Checked in.");
        double double10 = reservation1.getDepositAmount();
        boolean boolean11 = reservation1.isExtended();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod12 = reservation1.getPaymentMethod();
        java.lang.String str13 = reservation1.getAccountType();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand14 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(paymentMethod12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand6 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setCheckedIn(false);
        reservation1.setTitle("faculty");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
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
        bookingContext2.request();
        java.lang.String str21 = bookingContext2.getStatus();
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNull(reservation6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState15);
        org.junit.Assert.assertNotNull(bookingState16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Booking complete" + "'", str21, "Booking complete");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
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
        java.lang.String str35 = completedBookingState6.getName();
        org.junit.Assert.assertNotNull(bookingState4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cancelled" + "'", str5, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState17);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Booking complete" + "'", str21, "Booking complete");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Booking complete" + "'", str24, "Booking complete");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Pending" + "'", str27, "Pending");
        org.junit.Assert.assertNull(paymentMethod31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Booking complete" + "'", str35, "Booking complete");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        com.conferenceroomscheduler.model.BookingRequest bookingRequest0 = new com.conferenceroomscheduler.model.BookingRequest();
        java.time.LocalDateTime localDateTime1 = bookingRequest0.getEndTime();
        java.lang.String str2 = bookingRequest0.getRoomId();
        int int3 = bookingRequest0.getAttendeeCount();
        org.junit.Assert.assertNull(localDateTime1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor52 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount59 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean60 = occupancySensor52.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount59);
        java.lang.String str61 = studentAccount59.getAccountType();
        com.conferenceroomscheduler.model.Badge badge62 = studentAccount59.getBadge();
        badge62.setVerified(false);
        boolean boolean65 = occupancySensor3.scanIdBadge(badge62);
        java.lang.String str66 = badge62.getEmail();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(checkInPublisher38);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "student" + "'", str61, "student");
        org.junit.Assert.assertNotNull(badge62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("partner", "Booking complete", (int) (byte) 10, false, "", "");
        room6.setRoomNumber("Unverified badge detected for Cancelled.");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor12 = new com.conferenceroomscheduler.model.OccupancySensor("Booking confirmed.", true, false);
        boolean boolean13 = occupancySensor12.isDetected;
        occupancySensor12.occupied = true;
        room6.setOccupancySensor(occupancySensor12);
        room6.setRoomId("partner");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("admin", "Unverified badge detected for Cancelled.", false);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("Cancelled", "admin", "admin", "Verified badge detected for Checked in..", false, true, "partner");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor4.setSubject(checkInPublisher5);
        occupancySensor4.occupied = true;
        occupancySensor4.setDetected(false);
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        java.lang.String str12 = occupancySensor4.roomId;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getRoomId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.lang.String str11 = bookingRequest7.getTitle();
        java.time.LocalDateTime localDateTime12 = bookingRequest7.getStartTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = localDateTime12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
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
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setEnabled(true);
        java.lang.String str13 = room6.getName();
        room6.setBuilding("Unverified badge detected for Cancelled.");
        room6.setClosedForMaintenance(false);
        java.lang.String str18 = room6.getRoomId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand8 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str9 = reservation1.getTitle();
        java.time.LocalDateTime localDateTime10 = reservation1.getEndTime();
        reservation1.setExtended(false);
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
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
        com.conferenceroomscheduler.model.Reservation reservation60 = new com.conferenceroomscheduler.model.Reservation();
        reservation60.setFinalAmount((double) (byte) 100);
        java.lang.String str63 = reservation60.getRoomId();
        reservation60.setFinalAmount((double) 10.0f);
        java.lang.String str66 = reservation60.getUserId();
        reservation60.setFinalAmount((double) ' ');
        java.lang.String str69 = reservation60.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext70 = new com.conferenceroomscheduler.patterns.BookingContext(reservation60);
        bookingContext70.request();
        java.lang.String str72 = bookingContext70.getStatus();
        checkedInBookingState38.handle(bookingContext70);
        bookingContext70.request();
        com.conferenceroomscheduler.patterns.BookingState bookingState75 = bookingContext70.getState();
        checkedInBookingState0.handle(bookingContext70);
        java.lang.String str77 = checkedInBookingState0.getName();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Checked in." + "'", str10, "Checked in.");
        org.junit.Assert.assertNull(reservation15);
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Checked in." + "'", str23, "Checked in.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Pending" + "'", str25, "Pending");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Cancelled" + "'", str33, "Cancelled");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Cancelled" + "'", str36, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState44);
        org.junit.Assert.assertNotNull(bookingState45);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Pending" + "'", str72, "Pending");
        org.junit.Assert.assertNotNull(bookingState75);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Checked in." + "'", str77, "Checked in.");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Cancelled", "faculty", "student", "Pending", 52, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = bookingRequest7.getStartTime();
        java.lang.String str9 = bookingRequest7.getOrganizerId();
        java.lang.String str10 = bookingRequest7.getRequestId();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cancelled" + "'", str10, "Cancelled");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setFinalAmount((double) ' ');
        java.lang.String str9 = reservation0.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext10 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        reservation0.setCheckedIn(true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        double double8 = reservation1.getDepositAmount();
        reservation1.setDepositLost(false);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand11 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setCheckedIn(true);
        double double14 = reservation1.getDepositAmount();
        java.time.LocalDateTime localDateTime15 = reservation1.getStartTime();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
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
        badge31.setVerified(false);
        java.lang.String str44 = badge31.getAccountId();
        org.junit.Assert.assertNull(checkInPublisher8);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Cancelled" + "'", str32, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Booking confirmed." + "'", str34, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Cancelled" + "'", str40, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor0 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor0.update("Checked in.");
        roomSensor0.update("Checked in.");
        roomSensor0.update("Cancelled");
        roomSensor0.update("");
        roomSensor0.update("");
        roomSensor0.update("Checked in.");
        roomSensor0.update("ADMIN-69");
        roomSensor0.update("admin");
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setDepositAmount(0.0d);
        reservation0.setAccountType("");
        java.lang.String str8 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (short) 100);
        reservation0.setAccountType("ADMIN-69");
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Cancelled", "hi!", "hi!", "", (int) (short) 1, localDateTime5, localDateTime6);
        int int8 = bookingRequest7.getAttendeeCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod21 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation22 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime15, localDateTime16, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod21);
        com.conferenceroomscheduler.model.Reservation reservation23 = new com.conferenceroomscheduler.model.Reservation("admin", "", "Booking complete", "Pending", localDateTime5, localDateTime6, "", (double) 'a', (double) 10L, 0.0d, paymentMethod21);
        reservation23.setDepositAmount((double) 100.0f);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand28 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation23, localDateTime26, localDateTime27);
        // The following exception was thrown during execution in test generation
        try {
            editBookingCommand28.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.editBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + paymentMethod21 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod21.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("partner", "Cancelled", "", false, true, "Booking complete");
        boolean boolean7 = adminAccount6.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
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
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod15 = reservation0.getPaymentMethod();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(paymentMethod15);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
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
        java.lang.String str14 = confirmedBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking confirmed." + "'", str1, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking confirmed." + "'", str2, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking confirmed." + "'", str3, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Booking confirmed." + "'", str4, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState9);
        org.junit.Assert.assertNotNull(bookingState10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking confirmed." + "'", str13, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking confirmed." + "'", str14, "Booking confirmed.");
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
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
        occupancySensor3.occupied = false;
        occupancySensor3.isDetected = false;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(checkInPublisher24);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
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
        java.time.LocalDateTime localDateTime22 = reservation21.getEndTime();
        java.lang.String str23 = reservation21.getUserId();
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Pending" + "'", str9, "Pending");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cancelled" + "'", str17, "Cancelled");
        org.junit.Assert.assertNotNull(reservation21);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "", "hi!", "", (int) '4', localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = bookingRequest7.getStartTime();
        java.lang.String str9 = bookingRequest7.getRequestId();
        java.lang.String str10 = bookingRequest7.getRoomId();
        java.time.LocalDateTime localDateTime11 = bookingRequest7.getStartTime();
        java.lang.String str12 = bookingRequest7.getRequestId();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
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
        java.lang.String str27 = occupancySensor3.getRoomId();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher28 = occupancySensor3.subject;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Pending" + "'", str27, "Pending");
        org.junit.Assert.assertNotNull(checkInPublisher28);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
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
        occupancySensor3.setOccupied(true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(checkInPublisher38);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Unverified badge detected for .", "student", "Cancelled", false, false, "staff");
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
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
        adminAccount9.setPassword("Booking complete");
        adminAccount9.setIdentifier("ADMIN-69");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(badge11);
        org.junit.Assert.assertNull(badge12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
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
        reservation1.setReservationId("Unverified badge detected for Cancelled.");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
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
        com.conferenceroomscheduler.model.Reservation reservation37 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext38 = new com.conferenceroomscheduler.patterns.BookingContext(reservation37);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState39 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext38.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState39);
        com.conferenceroomscheduler.patterns.BookingState bookingState41 = bookingContext38.getState();
        com.conferenceroomscheduler.model.Reservation reservation42 = bookingContext38.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation43 = bookingContext38.getReservation();
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState44 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState45 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation46 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext47 = new com.conferenceroomscheduler.patterns.BookingContext(reservation46);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState48 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext47.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState48);
        com.conferenceroomscheduler.patterns.BookingState bookingState50 = bookingContext47.getState();
        com.conferenceroomscheduler.model.Reservation reservation51 = bookingContext47.getReservation();
        cancelledBookingState45.handle(bookingContext47);
        checkedInBookingState44.handle(bookingContext47);
        bookingContext47.request();
        com.conferenceroomscheduler.patterns.BookingState bookingState55 = bookingContext47.getState();
        bookingContext38.setState(bookingState55);
        checkedInBookingState14.handle(bookingContext38);
        com.conferenceroomscheduler.patterns.BookingState bookingState58 = bookingContext38.getState();
        // The following exception was thrown during execution in test generation
        try {
            pendingBookingState0.handle(bookingContext38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.model.Reservation.getDepositAmount()\" because the return value of \"com.conferenceroomscheduler.patterns.BookingContext.getReservation()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pending" + "'", str11, "Pending");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pending" + "'", str12, "Pending");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pending" + "'", str13, "Pending");
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertNotNull(bookingState21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Checked in." + "'", str24, "Checked in.");
        org.junit.Assert.assertNull(reservation29);
        org.junit.Assert.assertNotNull(bookingState34);
        org.junit.Assert.assertNotNull(bookingState41);
        org.junit.Assert.assertNull(reservation42);
        org.junit.Assert.assertNull(reservation43);
        org.junit.Assert.assertNotNull(bookingState50);
        org.junit.Assert.assertNull(reservation51);
        org.junit.Assert.assertNotNull(bookingState55);
        org.junit.Assert.assertNotNull(bookingState58);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
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
        bookingContext51.request();
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState63 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation64 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext65 = new com.conferenceroomscheduler.patterns.BookingContext(reservation64);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState66 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext65.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState66);
        completedBookingState63.handle(bookingContext65);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState69 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation70 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext71 = new com.conferenceroomscheduler.patterns.BookingContext(reservation70);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState72 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext71.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState72);
        com.conferenceroomscheduler.patterns.BookingState bookingState74 = bookingContext71.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState75 = bookingContext71.getState();
        cancelledBookingState69.handle(bookingContext71);
        completedBookingState63.handle(bookingContext71);
        com.conferenceroomscheduler.model.Reservation reservation78 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext79 = new com.conferenceroomscheduler.patterns.BookingContext(reservation78);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState80 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext79.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState80);
        com.conferenceroomscheduler.patterns.BookingState bookingState82 = bookingContext79.getState();
        com.conferenceroomscheduler.model.Reservation reservation83 = bookingContext79.getReservation();
        completedBookingState63.handle(bookingContext79);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState85 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation86 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext87 = new com.conferenceroomscheduler.patterns.BookingContext(reservation86);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState88 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext87.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState88);
        com.conferenceroomscheduler.patterns.BookingState bookingState90 = bookingContext87.getState();
        com.conferenceroomscheduler.model.Reservation reservation91 = bookingContext87.getReservation();
        cancelledBookingState85.handle(bookingContext87);
        java.lang.String str93 = bookingContext87.getStatus();
        completedBookingState63.handle(bookingContext87);
        java.lang.String str95 = completedBookingState63.getName();
        bookingContext51.setState((com.conferenceroomscheduler.patterns.BookingState) completedBookingState63);
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
        org.junit.Assert.assertNotNull(bookingState74);
        org.junit.Assert.assertNotNull(bookingState75);
        org.junit.Assert.assertNotNull(bookingState82);
        org.junit.Assert.assertNull(reservation83);
        org.junit.Assert.assertNotNull(bookingState90);
        org.junit.Assert.assertNull(reservation91);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Cancelled" + "'", str93, "Cancelled");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "Booking complete" + "'", str95, "Booking complete");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        java.lang.String str8 = room6.getBuilding();
        java.lang.String str9 = room6.getRoomNumber();
        com.conferenceroomscheduler.model.Room room16 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str17 = room16.getRoomId();
        java.lang.String str18 = room16.getBuilding();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor22 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher23 = null;
        occupancySensor22.setSubject(checkInPublisher23);
        boolean boolean25 = occupancySensor22.isDetected;
        occupancySensor22.roomId = "Booking confirmed.";
        room16.setOccupancySensor(occupancySensor22);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor32 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean33 = occupancySensor32.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher34 = null;
        occupancySensor32.subject = checkInPublisher34;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher36 = occupancySensor32.getSubject();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher37 = occupancySensor32.getSubject();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor41 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher42 = null;
        occupancySensor41.setSubject(checkInPublisher42);
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
        occupancySensor41.setSubject(checkInPublisher57);
        occupancySensor32.setSubject(checkInPublisher57);
        occupancySensor22.subject = checkInPublisher57;
        room6.setOccupancySensor(occupancySensor22);
        boolean boolean75 = room6.isEnabled();
        room6.setBuilding("Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(checkInPublisher36);
        org.junit.Assert.assertNull(checkInPublisher37);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState0 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext2 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState3 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext2.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState3);
        com.conferenceroomscheduler.patterns.BookingState bookingState5 = bookingContext2.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState6 = bookingContext2.getState();
        cancelledBookingState0.handle(bookingContext2);
        java.lang.String str8 = bookingContext2.getStatus();
        java.lang.String str9 = bookingContext2.getStatus();
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
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
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState37 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation38 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext39 = new com.conferenceroomscheduler.patterns.BookingContext(reservation38);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState40 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext39.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState40);
        com.conferenceroomscheduler.patterns.BookingState bookingState42 = bookingContext39.getState();
        com.conferenceroomscheduler.model.Reservation reservation43 = bookingContext39.getReservation();
        cancelledBookingState37.handle(bookingContext39);
        java.lang.String str45 = cancelledBookingState37.getName();
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
        com.conferenceroomscheduler.model.Reservation reservation68 = new com.conferenceroomscheduler.model.Reservation();
        reservation68.setFinalAmount((double) (byte) 100);
        java.lang.String str71 = reservation68.getRoomId();
        reservation68.setFinalAmount((double) 10.0f);
        java.lang.String str74 = reservation68.getUserId();
        reservation68.setFinalAmount((double) ' ');
        java.lang.String str77 = reservation68.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext78 = new com.conferenceroomscheduler.patterns.BookingContext(reservation68);
        bookingContext78.request();
        java.lang.String str80 = bookingContext78.getStatus();
        checkedInBookingState46.handle(bookingContext78);
        cancelledBookingState37.handle(bookingContext78);
        java.lang.String str83 = cancelledBookingState37.getName();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext84 = null;
        cancelledBookingState37.handle(bookingContext84);
        java.lang.String str86 = cancelledBookingState37.getName();
        bookingContext18.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState37);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Cancelled" + "'", str23, "Cancelled");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Cancelled" + "'", str33, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState42);
        org.junit.Assert.assertNull(reservation43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Cancelled" + "'", str45, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState52);
        org.junit.Assert.assertNotNull(bookingState53);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Pending" + "'", str80, "Pending");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Cancelled" + "'", str83, "Cancelled");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Cancelled" + "'", str86, "Cancelled");
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
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
        occupancySensor3.setDetected(true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(checkInPublisher38);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Checked in.", "Booking complete", 10, "faculty", "Pending");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount19 = new com.conferenceroomscheduler.model.PartnerAccount("hi!", "faculty", "admin", false, false, "admin");
        room12.checkIn((com.conferenceroomscheduler.model.Account) partnerAccount19);
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Pending", "Cancelled", (int) (byte) 10, "Checked in.", "Cancelled");
        boolean boolean13 = room12.isClosedForMaintenance();
        java.lang.String str14 = room12.getRoomNumber();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cancelled" + "'", str14, "Cancelled");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("admin", "hi!", false);
        badge3.setVerified(true);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("Pending", "Booking complete", "Checked in.", "Booking confirmed.", false, true, "Pending");
        java.lang.String str8 = account7.getAccountNumber();
        account7.setUniversityAccount(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Pending" + "'", str8, "Pending");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
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
        java.lang.String str21 = cancelledBookingState0.getName();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext22 = null;
        cancelledBookingState0.handle(bookingContext22);
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Pending" + "'", str9, "Pending");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cancelled" + "'", str17, "Cancelled");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
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
        java.lang.String str58 = completedBookingState0.getName();
        java.time.LocalDateTime localDateTime63 = null;
        java.time.LocalDateTime localDateTime64 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod69 = null;
        com.conferenceroomscheduler.model.Reservation reservation70 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime63, localDateTime64, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod69);
        reservation70.setUserId("");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext73 = new com.conferenceroomscheduler.patterns.BookingContext(reservation70);
        completedBookingState0.handle(bookingContext73);
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
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Booking complete" + "'", str58, "Booking complete");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getAccountType();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand7 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation2, localDateTime5, localDateTime6);
        reservation2.setDepositAmount(32.0d);
        java.time.LocalDateTime localDateTime10 = reservation2.getStartTime();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand8 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setHourlyRate((double) 0L);
        boolean boolean11 = reservation1.isCheckedIn();
        java.time.LocalDateTime localDateTime12 = null;
        reservation1.setEndTime(localDateTime12);
        double double14 = reservation1.getDepositAmount();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        occupancySensor4.setOccupied(true);
        occupancySensor4.isDetected = true;
        occupancySensor4.isDetected = true;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("admin", "admin", "Verified badge detected for ADMIN-69.", "Pending", 35, localDateTime5, localDateTime6);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        reservation0.setTitle("Booking confirmed.");
        java.lang.String str8 = reservation0.getRoomId();
        reservation0.setCanceled(true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        java.lang.String str8 = room6.getBuilding();
        java.lang.String str9 = room6.getRoomNumber();
        int int10 = room6.getCapacity();
        boolean boolean11 = room6.isEnabled();
        room6.setRoomNumber("Checked in.");
        room6.setCapacity((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
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
        room6.setCapacity((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("", "", "hi!", true, true, "Cancelled");
        com.conferenceroomscheduler.model.Badge badge7 = partnerAccount6.getBadge();
        badge7.setEmail("");
        badge7.setAccountId("staff");
        org.junit.Assert.assertNotNull(badge7);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
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
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        com.conferenceroomscheduler.model.Reservation reservation26 = new com.conferenceroomscheduler.model.Reservation();
        reservation26.setFinalAmount((double) (byte) 100);
        java.lang.String str29 = reservation26.getRoomId();
        reservation26.setFinalAmount((double) 10.0f);
        java.lang.String str32 = reservation26.getUserId();
        reservation26.setDepositAmount((double) (byte) 0);
        double double35 = reservation26.getHourlyRate();
        reservation26.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext38 = new com.conferenceroomscheduler.patterns.BookingContext(reservation26);
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod49 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation50 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime43, localDateTime44, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod49);
        reservation26.setPaymentMethod(paymentMethod49);
        com.conferenceroomscheduler.model.Reservation reservation52 = new com.conferenceroomscheduler.model.Reservation("Booking complete", "Booking complete", "", "Booking complete", localDateTime20, localDateTime21, "Cancelled", (double) 0L, (double) (-1), (double) 0, paymentMethod49);
        reservation1.setPaymentMethod(paymentMethod49);
        java.time.LocalDateTime localDateTime54 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand55 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime54);
        reservation1.setFinalAmount(97.0d);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod49 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod49.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setCheckedIn(true);
        reservation0.setCheckedIn(false);
        reservation0.setReservationId("Booking complete");
        double double13 = reservation0.getFinalAmount();
        java.time.LocalDateTime localDateTime14 = reservation0.getEndTime();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Checked in.", "Verified badge detected for ADMIN-69.", (int) (short) 0, true, "student", "Unverified badge detected for Cancelled.");
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Checked in.", "", (int) (short) 0, false, "staff", "Booking confirmed.");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        com.conferenceroomscheduler.model.Account account0 = new com.conferenceroomscheduler.model.Account();
        account0.setPassword("Pending");
        account0.setAccountId("Booking complete");
        java.lang.String str5 = account0.getAccountNumber();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod10 = null;
        com.conferenceroomscheduler.model.Reservation reservation11 = new com.conferenceroomscheduler.model.Reservation("student", "Booking confirmed.", "", "Checked in.", localDateTime4, localDateTime5, "Booking confirmed.", (-1.0d), (double) (short) 1, (double) 1, paymentMethod10);
        boolean boolean12 = reservation11.isCanceled();
        reservation11.setCheckedIn(false);
        reservation11.setAccountType("ADMIN-69");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Checked in.", "Booking complete", (int) (byte) -1, true, "Pending", "Pending");
        room6.setName("Checked in.");
        java.lang.String str9 = room6.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Pending" + "'", str9, "Pending");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("hi!", "", "hi!", true, false, "hi!");
        adminAccount6.setPassword("hi!");
        boolean boolean9 = adminAccount6.isVerified();
        adminAccount6.setAccountNumber("student");
        boolean boolean12 = adminAccount6.isUniversityAccount();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("ADMIN-69", "Cancelled", true);
        java.lang.String str4 = badgeScan3.getRoomId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cancelled" + "'", str4, "Cancelled");
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
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
        java.lang.String str32 = badge20.getAccountId();
        java.lang.String str33 = badge20.getEmail();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking confirmed." + "'", str23, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Checked in." + "'", str32, "Checked in.");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Cancelled" + "'", str33, "Cancelled");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
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
        com.conferenceroomscheduler.model.StaffAccount staffAccount38 = new com.conferenceroomscheduler.model.StaffAccount("hi!", "Booking complete", "Booking confirmed.", false, false, "Booking complete");
        checkInPublisher0.notifyObservers((com.conferenceroomscheduler.model.Account) staffAccount38);
        staffAccount38.setPassword("hi!");
        java.lang.String str42 = staffAccount38.getAccountId();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("", "Booking confirmed.", "Unverified badge detected for admin.", true, true, "admin");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setName("hi!");
        room6.setName("");
        boolean boolean11 = room6.isClosedForMaintenance();
        room6.setEnabled(false);
        room6.setBuilding("Unverified badge detected for Cancelled.");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        com.conferenceroomscheduler.patterns.StudentFactory studentFactory0 = new com.conferenceroomscheduler.patterns.StudentFactory();
        com.conferenceroomscheduler.model.Account account8 = studentFactory0.createAccount("", "hi!", "", "", true, true, "hi!");
        com.conferenceroomscheduler.model.Account account16 = studentFactory0.createAccount("partner", "Booking confirmed.", "student", "Cancelled", false, true, "Cancelled");
        java.lang.String str17 = account16.getAccountNumber();
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cancelled" + "'", str17, "Cancelled");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        java.time.LocalDateTime localDateTime1 = null;
        reservation0.setEndTime(localDateTime1);
        reservation0.setHourlyRate((double) 'a');
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        java.time.LocalDateTime localDateTime6 = reservation0.getEndTime();
        boolean boolean7 = reservation0.isCheckedIn();
        double double8 = reservation0.getFinalAmount();
        reservation0.setFinalAmount((double) (short) 10);
        reservation0.setRoomId("partner");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        room6.setClosedForMaintenance(false);
        boolean boolean15 = room6.isClosedForMaintenance();
        room6.setCapacity((int) (short) 100);
        java.lang.String str18 = room6.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Cancelled" + "'", str18, "Cancelled");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Checked in.", "ADMIN-69", true);
        badgeScan3.setBadgeId("Cancelled");
        boolean boolean6 = badgeScan3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher9 = occupancySensor4.subject;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher10 = occupancySensor4.getSubject();
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount11 = new com.conferenceroomscheduler.model.PartnerAccount();
        java.lang.String str12 = partnerAccount11.getAccountNumber();
        java.lang.String str13 = partnerAccount11.getPassword();
        checkInPublisher10.notifyObservers((com.conferenceroomscheduler.model.Account) partnerAccount11);
        partnerAccount11.setAccountType("Unverified badge detected for admin.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(checkInPublisher9);
        org.junit.Assert.assertNotNull(checkInPublisher10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
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
        java.lang.String str74 = room6.getBuilding();
        java.lang.String str75 = room6.getBuilding();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Booking complete" + "'", str74, "Booking complete");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Booking complete" + "'", str75, "Booking complete");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor0 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor0.update("Cancelled");
        roomSensor0.update("Verified badge detected for ADMIN-69.");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setCheckedIn(true);
        java.lang.String str9 = reservation0.getAccountType();
        java.lang.String str10 = reservation0.getRoomId();
        java.time.LocalDateTime localDateTime11 = reservation0.getEndTime();
        java.lang.String str12 = reservation0.getUserId();
        boolean boolean13 = reservation0.isDepositLost();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
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
        java.lang.String str71 = room6.getBuilding();
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
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Booking complete" + "'", str71, "Booking complete");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        com.conferenceroomscheduler.patterns.StaffFactory staffFactory0 = new com.conferenceroomscheduler.patterns.StaffFactory();
        com.conferenceroomscheduler.model.Account account8 = staffFactory0.createAccount("Cancelled", "Checked in.", "", "Cancelled", true, true, "");
        java.lang.String str9 = account8.getAccountNumber();
        java.lang.String str10 = account8.getPassword();
        account8.setVerified(true);
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
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
        java.lang.String str29 = reservation0.getAccountType();
        java.lang.String str30 = reservation0.getRoomId();
        double double31 = reservation0.getDepositAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod23 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod23.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("", "Booking confirmed.", "hi!", false, true, "Checked in.");
        studentAccount6.setUniversityAccount(false);
        studentAccount6.setEmail("Checked in.");
        studentAccount6.setAccountNumber("Unverified badge detected for admin.");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("faculty", "Pending", (int) '#', "Cancelled", "Pending");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("admin", "Booking complete", (int) (byte) 1, "hi!", "Checked in.");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("", "Cancelled", (int) 'a', "partner", "admin");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
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
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher37 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor41 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher42 = null;
        occupancySensor41.setSubject(checkInPublisher42);
        occupancySensor41.occupied = true;
        occupancySensor41.setDetected(false);
        checkInPublisher37.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor41);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor52 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor52.isDetected = false;
        com.conferenceroomscheduler.model.AdminAccount adminAccount61 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "Cancelled", "Booking complete", true, false, "Cancelled");
        adminAccount61.setEmail("");
        boolean boolean64 = occupancySensor52.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount61);
        checkInPublisher37.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor52);
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory66 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account74 = facultyFactory66.createAccount("", "Cancelled", "", "hi!", false, false, "");
        account74.setAccountNumber("hi!");
        account74.setUniversityAccount(true);
        account74.setAccountType("Cancelled");
        checkInPublisher37.notifyObservers(account74);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor85 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, true);
        boolean boolean86 = occupancySensor85.isOccupied();
        checkInPublisher37.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor85);
        occupancySensor3.subject = checkInPublisher37;
        occupancySensor3.setRoomId("Verified badge detected for Checked in..");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Booking confirmed." + "'", str31, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(account74);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
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
        com.conferenceroomscheduler.model.Reservation reservation23 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext24 = new com.conferenceroomscheduler.patterns.BookingContext(reservation23);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState25 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext24.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState25);
        com.conferenceroomscheduler.patterns.BookingState bookingState27 = bookingContext24.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState28 = bookingContext24.getState();
        bookingContext24.request();
        completedBookingState0.handle(bookingContext24);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNotNull(bookingState12);
        org.junit.Assert.assertNotNull(bookingState19);
        org.junit.Assert.assertNull(reservation20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Booking complete" + "'", str22, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState27);
        org.junit.Assert.assertNotNull(bookingState28);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
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
        java.time.LocalDateTime localDateTime20 = reservation1.getStartTime();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("Booking complete", "hi!", "admin", "admin", false, true, "hi!");
        account7.setVerified(false);
        account7.setEmail("ADMIN-69");
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str1 = adminAccount0.getEmail();
        adminAccount0.setVerified(false);
        boolean boolean4 = adminAccount0.isUniversityAccount();
        com.conferenceroomscheduler.model.Badge badge5 = adminAccount0.getBadge();
        java.lang.String str6 = adminAccount0.getPassword();
        boolean boolean7 = adminAccount0.isVerified();
        java.lang.String str8 = adminAccount0.getAccountType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(badge5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "", "Booking complete", "Checked in.", (int) (byte) 1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getTitle();
        java.lang.String str9 = bookingRequest7.getRoomId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Checked in." + "'", str8, "Checked in.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.isDetected;
        com.conferenceroomscheduler.model.Badge badge10 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        boolean boolean11 = occupancySensor3.scanIdBadge(badge10);
        occupancySensor3.setRoomId("");
        boolean boolean14 = occupancySensor3.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("Unverified badge detected for Cancelled.", "partner", "partner", true, true, "student");
        facultyAccount6.setVerified(true);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        reservation0.setCanceled(false);
        java.time.LocalDateTime localDateTime8 = null;
        reservation0.setStartTime(localDateTime8);
        reservation0.setReservationId("hi!");
        java.time.LocalDateTime localDateTime12 = null;
        reservation0.setEndTime(localDateTime12);
        reservation0.setExtended(true);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService2 = null;
        com.conferenceroomscheduler.model.Reservation reservation3 = new com.conferenceroomscheduler.model.Reservation();
        reservation3.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod6 = reservation3.getPaymentMethod();
        reservation3.setDepositAmount(0.0d);
        java.lang.String str9 = reservation3.getReservationId();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand12 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService2, reservation3, localDateTime10, localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand14 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService1, reservation3, localDateTime13);
        reservation3.setTitle("Checked in.");
        boolean boolean17 = reservation3.isExtended();
        java.time.LocalDateTime localDateTime18 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand19 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation3, localDateTime18);
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        com.conferenceroomscheduler.patterns.PartnerFactory partnerFactory0 = new com.conferenceroomscheduler.patterns.PartnerFactory();
        com.conferenceroomscheduler.model.Account account8 = partnerFactory0.createAccount("Checked in.", "hi!", "admin", "", true, false, "Pending");
        account8.setAccountNumber("admin");
        org.junit.Assert.assertNotNull(account8);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
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
        com.conferenceroomscheduler.model.Reservation reservation22 = bookingContext15.getReservation();
        java.time.LocalDateTime localDateTime23 = reservation22.getEndTime();
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Pending" + "'", str9, "Pending");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cancelled" + "'", str17, "Cancelled");
        org.junit.Assert.assertNotNull(reservation21);
        org.junit.Assert.assertNotNull(reservation22);
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor27 = room6.getOccupancySensor();
        occupancySensor27.setOccupied(true);
        com.conferenceroomscheduler.model.Account account30 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = occupancySensor27.detectOccupancy(account30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.model.Account.getBadge()\" because \"account\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(occupancySensor27);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
        studentAccount32.setAccountId("Pending");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(account18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
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
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod59 = null;
        reservation56.setPaymentMethod(paymentMethod59);
        double double61 = reservation56.getDepositAmount();
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
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        room6.setName("admin");
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState13 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation14 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext15 = new com.conferenceroomscheduler.patterns.BookingContext(reservation14);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState16 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext15.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState16);
        com.conferenceroomscheduler.patterns.BookingState bookingState18 = bookingContext15.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState19 = bookingContext15.getState();
        cancelledBookingState13.handle(bookingContext15);
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState21 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str22 = pendingBookingState21.getName();
        com.conferenceroomscheduler.model.Reservation reservation23 = new com.conferenceroomscheduler.model.Reservation();
        reservation23.setFinalAmount((double) (byte) 100);
        reservation23.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext28 = new com.conferenceroomscheduler.patterns.BookingContext(reservation23);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState29 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str30 = cancelledBookingState29.getName();
        bookingContext28.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState29);
        pendingBookingState21.handle(bookingContext28);
        cancelledBookingState13.handle(bookingContext28);
        pendingBookingState0.handle(bookingContext28);
        java.lang.String str35 = pendingBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pending" + "'", str1, "Pending");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pending" + "'", str12, "Pending");
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertNotNull(bookingState19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pending" + "'", str22, "Pending");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Cancelled" + "'", str30, "Cancelled");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Pending" + "'", str35, "Pending");
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setHourlyRate((double) (byte) 100);
        double double3 = reservation0.getFinalAmount();
        boolean boolean4 = reservation0.isDepositLost();
        reservation0.setHourlyRate(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
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
        occupancySensor3.isDetected = false;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "", "faculty", false, false, "");
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
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
        java.time.LocalDateTime localDateTime15 = bookingRequest7.getEndTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(localDateTime15);
    }
}

