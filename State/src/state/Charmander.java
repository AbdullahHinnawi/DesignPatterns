package state;

// Concrete state
// Singleton
// Implements a particular state behavior "Charmander behavior"
public class Charmander implements PokemonState {

    private static Charmander INSTANCE = null;

    private Charmander() {

    }

    public static Charmander getInstance() {

        if(INSTANCE==null){
            INSTANCE = new Charmander();
        }
        return INSTANCE;
    }

    @Override
    public String tellYourName() {

        return "Charmander";

    }

    @Override
    public void attack() {

        System.out.println("Charmander is attacking");
    }

    @Override
    public void defend() {
        System.out.println("Charmander is defending");

    }
}
