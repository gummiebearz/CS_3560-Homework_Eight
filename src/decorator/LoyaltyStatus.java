package decorator;

public class LoyaltyStatus {
    private Status status;

    public LoyaltyStatus(Status status) {
        this.status = status;
    }

    public double applyDiscount(double total) {
        double discount = 0.0; // For non-members

        switch(status) {
            case BRONZE:
                discount = 0.05;
                break;
            case SILVER:
                discount = 0.1;
                break;
            case GOLD:
                discount = 0.15;
                break;
        }

        return total - (total * discount);
    }
}
