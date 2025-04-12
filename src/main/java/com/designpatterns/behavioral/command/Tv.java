package com.designpatterns.behavioral.command;



public class Tv implements Device {

    private boolean isOn;

    public Tv() {
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("TV is turned on.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("TV is turned off.");
    }

}
