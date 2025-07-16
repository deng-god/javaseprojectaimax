package com.mayuan.demo5fileoutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class FIleOutputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：学会使用文件字节输出流。
        //1、创建文件字节输出流管道与目标文件接通
        OutputStream os = new FileOutputStream( "day03-file-io\\src\\dilei05-out.txt", true);

        //2.写入数据
        os.write(97); //写入一个字节数据
        os.write('b'); //写入一个字符数据
//        os.write("柴"); //写入一个字符串数据 会乱码
        os.write("\r\n".getBytes()); //写入一个换行符

        //3.写一个字节数组进去
        byte[] bytes = "我爱你中国666".getBytes();
        os.write(bytes);
        os.write("\r\n".getBytes()); //写入一个换行符

        //4.写一个字节的一部分出去
        os.write(bytes, 0, 3);

        os.close();

    }
}
