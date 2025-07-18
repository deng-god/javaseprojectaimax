package com.mayuan.demo3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 - **业务一：**
 - 需要你解析上面的字符串，获取里面的用户数据，并封装到Sutdent对象中
 - 多个Student对象在添加到List<Student> 集合中
 - 注意：
 - 字符串中的规则如下，多个用户用 # 拼接，用户的信息之间用 , 拼接,多个景点是用-拼接的。
 - 其中用户的id和选择时间是需要进行类型转换的，其中id需要将String转成Long，选择时间需要将String转成LocalDateTime。
 - **业务二：**

 - 遍历上面获取的List<Student> 集合，统计里面每个景点选择的次数，并输出 景点名称和选择的次数。
 **业务三：
 * 请用程序计算出哪个景点想去的人数最多，以及哪些人没有选择这个最多人想去的景点。
 */
public class Test3 {
    public static void main(String[] args) {
        String info = "10001,张无忌,男,2023-07-22 11:11:12,东湖-黄鹤楼#10002,赵敏,女,2023-07-22 09:11:21,黄鹤楼-归元禅寺#10003,周芷若,女,2023-07-22 04:11:21,木兰文化区-东湖#10004,小昭,女,2023-07-22 08:11:21,东湖#10005,灭绝,女,2023-07-22 17:11:21,归元禅寺" ;
        //把这个信息转换成List<Student>对象
        List<Student> students = parseStudents(info);
        System.out.println(students);

        //遍历上面获取的List<Student> 集合，统计里面每个景点选择的次数，并输出 景点名称和选择的次数。
        Map<String, Integer> map = parseSelectAddress(students);
        String maxSelectAddress = getMaxSelectAddress(map);
        System.out.println("最多选择的景点名称" + maxSelectAddress);

        printNoSelectAddress(students,maxSelectAddress);

    }

    private static void printNoSelectAddress(List<Student> students, String maxSelectAddress) {
        students.stream().filter(student -> !student.getSelectAddress().equals(maxSelectAddress))
                .forEach(student -> System.out.println(student.getName() + "没有选择" + maxSelectAddress));
    }

    private static String getMaxSelectAddress(Map<String, Integer> map) {
        //请使用stream流找出最多选择的景点名称项目
        return map.entrySet().stream().max((o1, o2) ->o1.getValue() - o2.getValue()).get().getKey();
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


    public static Map<String, Integer> parseSelectAddress(List<Student> students){
        Map<String,Integer> map = new HashMap<>();
        for(Student student : students){
            String selectAddress = student.getSelectAddress();
            String[] selectAddressArr = selectAddress.split("-");
            //遍历每个景点
            for(String address : selectAddressArr){
                //判断map中有没有这个景点
                if(map.containsKey(address)){
                    //获取这个景点的次数
                    map.put(address, map.get(address) + 1);
                }else {
                    map.put(address, 1);
                }
            }
        }

        //遍历map
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "被选择了" + entry.getValue() + "次");
        }

        return map;
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
        private String selectAddress;
    }
}
