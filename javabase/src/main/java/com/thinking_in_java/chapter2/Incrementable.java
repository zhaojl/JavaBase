package com.thinking_in_java.chapter2;

public class Incrementable {
    Integer i = 12;

    static void increment() {
        StaticTest.i++;
        System.out.println(StaticTest.i);
    }

}
