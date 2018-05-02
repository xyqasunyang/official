package com.sun.official.ObjectOriented;

/**
 * @author suny
 * @version 1.0
 * @date 2018年04月12日
 */
public class ApplicationMain {

    public static void main(String[] args) {
        Person person = new Man();
        person.name();
        System.out.println(person.hashCode()==person.hashCode());
    }
}
