package com.abhirup.observer;

public class SpeedometerDisplay implements FlightSpeedChangeObserver {

    @Override
    public void update(FlightSpeedSubject speedSub) {
        System.out.println(speedSub.getSpeed());
    }
}
