package decorator;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<CustomerOrder> orders = new ArrayList<>();

        // Scenario 1 (Non-member)
        CustomerOrder nonMemberOrder = new CustomerOrder("Shiba Inu", new LoyaltyStatus(Status.NONE));

        nonMemberOrder.addFoodToOrder(new BeefRibs(new Pho()));
        nonMemberOrder.addFoodToOrder(new Chicken(new GarlicParmesan(new Pasta())));
        nonMemberOrder.addFoodToOrder(new Fries());

        orders.add(nonMemberOrder);

        // Scenario 2 (Gold member)
        CustomerOrder goldMemberOrder = new CustomerOrder("Golden Retriever", new LoyaltyStatus(Status.GOLD));

        goldMemberOrder.addFoodToOrder(new BeefRibs(new BeefBalls(new Pho())));
        goldMemberOrder.addFoodToOrder(new BaconBits(new GarlicParmesan(new Fries())));

        orders.add(goldMemberOrder);

        // Scenario 3 (Silver member)
        CustomerOrder silverMemberOrder = new CustomerOrder("Labrador", new LoyaltyStatus(Status.SILVER));

        silverMemberOrder.addFoodToOrder(new Pasta());
        silverMemberOrder.addFoodToOrder(new Chicken(new Pasta()));
        silverMemberOrder.addFoodToOrder(new Pho());
        silverMemberOrder.addFoodToOrder(new Fries());

        orders.add(silverMemberOrder);

        // Scenario 4 (Bronze member)
        CustomerOrder bronzeMemberOrder = new CustomerOrder("Husky",  new LoyaltyStatus(Status.BRONZE));

        bronzeMemberOrder.addFoodToOrder(new BaconBits(new Pasta()));
        bronzeMemberOrder.addFoodToOrder(new BeefRibs(new BeefRibs(new Pho())));
        bronzeMemberOrder.addFoodToOrder(new GarlicParmesan(new GarlicParmesan(new Fries())));

        orders.add(bronzeMemberOrder);

        // Calculate total price for each order
        for(int i = 0; i < orders.size(); i++) {
            CustomerOrder order = orders.get(i);
            System.out.println("----------------");
            System.out.printf("Order#%d\n", i + 1);
            System.out.println("----------------");
            order.printOrder();

            System.out.printf(">> Total Price Before Discount: %.2f\n", order.getTotal());
            System.out.printf(">> Total Price After Discount: %.2f\n", order.getDiscountedTotal());
        }
    }
}
