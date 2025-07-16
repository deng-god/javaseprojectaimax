package com.mayuan.demo7executorService;

import java.util.concurrent.Callable;

//1.创建一个实现Callable接口的类
public class MyCallable implements Callable<String> {
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
        return Thread.currentThread().getName() + "1到" + n + "的和为：" + sum;
    }
}
