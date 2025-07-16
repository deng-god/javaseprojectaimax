package com.mayuan.demo6collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo1 {
    public static void main(String[] args) {
        //学习collection集合的特点
        //1.List集合元素存储特点：有序，可重复，有索引
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("张三");
        list.add("JAVA");
        System.out.println(list);
        String str = list.get(1);
        System.out.println(str);

        System.out.println("==================");

        //2.Set集合元素存储特点：无序，不可重复，无索引
        Set<String> set = new HashSet<>();
        set.add("张三");
        set.add("张三");
        set.add("JAVA");
        System.out.println(set);
    }
}
