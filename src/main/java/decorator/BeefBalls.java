package decorator;

public class BeefBalls extends ToppingDecorator {
    private static final double PRICE = 2.99;

    public BeefBalls(Food food) {
        this.food = food;
    }

    @Override
    public double getCost() {
        return this.food.getCost() + PRICE;
    }

    @Override
    public String getDescription() {
        return this.food.getDescription() + "\n" + "Added: Beef Balls";
    }
}
