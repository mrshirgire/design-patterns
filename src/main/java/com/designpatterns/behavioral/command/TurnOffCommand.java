package com.designpatterns.behavioral.command;

class TurnOffCommand implements Command {

    private final Device device;

    public TurnOffCommand(Device device) {
        this.device = device;
    }

    public void execute() {
        device.turnOff(); // Injecting abstract into executor method
    }
}