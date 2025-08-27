package com.abhirup.decorator;

public class PrefixLoggerDecorator extends LoggerDecorator {
    private String prefix;

    public PrefixLoggerDecorator(Logger logger, String prefix) {
        super(logger);
        this.prefix = prefix;
    }

    @Override
    public void printMessage(String msg) {
        msg = prefix + msg;
        logger.printMessage(msg);
    }
}
