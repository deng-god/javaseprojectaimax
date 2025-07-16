package com.mayuan.demo5genericty;

import java.util.ArrayList;

public class GenericDemo6 {
    public static void main(String[] args) {
        //泛型和集合不支持基本数据类型，只能支持引用数据类型（对象类型）
//        ArrayList<int> list = new ArrayList<>(); //错误
        //泛型擦除：泛型在编译期间会被擦除，只保留类型信息

        //把基本数据类型变成包装类对象
//        Integer i = new Integer(100); //手工包装

//        Integer it = Integer.valueOf(100);

        //自动包装
        Integer it2 = 100;
        Integer it3 = 100;
        System.out.println(it2 == it3); //正确

        //越界了，重新new对象，
        Integer it4 = 130;
        Integer it5 = 130;
        System.out.println(it4 == it5); //错误


        //自动拆箱，把包装类型的对象直接给基本类型的数据
        int i = it2;
        System.out.println(i);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100); //自动装箱

        int rs = list.get(0); //自动拆箱

        System.out.println("========================");

        //1.包装类可以把基本类型的数据自动转换为字符串
        int j = 23;
        String rs1 = Integer.toString(j); //23
        System.out.println(rs1 + 1); //231

        Integer i2 = j;
        String rs2 = i2.toString();
        System.out.println(rs2 + 1);

        String rs3 = j + "";

        System.out.println("========================");

        //2.字符串可以转换为基本数据类型
        String str = "123";
        int rs4 = Integer.parseInt(str);
        System.out.println(rs4 + 1); //124


    }

}
