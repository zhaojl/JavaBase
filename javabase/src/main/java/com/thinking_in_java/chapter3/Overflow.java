package com.thinking_in_java.chapter3;

/**
 * 对两个足够大的int值执行乘法运算, 结果就会溢出.
 */
public class Overflow {

    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println(big);

        int bigger = big*4;
        System.out.println(bigger);

    }
}
