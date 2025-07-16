package com.mayuan.demo1hashset;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String sex;
    private String school;

    public Student(String name, int age, String sex, String school) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.school = school;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public boolean equals(Object o) {
        //  判断对象是否相等
        if (this == o) return true;
        //  判断对象是否为空，或者对象类型是否相同
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(sex, student.sex) && Objects.equals(school, student.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex, school);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", school='" + school + '\'' +
                '}' + "\n";
    }
}
