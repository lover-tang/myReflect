package com.itheima_06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Student s = new Student();
//        s.study();

//        Teacher t = new Teacher();
//        t.teach();

        Properties prop = new Properties();
        FileReader fr = new FileReader("D:\\StudyData\\IDEA\\myReflect\\src\\com\\itheima_06\\class.txt");
        prop.load(fr);
        fr.close();

        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        Class<?> c = Class.forName(className);
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        Method m = c.getMethod(methodName);
        m.invoke(obj);

//        System.out.println("-----------");
//
//        File file = new File("jdbc.properties");
//        System.out.println(file.getPath());
//        System.out.println(file.getAbsolutePath());


    }
}
