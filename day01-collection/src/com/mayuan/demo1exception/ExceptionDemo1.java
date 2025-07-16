package com.mayuan.demo1exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        //认识异常体系，搞清楚异常的基本作用
        try {
            show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //定义一个方法，认识编译异常
    public static void show1() throws Exception {
        String str = "2025-5-21 ";
        //把字符串时间解析成JAVA中的一个日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(str);
        System.out.println(date);
    }

    //认识运行时出现的异常
    public static void show() {
//        //运行异常：编译时不报错，运行时报错，继承自  RuntimeException
//        int[] arr = {1,2,3};
//        System.out.println(arr[3]); // ArrayIndexOutOfBoundsException

        //空指针异常
        String str = null;
        System.out.println(str);
        System.out.println(str.length());
    }

}
