package bridge;

public class CashOnDeliveryPayment extends PaymentNotification {
    public CashOnDeliveryPayment(NotificationChannel channel) {
        this.channel = channel;
    }

    @Override
    public void notifyPayment() {
        this.channel.send("Payment on delivery. Please have cash ready on delivery.");
    }
}
