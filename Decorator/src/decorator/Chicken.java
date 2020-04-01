package decorator;

public class Chicken extends PizzaDecorator {

    public Chicken(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+ 3.25;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Chicken";
    }
}
