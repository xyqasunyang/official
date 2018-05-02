package com.sun.official.proxy;

/**
 * @author suny
 * @version 1.0
 * @date 2018年04月12日
 */
public class ApplicationMain {

    public static void main(String[] args) {
        LiuDeHuaProxy proxy = new LiuDeHuaProxy();
        Person p = proxy.getProxy();
        String retValue = p.sing("冰雨");
        System.out.println(retValue);
        String value = p.dance("江南style");
        System.out.println(value);
    }
}
