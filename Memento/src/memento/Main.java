package memento;

public class Main {

    public static void main(String[] args){

       Arvuuttaja arvuuttaja = Arvuuttaja.getInstance();

       for(int i = 1; i< 3 ; i++){
           Pelaaja pelaaja = new Pelaaja("pelaaja " + i);
           arvuuttaja.add(pelaaja);
           pelaaja.start();
       }


    }
}
