package com.mayuan.demo8api;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test3 {
    public static void main(String[] args) {
        //目标：掌握BigDecimal解决小数运算结果失真问题。
        double a = 0.1;
        double b = 0.2;
        System.out.println(a + b);

        //1、把小数包装成BigDecimal对象来运算才可以。
        //必须使用public BigDecimal(String val)字符串构造器才能解决失真问题
//        BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b1 = new BigDecimal(Double.toString(a));
        BigDecimal b2 = new BigDecimal(Double.toString(b));

        //优化方案，可以直接调用valve0f方法，内部使用的就是public BigDecimal(String val)字符串构造器
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal a2 = BigDecimal.valueOf(b);

        BigDecimal c1 = a1.add(a2); //解决精度问题的手段
        double result = c1.doubleValue(); //把BigDecimal对象转换成double
        System.out.println(result);

        System.out.println("---------------------------------");

        //除法
        BigDecimal d1 = BigDecimal.valueOf(0.1);
        BigDecimal d2 = BigDecimal.valueOf(0.3);
//        BigDecimal c2 = d1.divide(d2); //抛异常
        BigDecimal c2 = d1.divide(d2, 2, RoundingMode.HALF_UP);
        System.out.println(c2);
    }
}
