package com.mayuan.demo3annotation;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class AnnotationDemo3 {
    //目标：解析注解
    @Test
    public void parseAnnotation() {
        //1.获取类对象
        Class c1 = Demo.class;
        //2,使用isAnnotationPresent方法判断Demo类上是否有MyTest2注解
        if(c1.isAnnotationPresent(MyTest2.class)){
            //3.获取注解对象
            MyTest2 myTest2 = (MyTest2) c1.getAnnotation(MyTest2.class);

            //4.获取注解的属性值
            String[] address = myTest2.address();
            double height = myTest2.price();
            String name = myTest2.value();

            //5.打印属性值
            System.out.println(name);
            System.out.println(height);
            System.out.println(Arrays.toString( address));
        }
    }

    @Test
    public void parseAnnotation2() throws Exception{
        Class c2 = Demo.class;
        Method method = c2.getDeclaredMethod("go");
        if(method.isAnnotationPresent(MyTest2.class)){
            MyTest2 myTest2 = method.getDeclaredAnnotation(MyTest2.class);

            String[] address = myTest2.address();
            double height = myTest2.price();
            String name = myTest2.value();

            System.out.println(name);
            System.out.println(height);
            System.out.println(Arrays.toString( address));

        }
    }
}
