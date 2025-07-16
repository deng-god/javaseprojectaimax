package com.mayuan.demo11bufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo1 {
    public static void main(String[] args) {
        try (
//                Writer fw = new FileWriter("day03-file-io\\src\\dilei07-out.txt") //覆盖管道
                FileWriter fw = new FileWriter("day03-file-io\\src\\dilei07-out.txt",  true); //追加数据

                BufferedWriter bw = new BufferedWriter(fw);
        ) {

            //2.写一个字符出去 public void write(int c)
            bw.write('a');
            bw.write('b');

            //3.写一个字符串出去 public void write(String str)
            bw.write("hello world");
            bw.write("我要月薪过万");

            //4.写一个字节数组出去 public void write(char[] cbuf)
            char[] chars = "我爱你中国666".toCharArray();
            bw.write(chars);

            //5.写一个字节数组的一部分出去 public void write(char[] cbuf, int off, int len)
            bw.write(chars, 0, 5);

            bw.flush(); //刷新缓冲区，将数据写出去
            //刷新后，流可以继续使用。
            bw.close(); //关闭资源，关闭包含了刷新！关闭后流不能继续使用！


        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
