package com.mayuan.demo3annotation;

public @interface A {
    String value(); //特殊属性value，在使用时只有一个value属性，value名称可以不写
    String hobby() default "看电影";
}
