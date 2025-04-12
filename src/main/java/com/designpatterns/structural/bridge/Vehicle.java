package com.designpatterns.structural.bridge;



public abstract class Vehicle {

    WorkShop productBuildr;
    WorkShop assembler;
    Vehicle(WorkShop productBuildr, WorkShop assembler){
        this.productBuildr = productBuildr;
        this.assembler = assembler;
    }

    public abstract void manufacturing();
}
