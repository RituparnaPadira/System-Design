package org.example;

import org.example.builder.DesktopBuilder;
import org.example.model.MonitorSize;

public class Director {

    DesktopBuilder builder;

    public Director(DesktopBuilder builder) {
        this.builder = builder;
    }

    public Desktop getDesktop() {
        return builder.setCpu()
                .setKeyboard()
                .setMonitor(MonitorSize.MEDIUM)
                .setMouse()
                .build();
    }

}
