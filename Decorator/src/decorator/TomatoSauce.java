package decorator;

public class TomatoSauce extends PizzaDecorator {
    public TomatoSauce(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.75;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Tomato Sauce";
    }
}
