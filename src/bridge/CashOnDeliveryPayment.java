package bridge;

public class CashOnDeliveryPayment extends PaymentNotification {
    public CashOnDeliveryPayment(NotificationChannel channel) {
        this.channel = channel;
    }

    @Override
    public void notifyPayment() {
        System.out.println("Payment on delivery. Please have cash ready on delivery.");
    }
}
