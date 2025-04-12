package com.designpatterns.behavioral.visitor;

public class Car implements VehicleElement{
    @Override
    public void accept(VehicleAction vehicleAction) {
        vehicleAction.doAction(this);
    }
}
