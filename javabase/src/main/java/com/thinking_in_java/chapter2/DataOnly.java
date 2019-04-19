package com.thinking_in_java.chapter2;

public class DataOnly {
    int i;
    double d;
    boolean b;

    int storage(String s) {
        return s.length()*2;
    }

    @Override
    public String toString() {
        return "DataOnly{" +
                "i=" + i +
                ", d=" + d +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {
        DataOnly dataOnly = new DataOnly();
        dataOnly.i = 47;
        dataOnly.d = 1.1;
        dataOnly.b = false;

        System.out.println(dataOnly);

        System.out.println(dataOnly.storage("abc"));
    }
}
