package com.designpatterns.behavioral.state;

public class Client {

    public static void main(String[] args) {
        StateContext context = new StateContext(new FirstState());
        context.performAction();

        context = new StateContext(new SecondState());
        context.performAction();

    }
}
