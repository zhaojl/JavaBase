package com.designpattern.observer;

public class UserDataTest {

    public static void main(String[] args) {
        UserData data = new UserData();
        data.addObserver(new UserDataObserver());

        data.setUserName("ZhangSan");
        data.setUserName("LiSi");
    }
}
