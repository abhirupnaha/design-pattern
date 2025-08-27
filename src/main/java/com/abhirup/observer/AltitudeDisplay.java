package com.abhirup.observer;

public class AltitudeDisplay implements FlightAltitudeChangeObserver {

    @Override
    public void update(FlightAltitudeSubject altSub) {
        System.out.println(altSub.getAltitude());
    }
}
