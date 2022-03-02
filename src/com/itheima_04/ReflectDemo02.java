package com.itheima_04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        Class<?> c = Class.forName("com.itheima_02.Student");

        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        System.out.println(obj);

//        Field nameField = c.getField("name");
        Field nameField = c.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(obj,"林青霞");
        System.out.println(obj);

        Field ageField = c.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(obj,30);
        System.out.println(obj);

        Field addressFidle = c.getDeclaredField("address");
        addressFidle.setAccessible(true);
        addressFidle.set(obj,"西安");
        System.out.println(obj);


    }
}
