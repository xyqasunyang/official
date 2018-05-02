package com.sun.official.ObjectOriented;

import java.util.Random;

/**
 * @author suny
 * @version 1.0
 * @date 2018年04月12日
 */
public class Man extends Person {

    @Override
    public void name() {
        System.out.println("man");
    }

    @Override
    public int hashCode() {
        return (int) (Math.random() * 10000);
    }
}
