package com.thinking_in_java.chapter3;

public class EqualsMethod2 {

    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();

        System.out.print(v1.equals(v2));//false

    }

    private static class Value {
        int i;
    }
}
