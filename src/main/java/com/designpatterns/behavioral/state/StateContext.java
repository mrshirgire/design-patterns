package com.designpatterns.behavioral.state;

public class StateContext {

    State state;
    StateContext(State state) {
        this.state = state;
    }

    public void performAction() {
        state.doAction();
    }

}
