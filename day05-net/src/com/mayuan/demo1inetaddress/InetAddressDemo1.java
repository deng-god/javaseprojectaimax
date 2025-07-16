package com.mayuan.demo1inetaddress;

import java.net.InetAddress;

public class InetAddressDemo1 {
    public static void main(String[] args) {
        //目标：认识InetAddress获取本机IP对象和对方IP对象。
        try {
            //1、获取本机IP对象
            InetAddress local = InetAddress.getLocalHost();
            System.out.println(local);
            System.out.println(local.getHostAddress());

            //2、获取对方IP对象
            InetAddress remote = InetAddress.getByName("www.baidu.com");
            System.out.println(remote);
            System.out.println(remote.getHostAddress());
            System.out.println(remote.getHostName());
            //判断本机与对方主机是否互通
            System.out.println(remote.isReachable(5000));

            //3、获取IP地址
            System.out.println(remote.getHostAddress());

            //4、获取主机名
            System.out.println(remote.getHostName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
