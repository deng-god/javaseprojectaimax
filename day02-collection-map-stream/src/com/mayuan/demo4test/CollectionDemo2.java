package com.mayuan.demo4test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //批量添加元素
        Collections.addAll(list,"张无忌","赵敏","周芷若","张强","张三丰");
        System.out.println(list);

        //打乱顺序
        Collections.shuffle(list);
        System.out.println(list);
    }
}
