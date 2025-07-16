package com.mayuan.demo2threadapi;

public class ThreadApiDemo2 {
    public static void main(String[] args) {
        //目标：搞清楚Thread.类的Sleep方法（线程休眠）
        for (int i = 0; i < 10; i++) {
            System.out.println("线程1：" + i);
            try {
                //让当前执行的线程进入休眠状态，直到时间到了，才会继续执行。
                //项目经理让我加上这行代码，如果用户交钱了，我就注释掉，
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
