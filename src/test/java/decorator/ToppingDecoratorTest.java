package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ToppingDecoratorTest {

    // Beef ribs (14.99 + 5.99)
    @Test
    public void testBeefRibsCost() {
        Food food = new BeefRibs(new Pho());
        assertEquals(20.98, food.getCost(), 0.001);
    }

    @Test
    public void testBeefRibsDescription() {
        Food food = new BeefRibs(new Pho());
        assertTrue(food.getDescription().contains("Added: Beef Ribs"));
    }

    // Beef balls (14.99 + 2.99)
    @Test
    public void testBeefBallsCost() {
        Food food = new BeefBalls(new Pho());
        assertEquals(17.98, food.getCost(), 0.001);
    }

    @Test
    public void testBeefBallsDescription() {
        Food food = new BeefBalls(new Pho());
        assertTrue(food.getDescription().contains("Added: Beef Balls"));
    }

    // Garlic parmesan (4.99 + 1.25)
    @Test
    public void testGarlicParmesanCost() {
        Food food = new GarlicParmesan(new Fries());
        assertEquals(6.24, food.getCost(), 0.001);
    }

    @Test
    public void testGarlicParmesanDescription() {
        Food food = new GarlicParmesan(new Fries());
        assertTrue(food.getDescription().contains("Added: Garlic Parmesan"));
    }

    // Chicken (16.99 + 6.99)
    @Test
    public void testChickenCost() {
        Food food = new Chicken(new Pasta());
        assertEquals(23.98, food.getCost(), 0.001);
    }

    @Test
    public void testChickenDescription() {
        Food food = new Chicken(new Pasta());
        assertTrue(food.getDescription().contains("Added: Chicken"));
    }

    // Bacon bits (4.99 + 1.99)
    @Test
    public void testBaconBitsCost() {
        Food food = new BaconBits(new Fries());
        assertEquals(6.98, food.getCost(), 0.001);
    }

    @Test
    public void testBaconBitsDescription() {
        Food food = new BaconBits(new Fries());
        assertTrue(food.getDescription().contains("Added: Bacon Bits"));
    }

    // two toppings on one food (16.99 + 1.25 + 6.99)
    @Test
    public void testTwoToppings() {
        Food food = new Chicken(new GarlicParmesan(new Pasta()));
        assertEquals(25.23, food.getCost(), 0.001);
    }
}
