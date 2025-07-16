package com.mayuan.demo1create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo3 {
    public static void main(String[] args) {
        //目标：掌握多线程的创建方式三：实现Callable.接口，方式三的优势：可以获取线程执行完毕后的结果的。
        //3、创建线程任务类的对象代表一个线程任务。
        Callable<String> c1 = new MyCallable(100);
        //4、把Callable对象封装成一个真正的线程任务对象FutureTask对象。
        /**
         * 未来对象的作用？
         * 1.本身是一个线程任务对象，可以交给Thread线程对象处理
         * 2.获取线程执行结果
         */
        FutureTask<String> ft1 = new FutureTask<String>(c1);
        //5、创建Thread类对象，构造方法中传递FutureTask对象
        Thread t1 = new Thread(ft1);
        //6、调用start方法启动线程
        t1.start();


        Callable<String> c2 = new MyCallable(50);
        FutureTask<String> ft2 = new FutureTask<String>(c2);
        Thread t2 = new Thread(ft2);
        t2.start();

        //获取线程执行完毕后返回的结果
        try {
            System.out.println(ft1.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println(ft2.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//1.创建一个实现Callable接口的类
class MyCallable implements Callable<String> {
    private int n;
    public MyCallable(int n) {
        this.n = n;
    }
    //2.实现call方法，将此线程需要执行的任务，放在call方法中
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return "1到" + n + "的和为：" + sum;
    }
}
