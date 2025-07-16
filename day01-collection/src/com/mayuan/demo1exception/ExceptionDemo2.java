package com.mayuan.demo1exception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        System.out.println(div(10,0));

    }


    public static int div(int a,int b){
        if(b==0){
            // 抛出异常
            throw new RuntimeException("除数不能为0");
        }
        int result = a/b;
        return result;
    }

}
