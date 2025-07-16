package com.mayuan.demo2recursion;

import java.io.File;

public class FileSearchTest4 {
    public static void main(String[] args) {
        File dir = new File("D:\\");
        searchFile(dir, "test.txt");

    }

    /**
     * 递归查找文件
     * @param dir 目录
     * @param file 文件名
     */
    private static void searchFile(File dir, String file) {
        //判断极端情况
        if (dir == null || !dir.exists() || dir.isFile()) {
            return;
        }

        //获取目录下所有一级文件夹对象
        File[] files = dir.listFiles();

        //判断当前目录下是否存在一级文件对象，存在才可以遍历
        if (files != null && files.length > 0) {
            // 遍历文件数组，寻找特定文件
            for (File f : files) {
                // 检查当前对象是否为文件，并且文件名是否与我们要查找的文件名一致
                if (f.isFile() && f.getName().equals(file)) {
                    // 当找到匹配的文件时，打印出文件的绝对路径
                    System.out.println("找到文件：" + f.getAbsolutePath());
                    // 找到文件后，无需继续搜索，直接返回
                    return;
//                    Runtime r =  Runtime.getRuntime();
//                    r.exec("notepad.exe " + f.getAbsolutePath());
                } else {
                    // 如果当前对象不是文件或者文件名不匹配，则递归地在当前对象中继续搜索文件
                    searchFile(f, file);
                }
            }

        }
    }
}
