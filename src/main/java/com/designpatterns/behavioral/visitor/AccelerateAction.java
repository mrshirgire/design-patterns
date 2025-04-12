package com.designpatterns.behavioral.visitor;

public class AccelerateAction implements VehicleAction{
    @Override
    public void doAction(VehicleElement vehicleElement) {
        System.out.println("Accelerate action on vehicle "+vehicleElement.getClass().getSimpleName());
    }
}
