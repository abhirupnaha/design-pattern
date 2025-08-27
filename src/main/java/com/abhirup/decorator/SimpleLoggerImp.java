package com.abhirup.decorator;

public class SimpleLoggerImp implements Logger {

    @Override
    public void printMessage(String msg) {
        System.out.println(msg);
    }
}
