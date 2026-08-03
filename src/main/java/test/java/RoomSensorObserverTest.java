package com.conferenceroomscheduler.patterns;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoomSensorObserverTest {

    private TestObserver observer;

    private static class TestObserver implements RoomSensorObserver {

        private String lastMessage;

        @Override
        public void update(String message) {
            lastMessage = message;
        }

        public String getLastMessage() {
            return lastMessage;
        }
    }

    @Before
    public void setUp() {
        observer = new TestObserver();
    }

    @Test
    public void testUpdateStoresMessage() {
        observer.update("Hello");

        assertEquals("Hello", observer.getLastMessage());
    }

    @Test
    public void testUpdateWithEmptyMessage() {
        observer.update("");

        assertEquals("", observer.getLastMessage());
    }

    @Test
    public void testUpdateWithNullMessage() {
        observer.update(null);

        assertNull(observer.getLastMessage());
    }

    @Test
    public void testUpdateTwiceKeepsLatestMessage() {
        observer.update("One");
        observer.update("Two");

        assertEquals("Two", observer.getLastMessage());
    }

    @Test
    public void testObserverImplementsInterface() {
        assertTrue(observer instanceof RoomSensorObserver);
    }

    @Test
    public void testObserverObjectExists() {
        assertNotNull(observer);
    }

    @Test
    public void testDifferentMessages() {
        observer.update("ABC");

        assertNotEquals("XYZ", observer.getLastMessage());
    }

    @Test
    public void testLongMessage() {
        String message = "This is a long sensor notification.";

        observer.update(message);

        assertEquals(message, observer.getLastMessage());
    }

    @Test
    public void testNumericMessage() {
        observer.update("12345");

        assertEquals("12345", observer.getLastMessage());
    }

    @Test
    public void testSpecialCharacterMessage() {
        observer.update("Room #101!");

        assertEquals("Room #101!", observer.getLastMessage());
    }
}