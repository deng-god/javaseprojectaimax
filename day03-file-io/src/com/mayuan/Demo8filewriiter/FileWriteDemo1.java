package com.mayuan.Demo8filewriiter;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriteDemo1 {
    public static void main(String[] args) {
        //目标：搞清楚文件字符输出流的使用：写字符出去的流。
        //1.创建一个字符输出流对象，指定写出的目的地。

        try (
//                Writer fw = new FileWriter("day03-file-io\\src\\dilei07-out.txt") //覆盖管道
                FileWriter fw = new FileWriter("day03-file-io\\src\\dilei07-out.txt",  true) //追加数据
        ) {

            //2.写一个字符出去 public void write(int c)
            fw.write('a');
            fw.write('b');

            //3.写一个字符串出去 public void write(String str)
            fw.write("hello world");
            fw.write("我要月薪过万");

            //4.写一个字节数组出去 public void write(char[] cbuf)
            char[] chars = "我爱你中国666".toCharArray();
            fw.write(chars);

            //5.写一个字节数组的一部分出去 public void write(char[] cbuf, int off, int len)
            fw.write(chars, 0, 5);

            fw.flush(); //刷新缓冲区，将数据写出去
            //刷新后，流可以继续使用。
            fw.close(); //关闭资源，关闭包含了刷新！关闭后流不能继续使用！


        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
