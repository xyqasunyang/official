package com.sun.official.google;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;

/**
 * @author suny
 * @version 1.0
 * @date 2018年04月16日
 */
public class EventListener {

    private String test;

    public EventListener(){
        System.out.println("init");
    }

    @Subscribe
    public void listen(OrderEvent orderEvent) {
        System.out.println("receive orderEvent: " + orderEvent.getMessage());
    }

    @Subscribe
    @AllowConcurrentEvents
    public void listen(String message) {
        this.test = message;
        System.out.println("receive message: " + test);
    }
}
