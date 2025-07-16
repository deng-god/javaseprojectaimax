package com.mayuan.demo7list;

import java.util.LinkedList;

public class ListDemo2 {
    public static void main(String[] args) {
        //用linkedList做一个队列对象
        LinkedList<String> queue = new LinkedList<>();
        //入队
        queue.addLast("hello");
        queue.addLast("world");
        queue.addLast("java");
        System.out.println(queue);

        //出队
        System.out.println(queue.removeFirst());
        System.out.println(queue);

        System.out.println("--------------");

        //设计一个栈
        LinkedList<String> stack = new LinkedList<>();

        stack.push("第1颗子弹"); //addFirst
        stack.addFirst("第2颗子弹");
        stack.addFirst("第3颗子弹");
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
