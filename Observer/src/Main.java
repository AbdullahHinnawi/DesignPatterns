import anotherWay.MyClockTimer;
import anotherWay.MyDigitalClock;

public class Main {


    public static void main(String[] args){


      // Using built-in Observer & Observable
     ClockTimer clockTimer = new ClockTimer();
     new Thread(clockTimer).start();
     new DigitalClock(clockTimer);






    /*
     // Using own Observer & Observable
     MyClockTimer myClockTimer = new MyClockTimer();
     new Thread(myClockTimer).start();
     new MyDigitalClock(myClockTimer);

     */











    }
}
