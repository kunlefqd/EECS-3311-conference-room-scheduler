package testAI_Assistant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.conferenceroomscheduler.patterns.Command;

public class CommandAITest {

    @Test
    public void should_ExecuteWithoutError() {
        Command command = () -> { };
        command.execute();
    }

    @Test
    public void should_AllowStateChangeInsideExecute() {
        StringBuilder log = new StringBuilder();
        Command command = () -> log.append("ran");
        command.execute();
        assertEquals("ran", log.toString());
    }

    @Test
    public void should_BeReusableAcrossMultipleCalls() {
        int[] count = {0};
        Command command = () -> count[0]++;
        command.execute();
        command.execute();
        assertEquals(2, count[0]);
    }

    @Test
    public void should_SupportDifferentBehaviorsPerInstance() {
        Command a = () -> { };
        Command b = () -> { };
        assertTrue(a != b);
    }
}