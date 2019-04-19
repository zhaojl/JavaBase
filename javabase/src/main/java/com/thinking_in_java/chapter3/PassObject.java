package com.thinking_in_java.chapter3;

/**
 * 方法调用中的别名问题:
 * 将一个对象传递给方法时, 会产生别名问题.
 *
 *
 */
public class PassObject {

    static void f(Letter letter) {
        letter.c = 'z';
    }

    public static void main(String[] args) {
        Letter letter = new Letter();
        letter.c = 'a';
        System.out.println("letter.c=" + letter.c);

        f(letter);
        System.out.println("letter.c=" + letter.c);

    }
}
