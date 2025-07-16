package com.mayuan.demo7list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //添加数据
        list.add("hello");
        list.add("world");
        list.add("java");
        System.out.println(list);

        //在第三个位置添加数据 cyy
        list.add(2,"cyy");
        System.out.println(list);

        //删除java
        list.remove(3);
        System.out.println(list);
//        list.remove("java");
//        System.out.println(list);

        //把word修改成gy
        list.set(1,"gy");
        System.out.println(list);

        //获取集合元素
        String str = list.get(1);
        System.out.println(str);

        System.out.println("-------------");

        //1.for循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //2.迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //3.增强for循环
        for (String s : list) {
            System.out.println(s);
        }

        //4.lambda表达式
        list.forEach(s -> System.out.println(s));
    }
}
