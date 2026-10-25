package decorator;

public class Pho implements Food {
    @Override
    public double getCost() {
        return 15.99;
    }

    public String getDescription() {
        return "House Special Beef Noodle soup with rare beef slices, brisket, flanks, tripes, and tendons";
    }
}
