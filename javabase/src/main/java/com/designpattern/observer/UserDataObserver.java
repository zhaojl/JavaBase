package com.designpattern.observer;

import com.designpattern.observer.UserData;

import java.util.Observable;
import java.util.Observer;

public class UserDataObserver implements Observer {

    @Override
    public void update(Observable observable, Object o) {
        UserData data = (UserData) observable;
        System.out.println("Data has been changed to: " + data.getUserName());
    }
}
