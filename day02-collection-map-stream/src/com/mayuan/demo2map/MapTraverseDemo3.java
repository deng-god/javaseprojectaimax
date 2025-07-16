package com.mayuan.demo2map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTraverseDemo3 {
    public static void main(String[] args) {
        //学习map集合的遍历方式：1.键找值
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 18);
        map.put("王五", 20);
        map.put("赵六", 19);
        map.put("张三", 20);

        //提取map集合的全部键到一个set集合中
        Set<String> keySet = map.keySet();
        //遍历set集合
        for (String key : keySet) {
            Integer value = map.get(key);
            System.out.println(key + ":" + value);
        }
    }
}
