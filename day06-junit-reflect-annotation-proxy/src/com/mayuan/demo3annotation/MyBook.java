package com.mayuan.demo3annotation;

//自定义注解
public @interface MyBook {
    String name();
    int age() default 18;
    String[] adress();
}
