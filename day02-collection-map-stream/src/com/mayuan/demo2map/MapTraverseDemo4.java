package com.mayuan.demo2map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTraverseDemo4 {
    public static void main(String[] args) {
        //学习map集合的遍历方式：2.键值对
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 18);
        map.put("王五", 20);
        map.put("赵六", 19);
        map.put("张三", 20);

        //获取map集合的键值对对象(Map.Set<String, Integer>)
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        for (Map.Entry<String, Integer> entry : entrySet){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
