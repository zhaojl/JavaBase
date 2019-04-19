package com.thinking_in_java.chapter3;

import java.util.Random;

public class BitManipulation {

    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt();
        int j = rand.nextInt();



    }

    private static void printBinaryInt(String s, int i) {
        System.out.println(s + ", int:" + i + ", binary:");
        System.out.println(Integer.toBinaryString(i));
    }

    private static void printBinaryLong(String s, long l) {
        System.out.println(s + ", long:" + l + ", binary:");
        System.out.println(Long.toBinaryString(l));
    }
}
