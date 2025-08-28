package com.abhirup.abstract_factory;

public interface Table {
    public void putThingsOn(Object thing);
}

class VictorianTable implements Table {

    @Override
    public void putThingsOn(Object thing) {
        System.out.println("putting " + thing + " on the table");
    }
}

class ModernTable implements Table {

    @Override
    public void putThingsOn(Object thing) {
        System.out.println("putting " + thing + " on the table");
    }
}
