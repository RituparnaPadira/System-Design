package org.example.subscriber;

public class User implements Subscriber{

    int userId;

    public User(int id) {
        userId = id;
    }

    @Override
    public void getNotification(String msg) {
        System.out.println("User "+ userId+ " has received message -> "+msg);
    }
}
