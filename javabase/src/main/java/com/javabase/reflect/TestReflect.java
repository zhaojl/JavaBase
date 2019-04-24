package com.javabase.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class TestReflect {

    public static void main(String[] args) {

        Student stu = new Student();

        Class clazz = stu.getClass();
        System.out.println(clazz.getSuperclass());

        Type superclass = clazz.getGenericSuperclass();
        System.out.println(superclass);

        ParameterizedType p = (ParameterizedType)superclass;

        Type type = p.getActualTypeArguments()[0];
        System.out.println(type + "\n\n");



        System.out.println(new TypeWrapper<TypeObj>(){}.getType());
    }
}
