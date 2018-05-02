package com.sun.official.classFactory;

/**
 * @author suny
 * @version 1.0
 * @date 2018年04月16日
 */
public class ClassFactory<T> {

    public static <T> T newClass(Class<T> clz) throws IllegalAccessException, InstantiationException {
        return clz.newInstance();
    }

}
