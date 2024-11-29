package org.designpatterns.creational.factory;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;

public class Price {

    private final BigDecimal amount;
    private final Currency currency;

    public Price(BigDecimal amount, Currency currency) {

        if(amount == null || amount.signum() < 0){
            throw new IllegalArgumentException("Amount cannot be negative and null");
        }

        if(currency == null){
            throw new IllegalArgumentException("Currency cannot be null");
        }

        this.amount = amount.setScale(2, RoundingMode.HALF_EVEN);
        this.currency = currency;
    }


    public BigDecimal getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Price{" +
                "amount=" + amount +
                ", currency=" + currency +
                '}';
    }
}