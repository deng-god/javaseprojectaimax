package com.mayuan.demo4proxy;

import java.sql.SQLOutput;

public class Test {
    //目标:创建代理对象
    public static void main(String[] args) {
        //1.准备一个明星对象，设计明星类
        Star star = new Star("张三");
        //2.创建代理对象，设计代理类
        StarService proxy = ProxyUtil.createProxy(star);
        proxy.sing("只因你太美");
        System.out.println(proxy.dance());

    }

}
