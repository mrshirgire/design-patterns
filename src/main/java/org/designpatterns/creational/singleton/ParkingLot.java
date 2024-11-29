package org.designpatterns.creational.singleton;

public class ParkingLot {

    private ParkingLot(){
        throw new IllegalStateException("Instance of ParkingLot already created.");
    }
    private static class ParkingLotHolder {
        private static final ParkingLot INSTANCE = new ParkingLot();
    }

    public ParkingLot getInstance() {
        return ParkingLotHolder.INSTANCE;
    }
}
