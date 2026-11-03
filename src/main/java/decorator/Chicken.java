package decorator;

public class Chicken extends ToppingDecorator {
    private static final double PRICE = 6.99;

    public Chicken(Food food) {
        this.food = food;
    }

    @Override
    public double getCost() {
        return this.food.getCost() + PRICE;
    }

    @Override
    public String getDescription() {
        return this.food.getDescription() + "\n" + "Added: Chicken";
    }
}
