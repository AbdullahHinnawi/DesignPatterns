package decorator;

public class PizzaDough implements Pizza {
    @Override
    public double getPrice() {
        return 1.50;
    }

    @Override
    public String getDescription() {
        return "Pizza Dough";
    }
}
