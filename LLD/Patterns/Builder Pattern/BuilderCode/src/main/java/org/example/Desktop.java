package org.example;

import org.example.builders.Builder;

public class Desktop {

    String monitor;
    String keyboard;
    String mouse;
    String speakers;
    String CPU;
    String camera;

    public Desktop(Builder builder) {
        monitor = builder.getMonitor();
        keyboard = builder.getKeyboard();
        mouse = builder.getMouse();
        speakers = builder.getSpeakers();
        CPU = builder.getCPU();
        camera = builder.getCamera();
    }

    public void getConfiguration() {
        System.out.println("Monitor is "+monitor);
        System.out.println("Keyboard is "+keyboard);
        System.out.println("Mouse is "+mouse);
        System.out.println("Speakers is "+speakers);
        System.out.println("CPU is "+CPU);
        System.out.println("camera is "+camera);
    }
}
