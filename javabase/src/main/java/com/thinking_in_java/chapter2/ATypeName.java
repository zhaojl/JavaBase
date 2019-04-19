package com.thinking_in_java.chapter2;

public class ATypeName {//类主体

    private int a;

    private int getA() {
        return a;
    }

    public static void main(String[] args) {
        ATypeName aTypeName = new ATypeName();
        System.out.println(aTypeName.getA());
    }
}
