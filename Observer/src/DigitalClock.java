import java.util.Observable;
import java.util.Observer;


/**
 * Concrete Observer
 * Sisältää viitteen konkreettiseen subjektiin
 *
 * tallentaa tilan, jonka pitää olla yhdenmukainen
 * subjektin tilan kanssa
 *
 * Toteuttaa observerin päivitysrajapinnan, jolla tila
 * pidetään yhdenmukaisena subjektin tilan kanssa.
 */
public class DigitalClock implements Observer {

    private ClockTimer clockTimer;

    public DigitalClock(ClockTimer cl){
        clockTimer = cl;
        clockTimer.addObserver(this);
       // System.out.println("Concrete observer added");

    }
    /**
     * void update(Observable o,Object arg)
     * This method is called whenever the observed object is changed.
     * An application calls an Observable object's notifyObservers method to have all
     * the object's observers notified of the change.
     * @param o - the observable object.
     * @param arg - an argument passed to the notifyObservers method.
     */
    @Override
    public void update(Observable o, Object arg) {
                if(o == clockTimer){
                    draw();
                }

            }



    public void draw(){
        int hour = clockTimer.getHours();
        int minute = clockTimer.getMinutes();
        int second = clockTimer.getSeconds();
        System.out.println("Clock: " + hour + ":" + minute + ":" + second);


    }
}
