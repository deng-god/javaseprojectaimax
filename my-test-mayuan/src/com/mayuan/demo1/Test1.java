package com.mayuan.demo1;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        //1.随机6个不重复红球号码 1-35 ，1个篮球1-15，升序输出，篮球放最后面
        Set<Integer> red = new TreeSet<>();
        while (red.size() < 6) {
            red.add((int) (Math.random() * 35 + 1));
        }
        System.out.println("红球号码" + red);
        int blue = (int) (Math.random() * 15 + 1);
        System.out.println("篮球号码" + blue);

        //2.定义一个集合存储用户选择的号码，再按段中了几个红球，中了几个篮球号码
        Set<Integer> redluck = new TreeSet<>();
        Collections.addAll(redluck, 12, 12, 30, 16, 7, 17);
        int luckblue = 17;

        //判断用户中了几个红球
        int redCount = 0;
        for (Integer redNum : red) {
            if (redluck.contains(redNum)) {
                redCount++;
            }
        }

        System.out.println("用户中" + redCount + "个红球");
        System.out.println("用户中了" + (blue == luckblue ? "一个" : "0个"));

    }


}
