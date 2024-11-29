package org.designpatterns.creational.factory;

public class ParkingSpotFactory {


    public ParkingSpot getParkingSpot(ParkingSpotType parkingSpotType, Price price) {

        if(parkingSpotType == null) {
            throw new IllegalArgumentException("Parking Spot type cannot be null");
        }

        switch (parkingSpotType) {
            case CAR:
                return new CarSpot(price);
            case TRUCK:
                return new TruckSpot(price);
            case MOTORCYCLE:
                return new MotorCycle(price);
            default:
                throw new IllegalArgumentException("Unsupported parking spot type: " + parkingSpotType);
        }
    }
}
