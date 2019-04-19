package com.thinking_in_java.chapter2;

import java.io.IOException;

public class StaticTest {
    static String s = "abc";

    static int i = 47;

    public static void main(String[] args) throws IOException {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();

        System.out.println(st1.s.hashCode());
        System.out.println(st2.s.hashCode());

        System.out.println(st1.i);
        System.out.println(st2.i);

        Incrementable.increment();
        System.out.println(st1.i);
        System.out.println(st2.i);

        int a = 0;
        System.out.println("请输入a：");
        a = System.in.read();
        System.out.println("a = " + a);
        System.out.println("(char)a=" + (char)a);
    }
}
