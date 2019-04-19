package com.thinking_in_java.chapter2;

public class Exercise1 {

    private int a;
    private char ch;

    private void print() {
        System.out.println(a);
        System.out.println(Integer.toHexString(ch) + "," +  Integer.toOctalString(ch) + ", " + ch);
    }

    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        exercise1.print();
    }
}
