package anotherWay;

import java.util.Date;


/**
 *
 * Concrete Subject
 * tallentaa tilan, josta konkreettiset observerit ovat kiinnostuneita
 */
public class MyClockTimer extends MyObservable implements Runnable {
    private Date date;
    private int seconds;

    public MyClockTimer() {
        date = new Date();
        seconds= date.getSeconds();
    }

    public int getHours(){
        return date.getHours();
    }
    public int getMinutes(){
        return date.getMinutes();
    }
    public int getSeconds(){
        return date.getSeconds();
    }
    // Sisäinen ajastin (voitaisiin toteuttaa säikeenä) kutsuu tick()-operaatiota
    //säännöllisin väliajoin.
    @Override
    public void run() {

        while(true) {
            tick();
        }
    }
    //tick() päivittää ClockTimerin sisäisen tilan ja kutsuu notify()-metodia
    //ilmoittaen observereilleen muutoksesta
    void tick(){
            date = new Date();
           if(seconds != date.getSeconds()){
               seconds= date.getSeconds();
               notifyObservers();
           }


    }





}
