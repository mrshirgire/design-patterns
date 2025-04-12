package com.designpatterns.structural.bridge;

public class Car extends Vehicle{


    Car(WorkShop productBuildrWorkshop, WorkShop assembler) {
        super(productBuildrWorkshop, assembler);
    }

    @Override
    public void manufacturing() {
        productBuildr.work();
        assembler.work();;
    }
}
