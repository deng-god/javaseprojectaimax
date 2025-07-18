package com.mayuan.demo4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * *需求**
 * <p>
 * 现在有n个物品，每个物品都是液体，液体存在重量和价值，现在要求你只能从如下提供的液体中总共取走10升液体，每种液体每次可以不拿，全拿，或拿一部分，问取走的10升液体的最高价值是多少。请用程序来完成。
 * <p>
 * 名称          重量(升)     总价值
 * 水            4            24
 * 牛奶           8           160
 * 五粮液          2          4000
 * 可乐       6           108
 * 茅台       1           4000
 * <p>
 * *具体功能点的要求如下**
 * 1、请按照如上数据的顺序，将每种液体数据依次添加到程序中来（注意：可以创建对象封装每种液体数据，并添加到ArrayList集合中去）
 * 2、请用程序计算出取的10升液体的最高价值是多少？以及10升液体具体是哪些液体组成，各自取了多少。
 */

public class Test4 {
    public static void main(String[] args) {
        // 1、定义水对象存储每种液体数据
        // 2、定义一个List集合存储每种液体对象
        Liquid water = new Liquid("水", 4, 24);
        Liquid milk = new Liquid("牛奶", 8, 160);
        Liquid wine = new Liquid("五粮液", 2, 4000);
        Liquid cola = new Liquid("可乐", 6, 108);
        Liquid maotai = new Liquid("茅台", 1, 4000);
        List<Liquid> liquids = new ArrayList<>();
        Collections.addAll(liquids, water, milk, wine, cola, maotai);
        // 3、对List集合按照液体每升单价降序排序
        liquids = liquids.stream().sorted((o1, o2) -> o2.getOnePrice() - o1.getOnePrice()).collect(Collectors.toList());
        //4.遍历集合，从前往后依次选取10升的液体，
        double total = 0;
        int all = 10;
        for (int i = 0; i < liquids.size(); i++) {
            Liquid liquid = liquids.get(i);
            //判断是否完全达到了10升液体
            int volume = liquid.getVolume();
            if(volume >= all){
                System.out.println(liquid.getName() + "提取了" + all + "升");
                total += liquid.getOnePrice() * all;
                break;
            }else {
                System.out.println(liquid.getName() + "提取了" + volume + "升");
                total += liquid.getOnePrice() * volume;
                all -= volume; //剩余还总共需要多少升
            }
        }
        System.out.println("总价值" + total);


    }

}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Liquid {
    private String name;
    private int volume;
    private int price;

    public int getOnePrice() {
        //京都运算：BigDecimal
        BigDecimal price = BigDecimal.valueOf(this.price);
        BigDecimal volume = BigDecimal.valueOf(this.volume);

        return price.divide(volume, 2, BigDecimal.ROUND_HALF_UP).intValue();
    }

}
