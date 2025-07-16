package com.mayuan.demo13printstream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataStreamDemo2 {
    public static void main(String[] args) {
        //目标：特殊数据流的使用。
        try (
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("day03-file-io\\src\\data.txt"))
        ) {
            dos.writeUTF("hello");
            dos.writeUTF("你好");
            dos.writeInt(100);
            dos.writeDouble(3.14);
            dos.writeBoolean(true);
            dos.writeChar('a');
            dos.writeByte(127);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
