package com.mayuan.demo13printstream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class printStreamDemo1 {
    public static void main(String[] args) {
        //目标：打印流的使用
        try (
//                PrintStream ps = new PrintStream("d:/a.txt")
                //追加内容
                PrintStream ps = new PrintStream(new FileOutputStream("d:/a.txt",true))
        ){
            ps.println("hello");
            ps.println(123);
            ps.println(true);
            ps.println(3.14);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
