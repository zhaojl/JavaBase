package com.thinking_in_java.chapter3;

public class Exponents {

    public static void main(String[] args) {
        float expFloat = 1.39e-43f;
        expFloat = (float) 1.39E-43;

        System.out.println(expFloat);

        double expDouble = 47e47d;//'d' is optional
        double expDouble2 = 47e47;//Automatically double
        System.out.println(expDouble);

    }
}
