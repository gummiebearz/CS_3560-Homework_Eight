package decorator;

// Abstract decorator class that wraps any Food
public abstract class ToppingDecorator implements Food {
    protected Food food; // The food being wrapped

    public ToppingDecorator(Food food) {
        this.food = food;
    }
}
