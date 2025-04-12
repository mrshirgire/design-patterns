package com.designpatterns.behavioral.state;

public class SecondState implements State{
    @Override
    public void doAction() {
        System.out.println("Second State");
    }
}
