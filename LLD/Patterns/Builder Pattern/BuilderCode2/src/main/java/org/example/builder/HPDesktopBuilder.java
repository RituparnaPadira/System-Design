package org.example.builder;

import org.example.components.CPU;
import org.example.components.Keyboard;
import org.example.components.Monitor;
import org.example.components.Mouse;
import org.example.model.ConnectionType;
import org.example.model.MonitorSize;

public class HPDesktopBuilder extends  DesktopBuilder{

    @Override
    public DesktopBuilder setMonitor(MonitorSize size) {
        monitor = new Monitor();
        if(size == MonitorSize.SMALL) {
            monitor.height = 20;
            monitor.width = 30;
        } else if(size == MonitorSize.MEDIUM) {
            monitor.height = 40;
            monitor.width = 50;
        } else if(size == MonitorSize.LARGE) {
            monitor.height = 45;
            monitor.width = 70;
        }

        monitor.maxBrightness = 100;
        monitor.pixels = 2500;
        return this;
    }

    @Override
    public DesktopBuilder setCpu() {
        cpu = new CPU();
        cpu.cores = 4;
        cpu.ram = 4;
        cpu.graphics = true;
        return this;
    }

    @Override
    public DesktopBuilder setKeyboard() {
        keyboard = new Keyboard();
        keyboard.connectionType = ConnectionType.WIRED;
        keyboard.numberOfKeys = 84;
        keyboard.metaKey = "Ctrl";
        return this;
    }

    @Override
    public DesktopBuilder setMouse() {
        mouse = new Mouse();
        mouse.connectionType = ConnectionType.WIRED;
        return this;
    }
}
