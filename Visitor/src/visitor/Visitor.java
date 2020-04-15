package visitor;

import state.Charmander;
import state.Charmeleon;
import state.Pokemon;

// Visitor
public interface Visitor {

    void visit(Charmander charmander, Pokemon pokemon);
    void visit(Charmeleon charmeleon, Pokemon pokemon);


}
