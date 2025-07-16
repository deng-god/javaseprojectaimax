package com.mayuan.demo8test;

public class Test {
    public static void main(String[] args) {
        //1.创建电影对象类
        //2.创建电影对象操作类，负责业务逻辑处理
        MoiveService moiveService = new MoiveService();
        moiveService.start();
    }
}
