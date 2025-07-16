package com.mayuan.demo1exception;

/**
 * 自定义异常类
 * 1.继承RuntimeException
 * 2.重写构造方法
 * 3.抛出异常
 */
public class IllegalAgeRunTimeException extends RuntimeException {
    public IllegalAgeRunTimeException() {
    }

    public IllegalAgeRunTimeException(String message) {
        super(message);
    }
}
