package com.mayuan.demo6collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraverSalDemo3 {
    public static void main(String[] args) {
        //collecton遍历的方式，1、迭代器
        //2、foreach
        Collection<String> names = new ArrayList<>();
        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("赵六");

        //1.迭代器对象
        Iterator<String> it =  names.iterator();
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
        //
        while (it.hasNext()) {
            String ele =  it.next();
            System.out.println(ele);
        }
    }
}
