package com.mayuan.demo2recursion;

public class RecursionDemo2 {
    public static void main(String[] args) {
        //计算n的阶乘
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int factorial2(int n) {
        if (n == 1) {
            return 1;
        }
        return n + factorial(n - 1);
    }

}
