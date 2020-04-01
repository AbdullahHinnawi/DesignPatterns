package decorator;

public class Tuna extends PizzaDecorator {
    public Tuna(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }

    @Override
    public double getPrice() {
        return super.getPrice() +  3.75;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Tuna";
    }
}
