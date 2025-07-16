package com.mayuan.demo2reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        //目标：反射的基本作用。
        //1、类的全部成分的获取
        //2、可以破坏封装性
        //3、可以绕过泛型的约束。
        ArrayList<String> list = new ArrayList();
        list.add("马源");
        list.add("柴钰莹");
        list.add("郭玉");

        Class c1 = list.getClass(); // c1 = ArrayList.class
        //获取ArrayList 类的对象
        Method add = c1.getDeclaredMethod("add", Object.class);
        //触发List集合对象的add方法
        add.invoke(list, 9.9);
        add.invoke(list, true);

        System.out.println(list);



    }
}
