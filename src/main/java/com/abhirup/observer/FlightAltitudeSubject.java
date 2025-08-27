package com.abhirup.observer;

public interface FlightAltitudeSubject {
    public abstract void addFlightAltitudeChangeObserver(
        FlightAltitudeChangeObserver o
    );

    public abstract void removeFlightAltitudeChangeObserver(
        FlightAltitudeChangeObserver o
    );

    public abstract void notifyAltitudeChange();

    public abstract int getAltitude();
}
