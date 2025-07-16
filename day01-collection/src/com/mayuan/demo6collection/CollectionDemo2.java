package com.mayuan.demo6collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.function.IntFunction;

public class CollectionDemo2 {
    public static void main(String[] args) {
        // 学习collection提供的通用集合功能
        Collection<String> collection = new ArrayList<>();
        collection.add("张三");
        collection.add("李四");
        collection.add("王五");
        System.out.println(collection);

        //获取集合的元素个数
        System.out.println(collection.size());

        //删除集合元素
        collection.remove("张三");
        System.out.println(collection);

        //判断集合是否为空
        System.out.println(collection.isEmpty());

        //清空集合
        collection.clear();
        System.out.println(collection);

        //判断集合中是否存在某个元素
        System.out.println(collection.contains("张三"));

        //把集合转换成数组
        Object[] arr = collection.toArray();

//        String [] arr2 = collection.toArray(new IntFunction<String[]>() {
//            @Override
//            public String[] apply(int value) {
//                return new String[value];
//            }
//        });

//        String [] arr2 = collection.toArray(value -> new String[value]);

        String [] arr2 = collection.toArray(String[]::new);

    }

}
