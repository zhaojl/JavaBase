package com.thinking_in_java.chapter3;

import java.util.Random;

/**
 * 算术操作符:
 * 加+, 减-, 乘*, 除/, 取模%(从整数除法中产生余数)
 *
 * 整数除法会直接去掉结果的小数位, 而不是四舍五入的圆整结果.
 *
 * x+=4: 要将x加4, 并将结果赋回给x.
 * +=同时进行运算与赋值操作.
 *
 *
 */
public class MathOps {

    public static void main(String[] args) {

        //Create a seeded random number generator
        //随机数生成器的种子
        Random rand = new Random(47);

        int i, j, k;

        //Choose value from 1 to 100
        //
        j = rand.nextInt(100) + 1;
        System.out.println("j=" + j);

        k = rand.nextInt(100) + 1;
        System.out.println("k=" + k);

        i=j+k;
        System.out.println("j+k=" + i);

        i=j-k;
        System.out.println("j-k=" + i);

        i=k/j;
        System.out.println("k/j=" + i);

        i=k*j;
        System.out.println("k*j=" + i);

        i=k%j;
        System.out.println("k%j=" + i);

        j%=k;
        System.out.println("j%=k=" + j);

        //Floating-point number tests
        float u, v, w;
        v = rand.nextFloat();
        w = rand.nextFloat();
        System.out.println("v=" + v);
        System.out.println("w=" + w);

        u=v+w;
        System.out.println("v+w=" + u);

        u=v-w;
        System.out.println("v-w=" + u);

        u=v*w;
        System.out.println("v*w=" + u);

        u=v/w;
        System.out.println("v/w=" + u);


        u+=v;
        u-=v;
        u*=v;
        u/=v;



        //一元加,减操作符: 即正负, 转变数据的符号
        float x = -u;

        x = v*-w;

        x = v*(-w);






    }
}
