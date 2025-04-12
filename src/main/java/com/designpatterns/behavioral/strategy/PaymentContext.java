package com.designpatterns.behavioral.strategy;

import java.math.BigDecimal;

public class PaymentContext {

    PaymentStrategy paymentStrategy;

    PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(BigDecimal amount) {

        if(paymentStrategy == null){
            throw new IllegalStateException("Payment strategy is not set");
        }

        paymentStrategy.pay(amount);
    }
}
