package testRandoop.java;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor31 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount38 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean39 = occupancySensor31.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount38);
        java.lang.String str40 = occupancySensor31.roomId;
        boolean boolean41 = occupancySensor31.isDetected;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor45 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount52 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean53 = occupancySensor45.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount52);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher54 = null;
        occupancySensor45.setSubject(checkInPublisher54);
        occupancySensor45.isDetected = false;
        boolean boolean58 = occupancySensor45.isOccupied();
        com.conferenceroomscheduler.model.Badge badge62 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str63 = badge62.getEmail();
        boolean boolean64 = occupancySensor45.scanIdBadge(badge62);
        java.lang.String str65 = badge62.getAccountId();
        badge62.setAccountId("Cancelled");
        badge62.setAccountId("");
        badge62.setAccountId("");
        badge62.setAccountId("Checked in.");
        boolean boolean74 = occupancySensor31.scanIdBadge(badge62);
        boolean boolean75 = occupancySensor3.scanIdBadge(badge62);
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory76 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account84 = facultyFactory76.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account92 = facultyFactory76.createAccount("", "hi!", "", "", false, true, "");
        account92.setAccountNumber("Checked in.");
        boolean boolean95 = occupancySensor3.detectOccupancy(account92);
        account92.setUniversityAccount(true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Pending" + "'", str40, "Pending");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Cancelled" + "'", str63, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Booking confirmed." + "'", str65, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(account84);
        org.junit.Assert.assertNotNull(account92);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("faculty", "Booking confirmed.", "", true, true, "partner");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("faculty", "partner", 0, "ADMIN-69", "");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("faculty", "Verified badge detected for ADMIN-69.", (int) '#', "Pending", "staff");
        room12.setBuilding("Checked in.");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod30 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation31 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime24, localDateTime25, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod30);
        com.conferenceroomscheduler.model.Reservation reservation32 = new com.conferenceroomscheduler.model.Reservation("admin", "", "Booking complete", "Pending", localDateTime14, localDateTime15, "", (double) 'a', (double) 10L, 0.0d, paymentMethod30);
        com.conferenceroomscheduler.model.Reservation reservation33 = new com.conferenceroomscheduler.model.Reservation("student", "Unverified badge detected for Cancelled.", "Pending", "Unverified badge detected for Cancelled.", localDateTime4, localDateTime5, "ADMIN-69", (double) (-1), (double) 10L, (double) 100L, paymentMethod30);
        boolean boolean34 = reservation33.isCheckedIn();
        org.junit.Assert.assertTrue("'" + paymentMethod30 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod30.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod1 = reservation0.getPaymentMethod();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod2 = reservation0.getPaymentMethod();
        reservation0.setHourlyRate((double) 1.0f);
        org.junit.Assert.assertNull(paymentMethod1);
        org.junit.Assert.assertNull(paymentMethod2);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        room6.setClosedForMaintenance(false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor15 = room6.getOccupancySensor();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher16 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
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
        boolean boolean44 = occupancySensor20.isDetected;
        checkInPublisher16.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor20);
        com.conferenceroomscheduler.model.AdminAccount adminAccount46 = new com.conferenceroomscheduler.model.AdminAccount();
        checkInPublisher16.notifyObservers((com.conferenceroomscheduler.model.Account) adminAccount46);
        boolean boolean48 = adminAccount46.isUniversityAccount();
        // The following exception was thrown during execution in test generation
        try {
            room6.checkIn((com.conferenceroomscheduler.model.Account) adminAccount46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.model.OccupancySensor.setOccupied(boolean)\" because \"this.occupancySensor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(occupancySensor15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setReservationId("hi!");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        reservation0.setExtended(true);
        java.lang.String str12 = reservation0.getTitle();
        boolean boolean13 = reservation0.isCheckedIn();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str1 = adminAccount0.getEmail();
        com.conferenceroomscheduler.model.Badge badge2 = adminAccount0.getBadge();
        java.lang.String str3 = adminAccount0.getPassword();
        adminAccount0.setIdentifier("Pending");
        adminAccount0.setIdentifier("Checked in.");
        adminAccount0.setVerified(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(badge2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("Cancelled", "Cancelled", "Booking confirmed.", "hi!", false, false, "");
        java.lang.String str8 = account7.getAccountNumber();
        account7.setIdentifier("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Booking complete", "ADMIN-69", (int) (short) 10, false, "", "faculty");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService2 = null;
        com.conferenceroomscheduler.model.Reservation reservation3 = new com.conferenceroomscheduler.model.Reservation();
        reservation3.setHourlyRate((double) (byte) 100);
        boolean boolean6 = reservation3.isDepositLost();
        java.lang.String str7 = reservation3.getUserId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand8 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService2, reservation3);
        java.time.LocalDateTime localDateTime9 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand10 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService1, reservation3, localDateTime9);
        java.lang.String str11 = reservation3.getRoomId();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand12 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        studentAccount6.setUniversityAccount(false);
        java.lang.String str9 = studentAccount6.getEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
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
        occupancySensor3.isDetected = true;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor40 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount47 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean48 = occupancySensor40.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount47);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher49 = null;
        occupancySensor40.setSubject(checkInPublisher49);
        occupancySensor40.isDetected = false;
        boolean boolean53 = occupancySensor40.isOccupied();
        com.conferenceroomscheduler.model.Badge badge57 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str58 = badge57.getEmail();
        boolean boolean59 = occupancySensor40.scanIdBadge(badge57);
        java.lang.String str60 = badge57.getAccountId();
        badge57.setAccountId("Cancelled");
        java.lang.String str63 = badge57.getEmail();
        java.lang.String str64 = badge57.getAccountId();
        boolean boolean65 = occupancySensor3.scanIdBadge(badge57);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Booking confirmed." + "'", str31, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Cancelled" + "'", str58, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Booking confirmed." + "'", str60, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Cancelled" + "'", str63, "Cancelled");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Cancelled" + "'", str64, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy institutionalBillingPaymentStrategy0 = new com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy();
        boolean boolean3 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", 0.0d);
        boolean boolean6 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", (double) (short) 1);
        boolean boolean9 = institutionalBillingPaymentStrategy0.processPayment("Cancelled", 32.0d);
        boolean boolean12 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", (double) (byte) -1);
        boolean boolean15 = institutionalBillingPaymentStrategy0.processPayment("student", (double) 10L);
        boolean boolean18 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", (double) (short) 10);
        boolean boolean21 = institutionalBillingPaymentStrategy0.processPayment("ADMIN-69", 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Cancelled", "faculty", "", true, false, "Unverified badge detected for admin.");
        java.lang.String str7 = partnerAccount6.getAccountId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cancelled" + "'", str7, "Cancelled");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
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
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState41 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation42 = new com.conferenceroomscheduler.model.Reservation();
        reservation42.setFinalAmount((double) (byte) 100);
        reservation42.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext47 = new com.conferenceroomscheduler.patterns.BookingContext(reservation42);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState48 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str49 = cancelledBookingState48.getName();
        bookingContext47.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState48);
        completedBookingState41.handle(bookingContext47);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState52 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState53 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation54 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext55 = new com.conferenceroomscheduler.patterns.BookingContext(reservation54);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState56 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext55.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState56);
        com.conferenceroomscheduler.patterns.BookingState bookingState58 = bookingContext55.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState59 = bookingContext55.getState();
        cancelledBookingState53.handle(bookingContext55);
        checkedInBookingState52.handle(bookingContext55);
        com.conferenceroomscheduler.model.Reservation reservation62 = new com.conferenceroomscheduler.model.Reservation();
        reservation62.setFinalAmount((double) (byte) 100);
        reservation62.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext67 = new com.conferenceroomscheduler.patterns.BookingContext(reservation62);
        checkedInBookingState52.handle(bookingContext67);
        java.lang.String str69 = checkedInBookingState52.getName();
        com.conferenceroomscheduler.model.Reservation reservation70 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext71 = new com.conferenceroomscheduler.patterns.BookingContext(reservation70);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState72 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext71.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState72);
        com.conferenceroomscheduler.model.Reservation reservation74 = bookingContext71.getReservation();
        checkedInBookingState52.handle(bookingContext71);
        completedBookingState41.handle(bookingContext71);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState77 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState78 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation79 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext80 = new com.conferenceroomscheduler.patterns.BookingContext(reservation79);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState81 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext80.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState81);
        com.conferenceroomscheduler.patterns.BookingState bookingState83 = bookingContext80.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState84 = bookingContext80.getState();
        cancelledBookingState78.handle(bookingContext80);
        checkedInBookingState77.handle(bookingContext80);
        com.conferenceroomscheduler.model.Reservation reservation87 = new com.conferenceroomscheduler.model.Reservation();
        reservation87.setFinalAmount((double) (byte) 100);
        reservation87.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext92 = new com.conferenceroomscheduler.patterns.BookingContext(reservation87);
        checkedInBookingState77.handle(bookingContext92);
        completedBookingState41.handle(bookingContext92);
        confirmedBookingState7.handle(bookingContext92);
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
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Cancelled" + "'", str49, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState58);
        org.junit.Assert.assertNotNull(bookingState59);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Checked in." + "'", str69, "Checked in.");
        org.junit.Assert.assertNull(reservation74);
        org.junit.Assert.assertNotNull(bookingState83);
        org.junit.Assert.assertNotNull(bookingState84);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor4.setSubject(checkInPublisher5);
        occupancySensor4.occupied = true;
        occupancySensor4.setDetected(false);
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        occupancySensor4.roomId = "hi!";
        occupancySensor4.occupied = true;
        boolean boolean16 = occupancySensor4.isOccupied();
        occupancySensor4.roomId = "Verified badge detected for Checked in..";
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
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
        java.lang.String str78 = occupancySensor3.getRoomId();
        org.junit.Assert.assertNotNull(account12);
        org.junit.Assert.assertNotNull(account20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(account62);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Pending" + "'", str78, "Pending");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        java.lang.String str6 = occupancySensor3.getRoomId();
        boolean boolean7 = occupancySensor3.isOccupied();
        occupancySensor3.setRoomId("Booking confirmed.");
        boolean boolean10 = occupancySensor3.isDetected;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
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
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState14 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation15 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext16 = new com.conferenceroomscheduler.patterns.BookingContext(reservation15);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState17 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext16.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState17);
        com.conferenceroomscheduler.patterns.BookingState bookingState19 = bookingContext16.getState();
        com.conferenceroomscheduler.model.Reservation reservation20 = bookingContext16.getReservation();
        cancelledBookingState14.handle(bookingContext16);
        java.lang.String str22 = cancelledBookingState14.getName();
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
        cancelledBookingState14.handle(bookingContext55);
        com.conferenceroomscheduler.patterns.BookingState bookingState60 = bookingContext55.getState();
        confirmedBookingState11.handle(bookingContext55);
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState62 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str63 = confirmedBookingState62.getName();
        java.lang.String str64 = confirmedBookingState62.getName();
        com.conferenceroomscheduler.model.Reservation reservation65 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext66 = new com.conferenceroomscheduler.patterns.BookingContext(reservation65);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState67 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext66.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState67);
        com.conferenceroomscheduler.model.Reservation reservation69 = bookingContext66.getReservation();
        confirmedBookingState62.handle(bookingContext66);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState71 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState72 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation73 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext74 = new com.conferenceroomscheduler.patterns.BookingContext(reservation73);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState75 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext74.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState75);
        com.conferenceroomscheduler.patterns.BookingState bookingState77 = bookingContext74.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState78 = bookingContext74.getState();
        cancelledBookingState72.handle(bookingContext74);
        checkedInBookingState71.handle(bookingContext74);
        com.conferenceroomscheduler.model.Reservation reservation81 = new com.conferenceroomscheduler.model.Reservation();
        reservation81.setFinalAmount((double) (byte) 100);
        reservation81.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext86 = new com.conferenceroomscheduler.patterns.BookingContext(reservation81);
        checkedInBookingState71.handle(bookingContext86);
        com.conferenceroomscheduler.model.Reservation reservation88 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext89 = new com.conferenceroomscheduler.patterns.BookingContext(reservation88);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState90 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext89.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState90);
        checkedInBookingState71.handle(bookingContext89);
        confirmedBookingState62.handle(bookingContext89);
        confirmedBookingState11.handle(bookingContext89);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cancelled" + "'", str7, "Cancelled");
        org.junit.Assert.assertNotNull(reservation9);
        org.junit.Assert.assertNotNull(reservation10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking confirmed." + "'", str12, "Booking confirmed.");
        org.junit.Assert.assertNotNull(bookingState19);
        org.junit.Assert.assertNull(reservation20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cancelled" + "'", str22, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState29);
        org.junit.Assert.assertNotNull(bookingState30);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Pending" + "'", str57, "Pending");
        org.junit.Assert.assertNotNull(bookingState60);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Booking confirmed." + "'", str63, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Booking confirmed." + "'", str64, "Booking confirmed.");
        org.junit.Assert.assertNull(reservation69);
        org.junit.Assert.assertNotNull(bookingState77);
        org.junit.Assert.assertNotNull(bookingState78);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("Pending", "Unverified badge detected for .", "Booking confirmed.", true, false, "");
        com.conferenceroomscheduler.model.Badge badge7 = staffAccount6.getBadge();
        java.lang.String str8 = badge7.getEmail();
        org.junit.Assert.assertNotNull(badge7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Unverified badge detected for ." + "'", str8, "Unverified badge detected for .");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("hi!", "staff", "ADMIN-69", "Booking complete", true, true, "partner");
        account7.setPassword("Unverified badge detected for .");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Booking confirmed.", "hi!", "Pending", false, true, "Checked in.");
        java.lang.String str7 = partnerAccount6.getAccountNumber();
        partnerAccount6.setAccountNumber("student");
        com.conferenceroomscheduler.model.Badge badge10 = partnerAccount6.getBadge();
        java.lang.String str11 = partnerAccount6.getAccountId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Checked in." + "'", str7, "Checked in.");
        org.junit.Assert.assertNotNull(badge10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking confirmed." + "'", str11, "Booking confirmed.");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        occupancySensor4.setOccupied(true);
        occupancySensor4.occupied = false;
        occupancySensor4.isDetected = true;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher15 = occupancySensor4.getSubject();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(checkInPublisher15);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
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
        boolean boolean18 = reservation1.isCheckedIn();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor30 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount37 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean38 = occupancySensor30.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount37);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher39 = null;
        occupancySensor30.setSubject(checkInPublisher39);
        occupancySensor30.isDetected = false;
        occupancySensor30.setDetected(true);
        occupancySensor30.setOccupied(false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher47 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor51 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor55 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean56 = occupancySensor55.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher57 = null;
        occupancySensor55.subject = checkInPublisher57;
        occupancySensor55.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher61 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor65 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher66 = null;
        occupancySensor65.setSubject(checkInPublisher66);
        occupancySensor65.occupied = true;
        occupancySensor65.setDetected(false);
        checkInPublisher61.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor65);
        occupancySensor55.setSubject(checkInPublisher61);
        occupancySensor51.setSubject(checkInPublisher61);
        boolean boolean75 = occupancySensor51.isDetected;
        checkInPublisher47.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor51);
        com.conferenceroomscheduler.model.AdminAccount adminAccount77 = new com.conferenceroomscheduler.model.AdminAccount();
        checkInPublisher47.notifyObservers((com.conferenceroomscheduler.model.Account) adminAccount77);
        occupancySensor30.setSubject(checkInPublisher47);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher80 = occupancySensor30.getSubject();
        occupancySensor3.subject = checkInPublisher80;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(checkInPublisher80);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        java.time.LocalDateTime localDateTime1 = null;
        reservation0.setEndTime(localDateTime1);
        reservation0.setHourlyRate((double) 'a');
        boolean boolean5 = reservation0.isCheckedIn();
        reservation0.setReservationId("Pending");
        boolean boolean8 = reservation0.isCheckedIn();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
        badge34.setEmail("hi!");
        java.lang.String str51 = badge34.getAccountId();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pending" + "'", str12, "Pending");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Cancelled" + "'", str35, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Booking confirmed." + "'", str37, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Checked in." + "'", str51, "Checked in.");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
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
        double double14 = reservation0.getHourlyRate();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
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
        double double17 = reservation0.getDepositAmount();
        double double18 = reservation0.getDepositAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        room6.setClosedForMaintenance(false);
        room6.setCapacity(100);
        room6.setRoomId("hi!");
        room6.setCapacity((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Unverified badge detected for admin.", "Verified badge detected for Checked in..", (int) (short) -1, true, "Verified badge detected for Checked in..", "partner");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("Verified badge detected for Checked in..", "Booking confirmed.", "", "faculty", true, false, "partner");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
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
        occupancySensor20.roomId = "faculty";
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher84 = occupancySensor20.getSubject();
        boolean boolean85 = occupancySensor20.isDetected();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(checkInPublisher79);
        org.junit.Assert.assertNotNull(checkInPublisher84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        occupancySensor3.occupied = true;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher8 = occupancySensor3.subject;
        boolean boolean9 = occupancySensor3.isDetected;
        occupancySensor3.setRoomId("Booking confirmed.");
        occupancySensor3.roomId = "Unverified badge detected for Cancelled.";
        org.junit.Assert.assertNull(checkInPublisher8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("student", true, true);
        com.conferenceroomscheduler.model.AdminAccount adminAccount4 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str5 = adminAccount4.getAccountId();
        adminAccount4.setIdentifier("hi!");
        java.lang.String str8 = adminAccount4.getAccountNumber();
        java.lang.String str9 = adminAccount4.getPassword();
        boolean boolean10 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount4);
        occupancySensor3.roomId = "hi!";
        boolean boolean13 = occupancySensor3.isDetected();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
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
        badge20.setEmail("Unverified badge detected for Cancelled.");
        java.lang.String str26 = badge20.getEmail();
        java.lang.String str27 = badge20.getEmail();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Cancelled" + "'", str23, "Cancelled");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Unverified badge detected for Cancelled." + "'", str26, "Unverified badge detected for Cancelled.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Unverified badge detected for Cancelled." + "'", str27, "Unverified badge detected for Cancelled.");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getName();
        room6.setRoomId("admin");
        java.lang.String str15 = room6.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cancelled" + "'", str12, "Cancelled");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cancelled" + "'", str15, "Cancelled");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        java.lang.String str4 = reservation1.getUserId();
        boolean boolean5 = reservation1.isDepositLost();
        reservation1.setCheckedIn(false);
        reservation1.setAccountType("Pending");
        java.time.LocalDateTime localDateTime10 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand11 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime10);
        reservation1.setAccountType("ADMIN-69");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
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
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher38 = occupancySensor3.subject;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(checkInPublisher38);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
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
        reservation2.setDepositLost(true);
        java.lang.String str20 = reservation2.getReservationId();
        reservation2.setFinalAmount((double) 1);
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand23 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation2);
        // The following exception was thrown during execution in test generation
        try {
            createBookingCommand23.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.addReservation(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Booking complete" + "'", str20, "Booking complete");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
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
        occupancySensor3.isDetected = false;
        boolean boolean27 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.model.AdminAccount adminAccount28 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str29 = adminAccount28.getAccountId();
        adminAccount28.setIdentifier("hi!");
        boolean boolean32 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount28);
        adminAccount28.setVerified(false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pending" + "'", str23, "Pending");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str1 = adminAccount0.getEmail();
        com.conferenceroomscheduler.model.Badge badge2 = adminAccount0.getBadge();
        com.conferenceroomscheduler.model.Badge badge3 = adminAccount0.getBadge();
        java.lang.String str4 = adminAccount0.getAccountId();
        adminAccount0.setIdentifier("Booking confirmed.");
        boolean boolean7 = adminAccount0.isVerified();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(badge2);
        org.junit.Assert.assertNull(badge3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("partner", "student", "staff", false, true, "");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor4.setSubject(checkInPublisher5);
        occupancySensor4.occupied = true;
        occupancySensor4.setDetected(false);
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        occupancySensor4.setRoomId("Booking confirmed.");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher14 = occupancySensor4.subject;
        com.conferenceroomscheduler.model.AdminAccount adminAccount15 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount15.setUniversityAccount(false);
        // The following exception was thrown during execution in test generation
        try {
            checkInPublisher14.notifyObservers((com.conferenceroomscheduler.model.Account) adminAccount15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.model.Badge.getEmail()\" because \"badge\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(checkInPublisher14);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
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
        boolean boolean17 = cancelBookingCommand15.wasSuccessful();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
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
        java.lang.Class<?> wildcardClass19 = reservation1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setName("hi!");
        room6.setName("");
        room6.setRoomNumber("");
        room6.setRoomId("ADMIN-69");
        org.junit.Assert.assertNotNull(room6);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
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
        reservation1.setStartTime(localDateTime14);
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
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
        com.conferenceroomscheduler.patterns.StaffFactory staffFactory74 = new com.conferenceroomscheduler.patterns.StaffFactory();
        com.conferenceroomscheduler.model.Account account82 = staffFactory74.createAccount("Cancelled", "Checked in.", "", "Cancelled", true, true, "");
        account82.setPassword("Verified badge detected for Checked in..");
        checkInPublisher58.notifyObservers(account82);
        java.lang.String str86 = account82.getPassword();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(account82);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Verified badge detected for Checked in.." + "'", str86, "Verified badge detected for Checked in..");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
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
        reservation1.setCanceled(false);
        java.lang.String str17 = reservation1.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand18 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor27 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher28 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        occupancySensor27.setSubject(checkInPublisher28);
        room6.setOccupancySensor(occupancySensor27);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Checked in.", "Pending", true);
        badge3.setAccountId("admin");
        java.lang.String str6 = badge3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Checked in." + "'", str6, "Checked in.");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getOrganizerId();
        java.lang.String str10 = bookingRequest7.getOrganizerId();
        java.lang.String str11 = bookingRequest7.getOrganizerId();
        java.lang.String str12 = bookingRequest7.getRequestId();
        int int13 = bookingRequest7.getAttendeeCount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
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
        java.lang.String str42 = occupancySensor3.roomId;
        boolean boolean43 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.model.Account account44 = null;
        boolean boolean45 = occupancySensor3.detectOccupancy(account44);
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Pending" + "'", str42, "Pending");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
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
        occupancySensor20.roomId = "faculty";
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher84 = occupancySensor20.getSubject();
        java.lang.String str85 = occupancySensor20.getRoomId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(checkInPublisher79);
        org.junit.Assert.assertNotNull(checkInPublisher84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "faculty" + "'", str85, "faculty");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
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
        boolean boolean22 = editBookingCommand21.wasSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            editBookingCommand21.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.editBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy institutionalBillingPaymentStrategy0 = new com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy();
        boolean boolean3 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", 0.0d);
        boolean boolean6 = institutionalBillingPaymentStrategy0.processPayment("Booking confirmed.", (double) '#');
        boolean boolean9 = institutionalBillingPaymentStrategy0.processPayment("admin", (double) (short) -1);
        boolean boolean12 = institutionalBillingPaymentStrategy0.processPayment("Booking confirmed.", (double) (short) 0);
        boolean boolean15 = institutionalBillingPaymentStrategy0.processPayment("partner", (double) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
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
        java.lang.String str29 = badge20.getAccountId();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Booking confirmed.", "Verified badge detected for Checked in..", false);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState0 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str1 = confirmedBookingState0.getName();
        java.lang.String str2 = confirmedBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation3 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext4 = new com.conferenceroomscheduler.patterns.BookingContext(reservation3);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState5 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext4.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState5);
        com.conferenceroomscheduler.model.Reservation reservation7 = bookingContext4.getReservation();
        confirmedBookingState0.handle(bookingContext4);
        java.lang.String str9 = confirmedBookingState0.getName();
        java.lang.String str10 = confirmedBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking confirmed." + "'", str1, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking confirmed." + "'", str2, "Booking confirmed.");
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking confirmed." + "'", str9, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking confirmed." + "'", str10, "Booking confirmed.");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory0 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account8 = facultyFactory0.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account16 = facultyFactory0.createAccount("", "hi!", "", "", false, true, "");
        com.conferenceroomscheduler.model.Account account24 = facultyFactory0.createAccount("Cancelled", "Pending", "Cancelled", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account32 = facultyFactory0.createAccount("", "hi!", "", "Pending", true, false, "Cancelled");
        java.lang.String str33 = account32.getAccountNumber();
        boolean boolean34 = account32.isVerified();
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
        org.junit.Assert.assertNotNull(account32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Cancelled" + "'", str33, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getReservationId();
        java.lang.String str4 = reservation1.getTitle();
        boolean boolean5 = reservation1.isExtended();
        reservation1.setFinalAmount(1.0d);
        reservation1.setDepositLost(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Unverified badge detected for Cancelled.", "Booking confirmed.", true);
        badge3.setAccountId("Booking confirmed.");
        boolean boolean6 = badge3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Unverified badge detected for admin.", "faculty", (int) (byte) 100, false, "staff", "admin");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor28 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor28.isDetected = false;
        java.lang.String str31 = occupancySensor28.getRoomId();
        boolean boolean32 = occupancySensor28.isDetected();
        room6.setOccupancySensor(occupancySensor28);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cancelled" + "'", str22, "Cancelled");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(occupancySensor24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Pending" + "'", str31, "Pending");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
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
        bookingContext10.request();
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNull(reservation13);
        org.junit.Assert.assertNotNull(bookingState18);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("Cancelled", "", "Checked in.", true, false, "Checked in.");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("admin", "faculty", false);
        boolean boolean4 = badgeScan3.isVerified();
        java.lang.String str5 = badgeScan3.getBadgeId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Unverified badge detected for .", "admin", 52, true, "Cancelled", "");
        java.lang.String str7 = room6.getRoomId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Unverified badge detected for ." + "'", str7, "Unverified badge detected for .");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        int int8 = bookingRequest7.getAttendeeCount();
        java.time.LocalDateTime localDateTime9 = bookingRequest7.getEndTime();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.lang.String str11 = bookingRequest7.getTitle();
        java.time.LocalDateTime localDateTime12 = bookingRequest7.getStartTime();
        java.lang.String str13 = bookingRequest7.getTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        java.lang.String str4 = reservation1.getAccountType();
        boolean boolean5 = reservation1.isCheckedIn();
        java.time.LocalDateTime localDateTime6 = reservation1.getStartTime();
        reservation1.setTitle("Unverified badge detected for Cancelled.");
        reservation1.setUserId("student");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(localDateTime6);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
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
        java.lang.String str15 = confirmedBookingState10.getName();
        java.lang.String str16 = confirmedBookingState10.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cancelled" + "'", str7, "Cancelled");
        org.junit.Assert.assertNotNull(reservation9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking confirmed." + "'", str11, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking confirmed." + "'", str12, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking confirmed." + "'", str13, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking confirmed." + "'", str15, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking confirmed." + "'", str16, "Booking confirmed.");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Pending", "Cancelled", (int) (short) 0, false, "", "Checked in.");
        room6.setName("faculty");
        room6.setRoomNumber("Unverified badge detected for .");
        boolean boolean11 = room6.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("admin", "Cancelled", (int) '#', true, "", "");
        room6.setRoomNumber("student");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor12 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor12.isDetected = false;
        java.lang.String str15 = occupancySensor12.getRoomId();
        occupancySensor12.isDetected = false;
        occupancySensor12.setDetected(false);
        room6.setOccupancySensor(occupancySensor12);
        room6.setName("Booking complete");
        room6.setBuilding("Unverified badge detected for .");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Pending" + "'", str15, "Pending");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "partner", false);
        badgeScan3.setRoomId("Cancelled");
        badgeScan3.setVerified(true);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState14 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        java.lang.String str15 = checkedInBookingState14.getName();
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService16 = null;
        com.conferenceroomscheduler.model.Reservation reservation17 = new com.conferenceroomscheduler.model.Reservation();
        reservation17.setFinalAmount((double) (byte) 100);
        java.lang.String str20 = reservation17.getRoomId();
        reservation17.setFinalAmount((double) 10.0f);
        java.lang.String str23 = reservation17.getUserId();
        reservation17.setDepositAmount((double) (byte) 0);
        java.lang.String str26 = reservation17.getAccountType();
        reservation17.setHourlyRate((double) '#');
        reservation17.setFinalAmount((double) 1.0f);
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand33 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService16, reservation17, localDateTime31, localDateTime32);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext34 = new com.conferenceroomscheduler.patterns.BookingContext(reservation17);
        checkedInBookingState14.handle(bookingContext34);
        completedBookingState0.handle(bookingContext34);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking complete" + "'", str11, "Booking complete");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking complete" + "'", str12, "Booking complete");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking complete" + "'", str13, "Booking complete");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Checked in." + "'", str15, "Checked in.");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
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
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState21 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState22 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation23 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext24 = new com.conferenceroomscheduler.patterns.BookingContext(reservation23);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState25 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext24.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState25);
        com.conferenceroomscheduler.patterns.BookingState bookingState27 = bookingContext24.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState28 = bookingContext24.getState();
        cancelledBookingState22.handle(bookingContext24);
        checkedInBookingState21.handle(bookingContext24);
        java.lang.String str31 = checkedInBookingState21.getName();
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
        checkedInBookingState21.handle(bookingContext50);
        bookingContext50.request();
        cancelledBookingState0.handle(bookingContext50);
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Pending" + "'", str9, "Pending");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cancelled" + "'", str17, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState27);
        org.junit.Assert.assertNotNull(bookingState28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Checked in." + "'", str31, "Checked in.");
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertNotNull(bookingState39);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getRoomId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.time.LocalDateTime localDateTime11 = bookingRequest7.getEndTime();
        java.lang.String str12 = bookingRequest7.getTitle();
        java.lang.String str13 = bookingRequest7.getRoomId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        boolean boolean13 = room6.isEnabled();
        int int14 = room6.getCapacity();
        java.lang.String str15 = room6.getRoomId();
        java.lang.String str16 = room6.getRoomId();
        java.lang.String str17 = room6.getBuilding();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Booking complete", "Cancelled", (int) (short) 1, "Booking complete", "");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("ADMIN-69", "Pending", 10, "hi!", "");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("", "Booking confirmed.", (-1), "student", "admin");
        com.conferenceroomscheduler.model.Room room30 = roomFactory0.createRoom("partner", "hi!", (int) '4', "student", "Pending");
        room30.setEnabled(true);
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
        org.junit.Assert.assertNotNull(room30);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
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
        boolean boolean75 = occupancySensor59.isOccupied();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher76 = occupancySensor59.subject;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(checkInPublisher74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(checkInPublisher76);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getOrganizerId();
        java.lang.String str10 = bookingRequest7.getOrganizerId();
        java.lang.String str11 = bookingRequest7.getOrganizerId();
        java.lang.String str12 = bookingRequest7.getRoomId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cancelled" + "'", str12, "Cancelled");
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        java.lang.String str4 = reservation1.getUserId();
        boolean boolean5 = reservation1.isDepositLost();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand8 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime6, localDateTime7);
        java.lang.String str9 = reservation1.getUserId();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext10 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setEnabled(false);
        java.lang.String str9 = room6.getBuilding();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
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
        room6.setCapacity((-1));
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Booking confirmed.", "staff", true);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("Unverified badge detected for admin.", "Unverified badge detected for .", "Unverified badge detected for .", true, false, "Unverified badge detected for Cancelled.");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        java.lang.String str2 = reservation1.getTitle();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str4 = reservation1.getTitle();
        java.lang.String str5 = reservation1.getUserId();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
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
        occupancySensor3.subject = checkInPublisher47;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor72 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean73 = occupancySensor72.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher74 = null;
        occupancySensor72.subject = checkInPublisher74;
        occupancySensor72.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher78 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor82 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher83 = null;
        occupancySensor82.setSubject(checkInPublisher83);
        occupancySensor82.occupied = true;
        occupancySensor82.setDetected(false);
        checkInPublisher78.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor82);
        occupancySensor72.setSubject(checkInPublisher78);
        com.conferenceroomscheduler.model.StudentAccount studentAccount97 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        checkInPublisher78.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount97);
        occupancySensor3.subject = checkInPublisher78;
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(badge67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setFinalAmount((double) ' ');
        double double9 = reservation0.getHourlyRate();
        reservation0.setCanceled(true);
        boolean boolean12 = reservation0.isExtended();
        java.time.LocalDateTime localDateTime13 = reservation0.getEndTime();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
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
        java.lang.String str49 = occupancySensor3.roomId;
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Checked in." + "'", str49, "Checked in.");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
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
        java.lang.String str28 = occupancySensor27.getRoomId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking complete" + "'", str23, "Booking complete");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Booking complete" + "'", str26, "Booking complete");
        org.junit.Assert.assertNotNull(occupancySensor27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
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
        com.conferenceroomscheduler.model.StudentAccount studentAccount25 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        com.conferenceroomscheduler.model.Badge badge26 = studentAccount25.getBadge();
        badge26.setEmail("Pending");
        badge26.setEmail("Booking confirmed.");
        boolean boolean31 = occupancySensor3.scanIdBadge(badge26);
        occupancySensor3.occupied = true;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(checkInPublisher7);
        org.junit.Assert.assertNull(checkInPublisher8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(badge26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setCheckedIn(true);
        reservation0.setCheckedIn(false);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = reservation0.getPaymentMethod();
        reservation0.setTitle("");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod14 = reservation0.getPaymentMethod();
        double double15 = reservation0.getDepositAmount();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(paymentMethod11);
        org.junit.Assert.assertNull(paymentMethod14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
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
        boolean boolean51 = occupancySensor48.isOccupied();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher52 = occupancySensor48.subject;
        java.lang.String str53 = occupancySensor48.getLastEvent();
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(account37);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(checkInPublisher52);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getReservationId();
        java.lang.String str5 = reservation2.getRoomId();
        reservation2.setCanceled(true);
        reservation2.setCanceled(false);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand12 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation2, localDateTime10, localDateTime11);
        reservation2.setAccountType("partner");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
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
        adminAccount11.setAccountType("Booking complete");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(checkInPublisher7);
        org.junit.Assert.assertNull(checkInPublisher8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean4 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor3.subject = checkInPublisher5;
        occupancySensor3.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher9 = occupancySensor3.subject;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(checkInPublisher9);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        double double7 = reservation0.getFinalAmount();
        reservation0.setReservationId("Pending");
        java.time.LocalDateTime localDateTime10 = null;
        reservation0.setStartTime(localDateTime10);
        reservation0.setCanceled(true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        java.lang.String str3 = reservation0.getUserId();
        boolean boolean4 = reservation0.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation0.getPaymentMethod();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext8 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        reservation0.setAccountType("Cancelled");
        java.time.LocalDateTime localDateTime11 = reservation0.getEndTime();
        java.lang.String str12 = reservation0.getUserId();
        java.time.LocalDateTime localDateTime13 = null;
        reservation0.setEndTime(localDateTime13);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
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
        boolean boolean79 = occupancySensor3.isDetected();
        boolean boolean80 = occupancySensor3.isOccupied();
        boolean boolean81 = occupancySensor3.isDetected;
        org.junit.Assert.assertNull(checkInPublisher4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(badge72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor3.isDetected = false;
        occupancySensor3.roomId = "hi!";
        occupancySensor3.isDetected = false;
        boolean boolean10 = occupancySensor3.isDetected;
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
        occupancySensor3.subject = checkInPublisher38;
        occupancySensor3.setOccupied(false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(checkInPublisher38);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        java.lang.String str4 = reservation1.getAccountType();
        java.time.LocalDateTime localDateTime5 = null;
        reservation1.setStartTime(localDateTime5);
        java.time.LocalDateTime localDateTime7 = reservation1.getEndTime();
        double double8 = reservation1.getHourlyRate();
        reservation1.setCanceled(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Cancelled", "hi!", "hi!", "", (int) (short) 1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRoomId();
        java.lang.String str9 = bookingRequest7.getRequestId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getStartTime();
        java.lang.String str11 = bookingRequest7.getTitle();
        java.time.LocalDateTime localDateTime12 = bookingRequest7.getEndTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.model.Reservation reservation10 = new com.conferenceroomscheduler.model.Reservation();
        reservation10.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod13 = reservation10.getPaymentMethod();
        reservation10.setFinalAmount((double) (byte) 1);
        java.lang.String str16 = reservation10.getRoomId();
        reservation10.setCheckedIn(true);
        reservation10.setCheckedIn(false);
        reservation10.setReservationId("Booking complete");
        double double23 = reservation10.getHourlyRate();
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime59 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod64 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation65 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime58, localDateTime59, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod64);
        com.conferenceroomscheduler.model.Reservation reservation66 = new com.conferenceroomscheduler.model.Reservation("admin", "", "Booking complete", "Pending", localDateTime48, localDateTime49, "", (double) 'a', (double) 10L, 0.0d, paymentMethod64);
        com.conferenceroomscheduler.model.Reservation reservation67 = new com.conferenceroomscheduler.model.Reservation("hi!", "faculty", "", "Pending", localDateTime38, localDateTime39, "Unverified badge detected for Cancelled.", (double) 1.0f, (double) 0L, (-1.0d), paymentMethod64);
        com.conferenceroomscheduler.model.Reservation reservation68 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "Booking confirmed.", "hi!", "Pending", localDateTime28, localDateTime29, "Cancelled", (double) '4', (double) (-1.0f), (double) 0L, paymentMethod64);
        reservation10.setPaymentMethod(paymentMethod64);
        com.conferenceroomscheduler.model.Reservation reservation70 = new com.conferenceroomscheduler.model.Reservation("Verified badge detected for Checked in..", "Verified badge detected for ADMIN-69.", "Unverified badge detected for admin.", "Unverified badge detected for Cancelled.", localDateTime4, localDateTime5, "Unverified badge detected for admin.", 0.0d, (double) 1.0f, (double) (-1L), paymentMethod64);
        org.junit.Assert.assertNull(paymentMethod13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod64 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod64.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
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
        occupancySensor3.occupied = true;
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
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("", (double) (byte) 1);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("admin", (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getTitle();
        double double4 = reservation1.getDepositAmount();
        reservation1.setTitle("");
        double double7 = reservation1.getFinalAmount();
        reservation1.setCheckedIn(false);
        java.lang.String str10 = reservation1.getTitle();
        java.lang.String str11 = reservation1.getReservationId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand8 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setAccountType("Pending");
        boolean boolean11 = reservation1.isExtended();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        boolean boolean11 = room6.isEnabled();
        room6.setRoomId("partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
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
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod22 = reservation21.getPaymentMethod();
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Pending" + "'", str9, "Pending");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cancelled" + "'", str17, "Cancelled");
        org.junit.Assert.assertNotNull(reservation21);
        org.junit.Assert.assertNull(paymentMethod22);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        reservation1.setDepositAmount((double) (byte) 0);
        boolean boolean10 = reservation1.isCheckedIn();
        boolean boolean11 = reservation1.isDepositLost();
        java.time.LocalDateTime localDateTime12 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand13 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime12);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand13.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.extendBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
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
        java.lang.String str13 = cancelledBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cancelled" + "'", str1, "Cancelled");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
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
        boolean boolean63 = occupancySensor44.occupied;
        boolean boolean64 = occupancySensor44.occupied;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher65 = occupancySensor44.getSubject();
        occupancySensor3.subject = checkInPublisher65;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cancelled" + "'", str21, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pending" + "'", str23, "Pending");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(checkInPublisher65);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("", "", "Booking complete", false, false, "Booking complete");
        boolean boolean7 = adminAccount6.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        java.lang.String str8 = room6.getBuilding();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor12 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher13 = null;
        occupancySensor12.setSubject(checkInPublisher13);
        boolean boolean15 = occupancySensor12.isDetected;
        occupancySensor12.roomId = "Booking confirmed.";
        room6.setOccupancySensor(occupancySensor12);
        java.lang.String str19 = room6.getRoomNumber();
        java.lang.String str20 = room6.getRoomNumber();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor24 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher25 = null;
        occupancySensor24.setSubject(checkInPublisher25);
        java.lang.String str27 = occupancySensor24.getRoomId();
        occupancySensor24.roomId = "hi!";
        java.lang.String str30 = occupancySensor24.getLastEvent();
        occupancySensor24.isDetected = true;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher33 = occupancySensor24.getSubject();
        room6.setOccupancySensor(occupancySensor24);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(checkInPublisher33);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        boolean boolean4 = badgeScan3.isVerified();
        boolean boolean5 = badgeScan3.isVerified();
        java.lang.String str6 = badgeScan3.getBadgeId();
        java.lang.String str7 = badgeScan3.getBadgeId();
        badgeScan3.setBadgeId("partner");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        java.lang.String str13 = room6.getBuilding();
        room6.setName("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
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
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod14 = reservation1.getPaymentMethod();
        reservation1.setDepositAmount((double) 1);
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(paymentMethod14);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
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
        reservation1.setCanceled(false);
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor0 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor0.update("Checked in.");
        roomSensor0.update("Checked in.");
        roomSensor0.update("Cancelled");
        roomSensor0.update("admin");
        roomSensor0.update("Booking confirmed.");
        roomSensor0.update("Unverified badge detected for admin.");
        roomSensor0.update("");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy institutionalBillingPaymentStrategy0 = new com.conferenceroomscheduler.patterns.InstitutionalBillingPaymentStrategy();
        boolean boolean3 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", 0.0d);
        boolean boolean6 = institutionalBillingPaymentStrategy0.processPayment("Checked in.", (double) (short) 1);
        boolean boolean9 = institutionalBillingPaymentStrategy0.processPayment("Cancelled", 32.0d);
        boolean boolean12 = institutionalBillingPaymentStrategy0.processPayment("faculty", (double) 1);
        boolean boolean15 = institutionalBillingPaymentStrategy0.processPayment("", (double) 0);
        boolean boolean18 = institutionalBillingPaymentStrategy0.processPayment("partner", (double) (-1.0f));
        boolean boolean21 = institutionalBillingPaymentStrategy0.processPayment("", (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("Pending", "Pending", "Verified badge detected for ADMIN-69.", true, true, "Unverified badge detected for .");
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        reservation0.setUserId("");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
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
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand11.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNotNull(reservation10);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
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
        java.time.LocalDateTime localDateTime20 = null;
        reservation1.setStartTime(localDateTime20);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Booking complete" + "'", str19, "Booking complete");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
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
        room6.setCapacity((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
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
        java.lang.String str35 = reservation33.getAccountType();
        java.time.LocalDateTime localDateTime36 = null;
        reservation33.setStartTime(localDateTime36);
        org.junit.Assert.assertTrue("'" + paymentMethod30 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod30.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Unverified badge detected for Cancelled." + "'", str35, "Unverified badge detected for Cancelled.");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setFinalAmount((double) ' ');
        reservation0.setAccountType("Booking confirmed.");
        reservation0.setTitle("admin");
        reservation0.setTitle("");
        reservation0.setTitle("faculty");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
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
        java.lang.String str71 = checkedInBookingState54.getName();
        com.conferenceroomscheduler.model.Reservation reservation72 = new com.conferenceroomscheduler.model.Reservation();
        reservation72.setFinalAmount((double) (byte) 100);
        java.lang.String str75 = reservation72.getRoomId();
        reservation72.setFinalAmount((double) 10.0f);
        java.lang.String str78 = reservation72.getUserId();
        reservation72.setFinalAmount((double) ' ');
        java.lang.String str81 = reservation72.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext82 = new com.conferenceroomscheduler.patterns.BookingContext(reservation72);
        com.conferenceroomscheduler.patterns.BookingState bookingState83 = null;
        bookingContext82.setState(bookingState83);
        checkedInBookingState54.handle(bookingContext82);
        confirmedBookingState7.handle(bookingContext82);
        com.conferenceroomscheduler.model.Reservation reservation87 = bookingContext82.getReservation();
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
        org.junit.Assert.assertNotNull(bookingState60);
        org.junit.Assert.assertNotNull(bookingState61);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Checked in." + "'", str71, "Checked in.");
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNotNull(reservation87);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService2 = null;
        com.conferenceroomscheduler.model.Reservation reservation3 = new com.conferenceroomscheduler.model.Reservation();
        reservation3.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod6 = reservation3.getPaymentMethod();
        reservation3.setFinalAmount((double) (byte) 1);
        java.lang.String str9 = reservation3.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand10 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService2, reservation3);
        reservation3.setAccountType("Pending");
        java.time.LocalDateTime localDateTime13 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand14 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService1, reservation3, localDateTime13);
        java.time.LocalDateTime localDateTime15 = reservation3.getEndTime();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand16 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation3);
        boolean boolean17 = reservation3.isDepositLost();
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Booking confirmed.", "staff", "", true, true, "partner");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
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
        com.conferenceroomscheduler.patterns.BookingContext bookingContext10 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        java.lang.Class<?> wildcardClass11 = reservation1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setFinalAmount((double) 10.0f);
        java.lang.String str7 = reservation1.getUserId();
        reservation1.setDepositAmount((double) (byte) 0);
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand10 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        boolean boolean11 = cancelBookingCommand10.wasSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand10.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
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
        reservation0.setReservationId("Unverified badge detected for .");
        boolean boolean32 = reservation0.isCanceled();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod23 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod23.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("Cancelled", "admin", "Booking confirmed.", false, false, "student");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("admin", "Unverified badge detected for admin.", false);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
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
        boolean boolean14 = editBookingCommand12.wasSuccessful();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Unverified badge detected for .", "hi!", "Verified badge detected for Checked in..", "Booking confirmed.", (int) '#', localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Unverified badge detected for ." + "'", str8, "Unverified badge detected for .");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setDepositLost(true);
        boolean boolean5 = reservation0.isCanceled();
        reservation0.setRoomId("");
        java.lang.String str8 = reservation0.getTitle();
        com.conferenceroomscheduler.model.Reservation reservation9 = new com.conferenceroomscheduler.model.Reservation();
        reservation9.setHourlyRate((double) (byte) 100);
        boolean boolean12 = reservation9.isDepositLost();
        java.time.LocalDateTime localDateTime13 = null;
        reservation9.setEndTime(localDateTime13);
        reservation9.setRoomId("");
        reservation9.setReservationId("student");
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod49 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation50 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime43, localDateTime44, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod49);
        com.conferenceroomscheduler.model.Reservation reservation51 = new com.conferenceroomscheduler.model.Reservation("", "Pending", "Pending", "Booking complete", localDateTime33, localDateTime34, "Booking confirmed.", (double) 0.0f, (double) 1, (double) (byte) 100, paymentMethod49);
        com.conferenceroomscheduler.model.Reservation reservation52 = new com.conferenceroomscheduler.model.Reservation("Pending", "Booking complete", "Cancelled", "hi!", localDateTime23, localDateTime24, "", (double) '4', (double) 100.0f, (double) ' ', paymentMethod49);
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod63 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation64 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "hi!", "Booking complete", "Checked in.", localDateTime57, localDateTime58, "hi!", (double) 97, (double) 100L, (double) (byte) 100, paymentMethod63);
        reservation52.setPaymentMethod(paymentMethod63);
        reservation9.setPaymentMethod(paymentMethod63);
        reservation0.setPaymentMethod(paymentMethod63);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + paymentMethod49 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod49.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertTrue("'" + paymentMethod63 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod63.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
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
        reservation2.setExtended(false);
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState6 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str7 = cancelledBookingState6.getName();
        bookingContext5.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState6);
        com.conferenceroomscheduler.model.Reservation reservation9 = bookingContext5.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation10 = bookingContext5.getReservation();
        java.lang.String str11 = reservation10.getAccountType();
        java.time.LocalDateTime localDateTime12 = reservation10.getStartTime();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cancelled" + "'", str7, "Cancelled");
        org.junit.Assert.assertNotNull(reservation9);
        org.junit.Assert.assertNotNull(reservation10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setEnabled(false);
        java.lang.String str9 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = room6.getOccupancySensor();
        java.lang.Class<?> wildcardClass11 = room6.getClass();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(occupancySensor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        java.time.LocalDateTime localDateTime1 = null;
        reservation0.setEndTime(localDateTime1);
        reservation0.setHourlyRate((double) 'a');
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        boolean boolean6 = reservation0.isCheckedIn();
        java.time.LocalDateTime localDateTime7 = reservation0.getStartTime();
        boolean boolean8 = reservation0.isDepositLost();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        boolean boolean10 = room6.isClosedForMaintenance();
        room6.setEnabled(false);
        room6.setEnabled(true);
        room6.setName("Unverified badge detected for .");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        boolean boolean1 = adminAccount0.isVerified();
        java.lang.String str2 = adminAccount0.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("", "Cancelled", "ADMIN-69", true, false, "");
        staffAccount6.setIdentifier("Unverified badge detected for .");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
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
        reservation0.setRoomId("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("faculty", false, false);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Booking complete", "Booking complete", true);
        java.lang.String str4 = badgeScan3.getBadgeId();
        badgeScan3.setBadgeId("Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Booking complete" + "'", str4, "Booking complete");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getAccountType();
        java.lang.String str5 = reservation2.getAccountType();
        double double6 = reservation2.getDepositAmount();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand9 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation2, localDateTime7, localDateTime8);
        java.lang.String str10 = reservation2.getAccountType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Verified badge detected for Checked in..", "partner", "hi!", false, true, "faculty");
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        java.lang.String str3 = reservation0.getUserId();
        boolean boolean4 = reservation0.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation0.getPaymentMethod();
        reservation0.setDepositLost(true);
        java.time.LocalDateTime localDateTime8 = null;
        reservation0.setEndTime(localDateTime8);
        java.lang.String str10 = reservation0.getUserId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        room6.setClosedForMaintenance(false);
        room6.setCapacity(100);
        room6.setBuilding("Pending");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor19 = room6.getOccupancySensor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(occupancySensor19);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
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
        com.conferenceroomscheduler.patterns.BookingState bookingState14 = bookingContext12.getState();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(bookingState13);
        org.junit.Assert.assertNotNull(bookingState14);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor72 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount79 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean80 = occupancySensor72.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount79);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher81 = null;
        occupancySensor72.setSubject(checkInPublisher81);
        occupancySensor72.isDetected = false;
        boolean boolean85 = occupancySensor72.isOccupied();
        com.conferenceroomscheduler.model.Badge badge89 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str90 = badge89.getEmail();
        boolean boolean91 = occupancySensor72.scanIdBadge(badge89);
        java.lang.String str92 = badge89.getAccountId();
        badge89.setEmail("Booking complete");
        boolean boolean95 = occupancySensor3.scanIdBadge(badge89);
        occupancySensor3.occupied = false;
        java.lang.String str98 = occupancySensor3.roomId;
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(badge67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Cancelled" + "'", str90, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "Booking confirmed." + "'", str92, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "Checked in." + "'", str98, "Checked in.");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("Checked in.", "admin", "Booking complete", true, false, "hi!");
        java.lang.Class<?> wildcardClass7 = adminAccount6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Cancelled", "Cancelled", true);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
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
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher31 = occupancySensor3.subject;
        boolean boolean32 = occupancySensor3.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(checkInPublisher31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) '4');
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("Cancelled", 1.0d);
        boolean boolean9 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) (-1.0f));
        boolean boolean12 = debitCardPaymentStrategy0.processPayment("faculty", (double) (-1L));
        boolean boolean15 = debitCardPaymentStrategy0.processPayment("Booking confirmed.", (double) 'a');
        boolean boolean18 = debitCardPaymentStrategy0.processPayment("hi!", (double) 52);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getTitle();
        double double5 = reservation2.getDepositAmount();
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand7 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation2, localDateTime6);
        boolean boolean8 = extendBookingCommand7.wasSuccessful();
        boolean boolean9 = extendBookingCommand7.wasSuccessful();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        studentAccount10.setEmail("Checked in.");
        com.conferenceroomscheduler.model.Badge badge14 = studentAccount10.getBadge();
        badge14.setEmail("ADMIN-69");
        java.lang.String str17 = badge14.getAccountId();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(badge14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("staff", "Checked in.", true);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        java.lang.String str6 = occupancySensor3.getRoomId();
        occupancySensor3.roomId = "hi!";
        java.lang.String str9 = occupancySensor3.getLastEvent();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount20 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean21 = occupancySensor13.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount20);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher22 = null;
        occupancySensor13.setSubject(checkInPublisher22);
        occupancySensor13.isDetected = false;
        boolean boolean26 = occupancySensor13.isOccupied();
        com.conferenceroomscheduler.model.Badge badge30 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str31 = badge30.getEmail();
        boolean boolean32 = occupancySensor13.scanIdBadge(badge30);
        java.lang.String str33 = badge30.getAccountId();
        badge30.setAccountId("Cancelled");
        java.lang.String str36 = badge30.getEmail();
        boolean boolean37 = occupancySensor3.scanIdBadge(badge30);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher38 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor42 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor46 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean47 = occupancySensor46.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher48 = null;
        occupancySensor46.subject = checkInPublisher48;
        occupancySensor46.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher52 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor56 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher57 = null;
        occupancySensor56.setSubject(checkInPublisher57);
        occupancySensor56.occupied = true;
        occupancySensor56.setDetected(false);
        checkInPublisher52.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor56);
        occupancySensor46.setSubject(checkInPublisher52);
        occupancySensor42.setSubject(checkInPublisher52);
        boolean boolean66 = occupancySensor42.isDetected;
        checkInPublisher38.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor42);
        com.conferenceroomscheduler.model.StudentAccount studentAccount74 = new com.conferenceroomscheduler.model.StudentAccount("hi!", "Booking confirmed.", "Booking confirmed.", false, true, "Booking confirmed.");
        studentAccount74.setAccountId("Unverified badge detected for Cancelled.");
        studentAccount74.setAccountType("Booking confirmed.");
        checkInPublisher38.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount74);
        occupancySensor3.subject = checkInPublisher38;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Cancelled" + "'", str31, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Booking confirmed." + "'", str33, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Cancelled" + "'", str36, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setName("hi!");
        room6.setName("");
        boolean boolean11 = room6.isClosedForMaintenance();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor12 = room6.getOccupancySensor();
        com.conferenceroomscheduler.model.AdminAccount adminAccount19 = new com.conferenceroomscheduler.model.AdminAccount("hi!", "", "hi!", true, false, "hi!");
        adminAccount19.setPassword("hi!");
        boolean boolean22 = occupancySensor12.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount19);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher23 = occupancySensor12.subject;
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(occupancySensor12);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(checkInPublisher23);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.model.Reservation reservation10 = new com.conferenceroomscheduler.model.Reservation();
        reservation10.setFinalAmount((double) (byte) 100);
        java.lang.String str13 = reservation10.getRoomId();
        reservation10.setFinalAmount((double) 10.0f);
        reservation10.setTitle("Booking confirmed.");
        java.lang.String str18 = reservation10.getUserId();
        java.lang.String str19 = reservation10.getUserId();
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
        reservation10.setPaymentMethod(paymentMethod50);
        com.conferenceroomscheduler.model.Reservation reservation55 = new com.conferenceroomscheduler.model.Reservation("Booking complete", "Checked in.", "student", "Cancelled", localDateTime4, localDateTime5, "Cancelled", 10.0d, (double) 10.0f, (double) (byte) 1, paymentMethod50);
        boolean boolean56 = reservation55.isExtended();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + paymentMethod50 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod50.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setEnabled(true);
        java.lang.String str13 = room6.getName();
        java.lang.String str14 = room6.getName();
        room6.setName("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cancelled" + "'", str14, "Cancelled");
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        reservation2.setFinalAmount((double) (byte) 100);
        reservation2.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand7 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        reservation2.setCheckedIn(false);
        double double10 = reservation2.getHourlyRate();
        reservation2.setDepositLost(false);
        boolean boolean13 = reservation2.isDepositLost();
        reservation2.setReservationId("admin");
        java.time.LocalDateTime localDateTime16 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand17 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation2, localDateTime16);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor46 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher47 = null;
        occupancySensor46.setSubject(checkInPublisher47);
        java.lang.String str49 = occupancySensor46.getRoomId();
        checkInPublisher27.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor46);
        occupancySensor46.occupied = true;
        boolean boolean53 = occupancySensor46.isOccupied();
        occupancySensor46.roomId = "Booking confirmed.";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(checkInPublisher27);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor0 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor0.update("Checked in.");
        roomSensor0.update("Checked in.");
        roomSensor0.update("Cancelled");
        roomSensor0.update("admin");
        roomSensor0.update("Booking confirmed.");
        roomSensor0.update("Unverified badge detected for Cancelled.");
        roomSensor0.update("Unverified badge detected for .");
        roomSensor0.update("student");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
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
        bookingContext53.request();
        com.conferenceroomscheduler.patterns.BookingState bookingState68 = bookingContext53.getState();
        confirmedBookingState7.handle(bookingContext53);
        java.lang.String str70 = confirmedBookingState7.getName();
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
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Checked in." + "'", str51, "Checked in.");
        org.junit.Assert.assertNull(reservation56);
        org.junit.Assert.assertNotNull(bookingState61);
        org.junit.Assert.assertNull(reservation64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Booking complete" + "'", str65, "Booking complete");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Booking complete" + "'", str66, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Booking confirmed." + "'", str70, "Booking confirmed.");
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.AdminAccount adminAccount10 = new com.conferenceroomscheduler.model.AdminAccount();
        boolean boolean11 = adminAccount10.isVerified();
        adminAccount10.setUniversityAccount(false);
        com.conferenceroomscheduler.model.Badge badge14 = adminAccount10.getBadge();
        adminAccount10.setPassword("Booking confirmed.");
        boolean boolean17 = adminAccount10.isUniversityAccount();
        room6.checkIn((com.conferenceroomscheduler.model.Account) adminAccount10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(badge14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Booking complete", "Booking confirmed.", (int) '4', true, "Booking confirmed.", "Pending");
        room6.setClosedForMaintenance(false);
        java.lang.String str9 = room6.getName();
        room6.setRoomNumber("Pending");
        room6.setName("admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking confirmed." + "'", str9, "Booking confirmed.");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
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
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
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
        occupancySensor3.setRoomId("admin");
        boolean boolean40 = occupancySensor3.isOccupied();
        java.lang.String str41 = occupancySensor3.getRoomId();
        occupancySensor3.setRoomId("Booking confirmed.");
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
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher71 = occupancySensor47.getSubject();
        occupancySensor3.setSubject(checkInPublisher71);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "admin" + "'", str41, "admin");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(checkInPublisher71);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Unverified badge detected for .", "student", "partner", "Checked in.", (int) (short) -1, localDateTime5, localDateTime6);
        int int8 = bookingRequest7.getAttendeeCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("student", "student", "Booking complete", true, false, "partner");
        java.lang.String str7 = facultyAccount6.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking complete" + "'", str7, "Booking complete");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Booking complete", "Booking confirmed.", (int) '4', true, "Booking confirmed.", "Pending");
        room6.setClosedForMaintenance(false);
        boolean boolean9 = room6.isEnabled();
        boolean boolean10 = room6.isClosedForMaintenance();
        room6.setRoomId("Unverified badge detected for Cancelled.");
        int int13 = room6.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean4 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor3.subject = checkInPublisher5;
        boolean boolean7 = occupancySensor3.isDetected();
        occupancySensor3.setDetected(false);
        java.lang.String str10 = occupancySensor3.roomId;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Pending" + "'", str10, "Pending");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Booking confirmed.", "hi!", false);
        badgeScan3.setBadgeId("Checked in.");
        badgeScan3.setBadgeId("Checked in.");
        java.lang.String str8 = badgeScan3.getRoomId();
        badgeScan3.setRoomId("ADMIN-69");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("Pending", (double) (short) 0);
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("faculty", (double) 0L);
        java.lang.Class<?> wildcardClass7 = debitCardPaymentStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
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
        occupancySensor78.setDetected(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(checkInPublisher84);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        boolean boolean4 = reservation1.isCheckedIn();
        reservation1.setDepositLost(true);
        reservation1.setTitle("Booking confirmed.");
        reservation1.setReservationId("student");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext11 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.BookingState bookingState12 = bookingContext11.getState();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookingState12);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount0.setAccountNumber("hi!");
        java.lang.String str3 = adminAccount0.getAccountId();
        adminAccount0.setAccountType("Booking complete");
        adminAccount0.setAccountNumber("Booking complete");
        adminAccount0.setAccountId("admin");
        adminAccount0.setVerified(false);
        com.conferenceroomscheduler.model.Badge badge12 = adminAccount0.getBadge();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(badge12);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        boolean boolean11 = room6.isClosedForMaintenance();
        room6.setRoomId("Pending");
        room6.setClosedForMaintenance(false);
        room6.setEnabled(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("student", "Verified badge detected for ADMIN-69.", (int) (short) 1, false, "ADMIN-69", "Booking complete");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
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
        java.lang.String str39 = occupancySensor35.roomId;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(checkInPublisher31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Cancelled" + "'", str39, "Cancelled");
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        com.conferenceroomscheduler.model.Account account0 = new com.conferenceroomscheduler.model.Account();
        account0.setPassword("Pending");
        java.lang.String str3 = account0.getAccountNumber();
        account0.setIdentifier("");
        com.conferenceroomscheduler.model.Badge badge6 = account0.getBadge();
        account0.setVerified(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(badge6);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
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
        occupancySensor3.setRoomId("admin");
        boolean boolean40 = occupancySensor3.isOccupied();
        com.conferenceroomscheduler.model.AdminAccount adminAccount41 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str42 = adminAccount41.getEmail();
        adminAccount41.setVerified(false);
        java.lang.String str45 = adminAccount41.getAccountNumber();
        adminAccount41.setVerified(false);
        boolean boolean48 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount41);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Unverified badge detected for admin.", "Verified badge detected for Checked in..", "", false, false, "partner");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
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
        occupancySensor3.setDetected(true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Pending" + "'", str47, "Pending");
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount0.setAccountNumber("hi!");
        java.lang.String str3 = adminAccount0.getAccountId();
        adminAccount0.setAccountType("Booking complete");
        java.lang.String str6 = adminAccount0.getAccountType();
        java.lang.String str7 = adminAccount0.getPassword();
        adminAccount0.setEmail("ADMIN-69");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking complete" + "'", str6, "Booking complete");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("admin", "student", false);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Cancelled", "partner", true);
        badgeScan3.setRoomId("Checked in.");
        java.lang.String str6 = badgeScan3.getRoomId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Checked in." + "'", str6, "Checked in.");
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("", "Booking confirmed.", "", false, false, "");
        adminAccount6.setAccountId("");
        boolean boolean9 = adminAccount6.isVerified();
        adminAccount6.setIdentifier("staff");
        java.lang.String str12 = adminAccount6.getAccountNumber();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod10 = null;
        com.conferenceroomscheduler.model.Reservation reservation11 = new com.conferenceroomscheduler.model.Reservation("Cancelled", "Unverified badge detected for .", "Checked in.", "student", localDateTime4, localDateTime5, "", (double) (byte) -1, (double) (byte) -1, (double) (short) 10, paymentMethod10);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
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
        com.conferenceroomscheduler.model.StudentAccount studentAccount66 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean67 = occupancySensor59.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount66);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor71 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount78 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean79 = occupancySensor71.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount78);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher80 = null;
        occupancySensor71.setSubject(checkInPublisher80);
        occupancySensor71.isDetected = false;
        boolean boolean84 = occupancySensor71.isOccupied();
        com.conferenceroomscheduler.model.Badge badge88 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str89 = badge88.getEmail();
        boolean boolean90 = occupancySensor71.scanIdBadge(badge88);
        java.lang.String str91 = badge88.getAccountId();
        badge88.setAccountId("Cancelled");
        java.lang.String str94 = badge88.getEmail();
        java.lang.String str95 = badge88.getAccountId();
        boolean boolean96 = occupancySensor59.scanIdBadge(badge88);
        boolean boolean97 = occupancySensor59.occupied;
        checkInPublisher55.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor59);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(checkInPublisher52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(checkInPublisher55);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Cancelled" + "'", str89, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "Booking confirmed." + "'", str91, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "Cancelled" + "'", str94, "Cancelled");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "Cancelled" + "'", str95, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setDepositAmount(0.0d);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand9 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime7, localDateTime8);
        boolean boolean10 = reservation1.isCanceled();
        reservation1.setTitle("student");
        double double13 = reservation1.getHourlyRate();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Checked in.", "", (int) ' ', true, "Pending", "Cancelled");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("", "Unverified badge detected for .", "Checked in.", "faculty", (int) '4', localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Checked in." + "'", str9, "Checked in.");
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        int int8 = bookingRequest7.getAttendeeCount();
        java.time.LocalDateTime localDateTime9 = bookingRequest7.getEndTime();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.time.LocalDateTime localDateTime11 = bookingRequest7.getStartTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
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
        java.lang.String str15 = confirmedBookingState10.getName();
        java.lang.String str16 = confirmedBookingState10.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cancelled" + "'", str7, "Cancelled");
        org.junit.Assert.assertNotNull(reservation9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking confirmed." + "'", str11, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking confirmed." + "'", str12, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking confirmed." + "'", str13, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking confirmed." + "'", str15, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking confirmed." + "'", str16, "Booking confirmed.");
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setHourlyRate((double) (byte) 100);
        boolean boolean3 = reservation0.isDepositLost();
        java.time.LocalDateTime localDateTime4 = null;
        reservation0.setEndTime(localDateTime4);
        boolean boolean6 = reservation0.isDepositLost();
        java.lang.String str7 = reservation0.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        java.lang.String str4 = badgeScan3.getBadgeId();
        boolean boolean5 = badgeScan3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Unverified badge detected for .", "staff", "faculty", "admin", (int) (byte) 0, localDateTime5, localDateTime6);
        int int8 = bookingRequest7.getAttendeeCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor0 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor0.update("Checked in.");
        roomSensor0.update("Checked in.");
        roomSensor0.update("Cancelled");
        roomSensor0.update("admin");
        roomSensor0.update("Booking confirmed.");
        roomSensor0.update("Unverified badge detected for Cancelled.");
        roomSensor0.update("Unverified badge detected for .");
        roomSensor0.update("staff");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("admin", "student", "Checked in.", true, true, "Pending");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
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
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory47 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account55 = facultyFactory47.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account63 = facultyFactory47.createAccount("", "hi!", "", "", false, true, "");
        com.conferenceroomscheduler.model.Account account71 = facultyFactory47.createAccount("Cancelled", "Pending", "Cancelled", "hi!", false, false, "");
        account71.setVerified(false);
        checkInPublisher38.notifyObservers(account71);
        boolean boolean75 = account71.isUniversityAccount();
        account71.setAccountId("Booking confirmed.");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(checkInPublisher38);
        org.junit.Assert.assertNotNull(account55);
        org.junit.Assert.assertNotNull(account63);
        org.junit.Assert.assertNotNull(account71);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Booking complete", "Cancelled", (int) (short) 1, "Booking complete", "");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = room12.getOccupancySensor();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor17 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher18 = null;
        occupancySensor17.setSubject(checkInPublisher18);
        occupancySensor17.occupied = true;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher22 = occupancySensor17.subject;
        boolean boolean23 = occupancySensor17.isDetected;
        occupancySensor17.setRoomId("Booking confirmed.");
        room12.setOccupancySensor(occupancySensor17);
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(occupancySensor13);
        org.junit.Assert.assertNull(checkInPublisher22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("Pending", "Booking confirmed.", "hi!", false, false, "");
        java.lang.String str7 = adminAccount6.getEmail();
        adminAccount6.setAccountId("Checked in.");
        adminAccount6.setAccountType("Booking complete");
        adminAccount6.setUniversityAccount(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking confirmed." + "'", str7, "Booking confirmed.");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str1 = adminAccount0.getEmail();
        boolean boolean2 = adminAccount0.isUniversityAccount();
        adminAccount0.setVerified(true);
        adminAccount0.setAccountId("Booking confirmed.");
        boolean boolean7 = adminAccount0.isVerified();
        com.conferenceroomscheduler.model.Badge badge8 = adminAccount0.getBadge();
        adminAccount0.setIdentifier("Booking confirmed.");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(badge8);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("Pending", "Pending", "Checked in.", "Cancelled", false, false, "ADMIN-69");
        java.lang.String str8 = account7.getAccountId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Pending" + "'", str8, "Pending");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        com.conferenceroomscheduler.model.Account account0 = new com.conferenceroomscheduler.model.Account();
        java.lang.String str1 = account0.getEmail();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("", (double) (byte) 1);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("admin", (double) 'a');
        boolean boolean9 = creditCardPaymentStrategy0.processPayment("Unverified badge detected for .", (double) (short) 0);
        boolean boolean12 = creditCardPaymentStrategy0.processPayment("faculty", 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
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
        com.conferenceroomscheduler.model.AdminAccount adminAccount63 = new com.conferenceroomscheduler.model.AdminAccount("Pending", "Booking confirmed.", "hi!", false, false, "");
        java.lang.String str64 = adminAccount63.getEmail();
        boolean boolean65 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount63);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(checkInPublisher55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Booking confirmed." + "'", str64, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("student", "ADMIN-69", "Unverified badge detected for admin.", "Unverified badge detected for .", true, true, "Booking complete");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("staff", "Booking complete", "Cancelled", "faculty", true, false, "Unverified badge detected for Cancelled.");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
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
        java.time.LocalDateTime localDateTime14 = reservation0.getEndTime();
        double double15 = reservation0.getHourlyRate();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) 10);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("Cancelled", 1.0d);
        boolean boolean9 = creditCardPaymentStrategy0.processPayment("", (double) 100.0f);
        boolean boolean12 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) 97);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        room6.setClosedForMaintenance(false);
        room6.setCapacity(100);
        room6.setRoomId("Unverified badge detected for Cancelled.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("Booking confirmed.", "staff", "", "Checked in.", true, true, "Unverified badge detected for admin.");
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        com.conferenceroomscheduler.model.Badge badge7 = studentAccount6.getBadge();
        badge7.setEmail("Pending");
        badge7.setEmail("");
        java.lang.String str12 = badge7.getAccountId();
        org.junit.Assert.assertNotNull(badge7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        com.conferenceroomscheduler.patterns.FacultyFactory facultyFactory0 = new com.conferenceroomscheduler.patterns.FacultyFactory();
        com.conferenceroomscheduler.model.Account account8 = facultyFactory0.createAccount("", "Cancelled", "", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account16 = facultyFactory0.createAccount("", "hi!", "", "", false, true, "");
        com.conferenceroomscheduler.model.Account account24 = facultyFactory0.createAccount("Cancelled", "Pending", "Cancelled", "hi!", false, false, "");
        com.conferenceroomscheduler.model.Account account32 = facultyFactory0.createAccount("", "hi!", "", "Pending", true, false, "Cancelled");
        com.conferenceroomscheduler.model.Account account40 = facultyFactory0.createAccount("faculty", "Pending", "Checked in.", "faculty", true, true, "Booking confirmed.");
        com.conferenceroomscheduler.model.Account account48 = facultyFactory0.createAccount("Unverified badge detected for .", "partner", "faculty", "Checked in.", true, false, "");
        java.lang.String str49 = account48.getPassword();
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
        org.junit.Assert.assertNotNull(account32);
        org.junit.Assert.assertNotNull(account40);
        org.junit.Assert.assertNotNull(account48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "faculty" + "'", str49, "faculty");
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
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
        java.lang.String str18 = reservation1.getUserId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        room6.setCapacity((int) '4');
        room6.setName("hi!");
        com.conferenceroomscheduler.model.AdminAccount adminAccount15 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str16 = adminAccount15.getEmail();
        adminAccount15.setEmail("Cancelled");
        boolean boolean19 = adminAccount15.isUniversityAccount();
        java.lang.String str20 = adminAccount15.getAccountId();
        room6.checkIn((com.conferenceroomscheduler.model.Account) adminAccount15);
        java.lang.String str22 = adminAccount15.getAccountType();
        adminAccount15.setIdentifier("Unverified badge detected for .");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Cancelled", "student", false);
        badgeScan3.setBadgeId("");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService30 = null;
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod41 = null;
        com.conferenceroomscheduler.model.Reservation reservation42 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime35, localDateTime36, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod41);
        reservation42.setDepositLost(true);
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand45 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService30, reservation42);
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService46 = null;
        com.conferenceroomscheduler.model.Reservation reservation47 = new com.conferenceroomscheduler.model.Reservation();
        reservation47.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod50 = reservation47.getPaymentMethod();
        reservation47.setDepositAmount(0.0d);
        java.lang.String str53 = reservation47.getReservationId();
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand56 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService46, reservation47, localDateTime54, localDateTime55);
        com.conferenceroomscheduler.model.Reservation reservation57 = new com.conferenceroomscheduler.model.Reservation();
        reservation57.setFinalAmount((double) (byte) 100);
        reservation57.setRoomId("hi!");
        reservation57.setRoomId("Booking confirmed.");
        java.time.LocalDateTime localDateTime68 = null;
        java.time.LocalDateTime localDateTime69 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod74 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation75 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime68, localDateTime69, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod74);
        reservation57.setPaymentMethod(paymentMethod74);
        reservation47.setPaymentMethod(paymentMethod74);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod78 = reservation47.getPaymentMethod();
        reservation42.setPaymentMethod(paymentMethod78);
        com.conferenceroomscheduler.model.Reservation reservation80 = new com.conferenceroomscheduler.model.Reservation("admin", "Pending", "Cancelled", "Cancelled", localDateTime24, localDateTime25, "Booking confirmed.", 10.0d, (double) (-1.0f), (double) 0.0f, paymentMethod78);
        com.conferenceroomscheduler.model.Reservation reservation81 = new com.conferenceroomscheduler.model.Reservation("staff", "Booking complete", "Checked in.", "Unverified badge detected for Cancelled.", localDateTime14, localDateTime15, "Unverified badge detected for .", (double) ' ', (double) 100L, (double) (-1.0f), paymentMethod78);
        com.conferenceroomscheduler.model.Reservation reservation82 = new com.conferenceroomscheduler.model.Reservation("Booking confirmed.", "Unverified badge detected for admin.", "student", "hi!", localDateTime4, localDateTime5, "Checked in.", (double) (short) 100, (double) (byte) 10, (double) (short) 0, paymentMethod78);
        org.junit.Assert.assertNull(paymentMethod50);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + paymentMethod74 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod74.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertTrue("'" + paymentMethod78 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod78.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Pending", "Pending", (int) (short) -1, "", "Cancelled");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("Cancelled", "ADMIN-69", (-1), "faculty", "Pending");
        com.conferenceroomscheduler.model.Room room24 = roomFactory0.createRoom("Unverified badge detected for admin.", "Pending", 100, "ADMIN-69", "partner");
        com.conferenceroomscheduler.model.Room room30 = roomFactory0.createRoom("Verified badge detected for ADMIN-69.", "faculty", (int) (short) 1, "", "ADMIN-69");
        com.conferenceroomscheduler.model.Room room36 = roomFactory0.createRoom("Booking complete", "Verified badge detected for Checked in..", 97, "Booking complete", "hi!");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(room24);
        org.junit.Assert.assertNotNull(room30);
        org.junit.Assert.assertNotNull(room36);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
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
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand16.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.extendBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = room6.getOccupancySensor();
        boolean boolean11 = occupancySensor10.isOccupied();
        java.lang.String str12 = occupancySensor10.roomId;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(occupancySensor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        occupancySensor3.occupied = true;
        occupancySensor3.occupied = true;
        boolean boolean10 = occupancySensor3.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        com.conferenceroomscheduler.patterns.PartnerFactory partnerFactory0 = new com.conferenceroomscheduler.patterns.PartnerFactory();
        com.conferenceroomscheduler.model.Account account8 = partnerFactory0.createAccount("Checked in.", "hi!", "admin", "", true, false, "Pending");
        com.conferenceroomscheduler.model.Account account16 = partnerFactory0.createAccount("Booking complete", "hi!", "hi!", "", true, false, "Checked in.");
        com.conferenceroomscheduler.model.Account account24 = partnerFactory0.createAccount("Booking complete", "ADMIN-69", "Pending", "Checked in.", true, true, "");
        com.conferenceroomscheduler.model.Account account32 = partnerFactory0.createAccount("partner", "faculty", "student", "ADMIN-69", false, false, "Booking complete");
        com.conferenceroomscheduler.model.Account account40 = partnerFactory0.createAccount("admin", "Pending", "student", "Unverified badge detected for .", true, false, "hi!");
        com.conferenceroomscheduler.model.Account account48 = partnerFactory0.createAccount("", "staff", "hi!", "Verified badge detected for Checked in..", false, false, "Unverified badge detected for .");
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
        org.junit.Assert.assertNotNull(account32);
        org.junit.Assert.assertNotNull(account40);
        org.junit.Assert.assertNotNull(account48);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
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
        com.conferenceroomscheduler.patterns.BookingContext bookingContext15 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        java.time.LocalDateTime localDateTime16 = reservation1.getStartTime();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setDepositAmount(0.0d);
        reservation0.setAccountType("");
        java.lang.String str8 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (short) 100);
        java.lang.String str11 = reservation0.getTitle();
        java.time.LocalDateTime localDateTime12 = null;
        reservation0.setEndTime(localDateTime12);
        java.time.LocalDateTime localDateTime14 = reservation0.getEndTime();
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        occupancySensor4.setOccupied(true);
        occupancySensor4.occupied = false;
        occupancySensor4.isDetected = true;
        occupancySensor4.roomId = "Booking complete";
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
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
        boolean boolean15 = reservation0.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod16 = reservation0.getPaymentMethod();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(paymentMethod16);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("Verified badge detected for ADMIN-69.", "admin", "Booking complete", true, false, "hi!");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Cancelled", "hi!", "hi!", "", (int) (short) 1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRoomId();
        java.lang.String str9 = bookingRequest7.getRequestId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getStartTime();
        java.time.LocalDateTime localDateTime11 = bookingRequest7.getStartTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
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
        adminAccount51.setIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setBuilding("hi!");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = room6.getOccupancySensor();
        com.conferenceroomscheduler.model.Account account18 = new com.conferenceroomscheduler.model.Account("", "Booking confirmed.", "Verified badge detected for Checked in..", "Booking complete", false, false, "Booking confirmed.");
        boolean boolean19 = occupancySensor10.detectOccupancy(account18);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(occupancySensor10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.occupied;
        java.lang.String str7 = occupancySensor3.roomId;
        boolean boolean8 = occupancySensor3.isDetected();
        boolean boolean9 = occupancySensor3.isDetected;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "Checked in.", true);
        badgeScan3.setRoomId("hi!");
        badgeScan3.setBadgeId("faculty");
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setReservationId("Checked in.");
        double double9 = reservation0.getDepositAmount();
        boolean boolean10 = reservation0.isExtended();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod11 = reservation0.getPaymentMethod();
        java.lang.String str12 = reservation0.getAccountType();
        reservation0.setUserId("ADMIN-69");
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(paymentMethod11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
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
        reservation2.setRoomId("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("", "", "hi!", false, false, "admin");
        studentAccount6.setEmail("Unverified badge detected for .");
        java.lang.Class<?> wildcardClass9 = studentAccount6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("partner", "Booking complete", (int) (byte) 10, false, "", "");
        room6.setRoomNumber("Unverified badge detected for Cancelled.");
        room6.setRoomId("hi!");
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Checked in.", "Pending", true);
        badge3.setAccountId("admin");
        boolean boolean6 = badge3.isVerified();
        badge3.setVerified(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("", (double) (byte) 1);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("ADMIN-69", (double) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
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
        int int22 = room6.getCapacity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cancelled" + "'", str17, "Cancelled");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        java.lang.String str12 = studentAccount10.getAccountType();
        com.conferenceroomscheduler.model.Badge badge13 = studentAccount10.getBadge();
        studentAccount10.setIdentifier("partner");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertNotNull(badge13);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
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
        java.lang.String str32 = occupancySensor15.roomId;
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Pending" + "'", str29, "Pending");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Pending" + "'", str32, "Pending");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Pending", "admin", (int) (short) 1, true, "admin", "Verified badge detected for Checked in..");
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("", "hi!", false);
        badge3.setEmail("admin");
        badge3.setVerified(false);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
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
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod21 = reservation12.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(paymentMethod21);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
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
        java.time.LocalDateTime localDateTime34 = reservation33.getStartTime();
        double double35 = reservation33.getDepositAmount();
        org.junit.Assert.assertTrue("'" + paymentMethod30 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod30.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod20 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation21 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime14, localDateTime15, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod20);
        com.conferenceroomscheduler.model.Reservation reservation22 = new com.conferenceroomscheduler.model.Reservation("Booking confirmed.", "Booking confirmed.", "", "", localDateTime4, localDateTime5, "Booking complete", 0.0d, (double) 0, (double) 100.0f, paymentMethod20);
        boolean boolean23 = reservation22.isExtended();
        reservation22.setReservationId("partner");
        org.junit.Assert.assertTrue("'" + paymentMethod20 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod20.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        reservation1.setCheckedIn(true);
        java.lang.String str10 = reservation1.getAccountType();
        java.lang.String str11 = reservation1.getRoomId();
        java.time.LocalDateTime localDateTime12 = reservation1.getEndTime();
        java.lang.String str13 = reservation1.getUserId();
        java.time.LocalDateTime localDateTime14 = null;
        reservation1.setStartTime(localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand17 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime16);
        java.lang.String str18 = reservation1.getReservationId();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
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
        java.time.LocalDateTime localDateTime23 = null;
        reservation22.setStartTime(localDateTime23);
        java.time.LocalDateTime localDateTime25 = reservation22.getStartTime();
        reservation22.setCheckedIn(true);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertNotNull(bookingState8);
        org.junit.Assert.assertNotNull(reservation21);
        org.junit.Assert.assertNotNull(reservation22);
        org.junit.Assert.assertNull(localDateTime25);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
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
        boolean boolean34 = occupancySensor21.isOccupied();
        occupancySensor21.roomId = "Pending";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor0 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor0.update("Booking confirmed.");
        roomSensor0.update("student");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Booking complete", "Unverified badge detected for .", "Unverified badge detected for .", "ADMIN-69", 52, localDateTime5, localDateTime6);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("", "student", "", false, false, "Verified badge detected for ADMIN-69.");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.isDetected;
        com.conferenceroomscheduler.model.Badge badge10 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        boolean boolean11 = occupancySensor3.scanIdBadge(badge10);
        occupancySensor3.occupied = true;
        java.lang.String str14 = occupancySensor3.roomId;
        boolean boolean15 = occupancySensor3.isOccupied();
        com.conferenceroomscheduler.model.Account account23 = new com.conferenceroomscheduler.model.Account("staff", "Unverified badge detected for Cancelled.", "admin", "Unverified badge detected for .", true, true, "Unverified badge detected for Cancelled.");
        boolean boolean24 = occupancySensor3.detectOccupancy(account23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        java.lang.String str6 = badgeScan3.getBadgeId();
        java.lang.String str7 = badgeScan3.getRoomId();
        badgeScan3.setRoomId("partner");
        boolean boolean10 = badgeScan3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        java.lang.String str4 = reservation1.getAccountType();
        boolean boolean5 = reservation1.isCheckedIn();
        java.time.LocalDateTime localDateTime6 = reservation1.getStartTime();
        reservation1.setTitle("Unverified badge detected for Cancelled.");
        reservation1.setHourlyRate(32.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(localDateTime6);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        boolean boolean4 = badgeScan3.isVerified();
        badgeScan3.setVerified(true);
        badgeScan3.setBadgeId("Unverified badge detected for .");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
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
        java.lang.String str65 = occupancySensor3.getRoomId();
        java.lang.String str66 = occupancySensor3.roomId;
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
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        boolean boolean19 = room6.isEnabled();
        room6.setBuilding("Pending");
        int int22 = room6.getCapacity();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor26 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount33 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean34 = occupancySensor26.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount33);
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount33);
        boolean boolean36 = room6.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) '4');
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("Cancelled", 1.0d);
        boolean boolean9 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) (-1.0f));
        boolean boolean12 = debitCardPaymentStrategy0.processPayment("faculty", (double) (-1L));
        boolean boolean15 = debitCardPaymentStrategy0.processPayment("ADMIN-69", (double) 1L);
        boolean boolean18 = debitCardPaymentStrategy0.processPayment("Pending", (double) '#');
        boolean boolean21 = debitCardPaymentStrategy0.processPayment("hi!", (double) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("faculty", "Cancelled", "partner", true, false, "Cancelled");
        java.lang.String str7 = studentAccount6.getAccountNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cancelled" + "'", str7, "Cancelled");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Checked in.", "ADMIN-69", true);
        badgeScan3.setBadgeId("Cancelled");
        badgeScan3.setBadgeId("Pending");
        boolean boolean8 = badgeScan3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("Unverified badge detected for .", "Pending", "", false, false, "Pending");
        java.lang.String str7 = facultyAccount6.getAccountId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Unverified badge detected for ." + "'", str7, "Unverified badge detected for .");
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
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
        com.conferenceroomscheduler.patterns.BookingState bookingState11 = bookingContext3.getState();
        java.lang.String str12 = bookingContext3.getStatus();
        com.conferenceroomscheduler.model.Reservation reservation13 = bookingContext3.getReservation();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking complete" + "'", str12, "Booking complete");
        org.junit.Assert.assertNull(reservation13);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState6 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str7 = cancelledBookingState6.getName();
        bookingContext5.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState6);
        com.conferenceroomscheduler.model.Reservation reservation9 = bookingContext5.getReservation();
        reservation9.setReservationId("");
        double double12 = reservation9.getFinalAmount();
        reservation9.setDepositLost(true);
        boolean boolean15 = reservation9.isExtended();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cancelled" + "'", str7, "Cancelled");
        org.junit.Assert.assertNotNull(reservation9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        reservation1.setCheckedIn(true);
        java.lang.String str10 = reservation1.getAccountType();
        java.lang.String str11 = reservation1.getRoomId();
        java.time.LocalDateTime localDateTime12 = reservation1.getEndTime();
        java.lang.String str13 = reservation1.getUserId();
        java.time.LocalDateTime localDateTime14 = null;
        reservation1.setStartTime(localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand17 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime16);
        reservation1.setFinalAmount((double) (short) 0);
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setName("hi!");
        room6.setName("");
        java.lang.String str11 = room6.getName();
        room6.setClosedForMaintenance(false);
        room6.setClosedForMaintenance(false);
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("hi!", "", "hi!", true, false, "hi!");
        adminAccount6.setPassword("hi!");
        boolean boolean9 = adminAccount6.isVerified();
        adminAccount6.setAccountNumber("student");
        adminAccount6.setAccountId("faculty");
        java.lang.String str14 = adminAccount6.getEmail();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "", "hi!", "", (int) '4', localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = bookingRequest7.getStartTime();
        java.lang.String str9 = bookingRequest7.getRequestId();
        java.lang.String str10 = bookingRequest7.getRoomId();
        java.time.LocalDateTime localDateTime11 = bookingRequest7.getStartTime();
        java.lang.String str12 = bookingRequest7.getTitle();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
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
        boolean boolean19 = reservation1.isCanceled();
        java.lang.String str20 = reservation1.getAccountType();
        java.lang.String str21 = reservation1.getReservationId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
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
        boolean boolean15 = reservation1.isDepositLost();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        java.lang.String str7 = studentAccount6.getPassword();
        studentAccount6.setAccountNumber("hi!");
        java.lang.String str10 = studentAccount6.getAccountId();
        java.lang.String str11 = studentAccount6.getAccountType();
        studentAccount6.setAccountType("");
        boolean boolean14 = studentAccount6.isUniversityAccount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cancelled" + "'", str7, "Cancelled");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        badgeScan3.setVerified(true);
        java.lang.String str6 = badgeScan3.getBadgeId();
        java.lang.String str7 = badgeScan3.getRoomId();
        boolean boolean8 = badgeScan3.isVerified();
        badgeScan3.setBadgeId("student");
        badgeScan3.setRoomId("");
        java.lang.String str13 = badgeScan3.getBadgeId();
        java.lang.String str14 = badgeScan3.getBadgeId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor42 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor46 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean47 = occupancySensor46.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher48 = null;
        occupancySensor46.subject = checkInPublisher48;
        occupancySensor46.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher52 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor56 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher57 = null;
        occupancySensor56.setSubject(checkInPublisher57);
        occupancySensor56.occupied = true;
        occupancySensor56.setDetected(false);
        checkInPublisher52.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor56);
        occupancySensor46.setSubject(checkInPublisher52);
        occupancySensor42.setSubject(checkInPublisher52);
        com.conferenceroomscheduler.model.Badge badge69 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str70 = badge69.getAccountId();
        boolean boolean71 = occupancySensor42.scanIdBadge(badge69);
        boolean boolean72 = occupancySensor42.isOccupied();
        checkInPublisher24.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor42);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(checkInPublisher7);
        org.junit.Assert.assertNull(checkInPublisher8);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Booking confirmed." + "'", str70, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
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
        java.lang.String str13 = reservation1.getAccountType();
        reservation1.setRoomId("partner");
        java.time.LocalDateTime localDateTime16 = null;
        reservation1.setStartTime(localDateTime16);
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService18 = null;
        com.conferenceroomscheduler.model.Reservation reservation19 = new com.conferenceroomscheduler.model.Reservation();
        reservation19.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod22 = reservation19.getPaymentMethod();
        reservation19.setDepositAmount(0.0d);
        java.lang.String str25 = reservation19.getReservationId();
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand28 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService18, reservation19, localDateTime26, localDateTime27);
        com.conferenceroomscheduler.model.Reservation reservation29 = new com.conferenceroomscheduler.model.Reservation();
        reservation29.setFinalAmount((double) (byte) 100);
        reservation29.setRoomId("hi!");
        reservation29.setRoomId("Booking confirmed.");
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod46 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation47 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime40, localDateTime41, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod46);
        reservation29.setPaymentMethod(paymentMethod46);
        reservation19.setPaymentMethod(paymentMethod46);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod50 = reservation19.getPaymentMethod();
        reservation1.setPaymentMethod(paymentMethod50);
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand52 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(paymentMethod22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + paymentMethod46 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod46.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertTrue("'" + paymentMethod50 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod50.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
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
        com.conferenceroomscheduler.model.Reservation reservation44 = new com.conferenceroomscheduler.model.Reservation("Unverified badge detected for admin.", "Unverified badge detected for admin.", "Verified badge detected for Checked in..", "student", localDateTime4, localDateTime5, "", (double) 35, 10.0d, 0.0d, paymentMethod40);
        org.junit.Assert.assertNull(paymentMethod14);
        org.junit.Assert.assertTrue("'" + paymentMethod40 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod40.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("ADMIN-69", "", "hi!", true, false, "Checked in.");
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Checked in.", "", "", false, true, "partner");
        studentAccount6.setEmail("Unverified badge detected for .");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = null;
        occupancySensor3.setSubject(checkInPublisher12);
        occupancySensor3.isDetected = false;
        java.lang.String str16 = occupancySensor3.getRoomId();
        occupancySensor3.occupied = false;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor22 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount29 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean30 = occupancySensor22.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount29);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher31 = null;
        occupancySensor22.setSubject(checkInPublisher31);
        occupancySensor22.isDetected = false;
        occupancySensor22.setDetected(true);
        occupancySensor22.setOccupied(false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher39 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
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
        boolean boolean67 = occupancySensor43.isDetected;
        checkInPublisher39.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor43);
        com.conferenceroomscheduler.model.AdminAccount adminAccount69 = new com.conferenceroomscheduler.model.AdminAccount();
        checkInPublisher39.notifyObservers((com.conferenceroomscheduler.model.Account) adminAccount69);
        occupancySensor22.setSubject(checkInPublisher39);
        occupancySensor3.setSubject(checkInPublisher39);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher73 = occupancySensor3.subject;
        boolean boolean74 = occupancySensor3.occupied;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pending" + "'", str16, "Pending");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(checkInPublisher73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        boolean boolean4 = badgeScan3.isVerified();
        boolean boolean5 = badgeScan3.isVerified();
        java.lang.String str6 = badgeScan3.getBadgeId();
        badgeScan3.setVerified(true);
        java.lang.String str9 = badgeScan3.getRoomId();
        badgeScan3.setVerified(false);
        java.lang.String str12 = badgeScan3.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        java.lang.String str4 = reservation1.getAccountType();
        java.time.LocalDateTime localDateTime5 = reservation1.getEndTime();
        java.lang.String str6 = reservation1.getTitle();
        reservation1.setDepositAmount((double) 1);
        java.lang.String str9 = reservation1.getRoomId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getReservationId();
        java.lang.String str5 = reservation2.getRoomId();
        reservation2.setCanceled(true);
        reservation2.setCanceled(false);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand12 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation2, localDateTime10, localDateTime11);
        boolean boolean13 = editBookingCommand12.wasSuccessful();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
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
        java.lang.String str15 = bookingRequest7.getRoomId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cancelled" + "'", str15, "Cancelled");
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
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
        com.conferenceroomscheduler.model.Reservation reservation64 = bookingContext57.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation65 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext66 = new com.conferenceroomscheduler.patterns.BookingContext(reservation65);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState67 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext66.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState67);
        com.conferenceroomscheduler.model.Reservation reservation69 = bookingContext66.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation70 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext71 = new com.conferenceroomscheduler.patterns.BookingContext(reservation70);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState72 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext71.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState72);
        com.conferenceroomscheduler.patterns.BookingState bookingState74 = bookingContext71.getState();
        bookingContext66.setState(bookingState74);
        bookingContext57.setState(bookingState74);
        checkedInBookingState32.handle(bookingContext57);
        cancelledBookingState27.handle(bookingContext57);
        com.conferenceroomscheduler.patterns.BookingState bookingState79 = bookingContext57.getState();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Checked in." + "'", str10, "Checked in.");
        org.junit.Assert.assertNull(reservation15);
        org.junit.Assert.assertNotNull(bookingState20);
        org.junit.Assert.assertNull(reservation23);
        org.junit.Assert.assertNotNull(bookingState24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Cancelled" + "'", str29, "Cancelled");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Cancelled" + "'", str30, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState38);
        org.junit.Assert.assertNotNull(bookingState39);
        org.junit.Assert.assertNotNull(bookingState60);
        org.junit.Assert.assertNotNull(bookingState61);
        org.junit.Assert.assertNull(reservation64);
        org.junit.Assert.assertNull(reservation69);
        org.junit.Assert.assertNotNull(bookingState74);
        org.junit.Assert.assertNotNull(bookingState79);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("", "", "Unverified badge detected for .", false, false, "hi!");
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
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
        reservation0.setCheckedIn(false);
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
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
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
        boolean boolean15 = cancelBookingCommand14.wasSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand14.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getAccountType();
        java.lang.String str5 = reservation2.getAccountType();
        java.time.LocalDateTime localDateTime6 = reservation2.getEndTime();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand7 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation2);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext8 = new com.conferenceroomscheduler.patterns.BookingContext(reservation2);
        reservation2.setDepositLost(true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(localDateTime6);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor58 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor58.isDetected = false;
        java.lang.String str61 = occupancySensor58.getRoomId();
        occupancySensor58.isDetected = false;
        checkInPublisher0.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor58);
        java.lang.String str65 = occupancySensor58.getLastEvent();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Pending" + "'", str44, "Pending");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Pending" + "'", str61, "Pending");
        org.junit.Assert.assertNull(str65);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setBuilding("hi!");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = room6.getOccupancySensor();
        occupancySensor10.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher13 = occupancySensor10.subject;
        java.lang.String str14 = occupancySensor10.getLastEvent();
        occupancySensor10.setOccupied(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(occupancySensor10);
        org.junit.Assert.assertNull(checkInPublisher13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
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
        room6.setEnabled(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("Booking complete", "Pending", "Booking confirmed.", false, true, "Checked in.");
        adminAccount6.setIdentifier("admin");
        java.lang.String str9 = adminAccount6.getAccountId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking complete" + "'", str9, "Booking complete");
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
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
        boolean boolean18 = room6.isClosedForMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        java.lang.String str8 = reservation1.getAccountType();
        double double9 = reservation1.getFinalAmount();
        java.lang.String str10 = reservation1.getUserId();
        boolean boolean11 = reservation1.isDepositLost();
        reservation1.setCheckedIn(true);
        java.time.LocalDateTime localDateTime14 = null;
        reservation1.setEndTime(localDateTime14);
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        java.time.LocalDateTime localDateTime1 = null;
        reservation0.setEndTime(localDateTime1);
        java.time.LocalDateTime localDateTime3 = reservation0.getStartTime();
        reservation0.setHourlyRate((double) (short) -1);
        boolean boolean6 = reservation0.isDepositLost();
        boolean boolean7 = reservation0.isCanceled();
        org.junit.Assert.assertNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getRoomId();
        java.lang.String str10 = bookingRequest7.getRequestId();
        java.lang.String str11 = bookingRequest7.getOrganizerId();
        java.lang.String str12 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        java.lang.String str6 = occupancySensor3.getRoomId();
        com.conferenceroomscheduler.model.StudentAccount studentAccount13 = new com.conferenceroomscheduler.model.StudentAccount("", "Booking confirmed.", "hi!", false, true, "Checked in.");
        studentAccount13.setUniversityAccount(false);
        studentAccount13.setEmail("Checked in.");
        boolean boolean18 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount13);
        studentAccount13.setAccountId("Booking complete");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
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
        adminAccount11.setIdentifier("Booking complete");
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
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("", "admin", "Pending", "Cancelled", (-1), localDateTime5, localDateTime6);
        int int8 = bookingRequest7.getAttendeeCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
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
        occupancySensor3.setRoomId("Unverified badge detected for .");
        occupancySensor3.roomId = "Unverified badge detected for admin.";
        occupancySensor3.isDetected = true;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(checkInPublisher17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Pending" + "'", str27, "Pending");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
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
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState12 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation13 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext14 = new com.conferenceroomscheduler.patterns.BookingContext(reservation13);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState15 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext14.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState15);
        com.conferenceroomscheduler.patterns.BookingState bookingState17 = bookingContext14.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState18 = bookingContext14.getState();
        cancelledBookingState12.handle(bookingContext14);
        java.lang.String str20 = cancelledBookingState12.getName();
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
        cancelledBookingState12.handle(bookingContext22);
        completedBookingState0.handle(bookingContext22);
        java.lang.String str34 = completedBookingState0.getName();
        java.lang.String str35 = completedBookingState0.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking complete" + "'", str11, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState17);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cancelled" + "'", str20, "Cancelled");
        org.junit.Assert.assertNull(reservation25);
        org.junit.Assert.assertNotNull(bookingState30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Booking complete" + "'", str34, "Booking complete");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Booking complete" + "'", str35, "Booking complete");
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Unverified badge detected for Cancelled.", "ADMIN-69", "Booking confirmed.", "partner", (-1), localDateTime5, localDateTime6);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
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
        occupancySensor20.roomId = "faculty";
        occupancySensor20.occupied = true;
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
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Unverified badge detected for .", "Verified badge detected for Checked in..", (int) (byte) 0, true, "Unverified badge detected for admin.", "Booking confirmed.");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Booking complete", (int) ' ', true, "", "ADMIN-69");
        java.lang.String str7 = room6.getName();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = room6.getOccupancySensor();
        com.conferenceroomscheduler.model.Account account16 = new com.conferenceroomscheduler.model.Account("Cancelled", "Cancelled", "Booking confirmed.", "hi!", false, false, "");
        account16.setAccountType("admin");
        room6.checkIn(account16);
        room6.setBuilding("Unverified badge detected for Cancelled.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking complete" + "'", str7, "Booking complete");
        org.junit.Assert.assertNotNull(occupancySensor8);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        reservation0.setDepositLost(true);
        java.lang.String str12 = reservation0.getReservationId();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService23 = null;
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod34 = null;
        com.conferenceroomscheduler.model.Reservation reservation35 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime28, localDateTime29, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod34);
        reservation35.setDepositLost(true);
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand38 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService23, reservation35);
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService39 = null;
        com.conferenceroomscheduler.model.Reservation reservation40 = new com.conferenceroomscheduler.model.Reservation();
        reservation40.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod43 = reservation40.getPaymentMethod();
        reservation40.setDepositAmount(0.0d);
        java.lang.String str46 = reservation40.getReservationId();
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand49 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService39, reservation40, localDateTime47, localDateTime48);
        com.conferenceroomscheduler.model.Reservation reservation50 = new com.conferenceroomscheduler.model.Reservation();
        reservation50.setFinalAmount((double) (byte) 100);
        reservation50.setRoomId("hi!");
        reservation50.setRoomId("Booking confirmed.");
        java.time.LocalDateTime localDateTime61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod67 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation68 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime61, localDateTime62, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod67);
        reservation50.setPaymentMethod(paymentMethod67);
        reservation40.setPaymentMethod(paymentMethod67);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod71 = reservation40.getPaymentMethod();
        reservation35.setPaymentMethod(paymentMethod71);
        com.conferenceroomscheduler.model.Reservation reservation73 = new com.conferenceroomscheduler.model.Reservation("admin", "Pending", "Cancelled", "Cancelled", localDateTime17, localDateTime18, "Booking confirmed.", 10.0d, (double) (-1.0f), (double) 0.0f, paymentMethod71);
        reservation0.setPaymentMethod(paymentMethod71);
        reservation0.setAccountType("Unverified badge detected for .");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(paymentMethod43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + paymentMethod67 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod67.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertTrue("'" + paymentMethod71 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod71.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        boolean boolean9 = occupancySensor4.isDetected;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean14 = occupancySensor13.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher15 = null;
        occupancySensor13.subject = checkInPublisher15;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher17 = occupancySensor13.getSubject();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor21 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean22 = occupancySensor21.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher23 = null;
        occupancySensor21.subject = checkInPublisher23;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher25 = occupancySensor21.getSubject();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher26 = occupancySensor21.getSubject();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor30 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher31 = null;
        occupancySensor30.setSubject(checkInPublisher31);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor36 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor40 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean41 = occupancySensor40.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher42 = null;
        occupancySensor40.subject = checkInPublisher42;
        occupancySensor40.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher46 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor50 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher51 = null;
        occupancySensor50.setSubject(checkInPublisher51);
        occupancySensor50.occupied = true;
        occupancySensor50.setDetected(false);
        checkInPublisher46.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor50);
        occupancySensor40.setSubject(checkInPublisher46);
        occupancySensor36.setSubject(checkInPublisher46);
        occupancySensor30.setSubject(checkInPublisher46);
        occupancySensor21.setSubject(checkInPublisher46);
        occupancySensor13.setSubject(checkInPublisher46);
        occupancySensor4.subject = checkInPublisher46;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher64 = occupancySensor4.getSubject();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(checkInPublisher17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(checkInPublisher25);
        org.junit.Assert.assertNull(checkInPublisher26);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(checkInPublisher64);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
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
        java.time.LocalDateTime localDateTime16 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand17 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime15, localDateTime16);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        com.conferenceroomscheduler.model.Reservation reservation28 = new com.conferenceroomscheduler.model.Reservation();
        reservation28.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod31 = reservation28.getPaymentMethod();
        reservation28.setFinalAmount((double) (byte) 1);
        java.lang.String str34 = reservation28.getRoomId();
        reservation28.setReservationId("Checked in.");
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod47 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation48 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime41, localDateTime42, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod47);
        reservation28.setPaymentMethod(paymentMethod47);
        com.conferenceroomscheduler.model.Reservation reservation50 = new com.conferenceroomscheduler.model.Reservation("Pending", "Unverified badge detected for Cancelled.", "Pending", "partner", localDateTime22, localDateTime23, "Checked in.", (double) 10.0f, (double) (byte) 100, 1.0d, paymentMethod47);
        reservation1.setPaymentMethod(paymentMethod47);
        reservation1.setCheckedIn(true);
        reservation1.setTitle("Pending");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(paymentMethod31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + paymentMethod47 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod47.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
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
        occupancySensor3.roomId = "Cancelled";
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(checkInPublisher49);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setRoomId("hi!");
        java.lang.String str6 = reservation0.getReservationId();
        java.lang.String str7 = reservation0.getAccountType();
        java.lang.String str8 = reservation0.getRoomId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("ADMIN-69", "partner", "Booking complete", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime8 = bookingRequest7.getEndTime();
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
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
        partnerAccount19.setAccountType("Unverified badge detected for admin.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setEnabled(false);
        java.lang.String str9 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = room6.getOccupancySensor();
        room6.setName("faculty");
        boolean boolean13 = room6.isClosedForMaintenance();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(occupancySensor10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        boolean boolean4 = reservation1.isCheckedIn();
        reservation1.setDepositLost(true);
        reservation1.setTitle("Booking confirmed.");
        boolean boolean9 = reservation1.isCheckedIn();
        double double10 = reservation1.getDepositAmount();
        java.lang.String str11 = reservation1.getUserId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount10 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean11 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount10);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher12 = null;
        occupancySensor3.setSubject(checkInPublisher12);
        occupancySensor3.isDetected = false;
        boolean boolean16 = occupancySensor3.isOccupied();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher17 = occupancySensor3.subject;
        boolean boolean18 = occupancySensor3.isDetected();
        occupancySensor3.roomId = "Booking confirmed.";
        occupancySensor3.setOccupied(true);
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
        badge43.setAccountId("hi!");
        java.lang.String str48 = badge43.getAccountId();
        boolean boolean49 = badge43.isVerified();
        badge43.setEmail("ADMIN-69");
        badge43.setVerified(false);
        boolean boolean54 = occupancySensor3.scanIdBadge(badge43);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(checkInPublisher17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Cancelled" + "'", str44, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher0 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor4 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean5 = occupancySensor4.isDetected();
        occupancySensor4.occupied = false;
        checkInPublisher0.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor4);
        occupancySensor4.setOccupied(true);
        occupancySensor4.isDetected = true;
        occupancySensor4.roomId = "Unverified badge detected for admin.";
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        java.lang.String str3 = reservation0.getUserId();
        boolean boolean4 = reservation0.isDepositLost();
        reservation0.setCheckedIn(false);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        com.conferenceroomscheduler.model.Reservation reservation17 = new com.conferenceroomscheduler.model.Reservation();
        reservation17.setFinalAmount((double) (byte) 100);
        java.lang.String str20 = reservation17.getRoomId();
        reservation17.setFinalAmount((double) 10.0f);
        java.lang.String str23 = reservation17.getUserId();
        reservation17.setDepositAmount((double) (byte) 0);
        double double26 = reservation17.getHourlyRate();
        reservation17.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext29 = new com.conferenceroomscheduler.patterns.BookingContext(reservation17);
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod40 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation41 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime34, localDateTime35, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod40);
        reservation17.setPaymentMethod(paymentMethod40);
        com.conferenceroomscheduler.model.Reservation reservation43 = new com.conferenceroomscheduler.model.Reservation("Checked in.", "Booking complete", "admin", "Booking complete", localDateTime11, localDateTime12, "Booking confirmed.", (double) (short) -1, (double) 0.0f, (double) 0, paymentMethod40);
        reservation0.setPaymentMethod(paymentMethod40);
        reservation0.setRoomId("ADMIN-69");
        double double47 = reservation0.getDepositAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod40 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod40.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        boolean boolean6 = reservation0.isCanceled();
        boolean boolean7 = reservation0.isCanceled();
        double double8 = reservation0.getFinalAmount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
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
        com.conferenceroomscheduler.model.Account account16 = null;
        boolean boolean17 = occupancySensor4.detectOccupancy(account16);
        java.lang.String str18 = occupancySensor4.roomId;
        occupancySensor4.setRoomId("Unverified badge detected for .");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(checkInPublisher10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        reservation0.setExtended(false);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState0 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation1 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext2 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState3 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext2.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState3);
        completedBookingState0.handle(bookingContext2);
        java.lang.String str6 = completedBookingState0.getName();
        java.lang.String str7 = completedBookingState0.getName();
        com.conferenceroomscheduler.model.Reservation reservation8 = new com.conferenceroomscheduler.model.Reservation();
        reservation8.setFinalAmount((double) (byte) 100);
        java.lang.String str11 = reservation8.getRoomId();
        reservation8.setFinalAmount((double) 10.0f);
        java.lang.String str14 = reservation8.getUserId();
        reservation8.setDepositAmount((double) (byte) 0);
        double double17 = reservation8.getHourlyRate();
        reservation8.setDepositLost(true);
        com.conferenceroomscheduler.patterns.BookingContext bookingContext20 = new com.conferenceroomscheduler.patterns.BookingContext(reservation8);
        bookingContext20.request();
        completedBookingState0.handle(bookingContext20);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking complete" + "'", str6, "Booking complete");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking complete" + "'", str7, "Booking complete");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor3.setDetected(false);
        com.conferenceroomscheduler.model.Badge badge9 = new com.conferenceroomscheduler.model.Badge("Checked in.", "Pending", true);
        java.lang.String str10 = badge9.getAccountId();
        boolean boolean11 = occupancySensor3.scanIdBadge(badge9);
        com.conferenceroomscheduler.model.AdminAccount adminAccount18 = new com.conferenceroomscheduler.model.AdminAccount("Booking complete", "Booking confirmed.", "", false, true, "Pending");
        adminAccount18.setPassword("partner");
        boolean boolean21 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount18);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Pending" + "'", str10, "Pending");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.occupied;
        java.lang.String str7 = occupancySensor3.getRoomId();
        java.lang.String str8 = occupancySensor3.roomId;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Checked in.", "ADMIN-69", "partner", "partner", (-1), localDateTime5, localDateTime6);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Checked in.", "Booking complete", (int) (byte) -1, true, "Pending", "Pending");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor14 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean15 = occupancySensor14.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher16 = null;
        occupancySensor14.subject = checkInPublisher16;
        occupancySensor14.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher20 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor24 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher25 = null;
        occupancySensor24.setSubject(checkInPublisher25);
        occupancySensor24.occupied = true;
        occupancySensor24.setDetected(false);
        checkInPublisher20.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor24);
        occupancySensor14.setSubject(checkInPublisher20);
        occupancySensor10.setSubject(checkInPublisher20);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher34 = occupancySensor10.getSubject();
        occupancySensor10.roomId = "";
        occupancySensor10.setDetected(false);
        com.conferenceroomscheduler.model.AdminAccount adminAccount39 = new com.conferenceroomscheduler.model.AdminAccount();
        boolean boolean40 = adminAccount39.isVerified();
        adminAccount39.setUniversityAccount(false);
        boolean boolean43 = occupancySensor10.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount39);
        room6.setOccupancySensor(occupancySensor10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(checkInPublisher34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
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
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand16.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Booking confirmed.", "Checked in.", "ADMIN-69", "student", (int) (byte) 100, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ADMIN-69" + "'", str8, "ADMIN-69");
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
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
        com.conferenceroomscheduler.model.StaffAccount staffAccount45 = new com.conferenceroomscheduler.model.StaffAccount("", "Pending", "Pending", false, false, "hi!");
        checkInPublisher37.notifyObservers((com.conferenceroomscheduler.model.Account) staffAccount45);
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory47 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room53 = roomFactory47.createRoom("", "", (-1), "", "Cancelled");
        room53.setName("hi!");
        room53.setName("");
        boolean boolean58 = room53.isClosedForMaintenance();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor59 = room53.getOccupancySensor();
        checkInPublisher37.removeObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor59);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(checkInPublisher37);
        org.junit.Assert.assertNotNull(room53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(occupancySensor59);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Cancelled", "Cancelled", "Pending", false, true, "Checked in.");
        studentAccount6.setUniversityAccount(false);
        java.lang.String str9 = studentAccount6.getAccountType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        room6.setBuilding("Booking complete");
        room6.setClosedForMaintenance(true);
        room6.setName("Checked in.");
        java.lang.String str25 = room6.getRoomNumber();
        room6.setRoomId("Verified badge detected for ADMIN-69.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
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
        bookingContext24.request();
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
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        java.time.LocalDateTime localDateTime1 = null;
        reservation0.setEndTime(localDateTime1);
        reservation0.setHourlyRate((double) 'a');
        boolean boolean5 = reservation0.isCheckedIn();
        boolean boolean6 = reservation0.isExtended();
        boolean boolean7 = reservation0.isDepositLost();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setCheckedIn(true);
        reservation0.setCheckedIn(false);
        reservation0.setReservationId("Booking complete");
        boolean boolean13 = reservation0.isCheckedIn();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext14 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.isDetected;
        occupancySensor3.setRoomId("");
        occupancySensor3.setRoomId("Pending");
        com.conferenceroomscheduler.model.AdminAccount adminAccount11 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str12 = adminAccount11.getEmail();
        com.conferenceroomscheduler.model.Badge badge13 = adminAccount11.getBadge();
        com.conferenceroomscheduler.model.Badge badge14 = adminAccount11.getBadge();
        adminAccount11.setUniversityAccount(true);
        adminAccount11.setIdentifier("faculty");
        boolean boolean19 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) adminAccount11);
        adminAccount11.setVerified(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(badge13);
        org.junit.Assert.assertNull(badge14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        occupancySensor3.occupied = true;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher8 = occupancySensor3.subject;
        occupancySensor3.setDetected(true);
        occupancySensor3.isDetected = true;
        org.junit.Assert.assertNull(checkInPublisher8);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("Booking complete", "Checked in.", "Cancelled", true, true, "");
        studentAccount6.setAccountNumber("hi!");
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("Booking complete", "Cancelled", (int) (byte) -1, true, "", "Cancelled");
        java.lang.String str7 = room6.getRoomNumber();
        boolean boolean8 = room6.isClosedForMaintenance();
        java.lang.String str9 = room6.getRoomId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cancelled" + "'", str7, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking complete" + "'", str9, "Booking complete");
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) 10);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("Checked in.", (double) ' ');
        boolean boolean9 = creditCardPaymentStrategy0.processPayment("Verified badge detected for Checked in..", 32.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
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
        com.conferenceroomscheduler.model.StaffAccount staffAccount39 = new com.conferenceroomscheduler.model.StaffAccount("hi!", "Booking complete", "Booking confirmed.", false, false, "Booking complete");
        java.lang.String str40 = staffAccount39.getAccountId();
        boolean boolean41 = occupancySensor15.detectOccupancy((com.conferenceroomscheduler.model.Account) staffAccount39);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setRoomNumber("Pending");
        java.lang.String str13 = room6.getName();
        int int14 = room6.getCapacity();
        room6.setClosedForMaintenance(false);
        java.lang.String str17 = room6.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cancelled" + "'", str17, "Cancelled");
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
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
        boolean boolean16 = badgeScan3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
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
        reservation1.setCanceled(false);
        reservation1.setCanceled(false);
        reservation1.setTitle("");
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("faculty", "Booking confirmed.", "student", true, true, "staff");
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        java.lang.String str13 = room6.getBuilding();
        java.lang.String str14 = room6.getBuilding();
        boolean boolean15 = room6.isEnabled();
        room6.setRoomId("admin");
        boolean boolean18 = room6.isClosedForMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("partner", "Checked in.", "staff", "admin", true, false, "partner");
        java.lang.String str8 = account7.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Checked in." + "'", str8, "Checked in.");
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        room6.setBuilding("Booking complete");
        boolean boolean21 = room6.isEnabled();
        java.lang.String str22 = room6.getBuilding();
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
        com.conferenceroomscheduler.model.Badge badge53 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str54 = badge53.getAccountId();
        boolean boolean55 = occupancySensor26.scanIdBadge(badge53);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher56 = null;
        occupancySensor26.subject = checkInPublisher56;
        occupancySensor26.isDetected = true;
        room6.setOccupancySensor(occupancySensor26);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Booking complete" + "'", str22, "Booking complete");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Booking confirmed." + "'", str54, "Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
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
        adminAccount10.setIdentifier("Booking confirmed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
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
        boolean boolean79 = occupancySensor3.isOccupied();
        java.lang.String str80 = occupancySensor3.getRoomId();
        org.junit.Assert.assertNull(checkInPublisher4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(badge72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Pending" + "'", str80, "Pending");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        reservation0.setDepositLost(true);
        java.lang.String str12 = reservation0.getReservationId();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService23 = null;
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod34 = null;
        com.conferenceroomscheduler.model.Reservation reservation35 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime28, localDateTime29, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod34);
        reservation35.setDepositLost(true);
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand38 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService23, reservation35);
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService39 = null;
        com.conferenceroomscheduler.model.Reservation reservation40 = new com.conferenceroomscheduler.model.Reservation();
        reservation40.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod43 = reservation40.getPaymentMethod();
        reservation40.setDepositAmount(0.0d);
        java.lang.String str46 = reservation40.getReservationId();
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand49 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService39, reservation40, localDateTime47, localDateTime48);
        com.conferenceroomscheduler.model.Reservation reservation50 = new com.conferenceroomscheduler.model.Reservation();
        reservation50.setFinalAmount((double) (byte) 100);
        reservation50.setRoomId("hi!");
        reservation50.setRoomId("Booking confirmed.");
        java.time.LocalDateTime localDateTime61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod67 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation68 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime61, localDateTime62, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod67);
        reservation50.setPaymentMethod(paymentMethod67);
        reservation40.setPaymentMethod(paymentMethod67);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod71 = reservation40.getPaymentMethod();
        reservation35.setPaymentMethod(paymentMethod71);
        com.conferenceroomscheduler.model.Reservation reservation73 = new com.conferenceroomscheduler.model.Reservation("admin", "Pending", "Cancelled", "Cancelled", localDateTime17, localDateTime18, "Booking confirmed.", 10.0d, (double) (-1.0f), (double) 0.0f, paymentMethod71);
        reservation0.setPaymentMethod(paymentMethod71);
        java.lang.Class<?> wildcardClass75 = paymentMethod71.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(paymentMethod43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + paymentMethod67 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod67.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertTrue("'" + paymentMethod71 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod71.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        java.time.LocalDateTime localDateTime1 = null;
        reservation0.setEndTime(localDateTime1);
        reservation0.setHourlyRate((double) 'a');
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        java.time.LocalDateTime localDateTime6 = reservation0.getEndTime();
        boolean boolean7 = reservation0.isCheckedIn();
        double double8 = reservation0.getFinalAmount();
        boolean boolean9 = reservation0.isCanceled();
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("partner", "faculty", "Verified badge detected for Checked in..", true, false, "Verified badge detected for Checked in..");
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setName("hi!");
        room6.setName("");
        boolean boolean11 = room6.isClosedForMaintenance();
        room6.setEnabled(false);
        boolean boolean14 = room6.isClosedForMaintenance();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
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
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher57 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor61 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean62 = occupancySensor61.isDetected();
        occupancySensor61.occupied = false;
        checkInPublisher57.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor61);
        boolean boolean66 = occupancySensor61.isDetected;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher67 = occupancySensor61.subject;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher68 = occupancySensor61.subject;
        occupancySensor3.subject = checkInPublisher68;
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(checkInPublisher55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(checkInPublisher67);
        org.junit.Assert.assertNotNull(checkInPublisher68);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
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
        room6.setRoomId("Unverified badge detected for Cancelled.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
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
        com.conferenceroomscheduler.patterns.PendingBookingState pendingBookingState18 = new com.conferenceroomscheduler.patterns.PendingBookingState();
        java.lang.String str19 = pendingBookingState18.getName();
        com.conferenceroomscheduler.model.Reservation reservation20 = new com.conferenceroomscheduler.model.Reservation();
        reservation20.setFinalAmount((double) (byte) 100);
        reservation20.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext25 = new com.conferenceroomscheduler.patterns.BookingContext(reservation20);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState26 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str27 = cancelledBookingState26.getName();
        bookingContext25.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState26);
        pendingBookingState18.handle(bookingContext25);
        java.lang.String str30 = pendingBookingState18.getName();
        java.lang.String str31 = pendingBookingState18.getName();
        com.conferenceroomscheduler.model.Reservation reservation32 = new com.conferenceroomscheduler.model.Reservation();
        reservation32.setFinalAmount((double) (byte) 100);
        java.lang.String str35 = reservation32.getRoomId();
        reservation32.setFinalAmount((double) 10.0f);
        java.lang.String str38 = reservation32.getUserId();
        reservation32.setFinalAmount((double) ' ');
        java.lang.String str41 = reservation32.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext42 = new com.conferenceroomscheduler.patterns.BookingContext(reservation32);
        bookingContext42.request();
        pendingBookingState18.handle(bookingContext42);
        java.lang.String str45 = pendingBookingState18.getName();
        java.lang.String str46 = pendingBookingState18.getName();
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
        com.conferenceroomscheduler.model.Reservation reservation74 = new com.conferenceroomscheduler.model.Reservation();
        reservation74.setFinalAmount((double) (byte) 100);
        java.lang.String str77 = reservation74.getRoomId();
        reservation74.setFinalAmount((double) 10.0f);
        java.lang.String str80 = reservation74.getUserId();
        double double81 = reservation74.getFinalAmount();
        reservation74.setReservationId("Pending");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext84 = new com.conferenceroomscheduler.patterns.BookingContext(reservation74);
        pendingBookingState47.handle(bookingContext84);
        pendingBookingState18.handle(bookingContext84);
        checkedInBookingState0.handle(bookingContext84);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Checked in." + "'", str17, "Checked in.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Pending" + "'", str19, "Pending");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Cancelled" + "'", str27, "Cancelled");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Pending" + "'", str30, "Pending");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Pending" + "'", str31, "Pending");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Pending" + "'", str45, "Pending");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Pending" + "'", str46, "Pending");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Pending" + "'", str48, "Pending");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Cancelled" + "'", str56, "Cancelled");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Pending" + "'", str59, "Pending");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Pending" + "'", str60, "Pending");
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setBuilding("hi!");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = room6.getOccupancySensor();
        occupancySensor10.occupied = false;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher13 = occupancySensor10.subject;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher14 = occupancySensor10.subject;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(occupancySensor10);
        org.junit.Assert.assertNull(checkInPublisher13);
        org.junit.Assert.assertNull(checkInPublisher14);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomNumber();
        java.lang.String str8 = room6.getRoomNumber();
        room6.setCapacity(97);
        room6.setCapacity((int) (byte) 0);
        room6.setName("admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
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
        com.conferenceroomscheduler.model.Reservation reservation28 = new com.conferenceroomscheduler.model.Reservation();
        reservation28.setFinalAmount((double) (byte) 100);
        java.lang.String str31 = reservation28.getRoomId();
        reservation28.setFinalAmount((double) 10.0f);
        java.lang.String str34 = reservation28.getUserId();
        reservation28.setFinalAmount((double) ' ');
        java.lang.String str37 = reservation28.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext38 = new com.conferenceroomscheduler.patterns.BookingContext(reservation28);
        bookingContext38.request();
        checkedInBookingState0.handle(bookingContext38);
        java.lang.String str41 = checkedInBookingState0.getName();
        java.lang.String str42 = checkedInBookingState0.getName();
        java.lang.String str43 = checkedInBookingState0.getName();
        java.lang.String str44 = checkedInBookingState0.getName();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertNotNull(bookingState21);
        org.junit.Assert.assertNotNull(bookingState22);
        org.junit.Assert.assertNull(reservation25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Checked in." + "'", str27, "Checked in.");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Checked in." + "'", str41, "Checked in.");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Checked in." + "'", str42, "Checked in.");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Checked in." + "'", str43, "Checked in.");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Checked in." + "'", str44, "Checked in.");
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("Pending", "hi!", "Booking confirmed.", "", 97, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRoomId();
        java.lang.String str9 = bookingRequest7.getRoomId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.lang.String str11 = bookingRequest7.getOrganizerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking confirmed." + "'", str11, "Booking confirmed.");
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setFinalAmount((double) (byte) 100);
        reservation1.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext6 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        java.time.LocalDateTime localDateTime7 = reservation1.getEndTime();
        java.time.LocalDateTime localDateTime8 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand9 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime8);
        boolean boolean10 = extendBookingCommand9.wasSuccessful();
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
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
        boolean boolean32 = adminAccount30.isUniversityAccount();
        java.lang.String str33 = adminAccount30.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
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
        bookingContext8.request();
        com.conferenceroomscheduler.patterns.BookingState bookingState17 = bookingContext8.getState();
        org.junit.Assert.assertNotNull(bookingState11);
        org.junit.Assert.assertNotNull(bookingState12);
        org.junit.Assert.assertNotNull(bookingState17);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
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
        java.lang.String str42 = completedBookingState25.getName();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Cancelled" + "'", str23, "Cancelled");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Cancelled" + "'", str33, "Cancelled");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Booking complete" + "'", str42, "Booking complete");
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        com.conferenceroomscheduler.model.BookingRequest bookingRequest0 = new com.conferenceroomscheduler.model.BookingRequest();
        java.lang.String str1 = bookingRequest0.getRequestId();
        java.lang.String str2 = bookingRequest0.getRequestId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        com.conferenceroomscheduler.model.Account account7 = new com.conferenceroomscheduler.model.Account("ADMIN-69", "faculty", "hi!", "hi!", true, false, "");
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState0 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str1 = confirmedBookingState0.getName();
        java.lang.String str2 = confirmedBookingState0.getName();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState3 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str4 = cancelledBookingState3.getName();
        com.conferenceroomscheduler.model.Reservation reservation5 = new com.conferenceroomscheduler.model.Reservation();
        reservation5.setFinalAmount((double) (byte) 100);
        reservation5.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext10 = new com.conferenceroomscheduler.patterns.BookingContext(reservation5);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState11 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str12 = cancelledBookingState11.getName();
        bookingContext10.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState11);
        bookingContext10.request();
        cancelledBookingState3.handle(bookingContext10);
        confirmedBookingState0.handle(bookingContext10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking confirmed." + "'", str1, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking confirmed." + "'", str2, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cancelled" + "'", str4, "Cancelled");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cancelled" + "'", str12, "Cancelled");
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setFinalAmount((double) ' ');
        java.lang.String str9 = reservation0.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext10 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        bookingContext10.request();
        com.conferenceroomscheduler.patterns.BookingState bookingState12 = bookingContext10.getState();
        java.lang.String str13 = bookingContext10.getStatus();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(bookingState12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pending" + "'", str13, "Pending");
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        com.conferenceroomscheduler.model.BookingRequest bookingRequest0 = new com.conferenceroomscheduler.model.BookingRequest();
        java.time.LocalDateTime localDateTime1 = bookingRequest0.getStartTime();
        java.time.LocalDateTime localDateTime2 = bookingRequest0.getEndTime();
        java.time.LocalDateTime localDateTime3 = bookingRequest0.getStartTime();
        int int4 = bookingRequest0.getAttendeeCount();
        org.junit.Assert.assertNull(localDateTime1);
        org.junit.Assert.assertNull(localDateTime2);
        org.junit.Assert.assertNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "hi!", false);
        boolean boolean4 = badgeScan3.isVerified();
        boolean boolean5 = badgeScan3.isVerified();
        java.lang.String str6 = badgeScan3.getBadgeId();
        badgeScan3.setVerified(true);
        java.lang.String str9 = badgeScan3.getRoomId();
        badgeScan3.setRoomId("Booking complete");
        java.lang.String str12 = badgeScan3.getBadgeId();
        badgeScan3.setRoomId("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
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
        com.conferenceroomscheduler.model.StudentAccount studentAccount96 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        studentAccount96.setUniversityAccount(false);
        checkInPublisher88.notifyObservers((com.conferenceroomscheduler.model.Account) studentAccount96);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(checkInPublisher88);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        int int8 = bookingRequest7.getAttendeeCount();
        java.lang.String str9 = bookingRequest7.getTitle();
        java.lang.String str10 = bookingRequest7.getTitle();
        java.time.LocalDateTime localDateTime11 = bookingRequest7.getEndTime();
        java.lang.String str12 = bookingRequest7.getRequestId();
        java.time.LocalDateTime localDateTime13 = bookingRequest7.getStartTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
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
        // The following exception was thrown during execution in test generation
        try {
            editBookingCommand15.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.editBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.model.Reservation reservation2 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService1, reservation2);
        java.lang.String str4 = reservation2.getAccountType();
        java.lang.String str5 = reservation2.getAccountType();
        boolean boolean6 = reservation2.isCheckedIn();
        java.time.LocalDateTime localDateTime7 = reservation2.getStartTime();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand8 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation2);
        java.lang.String str9 = reservation2.getAccountType();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext10 = new com.conferenceroomscheduler.patterns.BookingContext(reservation2);
        reservation2.setDepositLost(false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("", "partner", "Pending", false, false, "admin");
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        com.conferenceroomscheduler.model.StaffAccount staffAccount6 = new com.conferenceroomscheduler.model.StaffAccount("Pending", "admin", "Booking complete", false, true, "");
        com.conferenceroomscheduler.model.Badge badge7 = staffAccount6.getBadge();
        badge7.setAccountId("Cancelled");
        badge7.setAccountId("partner");
        org.junit.Assert.assertNotNull(badge7);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        java.lang.String str4 = reservation1.getUserId();
        boolean boolean5 = reservation1.isDepositLost();
        reservation1.setCheckedIn(false);
        reservation1.setAccountType("Pending");
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand10 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setReservationId("Cancelled");
        reservation1.setUserId("Unverified badge detected for Cancelled.");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setHourlyRate((double) (byte) 100);
        boolean boolean4 = reservation1.isDepositLost();
        java.lang.String str5 = reservation1.getUserId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand6 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        reservation1.setAccountType("ADMIN-69");
        double double9 = reservation1.getFinalAmount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
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
        room6.setName("Booking complete");
        room6.setName("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        java.lang.String str2 = reservation1.getTitle();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand3 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        boolean boolean4 = cancelBookingCommand3.wasSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        reservation1.setReservationId("Checked in.");
        double double10 = reservation1.getDepositAmount();
        reservation1.setCheckedIn(true);
        boolean boolean13 = reservation1.isCheckedIn();
        boolean boolean14 = reservation1.isExtended();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand15 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService0, reservation1);
        // The following exception was thrown during execution in test generation
        try {
            createBookingCommand15.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.addReservation(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        occupancySensor3.setDetected(true);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher8 = occupancySensor3.subject;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher9 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean14 = occupancySensor13.isDetected();
        occupancySensor13.occupied = false;
        checkInPublisher9.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor13);
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
        java.lang.String str41 = badge38.getAccountId();
        badge38.setAccountId("Cancelled");
        badge38.setAccountId("");
        java.lang.String str46 = badge38.getAccountId();
        java.lang.String str47 = badge38.getEmail();
        boolean boolean48 = occupancySensor13.scanIdBadge(badge38);
        boolean boolean49 = occupancySensor3.scanIdBadge(badge38);
        boolean boolean50 = occupancySensor3.isOccupied();
        occupancySensor3.isDetected = true;
        com.conferenceroomscheduler.model.StudentAccount studentAccount59 = new com.conferenceroomscheduler.model.StudentAccount("", "Booking confirmed.", "hi!", false, true, "Checked in.");
        studentAccount59.setUniversityAccount(false);
        studentAccount59.setEmail("Checked in.");
        boolean boolean64 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount59);
        org.junit.Assert.assertNull(checkInPublisher8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Cancelled" + "'", str39, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Booking confirmed." + "'", str41, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Cancelled" + "'", str47, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService2 = null;
        com.conferenceroomscheduler.model.Reservation reservation3 = new com.conferenceroomscheduler.model.Reservation();
        reservation3.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod6 = reservation3.getPaymentMethod();
        reservation3.setFinalAmount((double) (byte) 1);
        java.lang.String str9 = reservation3.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand10 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService2, reservation3);
        reservation3.setAccountType("Pending");
        java.time.LocalDateTime localDateTime13 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand14 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService1, reservation3, localDateTime13);
        java.time.LocalDateTime localDateTime15 = reservation3.getEndTime();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand16 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation3);
        boolean boolean17 = cancelBookingCommand16.wasSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand16.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.cancelBooking(com.conferenceroomscheduler.model.Reservation)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext5 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState6 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str7 = cancelledBookingState6.getName();
        bookingContext5.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState6);
        com.conferenceroomscheduler.model.Reservation reservation9 = bookingContext5.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation10 = bookingContext5.getReservation();
        reservation10.setFinalAmount((double) 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cancelled" + "'", str7, "Cancelled");
        org.junit.Assert.assertNotNull(reservation9);
        org.junit.Assert.assertNotNull(reservation10);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        java.lang.String str8 = room6.getBuilding();
        java.lang.String str9 = room6.getRoomNumber();
        int int10 = room6.getCapacity();
        boolean boolean11 = room6.isEnabled();
        room6.setRoomNumber("Checked in.");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor14 = room6.getOccupancySensor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(occupancySensor14);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setRoomId("hi!");
        reservation0.setCheckedIn(true);
        reservation0.setHourlyRate((double) 'a');
        java.lang.String str10 = reservation0.getAccountType();
        java.lang.String str11 = reservation0.getRoomId();
        java.lang.String str12 = reservation0.getReservationId();
        reservation0.setUserId("Checked in.");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext15 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setEnabled(true);
        java.lang.String str13 = room6.getName();
        room6.setName("Cancelled");
        room6.setCapacity((int) (short) 10);
        room6.setClosedForMaintenance(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
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
        reservation0.setReservationId("partner");
        reservation0.setFinalAmount(0.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod23 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod23.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
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
        reservation1.setDepositLost(true);
        reservation1.setCheckedIn(false);
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setEnabled(true);
        room6.setBuilding("Checked in.");
        boolean boolean15 = room6.isEnabled();
        java.lang.Class<?> wildcardClass16 = room6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        com.conferenceroomscheduler.patterns.StaffFactory staffFactory0 = new com.conferenceroomscheduler.patterns.StaffFactory();
        com.conferenceroomscheduler.model.Account account8 = staffFactory0.createAccount("Cancelled", "Checked in.", "", "Cancelled", true, true, "");
        com.conferenceroomscheduler.model.Account account16 = staffFactory0.createAccount("Booking complete", "Unverified badge detected for .", "Unverified badge detected for .", "Cancelled", false, false, "Unverified badge detected for .");
        com.conferenceroomscheduler.model.Account account24 = staffFactory0.createAccount("Unverified badge detected for .", "Verified badge detected for Checked in..", "Verified badge detected for ADMIN-69.", "Booking complete", true, true, "student");
        org.junit.Assert.assertNotNull(account8);
        org.junit.Assert.assertNotNull(account16);
        org.junit.Assert.assertNotNull(account24);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "", "hi!", "", (int) '4', localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getTitle();
        java.lang.String str9 = bookingRequest7.getTitle();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.lang.String str11 = bookingRequest7.getRoomId();
        java.lang.String str12 = bookingRequest7.getOrganizerId();
        java.lang.String str13 = bookingRequest7.getRequestId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod10 = null;
        com.conferenceroomscheduler.model.Reservation reservation11 = new com.conferenceroomscheduler.model.Reservation("", "", "Cancelled", "hi!", localDateTime4, localDateTime5, "Cancelled", (double) 100, 100.0d, (double) 0, paymentMethod10);
        boolean boolean12 = reservation11.isDepositLost();
        boolean boolean13 = reservation11.isDepositLost();
        reservation11.setAccountType("partner");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        com.conferenceroomscheduler.model.BadgeScan badgeScan0 = new com.conferenceroomscheduler.model.BadgeScan();
        java.lang.String str1 = badgeScan0.getBadgeId();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
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
        boolean boolean13 = cancelBookingCommand12.wasSuccessful();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Cancelled", "", "", (int) (short) 0, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        java.lang.String str9 = bookingRequest7.getRoomId();
        java.time.LocalDateTime localDateTime10 = bookingRequest7.getEndTime();
        java.lang.String str11 = bookingRequest7.getTitle();
        int int12 = bookingRequest7.getAttendeeCount();
        java.time.LocalDateTime localDateTime13 = bookingRequest7.getEndTime();
        java.lang.String str14 = bookingRequest7.getRoomId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cancelled" + "'", str14, "Cancelled");
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod3 = reservation0.getPaymentMethod();
        reservation0.setFinalAmount((double) (byte) 1);
        java.lang.String str6 = reservation0.getRoomId();
        reservation0.setCheckedIn(true);
        reservation0.setCheckedIn(false);
        reservation0.setReservationId("Booking complete");
        java.lang.String str13 = reservation0.getUserId();
        reservation0.setRoomId("faculty");
        org.junit.Assert.assertNull(paymentMethod3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("Booking complete", "", true);
        java.lang.String str4 = badge3.getEmail();
        badge3.setAccountId("Unverified badge detected for Cancelled.");
        badge3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Booking complete" + "'", str4, "Booking complete");
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("staff", "Checked in.", true);
        badgeScan3.setBadgeId("Unverified badge detected for .");
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setDepositAmount(0.0d);
        java.lang.String str7 = reservation1.getReservationId();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand10 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime8, localDateTime9);
        java.lang.String str11 = reservation1.getTitle();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("Cancelled", "student", "partner", false, false, "Pending");
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Booking confirmed.", "Cancelled", "Booking confirmed.", 0, localDateTime5, localDateTime6);
        int int8 = bookingRequest7.getAttendeeCount();
        java.lang.String str9 = bookingRequest7.getRequestId();
        int int10 = bookingRequest7.getAttendeeCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("staff", "Unverified badge detected for admin.", "Pending", false, true, "staff");
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
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
        reservation0.setRoomId("Pending");
        reservation0.setTitle("Unverified badge detected for Cancelled.");
        reservation0.setHourlyRate((double) 0.0f);
        org.junit.Assert.assertTrue("'" + paymentMethod47 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod47.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        reservation0.setTitle("Booking confirmed.");
        boolean boolean8 = reservation0.isExtended();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
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
        java.lang.String str17 = reservation2.getUserId();
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
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
        com.conferenceroomscheduler.model.Reservation reservation28 = new com.conferenceroomscheduler.model.Reservation();
        reservation28.setFinalAmount((double) (byte) 100);
        java.lang.String str31 = reservation28.getRoomId();
        reservation28.setFinalAmount((double) 10.0f);
        java.lang.String str34 = reservation28.getUserId();
        reservation28.setFinalAmount((double) ' ');
        java.lang.String str37 = reservation28.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext38 = new com.conferenceroomscheduler.patterns.BookingContext(reservation28);
        bookingContext38.request();
        checkedInBookingState0.handle(bookingContext38);
        java.lang.String str41 = checkedInBookingState0.getName();
        java.lang.String str42 = checkedInBookingState0.getName();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState43 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation44 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext45 = new com.conferenceroomscheduler.patterns.BookingContext(reservation44);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState46 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext45.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState46);
        com.conferenceroomscheduler.patterns.BookingState bookingState48 = bookingContext45.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState49 = bookingContext45.getState();
        cancelledBookingState43.handle(bookingContext45);
        com.conferenceroomscheduler.patterns.BookingState bookingState51 = bookingContext45.getState();
        bookingContext45.request();
        checkedInBookingState0.handle(bookingContext45);
        java.lang.String str54 = bookingContext45.getStatus();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertNotNull(bookingState21);
        org.junit.Assert.assertNotNull(bookingState22);
        org.junit.Assert.assertNull(reservation25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Checked in." + "'", str27, "Checked in.");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Checked in." + "'", str41, "Checked in.");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Checked in." + "'", str42, "Checked in.");
        org.junit.Assert.assertNotNull(bookingState48);
        org.junit.Assert.assertNotNull(bookingState49);
        org.junit.Assert.assertNotNull(bookingState51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Booking complete" + "'", str54, "Booking complete");
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
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
        boolean boolean36 = occupancySensor15.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Pending" + "'", str29, "Pending");
        org.junit.Assert.assertNull(checkInPublisher32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        boolean boolean10 = room6.isClosedForMaintenance();
        room6.setEnabled(false);
        room6.setEnabled(true);
        room6.setRoomId("");
        boolean boolean17 = room6.isClosedForMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("", "", (-1), "", "Cancelled");
        room6.setName("student");
        room6.setEnabled(true);
        room6.setEnabled(false);
        org.junit.Assert.assertNotNull(room6);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Booking complete", "Booking complete", false);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        room6.setBuilding("");
        java.lang.String str12 = room6.getRoomNumber();
        room6.setClosedForMaintenance(true);
        java.lang.String str15 = room6.getBuilding();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor19 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher20 = null;
        occupancySensor19.setSubject(checkInPublisher20);
        occupancySensor19.setDetected(true);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher24 = occupancySensor19.subject;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher25 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor29 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean30 = occupancySensor29.isDetected();
        occupancySensor29.occupied = false;
        checkInPublisher25.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor29);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor37 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount44 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean45 = occupancySensor37.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount44);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher46 = null;
        occupancySensor37.setSubject(checkInPublisher46);
        occupancySensor37.isDetected = false;
        boolean boolean50 = occupancySensor37.isOccupied();
        com.conferenceroomscheduler.model.Badge badge54 = new com.conferenceroomscheduler.model.Badge("Cancelled", "Booking confirmed.", false);
        java.lang.String str55 = badge54.getEmail();
        boolean boolean56 = occupancySensor37.scanIdBadge(badge54);
        java.lang.String str57 = badge54.getAccountId();
        badge54.setAccountId("Cancelled");
        badge54.setAccountId("");
        java.lang.String str62 = badge54.getAccountId();
        java.lang.String str63 = badge54.getEmail();
        boolean boolean64 = occupancySensor29.scanIdBadge(badge54);
        boolean boolean65 = occupancySensor19.scanIdBadge(badge54);
        room6.setOccupancySensor(occupancySensor19);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(checkInPublisher24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Cancelled" + "'", str55, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Booking confirmed." + "'", str57, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Cancelled" + "'", str63, "Cancelled");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "", "Booking complete", "Checked in.", (int) (byte) 1, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getOrganizerId();
        java.lang.String str9 = bookingRequest7.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking complete" + "'", str8, "Booking complete");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Checked in." + "'", str9, "Checked in.");
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", true, true);
        occupancySensor3.setOccupied(true);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
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
        roomSensor11.update("hi!");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(chiefEventCoordinator3);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
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
        boolean boolean17 = reservation1.isDepositLost();
        java.time.LocalDateTime localDateTime18 = null;
        reservation1.setStartTime(localDateTime18);
        java.lang.String str20 = reservation1.getTitle();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
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
        com.conferenceroomscheduler.patterns.BookingState bookingState20 = bookingContext1.getState();
        org.junit.Assert.assertNotNull(bookingState4);
        org.junit.Assert.assertNull(reservation5);
        org.junit.Assert.assertNull(reservation6);
        org.junit.Assert.assertNotNull(bookingState13);
        org.junit.Assert.assertNull(reservation14);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertNotNull(bookingState20);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor10 = room6.getOccupancySensor();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher11 = occupancySensor10.getSubject();
        java.lang.String str12 = occupancySensor10.getRoomId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(occupancySensor10);
        org.junit.Assert.assertNull(checkInPublisher11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        occupancySensor3.isDetected = false;
        boolean boolean6 = occupancySensor3.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Cancelled", "Pending", false);
        badgeScan3.setBadgeId("staff");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.lang.String str7 = reservation1.getRoomId();
        reservation1.setCheckedIn(true);
        java.lang.String str10 = reservation1.getAccountType();
        java.lang.String str11 = reservation1.getRoomId();
        java.time.LocalDateTime localDateTime12 = reservation1.getEndTime();
        reservation1.setExtended(true);
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand16 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime15);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand16.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.extendBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        occupancySensor3.occupied = true;
        occupancySensor3.occupied = true;
        occupancySensor3.setDetected(false);
        occupancySensor3.setOccupied(false);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
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
        java.time.LocalDateTime localDateTime34 = reservation33.getStartTime();
        java.time.LocalDateTime localDateTime35 = null;
        reservation33.setEndTime(localDateTime35);
        java.lang.String str37 = reservation33.getTitle();
        org.junit.Assert.assertTrue("'" + paymentMethod30 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod30.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertNull(localDateTime34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Pending", "Cancelled", (int) (byte) 10, "Checked in.", "Cancelled");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("Booking complete", "student", (int) (byte) 100, "Booking complete", "faculty");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor19 = room18.getOccupancySensor();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher20 = occupancySensor19.getSubject();
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(occupancySensor19);
        org.junit.Assert.assertNull(checkInPublisher20);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
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
        java.lang.String str25 = badge21.getAccountId();
        boolean boolean26 = badge21.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(occupancySensor10);
        org.junit.Assert.assertNull(checkInPublisher13);
        org.junit.Assert.assertNotNull(badge21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod10 = com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING;
        com.conferenceroomscheduler.model.Reservation reservation11 = new com.conferenceroomscheduler.model.Reservation("", "", "Booking confirmed.", "", localDateTime4, localDateTime5, "", 100.0d, 100.0d, (double) 10.0f, paymentMethod10);
        boolean boolean12 = reservation11.isCheckedIn();
        org.junit.Assert.assertTrue("'" + paymentMethod10 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod10.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("ADMIN-69", "Booking confirmed.", "ADMIN-69", "Unverified badge detected for .", (int) (short) 10, localDateTime5, localDateTime6);
        int int8 = bookingRequest7.getAttendeeCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Cancelled", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = occupancySensor3.getSubject();
        org.junit.Assert.assertNull(checkInPublisher4);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        java.time.LocalDateTime localDateTime4 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand5 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService0, reservation1, localDateTime4);
        reservation1.setHourlyRate((double) (short) 1);
        reservation1.setUserId("Unverified badge detected for Cancelled.");
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("hi!", "Booking complete", "", "Booking complete", (int) (byte) -1, localDateTime5, localDateTime6);
        int int8 = bookingRequest7.getAttendeeCount();
        int int9 = bookingRequest7.getAttendeeCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
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
        boolean boolean45 = occupancySensor3.isDetected;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getReservationId();
        java.time.LocalDateTime localDateTime4 = reservation1.getStartTime();
        boolean boolean5 = reservation1.isDepositLost();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        room6.setRoomNumber("Booking confirmed.");
        room6.setRoomNumber("Checked in.");
        room6.setName("Verified badge detected for ADMIN-69.");
        room6.setName("partner");
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        room6.setCapacity((int) '4');
        room6.setName("hi!");
        room6.setName("");
        room6.setName("");
        room6.setClosedForMaintenance(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        java.lang.String str3 = reservation0.getUserId();
        boolean boolean4 = reservation0.isDepositLost();
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod5 = reservation0.getPaymentMethod();
        reservation0.setCanceled(false);
        reservation0.setFinalAmount((double) (short) -1);
        boolean boolean10 = reservation0.isDepositLost();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(paymentMethod5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        boolean boolean9 = reservation0.isCheckedIn();
        boolean boolean10 = reservation0.isDepositLost();
        double double11 = reservation0.getDepositAmount();
        reservation0.setHourlyRate(1.0d);
        reservation0.setCanceled(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
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
        java.lang.String str14 = reservation1.getUserId();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        com.conferenceroomscheduler.model.BookingRequest bookingRequest7 = new com.conferenceroomscheduler.model.BookingRequest("student", "hi!", "Booking confirmed.", "Cancelled", 100, localDateTime5, localDateTime6);
        java.lang.String str8 = bookingRequest7.getRequestId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
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
        reservation1.setExtended(true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        com.conferenceroomscheduler.model.AdminAccount adminAccount6 = new com.conferenceroomscheduler.model.AdminAccount("Booking complete", "Pending", "Booking confirmed.", false, true, "Checked in.");
        adminAccount6.setIdentifier("admin");
        adminAccount6.setAccountType("Pending");
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
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
        boolean boolean84 = badge69.isVerified();
        badge69.setEmail("Cancelled");
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
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy debitCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.DebitCardPaymentStrategy();
        boolean boolean3 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) '4');
        boolean boolean6 = debitCardPaymentStrategy0.processPayment("", (double) (-1));
        boolean boolean9 = debitCardPaymentStrategy0.processPayment("Cancelled", (double) (byte) 0);
        boolean boolean12 = debitCardPaymentStrategy0.processPayment("faculty", (double) (-1.0f));
        boolean boolean15 = debitCardPaymentStrategy0.processPayment("Checked in.", (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("Booking confirmed.", "hi!", false);
        badgeScan3.setBadgeId("Checked in.");
        java.lang.String str6 = badgeScan3.getRoomId();
        java.lang.String str7 = badgeScan3.getRoomId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
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
        boolean boolean38 = occupancySensor3.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
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
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        com.conferenceroomscheduler.model.Reservation reservation0 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext1 = new com.conferenceroomscheduler.patterns.BookingContext(reservation0);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState2 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext1.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState2);
        com.conferenceroomscheduler.patterns.BookingState bookingState4 = bookingContext1.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState5 = bookingContext1.getState();
        bookingContext1.request();
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState7 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation8 = new com.conferenceroomscheduler.model.Reservation();
        reservation8.setFinalAmount((double) (byte) 100);
        reservation8.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.BookingContext bookingContext13 = new com.conferenceroomscheduler.patterns.BookingContext(reservation8);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState14 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        java.lang.String str15 = cancelledBookingState14.getName();
        bookingContext13.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState14);
        completedBookingState7.handle(bookingContext13);
        java.lang.String str18 = completedBookingState7.getName();
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState19 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation20 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext21 = new com.conferenceroomscheduler.patterns.BookingContext(reservation20);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState22 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext21.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState22);
        completedBookingState19.handle(bookingContext21);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState25 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation26 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext27 = new com.conferenceroomscheduler.patterns.BookingContext(reservation26);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState28 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext27.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState28);
        com.conferenceroomscheduler.patterns.BookingState bookingState30 = bookingContext27.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState31 = bookingContext27.getState();
        cancelledBookingState25.handle(bookingContext27);
        completedBookingState19.handle(bookingContext27);
        com.conferenceroomscheduler.model.Reservation reservation34 = bookingContext27.getReservation();
        completedBookingState7.handle(bookingContext27);
        bookingContext1.setState((com.conferenceroomscheduler.patterns.BookingState) completedBookingState7);
        com.conferenceroomscheduler.patterns.BookingState bookingState37 = bookingContext1.getState();
        org.junit.Assert.assertNotNull(bookingState4);
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cancelled" + "'", str15, "Cancelled");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking complete" + "'", str18, "Booking complete");
        org.junit.Assert.assertNotNull(bookingState30);
        org.junit.Assert.assertNotNull(bookingState31);
        org.junit.Assert.assertNull(reservation34);
        org.junit.Assert.assertNotNull(bookingState37);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        com.conferenceroomscheduler.model.Badge badge3 = new com.conferenceroomscheduler.model.Badge("", "Booking complete", false);
        badge3.setVerified(true);
        boolean boolean6 = badge3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        reservation0.setDepositLost(true);
        boolean boolean5 = reservation0.isCanceled();
        reservation0.setCheckedIn(false);
        reservation0.setUserId("Cancelled");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
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
        java.lang.String str35 = checkedInBookingState0.getName();
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertNotNull(bookingState7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Checked in." + "'", str10, "Checked in.");
        org.junit.Assert.assertNotNull(bookingState17);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Checked in." + "'", str34, "Checked in.");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Checked in." + "'", str35, "Checked in.");
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = null;
        room6.setOccupancySensor(occupancySensor8);
        java.lang.String str10 = room6.getRoomNumber();
        room6.setRoomNumber("Pending");
        java.lang.String str13 = room6.getName();
        int int14 = room6.getCapacity();
        room6.setClosedForMaintenance(false);
        room6.setBuilding("Unverified badge detected for Cancelled.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cancelled" + "'", str13, "Cancelled");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Cancelled", false, false);
        java.lang.String str4 = occupancySensor3.getLastEvent();
        com.conferenceroomscheduler.model.Badge badge8 = new com.conferenceroomscheduler.model.Badge("Checked in.", "Unverified badge detected for .", true);
        badge8.setAccountId("ADMIN-69");
        badge8.setEmail("admin");
        boolean boolean13 = occupancySensor3.scanIdBadge(badge8);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("Booking complete", "Cancelled", (int) (short) 1, "Booking complete", "");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor13 = room12.getOccupancySensor();
        room12.setCapacity((int) (short) 10);
        room12.setName("Checked in.");
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(occupancySensor13);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean4 = occupancySensor3.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher5 = null;
        occupancySensor3.subject = checkInPublisher5;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher7 = occupancySensor3.getSubject();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher8 = occupancySensor3.getSubject();
        java.lang.String str9 = occupancySensor3.roomId;
        java.lang.String str10 = occupancySensor3.roomId;
        boolean boolean11 = occupancySensor3.isDetected;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(checkInPublisher7);
        org.junit.Assert.assertNull(checkInPublisher8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Pending" + "'", str9, "Pending");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Pending" + "'", str10, "Pending");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
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
        double double13 = reservation0.getFinalAmount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(paymentMethod11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
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
        boolean boolean31 = occupancySensor15.occupied;
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        java.lang.String str10 = room6.getRoomId();
        com.conferenceroomscheduler.model.AdminAccount adminAccount11 = new com.conferenceroomscheduler.model.AdminAccount();
        adminAccount11.setAccountNumber("hi!");
        java.lang.String str14 = adminAccount11.getAccountId();
        room6.checkIn((com.conferenceroomscheduler.model.Account) adminAccount11);
        room6.setEnabled(false);
        room6.setEnabled(false);
        room6.setClosedForMaintenance(true);
        java.lang.String str22 = room6.getRoomNumber();
        room6.setRoomNumber("Verified badge detected for ADMIN-69.");
        java.lang.String str25 = room6.getBuilding();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getAccountType();
        java.lang.String str4 = reservation1.getAccountType();
        java.time.LocalDateTime localDateTime5 = reservation1.getEndTime();
        java.lang.String str6 = reservation1.getTitle();
        java.lang.String str7 = reservation1.getUserId();
        java.lang.String str8 = reservation1.getRoomId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
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
        com.conferenceroomscheduler.patterns.BookingContext bookingContext34 = new com.conferenceroomscheduler.patterns.BookingContext(reservation1);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState35 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation36 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext37 = new com.conferenceroomscheduler.patterns.BookingContext(reservation36);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState38 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext37.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState38);
        com.conferenceroomscheduler.patterns.BookingState bookingState40 = bookingContext37.getState();
        com.conferenceroomscheduler.model.Reservation reservation41 = bookingContext37.getReservation();
        cancelledBookingState35.handle(bookingContext37);
        com.conferenceroomscheduler.patterns.ConfirmedBookingState confirmedBookingState43 = new com.conferenceroomscheduler.patterns.ConfirmedBookingState();
        java.lang.String str44 = confirmedBookingState43.getName();
        java.lang.String str45 = confirmedBookingState43.getName();
        com.conferenceroomscheduler.model.Reservation reservation46 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext47 = new com.conferenceroomscheduler.patterns.BookingContext(reservation46);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState48 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext47.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState48);
        com.conferenceroomscheduler.model.Reservation reservation50 = bookingContext47.getReservation();
        confirmedBookingState43.handle(bookingContext47);
        com.conferenceroomscheduler.patterns.CheckedInBookingState checkedInBookingState52 = new com.conferenceroomscheduler.patterns.CheckedInBookingState();
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState53 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        com.conferenceroomscheduler.model.Reservation reservation54 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext55 = new com.conferenceroomscheduler.patterns.BookingContext(reservation54);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState56 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext55.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState56);
        com.conferenceroomscheduler.patterns.BookingState bookingState58 = bookingContext55.getState();
        com.conferenceroomscheduler.patterns.BookingState bookingState59 = bookingContext55.getState();
        cancelledBookingState53.handle(bookingContext55);
        checkedInBookingState52.handle(bookingContext55);
        java.lang.String str62 = checkedInBookingState52.getName();
        com.conferenceroomscheduler.model.Reservation reservation63 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext64 = new com.conferenceroomscheduler.patterns.BookingContext(reservation63);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState65 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext64.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState65);
        com.conferenceroomscheduler.model.Reservation reservation67 = bookingContext64.getReservation();
        com.conferenceroomscheduler.model.Reservation reservation68 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext69 = new com.conferenceroomscheduler.patterns.BookingContext(reservation68);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState70 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext69.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState70);
        com.conferenceroomscheduler.patterns.BookingState bookingState72 = bookingContext69.getState();
        bookingContext64.setState(bookingState72);
        checkedInBookingState52.handle(bookingContext64);
        com.conferenceroomscheduler.model.Reservation reservation75 = bookingContext64.getReservation();
        java.lang.String str76 = bookingContext64.getStatus();
        java.lang.String str77 = bookingContext64.getStatus();
        confirmedBookingState43.handle(bookingContext64);
        cancelledBookingState35.handle(bookingContext64);
        java.lang.String str80 = cancelledBookingState35.getName();
        bookingContext34.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState35);
        java.lang.String str82 = bookingContext34.getStatus();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentMethod24 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING + "'", paymentMethod24.equals(com.conferenceroomscheduler.model.PaymentMethod.INSTITUTIONAL_BILLING));
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertNull(localDateTime28);
        org.junit.Assert.assertNotNull(bookingState40);
        org.junit.Assert.assertNull(reservation41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Booking confirmed." + "'", str44, "Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Booking confirmed." + "'", str45, "Booking confirmed.");
        org.junit.Assert.assertNull(reservation50);
        org.junit.Assert.assertNotNull(bookingState58);
        org.junit.Assert.assertNotNull(bookingState59);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Checked in." + "'", str62, "Checked in.");
        org.junit.Assert.assertNull(reservation67);
        org.junit.Assert.assertNotNull(bookingState72);
        org.junit.Assert.assertNull(reservation75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Booking complete" + "'", str76, "Booking complete");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Booking complete" + "'", str77, "Booking complete");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Cancelled" + "'", str80, "Cancelled");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Cancelled" + "'", str82, "Cancelled");
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand2 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        java.lang.String str3 = reservation1.getReservationId();
        java.lang.String str4 = reservation1.getRoomId();
        reservation1.setDepositLost(true);
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod7 = reservation1.getPaymentMethod();
        reservation1.setAccountType("ADMIN-69");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(paymentMethod7);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
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
        java.lang.String str71 = checkedInBookingState54.getName();
        com.conferenceroomscheduler.model.Reservation reservation72 = new com.conferenceroomscheduler.model.Reservation();
        reservation72.setFinalAmount((double) (byte) 100);
        java.lang.String str75 = reservation72.getRoomId();
        reservation72.setFinalAmount((double) 10.0f);
        java.lang.String str78 = reservation72.getUserId();
        reservation72.setFinalAmount((double) ' ');
        java.lang.String str81 = reservation72.getTitle();
        com.conferenceroomscheduler.patterns.BookingContext bookingContext82 = new com.conferenceroomscheduler.patterns.BookingContext(reservation72);
        com.conferenceroomscheduler.patterns.BookingState bookingState83 = null;
        bookingContext82.setState(bookingState83);
        checkedInBookingState54.handle(bookingContext82);
        confirmedBookingState7.handle(bookingContext82);
        java.lang.String str87 = confirmedBookingState7.getName();
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
        org.junit.Assert.assertNotNull(bookingState60);
        org.junit.Assert.assertNotNull(bookingState61);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Checked in." + "'", str71, "Checked in.");
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Booking confirmed." + "'", str87, "Booking confirmed.");
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        com.conferenceroomscheduler.model.AdminAccount adminAccount0 = new com.conferenceroomscheduler.model.AdminAccount();
        java.lang.String str1 = adminAccount0.getEmail();
        adminAccount0.setVerified(false);
        java.lang.String str4 = adminAccount0.getAccountNumber();
        adminAccount0.setVerified(false);
        boolean boolean7 = adminAccount0.isUniversityAccount();
        adminAccount0.setAccountType("Pending");
        adminAccount0.setAccountId("Booking complete");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor0 = new com.conferenceroomscheduler.patterns.RoomSensor();
        roomSensor0.update("Checked in.");
        roomSensor0.update("Booking confirmed.");
        roomSensor0.update("Booking complete");
        roomSensor0.update("");
        roomSensor0.update("admin");
        roomSensor0.update("Booking confirmed.");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
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
        adminAccount27.setAccountNumber("Unverified badge detected for admin.");
        adminAccount27.setPassword("staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator0 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor1 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator0.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor1);
        com.conferenceroomscheduler.patterns.ChiefEventCoordinator chiefEventCoordinator3 = com.conferenceroomscheduler.patterns.ChiefEventCoordinator.getInstance();
        com.conferenceroomscheduler.patterns.RoomSensor roomSensor4 = new com.conferenceroomscheduler.patterns.RoomSensor();
        chiefEventCoordinator3.registerObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor4);
        roomSensor4.update("Unverified badge detected for Cancelled.");
        roomSensor4.update("Booking complete");
        chiefEventCoordinator0.removeObserver((com.conferenceroomscheduler.patterns.RoomSensorObserver) roomSensor4);
        roomSensor4.update("Unverified badge detected for .");
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
        org.junit.Assert.assertNotNull(chiefEventCoordinator3);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Booking confirmed.", (int) (byte) 10, false, "Booking complete", "Unverified badge detected for Cancelled.");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher7 = new com.conferenceroomscheduler.patterns.CheckInPublisher();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor11 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean12 = occupancySensor11.isDetected();
        occupancySensor11.occupied = false;
        checkInPublisher7.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor11);
        boolean boolean16 = occupancySensor11.isDetected;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher17 = occupancySensor11.subject;
        occupancySensor11.isDetected = false;
        occupancySensor11.setOccupied(true);
        room6.setOccupancySensor(occupancySensor11);
        java.lang.String str23 = occupancySensor11.roomId;
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(checkInPublisher17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pending" + "'", str23, "Pending");
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
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
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor34 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
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
        occupancySensor34.setSubject(checkInPublisher44);
        occupancySensor17.subject = checkInPublisher44;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor62 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean63 = occupancySensor62.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher64 = null;
        occupancySensor62.subject = checkInPublisher64;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher66 = occupancySensor62.getSubject();
        checkInPublisher44.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor62);
        occupancySensor62.setDetected(true);
        room6.setOccupancySensor(occupancySensor62);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(checkInPublisher66);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
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
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod37 = reservation33.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + paymentMethod30 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod30.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertTrue("'" + paymentMethod37 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod37.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Cancelled", (int) 'a', true, "", "hi!");
        java.lang.String str7 = room6.getRoomId();
        room6.setRoomId("hi!");
        com.conferenceroomscheduler.model.StudentAccount studentAccount16 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        room6.checkIn((com.conferenceroomscheduler.model.Account) studentAccount16);
        boolean boolean18 = room6.isEnabled();
        room6.setRoomId("Booking complete");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor24 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        com.conferenceroomscheduler.model.StudentAccount studentAccount31 = new com.conferenceroomscheduler.model.StudentAccount("", "", "Cancelled", true, false, "");
        boolean boolean32 = occupancySensor24.detectOccupancy((com.conferenceroomscheduler.model.Account) studentAccount31);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher33 = null;
        occupancySensor24.setSubject(checkInPublisher33);
        occupancySensor24.isDetected = false;
        boolean boolean37 = occupancySensor24.isOccupied();
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
        occupancySensor24.subject = checkInPublisher51;
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor69 = new com.conferenceroomscheduler.model.OccupancySensor("Pending", false, false);
        boolean boolean70 = occupancySensor69.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher71 = null;
        occupancySensor69.subject = checkInPublisher71;
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher73 = occupancySensor69.getSubject();
        checkInPublisher51.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor69);
        boolean boolean75 = occupancySensor69.isDetected();
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher76 = occupancySensor69.getSubject();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor80 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher81 = null;
        occupancySensor80.setSubject(checkInPublisher81);
        occupancySensor80.setDetected(true);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher85 = occupancySensor80.subject;
        checkInPublisher76.registerObserver((com.conferenceroomscheduler.patterns.CheckInObserver) occupancySensor80);
        room6.setOccupancySensor(occupancySensor80);
        occupancySensor80.setRoomId("hi!");
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher90 = occupancySensor80.getSubject();
        boolean boolean91 = occupancySensor80.occupied;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(checkInPublisher73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(checkInPublisher76);
        org.junit.Assert.assertNull(checkInPublisher85);
        org.junit.Assert.assertNotNull(checkInPublisher90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        boolean boolean9 = reservation0.isExtended();
        reservation0.setReservationId("admin");
        java.time.LocalDateTime localDateTime12 = reservation0.getStartTime();
        boolean boolean13 = reservation0.isCanceled();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        reservation1.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod4 = reservation1.getPaymentMethod();
        reservation1.setFinalAmount((double) (byte) 1);
        java.time.LocalDateTime localDateTime7 = reservation1.getStartTime();
        com.conferenceroomscheduler.patterns.CancelBookingCommand cancelBookingCommand8 = new com.conferenceroomscheduler.patterns.CancelBookingCommand(roomSchedulerService0, reservation1);
        boolean boolean9 = cancelBookingCommand8.wasSuccessful();
        org.junit.Assert.assertNull(paymentMethod4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService1 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService12 = null;
        com.conferenceroomscheduler.model.Reservation reservation13 = new com.conferenceroomscheduler.model.Reservation();
        reservation13.setAccountType("hi!");
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod16 = reservation13.getPaymentMethod();
        reservation13.setFinalAmount((double) (byte) 1);
        java.lang.String str19 = reservation13.getRoomId();
        com.conferenceroomscheduler.patterns.CreateBookingCommand createBookingCommand20 = new com.conferenceroomscheduler.patterns.CreateBookingCommand(roomSchedulerService12, reservation13);
        reservation13.setHourlyRate((double) 0L);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod43 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation44 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime37, localDateTime38, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod43);
        com.conferenceroomscheduler.model.Reservation reservation45 = new com.conferenceroomscheduler.model.Reservation("admin", "", "Booking complete", "Pending", localDateTime27, localDateTime28, "", (double) 'a', (double) 10L, 0.0d, paymentMethod43);
        reservation13.setPaymentMethod(paymentMethod43);
        com.conferenceroomscheduler.model.Reservation reservation47 = new com.conferenceroomscheduler.model.Reservation("partner", "student", "", "student", localDateTime6, localDateTime7, "Unverified badge detected for Cancelled.", (double) (short) -1, 10.0d, 97.0d, paymentMethod43);
        java.time.LocalDateTime localDateTime48 = null;
        com.conferenceroomscheduler.patterns.ExtendBookingCommand extendBookingCommand49 = new com.conferenceroomscheduler.patterns.ExtendBookingCommand(roomSchedulerService1, reservation47, localDateTime48);
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand52 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation47, localDateTime50, localDateTime51);
        org.junit.Assert.assertNull(paymentMethod16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + paymentMethod43 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod43.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.conferenceroomscheduler.model.PaymentMethod paymentMethod20 = com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD;
        com.conferenceroomscheduler.model.Reservation reservation21 = new com.conferenceroomscheduler.model.Reservation("", "Booking confirmed.", "", "Checked in.", localDateTime14, localDateTime15, "Pending", (double) 100, 10.0d, (-1.0d), paymentMethod20);
        com.conferenceroomscheduler.model.Reservation reservation22 = new com.conferenceroomscheduler.model.Reservation("Booking confirmed.", "Booking confirmed.", "", "", localDateTime4, localDateTime5, "Booking complete", 0.0d, (double) 0, (double) 100.0f, paymentMethod20);
        boolean boolean23 = reservation22.isCanceled();
        reservation22.setTitle("faculty");
        double double26 = reservation22.getHourlyRate();
        org.junit.Assert.assertTrue("'" + paymentMethod20 + "' != '" + com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD + "'", paymentMethod20.equals(com.conferenceroomscheduler.model.PaymentMethod.CREDIT_CARD));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        com.conferenceroomscheduler.service.RoomSchedulerService roomSchedulerService0 = null;
        com.conferenceroomscheduler.model.Reservation reservation1 = new com.conferenceroomscheduler.model.Reservation();
        java.lang.String str2 = reservation1.getTitle();
        java.time.LocalDateTime localDateTime3 = reservation1.getStartTime();
        java.lang.String str4 = reservation1.getAccountType();
        boolean boolean5 = reservation1.isDepositLost();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        com.conferenceroomscheduler.patterns.EditBookingCommand editBookingCommand8 = new com.conferenceroomscheduler.patterns.EditBookingCommand(roomSchedulerService0, reservation1, localDateTime6, localDateTime7);
        // The following exception was thrown during execution in test generation
        try {
            editBookingCommand8.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.conferenceroomscheduler.service.RoomSchedulerService.editBooking(com.conferenceroomscheduler.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.service\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(localDateTime3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount6 = new com.conferenceroomscheduler.model.PartnerAccount("staff", "Unverified badge detected for admin.", "Verified badge detected for Checked in..", true, false, "Unverified badge detected for .");
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("admin", "hi!", "ADMIN-69", false, false, "staff");
        studentAccount6.setAccountType("");
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
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
        java.lang.String str39 = room6.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(checkInPublisher31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
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
        java.lang.String str31 = cancelledBookingState0.getName();
        org.junit.Assert.assertNotNull(bookingState5);
        org.junit.Assert.assertNotNull(bookingState6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cancelled" + "'", str8, "Cancelled");
        org.junit.Assert.assertNull(reservation13);
        org.junit.Assert.assertNotNull(bookingState18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Cancelled" + "'", str31, "Cancelled");
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        com.conferenceroomscheduler.patterns.RoomFactory roomFactory0 = new com.conferenceroomscheduler.patterns.RoomFactory();
        com.conferenceroomscheduler.model.Room room6 = roomFactory0.createRoom("hi!", "Booking complete", (int) (short) -1, "Booking confirmed.", "Booking confirmed.");
        com.conferenceroomscheduler.model.Room room12 = roomFactory0.createRoom("faculty", "Pending", (int) '#', "Cancelled", "Pending");
        com.conferenceroomscheduler.model.Room room18 = roomFactory0.createRoom("admin", "Booking complete", (int) (byte) 1, "hi!", "Checked in.");
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount25 = new com.conferenceroomscheduler.model.PartnerAccount("Booking complete", "student", "ADMIN-69", true, false, "hi!");
        room18.checkIn((com.conferenceroomscheduler.model.Account) partnerAccount25);
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor27 = room18.getOccupancySensor();
        java.lang.String str28 = occupancySensor27.roomId;
        org.junit.Assert.assertNotNull(room6);
        org.junit.Assert.assertNotNull(room12);
        org.junit.Assert.assertNotNull(room18);
        org.junit.Assert.assertNotNull(occupancySensor27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "admin" + "'", str28, "admin");
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        com.conferenceroomscheduler.model.StudentAccount studentAccount6 = new com.conferenceroomscheduler.model.StudentAccount("faculty", "partner", "student", false, false, "student");
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
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
        boolean boolean23 = reservation13.isCanceled();
        boolean boolean24 = reservation13.isExtended();
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
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
        java.lang.String str22 = bookingContext7.getStatus();
        com.conferenceroomscheduler.model.Reservation reservation23 = bookingContext7.getReservation();
        reservation23.setReservationId("Checked in.");
        java.lang.String str26 = reservation23.getUserId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pending" + "'", str1, "Pending");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cancelled" + "'", str9, "Cancelled");
        org.junit.Assert.assertNotNull(bookingState17);
        org.junit.Assert.assertNull(reservation18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cancelled" + "'", str20, "Cancelled");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cancelled" + "'", str22, "Cancelled");
        org.junit.Assert.assertNotNull(reservation23);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        com.conferenceroomscheduler.model.BadgeScan badgeScan3 = new com.conferenceroomscheduler.model.BadgeScan("", "Checked in.", true);
        java.lang.String str4 = badgeScan3.getBadgeId();
        java.lang.String str5 = badgeScan3.getBadgeId();
        java.lang.String str6 = badgeScan3.getRoomId();
        java.lang.String str7 = badgeScan3.getBadgeId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Checked in." + "'", str6, "Checked in.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setFinalAmount((double) (byte) 100);
        java.lang.String str3 = reservation0.getRoomId();
        reservation0.setFinalAmount((double) 10.0f);
        java.lang.String str6 = reservation0.getUserId();
        reservation0.setDepositAmount((double) (byte) 0);
        double double9 = reservation0.getHourlyRate();
        reservation0.setAccountType("");
        java.lang.String str12 = reservation0.getUserId();
        reservation0.setFinalAmount(0.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        com.conferenceroomscheduler.model.Room room6 = new com.conferenceroomscheduler.model.Room("", "Booking complete", (int) ' ', true, "", "ADMIN-69");
        java.lang.String str7 = room6.getName();
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor8 = room6.getOccupancySensor();
        room6.setRoomNumber("Booking confirmed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking complete" + "'", str7, "Booking complete");
        org.junit.Assert.assertNotNull(occupancySensor8);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        com.conferenceroomscheduler.model.OccupancySensor occupancySensor3 = new com.conferenceroomscheduler.model.OccupancySensor("", false, false);
        com.conferenceroomscheduler.patterns.CheckInPublisher checkInPublisher4 = null;
        occupancySensor3.setSubject(checkInPublisher4);
        boolean boolean6 = occupancySensor3.isDetected;
        boolean boolean7 = occupancySensor3.isDetected;
        boolean boolean8 = occupancySensor3.isDetected();
        occupancySensor3.setDetected(false);
        boolean boolean11 = occupancySensor3.isDetected;
        com.conferenceroomscheduler.model.PartnerAccount partnerAccount18 = new com.conferenceroomscheduler.model.PartnerAccount("Booking complete", "Checked in.", "Unverified badge detected for .", false, true, "Pending");
        partnerAccount18.setUniversityAccount(true);
        boolean boolean21 = occupancySensor3.detectOccupancy((com.conferenceroomscheduler.model.Account) partnerAccount18);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new com.conferenceroomscheduler.patterns.CreditCardPaymentStrategy();
        boolean boolean3 = creditCardPaymentStrategy0.processPayment("", 0.0d);
        boolean boolean6 = creditCardPaymentStrategy0.processPayment("Checked in.", 1.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
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
        com.conferenceroomscheduler.patterns.CompletedBookingState completedBookingState81 = new com.conferenceroomscheduler.patterns.CompletedBookingState();
        com.conferenceroomscheduler.model.Reservation reservation82 = null;
        com.conferenceroomscheduler.patterns.BookingContext bookingContext83 = new com.conferenceroomscheduler.patterns.BookingContext(reservation82);
        com.conferenceroomscheduler.patterns.CancelledBookingState cancelledBookingState84 = new com.conferenceroomscheduler.patterns.CancelledBookingState();
        bookingContext83.setState((com.conferenceroomscheduler.patterns.BookingState) cancelledBookingState84);
        completedBookingState81.handle(bookingContext83);
        // The following exception was thrown during execution in test generation
        try {
            pendingBookingState7.handle(bookingContext83);
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
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        com.conferenceroomscheduler.model.Reservation reservation0 = new com.conferenceroomscheduler.model.Reservation();
        reservation0.setAccountType("hi!");
        java.lang.String str3 = reservation0.getUserId();
        boolean boolean4 = reservation0.isDepositLost();
        reservation0.setHourlyRate(1.0d);
        double double7 = reservation0.getHourlyRate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        com.conferenceroomscheduler.model.FacultyAccount facultyAccount6 = new com.conferenceroomscheduler.model.FacultyAccount("Booking confirmed.", "Cancelled", "Booking complete", false, true, "Booking complete");
    }
}

