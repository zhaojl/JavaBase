package com.thinking_in_java.chapter3;

/**
 * 测试对象的等价性
 */
public class Equivalence {

    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);

        //引用不相等
        System.out.println(n1 == n2);//false

        System.out.println(n1 != n2);//true

        //对象的实际内容相等
        System.out.println(n1.equals(n2));//true
    }
}
