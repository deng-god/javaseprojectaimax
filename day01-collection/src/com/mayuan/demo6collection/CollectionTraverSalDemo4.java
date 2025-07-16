package com.mayuan.demo6collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraverSalDemo4 {
    public static void main(String[] args) {
        //collecton遍历的方式，2.增强for
        //2、foreach
        Collection<String> names = new ArrayList<>();
        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("赵六");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("-----------------");

        String[] user = {"张三","李四","王五","赵六"};
        for (String name : user) {
            System.out.println(name);
        }
    }
}
