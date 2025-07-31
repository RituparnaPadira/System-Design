package org.example.subscriber;

public class Admin  implements Subscriber{

    int adminId;

    public Admin(int id) {
        adminId = id;
    }

    @Override
    public void getNotification(String msg) {
        System.out.println("Admin "+ adminId+ " has received message -> "+msg);
    }
}
