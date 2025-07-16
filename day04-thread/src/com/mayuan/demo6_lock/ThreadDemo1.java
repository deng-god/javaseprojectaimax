package com.mayuan.demo6_lock;

public class ThreadDemo1 {
    public static void main(String[] args) {
        //目标：模拟线程安全问题。
        //1、设计一个账户类：用于创建小明和小红的共同账户对象，存入10万。
        Account acc = new Account("ICBC-1001", 5000);

        //2、创建两个线程，模拟小明和小红同时取钱。
        new DrawThread("小明", acc).start();
        new DrawThread("小红", acc).start();
    }
}
