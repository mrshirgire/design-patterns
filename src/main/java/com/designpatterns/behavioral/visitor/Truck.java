package com.designpatterns.behavioral.visitor;

public class Truck implements VehicleElement{

    @Override
    public void accept(VehicleAction vehicleAction) {
        vehicleAction.doAction(this);
    }
}
