package com.designpatterns.behavioral.command;

class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute(); // Bridge to abstracted device
    }
}
