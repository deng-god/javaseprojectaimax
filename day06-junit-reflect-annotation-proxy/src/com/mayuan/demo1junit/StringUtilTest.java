package com.mayuan.demo1junit;

import org.junit.Assert;
import org.junit.Test;

//测试类：junit.单元测试框架，对业务类中的业务方法进行正确性测试。
public class StringUtilTest {
    //测试方法：必须是公开public,无参，无返回值。
    //测试方法必须加上@Test注解(Junit框架的核心步骤)
    @Test
    public void testPrintNumber() {
        //测试方法中，调用业务方法
        StringUtil.printNumber("张三");

        StringUtil.printNumber("");
        StringUtil.printNumber(null);
    }

    @Test
    public void testGetMaxIndex() {
        int index = StringUtil.getMaxIndex("张三");
        System.out.println(index);

        int index2 = StringUtil.getMaxIndex("");
        System.out.println(index2);

        int index3 = StringUtil.getMaxIndex(null);
        System.out.println(index3);

        //做断言：断言结果是否与预期结果一致
        Assert.assertEquals(2, index);
        Assert.assertEquals(-1, index2);
        Assert.assertEquals(-1, index3);
    }

}
