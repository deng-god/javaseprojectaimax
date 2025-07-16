package com.mayuan.demo2map;

import java.util.*;

public class MapTest6 {
    public static void main(String[] args) {
        //完成Map集合相关的案例，投票统计程序
        cacl();
    }

    public static void cacl() {
        List<String> locations = new ArrayList<>();
        String[] names = {"颐和园", "故宫", "天坛", "南锣鼓巷"};
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(names.length);
            locations.add(names[index]);
        }
        System.out.println(locations);

        //统计每个景点被选择的次数
        Map<String, Integer> map = new HashMap<>();

        for (String Location : locations){
//            if (map.containsKey(Location)){
//                map.put(Location, map.get(Location) + 1);
//            }else {
//                map.put(Location, 1);
//            }
            map.put(Location, map.containsKey(Location) ? map.get(Location) + 1 : 1);
        }

        //把统计结果打印出来
        map.forEach((key, value) -> System.out.println(key + "被选择了" + value + "次"));
    }
}
