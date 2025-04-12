package com.designpatterns.behavioral.visitor;

public class Client {

    public static void main(String[] args) {

        VehicleAction accelerateAction = new AccelerateAction();
        VehicleAction breakAction = new BreakAction();

        VehicleElement truck = new Truck();
        truck.accept(accelerateAction);
        truck.accept(breakAction);

        VehicleElement car = new Car();

        car.accept(accelerateAction);
        car.accept(breakAction);
    }
}
