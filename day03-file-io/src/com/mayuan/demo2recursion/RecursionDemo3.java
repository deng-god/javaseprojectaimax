package com.mayuan.demo2recursion;

public class RecursionDemo3 {
    public static void main(String[] args) {
        //猴子摘桃问题
        //f(n+1) = f(n) - f(n)/2 -1
        //2f(n+1) = 2f(n) - f(n) -2
        //f(n) = 2f(n+1) + 2
        System.out.println(f(1));
    }

    public static int f(int n) {
        if (n == 10) {
            return 1;
        }
        return 2 * f(n + 1) + 2;
    }
}
