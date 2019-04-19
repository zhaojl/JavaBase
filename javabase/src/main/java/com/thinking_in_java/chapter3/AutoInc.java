package com.thinking_in_java.chapter3;

import java.util.Random;

/**
 * 自动递增和递减:
 * 递减操作符: --  "减少一个单位" 前缀式和后缀式
 * 递增操作符: ++  "增加一个单位" 前缀式和后缀式
 *
 * ++a 等价于 a=a+1
 *
 *  前缀递增/前缀递减:先执行运算,再生成值
 *  后缀递增/后缀递减:先生成值,在执行运算
 *
 * 它们是除那些涉及赋值的操作符以外, 唯一具有"副作用"的操作符, 不仅改变了变量, 而且以变量的值作为生成的结果.
 */
public class AutoInc {

    public static void main(String[] args) {


        int i=1;
        System.out.println("i=" + i);

        System.out.println("++i=" + ++i);//2 Pre-increment
        System.out.println("i++=" + i++);//2 Post-increment

        System.out.println("--i=" + --i);//2 Pre-decrement
        System.out.println("i--=" + i--);//2 Post-decrement
        System.out.println("i=" + i);//1






    }
}
