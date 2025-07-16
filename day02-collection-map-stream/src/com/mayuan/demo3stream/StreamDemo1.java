package com.mayuan.demo3stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("赵敏");
        list.add("周芷若");
        list.add("张强");
        list.add("张三丰");

        //1.找出姓张的人，名字为三个字，存入一个新集合中去
        List<String> list1 = new ArrayList<>();
        for (String name : list) {
            if (name.startsWith("张") && name.length() == 3) {
                list1.add(name);
            }
        }
        System.out.println(list1);

        //2.使用stream流实现
        List<String> newlist2 = list.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3).collect(Collectors.toList());
        System.out.println(newlist2);
    }
}
