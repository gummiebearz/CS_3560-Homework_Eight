package decorator;

public class GarlicParmesan extends ToppingDecorator {
    private static final double PRICE = 1.25;

    public GarlicParmesan(Food food) {
        this.food = food;
    }

    @Override
    public double getCost() {
        return this.food.getCost() + PRICE;
    }

    @Override
    public String getDescription() {
        return this.food.getDescription() + "\n" + "Added: Garlic Parmesan";
    }
}
