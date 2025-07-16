package com.mayuan.demo3stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        //掌握Stream流的统计，收集操作（终结方法）
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("张三", 18, 5000));
        teachers.add(new Teacher("李四", 19, 6000));
        teachers.add(new Teacher("王五", 20, 7000));
        teachers.add(new Teacher("赵六", 21, 8000));
        teachers.add(new Teacher("田七", 22, 9000));

//        teachers.stream().filter(teacher -> teacher.getSalary() > 6000).forEach(teacher -> System.out.println(teacher));
        teachers.stream().filter(t -> t.getSalary() > 7000).forEach(System.out::println);

        System.out.println("---------------------------------");

        long count = teachers.stream().filter(t -> t.getSalary() > 7000).count();
        System.out.println(count);

        System.out.println("---------------------------------");

        //获取薪水最高的老师对象
        Optional<Teacher> maxteacher = teachers.stream().max((o1, o2) -> Double.compare(o2.getSalary(), o1.getSalary()));
        System.out.println(maxteacher.get());

        System.out.println("---------------------------------");

        //获取薪水最低的老师对象
        Optional<Teacher> minteacher = teachers.stream().min((o1, o2) -> Double.compare(o2.getSalary(), o1.getSalary()));
        System.out.println(minteacher.get());

        List<String> list2 = new ArrayList<>();
        list2.add("张无忌");
        list2.add("赵敏");
        list2.add("周芷若");
        list2.add("张强");
        list2.add("张三丰");
        list2.add("张三丰");
        list2.add("张三丰");

        //收集到集合或者数组中去
        Stream<String> s4 =  list2.stream().filter(name -> name.startsWith("张"));
        //收取到list集合中去
        List<String> list3 = s4.collect(Collectors.toList());
        System.out.println(list3);

        Set<String> set1 = new HashSet<>();
        set1.addAll(list3);
        System.out.println(set1);

        System.out.println("------------------------");

        //收集到set集合中去
        Stream<String> s5 =  list2.stream().filter(name -> name.startsWith("张"));
        Set<String> set = s4.collect(Collectors.toSet());
        System.out.println(set);

        System.out.println("------------------------");

        //收集到数组中去
        Stream<String> s6 =  list2.stream().filter(name -> name.startsWith("张"));
        Object[] array = s6.toArray();
        System.out.println(Arrays.toString(array));

        System.out.println("------------------------");

        //收集到map集合中去
//        Map<String,Double> map = teachers.stream().collect(Collectors.toMap(new Function<Teacher, String>() {
//            @Override
//            public String apply(Teacher teacher) {
//                return teacher.getName();
//            }
//        }, new Function<Teacher, Double>() {
//            @Override
//            public Double apply(Teacher teacher) {
//                return teacher.getSalary();
//            }
//        }));
        Map<String,Double> map = teachers.stream().collect(Collectors.toMap(Teacher::getName,Teacher::getSalary));
        System.out.println(map);

    }
}
