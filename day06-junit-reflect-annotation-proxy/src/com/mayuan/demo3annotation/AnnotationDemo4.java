package com.mayuan.demo3annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationDemo4 {
    public static void main(String[] args) throws Exception {
        //目标：搞清楚注解的应用场景：模拟junit框架。有MyTest注解的方法就执行，没有的就不执行。
        AnnotationDemo4 ad = new AnnotationDemo4();
        //1。获取类对象
        Class c1 = AnnotationDemo4.class;
        //2.获取所有方法
        Method[] methods = c1.getMethods();
        //3.遍历所有方法,判断方法上是否有MyTest注解
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)) {
                //获取这个方法得属性
                MyTest myTest = method.getDeclaredAnnotation(MyTest.class);
                //获取属性值
                int count = myTest.count();
                //4.执行方法
                for (int i = 0; i < count; i++) {
                    method.invoke(ad);
                }
            }
        }
    }

    @MyTest
    public void test1() {
        System.out.println("test1");
    }

    public void test2() {
        System.out.println("test2");
    }

    @MyTest(count = 5)
    public void test3() {
        System.out.println("test3");
    }

    public void test4() {
        System.out.println("test4");
    }
}
