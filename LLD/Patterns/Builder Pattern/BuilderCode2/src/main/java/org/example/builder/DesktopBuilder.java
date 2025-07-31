package org.example.builder;

import org.example.Desktop;
import org.example.components.CPU;
import org.example.components.Keyboard;
import org.example.components.Monitor;
import org.example.components.Mouse;
import org.example.model.MonitorSize;

public abstract class DesktopBuilder {
    protected Monitor monitor;
    protected CPU cpu;
    protected Keyboard keyboard;
    protected Mouse mouse;


    public abstract DesktopBuilder setMonitor(MonitorSize size);
    public abstract DesktopBuilder setCpu();
    public abstract DesktopBuilder setKeyboard();
    public abstract DesktopBuilder setMouse();
    public Desktop build() {
        return new Desktop(this);
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public CPU getCpu() {
        return cpu;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }
}
