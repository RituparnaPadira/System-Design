package org.example.builders;

public class DellBuilder extends Builder{
    @Override
    public Builder setMonitor() {
        monitor = "Dell Monitor";
        return this;
    }

    @Override
    public Builder setKeyboard() {
        keyboard = "Dell keyboard";
        return this;
    }

    @Override
    public Builder setMouse() {
        mouse = "Dell mouse";
        return this;
    }

    @Override
    public Builder setSpeakers() {
        speakers = "Dell speakers";
        return this;
    }

    @Override
    public Builder setCPU() {
        CPU = "Dell CPU";
        return this;
    }

    @Override
    public Builder setCamera() {
        camera = "Dell camera";
        return this;
    }
}
