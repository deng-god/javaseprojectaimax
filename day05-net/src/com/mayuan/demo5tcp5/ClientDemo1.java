package com.mayuan.demo5tcp5;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：实现TCP通信下多发多收：客户端开发。
        System.out.println("客户端启动了...");
        //1、常见Socket管道对象，请求与服务端的Socket链接。可靠链接
        Socket socket = new Socket("127.0.0.1", 9999);

        //2、从socket.通信管道中得到一个字节输出流。
        OutputStream os = socket.getOutputStream();

        //3.特殊数据流
        DataOutputStream dos = new DataOutputStream(os);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入：");
            String msg = sc.nextLine();
            if("exit".equals(msg)){
                System.out.println("客户端退出了...");
                dos.close();
                socket.close();
                break;
            }

            dos.writeUTF(msg); //发送数据
            dos.flush();
        }



    }
}
