package com.mayuan.demo6copy;

import java.io.*;

public class CopyDemo2 {
    public static void main(String[] args) {
        //目标：掌握资源的新方式：try-with-resource
        //源文件：E:\resource\jt.jpg
        //目标文件：D:\jt_new.jpg(复制过去的时候必须带文件名的，无法自动生成文件名。）
//        copyFile();
    }

    //复制文件
    public static void copyFile(String srcPath, String destPath) {
        try (
                //这里只能放置资源对象，用完后，最终会自动调用其c10se方法关闭！！
                InputStream fis = new FileInputStream(srcPath);
                OutputStream fos = new FileOutputStream(destPath);
                Myconn myconn = new Myconn(); //自定义的资源对象最终会自动调用其close方法关闭！！
        ) {
            //3.读取一个字节数组，写入字节数组
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("复制完成");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Myconn implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("关闭连接");
    }
}