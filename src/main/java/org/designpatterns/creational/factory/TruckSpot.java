package org.designpatterns.creational.factory;

public class TruckSpot extends ParkingSpot{

    Price price;
    public TruckSpot(Price price) {
        super(ParkingSpotType.TRUCK, price);
        this.price = price;
    }

    public Price getPrice() {
        return price;
    }
}
