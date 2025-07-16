package com.mayuan.demo3stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        //目标：掌握Stream提供的常用的中间方法，对流上的数据进行处理（返回新流：支持链式编程）
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("赵敏");
        list.add("周芷若");
        list.add("张强");
        list.add("张三丰");

        //1.过滤方法
        list.stream().filter(name -> name.startsWith("张") && name.length() == 3).forEach(System.out::println);

        //2,排序方法
        List<Double> list1 = new ArrayList<>();
        list1.add(12.1);
        list1.add(10.2);
        list1.add(9.4);
        list1.add(11.6);

        list1.stream().sorted().forEach(System.out::println); //升序(默认)
        System.out.println("------------------------");
        //降序1
        list1.stream().sorted((s1,s2) -> Double.compare(s2,s1)).forEach(System.out::println);
        System.out.println("------------------------");
        //降序2
        list1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("------------------------");
        //降序排序且只要前两名
        list1.stream().sorted((s1,s2) -> Double.compare(s2,s1)).limit(2).forEach(System.out::println);
        System.out.println("------------------------");
        //跳过前两名
        list1.stream().sorted((s1,s2) -> Double.compare(s2,s1)).skip(2).forEach(System.out::println);
        System.out.println("------------------------");
        //跳过前两名，只取后两名
        list1.stream().sorted((s1,s2) -> Double.compare(s2,s1)).skip(2).limit(2).forEach(System.out::println);
        System.out.println("------------------------");
        //降序且去重
        list1.stream().sorted((s1,s2) -> Double.compare(s2,s1)).distinct().forEach(System.out::println);
        System.out.println("------------------------");
        //映射方法
        list1.stream().map(s -> "加十分后：" + (s + 10)).forEach(System.out::println);
        System.out.println("------------------------");
        //合并流
        Stream<String> s1 = Stream.of("张无忌", "赵敏", "周芷若", "张强", "张三丰");
        Stream<Integer> s2 = Stream.of(1,2,3,4,5);
        Stream<Object> s3 = Stream.concat(s1,s2);

    }
}
