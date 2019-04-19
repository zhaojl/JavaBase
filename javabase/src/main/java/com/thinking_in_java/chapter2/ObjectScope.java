package com.thinking_in_java.chapter2;

/**
 * 作用域-Scope
 *
 * 作用域决定了对象的"可见性"及"存在时间", 作用域是由花括号的位置决定的
 *
 *
 */
public class ObjectScope {

    {
        String s = new String("a string");
    }
    /*作用域的终点那么句柄 s 会在作用域的终点处消失, 然而,s 指向的 String 对象依然占据着内存空间.
      在上面这段代码里,我们没有办法访问对象,因为指向它的唯一一个句柄已超出了作用域的边界.
      在后面的章节里,大家还会继续学习如何在程序运行期间传递和复制对象句柄.*/

    public static void main(String[] args) {

    }
}
