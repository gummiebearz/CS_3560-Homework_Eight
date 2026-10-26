package decorator;

public class Pho implements Food {
    private static final double BASE_PRICE = 14.99;
    @Override
    public double getCost() {
        return BASE_PRICE;
    }

    @Override
    public String getDescription() {
        return "House Special Beef Noodle soup with rare beef slices, brisket, flanks, tripes, and tendons";
    }
}
