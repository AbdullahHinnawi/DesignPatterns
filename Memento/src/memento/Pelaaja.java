package memento;

import java.util.Random;

// Care taker
public class Pelaaja extends Thread {

    private Object object;
    private int number;
    private Arvuuttaja arvuuttaja;
    private String name;

    public Pelaaja(String name){
        this.name = name;
        this.arvuuttaja = Arvuuttaja.getInstance();
    }

    public void saveObject(Object object){

        this.object = object;

    }
    public boolean guess(){
        Random random = new Random();
        this.number = random.nextInt(10) + 1;
        System.out.println(name + " arvasi numero " + number);
        return arvuuttaja.ckeck(number, object);
    }

    public String tellYourName(){
        return name;
    }

    @Override
    public void run() {

        while (!guess()){
            guess();
            if(guess()){
                break;
            }
        }
    }

}
