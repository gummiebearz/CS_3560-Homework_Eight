package bridge;

public class BitcoinPayment extends PaymentNotification {
    public BitcoinPayment(NotificationChannel channel) {
        this.channel = channel;
    }

    @Override
    public void notifyPayment() {
        System.out.println("Your Bitcoin payment was successful.");
    }
}
