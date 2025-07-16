package com.mayuan.demo3annotation;


@MyBook(name="mayuan",age=20,adress={"北京","上海"})
//@A(value = "delete")
//@A("delete") //特殊属性value，在使用时只有一个value属性，value名称可以不写
//@A(value="delete",hobby="打篮球")
@A("delete")
public class AnnotationDemo1 {
    @MyBook(name="mayuan",age=20,adress={"北京","上海"})
    public static void main(String[] args) {

    }
}
