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
    public void jump() {
        System.out.println("Charmeleon is jumping");

    }

    @Override
    public void breathFire() {
        System.out.println("Charmeleon is breathing medium fire");

    }


}
