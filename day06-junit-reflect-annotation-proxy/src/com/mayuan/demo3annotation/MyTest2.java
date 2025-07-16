package com.mayuan.demo3annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD}) // 表示注解的声明目标：方法、字段
@Retention(RetentionPolicy.RUNTIME) // 表示注解的保留策略：编译器运行时(一直活着）)
public @interface MyTest2 {
    String value();
    double price() default 100;
    String[] address();
}
