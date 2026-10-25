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

        System.out.println("PART 1:");
        System.out.println("=======");
        display(notifications);

        // Part 2
        notifications.clear();

        // Scenario 1: Bitcoin payment & Email notification
        notifications.add(new BitcoinPayment(new EmailChannel()));
        // Scenario 2: Bitcoin payment & SMS notification
        notifications.add(new BitcoinPayment(new SmsChannel()));

        System.out.println();
        System.out.println("PART 2:");
        System.out.println("=======");
        display(notifications);

        // Part 3
        notifications.clear();

        // Scenario 1: Online payment & Push notification
        notifications.add(new OnlinePaymentNotification(new PushChannel()));

        // Scenario 2: Cash payment & Push notification
        notifications.add(new CashOnDeliveryPayment(new PushChannel()));

        System.out.println();
        System.out.println("PART 3:");
        System.out.println("=======");
        display(notifications);
    }

    public static void display(ArrayList<PaymentNotification> notifications) {
        for(int i = 0; i < notifications.size(); i++) {
            System.out.printf("Scenario %d: \n", i + 1);
            notifications.get(i).notifyPayment();
        }
    }
}
