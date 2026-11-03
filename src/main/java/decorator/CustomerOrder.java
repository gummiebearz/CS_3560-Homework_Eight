package decorator;

import java.util.ArrayList;

public class CustomerOrder {
    private final String customerName;
    private final ArrayList<Food> order;
    private final LoyaltyStatus loyaltyStatus;

    public CustomerOrder(String customerName, LoyaltyStatus loyaltyStatus) {
        this.customerName = customerName;
        this.loyaltyStatus = loyaltyStatus;
        this.order = new ArrayList<>();
    }

    public double getTotal() {
        double totalPrice = 0.0;

        for(Food food : order) {
            totalPrice += food.getCost();
        }

        return totalPrice;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void printOrder() {
        System.out.printf(">> Customer: %s\n", this.customerName);
        System.out.printf(">> Loyalty Status: %s\n\n", this.loyaltyStatus.toString());
        for(int i = 0; i < this.order.size(); i++) {
            System.out.printf("%d: ", i + 1);
            System.out.println(this.order.get(i).getDescription());
            System.out.println();
        }
    }

    public void addFoodToOrder(Food food) {
        this.order.add(food);
    }

    public double getDiscountedTotal() {
        return loyaltyStatus.applyDiscount(this.getTotal());
    }
}
