package bridge;

// Abstract class that implements any type of `NotificationChannel`
// Reason for being abstract class is to allow creating any payment types
// that extends the `PaymentNotification` without changing the `NotificationChannel`
public abstract class PaymentNotification {
    protected NotificationChannel channel; // The Bridge
    public abstract void notifyPayment();
}
