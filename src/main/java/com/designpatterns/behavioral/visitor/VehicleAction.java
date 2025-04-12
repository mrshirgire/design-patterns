package com.designpatterns.behavioral.visitor;

import com.designpatterns.structural.bridge.Car;
import com.designpatterns.structural.bridge.Vehicle;

public interface VehicleAction {

    // also we called it visitor
    void doAction(VehicleElement vehicleElement);
}
