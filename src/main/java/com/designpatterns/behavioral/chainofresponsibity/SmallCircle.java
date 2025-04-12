package com.designpatterns.behavioral.chainofresponsibity;

import static java.lang.System.out;

public class SmallCircle implements Circle {

    Circle nextCircle;
    SmallCircle(Circle nextCircle) {
        this.nextCircle = nextCircle;
    }

    @Override
    public void drawCircle(DrawingRequest request) {

        if(request.equals(DrawingRequest.SMALL)) {
            out.println("Small circle drawn");
            return;
        }

        nextCircle.drawCircle(request);
    }
}
