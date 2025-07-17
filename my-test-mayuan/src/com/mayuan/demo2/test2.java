package com.mayuan.demo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class test2 {
    //使用面向对象编程，创建对象代表一个一个的囚犯（第一次的位置和他的随即编号）
    public static void main(String[] args) {
        //创建一个List集合，用于保存所有的囚犯对象
        List<Prisoner> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            int code = (int) (Math.random() * 100 + 1);
            if(isRepeat(code, list)){
                i--; //重复的编号，重新生成编号
                continue; //跳过本次循环

            }
            Prisoner p = new Prisoner(code, i);
            list.add(p);
        }
        System.out.println(list);

        //干掉集合中奇数位置的囚犯，直到下一个囚犯为止
        while(true){
            List<Prisoner> list2 = new ArrayList<>();
            for (int i = 1; i < list.size(); i+=2) {
                Prisoner p = list.get(i);
                list2.add(p);
            }
            if(list2.size() == 1){
                Prisoner prisoner = list2.get(0);
                System.out.println("最后剩余的编号是：" + prisoner.getId() + "，位置是：" + prisoner.getFirstLocation() );
                break;
            }
            list = list2; //剩余的囚犯交给集合作为下一轮继续用
        }

    }



    //判断编号是否重复
    public static boolean isRepeat(int code, List<Prisoner> list) {
        for (Prisoner p : list) {
            if (p.getId() == code) {
                return true;
            }
        }
        return false;
    }
}

//定义一个囚犯类，封住将随机编号，第一次的位置
@Data
@AllArgsConstructor
@NoArgsConstructor
class Prisoner {
    private int id;
    private int firstLocation;
}
