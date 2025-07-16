package com.mayuan.demo3udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClientDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：完成UDP通信多发多收：客户端开发。
        //1、创建发送端对象（代表抛韭菜的人）
        DatagramSocket socket = new DatagramSocket();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要发送的数据：");
            String msg = sc.nextLine(); //接收一整行的数据

            //如果用户输入的是exit,则退出
            if ("exit".equals(msg)) {
                socket.close();
                break;
            }

            //2、创建数据包对象封装要发送的数据。（韭菜盘子）
            byte[] bytes =msg.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 10086);

            //3.让发送端对象发送数据包的数据
            socket.send(packet);
        }


    }
}
