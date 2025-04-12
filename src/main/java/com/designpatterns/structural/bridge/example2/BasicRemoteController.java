package com.designpatterns.structural.bridge.example2;

import javax.swing.event.DocumentEvent;

public class BasicRemoteController implements RemoteController {

    Device device;

    BasicRemoteController(Device device) {
        this.device =device;
    }

    // do operation of device

}
