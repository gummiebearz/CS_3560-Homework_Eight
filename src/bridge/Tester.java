package bridge;

import java.util.ArrayList;

public class Tester {
    public static void main() {
        ArrayList<PaymentNotification> notifications = new ArrayList<>();

        // Scenario 1: Online payment & Email notification
        notifications.add(new OnlinePaymentNotification(new EmailChannel()));

        // Scenario 2: Online payment & SMS notification
        notifications.add(new OnlinePaymentNotification(new SmsChannel()));

        // Scenario 3: Cash payment & Email notification
        notifications.add(new CashOnDeliveryPayment(new EmailChannel()));

        // Scenario 4: Cash payment & SMS notification
        notifications.add(new CashOnDeliveryPayment(new SmsChannel()));

        for(PaymentNotification notification : notifications) {
            notification.notifyPayment();
        }
    }
}
