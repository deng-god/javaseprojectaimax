package com.mayuan.demo14commonsio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CommonIoDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：IO框架
        FileUtils.copyFile(new File("day03-file-io\\src\\data.txt"), new File("day03-file-io\\src\\data2.txt"));

        //JDK提供的
        Files.copy(new File("day03-file-io\\src\\data.txt").toPath(), new File("day03-file-io\\src\\data3.txt").toPath());
    }
}
