package state;


import visitor.Visitor;

// Object Structure
// Context
// Defines the interface used by clients
// Maintains a ConcreteState's object that defines the current state
// Pokemon or concrete state can define the state change
public class Pokemon {

    private PokemonState state;
    private Visitor evolver;
    private int bonusPoints;

    public Pokemon(Visitor evolver){
        this.evolver= evolver;
        // current state
        state = Charmander.getInstance();
        bonusPoints = 0;
    }

    public void attack(){
        state.attack(this);
        state.accept(evolver, this);

    }
    public void defend(){
        state.defend(this);
        state.accept(evolver, this);

    }

    public void setState(PokemonState s){
        state = s;
        bonusPoints = 0;

    }

    public int getBonusPoints() {
        return bonusPoints;
    }

    public void addBonusPoints(int bonusPoints){
        this.bonusPoints += bonusPoints;
    }





}
