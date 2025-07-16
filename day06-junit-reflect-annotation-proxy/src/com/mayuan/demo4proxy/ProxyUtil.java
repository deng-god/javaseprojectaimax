package com.mayuan.demo4proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class ProxyUtil {
    public static StarService createProxy(Star s){
        /**
         * 参数一：用于执行用哪个类加载器去加载生成的代理类。
         * 参数二：用于指定代理类需要实现的接口：明星类实现了哪些接口，代理类就实现哪些接口
         * 参数三：用于指定代理类需要如何去代理（代理要做的事情）。
         */
        StarService proxy = (StarService) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                s.getClass().getInterfaces(), new InvocationHandler(){
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //用来声明代理对象要干的事情。
                        //参数一：pr0Xy接收到代理对象本身（暂时用处不大）
                        //参数二：method代表正在被代理的方法
                        //参数三：args代表正在被代理的方法的参数
                        System.out.println("代理类开始执行...");
                        String methodname = method.getName();
                        if("sing".equals(methodname)){
                            System.out.println("代理类开始执行sing方法...");
                        }else if("dance".equals(methodname)){
                            System.out.println("代理类开始执行dance方法...");
                        }
                        Object result = method.invoke(s, args);
                        System.out.println("代理类结束执行...");
                        return result;
                    };
                });
        return proxy;
    }
}
