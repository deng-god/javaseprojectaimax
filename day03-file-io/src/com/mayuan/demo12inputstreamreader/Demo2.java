package com.mayuan.demo12inputstreamreader;

import java.io.*;

public class Demo2 {
    public static void main(String[] args) {
        //目标：演示一个问题：不同编码读取乱码的问题、
        //代码：UTF-8 文件UTF-8 读取不乱码
        //代码：UTF-8 文件GBK 读取乱码

        try (
                //先提取文件的原始字节流
                InputStream is = new FileInputStream("d:/a.txt");
                //再创建一个转换流，指定编码格式
                InputStreamReader isr = new InputStreamReader(is, "GBK");

                //1.创建文件字符输入流与源文件接通
                Reader fr = (new FileReader("d:/a.txt"));
                //2、创建缓冲字符输入流包装低级的字符输入流
                BufferedReader br = new BufferedReader(fr)
        ) {
            //定义一个字符串变量用于记住每次读取的一行数据
            String line;
            while((line = br.readLine()) !=  null){
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
