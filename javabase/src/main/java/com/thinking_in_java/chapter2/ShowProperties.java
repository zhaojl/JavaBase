package com.thinking_in_java.chapter2;

import java.util.Properties;

public class ShowProperties {

    public static void main(String[] args) {

        System.out.println(System.getProperty("user.name"));

        System.out.println(System.getProperty("java.library.path"));



        //显示从运行程序的系统中获取的所有"属性", getProperties()可以提供运行环境信息
        Properties properties = System.getProperties();
        properties.list(System.out);



        System.out.println("\n--- Memory Usage:");
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.totalMemory() + ", " + runtime.freeMemory() + ", " + runtime.maxMemory());

    }
}
