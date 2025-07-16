package com.mayuan.demo8api;

public class Test2 {
    public static void main(String[] args) {
        //目标：高效拼接字符串。
        //+号拼接字符串内容，如果是大量拼接，效率极差！
        //String.的对象时不可变变量：
        //共享数据性能可以，但是修改数据性能差！
//        String s = "";
//        for (int i = 0; i < 10000; i++) {
//            s = s + "abc";
//        }
//        System.out.println(s);

        //定义字符串可以使用string类型，但是操作字符串建议大家用StringBuilder(性能好)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("abc");
        }
        System.out.println(sb);
    }
}
