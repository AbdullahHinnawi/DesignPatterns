package state;

import visitor.Visitor;

// Element
// Visitorin kohde elementti
public interface PokemonState {

      void attack(Pokemon pokemon);
      void defend(Pokemon pokemon);
      void accept(Visitor evolver, Pokemon pokemon);

}
