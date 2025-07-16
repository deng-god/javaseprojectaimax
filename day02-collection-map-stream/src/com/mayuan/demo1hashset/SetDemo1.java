package com.mayuan.demo1hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        //创建set集合，特点：无序，不可重复，无索引
        Set<String> set = new HashSet<>();
        set.add("张三");
        set.add("张三");
        set.add("JAVA");
        set.add("JAVA");
        set.add("柴钰莹");
        set.add("柴钰莹");
        set.add("郭钰");
        set.add("郭钰");
        System.out.println(set);


        //LinkedHashSet集合，特点：有序，不可重复，有索引
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("张三");
        set1.add("张三");
        set1.add("JAVA");
        set1.add("JAVA");
        set1.add("柴钰莹");
        set1.add("柴钰莹");
        set1.add("郭钰");
        set1.add("郭钰");
        System.out.println(set1);

        //创建TreeSet集合，特点：排序,不可重复，无索引，
        Set<String> set2 = new TreeSet<>();;
        set2.add("张三");
        set2.add("张三");
        set2.add("JAVA");
        set2.add("JAVA");
        set2.add("柴钰莹");
        set2.add("柴钰莹");
        set2.add("郭钰");
        set2.add("郭钰");
        System.out.println(set2);

        System.out.println("=================");

        String t1 = "acd";
        String t2 = "abc";

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());

    }
}
