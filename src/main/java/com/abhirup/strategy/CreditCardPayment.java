package com.abhirup.strategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amt) {
        System.out.println("paying " + amt + " through credit card");
    }
}
