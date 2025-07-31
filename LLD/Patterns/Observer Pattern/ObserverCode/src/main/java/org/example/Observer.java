package org.example;

import org.example.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class Observer {

    List<Subscriber> subscribers = new ArrayList<>();

    void addSubscriber(Subscriber s) {
        subscribers.add(s);
    }

    void removeSubscriber(Subscriber s) {
        subscribers.remove(s);
    }

    public void notifySubscribers(String msg) {
        for(Subscriber s : subscribers) {
            s.getNotification(msg);
        }
    }

}
