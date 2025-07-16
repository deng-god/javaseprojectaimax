package com.mayuan.demo6tcp3;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ServerReader extends Thread {
    private Socket socket;
    public ServerReader(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //3、获取输入流，读取客户端发送的数据
            InputStream is = socket.getInputStream();
            //4、把字节输入流包装成特殊数据输入流
            DataInputStream dis = new DataInputStream(is);
            while (true) {
                //5、读取数据
                String msg = dis.readUTF();
                System.out.println(" msg:" + msg);
                //6.客户端的ip和端口（谁给我发的）
                System.out.println("客户端的ip:" + socket.getInetAddress().getHostAddress());
                System.out.println("客户端的端口:" + socket.getPort());
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("客户端断开了" + socket.getInetAddress().getHostAddress());
        }
    }
}
