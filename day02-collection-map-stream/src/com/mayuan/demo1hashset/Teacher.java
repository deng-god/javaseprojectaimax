package com.mayuan.demo1hashset;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher implements Comparable<Teacher> {
    private String name;
    private int age;
    private double salary;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}' + "\n";
    }

    //t2.compareTo(t1)
    //t2 == this
    //t1 == o
    @Override
    public int compareTo(Teacher o) {
//        if (this.salary > o.salary) {
//            return 1;
//        } else if (this.salary < o.salary) {
//            return -1;
//        }
//        return 0;
        return this.getAge() - o.getAge();
    }
}
