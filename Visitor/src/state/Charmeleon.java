package state;

import visitor.Visitor;

// Concrete Element
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
    public void attack(Pokemon pokemon) {
        pokemon.addBonusPoints(20);
        System.out.println("charmeleon is attacking");
    }

    @Override
    public void defend(Pokemon pokemon) {
        pokemon.addBonusPoints(10);
        System.out.println("Charmeleon is defending");
    }

    @Override
    public void accept(Visitor evolver, Pokemon pokemon){
        evolver.visit(this, pokemon);
    }


}