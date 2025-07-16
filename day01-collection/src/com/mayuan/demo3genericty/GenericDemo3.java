package com.mayuan.demo3genericty;

public class GenericDemo3 {
    public static void main(String[] args) {
        StudentData  studentData = new StudentData();
        studentData.add(new Student());
        studentData.delete(new Student());
        studentData.update(new Student());
        studentData.query(1);
    }
}
