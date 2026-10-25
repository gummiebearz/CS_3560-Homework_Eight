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
        System.out.println("Customer: " + this.customerName);
        for(Food food : order) {
            System.out.println(food.getDescription());
        }
    }

    public void addFoodToOrder(Food food) {
        this.order.add(food);
    }

    public double getDiscountedTotal() {
        return loyaltyStatus.applyDiscount(this.getTotal());
    }
}
