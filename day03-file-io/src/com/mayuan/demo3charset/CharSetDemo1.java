package com.mayuan.demo3charset;

import java.util.Arrays;

public class CharSetDemo1 {
    public static void main(String[] args) {
        //编码
        String name = "我爱你中国abc666";


        byte[] bytes = name.getBytes();
//        byte[] bytes = name.getBytes("GBK");
        System.out.println("字节数组长度：" + bytes.length);
        System.out.println(Arrays.toString(bytes));

        //解码
        String name2 = new String(bytes);
//        String name2 = new String(bytes,"GBK");
        System.out.println(name2);


    }
}
