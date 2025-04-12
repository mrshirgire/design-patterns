package com.designpatterns.behavioral.chainofresponsibity;

public class MediumCircle implements Circle {

    Circle nextCircle;
    MediumCircle(Circle nextCircle) {
        this.nextCircle = nextCircle;
    }

    @Override
    public void drawCircle(DrawingRequest request) {

        if(request.equals(DrawingRequest.MEDIUM)){
            System.out.println("Medium circle drawn");
            return;
        }

        nextCircle.drawCircle(request);
    }
}

