package com.mayuan.demo7fileReader;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo1 {
    public static void main(String[] args) {
        //目标：掌握文件字符输入流读取字符内容到程序中来。
        //1、创建文件字符输入流与源文件接通
        try (Reader fr = new FileReader(new File("day03-file-io\\src\\dilei06.txt"))) {
            //2、创建一个字节数组，用于装字符数组
            char[] chars = new char[3];
            //3、调用read方法，将字节数组作为参数，将字节数组中的内容读取到字节数组中
            int len;
            //4、遍历字节数组，将字节数组中的内容输出
            while ((len = fr.read(chars)) != -1) {
                String str = new String(chars, 0, len);
                System.out.print(str);
            }
            //拓展：文件字符输入流每次读取多个字符，性能较好，而且读取中文
            //是按照字符读取，不会出现乱码！这是一种读取中文很好的方案。
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
