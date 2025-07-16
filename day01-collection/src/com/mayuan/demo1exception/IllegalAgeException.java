package com.mayuan.demo1exception;

/**
 * 自定义异常类
 * 1.继承Exception
 * 2.重写构造方法
 * 3.抛出异常
 */
public class IllegalAgeException extends Exception {
    public IllegalAgeException() {
    }

    public IllegalAgeException(String message) {
        super(message);
    }
}
