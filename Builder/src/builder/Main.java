package builder;

public class Main {

    public static void main(String[] args){

        Waiter waiter = new Waiter();
        BurgerBuilder mcDonalds = new McDonalds();
        BurgerBuilder hesburger = new HesBurger();

        waiter.setBurgerBuilder(mcDonalds);
        waiter.constructBurger();
        System.out.println(waiter.getBurger());

        waiter.setBurgerBuilder(hesburger);
        waiter.constructBurger();
        System.out.println(waiter.getBurger());

    }
}
