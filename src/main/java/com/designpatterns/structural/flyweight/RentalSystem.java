package com.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

class CarModel {
    private final String make;
    private final String model;

    public CarModel(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void rent(String renterName) {
        System.out.println(renterName + " rented " + make + " " + model);
    }
}

class CarModelFactory {
    private static final Map<String, CarModel> models = new HashMap<>();

    public static CarModel getCarModel(String make, String model) {
        return models.computeIfAbsent(make + model, k -> new CarModel(make, model));
    }
}

public class RentalSystem {
    public static void main(String[] args) {
        CarModel model1 = CarModelFactory.getCarModel("Toyota", "Camry");
        model1.rent("Alice");

        CarModel model2 = CarModelFactory.getCarModel("Toyota", "Camry");
        model2.rent("Bob");
    }
}
