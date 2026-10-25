package decorator;

public class BeefRibs extends ToppingDecorator{
    private static final double PRICE = 5.99;
    public BeefRibs(Food food) {
        this.food = food;
    }

    @Override
    public double getCost() {
        return this.food.getCost() + PRICE;
    }

    @Override
    public String getDescription() {
        return this.food.getDescription() + "\n" + "Added: Beef Ribs";
    }
}
