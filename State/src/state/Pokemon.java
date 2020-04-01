package state;

import java.util.Random;
// Defines the interface used by clients
// Maintains a ConcreteState's object that defines the current state
// Pokemon or concrete state can define the state change
public class Pokemon {

    private PokemonState state;

    public Pokemon(){
        // current state
        state = Charmander.getInstance();
    }
    public String tellYourName(){
         return state.tellYourName();
    }
    public void jump(){
        state.jump();
    }
    public void breathFire(){
         state.breathFire();
    }

    public void fight(){
        jump();
        breathFire();
        tryToEvolve();
    }
    // Joko Pokemon tai ConcreteState voi päättää,
    // mikä tila seuraa mitäkin tilaa missäkin tapauksessa.
    //Protected-suojaustaso tässä ei anna lupaa tilan vaihtamiseksi muualta
    //kuin samasta pakkauksesta tai aliluokasta.
    protected void tryToEvolve(){

        Random random = new Random();
        // generate randomly number between 1-3
        int number = random.nextInt(3) + 1;

        if(!state.tellYourName().equals("Charizard")) {
            System.out.println(state.tellYourName() + " is trying to evolve");
        }

        if(number == 2 && state.tellYourName().equals("Charmander")){
            state = Charmeleon.getInstance();
            System.out.println("Evolved to Charmeleon!");
        }else if(number == 3 && state.tellYourName().equals("Charmeleon")){
            state = Charizard.getInstance();
            System.out.println("Evolved to Charizard!");
        }
        else if(!state.tellYourName().equals("Charizard")){
            System.out.println("Failed");
        }

    }





}
