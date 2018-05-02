package com.sun.official.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author suny
 * @version 1.0
 * @date 2018年04月12日
 */
public class LiuDeHuaProxy {


    private Person ldh = new LiuDeHua();

    public Person getProxy() {
        return (Person) Proxy.newProxyInstance(LiuDeHuaProxy.class
                        .getClassLoader(), ldh.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method,
                                         Object[] args) throws Throwable {
                        if (method.getName().equals("sing")) {
                            System.out.println("我是他的经纪人，要找他唱歌得先给十万块钱！！");
                            return method.invoke(ldh, args);
                        }
                        if (method.getName().equals("dance")) {
                            System.out.println("我是他的经纪人，要找他跳舞得先给二十万块钱！！");
                            return method.invoke(ldh, args);
                        }
                        return null;
                    }
                });
    }
}
