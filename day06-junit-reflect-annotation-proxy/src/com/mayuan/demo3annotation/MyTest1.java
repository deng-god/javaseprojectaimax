package com.mayuan.demo3annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME) // 表示注解的保留策略：编译器运行时(一直活着）
public @interface MyTest1 {
}
