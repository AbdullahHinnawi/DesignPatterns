package decorator;

public class Main {

    public static void main(String[] args){

        Pizza chickenPizza = new Chicken(new Paprika(new Cheese(new TomatoSauce(new PizzaDough()))));

        Pizza tunaPizza = new Tuna(new Paprika(new TomatoSauce(new PizzaDough())));

        Pizza vegetarianPizza = new Paprika(new Cheese(new TomatoSauce(new PizzaDough())));

        System.out.println("Pizza Menu:");
        System.out.println("Chicken Pizza             "  + chickenPizza.getPrice() + " €" + "\n" + chickenPizza.getDescription() + "\n" );
        System.out.println("Tuna Pizza                "  + tunaPizza.getPrice() + " €" + "\n" + tunaPizza.getDescription()+ "\n"  );
        System.out.println("Vegetarian Pizza          "  + vegetarianPizza.getPrice() + " €" + "\n" + vegetarianPizza.getDescription()+ "\n"  );


    }
}
