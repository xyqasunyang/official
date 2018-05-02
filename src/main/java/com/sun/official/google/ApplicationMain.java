package com.sun.official.google;

import com.google.common.eventbus.EventBus;
import com.sun.xml.internal.bind.v2.ClassFactory;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author suny
 * @version 1.0
 * @date 2018年04月16日
 */
public class ApplicationMain {


    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 20, 3000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
        EventBus eventBus = new EventBus();
        eventBus.register(new EventListener());
        for (int i = 0; i < 10; i++) {
            final int x = i;
            threadPoolExecutor.execute(() -> {
                eventBus.post("100" + x);
            });
        }
        EventListener eventListener = ClassFactory.create(EventListener.class);
        System.out.println(eventListener);
//        EventListener eventListener = ClassFactory.newClass(EventListener.class);
//        System.out.println(eventListener);
    }
}
