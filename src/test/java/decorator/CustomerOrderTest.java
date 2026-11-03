package decorator;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerOrderTest {

    @Test
    public void testGetCustomerName() {
        CustomerOrder order = new CustomerOrder("Shiba Inu", new LoyaltyStatus(Status.NONE));
        assertEquals("Shiba Inu", order.getCustomerName());
    }

    @Test
    public void testAddFoodToOrder() {
        CustomerOrder order = new CustomerOrder("Shiba Inu", new LoyaltyStatus(Status.NONE));
        order.addFoodToOrder(new Pho());
        assertEquals(14.99, order.getTotal(), 0.001);
    }

    @Test
    public void testGetTotal() {
        CustomerOrder order = new CustomerOrder("Shiba Inu", new LoyaltyStatus(Status.NONE));
        order.addFoodToOrder(new Pho());
        order.addFoodToOrder(new Fries());
        assertEquals(19.98, order.getTotal(), 0.001);
    }

    @Test
    public void testGetDiscountedTotal() {
        CustomerOrder order = new CustomerOrder("Golden Retriever", new LoyaltyStatus(Status.GOLD));
        order.addFoodToOrder(new Pho());
        order.addFoodToOrder(new Fries());
        // 19.98 with 15% off
        assertEquals(16.983, order.getDiscountedTotal(), 0.001);
    }

    @Test
    public void testPrintOrder() {
        CustomerOrder order = new CustomerOrder("Shiba Inu", new LoyaltyStatus(Status.NONE));
        order.addFoodToOrder(new Fries());

        PrintStream oldOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        order.printOrder();
        System.setOut(oldOut);

        String output = out.toString();
        assertTrue(output.contains(">> Customer: Shiba Inu"));
        assertTrue(output.contains("1: Crispy waffle fries"));
    }
}
