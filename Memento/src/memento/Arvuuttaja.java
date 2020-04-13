package memento;

import java.util.Random;

//Orginator
public class Arvuuttaja {

    private static Arvuuttaja INSTANCE = null;

    private Arvuuttaja(){

    }

    public static Arvuuttaja getInstance(){
        if(INSTANCE == null){
            return INSTANCE = new Arvuuttaja();
        }
        return INSTANCE;
    }

    public  void add(Pelaaja pelaaja){
        Random random = new Random();
        // generate number between 1-10
        int number = random.nextInt(10) + 1;
        System.out.println("Arvuuttaja asettaa numero " + number + " pelaajalle " + pelaaja.tellYourName());
        pelaaja.saveObject(new Memento(number));
    }

    public boolean ckeck(int number, Object object){
        Memento memento = (Memento) object;
        if(memento.getNumberToGuess() == number){
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;

    }



    // Memento on sisäluokka, josta ulkomaailma ei tiedä mitään.
    private class Memento{
        private int numberToGuess;

        public Memento(int numberToGuess){

            this.numberToGuess = numberToGuess;
        }
        public int getNumberToGuess(){
            return numberToGuess;
        }


    }


}
