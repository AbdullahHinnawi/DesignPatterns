package builder;


import builder.ingredients.*;

import java.util.ArrayList;
import java.util.List;

// Concrete Builder
public  class HesBurger extends BurgerBuilder {

    // Tuote
    private List<HesburgerIngredients> burger;

    @Override
    public void createNewBurger() {
        burger = new ArrayList<>();
    }

    @Override
    public void buildBun() {

        burger.add(new HesHesburgerBun());
    }

    @Override
    public void buildSauce() {
        burger.add(new HesburgerSauce());
    }

    @Override
    public void buildPatty() {
       burger.add(new HesBurgerPatty());

    }

    @Override
    public void buildCheese() {

        burger.add(new HesburgerCheese());

    }

    public Object getBurger(){
        return  burger;
    }
}
