package com.javabase;

import java.util.Optional;

public class OptionalTester {

    public static void main(String[] args) {
        Integer a = 12;
        Optional<Integer> optional = Optional.of(a);
        System.out.println(optional.isPresent());
    }
}
