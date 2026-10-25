package bridge;

// Abstract class that uses any channel of type `NotificationChannel`
// through the bridge field
// Reason for being abstract class is to allow creating any payment types
// that extends the `PaymentNotification` without changing the `NotificationChannel`
public abstract class PaymentNotification {
    protected NotificationChannel channel; // The Bridge
    public abstract void notifyPayment();
}
