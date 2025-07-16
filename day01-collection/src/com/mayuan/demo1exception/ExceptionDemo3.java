package com.mayuan.demo1exception;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        //认识自定义异常
        try {
            saveAge(-10);
        } catch (IllegalAgeException e) {
            e.printStackTrace();
            System.out.println("保存年龄失败");
        }
    }

    public static void saveAge(int age) throws IllegalAgeException {
        if(age<0 || age>120){
            throw new IllegalAgeException("年龄不合法");
        }else{
            System.out.println("年龄合法");
            System.out.println("保存年龄成功");
        }
    }
}
