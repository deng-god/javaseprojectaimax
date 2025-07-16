package com.mayuan.demo2threadapi;

public class ThreadApiDemo1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread("线程1");
//        t1.setName("线程1");
        t1.start();
        System.out.println(t1.getName());

        Thread  t2 = new MyThread("线程2");
//        t2.setName("线程2");
        t2.start();
        System.out.println(t2.getName());

        //哪个线程调用这个代码，这个代码就拿到哪个线程
        Thread m = Thread.currentThread();
        System.out.println(m.getName());

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程："+i);
        }

    }
}

class MyThread extends Thread {
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "子线程："+i);
        }
    }
}