package anotherWay;

import java.util.HashSet;
import java.util.Set;


public abstract class MyObservable {

     Set<MyObserver> observers = new HashSet<>();

    public void attach(MyObserver o){
        observers.add(o);
    }

    public void detach(MyObserver o){
        observers.remove(o);
    }

     protected void   notifyObservers(){
        for(MyObserver o : observers){
            o.update(this);

        }
    }
}
