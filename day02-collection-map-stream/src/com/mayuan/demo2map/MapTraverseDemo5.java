package com.mayuan.demo2map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapTraverseDemo5 {
    public static void main(String[] args) {
        //学习map集合的遍历方式：3.lambda
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 18);
        map.put("王五", 20);
        map.put("赵六", 19);
        map.put("张三", 20);

        //调用mao集合的forEach方法来遍历
//        map.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String key, Integer value) {
//                System.out.println(key + ":" + value);
//            }
//        });

        map.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
