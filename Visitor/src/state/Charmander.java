package state;

import visitor.Visitor;

// Concrete Element
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
    public void attack(Pokemon pokemon) {
        pokemon.addBonusPoints(10);
        System.out.println("Charmander is attacking");


    }

    @Override
    public void defend(Pokemon pokemon) {
        pokemon.addBonusPoints(5);
        System.out.println("Charmander is defending");
    }

    @Override
    public void accept(Visitor evolver, Pokemon pokemon){
        evolver.visit(this,pokemon);
    }




}