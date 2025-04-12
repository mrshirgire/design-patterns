package com.designpatterns.structural.bridge;

public class Truck extends Vehicle{


    Truck(WorkShop productBuildr, WorkShop assembler) {
        super(productBuildr, assembler);
    }

    @Override
    public void manufacturing() {
        productBuildr.work();;
        assembler.work();;
    }
}
