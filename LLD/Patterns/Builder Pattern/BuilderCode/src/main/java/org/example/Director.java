package org.example;

import org.example.builders.Builder;

public class Director {

    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Desktop getDesktop() {
        return builder.setMonitor()
                .setKeyboard()
                .setMouse()
                .setCPU()
                .setCamera()
                .setSpeakers()
                .build();
    }

}
