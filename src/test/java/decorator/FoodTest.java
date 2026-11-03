package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FoodTest {

    // Pho
    @Test
    public void testPhoCost() {
        Food pho = new Pho();
        assertEquals(14.99, pho.getCost(), 0.001);
    }

    @Test
    public void testPhoDescription() {
        Food pho = new Pho();
        assertTrue(pho.getDescription().contains("Beef Noodle soup"));
    }

    // Pasta
    @Test
    public void testPastaCost() {
        Food pasta = new Pasta();
        assertEquals(16.99, pasta.getCost(), 0.001);
    }

    @Test
    public void testPastaDescription() {
        Food pasta = new Pasta();
        assertEquals("Creamy mushroom pasta", pasta.getDescription());
    }

    // Fries
    @Test
    public void testFriesCost() {
        Food fries = new Fries();
        assertEquals(4.99, fries.getCost(), 0.001);
    }

    @Test
    public void testFriesDescription() {
        Food fries = new Fries();
        assertEquals("Crispy waffle fries", fries.getDescription());
    }
}
