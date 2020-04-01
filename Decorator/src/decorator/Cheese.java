package decorator;

public class Cheese extends PizzaDecorator {

    public Cheese(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2.75;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }
}
