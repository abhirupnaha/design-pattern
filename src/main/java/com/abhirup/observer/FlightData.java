package com.abhirup.observer;

import java.util.LinkedList;
import java.util.List;

public class FlightData implements 
    Flight, 
    FlightAltitudeSubject, 
    FlightSpeedSubject {

        int speed, altitude;

        List<FlightAltitudeChangeObserver> altObservers;
        List<FlightSpeedChangeObserver> speedObservers;

        {
            altObservers = new LinkedList<>();
            speedObservers = new LinkedList<>();
        }

        @Override
        public int getAltitude() {
            return altitude;
        }

        @Override
        public int getSpeed() {
            return speed;
        }

        @Override
        public void setAltitude(int altitude) {
            this.altitude = altitude;
            notifyAltitudeChange();
        }

        @Override
        public void setSpeed(int speed) {
            this.speed = speed;
            notifySpeedChange();
        }

        @Override
        public void addFlightAltitudeChangeObserver(FlightAltitudeChangeObserver o) {
            altObservers.add(o);
        }

        @Override
        public void notifyAltitudeChange() {
            if (altObservers.isEmpty()) return;

            for (FlightAltitudeChangeObserver o : altObservers)
                o.update(this);
        }

        @Override
        public void removeFlightAltitudeChangeObserver(FlightAltitudeChangeObserver o) {
            altObservers.remove(o);
        }

        @Override
        public void addFligthSpeedChangeObserver(FlightSpeedChangeObserver o) {
            speedObservers.add(o);
        }

        @Override
        public void notifySpeedChange() {
            if (speedObservers.isEmpty()) return;

            for (FlightSpeedChangeObserver o : speedObservers)
                o.update(this);
        }

        @Override
        public void removeFligthSpeedChangeObserver(FlightSpeedChangeObserver o) {
            speedObservers.remove(o);
        }
    
}
