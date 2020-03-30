import java.util.Date;
import java.util.Observable;


/**
 *
 * Concrete Subject
 * tallentaa tilan, josta konkreettiset observerit ovat kiinnostuneita
 *
 * Observable: Java built-in class
 * https://docs.oracle.com/javase/7/docs/api/java/util/Observable.html
 * Some of Observable class methods:
 * addObserver(Observer o)
 * deleteObserver(Observer o)
 * notifyObservers()
 * notifyObservers(Object args)
 * notify() "Inherited from class.java.land.Object
 * setChanged()
 */
public class ClockTimer extends Observable implements Runnable {
    private Date date;
    private int seconds;

    public ClockTimer() {
        date = new Date();
        seconds= date.getSeconds();

    }

    public int getHours(){
        return date.getHours();
    }
    public int getMinutes(){
        return date.getMinutes();
    }
    public int getSeconds(){ return date.getSeconds(); }

    // Sisäinen ajastin (voitaisiin toteuttaa säikeenä) kutsuu tick()-operaatiota
    //säännöllisin väliajoin.
    @Override
    public void run() {

        while (true) {
            tick();

        }
    }
    //tick() päivittää ClockTimerin sisäisen tilan ja kutsuu notify()-metodia
    //ilmoittaen observereilleen muutoksesta
    void tick(){
            date = new Date();
            if(seconds!= date.getSeconds()){
                seconds = date.getSeconds();
                setChanged();
                // Konkreettinen subjekti ilmoittaa observereille tilansa muutoksista
                notifyObservers();
            }
        }

     /*
    @Override
    public void notifyObservers() {
        DigitalClock dc = new DigitalClock(this);
        dc.update(this,seconds);

    }

      */





}
