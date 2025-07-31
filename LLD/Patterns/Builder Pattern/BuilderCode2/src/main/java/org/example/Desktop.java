package org.example;

import org.example.builder.DesktopBuilder;
import org.example.components.CPU;
import org.example.components.Keyboard;
import org.example.components.Monitor;
import org.example.components.Mouse;

public class Desktop {
    Monitor monitor;
    CPU cpu;
    Keyboard keyboard;
    Mouse mouse;

    public Desktop(DesktopBuilder builder) {
        monitor = builder.getMonitor();
        cpu = builder.getCpu();
        keyboard = builder.getKeyboard();
        mouse = builder.getMouse();
    }
}
