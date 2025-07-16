package com.mayuan.demo2reflect;

public class ReflectDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：掌握反射第一步操作：或者类的C1ass对象。（获取类本身）。
        //1、获取类本身：类.class
        Class c1 = Student.class;
        System.out.println(c1);

        //2.获取对象本身：Class.forName("类的全路径")
        Class c2 = Class.forName("com.mayuan.demo2reflect.Studnet");
        System.out.println(c2);

        System.out.println(c1==c2);

        //3.获取对象本身：对象.getClass()
        Student s = new Student();
        Class c3 = s.getClass();
        System.out.println(c3);

    }
}
