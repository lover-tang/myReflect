package com.itheima_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.itheima_02.Student");

        Constructor<?> con = c.getDeclaredConstructor(String.class);

        //暴力反射
        con.setAccessible(true);

        Object obj = con.newInstance("林青霞");
        System.out.println(obj);


    }
}
