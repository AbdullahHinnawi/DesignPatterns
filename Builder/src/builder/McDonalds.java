package builder;


// Concrete builder
public class McDonalds extends BurgerBuilder {

    // Tuote
    StringBuilder burger;

    @Override
    public void createNewBurger() {
        burger = new StringBuilder();

    }

    @Override
    public void buildBun() {
        burger.append("Mcdonalds bun, ");
    }

    @Override
    public void buildSauce() {
        burger.append("Mcdonalds sauce, ");

    }

    @Override
    public void buildPatty() {
        burger.append("Mcdonalds patty, ");
    }

    @Override
    public void buildCheese() {
        burger.append("Mcdonalds cheese.");

    }

    @Override
    public Object getBurger() {
        return burger;
    }
}
