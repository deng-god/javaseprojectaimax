package com.mayuan.demo4test;

public class ParamDemo1 {
    public static void main(String[] args) {

        sum(new int[]{11,12,33});
        sum(1,2,3,4,5,6,7,8,9,10);
        sum(1,2,3);
        sum(1,2);
        sum(1);
        sum();
    }

    //可变参数在形参列表中只能有一个，且必须是最后一个参数
    public static void sum(int...nums){
        //可变参数对内实际上是一个数组
    }
}
