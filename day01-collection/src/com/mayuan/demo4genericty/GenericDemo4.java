package com.mayuan.demo4genericty;

public class GenericDemo4 {
    public static void main(String[] args) {
        //认识泛型方法，搞清楚作用
        String[] str = {"a","b","c"};
        show(str);

        Integer[] ints = {1,2,3,4,5};
        show(ints);
    }

    public static <T> void show(T[] t) {
        System.out.println(t);
    }

    public static <T> T getMax(T[] t){
        return null;
    }
}
