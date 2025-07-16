package com.mayuan.demo3udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServiceDemo2 {
    public static void main(String[] args) throws Exception{
        //目标：完成UDP通信多发多收：服务端开发。
        //1、创建接收端对象，注册端口。
        DatagramSocket socket = new DatagramSocket(10086);

        //2.创建一个数据包对象负责接收数据。（韭菜盘子）
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        while (true) {
            //3.接收数据，将数据封装到数据包对象的字节数组中去。
            socket.receive(packet);

            //4.看看数据是否收到了
            String data = new String(buf);
            System.out.println("服务端收到了" + data);

            //获取对方的ip对象和程序入口
            String ip = packet.getAddress().getHostAddress();
            int port = packet.getPort();
            System.out.println("对方ip:" + ip + "  port:" + port);

            System.out.println("-------------------------------");
        }
    }
}
