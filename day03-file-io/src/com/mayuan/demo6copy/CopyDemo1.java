package com.mayuan.demo6copy;

import java.io.*;

public class CopyDemo1 {
    public static void main(String[] args) {
        //目标：使用字节流完成文件的复制操作。
        //源文件：E:\resource\jt.jpg
        //目标文件：D:\jt_new.jpg(复制过去的时候必须带文件名的，无法自动生成文件名。）
//        copyFile();
    }

    //复制文件
    public static void copyFile(String srcPath, String destPath)  {
        InputStream fis = null;
        OutputStream fos = null;
        try {
            //1.创建一个文件字节输入流管道与源文件接通
            fis = new FileInputStream(srcPath);
            //2.创建一个文件字节输出流管道与目标文件接通
            fos = new FileOutputStream(destPath);
            //3.读取一个字节数组，写入字节数组
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("复制完成");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3.关闭流
            try {
                if(fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if(fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
