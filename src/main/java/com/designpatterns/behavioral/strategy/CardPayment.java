package com.designpatterns.behavioral.strategy;

import java.math.BigDecimal;

public class CardPayment implements PaymentStrategy{


    @Override
    public void pay(BigDecimal amount) {

        if(amount == null || amount.signum() < 0){
            throw new IllegalArgumentException("Amount cannot be negative or null");
        }

        //TODO: third party integration to do payment;
    }
}
