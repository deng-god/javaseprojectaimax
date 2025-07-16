package com.mayuan.demo2udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClientDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：完成UDP通信一发一收：客户端开发。
        //1、创建发送端对象（代表抛韭菜的人）
        DatagramSocket socket = new DatagramSocket();
        //2、创建数据包对象封装要发送的数据。（韭菜盘子）
        byte[] bytes = "hello,UDP".getBytes();
        /**
         * 参数一：要发送的数据
         * 参数二：要发送的数据的长度
         * 参数三：对方的IP地址
         * 参数四：对方的端口号
         */
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 10086);

        //3.让发送端对象发送数据包的数据
        socket.send(packet);

        socket.close();


    }
}
