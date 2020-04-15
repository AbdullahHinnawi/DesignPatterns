import state.Pokemon;
import visitor.Evolver;
import visitor.Visitor;

public class Main {

    public static void main(String[] arguments){

        // luo konkreettinen viisitor (Evolver)
        Visitor evolver = new Evolver();
        // käy oliorakenteen läpi visitorin avulla
        Pokemon pokemon = new Pokemon(evolver);

        for(int i = 0 ; i<5;i++){
            pokemon.attack();
            pokemon.defend();

        }






    }
}
