package com.designpatterns.behavioral.observer;

public class SubscriberImpl implements Subscriber{

    @Override
    public void update(String message) {
        System.out.println("message: "+message);
    }
}
