package com.abhirup.observer;

public interface FlightSpeedSubject {
    public abstract void addFligthSpeedChangeObserver(
        FlightSpeedChangeObserver o
    );

    public abstract void removeFligthSpeedChangeObserver(
        FlightSpeedChangeObserver o
    );

    public abstract void notifySpeedChange();

    public abstract int getSpeed();
}
