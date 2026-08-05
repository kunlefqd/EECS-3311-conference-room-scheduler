package testAI_Assistant;

import com.conferenceroomscheduler.patterns.RoomSensor;
import com.conferenceroomscheduler.patterns.RoomSensorObserver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * AI-Generated Test Suite for RoomSensor
 * EECS 3311 Deliverable 3 - Task 3
 */
public class RoomSensorAITest {

    private RoomSensor sensor;
    private ByteArrayOutputStream outputStream;
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        sensor = new RoomSensor();
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }

    // --- Constructor & Inheritance Verification ---

    @Test
    public void testConstructorAndInterfaceImplementation() {
        assertNotNull("RoomSensor instance should not be null", sensor);
        assertTrue("RoomSensor must implement RoomSensorObserver interface", sensor instanceof RoomSensorObserver);
    }

    // --- Output Capture & Message Formatting Tests ---

    @Test
    public void testUpdatePrintsStandardMessageToConsole() {
        sensor.update("Room 101 occupied");

        String printed = outputStream.toString().trim();
        assertEquals("Sensor received: Room 101 occupied", printed);
    }

    @Test
    public void testUpdateWithEmptyString() {
        sensor.update("");

        String printed = outputStream.toString().trim();
        assertEquals("Sensor received:", printed);
    }

    @Test
    public void testUpdateWithNullMessage() {
        sensor.update(null);

        String printed = outputStream.toString().trim();
        assertEquals("Sensor received: null", printed);
    }

    @Test
    public void testMultipleSequentialUpdatesAccumulateInOutput() {
        sensor.update("Event 1: Motion Detected");
        sensor.update("Event 2: Room Cleared");

        String output = outputStream.toString();
        assertTrue("Output should capture first update", output.contains("Sensor received: Event 1: Motion Detected"));
        assertTrue("Output should capture second update", output.contains("Sensor received: Event 2: Room Cleared"));
    }

    @Test
    public void testUpdateWithSpecialCharactersAndNumbers() {
        String payload = "Temp: 22.5C | Occupancy: 100% | Status: OK!";
        sensor.update(payload);

        String printed = outputStream.toString().trim();
        assertEquals("Sensor received: " + payload, printed);
    }

    @Test
    public void testUpdateWithMultilineMessage() {
        String multilinePayload = "Header\nBody Details";
        sensor.update(multilinePayload);

        String printed = outputStream.toString();
        assertTrue("Output should capture multiline message body", printed.contains("Sensor received: Header\nBody Details"));
    }

    @Test
    public void testUpdateDoesNotThrowUncaughtExceptions() {
        try {
            sensor.update("Safe Execution Test");
        } catch (Exception e) {
            fail("update() method threw an unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testMultipleSensorInstancesPrintIndividually() {
        RoomSensor secondSensor = new RoomSensor();

        sensor.update("Sensor A triggered");
        secondSensor.update("Sensor B triggered");

        String output = outputStream.toString();
        assertTrue(output.contains("Sensor received: Sensor A triggered"));
        assertTrue(output.contains("Sensor received: Sensor B triggered"));
    }

    @Test
    public void testUpdateOutputEndsWithSystemLineSeparator() {
        sensor.update("Newline verification");

        String output = outputStream.toString();
        assertTrue("Output must end with System.lineSeparator()", output.endsWith(System.lineSeparator()));
    }
}