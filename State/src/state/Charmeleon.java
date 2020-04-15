package state;


// Concrete state
// Singleton
// Implements a particular state behavior "Charmeleon behavior"
public class Charmeleon implements PokemonState {

    private static Charmeleon INSTANCE = null;

    private Charmeleon() {

    }

    public static Charmeleon getInstance() {

        if(INSTANCE==null){
            INSTANCE = new Charmeleon();
        }
        return INSTANCE;
    }
    @Override
    public String tellYourName(){
        return"Charmeleon";
    }

    @Override
    public void attack() {
        System.out.println("Charmeleon is attacking");

    }

    @Override
    public void defend() {
        System.out.println("Charmeleon is defending");

    }


}
