package com.mayuan.demo6_lock;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String cardId;
    private double money;
    private final Lock lk = new ReentrantLock(); // final保护锁

    public void drawMoney(double money){
        //拿到当前谁来取钱。
        String name = Thread.currentThread().getName();
        lk.lock(); // 加锁
        try {
            if(this.money >= money){
                System.out.println(name+"取钱成功！余额为："+this.money);
                //更新余额
                this.money -= money;
                System.out.println(name+"取钱后！余额为："+this.money);
            } else{
                System.out.println(name+"取钱失败！");
            }
        } finally {
            lk.unlock(); // 解锁
        }

    }
}
