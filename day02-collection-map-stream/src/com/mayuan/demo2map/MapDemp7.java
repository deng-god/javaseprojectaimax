package com.mayuan.demo2map;

import com.mayuan.demo1hashset.Teacher;

import java.util.Map;
import java.util.TreeMap;

public class MapDemp7 {
    public static void main(String[] args) {
        //TreeMap  集合
        Map<Teacher, String> map = new TreeMap<>((o1, o2) -> Double.compare(o2.getSalary(), o1.getSalary()));
        map.put(new Teacher("张三", 18, 5000), "66");
        map.put(new Teacher("柴钰莹", 21, 3000), "66");
        map.put(new Teacher("王五", 20, 4000), "66");
        map.put(new Teacher("赵六", 19, 2000), "66");

        System.out.println(map);
    }
}
