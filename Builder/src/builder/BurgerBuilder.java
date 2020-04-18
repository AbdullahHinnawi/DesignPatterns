package builder;

// Abstract Builder
public abstract class BurgerBuilder {


    public abstract void createNewBurger();
    public abstract void buildBun();
    public abstract void buildSauce();
    public abstract void buildPatty();
    public abstract void buildCheese();
    public abstract Object getBurger();

}
