package com.designpatterns.solid.OCP.solution;
//Adding a new payment type (e.g., Bitcoin) is now as simple as creating a new class that implements Payment.
interface Payment {
    void processPayment();
}

class CreditCardPayment implements Payment {
    public void processPayment() {
        // Process credit card
    }
}

class PayPalPayment implements Payment {
    public void processPayment() {
        // Process PayPal
    }
}

class PaymentProcessor {
    public void processPayment(Payment payment) {
        payment.processPayment();
    }
}
