package bridge;

public class OnlinePaymentNotification extends PaymentNotification {
    public OnlinePaymentNotification(NotificationChannel channel) {
        this.channel = channel;
    }

    @Override
    public void notifyPayment() {
        this.channel.send("Your online payment via was successful!");
    }
}
