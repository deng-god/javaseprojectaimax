package com.mayuan.demo1exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        //捕获异常对象，尝试重新修复


        while (true) {
            try {
                double price = userInputPrice();
                System.out.println("价格：" + price);
            } catch (Exception e) {
                System.out.println("价格输入有误，请重新输入");
            }
        }
    }

    public static double userInputPrice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品价格：");
        double price = sc.nextDouble();
        return price;
    }
}
