package com.mayuan.demo9bufferedinputStream;


import java.io.*;

public class CopyDemo1 {
    public static void main(String[] args) {
        //目标：掌握缓冲字节流的使用。
        //源文件：E:\resource\jt.jpg
        //目标文件：D:\jt_new.jpg(复制过去的时候必须带文件名的，无法自动生成文件名。）
//        copyFile();
    }

    //复制文件
    public static void copyFile(String srcPath, String destPath) {
        try (
                //这里只能放置资源对象，用完后，最终会自动调用其close方法关闭！！
                InputStream fis = new FileInputStream(srcPath);
                //创建缓冲字节输入流
                InputStream bis = new BufferedInputStream(fis);


                OutputStream fos = new FileOutputStream(destPath);
                //创建缓冲字节输出流
                OutputStream bos = new BufferedOutputStream(fos);
        ) {
            //3.读取一个字节数组，写入字节数组
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("复制完成");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

