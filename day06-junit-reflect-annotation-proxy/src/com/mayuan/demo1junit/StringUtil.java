package com.mayuan.demo1junit;

/**
 * 字符串工具类
 */
public class StringUtil {
    public static void printNumber(String name) {
        if (name == null) {
            System.out.println("参数不能为空");
            return;
        }
        System.out.println("名字长度是：" + name.length());
    }

    /**
     * 获取字符串的最大索引
     */
    public static int getMaxIndex(String name){
        if (name == null || "".equals(name)){
            return -1;
        }
        return name.length()-1;
    }

}
