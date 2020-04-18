package state;

import visitor.Visitor;

// Concrete Element
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
    public void attack(Pokemon pokemon) {
        pokemon.addBonusPoints(30);
        System.out.println("Charizard is attacking");

    }

    @Override
    public void defend(Pokemon pokemon) {
        pokemon.addBonusPoints(15);
        System.out.println("Charizard is defending");
    }

    @Override
    public void accept(Visitor evolver , Pokemon pokemon) {

        System.out.println("Charizard does not need visitors");
    }
}
