package org.designpatterns.creational.factory;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.logging.Logger;
import java.util.logging.Level;


public class Client {

    private static final Logger logger = Logger.getLogger(Client.class.getName());

    public static void main(String[] args) {

        ParkingSpotFactory parkingSpotFactory = new ParkingSpotFactory();
        Price carParkingSpotPrice = new Price(new BigDecimal("1.245"), Currency.getInstance("USD"));

        ParkingSpot carParkingSpot = parkingSpotFactory.getParkingSpot(ParkingSpotType.CAR, carParkingSpotPrice);
        logger.log(Level.INFO, "Car parking spot: {0}", carParkingSpot);
        logger.log(Level.INFO, "Is car parking spot is available? {0}", carParkingSpot.isAvailable());

    }
}
