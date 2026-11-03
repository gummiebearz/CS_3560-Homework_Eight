package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentNotificationTest {

    @Test
    public void testOnlinePaymentNotifyPayment() {
        PaymentNotification payment = new OnlinePaymentNotification(new EmailChannel());
        assertDoesNotThrow(() -> payment.notifyPayment());
    }

    @Test
    public void testCashOnDeliveryNotifyPayment() {
        PaymentNotification payment = new CashOnDeliveryPayment(new SmsChannel());
        assertDoesNotThrow(() -> payment.notifyPayment());
    }

    @Test
    public void testBitcoinNotifyPayment() {
        PaymentNotification payment = new BitcoinPayment(new PushChannel());
        assertDoesNotThrow(() -> payment.notifyPayment());
    }
}
