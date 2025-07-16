package com.mayuan.demo1hashset;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        //掌握HasSet去重操作
        Student s1 = new Student("张三", 18, "男", "清华大学");
        Student s2 = new Student("张三", 18, "男", "清华大学");
        Student s3 = new Student("柴钰莹",  18, "女", "清华大学");
        Student s4 = new Student("王五", 18, "男", "清华大学");

        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        System.out.println(students);
    }
}
