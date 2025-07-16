package com.mayuan.demo3stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        //获取Stream流的方式
        Collection<String> list = new ArrayList<>();
        Stream<String> s1 = list.stream();

        //Map集合怎么拿Stream流
        Map<String, String> map = new HashMap<>();
        //获取键流
        Stream<String> s2 = map.keySet().stream();
        //获取值流
        Stream<String> s3 = map.values().stream();
        //获取键值对流
        Stream<Map.Entry<String, String>> s4 = map.entrySet().stream();


        //获取数组的流
        String[] arr = new String[]{"张三", "张三", "张三", "张三", "张三"};
        Stream<String> s5 = Arrays.stream(arr);
        System.out.println(s5.count());
    }
}
