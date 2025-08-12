package com.abhirup;

import com.abhirup.strategy.CreditCardPayment;
import com.abhirup.strategy.ShopingCart;
import com.abhirup.strategy.UpiPayment;

public final class App {
    public static void main(String[] args) {
        strategy();
    }

    private static void strategy() {
        ShopingCart sp1 = new ShopingCart();
        sp1.setItems("coke");
        sp1.setPayment(new UpiPayment());
        sp1.checkout();

        ShopingCart sp2 = new ShopingCart();
        sp2.setItems("Whey");
        sp2.setPayment(new CreditCardPayment());
        sp2.checkout();
    }
}
