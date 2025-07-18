package com.mayuan.test1;

public class 数组 {
    public static void main(String[] args) {
//        int[] array = new int[10];
//        Object obj = array;


        // 类型[] = new 类型[数组大小];
        //类型[] = {直接赋值，但是只能在定义时赋值};

//        int[] array = new int[10];
//        System.out.println(array.toString());
//        System.out.println(array.equals(array));

//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i] + "");
//        }
//
//        System.out.println("-----------------------------");
//        for (int i : array) {
//            System.out.println(i + "");
//        }


        int[][] array = new int[][]{{1,2},{3,4},{5,6}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }

    }
}
