package com.designpattern.observer;

/**
 * Java中奇偶数的判断
 *
 * 判断方法（奇数）：
 *
 *　错误判断方法： 通过 a%2==1来判断   原因：负奇数对2取余的结果为-1
 *
 *  正确判断方法：
 * (1) 通过 a%2！=0 来判断。
 * (2) 通过 (a&1)==1 来判断。（推荐使用，位操作，性能更优）
 */
public class OddOrEven {

    public static void main(String[] args) {
        int[] arr = {0, 11, -11, 20, -20};

        for (int d:arr) {
            System.out.println(isOdd1(d));
        }

        System.out.println("\n\n");
        for (int d:arr) {
            System.out.println(isOdd2(d));
        }

        System.out.println("\n\n");
        for (int d:arr) {
            System.out.println(isOdd(d));
        }
    }

    public static boolean isOdd1(int a) {
        if(a%2 == 1) {//是奇数
            return true;
        }
        return false;
    }

    public static boolean isOdd2(int a) {
        if(a%2 != 0) {//是奇数
            return true;
        }
        return false;
    }

    public static boolean isOdd(int a) {
        if((a&1) == 1) {//是奇数
            return true;
        }
        return false;
    }
}
