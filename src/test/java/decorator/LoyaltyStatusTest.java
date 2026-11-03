package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoyaltyStatusTest {

    @Test
    public void testApplyDiscountNone() {
        LoyaltyStatus loyalty = new LoyaltyStatus(Status.NONE);
        assertEquals(100.0, loyalty.applyDiscount(100.0), 0.001);
    }

    @Test
    public void testApplyDiscountGold() {
        LoyaltyStatus loyalty = new LoyaltyStatus(Status.GOLD);
        assertEquals(85.0, loyalty.applyDiscount(100.0), 0.001);
    }

    @Test
    public void testToString() {
        assertEquals("Non-member", new LoyaltyStatus(Status.NONE).toString());
        assertEquals("Gold", new LoyaltyStatus(Status.GOLD).toString());
    }
}
