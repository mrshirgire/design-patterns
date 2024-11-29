package org.designpatterns.creational.factory;

import java.util.Objects;
import java.util.UUID;

public class ParkingSpot {

    private final UUID parkingSpotId;
    private String vehicleId;
    private final ParkingSpotType PARKING_SPOT_TYPE;
    private final Price price;

    ParkingSpot(ParkingSpotType PARKING_SPOT_TYPE, Price price) {
        this.parkingSpotId = UUID.randomUUID();
        this.PARKING_SPOT_TYPE = PARKING_SPOT_TYPE;
        this.price = price;
    }

    public boolean isAvailable() {
        return !Objects.isNull(this.vehicleId);
    }

    public void parkVehicle(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public UUID getParkingSpotId() {
        return this.parkingSpotId;
    }

    public Price getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "ParkingSpot{" +
                "parkingSpotId=" + parkingSpotId +
                ", vehicleId='" + vehicleId + '\'' +
                ", PARKING_SPOT_TYPE=" + PARKING_SPOT_TYPE +
                ", price=" + price.getAmount() + price.getCurrency() +
                '}';
    }
}

