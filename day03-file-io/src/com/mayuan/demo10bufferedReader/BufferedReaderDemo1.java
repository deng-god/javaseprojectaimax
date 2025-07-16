package com.mayuan.demo10bufferedReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class BufferedReaderDemo1 {
    public static void main(String[] args) {
        //目标：搞清楚缓冲字符输入流读取字符内容：性能提升了，多了按照行读取文本的能力。
        try (
                Reader fr = new FileReader("day03-file-io\\src\\dilei06.txt");
                //创建缓冲字符输入流包装低级的字符输入流
                BufferedReader br = new BufferedReader(fr);
                ) {
//            //2、创建一个字节数组，用于装字符数组
//            char[] chars = new char[3];
//            //3、调用read方法，将字节数组作为参数，将字节数组中的内容读取到字节数组中
//            int len;
//            //4、遍历字节数组，将字节数组中的内容输出
//            while ((len = fr.read(chars)) != -1) {
//                String str = new String(chars, 0, len);
//                System.out.print(str);
//            }
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//            System.out.println(br.readLine()); //null


            //使用循环改进，来按照行读取数据
            //定义一个字符串变量用于记住每次读取的一行数据
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
