package com.abhirup.abstract_factory;

public interface Chair {
    void sitOn();
}

class VictorianChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("sitting on victorian chiar");
    }
}

class ModernChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("sitting on modern chair");
    }
}
