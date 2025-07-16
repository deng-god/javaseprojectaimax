package com.mayuan.demo4genericty;

import java.util.ArrayList;

public class GenericDemo5 {
    public static void main(String[] args) {
        //认识通配符，上下限
        ArrayList<Xiaomi> xiaomis = new ArrayList<>();
        xiaomis.add(new Xiaomi());
        go(xiaomis);

        ArrayList<BYD> byds = new ArrayList<>();
        byds.add(new BYD());
        go(byds);

//        ArrayList<Dog>  dogs = new ArrayList<>();
//        dogs.add(new Dog());
//        go(dogs);
    }


    //Xiaomi和BYD都是Car的子类，但是ArrayList<Xiaomi>和ArrayList<BYD>没有关系
    // ? extends Car 表示上限，表示接受Car和Car的子类
    public static void go (ArrayList<? extends Car> cars){

    }

    //  ? super Car 表示下限，表示接受Car和Car的父类
}
