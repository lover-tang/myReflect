package com.itheima_05;

import com.itheima_02.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> c = Class.forName("com.itheima_02.Student");

        Method[] methods = c.getDeclaredMethods();
        for(Method method : methods){
            System.out.println(method);
        }

        System.out.println("--------");

        Method m = c.getMethod("method1");

        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

//        obj.m();

        m.invoke(obj);



//        Student s = new Student();
//        s.method1();



    }
}
