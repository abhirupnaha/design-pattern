package com.abhirup;

import com.abhirup.decorator.Logger;
import com.abhirup.decorator.PrefixLoggerDecorator;
import com.abhirup.decorator.SimpleLoggerImp;
import com.abhirup.decorator.TimestampLoggerDecorator;
import com.abhirup.observer.AltitudeDisplay;
import com.abhirup.observer.FlightData;
import com.abhirup.observer.SpeedometerDisplay;
import com.abhirup.strategy.CreditCardPayment;
import com.abhirup.strategy.ShopingCart;
import com.abhirup.strategy.UpiPayment;

public final class App {
    public static void main(String[] args) {
        // strategy();
        // observer();
        decotator();
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

    private static void observer() {
        FlightData fd = new FlightData();
        fd.setAltitude(1020);
        fd.setSpeed(200);

        AltitudeDisplay altDisplay = new AltitudeDisplay();
        SpeedometerDisplay speedDisplay = new SpeedometerDisplay();

        fd.addFlightAltitudeChangeObserver(altDisplay);
        fd.addFligthSpeedChangeObserver(speedDisplay);

        fd.setAltitude(201);
        fd.setSpeed(100);
    }

    private static void decotator() {
        // Logger logger = new SimpleLoggerImp();
        
        // // adding timestamp decorator
        // logger = new TimestampLoggerDecorator(logger);

        // // adding prefix decorator
        // logger = new PrefixLoggerDecorator(logger, "Hello");

        // logger.printMessage("Abhirup Naha");

        Logger logger = new TimestampLoggerDecorator(
            new PrefixLoggerDecorator(
                new SimpleLoggerImp(), 
                "hello"
            )
        );

        logger.printMessage("hello world");
    }
}
