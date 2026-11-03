package decorator;

public class BaconBits extends ToppingDecorator {
    private static final double PRICE = 1.99;

    public BaconBits(Food food) {
        this.food = food;
    }

    @Override
    public double getCost() {
        return this.food.getCost() + PRICE;
    }

    @Override
    public String getDescription() {
        return this.food.getDescription() + "\n" + "Added: Bacon Bits";
    }
}
