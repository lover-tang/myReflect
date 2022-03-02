package com.itheima_04;

import com.itheima_02.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.itheima_02.Student");

        Field[] fields = c.getDeclaredFields();
        for(Field field : fields){
            System.out.println(field);
        }

        System.out.println("--------");

        Field addressField = c.getField("address");

        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

//        obj.addressField = "西安";

        addressField.set(obj,"西安");//给obj的成员变量addressField赋值为西安
        System.out.println(obj);


//        Student s = new Student();
//        s.address = "西安";
//        System.out.println(s);




    }
}
