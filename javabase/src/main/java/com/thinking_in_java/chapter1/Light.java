package com.thinking_in_java.chapter1;

/**
 * 类型/类的名称是Light
 * 特定的Light对象是lt
 */
public class Light {
    private int xx;

    private void on() {
        System.out.println("Light on...");

    }

    private void off() {
        System.out.println("Light off...");
    }

    private void brighten() {
        System.out.println("Light brighten...");
    }

    private void dim() {
        System.out.println("Light dim...");

    }


    private void variable() {

        //当变量作为类的成员使用时, Java才确保给定其默认值.
        System.out.println(xx);

        //对"局部变量", 在某个方法中定义的x得到的可能是任意值, 而不会被自动初始化为零,
        //所以在使用x前, 如果忘了对其赋一个适当的值, Java会在编译时返回一个错误, 告诉你此变量没有初始化.
        int x;
        //System.out.println(x);
    }


    public static void main(String[] args) {
        Light lt = new Light();
        lt.on();
        lt.off();
        lt.brighten();
        lt.dim();
    }
}
