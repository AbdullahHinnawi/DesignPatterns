package builder;

public class Waiter {

    private BurgerBuilder burgerBuilder;

    public void setBurgerBuilder(BurgerBuilder bb){

        burgerBuilder = bb;
    }
    public Object getBurger(){

        return burgerBuilder.getBurger();
    }

    public void constructBurger(){
        burgerBuilder.createNewBurger();
        burgerBuilder.buildBun();
        burgerBuilder.buildSauce();
        burgerBuilder.buildPatty();
        burgerBuilder.buildCheese();

    }
}
