package com.designpattern.observer;

import java.util.Observable;

/**
 * 被观察者
 */
public class NumObservable extends Observable {
    public static final Integer ODD = 1;
    public static final Integer EVEN = 2;

    private int data;

    public int getData() {
        return data;
    }

    public void setData(int i) {
        this.data = i;
        Integer flag = EVEN;
        if((data & 0x0001) == 1 ) {
            flag = ODD;
        }
        setChanged();
        notifyObservers(flag);
    }

    public static void main(String[] args) {
        NumObservable observable = new NumObservable();

        observable.addObserver(new OddObserver());
        observable.addObserver(new EvenObserver());

        observable.setData(11);
        observable.setData(12);
        observable.setData(13);

    }
}
