package org.designpatterns.creational.factory;

public class CarSpot extends  ParkingSpot{

    private final Price price;

    CarSpot(Price price) {
        super(ParkingSpotType.CAR, price);
        this.price = price;
    }

    public Price getPrice() {
        return price;
    }
}


