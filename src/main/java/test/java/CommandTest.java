package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.conferenceroomscheduler.patterns.CancelBookingCommand;
import com.conferenceroomscheduler.patterns.Command;
import com.conferenceroomscheduler.patterns.CreateBookingCommand;
import com.conferenceroomscheduler.patterns.EditBookingCommand;
import com.conferenceroomscheduler.patterns.ExtendBookingCommand;

public class CommandTest {

    @Test
    public void testLambdaImplementationExecutes() {
        final boolean[] wasCalled = {false};
        Command command = () -> wasCalled[0] = true;
        command.execute();
        assertTrue(wasCalled[0]);
    }

    @Test
    public void testAnonymousClassImplementationExecutes() {
        final int[] counter = {0};
        Command command = new Command() {
            @Override
            public void execute() {
                counter[0]++;
            }
        };
        command.execute();
        assertEquals(1, counter[0]);
    }

    @Test
    public void testExecuteCanBeCalledMultipleTimes() {
        final int[] counter = {0};
        Command command = () -> counter[0]++;
        command.execute();
        command.execute();
        command.execute();
        assertEquals(3, counter[0]);
    }

    @Test
    public void testNoOpImplementationDoesNotThrow() {
        Command command = () -> { };
        command.execute();
    }

    @Test
    public void testExceptionPropagatesFromExecute() {
        Command command = () -> {
            throw new RuntimeException("failure inside command");
        };
        try {
            command.execute();
            fail("Expected exception was not thrown");
        } catch (RuntimeException e) {
            assertEquals("failure inside command", e.getMessage());
        }
    }

    @Test
    public void testCommandReferenceCanHoldDifferentImplementations() {
        Command first = () -> { };
        Command second = () -> { };
        assertTrue(first instanceof Command);
        assertTrue(second instanceof Command);
    }

    @Test
    public void testCancelBookingCommandImplementsCommand() {
        Command command = new CancelBookingCommand(null, null);
        assertTrue(command instanceof Command);
    }

    @Test
    public void testEditBookingCommandImplementsCommand() {
        Command command = new EditBookingCommand(null, null, null, null);
        assertTrue(command instanceof Command);
    }

    @Test
    public void testExtendBookingCommandImplementsCommand() {
        Command command = new ExtendBookingCommand(null, null, null);
        assertTrue(command instanceof Command);
    }

    @Test
    public void testCreateBookingCommandImplementsCommand() {
        Command command = new CreateBookingCommand(null, null);
        assertTrue(command instanceof Command);
    }
}