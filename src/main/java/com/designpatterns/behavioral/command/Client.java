package com.designpatterns.behavioral.command;

public class Client {

    public static void main(String[] args) {
        Device tv = new Tv();
        Command turnOnTV = new TurnOnCommand(tv);
        Command turnOffTV = new TurnOffCommand(tv);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(turnOnTV);
        remote.pressButton();

        remote.setCommand(turnOffTV);
        remote.pressButton();
    }

    /*
  *        +----------------+           +----------------------+
           |   RemoteControl|           |      Command         |
           |----------------|           |----------------------|
           | -command       |<>-------->| +execute()           |
           | +setCommand()  |           +----------+-----------+
           | +pressButton() |                      |
           +----------------+                      |
                                                   |
            -----------------------------------------
            |                                       |
    +---------------------+             +----------------------+
    |   TurnOnCommand     |             |    TurnOffCommand    |
    |---------------------|             |----------------------|
    | -device: Device     |             | -device: Device      |
    | +execute()          |             | +execute()           |
    +---------------------+             +----------------------+
            |                                      |
            | injects                              | injects
            |                                      |
        +--------------------+           +---------------------+
        |      Device        |<----------|   Concrete Devices   |
        |--------------------|           |---------------------|
        | +turnOn()          |           |  TV, Radio, etc.     |
        | +turnOff()         |           +---------------------+
        +--------------------+

    *
    *
    * */
}
