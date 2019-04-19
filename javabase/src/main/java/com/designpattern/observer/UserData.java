package com.designpattern.observer;

import java.util.Observable;

public class UserData extends Observable {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        setChanged();
        notifyObservers();
    }
}
