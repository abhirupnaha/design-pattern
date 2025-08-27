package com.abhirup.observer;

public interface FlightAltitudeChangeObserver {
    void update(FlightAltitudeSubject altSub);
}
