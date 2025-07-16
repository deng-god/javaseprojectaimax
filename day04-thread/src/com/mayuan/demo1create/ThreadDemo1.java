package com.mayuan.demo1create;

public class ThreadDemo1 {
    public static void main(String[] args) {
        //目标：认识多线程，掌握创建线程的方式一：继承Thread类来实现
        //创建线程对象
        MyThread t1 = new MyThread();
        //调用start方法启动线程
        t1.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程："+i);
        }

    }
}
//1、定义一个子类继承Thread类，成为一个线程类。
class MyThread extends Thread{
    //2、重写Thread类的run方法
    @Override
    public void run() {
        //3、在rUn方法中编写线程的任务代码（线程要干的活儿)
        for (int i = 0; i < 100; i++) {
            System.out.println("线程1："+i);
        }
    }
}
