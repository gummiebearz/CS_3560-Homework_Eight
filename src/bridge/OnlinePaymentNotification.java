package bridge;

public class OnlinePaymentNotification extends PaymentNotification {
    private final String paymentMethod;

    public OnlinePaymentNotification(NotificationChannel channel, String paymentMethod) {
        this.channel = channel;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public void notifyPayment() {
        this.channel.send("Your online payment via " + paymentMethod + " was successful!");
    }

    public String getPaymentMethod () {
        return paymentMethod;
    }
}
