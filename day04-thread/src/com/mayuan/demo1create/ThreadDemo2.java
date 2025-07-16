package com.mayuan.demo1create;

public class ThreadDemo2 {
    public static void main(String[] args) {
        //目标：掌握多线程的创建方式二：实现Runnable接口来创建。

        //3、创建线程任务类的对象代表一个线程任务。
        MyRunnable r1 = new MyRunnable();
        //4、创建Thread类对象，构造方法中传递线程任务对象
        Thread t1 = new Thread(r1);
        //5、调用start方法启动线程
        t1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程："+i);
        }

    }
}

//1、定义一个线程任务类实现Runnable接口
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("线程1："+i);
        }
    }
}