package com.mayuan.demo4_synchronized_code;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String cardId;
    private double money;

    public void drawMoney(double money){
        //拿到当前谁来取钱。
        String name = Thread.currentThread().getName();

        //锁对象
        //实例方法使用this作为锁
        //类方法使用当前类作为锁 Account.class
        synchronized (this) {
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
}
