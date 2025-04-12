package com.designpatterns.solid.OCP.voilation;
/*
* Definition: A class should be open for extension but closed for modification.
* Problem: Adding a new payment method requires modifying the PaymentProcessor class, violating OCP.
* Adding a new payment type (e.g., Bitcoin) is now as simple as creating a new class that implements Payment.
* */
class PaymentProcessor {
    public void processPayment(String type) {
        if (type.equals("CreditCard")) {
            // Process credit card
        } else if (type.equals("PayPal")) {
            // Process PayPal
        }
    }
}
