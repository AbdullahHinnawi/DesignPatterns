package state;

// Concrete state
// Singleton
// Implements a particular state behavior "Charizard behavior"
public class Charizard implements PokemonState {

    private static Charizard INSTANCE = null;

    private Charizard(){}
    public static Charizard getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Charizard();
        }
        return INSTANCE;
    }

    @Override
    public String tellYourName() {
        return "Charizard";

    }

    @Override
    public void jump() {

        System.out.println("Charizard is jumping");

    }

    @Override
    public void breathFire() {
        System.out.println("Charizard is breathing huge fire");
    }

}
