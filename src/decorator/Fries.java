package decorator;

public class Fries implements Food {
    private static final double BASE_PRICE = 4.99;
    @Override
    public double getCost() {
        return BASE_PRICE;
    }

    @Override
    public String getDescription() {
        return "Crispy waffle fries";
    }
}
