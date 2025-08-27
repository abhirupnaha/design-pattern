package com.abhirup.decorator;

import java.time.LocalDateTime;

public class TimestampLoggerDecorator extends LoggerDecorator {
    public TimestampLoggerDecorator(Logger logger) {
        super(logger);
    }

    @Override
    public void printMessage(String msg) {
        msg = LocalDateTime.now().toString() + msg;
        logger.printMessage(msg);
    }
}
