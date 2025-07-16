package com.mayuan.demo5_synchronized_method;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String cardId;
    private double money;

    public synchronized void drawMoney(double money){
        //拿到当前谁来取钱。
        String name = Thread.currentThread().getName();
        if(this.money >= money){
            System.out.println(name+"取钱成功！余额为："+this.money);
            //更新余额
            this.money -= money;
            System.out.println(name+"取钱后！余额为："+this.money);
        } else{
            System.out.println(name+"取钱失败！");
        }

    }
}
