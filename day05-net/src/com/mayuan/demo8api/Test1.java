package com.mayuan.demo8api;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        //目标：掌握java提供的获取时间的方案
        //JDK8之前的方案：Date获取此刻日期时间老项目还有。
        Date d = new Date();
        System.out.println(d);

        //格式化：SimpleDateFormat简单日期格式化，格式化日期对象成为我们喜欢的格式。
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
        String str = sdf.format(d);
        System.out.println(str);

        //JDK8之后的方案：LocalDate LocalTime LocalDateTime获取此刻日期时间新项目推荐。
        //获取此刻日期时间对象
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getYear());
        System.out.println(now.getMonth());
        System.out.println(now.getDayOfMonth());

        LocalDateTime now1 = now.plusSeconds(60);
        System.out.println(now1);
        System.out.println(now);

    }
}
