package com.thinking_in_java.chapter3;

/**
 * 赋值:
 * 将一个对象赋值给另一个对象, 实际是将"引用"从一个地方复制到另一个地方.
 * 这意味着假若对对象使用c=d, 那么c和d都指向原本只有d指向的那个对象.
 *
 * 这种特殊的现象通常称作"别名现象", 是Java操作对象的一种基本方式.
 *
 * 注意: 为对象赋值可能会产生意想不到的后果.
 */
public class Assignment {

    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();

        t1.level = 9;
        t2.level = 47;
        System.out.println("t1.level=" + t1.level + ", t2.level=" + t2.level);

        t1.level = t2.level = 38;
        System.out.println("t1.level=" + t1.level + ", t2.level=" + t2.level);

        //在对t1赋值的时候, t1原本引用被覆盖,也就是丢失了;
        //而那个不再被引用的对象会由"垃圾回收器"自动清理
        t1 = t2;
        System.out.println("t1.level=" + t1.level + ", t2.level=" + t2.level);

        t1.level = 27;
        System.out.println("t1.level=" + t1.level + ", t2.level=" + t2.level);
    }
}
