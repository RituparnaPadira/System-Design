package org.example;

public class Logger {

    private static Logger obj = null;
    int count = 0;
    private Logger() {
        System.out.println("No. of instances created " + ++count);
    }

    public static Logger getInstance() {
        if(obj==null) {
            synchronized (Logger.class) {
                if(obj==null) {
                    obj = new Logger();
                }
            }
        }
        return obj;
    }

}
