package org.example.builders;

import org.example.Desktop;

public abstract class Builder {

    protected String monitor;
    protected String keyboard;
    protected String mouse;
    protected String speakers;
    protected String CPU;
    protected String camera;

    public abstract Builder setMonitor();
    public abstract Builder setKeyboard();
    public abstract Builder setMouse();
    public abstract Builder setSpeakers();
    public abstract Builder setCPU();
    public abstract Builder setCamera();

    public String getMonitor() {
        return monitor;
    }

    public String getKeyboard() {
        return keyboard;
    }
    public String getMouse() {
        return mouse;
    }
    public String getSpeakers() {
        return speakers;
    }
    public String getCPU() {
        return CPU;
    }
    public String getCamera() {
        return camera;
    }


    public Desktop build() {
        return new Desktop(this);
    }

}
