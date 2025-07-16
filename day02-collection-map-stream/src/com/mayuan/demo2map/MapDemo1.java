package com.mayuan.demo2map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        //认识mao集合
        //HashMap集合的特点：无序，不重复，无索引，键值对可以是null，值不做要求（可以重复）
//        Map<String, Integer> map = new HashMap<>();
        //LinkedHashMap集合的特点：有序，不重复，无索引，键值对可以是null，值不做要求（可以重复）
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("张三", 18);
        map.put("王五", 20);
        map.put("赵六", 19);
        map.put("张三", 20);
        map.put(null ,null);
        System.out.println(map);
    }
}
