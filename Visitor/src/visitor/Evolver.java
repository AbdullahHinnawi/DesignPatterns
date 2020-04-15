package visitor;

import state.Charizard;
import state.Charmander;
import state.Charmeleon;
import state.Pokemon;

// Concrete visitor
public class Evolver implements Visitor {


    @Override
    public void visit(Charmander charmander, Pokemon pokemon) {

        int bonusPoints = pokemon.getBonusPoints();
        if(bonusPoints > 25){
           pokemon.setState(Charmeleon.getInstance());
           System.out.println("Charmander evolved to Charmeleon\n------------------------");

        }

    }

    @Override
    public void visit(Charmeleon charmeleon, Pokemon pokemon) {

        int bonusPoints = pokemon.getBonusPoints();
        if(bonusPoints > 50){
            pokemon.setState(Charizard.getInstance());
            System.out.println("Charmeleon evolved to Charizard\n------------------------");
        }

    }
}
