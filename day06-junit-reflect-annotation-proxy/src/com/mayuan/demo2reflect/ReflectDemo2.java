package com.mayuan.demo2reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo2 {
    //目标：获取类的信息
    @Test
    public void getClassInfo() {
        //1、反射第一步：获取C1ass对象，代表拿到类。
        Class c1 = Student.class;
        System.out.println(c1.getName()); //获取类名的全类名
        System.out.println(c1.getSimpleName()); //获取类名
    }

    //获取类的构造器对象并操作。
    @Test
    public void getConstructorInfo() throws Exception {
        //目标：获取类的构造器对象并对其进行操作。
        //1、反射第一步：或者C1ass对象，代表拿到类。
        Class c2 = Dog.class;
        //2.获取构造器对象
        Constructor[] cons = c2.getConstructors();
        for (Constructor con : cons) {
            System.out.println(con.getName() + "(" + con.getParameterCount() + ")");
        }

        //3.获取单个构造器
        Constructor con = c2.getDeclaredConstructor(); //获取无参构造器
        System.out.println(con.getName() + "(" + con.getParameterCount() + ")");

        Constructor con2 = c2.getDeclaredConstructor(String.class, int.class); //获取有参构造器
        System.out.println(con2.getName() + "(" + con2.getParameterCount() + ")");

        //4.获取构造器作用依然是创建对象，创建对象
        con.setAccessible(true);
        //暴力反射：暴力反射可以访问私有的构造器、方法、属性。
        Dog d1 = (Dog) con.newInstance();
        System.out.println(d1);
    }

    //获取类的成员变量对象并操作。
    @Test
    public void getFieldInfo() throws Exception {
        //目标：获取类的成员变量对象并操作。
        Class c1 = Dog.class;
        //2.获取成员变量对象
        Field[] fields = c1.getFields();
        for (Field field : fields) {
            System.out.println(field.getName() + "(" + field.getType() + ")");
        }

        //3.获取单个成员变量对象
        Field field = c1.getDeclaredField("name");
        System.out.println(field.getName() + "(" + field.getType() + ")");

        Field field2 = c1.getDeclaredField("age");
        System.out.println(field2.getName() + "(" + field2.getType() + ")");

        //4.获取成员变量作用依然是取值赋值
        Dog d = new Dog("小黄", 2);
        field.setAccessible(true);
        field.set(d, "社交"); //d.setHobby("社交")
        System.out.println(d);

        String hobby = (String) field.get(d); //d.getHobby()
        System.out.println(hobby);
    }

    //获取类的成员方法对象并操作。
    @Test
    public void getMethodInfo() throws Exception {
        //目标：获取类的成员方法对象并操作。
        Class c1 = Dog.class;
        //2.获取成员方法对象
        Method[] methods = c1.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + "(" + method.getParameterCount() + ")");
        }

        //3.获取单个成员方法对象
        Method method = c1.getDeclaredMethod("show", String.class); //获取有参方法
        System.out.println(method.getName() + "(" + method.getParameterCount() + ")");
        Method method2 = c1.getDeclaredMethod("show"); //获取无参方法
        System.out.println(method2.getName() + "(" + method2.getParameterCount() + ")");

        //4.获取成员方法作用依然是调用方法
        Dog d = new Dog("小黄", 2);
        method.setAccessible(true); //暴力反射
        Object result1 = method.invoke(d); //d.show() 唤醒d的show方法执行

        Object result2 = method.invoke(d, "show");
        System.out.println(result2);
    }
}

