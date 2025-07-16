package com.mayuan.demo4fileinputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo3 {
    public static void main(String[] args) throws Exception {
        //目标：掌握文件字节输入流读取文件中的字节数组到内存中来。
        //1、创建文件字节输入流管道于源文件接通
        InputStream is = new FileInputStream("day03-file-io\\src\\dilei04.txt");

        //2,一起行读完文件的全部字节
        byte[] bytes = is.readAllBytes();

        System.out.println(new String(bytes));
    }
}
