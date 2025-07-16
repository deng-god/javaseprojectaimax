package com.mayuan.demo6collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraverSalTest6 {

    public static void main(String[] args) {
        //认识并发修改异常问题，搞清楚每种遍历的区别
        ArrayList<String> names = new ArrayList<>();
        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("赵六");
        names.add("孙五");
        names.add("周五");
        names.add("周六");

//        for (int i = 0; i < names.size(); i++) {
//            String name = names.get(i);
//            if (name.contains("五")) {
//                names.remove(name);
//            }
//        }
//
//        System.out.println(names);


        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if (name.contains("五")) {
                names.remove(name);
                i--;
            }
        }
        System.out.println(names);

        System.out.println("--------------------");

        ArrayList<String> names1 = new ArrayList<>();
        names1.add("张三");
        names1.add("李四");
        names1.add("王五");
        names1.add("赵六");
        names1.add("孙五");
        names1.add("周五");
        names1.add("周六");

        //倒着遍历并删除
        for (int i = names1.size() - 1; i >= 0; i--) {
            String name = names1.get(i);
            if (name.contains("五")) {
                names1.remove(name);
            }
        }

        System.out.println(names1);


        ArrayList<String> names2 = new ArrayList<>();
        names2.add("张三");
        names2.add("李四");
        names2.add("王五");
        names2.add("赵六");
        names2.add("孙五");
        names2.add("周五");
        names2.add("周六");

        //迭代器遍历并删除
        //需要使用迭代器自己的方法才能删除
        
        Iterator<String> it = names2.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.contains("五")) {
//                names2.remove(name);  //不可用
                it.remove();
            }
        }

        System.out.println("---------------------------");

        ArrayList<String> names3 = new ArrayList<>();
        names3.add("张三");
        names3.add("李四");
        names3.add("王五");
        names3.add("赵六");
        names3.add("孙五");
        names3.add("周五");
        names3.add("周六");
        

//        //增强for 无法解决并发修改的问题
//        for (String name : names3) {
//            if (name.contains("五")) {
//                names3.remove(name);
//            }
//        }

        //lambda 无法解决并发修改的问题
        names3.forEach(name -> {
            if (name.contains("五")) {
                names3.remove(name);
            }
        });
    }

}
