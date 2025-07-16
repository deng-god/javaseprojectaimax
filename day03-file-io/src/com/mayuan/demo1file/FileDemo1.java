package com.mayuan.demo1file;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        //目标：创建Fi1创建对象代表文件（文件/目录），搞清楚其提供的对文件进行操作的方法
        //1.创建File对象代表文件
        File file = new File("D:\\test.txt");
        System.out.println(file.getName()); //获取文件名
        System.out.println(file.getAbsolutePath()); //获取绝对路径
        System.out.println(file.length()); //获取文件大小
        System.out.println(file.isFile()); //判断是否是文件
        System.out.println(file.isDirectory()); //判断是否是目录
        System.out.println(file.exists()); //判断文件是否存在
        System.out.println(file.canRead()); //判断文件是否可读
        System.out.println(file.canWrite()); //判断文件是否可写
        System.out.println(file.isHidden()); //判断文件是否隐藏
        System.out.println(file.lastModified()); //获取文件最后修改时间

        System.out.println("-------------------------");
        //可以使用相对路径定位文件对象
        //只要带盘符的都称之为：绝对路径E:/resource,/dLei.jpg
        //相对路径：不带盘符，默认是到你的ida工程下直接寻找文件的。一般用来找工程下的项目文件的。
        File file1 = new File("day03-file-io\\src\\dlei01.txt");
        System.out.println(file1.length());

        System.out.println("-------------------------");

        //创建对象代表不存在的文件路径
        File file2 = new File("D:\\test1.txt");
        System.out.println(file2.exists());
//        System.out.println(file2.createNewFile());

        File file3 = new File("D:\\test\\aaa0");
        System.out.println(file3.mkdir()); //创建一级文件夹

        File file4 = new File("D:\\test\\aaa1\\bbb");
        System.out.println(file4.mkdirs()); //创建多级文件夹

        System.out.println("-------------------------");

        File file5 = new File("D:\\test\\aaa1");
        System.out.println(file5.delete()); //删除文件夹，只能删除空文件夹

        File file6 = new File("D:\\test\\aaa1\\bbb\\dlei01.txt");
        System.out.println(file6.delete());

        //获取某个目录下的全部一级文件名称
        File file7 = new File("D:\\test");
        String[] names = file7.list();
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("-------------------------");

    }
}
