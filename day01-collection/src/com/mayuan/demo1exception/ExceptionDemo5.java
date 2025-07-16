package com.mayuan.demo1exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        try {
            show1();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("程序出现异常了");
        }
        System.out.println("程序结束");
    }

    //定义一个方法，认识编译异常
    public static void show1() throws FileNotFoundException, ParseException {
        String str = "2025-5-21 ";
        //把字符串时间解析成JAVA中的一个日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(str);
        System.out.println(date);

        InputStream is = new FileInputStream("d:/test1111.txt");
    }
}
