package decorator;

public class Pasta implements Food {
    private static final double BASE_PRICE = 16.99;
    @Override
    public double getCost() {
        return BASE_PRICE;
    }

    @Override
    public String getDescription() {
        return "Creamy mushroom pasta";
    }
}
