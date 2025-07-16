package com.mayuan.demo6collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionTraverSalDemo5 {
    public static void main(String[] args) {
        //collecton遍历的方式，3.lambda
        //2、foreach
        Collection<String> names = new ArrayList<>();
        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("赵六");

//        names.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        names.forEach(s -> System.out.println(s));

        names.forEach(System.out::println);

    }
}
