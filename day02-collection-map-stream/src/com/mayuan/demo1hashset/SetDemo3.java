package com.mayuan.demo1hashset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {
        //学习TreeSet集合对于自定义对象的推荐
        Set<Teacher> set = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
//                return o1.getAge() - o2.getAge();
//                if (o1.getSalary() > o2.getSalary()) {
//                    return 1;
//                } else if (o1.getSalary() < o2.getSalary()) {
//                    return -1;
//                }
//                return 0;
//                return Double.compare(o1.getSalary(), o2.getSalary()); //薪水升序
                return Double.compare(o2.getSalary(), o1.getSalary()); //薪水降序

            }
        });
        //简化版
//        Set<Teacher> set = new TreeSet<>((o1, o2) -> Double.compare(o2.getSalary(), o1.getSalary()));

        set.add(new Teacher("张三", 18, 5000));
        set.add(new Teacher("柴钰莹", 20, 5000));
        set.add(new Teacher("郭钰", 29, 5000));
        set.add(new Teacher("王五", 14, 5000));
        System.out.println(set);
        //TreeSet集合默认不能给自定义对象排序
        // 1。需要重写Comparable接口的compare方法，指定大小比较规则
        // 2.创建TreeSet集合时，该集合自带比较器Comparetor对象，指定比较规则

    }
}
