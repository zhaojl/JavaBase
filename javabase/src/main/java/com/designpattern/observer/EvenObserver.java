package com.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 偶数观察者
 */
public class EvenObserver implements Observer {

    @Override
    public void update(Observable observable, Object o) {
        if(o == NumObservable.EVEN) {
            NumObservable numObservable = (NumObservable) observable;
            System.out.println("EvenObserver:Data has changed to " + numObservable.getData());
        }
    }
}
