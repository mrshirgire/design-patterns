package com.designpatterns.behavioral.strategy;

import java.math.BigDecimal;

public class UPIPayment implements PaymentStrategy{


    @Override
    public void pay(BigDecimal amount) {

        if(amount == null || amount.signum() < 0) {
            throw new IllegalArgumentException("Amount cannot be null or negative");
        }

        //TODO: third party integration to do payment;
    }
}
