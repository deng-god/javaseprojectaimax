package com.mayuan.demo8test;

import java.util.List;

//线程类
public class PeopleGetRedPacket extends Thread {
    private List<Integer> redPacket;
    public PeopleGetRedPacket(List<Integer> redPacket, String name) {
        super(name);
        this.redPacket = redPacket;
    }

    @Override
    public void run(){
        while(true){
        //100个人来抢redPacket集合中的钱.
        synchronized (redPacket){
            if(redPacket.size()==0){
                break;
            }
            //随机一个索引得到红包
            int index = (int)(Math.random()*redPacket.size());
            Integer money = redPacket.get(index);
            System.out.println(getName()+"抢到红包:"+money);
            if(redPacket.size() == 0){
                System.out.println("活动结束");
                break;
            }
        }
        }
    }
}
