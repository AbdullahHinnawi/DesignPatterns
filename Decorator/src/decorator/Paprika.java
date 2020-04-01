package decorator;

public class Paprika extends PizzaDecorator {
    public Paprika(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }

    @Override
    public double getPrice() {
        return super.getPrice() +  2.25;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Paprika";
    }
}
