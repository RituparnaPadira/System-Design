package org.example;

import org.example.subscriber.Admin;
import org.example.subscriber.Subscriber;
import org.example.subscriber.User;

public class Main {
    public static void main(String[] args) {

        Observer obs = new Observer();
        Subscriber s1 = new User(1);
        Subscriber s2 = new User(2);
        Subscriber s3 = new Admin(1);

        obs.addSubscriber(s1);
        obs.addSubscriber(s2);
        obs.addSubscriber(s3);

        obs.notifySubscribers("first message");
        obs.removeSubscriber(s2);
        obs.notifySubscribers("second message");
    }
}