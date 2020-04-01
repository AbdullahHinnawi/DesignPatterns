package state;

public class Main {

    public static void main(String[] args){

        Pokemon pokemon = new Pokemon();

        for(int i = 0 ; i<5 ;i++) {
            System.out.println(pokemon.tellYourName());
            pokemon.fight();
            System.out.println("--------------------");

        }
    }
}
