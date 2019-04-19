package com.thinking_in_java.chapter2;

import com.thinking_in_java.chapter1.Circle;

/**
 *
 * 注意下面这两个方法的区别:
 *  根据对象的字段的内容来计算hash值: Object.hashCode()
 *  根据对象的内存地址来计算hash值: System.identityHashCode(object)
 *
 *
 * java.lang.System.java中对identityHashCode的说明及定义如下:
 *
 * Returns the same hash code for the given object as
 * would be returned by the default method hashCode(),
 * whether or not the given object's class overrides
 * hashCode().
 * The hash code for the null reference is zero.

 * public static int identityHashCode(Object x) {
 *    if (x == null) {
 *      return 0;
 *    }
 *    return Object.identityHashCode(x);
 * }
 *
 *
 *
 * 思考:
 *
 * identityHashCode与偏向锁
 *
 * java中引用的内存地址和值
 *
 *
 * 优秀文章:
 * https://juejin.im/post/5c3aa2726fb9a04a0c2ead0b
 */
public class ObjectHashcode {

    public static void main(String[] args) {

        String s1 = "aaa";
        System.out.println(s1.hashCode());
        System.out.println(System.identityHashCode(s1));



        System.out.println("\n\n");
        Circle circle = new Circle();
        System.out.println(circle.hashCode());
        System.out.println(System.identityHashCode(circle));



        System.out.println("\n\n");
        //s2, s3是在常量池里面的，所以它们的内存地址也会相等，所以调用identityHashCode方法返回值相等
        String s2 = "hhh";
        String s3 = "hhh";
        System.out.println(s2 == s3);
        System.out.println(s2.equals(s3));
        //因为String对象需要根据对象的字段的内容来计算hash值，复写了hashCode()方法，所以以下代码会输出相同
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        //如果一个对象覆盖了hashCode()方法，我们仍然想获得它的内存地址计算的Hash值，应该使用java.lang.System类提供的identityHashCode方法
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(s2);
        System.out.println(s3);



        //s4, s5是在堆里面的，所以调用identityHashCode方法返回值不相等
        System.out.println("\n\n");
        String s4 = new String("hhh");
        String s5 = new String("hhh");
        System.out.println(s4 == s5);
        System.out.println(s4.equals(s5));
        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());
        System.out.println(System.identityHashCode(s4));
        System.out.println(System.identityHashCode(s5));
        System.out.println(s4);
        System.out.println(s5);



        System.out.println("\n\n");
        Integer a = 12;
        Integer b = 24;
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));


    }

}
