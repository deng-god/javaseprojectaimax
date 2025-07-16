package com.mayuan.demo2reflect;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class SaveObjectFrameWork {
    //保存任意对象的静态方法
    public static void saveObject(Object obj) throws Exception {
        PrintStream ps = new PrintStream(new FileOutputStream("day06-junit-reflect-annotation-proxy/src/obj.txt", true));
        //obj可能是学生老师狗
        //只有反射可以直到对象有多少个字段：
        //1.获取C1ass对象
        Class c = obj.getClass();
        String simpleName = c.getSimpleName();
        ps.println("=============" + simpleName + "=============");
        //2.获取C1ass对象所有字段
        Field[] fields = c.getDeclaredFields();
        //3.遍历字段
        for (Field f : fields) {
            //获取字段的值
            String filedName = f.getName();
            //获取字段值
            f.setAccessible(true);
            Object filedValue = f.get(obj) +"";
            //打印到文件中去
            ps.println(filedName + ":" + filedValue);
        }
        ps.close();
    }
}
