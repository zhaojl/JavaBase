package com.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 奇数观察者
 */
public class OddObserver implements Observer {

    @Override
    public void update(Observable observable, Object o) {
        if(o == NumObservable.ODD) {
            NumObservable numObservable = (NumObservable) observable;
            System.out.println("OddObserver:Data has changed to " + numObservable.getData());

        }
    }
}
