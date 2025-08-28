package com.abhirup.abstract_factory;

/*
 * abstract factory pattern is used to create objects of 
 * related or dependent types.
 * 
 * That is when you want a factory class that create some objects
 * of subclasses of a superclass, where some objects can be group together.
 */

public interface FurnitureFactory {
    Table createTable();
    Chair createChair();
}

class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}

class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
