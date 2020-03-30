package anotherWay;

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
public class MyDigitalClock implements MyObserver {

    private MyClockTimer myClockTimer;

    public MyDigitalClock(MyClockTimer cl){
        myClockTimer = cl;
        myClockTimer.attach(this);
    }
    @Override
    public void update(MyObservable myObservableChanged) {
        if(myObservableChanged == myClockTimer){
            draw();
        }
    }

    public void draw(){
        int hour = myClockTimer.getHours();
        int minute = myClockTimer.getMinutes();
        int second = myClockTimer.getSeconds();
        System.out.println("Clock: " + hour + ":" + minute + ":" + second);

    }
}
