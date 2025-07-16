package com.mayuan.ui;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CLientReaderThread extends Thread {
    private Socket socket;
    private DataInputStream dis;
    private ClientChatFrame win;
    public CLientReaderThread(Socket socket, ClientChatFrame win) {
        this.socket = socket;
        this.win = win;
    }

    @Override
    public void run() {
        try {
            // 接收的消息可能有很多种类型：1、登录消息（包含昵称） 2、群聊消息 3、私聊消息
            // 先从socket管道中接收客户端发送来的消息类型编号
            dis = new DataInputStream(socket.getInputStream());
            while (true) {
                int type = dis.readInt();
                switch (type){
                    case 1:
                        //服务端发来的在线人数消息
                        updateClientOnlineList();
                        break;
                    case 2:
                        //服务端发来的群聊消息
                        getMsgToWin();
                        break;
                    case 3:

                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("客户端下线了："+ socket.getInetAddress().getHostAddress());
        }
    }

    public void getMsgToWin() throws Exception {
        //获取群聊消息
        String msg = dis.readUTF();
        win.setMsgToWin(msg);
    }

    private void updateClientOnlineList() throws Exception {
        //1，读取有多少个在线用户
        int count = dis.readInt();

        //2、循环控制读取多少个用户信息。
        String[] names = new String[count];
        for (int i = 0; i < count; i++) {
            String nickname = dis.readUTF();
            names[i] = nickname;
        }

        win.updateOnlineUsers(names);
    }

}
