package decorator;

public class Pasta implements Food {
    @Override
    public double getCost() {
        return 18.99;
    }

    @Override
    public String getDescription() {
        return "Creamy mushroom pasta";
    }
}
