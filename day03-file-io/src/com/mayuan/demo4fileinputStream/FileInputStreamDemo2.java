package com.mayuan.demo4fileinputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws Exception {
        //目标：掌握文件字节输入流读取文件中的字节数组到内存中来。
        //1、创建文件字节输入流管道于源文件接通
//        InputStream is = new FileInputStream(new File("day03-file-io\\src\\dilei02.txt"));
        InputStream is = new FileInputStream("day03-file-io\\src\\dilei03.txt");

        //2、开始读取文件中的字节并输出,每次读取多个字节
        //定义一个变量记住每次读取的字节
        byte[] buffer = new byte[3];
        int len;
        while ((len = is.read(buffer)) != -1) {
            //3、把字节数组转换成字符串输出
            String str = new String(buffer, 0, len);
            System.out.println(str);
        }

        //使用FilelnputStream每次读取一个字节，读取性能较差，并且读取汉字输出会乱码。
        //使用FilelnputStream每次读取多个字节，读取性能得到了提升，但读取汉字输出还是会乱码。


    }
}
