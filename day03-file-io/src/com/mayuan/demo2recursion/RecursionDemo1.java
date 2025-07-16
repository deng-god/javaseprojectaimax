package com.mayuan.demo2recursion;

public class RecursionDemo1 {
    public static void main(String[] args) {
        //认识递归的形式
    }

    public static void printA(){
        System.out.println("A");
        printA(); // 递归调用自己(直接递归—）
    }
}
