package com.mayuan.demo2map;

import java.util.*;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 18);
        map.put("王五", 20);
        map.put("赵六", 19);
        map.put("张三", 20);
        map.put(null ,null);
        System.out.println(map);

        System.out.println("------------------");

        System.out.println(map.get("张三")); //20
        System.out.println(map.get("王五2")); //null

        System.out.println(map.containsKey("张三")); //true
        System.out.println(map.containsKey("王五2")); //false

        System.out.println(map.containsValue(20)); //true
        System.out.println(map.containsValue(20.0)); //false

        System.out.println(map.size());
        System.out.println(map.remove("张三"));
        map.clear();
        System.out.println(map.isEmpty());

        //获取所有键放到一个set集合中
        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key);
        }

        //获取所有值放到一个collection集合中
        Collection<Integer> values = map.values();
        for (Integer value : values){
            System.out.println(value);
        }
    }
}
