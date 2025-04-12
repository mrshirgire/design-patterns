package com.designpatterns.behavioral.visitor;

public class BreakAction implements VehicleAction{
    @Override
    public void doAction(VehicleElement vehicleElement) {
        System.out.println("Took break action on vehicle "+vehicleElement.getClass().getSimpleName());
    }
}
