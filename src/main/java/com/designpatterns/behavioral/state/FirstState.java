package com.designpatterns.behavioral.state;

public class FirstState implements State{

    @Override
    public void doAction() {
        System.out.println("First State");
    }
}
