package com.thinking_in_java.chapter3;

/**
 * 移位操作符:
 * 操作的运算对象是二进制的"位", 移位操作符只可用来处理整数类型.
 *
 * 左移位操作符: <<  按照操作符右侧指定的位数将操作符左边操作数向左移动, 在低位补0
 *
 * "有符号"右移操作符: >>  按照操作符右侧指定的位数将操作符左边操作数向右移动.
 * "有符号"右移位操作符使用"符号扩展": 若符号为正, 则在高位插入0; 若符号为负, 则在高位插入1.
 *
 * "无符号"右移位操作符: >>>  使用"零扩展": 无论正负,都在高位插入0.
 *
 *
 * 如果对char, byte, short类型的数值进行移位处理, 那么在移位进行之前, 它们会被转换为int类型, 并且得到的结果也是一个int类型
 *
 * 移位与等号组合使用: <<= >>= >>>= 先移位, 再赋值.
 * 在进行"无符号"右移位结合赋值操作时, 可能会遇到一个问题: 如果对byte或short值进行这样的移位运算, 得到的可能不是正确的结果.
 * 因为它们会先被转换成int类型, 再进行右移操作, 然后被截断, 赋值给原来的类型, 在这种情况下可能得到-1的结果
 *
 */
public class URShift {

    public static void main(String[] args) {

        int i=-1;
        System.out.println(Integer.toBinaryString(i));

        i >>>= 10;//"无符号"右移
        System.out.println(Integer.toBinaryString(i));


        long l = -1;
        System.out.println(Long.toBinaryString(l));

        l >>>= 10;
        System.out.println(Long.toBinaryString(l));


        short s = -1;
        System.out.println(Integer.toBinaryString(s));

        s >>>= 10;
        System.out.println(Integer.toBinaryString(s));


        byte b = -1;
        System.out.println(Integer.toBinaryString(b));

        b >>>= 10;
        System.out.println(Integer.toBinaryString(b));


        b=-1;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(b >>> 10));



    }
}
