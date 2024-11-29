package org.designpatterns.creational.factory;

public class MotorCycle extends ParkingSpot{

    Price price;
    MotorCycle(Price price) {
        super(ParkingSpotType.MOTORCYCLE, price);
        this.price = price;
    }

    public Price getPrice() {
        return price;
    }
}
