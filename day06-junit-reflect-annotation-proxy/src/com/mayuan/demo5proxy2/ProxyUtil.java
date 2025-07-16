package com.mayuan.demo5proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static <T> T createProxy(T obj) {
        T proxy = (T) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                obj.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        long start = System.currentTimeMillis();
                        //真正调用业务对象被代理方法
                        Object result = method.invoke(obj, args);

                        long end = System.currentTimeMillis();

                        System.out.println("耗时：" + (end - start));
                        return null;
                    }
                });
        return proxy;
    }
}
