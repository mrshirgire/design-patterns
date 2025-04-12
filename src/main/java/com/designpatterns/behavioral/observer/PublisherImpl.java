package com.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class PublisherImpl implements Publisher{

    List<Subscriber> subscriberList;
    PublisherImpl() {
        subscriberList = new ArrayList<>();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscriberList) {
            // Notify each subscriber
            // This is a placeholder for the actual notification logic
            System.out.println("Notifying subscriber: " + subscriber);
        }
    }
}
