package test.java;

import com.conferenceroomscheduler.patterns.RoomSensor;
import com.conferenceroomscheduler.patterns.RoomSensorObserver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class RoomSensorTest {

    private RoomSensor sensor;
    private ByteArrayOutputStream output;

    @Before
    public void setUp() {
        sensor = new RoomSensor();

        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @After
    public void tearDown() {
        System.setOut(System.out);
    }

    @Test
    public void testUpdatePrintsMessage() {
        sensor.update("Room occupied");

        assertTrue(output.toString().contains("Sensor received: Room occupied"));
    }

    @Test
    public void testUpdateWithEmptyMessage() {
        sensor.update("");

        assertTrue(output.toString().contains("Sensor received: "));
    }

    @Test
    public void testUpdateWithNullMessage() {
        sensor.update(null);

        assertTrue(output.toString().contains("Sensor received: null"));
    }

    @Test
    public void testMultipleUpdates() {
        sensor.update("One");
        sensor.update("Two");

        String result = output.toString();
        assertTrue(result.contains("Sensor received: One"));
        assertTrue(result.contains("Sensor received: Two"));
    }

    @Test
    public void testUpdateDoesNotThrowException() {
        sensor.update("Testing");
    }

    @Test
    public void testImplementsRoomSensorObserver() {
        assertTrue(sensor instanceof RoomSensorObserver);
    }

    @Test
    public void testDifferentMessagesProduceDifferentOutput() {
        sensor.update("ABC");

        assertFalse(output.toString().contains("XYZ"));
    }

    @Test
    public void testOutputStartsCorrectly() {
        sensor.update("Hello");

        assertTrue(output.toString().startsWith("Sensor received:"));
    }

    @Test
    public void testOutputEndsWithMessage() {
        sensor.update("Done");

        assertTrue(output.toString().trim().endsWith("Done"));
    }

    @Test
    public void testNewRoomSensorObject() {
        RoomSensor newSensor = new RoomSensor();

        assertNotNull(newSensor);
    }
}