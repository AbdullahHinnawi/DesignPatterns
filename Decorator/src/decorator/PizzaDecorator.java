package decorator;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizzaToBeDecorated;

    public PizzaDecorator(Pizza pizzaToBeDecorated){
        this.pizzaToBeDecorated = pizzaToBeDecorated;
    }
    public double getPrice(){
        return pizzaToBeDecorated.getPrice();
    }
    public String getDescription(){
        return pizzaToBeDecorated.getDescription();
    }


}
