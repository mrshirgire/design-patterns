package com.designpatterns.behavioral.chainofresponsibity;

import static java.lang.System.out;

public class LargeCircle implements Circle {

    Circle nextCircle;
    public LargeCircle(Circle circle) {
        this.nextCircle = circle;
    }

    @Override
    public void drawCircle(DrawingRequest request) {

        if(request.equals(DrawingRequest.MEDIUM)){
            out.println("Medium circle drawn");
            return;
        }

        throw new IllegalArgumentException("request is not valid");

    }
}
