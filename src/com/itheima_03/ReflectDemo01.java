package com.itheima_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> c = Class.forName("com.itheima_02.Student");

//        Constructor<?>[] cons = c.getConstructors();

        Constructor<?>[] cons = c.getDeclaredConstructors();

        for(Constructor con : cons){
            System.out.println(con);
        }
        System.out.println("--------");

        Constructor<?> con = c.getConstructor();

        Object obj = con.newInstance();
        System.out.println(obj);
//        Student s = new Student();
//        System.out.println(s);



    }
}
