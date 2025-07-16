package com.mayuan.demo2reflect;

public class Dog {
    private String name;
    private int age;
    private String hobby;

    private void show() {
        System.out.println("show()");
    }

    public String show(String name) {
        return "show(String name)";
    }

    private Dog() {
    }

    private Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }
}
