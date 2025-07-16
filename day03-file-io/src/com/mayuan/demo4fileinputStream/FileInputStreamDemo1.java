package com.mayuan.demo4fileinputStream;

import java.io.*;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：掌握文件字节输入流读取文件中的字节数组到内存中来。
        //1、创建文件字节输入流管道于源文件接通
//        InputStream is = new FileInputStream(new File("day03-file-io\\src\\dilei02.txt"));
        InputStream is = new FileInputStream("day03-file-io\\src\\dilei02.txt");

        //2、开始读取文件中的字节并输出。
        //定义一个变量记住每次读取的一个字节
        int b;
         while ((b = is.read()) != -1) {
             System.out.print((char)b);
         }


    }
}
