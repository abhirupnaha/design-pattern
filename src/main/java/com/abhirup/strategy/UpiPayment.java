package com.abhirup.strategy;

public class UpiPayment implements PaymentStrategy {
    @Override
    public void pay(int amt) {
        System.out.println("paying " + amt + " through upi");
    }
}
