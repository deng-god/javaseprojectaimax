package com.mayuan.demo3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        String info = "10001,张无忌,男,2023-07-22 11:11:12,东湖-黄鹤楼#10002,赵敏,女,2023-07-22 09:11:21,黄鹤楼-归元禅寺#10003,周芷若,女,2023-07-22 04:11:21,木兰文化区-东湖#10004,小昭,女,2023-07-22 08:11:21,东湖#10005,灭绝,女,2023-07-22 17:11:21,归元禅寺" ;
        //把这个信息转换成List<Student>对象
        List<Student> students = parseStudents(info);
    }

    public static List<Student> parseStudents(String info) {

        //1.把字符串转换成数组
        String[] studentsInfo = info.split("#");
        //2.创建集合
        List<Student> students = new ArrayList<>();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //遍历数组
        for (String studentInfo : studentsInfo) {
            String[] studentInfoArr = studentInfo.split(",");
            String time = studentInfoArr[3];
            //解析成localDataTime对象
            LocalDateTime localDateTime = LocalDateTime.parse(time, dtf);
            Student student = new Student(Long.parseLong(studentInfoArr[0]), studentInfoArr[1], studentInfoArr[2], localDateTime, studentInfoArr[4]);
            //添加到集合中
            students.add(student);
        }
        //6.返回集合
        return students;
    }


    //定义学生类
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class Student {
        private Long id;
        private String name;
        private String sex;
        private LocalDateTime localDateTime;
        private String location;
    }
}
