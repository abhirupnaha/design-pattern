package com.abhirup.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShopingCart {
    private List<String> items;
    
    private int price;

    private PaymentStrategy payment;

    public ShopingCart() {
        items = new ArrayList<>();
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(String item) {
        items.add(item);
        price += 100;
    }

    public int getPrice() {
        return price;
    }

    public void setPayment(PaymentStrategy payment) {
        this.payment = payment;
    }

    public void checkout() {
        payment.pay(price);
    }
}
