package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotificationChannelTest {

    @Test
    public void testEmailChannelSend() {
        NotificationChannel channel = new EmailChannel();
        assertDoesNotThrow(() -> channel.send("Hello"));
    }

    @Test
    public void testSmsChannelSend() {
        NotificationChannel channel = new SmsChannel();
        assertDoesNotThrow(() -> channel.send("Hello"));
    }

    @Test
    public void testPushChannelSend() {
        NotificationChannel channel = new PushChannel();
        assertDoesNotThrow(() -> channel.send("Hello"));
    }
}
