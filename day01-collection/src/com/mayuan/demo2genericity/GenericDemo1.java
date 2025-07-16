package com.mayuan.demo2genericity;

import java.util.ArrayList;

public class GenericDemo1 {
    public static void main(String[] args) {
        //认识泛型，搞清楚泛型的作用
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
//        list.add(100);
//        list.add(true);

        for (int i = 0; i < list.size(); i++) {
//            String s = (String) list.get(i);
//            System.out.println(s);

            System.out.println(list.get(i));
        }
    }
}
