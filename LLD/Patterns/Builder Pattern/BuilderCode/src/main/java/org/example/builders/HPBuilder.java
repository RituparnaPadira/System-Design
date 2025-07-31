package org.example.builders;

public class HPBuilder extends Builder{

    @Override
    public Builder setMonitor() {
        monitor = "HP Monitor";
        return this;
    }

    @Override
    public Builder setKeyboard() {
        keyboard = "HP keyboard";
        return this;
    }

    @Override
    public Builder setMouse() {
        mouse = "HP mouse";
        return this;
    }

    @Override
    public Builder setSpeakers() {
        speakers = "HP speakers";
        return this;
    }

    @Override
    public Builder setCPU() {
        CPU = "HP CPU";
        return this;
    }

    @Override
    public Builder setCamera() {
        camera = "HP camera";
        return this;
    }
}
